/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.aula.sb.service.http;

import com.aula.sb.service.T_Ul_Estud_CursoServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

/**
 * Provides the HTTP utility for the
 * <code>T_Ul_Estud_CursoServiceUtil</code> service
 * utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it requires an additional
 * <code>HttpPrincipal</code> parameter.
 *
 * <p>
 * The benefits of using the HTTP utility is that it is fast and allows for
 * tunneling without the cost of serializing to text. The drawback is that it
 * only works with Java.
 * </p>
 *
 * <p>
 * Set the property <b>tunnel.servlet.hosts.allowed</b> in portal.properties to
 * configure security.
 * </p>
 *
 * <p>
 * The HTTP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see T_Ul_Estud_CursoServiceSoap
 * @generated
 */
public class T_Ul_Estud_CursoServiceHttp {

	public static com.aula.sb.model.T_Ul_Estud_Curso createEstudCurso(
			HttpPrincipal httpPrincipal, long cursoId, long estudianteId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				T_Ul_Estud_CursoServiceUtil.class, "createEstudCurso",
				_createEstudCursoParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, cursoId, estudianteId, serviceContext);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.aula.sb.model.T_Ul_Estud_Curso)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static void deleteEstudCurso(
			HttpPrincipal httpPrincipal, long cursoId, long estudianteId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				T_Ul_Estud_CursoServiceUtil.class, "deleteEstudCurso",
				_deleteEstudCursoParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, cursoId, estudianteId);

			try {
				TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.aula.sb.model.T_Ul_Estud_Curso> getAll(
		HttpPrincipal httpPrincipal) {

		try {
			MethodKey methodKey = new MethodKey(
				T_Ul_Estud_CursoServiceUtil.class, "getAll",
				_getAllParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(methodKey);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.aula.sb.model.T_Ul_Estud_Curso>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.aula.sb.model.T_Ul_Estud_Curso>
		getCursosByEstudianteId(
			HttpPrincipal httpPrincipal, long estudianteId) {

		try {
			MethodKey methodKey = new MethodKey(
				T_Ul_Estud_CursoServiceUtil.class, "getCursosByEstudianteId",
				_getCursosByEstudianteIdParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, estudianteId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.aula.sb.model.T_Ul_Estud_Curso>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.aula.sb.model.T_Ul_Estud_Curso>
		getEstudiantesByCursoId(HttpPrincipal httpPrincipal, long cursoId) {

		try {
			MethodKey methodKey = new MethodKey(
				T_Ul_Estud_CursoServiceUtil.class, "getEstudiantesByCursoId",
				_getEstudiantesByCursoIdParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(methodKey, cursoId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.aula.sb.model.T_Ul_Estud_Curso>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		T_Ul_Estud_CursoServiceHttp.class);

	private static final Class<?>[] _createEstudCursoParameterTypes0 =
		new Class[] {
			long.class, long.class,
			com.liferay.portal.kernel.service.ServiceContext.class
		};
	private static final Class<?>[] _deleteEstudCursoParameterTypes1 =
		new Class[] {long.class, long.class};
	private static final Class<?>[] _getAllParameterTypes2 = new Class[] {};
	private static final Class<?>[] _getCursosByEstudianteIdParameterTypes3 =
		new Class[] {long.class};
	private static final Class<?>[] _getEstudiantesByCursoIdParameterTypes4 =
		new Class[] {long.class};

}
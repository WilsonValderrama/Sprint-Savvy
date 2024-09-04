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

import com.aula.sb.service.T_Ul_PAcademicoServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

/**
 * Provides the HTTP utility for the
 * <code>T_Ul_PAcademicoServiceUtil</code> service
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
 * @see T_Ul_PAcademicoServiceSoap
 * @generated
 */
public class T_Ul_PAcademicoServiceHttp {

	public static com.aula.sb.model.T_Ul_PAcademico createT_Ul_PAcademico(
			HttpPrincipal httpPrincipal, String tituloPeriodo,
			String fInicioPeriodo, String fFinPeriodo, String porcPeriodo,
			Long T_Ul_Curso_id,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				T_Ul_PAcademicoServiceUtil.class, "createT_Ul_PAcademico",
				_createT_Ul_PAcademicoParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, tituloPeriodo, fInicioPeriodo, fFinPeriodo,
				porcPeriodo, T_Ul_Curso_id, serviceContext);

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

			return (com.aula.sb.model.T_Ul_PAcademico)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.aula.sb.model.T_Ul_PAcademico updateT_Ul_PAcademico(
			HttpPrincipal httpPrincipal, long idPeriodo, String tituloPeriodo,
			String fInicioPeriodo, String fFinPeriodo, String porcPeriodo,
			Long T_Ul_Curso_id,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				T_Ul_PAcademicoServiceUtil.class, "updateT_Ul_PAcademico",
				_updateT_Ul_PAcademicoParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, idPeriodo, tituloPeriodo, fInicioPeriodo,
				fFinPeriodo, porcPeriodo, T_Ul_Curso_id, serviceContext);

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

			return (com.aula.sb.model.T_Ul_PAcademico)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.aula.sb.model.T_Ul_PAcademico deleteT_Ul_PAcademico(
			HttpPrincipal httpPrincipal, long idPeriodo)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				T_Ul_PAcademicoServiceUtil.class, "deleteT_Ul_PAcademico",
				_deleteT_Ul_PAcademicoParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, idPeriodo);

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

			return (com.aula.sb.model.T_Ul_PAcademico)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.aula.sb.model.T_Ul_PAcademico getT_Ul_PAcademico(
			HttpPrincipal httpPrincipal, long idPeriodo)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				T_Ul_PAcademicoServiceUtil.class, "getT_Ul_PAcademico",
				_getT_Ul_PAcademicoParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, idPeriodo);

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

			return (com.aula.sb.model.T_Ul_PAcademico)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.aula.sb.model.T_Ul_PAcademico>
		getT_Ul_PAcademicoByName(
			HttpPrincipal httpPrincipal, String tituloPeriodo) {

		try {
			MethodKey methodKey = new MethodKey(
				T_Ul_PAcademicoServiceUtil.class, "getT_Ul_PAcademicoByName",
				_getT_Ul_PAcademicoByNameParameterTypes5);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, tituloPeriodo);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.aula.sb.model.T_Ul_PAcademico>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.aula.sb.model.T_Ul_PAcademico>
		getAllT_Ul_PAcademicos(HttpPrincipal httpPrincipal) {

		try {
			MethodKey methodKey = new MethodKey(
				T_Ul_PAcademicoServiceUtil.class, "getAllT_Ul_PAcademicos",
				_getAllT_Ul_PAcademicosParameterTypes6);

			MethodHandler methodHandler = new MethodHandler(methodKey);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.aula.sb.model.T_Ul_PAcademico>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		T_Ul_PAcademicoServiceHttp.class);

	private static final Class<?>[] _createT_Ul_PAcademicoParameterTypes0 =
		new Class[] {
			String.class, String.class, String.class, String.class, Long.class,
			com.liferay.portal.kernel.service.ServiceContext.class
		};
	private static final Class<?>[] _updateT_Ul_PAcademicoParameterTypes2 =
		new Class[] {
			long.class, String.class, String.class, String.class, String.class,
			Long.class, com.liferay.portal.kernel.service.ServiceContext.class
		};
	private static final Class<?>[] _deleteT_Ul_PAcademicoParameterTypes3 =
		new Class[] {long.class};
	private static final Class<?>[] _getT_Ul_PAcademicoParameterTypes4 =
		new Class[] {long.class};
	private static final Class<?>[] _getT_Ul_PAcademicoByNameParameterTypes5 =
		new Class[] {String.class};
	private static final Class<?>[] _getAllT_Ul_PAcademicosParameterTypes6 =
		new Class[] {};

}
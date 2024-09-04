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

import com.aula.sb.service.T_Ul_ResEvaluacionServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

/**
 * Provides the HTTP utility for the
 * <code>T_Ul_ResEvaluacionServiceUtil</code> service
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
 * @see T_Ul_ResEvaluacionServiceSoap
 * @generated
 */
public class T_Ul_ResEvaluacionServiceHttp {

	public static com.aula.sb.model.T_Ul_ResEvaluacion createT_Ul_ResEvaluacion(
			HttpPrincipal httpPrincipal, String problRespuestas,
			String opcionRespuestas, String puntajeRespuestas,
			Long T_Ul_Estudiante_id, Long T_Ul_PrgEvaluacion_id,
			Long T_Ul_Califi_id,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				T_Ul_ResEvaluacionServiceUtil.class, "createT_Ul_ResEvaluacion",
				_createT_Ul_ResEvaluacionParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, problRespuestas, opcionRespuestas, puntajeRespuestas,
				T_Ul_Estudiante_id, T_Ul_PrgEvaluacion_id, T_Ul_Califi_id,
				serviceContext);

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

			return (com.aula.sb.model.T_Ul_ResEvaluacion)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.aula.sb.model.T_Ul_ResEvaluacion updateT_Ul_ResEvaluacion(
			HttpPrincipal httpPrincipal, long idRespuestas,
			String problRespuestas, String opcionRespuestas,
			String puntajeRespuestas, Long T_Ul_Estudiante_id,
			Long T_Ul_PrgEvaluacion_id, Long T_Ul_Califi_id,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				T_Ul_ResEvaluacionServiceUtil.class, "updateT_Ul_ResEvaluacion",
				_updateT_Ul_ResEvaluacionParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, idRespuestas, problRespuestas, opcionRespuestas,
				puntajeRespuestas, T_Ul_Estudiante_id, T_Ul_PrgEvaluacion_id,
				T_Ul_Califi_id, serviceContext);

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

			return (com.aula.sb.model.T_Ul_ResEvaluacion)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.aula.sb.model.T_Ul_ResEvaluacion deleteT_Ul_ResEvaluacion(
			HttpPrincipal httpPrincipal, long idRespuestas)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				T_Ul_ResEvaluacionServiceUtil.class, "deleteT_Ul_ResEvaluacion",
				_deleteT_Ul_ResEvaluacionParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, idRespuestas);

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

			return (com.aula.sb.model.T_Ul_ResEvaluacion)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.aula.sb.model.T_Ul_ResEvaluacion getT_Ul_ResEvaluacion(
			HttpPrincipal httpPrincipal, long idRespuestas)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				T_Ul_ResEvaluacionServiceUtil.class, "getT_Ul_ResEvaluacion",
				_getT_Ul_ResEvaluacionParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, idRespuestas);

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

			return (com.aula.sb.model.T_Ul_ResEvaluacion)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.aula.sb.model.T_Ul_ResEvaluacion>
		getT_Ul_ResEvaluacionByProblRespuestas(
			HttpPrincipal httpPrincipal, String problRespuestas) {

		try {
			MethodKey methodKey = new MethodKey(
				T_Ul_ResEvaluacionServiceUtil.class,
				"getT_Ul_ResEvaluacionByProblRespuestas",
				_getT_Ul_ResEvaluacionByProblRespuestasParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, problRespuestas);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.aula.sb.model.T_Ul_ResEvaluacion>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.aula.sb.model.T_Ul_ResEvaluacion>
		getAllT_Ul_ResEvaluacion(HttpPrincipal httpPrincipal) {

		try {
			MethodKey methodKey = new MethodKey(
				T_Ul_ResEvaluacionServiceUtil.class, "getAllT_Ul_ResEvaluacion",
				_getAllT_Ul_ResEvaluacionParameterTypes5);

			MethodHandler methodHandler = new MethodHandler(methodKey);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.aula.sb.model.T_Ul_ResEvaluacion>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		T_Ul_ResEvaluacionServiceHttp.class);

	private static final Class<?>[] _createT_Ul_ResEvaluacionParameterTypes0 =
		new Class[] {
			String.class, String.class, String.class, Long.class, Long.class,
			Long.class, com.liferay.portal.kernel.service.ServiceContext.class
		};
	private static final Class<?>[] _updateT_Ul_ResEvaluacionParameterTypes1 =
		new Class[] {
			long.class, String.class, String.class, String.class, Long.class,
			Long.class, Long.class,
			com.liferay.portal.kernel.service.ServiceContext.class
		};
	private static final Class<?>[] _deleteT_Ul_ResEvaluacionParameterTypes2 =
		new Class[] {long.class};
	private static final Class<?>[] _getT_Ul_ResEvaluacionParameterTypes3 =
		new Class[] {long.class};
	private static final Class<?>[]
		_getT_Ul_ResEvaluacionByProblRespuestasParameterTypes4 = new Class[] {
			String.class
		};
	private static final Class<?>[] _getAllT_Ul_ResEvaluacionParameterTypes5 =
		new Class[] {};

}
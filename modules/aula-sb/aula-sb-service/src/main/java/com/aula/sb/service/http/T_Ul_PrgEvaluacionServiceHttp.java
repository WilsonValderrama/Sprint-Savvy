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

import com.aula.sb.service.T_Ul_PrgEvaluacionServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

/**
 * Provides the HTTP utility for the
 * <code>T_Ul_PrgEvaluacionServiceUtil</code> service
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
 * @see T_Ul_PrgEvaluacionServiceSoap
 * @generated
 */
public class T_Ul_PrgEvaluacionServiceHttp {

	public static com.aula.sb.model.T_Ul_PrgEvaluacion createT_Ul_PrgEvaluacion(
			HttpPrincipal httpPrincipal, String problPreguntas,
			String opcPreguntas, String puntajePreguntas,
			String intentoPreguntas, String limiteTPreguntas,
			Long T_Ul_Actividad_id,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				T_Ul_PrgEvaluacionServiceUtil.class, "createT_Ul_PrgEvaluacion",
				_createT_Ul_PrgEvaluacionParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, problPreguntas, opcPreguntas, puntajePreguntas,
				intentoPreguntas, limiteTPreguntas, T_Ul_Actividad_id,
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

			return (com.aula.sb.model.T_Ul_PrgEvaluacion)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.aula.sb.model.T_Ul_PrgEvaluacion updateT_Ul_PrgEvaluacion(
			HttpPrincipal httpPrincipal, Long idPreguntas,
			String problPreguntas, String opcPreguntas, String puntajePreguntas,
			String intentoPreguntas, String limiteTPreguntas,
			Long T_Ul_Actividad_id,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				T_Ul_PrgEvaluacionServiceUtil.class, "updateT_Ul_PrgEvaluacion",
				_updateT_Ul_PrgEvaluacionParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, idPreguntas, problPreguntas, opcPreguntas,
				puntajePreguntas, intentoPreguntas, limiteTPreguntas,
				T_Ul_Actividad_id, serviceContext);

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

			return (com.aula.sb.model.T_Ul_PrgEvaluacion)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.aula.sb.model.T_Ul_PrgEvaluacion deleteT_Ul_PrgEvaluacion(
			HttpPrincipal httpPrincipal, long idPreguntas)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				T_Ul_PrgEvaluacionServiceUtil.class, "deleteT_Ul_PrgEvaluacion",
				_deleteT_Ul_PrgEvaluacionParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, idPreguntas);

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

			return (com.aula.sb.model.T_Ul_PrgEvaluacion)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.aula.sb.model.T_Ul_PrgEvaluacion getT_Ul_PrgEvaluacion(
			HttpPrincipal httpPrincipal, long idPreguntas)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				T_Ul_PrgEvaluacionServiceUtil.class, "getT_Ul_PrgEvaluacion",
				_getT_Ul_PrgEvaluacionParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, idPreguntas);

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

			return (com.aula.sb.model.T_Ul_PrgEvaluacion)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.aula.sb.model.T_Ul_PrgEvaluacion>
		getAllT_Ul_PrgEvaluaciones(HttpPrincipal httpPrincipal) {

		try {
			MethodKey methodKey = new MethodKey(
				T_Ul_PrgEvaluacionServiceUtil.class,
				"getAllT_Ul_PrgEvaluaciones",
				_getAllT_Ul_PrgEvaluacionesParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(methodKey);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.aula.sb.model.T_Ul_PrgEvaluacion>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		T_Ul_PrgEvaluacionServiceHttp.class);

	private static final Class<?>[] _createT_Ul_PrgEvaluacionParameterTypes0 =
		new Class[] {
			String.class, String.class, String.class, String.class,
			String.class, Long.class,
			com.liferay.portal.kernel.service.ServiceContext.class
		};
	private static final Class<?>[] _updateT_Ul_PrgEvaluacionParameterTypes1 =
		new Class[] {
			Long.class, String.class, String.class, String.class, String.class,
			String.class, Long.class,
			com.liferay.portal.kernel.service.ServiceContext.class
		};
	private static final Class<?>[] _deleteT_Ul_PrgEvaluacionParameterTypes2 =
		new Class[] {long.class};
	private static final Class<?>[] _getT_Ul_PrgEvaluacionParameterTypes3 =
		new Class[] {long.class};
	private static final Class<?>[] _getAllT_Ul_PrgEvaluacionesParameterTypes4 =
		new Class[] {};

}
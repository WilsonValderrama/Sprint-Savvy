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

import com.aula.sb.service.T_Ul_ActividadServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

/**
 * Provides the HTTP utility for the
 * <code>T_Ul_ActividadServiceUtil</code> service
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
 * @see T_Ul_ActividadServiceSoap
 * @generated
 */
public class T_Ul_ActividadServiceHttp {

	public static com.aula.sb.model.T_Ul_Actividad createT_Ul_Actividad(
			HttpPrincipal httpPrincipal, String tituloActividad,
			String tipoActividad, String descriActividad,
			String estadoEntrActividad, String fCreacActividad,
			String fCierrActividad, String porcActividad,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				T_Ul_ActividadServiceUtil.class, "createT_Ul_Actividad",
				_createT_Ul_ActividadParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, tituloActividad, tipoActividad, descriActividad,
				estadoEntrActividad, fCreacActividad, fCierrActividad,
				porcActividad, serviceContext);

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

			return (com.aula.sb.model.T_Ul_Actividad)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.aula.sb.model.T_Ul_Actividad updateT_Ul_Actividad(
			HttpPrincipal httpPrincipal, long idActividad,
			String tituloActividad, String tipoActividad,
			String descriActividad, String estadoEntrActividad,
			String fCreacActividad, String fCierrActividad,
			String porcActividad,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				T_Ul_ActividadServiceUtil.class, "updateT_Ul_Actividad",
				_updateT_Ul_ActividadParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, idActividad, tituloActividad, tipoActividad,
				descriActividad, estadoEntrActividad, fCreacActividad,
				fCierrActividad, porcActividad, serviceContext);

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

			return (com.aula.sb.model.T_Ul_Actividad)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.aula.sb.model.T_Ul_Actividad deleteT_Ul_Actividad(
			HttpPrincipal httpPrincipal, long idActividad)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				T_Ul_ActividadServiceUtil.class, "deleteT_Ul_Actividad",
				_deleteT_Ul_ActividadParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, idActividad);

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

			return (com.aula.sb.model.T_Ul_Actividad)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.aula.sb.model.T_Ul_Actividad getT_Ul_Actividad(
			HttpPrincipal httpPrincipal, long idActividad)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				T_Ul_ActividadServiceUtil.class, "getT_Ul_Actividad",
				_getT_Ul_ActividadParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, idActividad);

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

			return (com.aula.sb.model.T_Ul_Actividad)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.aula.sb.model.T_Ul_Actividad>
		getT_Ul_ActividadByTitulo(
			HttpPrincipal httpPrincipal, String tituloActividad) {

		try {
			MethodKey methodKey = new MethodKey(
				T_Ul_ActividadServiceUtil.class, "getT_Ul_ActividadByTitulo",
				_getT_Ul_ActividadByTituloParameterTypes5);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, tituloActividad);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.aula.sb.model.T_Ul_Actividad>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.aula.sb.model.T_Ul_Actividad>
		getAllT_Ul_Actividad(HttpPrincipal httpPrincipal) {

		try {
			MethodKey methodKey = new MethodKey(
				T_Ul_ActividadServiceUtil.class, "getAllT_Ul_Actividad",
				_getAllT_Ul_ActividadParameterTypes6);

			MethodHandler methodHandler = new MethodHandler(methodKey);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.aula.sb.model.T_Ul_Actividad>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		T_Ul_ActividadServiceHttp.class);

	private static final Class<?>[] _createT_Ul_ActividadParameterTypes0 =
		new Class[] {
			String.class, String.class, String.class, String.class,
			String.class, String.class, String.class,
			com.liferay.portal.kernel.service.ServiceContext.class
		};
	private static final Class<?>[] _updateT_Ul_ActividadParameterTypes2 =
		new Class[] {
			long.class, String.class, String.class, String.class, String.class,
			String.class, String.class, String.class,
			com.liferay.portal.kernel.service.ServiceContext.class
		};
	private static final Class<?>[] _deleteT_Ul_ActividadParameterTypes3 =
		new Class[] {long.class};
	private static final Class<?>[] _getT_Ul_ActividadParameterTypes4 =
		new Class[] {long.class};
	private static final Class<?>[] _getT_Ul_ActividadByTituloParameterTypes5 =
		new Class[] {String.class};
	private static final Class<?>[] _getAllT_Ul_ActividadParameterTypes6 =
		new Class[] {};

}
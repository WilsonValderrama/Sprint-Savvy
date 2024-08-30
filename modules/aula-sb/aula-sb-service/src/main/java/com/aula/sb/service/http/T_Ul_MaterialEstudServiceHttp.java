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

import com.aula.sb.service.T_Ul_MaterialEstudServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

/**
 * Provides the HTTP utility for the
 * <code>T_Ul_MaterialEstudServiceUtil</code> service
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
 * @see T_Ul_MaterialEstudServiceSoap
 * @generated
 */
public class T_Ul_MaterialEstudServiceHttp {

	public static com.aula.sb.model.T_Ul_MaterialEstud createMaterialEstudio(
			HttpPrincipal httpPrincipal, String tituloMaterial,
			String fCreacionMaterial, String urlArchMaterial,
			String descripMaterial,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				T_Ul_MaterialEstudServiceUtil.class, "createMaterialEstudio",
				_createMaterialEstudioParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, tituloMaterial, fCreacionMaterial, urlArchMaterial,
				descripMaterial, serviceContext);

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

			return (com.aula.sb.model.T_Ul_MaterialEstud)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.aula.sb.model.T_Ul_MaterialEstud updateT_Ul_MaterialEstud(
			HttpPrincipal httpPrincipal, long idMaterial, String tituloMaterial,
			String fCreacionMaterial, String urlArchMaterial,
			String descripMaterial,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				T_Ul_MaterialEstudServiceUtil.class, "updateT_Ul_MaterialEstud",
				_updateT_Ul_MaterialEstudParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, idMaterial, tituloMaterial, fCreacionMaterial,
				urlArchMaterial, descripMaterial, serviceContext);

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

			return (com.aula.sb.model.T_Ul_MaterialEstud)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.aula.sb.model.T_Ul_MaterialEstud deleteT_Ul_MaterialEstud(
			HttpPrincipal httpPrincipal, long idMaterial)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				T_Ul_MaterialEstudServiceUtil.class, "deleteT_Ul_MaterialEstud",
				_deleteT_Ul_MaterialEstudParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, idMaterial);

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

			return (com.aula.sb.model.T_Ul_MaterialEstud)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.aula.sb.model.T_Ul_MaterialEstud getT_Ul_MaterialEstud(
			HttpPrincipal httpPrincipal, long idMaterial)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				T_Ul_MaterialEstudServiceUtil.class, "getT_Ul_MaterialEstud",
				_getT_Ul_MaterialEstudParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, idMaterial);

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

			return (com.aula.sb.model.T_Ul_MaterialEstud)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.aula.sb.model.T_Ul_MaterialEstud>
		getT_Ul_MaterialEstudByName(
			HttpPrincipal httpPrincipal, String tituloMaterial) {

		try {
			MethodKey methodKey = new MethodKey(
				T_Ul_MaterialEstudServiceUtil.class,
				"getT_Ul_MaterialEstudByName",
				_getT_Ul_MaterialEstudByNameParameterTypes5);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, tituloMaterial);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.aula.sb.model.T_Ul_MaterialEstud>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.aula.sb.model.T_Ul_MaterialEstud>
		getAllT_Ul_MaterialEstud(HttpPrincipal httpPrincipal) {

		try {
			MethodKey methodKey = new MethodKey(
				T_Ul_MaterialEstudServiceUtil.class, "getAllT_Ul_MaterialEstud",
				_getAllT_Ul_MaterialEstudParameterTypes6);

			MethodHandler methodHandler = new MethodHandler(methodKey);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.aula.sb.model.T_Ul_MaterialEstud>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		T_Ul_MaterialEstudServiceHttp.class);

	private static final Class<?>[] _createMaterialEstudioParameterTypes0 =
		new Class[] {
			String.class, String.class, String.class, String.class,
			com.liferay.portal.kernel.service.ServiceContext.class
		};
	private static final Class<?>[] _updateT_Ul_MaterialEstudParameterTypes2 =
		new Class[] {
			long.class, String.class, String.class, String.class, String.class,
			com.liferay.portal.kernel.service.ServiceContext.class
		};
	private static final Class<?>[] _deleteT_Ul_MaterialEstudParameterTypes3 =
		new Class[] {long.class};
	private static final Class<?>[] _getT_Ul_MaterialEstudParameterTypes4 =
		new Class[] {long.class};
	private static final Class<?>[]
		_getT_Ul_MaterialEstudByNameParameterTypes5 = new Class[] {
			String.class
		};
	private static final Class<?>[] _getAllT_Ul_MaterialEstudParameterTypes6 =
		new Class[] {};

}
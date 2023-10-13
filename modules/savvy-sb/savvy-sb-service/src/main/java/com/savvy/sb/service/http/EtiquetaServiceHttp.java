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

package com.savvy.sb.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

import com.savvy.sb.service.EtiquetaServiceUtil;

/**
 * Provides the HTTP utility for the
 * <code>EtiquetaServiceUtil</code> service
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
 * @see EtiquetaServiceSoap
 * @generated
 */
public class EtiquetaServiceHttp {

	public static com.savvy.sb.model.Etiqueta crearEtiqueta(
			HttpPrincipal httpPrincipal, String tituloEtiqueta,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				EtiquetaServiceUtil.class, "crearEtiqueta",
				_crearEtiquetaParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, tituloEtiqueta, serviceContext);

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

			return (com.savvy.sb.model.Etiqueta)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.savvy.sb.model.Etiqueta actualizarEtiqueta(
			HttpPrincipal httpPrincipal, long etiquetaId, String tituloEtiqueta,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				EtiquetaServiceUtil.class, "actualizarEtiqueta",
				_actualizarEtiquetaParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, etiquetaId, tituloEtiqueta, serviceContext);

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

			return (com.savvy.sb.model.Etiqueta)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.savvy.sb.model.Etiqueta eliminarEtiqueta(
			HttpPrincipal httpPrincipal, long etiquetaId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				EtiquetaServiceUtil.class, "eliminarEtiqueta",
				_eliminarEtiquetaParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, etiquetaId);

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

			return (com.savvy.sb.model.Etiqueta)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.savvy.sb.model.Etiqueta getEtiqueta(
			HttpPrincipal httpPrincipal, long etiquetaId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				EtiquetaServiceUtil.class, "getEtiqueta",
				_getEtiquetaParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, etiquetaId);

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

			return (com.savvy.sb.model.Etiqueta)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.savvy.sb.model.Etiqueta>
		getEtiquetaByNombre(
			HttpPrincipal httpPrincipal, String tituloEtiqueta) {

		try {
			MethodKey methodKey = new MethodKey(
				EtiquetaServiceUtil.class, "getEtiquetaByNombre",
				_getEtiquetaByNombreParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, tituloEtiqueta);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.savvy.sb.model.Etiqueta>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.savvy.sb.model.Etiqueta> getAllEtiqueta(
		HttpPrincipal httpPrincipal) {

		try {
			MethodKey methodKey = new MethodKey(
				EtiquetaServiceUtil.class, "getAllEtiqueta",
				_getAllEtiquetaParameterTypes5);

			MethodHandler methodHandler = new MethodHandler(methodKey);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.savvy.sb.model.Etiqueta>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(EtiquetaServiceHttp.class);

	private static final Class<?>[] _crearEtiquetaParameterTypes0 =
		new Class[] {
			String.class, com.liferay.portal.kernel.service.ServiceContext.class
		};
	private static final Class<?>[] _actualizarEtiquetaParameterTypes1 =
		new Class[] {
			long.class, String.class,
			com.liferay.portal.kernel.service.ServiceContext.class
		};
	private static final Class<?>[] _eliminarEtiquetaParameterTypes2 =
		new Class[] {long.class};
	private static final Class<?>[] _getEtiquetaParameterTypes3 = new Class[] {
		long.class
	};
	private static final Class<?>[] _getEtiquetaByNombreParameterTypes4 =
		new Class[] {String.class};
	private static final Class<?>[] _getAllEtiquetaParameterTypes5 =
		new Class[] {};

}
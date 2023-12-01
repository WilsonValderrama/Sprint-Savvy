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

import com.savvy.sb.service.CategoriaServiceUtil;

/**
 * Provides the HTTP utility for the
 * <code>CategoriaServiceUtil</code> service
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
 * @see CategoriaServiceSoap
 * @generated
 */
public class CategoriaServiceHttp {

	public static com.savvy.sb.model.Categoria createCategoria(
			HttpPrincipal httpPrincipal, String nombreCategoria,
			String descripcion,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				CategoriaServiceUtil.class, "createCategoria",
				_createCategoriaParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, nombreCategoria, descripcion, serviceContext);

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

			return (com.savvy.sb.model.Categoria)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.savvy.sb.model.Categoria updateCategoria(
			HttpPrincipal httpPrincipal, long categoriaId,
			String nombreCategoria, String descripcion,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				CategoriaServiceUtil.class, "updateCategoria",
				_updateCategoriaParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, categoriaId, nombreCategoria, descripcion,
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

			return (com.savvy.sb.model.Categoria)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.savvy.sb.model.Categoria deleteCategoria(
			HttpPrincipal httpPrincipal, long categoriaId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				CategoriaServiceUtil.class, "deleteCategoria",
				_deleteCategoriaParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, categoriaId);

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

			return (com.savvy.sb.model.Categoria)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.savvy.sb.model.Categoria> getAllCategorias(
		HttpPrincipal httpPrincipal) {

		try {
			MethodKey methodKey = new MethodKey(
				CategoriaServiceUtil.class, "getAllCategorias",
				_getAllCategoriasParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(methodKey);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.savvy.sb.model.Categoria>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.savvy.sb.model.Categoria>
		getCategoriaByNombre(
			HttpPrincipal httpPrincipal, String nombreCategoria) {

		try {
			MethodKey methodKey = new MethodKey(
				CategoriaServiceUtil.class, "getCategoriaByNombre",
				_getCategoriaByNombreParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, nombreCategoria);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.savvy.sb.model.Categoria>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(CategoriaServiceHttp.class);

	private static final Class<?>[] _createCategoriaParameterTypes0 =
		new Class[] {
			String.class, String.class,
			com.liferay.portal.kernel.service.ServiceContext.class
		};
	private static final Class<?>[] _updateCategoriaParameterTypes1 =
		new Class[] {
			long.class, String.class, String.class,
			com.liferay.portal.kernel.service.ServiceContext.class
		};
	private static final Class<?>[] _deleteCategoriaParameterTypes2 =
		new Class[] {long.class};
	private static final Class<?>[] _getAllCategoriasParameterTypes3 =
		new Class[] {};
	private static final Class<?>[] _getCategoriaByNombreParameterTypes4 =
		new Class[] {String.class};

}
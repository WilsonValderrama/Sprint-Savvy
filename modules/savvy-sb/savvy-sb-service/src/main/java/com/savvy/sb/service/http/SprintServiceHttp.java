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

import com.savvy.sb.service.SprintServiceUtil;

/**
 * Provides the HTTP utility for the
 * <code>SprintServiceUtil</code> service
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
 * @see SprintServiceSoap
 * @generated
 */
public class SprintServiceHttp {

	public static com.savvy.sb.model.Sprint createSprint(
			HttpPrincipal httpPrincipal, String tituloSprint,
			String fechaInicio, String fechaFinal, String descripcion,
			String estado, String proyecto,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				SprintServiceUtil.class, "createSprint",
				_createSprintParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, tituloSprint, fechaInicio, fechaFinal, descripcion,
				estado, proyecto, serviceContext);

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

			return (com.savvy.sb.model.Sprint)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.savvy.sb.model.Sprint updateSprint(
			HttpPrincipal httpPrincipal, long sprintId, String tituloSprint,
			String fechaInicio, String fechaFinal, String descripcion,
			String estado, String proyecto,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				SprintServiceUtil.class, "updateSprint",
				_updateSprintParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, sprintId, tituloSprint, fechaInicio, fechaFinal,
				descripcion, estado, proyecto, serviceContext);

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

			return (com.savvy.sb.model.Sprint)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.savvy.sb.model.Sprint deleteSprint(
			HttpPrincipal httpPrincipal, long sprintId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				SprintServiceUtil.class, "deleteSprint",
				_deleteSprintParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, sprintId);

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

			return (com.savvy.sb.model.Sprint)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.savvy.sb.model.Sprint> getAllSprints(
		HttpPrincipal httpPrincipal) {

		try {
			MethodKey methodKey = new MethodKey(
				SprintServiceUtil.class, "getAllSprints",
				_getAllSprintsParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(methodKey);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.savvy.sb.model.Sprint>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.savvy.sb.model.Sprint> getSprintByNombre(
		HttpPrincipal httpPrincipal, String tituloSprint) {

		try {
			MethodKey methodKey = new MethodKey(
				SprintServiceUtil.class, "getSprintByNombre",
				_getSprintByNombreParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, tituloSprint);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.savvy.sb.model.Sprint>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(SprintServiceHttp.class);

	private static final Class<?>[] _createSprintParameterTypes0 = new Class[] {
		String.class, String.class, String.class, String.class, String.class,
		String.class, com.liferay.portal.kernel.service.ServiceContext.class
	};
	private static final Class<?>[] _updateSprintParameterTypes1 = new Class[] {
		long.class, String.class, String.class, String.class, String.class,
		String.class, String.class,
		com.liferay.portal.kernel.service.ServiceContext.class
	};
	private static final Class<?>[] _deleteSprintParameterTypes2 = new Class[] {
		long.class
	};
	private static final Class<?>[] _getAllSprintsParameterTypes3 =
		new Class[] {};
	private static final Class<?>[] _getSprintByNombreParameterTypes4 =
		new Class[] {String.class};

}
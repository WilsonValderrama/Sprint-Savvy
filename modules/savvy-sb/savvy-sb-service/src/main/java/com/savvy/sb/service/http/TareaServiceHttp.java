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

import com.savvy.sb.service.TareaServiceUtil;

/**
 * Provides the HTTP utility for the
 * <code>TareaServiceUtil</code> service
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
 * @see TareaServiceSoap
 * @generated
 */
public class TareaServiceHttp {

	public static com.savvy.sb.model.Tarea createTarea(
			HttpPrincipal httpPrincipal, String nombreTarea, String proyecto,
			String responsable, String prioridad, String sprint, String estado,
			String fechaLimite, String resumen, String descripcion,
			String categoria, String etiqueta,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				TareaServiceUtil.class, "createTarea",
				_createTareaParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, nombreTarea, proyecto, responsable, prioridad,
				sprint, estado, fechaLimite, resumen, descripcion, categoria,
				etiqueta, serviceContext);

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

			return (com.savvy.sb.model.Tarea)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.savvy.sb.model.Tarea updateTarea(
			HttpPrincipal httpPrincipal, long tareaId, String nombreTarea,
			String proyecto, String responsable, String prioridad,
			String sprint, String estado, String fechaLimite, String resumen,
			String descripcion, String categoria, String etiqueta,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				TareaServiceUtil.class, "updateTarea",
				_updateTareaParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, tareaId, nombreTarea, proyecto, responsable,
				prioridad, sprint, estado, fechaLimite, resumen, descripcion,
				categoria, etiqueta, serviceContext);

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

			return (com.savvy.sb.model.Tarea)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.savvy.sb.model.Tarea deleteTarea(
			HttpPrincipal httpPrincipal, long tareaId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				TareaServiceUtil.class, "deleteTarea",
				_deleteTareaParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(methodKey, tareaId);

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

			return (com.savvy.sb.model.Tarea)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.savvy.sb.model.Tarea> getAllTareas(
		HttpPrincipal httpPrincipal) {

		try {
			MethodKey methodKey = new MethodKey(
				TareaServiceUtil.class, "getAllTareas",
				_getAllTareasParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(methodKey);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.savvy.sb.model.Tarea>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.savvy.sb.model.Tarea> getTareaByNombre(
		HttpPrincipal httpPrincipal, String nombreTarea) {

		try {
			MethodKey methodKey = new MethodKey(
				TareaServiceUtil.class, "getTareaByNombre",
				_getTareaByNombreParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, nombreTarea);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.savvy.sb.model.Tarea>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(TareaServiceHttp.class);

	private static final Class<?>[] _createTareaParameterTypes0 = new Class[] {
		String.class, String.class, String.class, String.class, String.class,
		String.class, String.class, String.class, String.class, String.class,
		String.class, com.liferay.portal.kernel.service.ServiceContext.class
	};
	private static final Class<?>[] _updateTareaParameterTypes1 = new Class[] {
		long.class, String.class, String.class, String.class, String.class,
		String.class, String.class, String.class, String.class, String.class,
		String.class, String.class,
		com.liferay.portal.kernel.service.ServiceContext.class
	};
	private static final Class<?>[] _deleteTareaParameterTypes2 = new Class[] {
		long.class
	};
	private static final Class<?>[] _getAllTareasParameterTypes3 =
		new Class[] {};
	private static final Class<?>[] _getTareaByNombreParameterTypes4 =
		new Class[] {String.class};

}
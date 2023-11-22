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

package com.savvy.sb.service;

import com.liferay.portal.kernel.exception.PortalException;

import com.savvy.sb.model.Tarea;

import java.util.List;

/**
 * Provides the remote service utility for Tarea. This utility wraps
 * <code>com.savvy.sb.service.impl.TareaServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see TareaService
 * @generated
 */
public class TareaServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.savvy.sb.service.impl.TareaServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static Tarea createTarea(
			String nombreTarea, String proyecto, String responsable,
			String prioridad, String sprint, String estado, String fechaLimite,
			String resumen, String descripcion, String categoria,
			String etiqueta,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().createTarea(
			nombreTarea, proyecto, responsable, prioridad, sprint, estado,
			fechaLimite, resumen, descripcion, categoria, etiqueta,
			serviceContext);
	}

	public static Tarea deleteTarea(long tareaId) throws PortalException {
		return getService().deleteTarea(tareaId);
	}

	public static List<Tarea> getAllTareas() {
		return getService().getAllTareas();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static List<Tarea> getTareaByNombre(String nombreTarea) {
		return getService().getTareaByNombre(nombreTarea);
	}

	public static Tarea updateTarea(
			long tareaId, String nombreTarea, String proyecto,
			String responsable, String prioridad, String sprint, String estado,
			String fechaLimite, String resumen, String descripcion,
			String categoria, String etiqueta,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().updateTarea(
			tareaId, nombreTarea, proyecto, responsable, prioridad, sprint,
			estado, fechaLimite, resumen, descripcion, categoria, etiqueta,
			serviceContext);
	}

	public static TareaService getService() {
		return _service;
	}

	private static volatile TareaService _service;

}
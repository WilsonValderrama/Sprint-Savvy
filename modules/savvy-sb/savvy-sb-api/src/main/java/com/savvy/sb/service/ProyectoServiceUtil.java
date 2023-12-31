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

import com.savvy.sb.model.Proyecto;

import java.util.List;

/**
 * Provides the remote service utility for Proyecto. This utility wraps
 * <code>com.savvy.sb.service.impl.ProyectoServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see ProyectoService
 * @generated
 */
public class ProyectoServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.savvy.sb.service.impl.ProyectoServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static Proyecto actualizarProyecto(
			long proyectoId, String tituloProyecto, String descripcion,
			String fechaInicio, String fechaFinal, String estado,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().actualizarProyecto(
			proyectoId, tituloProyecto, descripcion, fechaInicio, fechaFinal,
			estado, serviceContext);
	}

	public static Proyecto crearProyecto(
			String tituloProyecto, String descripcion, String fechaInicio,
			String fechaFinal, String estado,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().crearProyecto(
			tituloProyecto, descripcion, fechaInicio, fechaFinal, estado,
			serviceContext);
	}

	public static Proyecto eliminarProyecto(long proyectoId)
		throws PortalException {

		return getService().eliminarProyecto(proyectoId);
	}

	public static List<Proyecto> getAllProyecto() {
		return getService().getAllProyecto();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static Proyecto getProyecto(long proyectoId) throws PortalException {
		return getService().getProyecto(proyectoId);
	}

	public static List<Proyecto> getProyectoByNombre(String tituloProyecto) {
		return getService().getProyectoByNombre(tituloProyecto);
	}

	public static ProyectoService getService() {
		return _service;
	}

	private static volatile ProyectoService _service;

}
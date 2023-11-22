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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ProyectoService}.
 *
 * @author Brian Wing Shun Chan
 * @see ProyectoService
 * @generated
 */
public class ProyectoServiceWrapper
	implements ProyectoService, ServiceWrapper<ProyectoService> {

	public ProyectoServiceWrapper(ProyectoService proyectoService) {
		_proyectoService = proyectoService;
	}

	@Override
	public com.savvy.sb.model.Proyecto actualizarProyecto(
			long proyectoId, String tituloProyecto, String descripcion,
			String fechaInicio, String fechaFinal, String estado,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _proyectoService.actualizarProyecto(
			proyectoId, tituloProyecto, descripcion, fechaInicio, fechaFinal,
			estado, serviceContext);
	}

	@Override
	public com.savvy.sb.model.Proyecto crearProyecto(
			String tituloProyecto, String descripcion, String fechaInicio,
			String fechaFinal, String estado,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _proyectoService.crearProyecto(
			tituloProyecto, descripcion, fechaInicio, fechaFinal, estado,
			serviceContext);
	}

	@Override
	public com.savvy.sb.model.Proyecto eliminarProyecto(long proyectoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _proyectoService.eliminarProyecto(proyectoId);
	}

	@Override
	public java.util.List<com.savvy.sb.model.Proyecto> getAllProyecto() {
		return _proyectoService.getAllProyecto();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _proyectoService.getOSGiServiceIdentifier();
	}

	@Override
	public com.savvy.sb.model.Proyecto getProyecto(long proyectoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _proyectoService.getProyecto(proyectoId);
	}

	@Override
	public java.util.List<com.savvy.sb.model.Proyecto> getProyectoByNombre(
		String tituloProyecto) {

		return _proyectoService.getProyectoByNombre(tituloProyecto);
	}

	@Override
	public ProyectoService getWrappedService() {
		return _proyectoService;
	}

	@Override
	public void setWrappedService(ProyectoService proyectoService) {
		_proyectoService = proyectoService;
	}

	private ProyectoService _proyectoService;

}
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
 * Provides a wrapper for {@link TareaService}.
 *
 * @author Brian Wing Shun Chan
 * @see TareaService
 * @generated
 */
public class TareaServiceWrapper
	implements ServiceWrapper<TareaService>, TareaService {

	public TareaServiceWrapper(TareaService tareaService) {
		_tareaService = tareaService;
	}

	@Override
	public com.savvy.sb.model.Tarea createTarea(
			String nombreTarea, String proyecto, String responsable,
			String prioridad, String sprint, String estado, String fechaLimite,
			String resumen, String descripcion, String categoria,
			String etiqueta,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tareaService.createTarea(
			nombreTarea, proyecto, responsable, prioridad, sprint, estado,
			fechaLimite, resumen, descripcion, categoria, etiqueta,
			serviceContext);
	}

	@Override
	public com.savvy.sb.model.Tarea deleteTarea(long tareaId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tareaService.deleteTarea(tareaId);
	}

	@Override
	public java.util.List<com.savvy.sb.model.Tarea> getAllTareas() {
		return _tareaService.getAllTareas();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tareaService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List<com.savvy.sb.model.Tarea> getTareaByNombre(
		String nombreTarea) {

		return _tareaService.getTareaByNombre(nombreTarea);
	}

	@Override
	public com.savvy.sb.model.Tarea updateTarea(
			long tareaId, String nombreTarea, String proyecto,
			String responsable, String prioridad, String sprint, String estado,
			String fechaLimite, String resumen, String descripcion,
			String categoria, String etiqueta,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tareaService.updateTarea(
			tareaId, nombreTarea, proyecto, responsable, prioridad, sprint,
			estado, fechaLimite, resumen, descripcion, categoria, etiqueta,
			serviceContext);
	}

	@Override
	public TareaService getWrappedService() {
		return _tareaService;
	}

	@Override
	public void setWrappedService(TareaService tareaService) {
		_tareaService = tareaService;
	}

	private TareaService _tareaService;

}
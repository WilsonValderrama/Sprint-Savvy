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

package com.savvy.sb.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;
import com.savvy.sb.model.Tarea;
import com.savvy.sb.service.TareaLocalServiceUtil;
import com.savvy.sb.service.base.TareaServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=servicio_savvy",
		"json.web.service.context.path=Tarea"
	},
	service = AopService.class
)
public class TareaServiceImpl extends TareaServiceBaseImpl {
	
	public Tarea createTarea(String nombreTarea, String proyecto, String responsable, String prioridad,
			String sprint, String estado, String fechaLimite, String resumen, String descripcion, String categoria, String etiqueta,  ServiceContext serviceContext) throws PortalException {
		return TareaLocalServiceUtil.createTarea(nombreTarea, proyecto, responsable, prioridad, sprint, estado, fechaLimite, resumen, descripcion, categoria, etiqueta,
				serviceContext);
	}

	public Tarea updateTarea(long tareaId, String nombreTarea, String proyecto, String responsable, String prioridad,
			String sprint, String estado, String fechaLimite, String resumen, String descripcion, String categoria, String etiqueta, ServiceContext serviceContext) throws PortalException {
		return TareaLocalServiceUtil.updateTarea(tareaId, nombreTarea, proyecto, responsable, prioridad, sprint, estado, fechaLimite, resumen, descripcion, categoria, etiqueta,
				serviceContext);
	}

	public Tarea deleteTarea(long tareaId) throws PortalException {
		return TareaLocalServiceUtil.deleteTarea(tareaId);
	}

	public List<Tarea> getAllTareas() {
		return TareaLocalServiceUtil.getAllTareas();
	}

	public List<Tarea> getTareaByNombre(String nombreTarea) {
		return TareaLocalServiceUtil.getTareaByNombre(nombreTarea);
	}
	
}
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
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.savvy.sb.model.Tarea;
import com.savvy.sb.service.base.TareaLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.savvy.sb.model.Tarea",
	service = AopService.class
)
public class TareaLocalServiceImpl extends TareaLocalServiceBaseImpl {
	private final Log log = LogFactoryUtil.getLog(TareaLocalServiceImpl.class);

	 

	public Tarea createTarea(String nombreTarea, String proyecto, String responsable, String prioridad,
			String sprint, String estado, String fechaLimite, String resumen, String descripcion, String categoria, String etiqueta,
																 ServiceContext serviceContext) throws PortalException {

 

		Long tareaId = counterLocalService.increment();

 

		User user = UserLocalServiceUtil.getUserById(serviceContext.getUserId());
		Tarea tarea = tareaPersistence.create(tareaId);
		tarea.setNombreTarea(nombreTarea);
		tarea.setProyecto(proyecto);
		tarea.setResponsable(responsable);
		tarea.setPrioridad(prioridad);
		tarea.setSprint(sprint);
		tarea.setEstado(estado);
		tarea.setFechaLimite(fechaLimite);
		tarea.setResumen(resumen);
		tarea.setDescripcion(descripcion);
		tarea.setCategoria(categoria);
		tarea.setEtiqueta(etiqueta);

 

		tarea.setUserId(serviceContext.getUserId());
		tarea.setGroupId(serviceContext.getScopeGroupId());
		tarea.setUserName(user.getFullName());
		tarea.setCreateDate(new Date());

 

		log.info(serviceContext.getUserId());
		log.info(serviceContext.getScopeGroupId());
		log.info(user.getFullName());
		tareaPersistence.update(tarea);

 

		return tarea;
	}

 

	public Tarea updateTarea(long tareaId, String nombreTarea, String proyecto, String responsable, String prioridad,
			String sprint, String estado, String fechaLimite, String resumen, String descripcion, String categoria, String etiqueta,
										 ServiceContext serviceContext) throws PortalException {

 

		Tarea tarea = tareaPersistence.findByPrimaryKey(tareaId);
		User user = UserLocalServiceUtil.getUserById(serviceContext.getUserId());
		tarea.setNombreTarea(nombreTarea);
		tarea.setProyecto(proyecto);
		tarea.setResponsable(responsable);
		tarea.setPrioridad(prioridad);
		tarea.setSprint(sprint);
		tarea.setEstado(estado);
		tarea.setFechaLimite(fechaLimite);
		tarea.setResumen(resumen);
		tarea.setDescripcion(descripcion);
		tarea.setCategoria(categoria);
		tarea.setEtiqueta(etiqueta);

 

		tarea.setUserId(serviceContext.getUserId());
		tarea.setGroupId(serviceContext.getScopeGroupId());
		tarea.setUserName(user.getFullName());
		tarea.setModifiedDate(new Date());

 

		return tareaPersistence.update(tarea);
	}

 

	public Tarea deleteTarea(long tareaId) throws PortalException {

 

		return tareaPersistence.remove(tareaId);
	}
	

	public List<Tarea> getAllTareas() {
		return tareaPersistence.findAll();
	}
	
	public List<Tarea> getTareaByNombre(String nombreTarea) {
		return tareaPersistence.findByNombreTarea(nombreTarea);
				}
}
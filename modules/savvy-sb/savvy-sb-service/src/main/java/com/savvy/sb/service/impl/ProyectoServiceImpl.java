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
import com.liferay.portal.kernel.service.ServiceContext;
import com.savvy.sb.model.Proyecto;
import com.savvy.sb.service.ProyectoLocalServiceUtil;
import com.savvy.sb.service.base.ProyectoServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=servicio_savvy",
		"json.web.service.context.path=Proyecto"
	},
	service = AopService.class
)
public class ProyectoServiceImpl extends ProyectoServiceBaseImpl {
	
private final Log log = LogFactoryUtil.getLog(ProyectoServiceImpl.class);
	
	public Proyecto crearProyecto(String tituloProyecto, String descripcion, String fechaInicio,
			String fechaFinal, String estado, ServiceContext serviceContext) throws PortalException {
		return ProyectoLocalServiceUtil.crearProyecto(tituloProyecto, descripcion, fechaInicio, fechaFinal, estado, serviceContext);
	}
	
	public Proyecto actualizarProyecto(long proyectoId, String tituloProyecto, String descripcion, String fechaInicio,
			String fechaFinal, String estado, ServiceContext serviceContext) throws PortalException  {
		return ProyectoLocalServiceUtil.actualizarProyecto(proyectoId, tituloProyecto, descripcion, fechaInicio, fechaFinal, estado, serviceContext);
		}
	
	public Proyecto eliminarProyecto(long proyectoId) throws PortalException {
		return ProyectoLocalServiceUtil.eliminarProyecto(proyectoId);
	}
	
	public Proyecto getProyecto(long proyectoId) throws PortalException {
		return ProyectoLocalServiceUtil.getProyecto(proyectoId);
	}
	
	//Dudas
	public List<Proyecto> getProyectoByNombre(String tituloProyecto) {
		return ProyectoLocalServiceUtil.getProyectoByNombre(tituloProyecto);
	}
	//dudas
	public List<Proyecto> getAllProyecto() {
		return ProyectoLocalServiceUtil.getAllProyectos();
	}
	
	
}
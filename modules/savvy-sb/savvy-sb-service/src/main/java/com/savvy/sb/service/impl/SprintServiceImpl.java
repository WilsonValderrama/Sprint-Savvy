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
import com.savvy.sb.model.Sprint;
import com.savvy.sb.service.SprintLocalServiceUtil;
import com.savvy.sb.service.base.SprintServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(property = { "json.web.service.context.name=servicio_savvy",
		"json.web.service.context.path=Sprint" }, service = AopService.class)
public class SprintServiceImpl extends SprintServiceBaseImpl {

	public Sprint createSprint(String tituloSprint, String fechaInicio, String fechaFinal, String descripcion,
			String estado, String proyecto, ServiceContext serviceContext) throws PortalException {
		return SprintLocalServiceUtil.createSprint(tituloSprint, fechaInicio, fechaFinal, descripcion, estado, proyecto,
				serviceContext);
	}

	public Sprint updateSprint(long sprintId, String tituloSprint, String fechaInicio, String fechaFinal,
			String descripcion, String estado, String proyecto, ServiceContext serviceContext) throws PortalException {
		return SprintLocalServiceUtil.updateSprint(sprintId, tituloSprint, fechaInicio, fechaFinal, descripcion, estado,
				proyecto, serviceContext);
	}

	public Sprint deleteSprint(long sprintId) throws PortalException {
		return SprintLocalServiceUtil.deleteSprint(sprintId);
	}

	public List<Sprint> getAllSprints() {
		return SprintLocalServiceUtil.getAllSprints();
	}

	public List<Sprint> getSprintByNombre(String tituloSprint) {
		return SprintLocalServiceUtil.getSprintByNombre(tituloSprint);
	}

}
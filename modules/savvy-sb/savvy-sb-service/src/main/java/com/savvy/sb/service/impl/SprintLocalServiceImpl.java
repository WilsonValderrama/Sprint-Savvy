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
import com.savvy.sb.model.Sprint;
import com.savvy.sb.service.base.SprintLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.savvy.sb.model.Sprint",
	service = AopService.class
)
public class SprintLocalServiceImpl extends SprintLocalServiceBaseImpl {
	private final Log log = LogFactoryUtil.getLog(SprintLocalServiceImpl.class);

	 

	public Sprint createSprint(String tituloSprint, String fechaInicio, String fechaFinal, String descripcion, 
									String estado, String proyecto,
																 ServiceContext serviceContext) throws PortalException {

 

		Long sprintId = counterLocalService.increment();

 

		User user = UserLocalServiceUtil.getUserById(serviceContext.getUserId());
		Sprint sprint = sprintPersistence.create(sprintId);
		sprint.setTituloSprint(tituloSprint);
		sprint.setFechaInicio(fechaInicio);
		sprint.setFechaFinal(fechaFinal);
		sprint.setDescripcion(descripcion);
		sprint.setEstado(estado);
		sprint.setProyecto(proyecto);

 

		sprint.setUserId(serviceContext.getUserId());
		sprint.setGroupId(serviceContext.getScopeGroupId());
		sprint.setUserName(user.getFullName());
		sprint.setCreateDate(new Date());

 

		log.info(serviceContext.getUserId());
		log.info(serviceContext.getScopeGroupId());
		log.info(user.getFullName());
		sprintPersistence.update(sprint);

 

		return sprint;
	}

 

	public Sprint updateSprint(long sprintId, String tituloSprint, String fechaInicio, String fechaFinal, String descripcion, 
									String estado, String proyecto,
										 ServiceContext serviceContext) throws PortalException {

 

		Sprint sprint = sprintPersistence.findByPrimaryKey(sprintId);
		User user = UserLocalServiceUtil.getUserById(serviceContext.getUserId());
		sprint.setTituloSprint(tituloSprint);
		sprint.setFechaInicio(fechaInicio);
		sprint.setFechaFinal(fechaFinal);
		sprint.setDescripcion(descripcion);
		sprint.setEstado(estado);
		sprint.setProyecto(proyecto);

 

		sprint.setUserId(serviceContext.getUserId());
		sprint.setGroupId(serviceContext.getScopeGroupId());
		sprint.setUserName(user.getFullName());
		sprint.setModifiedDate(new Date());

 

		return sprintPersistence.update(sprint);
	}

 

	public Sprint deleteSprint(long sprintId) throws PortalException {

 

		return sprintPersistence.remove(sprintId);
	}
	

	public List<Sprint> getAllSprints() {
		return sprintPersistence.findAll();
	}
	
	public List<Sprint> getSprintByNombre(String tituloSprint) {
		return sprintPersistence.findByTituloSprint(tituloSprint);
				}
	
}

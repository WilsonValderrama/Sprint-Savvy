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

package com.aula.sb.service.impl;

import com.aula.sb.model.T_Ul_Calificacion;
import com.aula.sb.service.base.T_Ul_CalificacionLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.aula.sb.model.T_Ul_Calificacion",
	service = AopService.class
)
public class T_Ul_CalificacionLocalServiceImpl
	extends T_Ul_CalificacionLocalServiceBaseImpl {
	
	private final Log log = LogFactoryUtil.getLog(T_Ul_CalificacionLocalServiceImpl.class); 

	public T_Ul_Calificacion createT_Ul_Calificacion(String puntCalificacion, ServiceContext serviceContext) throws PortalException {

		    // Incrementar el contador para obtener un nuevo ID de curso
		    Long idCalificacion = counterLocalService.increment();
		    log.info("Generado nuevo ID de curso: " + idCalificacion);

		    // Obtener el usuario por su ID desde el ServiceContext
		    User user = UserLocalServiceUtil.getUserById(serviceContext.getUserId());

		    // Crear la instancia de T_Ul_Curso
		    T_Ul_Calificacion t_ul_calificacion = t_Ul_CalificacionPersistence.create(idCalificacion);

		    // Establecer los campos en el objeto t_ul_curso
		    t_ul_calificacion.setPuntCalificacion(puntCalificacion);
		    
		    t_ul_calificacion.setUserId(serviceContext.getUserId());
		    t_ul_calificacion.setGroupId(serviceContext.getScopeGroupId());
		    t_ul_calificacion.setUserName(user.getFullName());
		    t_ul_calificacion.setCreateDate(new Date());
		    t_ul_calificacion.setModifiedDate(new Date());

		    // Guardar la instancia en la base de datos
		    t_Ul_CalificacionPersistence.update(t_ul_calificacion);

		    log.info("Calificacion registrado correctamente: " + t_ul_calificacion.toString());

		    return t_ul_calificacion;
		}

	
	public T_Ul_Calificacion updateT_Ul_Calificacion(long idCalificacion, String puntCalificacion, ServiceContext serviceContext) throws PortalException {
		
		//Buscar por ID el curso a modificar
		T_Ul_Calificacion t_ul_calificacion = t_Ul_CalificacionPersistence.findByPrimaryKey(idCalificacion);
		
		// Obtener el usuario por su ID desde el ServiceContext
		User user = UserLocalServiceUtil.getUserById(serviceContext.getUserId());
		
		// Establecer los campos en el objeto t_ul_curso
		t_ul_calificacion.setPuntCalificacion(puntCalificacion);

		t_ul_calificacion.setUserId(serviceContext.getUserId()); 
		t_ul_calificacion.setGroupId(serviceContext.getScopeGroupId()); 
		t_ul_calificacion.setUserName(user.getFullName()); 
		
		// Guardar la instancia en la base de datos
		return t_Ul_CalificacionPersistence.update(t_ul_calificacion);
	}
	
	public T_Ul_Calificacion deleteT_Ul_Calificacion(long idCalificacion) throws PortalException{
		return t_Ul_CalificacionPersistence.remove(idCalificacion);
	}
	
	public T_Ul_Calificacion getT_Ul_Calificacion(long idCalificacion) throws PortalException{
		return t_Ul_CalificacionPersistence.findByPrimaryKey(idCalificacion);
	}
	

	public List<T_Ul_Calificacion> getAllT_Ul_Calificacion() {
		return t_Ul_CalificacionPersistence.findAll();
	}



}
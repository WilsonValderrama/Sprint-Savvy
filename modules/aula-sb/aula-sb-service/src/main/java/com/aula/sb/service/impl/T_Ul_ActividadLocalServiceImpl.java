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

import com.aula.sb.model.T_Ul_Actividad;
import com.aula.sb.model.T_Ul_Curso;
import com.aula.sb.service.T_Ul_CursoLocalServiceUtil;
import com.aula.sb.service.base.T_Ul_ActividadLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.aula.sb.model.T_Ul_Actividad",
	service = AopService.class
)
public class T_Ul_ActividadLocalServiceImpl
	extends T_Ul_ActividadLocalServiceBaseImpl {
	
	
	private final Log log = LogFactoryUtil.getLog(T_Ul_ActividadLocalServiceImpl.class); 

	public T_Ul_Actividad createT_Ul_Actividad(String tituloActividad, String tipoActividad, String descriActividad, String estadoEntrActividad, Date fCreacActividad,
	        Date fCierrActividad, String porcActividad ,ServiceContext serviceContext) throws PortalException {

		    // Incrementar el contador para obtener un nuevo ID de curso
		    Long idActividad = counterLocalService.increment();
		    log.info("Generado nuevo ID de curso: " + idActividad);

		    // Obtener el usuario por su ID desde el ServiceContext
		    User user = UserLocalServiceUtil.getUserById(serviceContext.getUserId());

		    // Crear la instancia de T_Ul_Curso
		    T_Ul_Actividad t_ul_actividad = t_Ul_ActividadPersistence.create(idActividad);

		    // Establecer los campos en el objeto t_ul_curso
		    t_ul_actividad.setTituloActividad(tituloActividad);
		    t_ul_actividad.setTipoActividad(tipoActividad);
		    t_ul_actividad.setDescriActividad(descriActividad);
		    t_ul_actividad.setEstadoEntrActividad(estadoEntrActividad);
		    t_ul_actividad.setFCreacActividad(fCreacActividad);
		    t_ul_actividad.setFCierrActividad(fCierrActividad);
		    t_ul_actividad.setPorcActividad(porcActividad);
		    
		    t_ul_actividad.setUserId(serviceContext.getUserId());
		    t_ul_actividad.setGroupId(serviceContext.getScopeGroupId());
		    t_ul_actividad.setUserName(user.getFullName());
		    t_ul_actividad.setCreateDate(new Date());
		    t_ul_actividad.setModifiedDate(new Date());

		    // Guardar la instancia en la base de datos
		    t_Ul_ActividadPersistence.update(t_ul_actividad);

		    log.info("Curso registrado correctamente: " + t_ul_actividad.toString());

		    return t_ul_actividad;
		}

	
	public T_Ul_Actividad updateT_Ul_Actividad(long idActividad, String tituloActividad, String tipoActividad, String descriActividad, String estadoEntrActividad, Date fCreacActividad,
	        Date fCierrActividad, String porcActividad ,ServiceContext serviceContext) throws PortalException {
		
		//Buscar por ID el curso a modificar
		T_Ul_Actividad t_ul_actividad = t_Ul_ActividadPersistence.findByPrimaryKey(idActividad);
		
		// Obtener el usuario por su ID desde el ServiceContext
		User user = UserLocalServiceUtil.getUserById(serviceContext.getUserId());
		
		// Establecer los campos en el objeto t_ul_curso
		t_ul_actividad.setTituloActividad(tituloActividad);
		t_ul_actividad.setTipoActividad(tipoActividad);
		t_ul_actividad.setDescriActividad(descriActividad);
		t_ul_actividad.setEstadoEntrActividad(estadoEntrActividad);
		t_ul_actividad.setFCreacActividad(fCreacActividad);
		t_ul_actividad.setFCierrActividad(fCierrActividad);
		t_ul_actividad.setPorcActividad(porcActividad);
		

		t_ul_actividad.setUserId(serviceContext.getUserId()); 
		t_ul_actividad.setGroupId(serviceContext.getScopeGroupId()); 
		t_ul_actividad.setUserName(user.getFullName()); 
		
		// Guardar la instancia en la base de datos
		return t_Ul_ActividadPersistence.update(t_ul_actividad);
	}
	
	public T_Ul_Actividad deleteT_Ul_Actividad(long idActividad) throws PortalException{
		return t_Ul_ActividadPersistence.remove(idActividad);
	}
	
	public T_Ul_Actividad getT_Ul_Actividad(long idActividad) throws PortalException{
		return t_Ul_ActividadPersistence.findByPrimaryKey(idActividad);
	}
	

	public List<T_Ul_Actividad> getAllT_Ul_Actividad() {
		return t_Ul_ActividadPersistence.findAll();
	}


	public List<T_Ul_Actividad> getT_Ul_ActividadByName(String tituloActividad) {
		
		return t_Ul_ActividadPersistence.findByTituloActividad(tituloActividad);
	}
	
	
	
}
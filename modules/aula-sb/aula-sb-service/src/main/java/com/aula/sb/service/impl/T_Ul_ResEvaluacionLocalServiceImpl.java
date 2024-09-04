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


import com.aula.sb.model.T_Ul_ResEvaluacion;
import com.aula.sb.service.base.T_Ul_ResEvaluacionLocalServiceBaseImpl;

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
	property = "model.class.name=com.aula.sb.model.T_Ul_ResEvaluacion",
	service = AopService.class
)
public class T_Ul_ResEvaluacionLocalServiceImpl extends T_Ul_ResEvaluacionLocalServiceBaseImpl {
	
	private final Log log = LogFactoryUtil.getLog(T_Ul_ResEvaluacionLocalServiceImpl.class); 

	public T_Ul_ResEvaluacion createT_Ul_ResEvaluacion(String problRespuestas, String opcionRespuestas, String puntajeRespuestas,
		    Long T_Ul_Estudiante_id, Long T_Ul_PrgEvaluacion_id, Long T_Ul_Califi_id, ServiceContext serviceContext) throws PortalException {

		    // Incrementar el contador para obtener un nuevo ID de curso
		    Long idRespuestas = counterLocalService.increment();
		    log.info("Generado nuevo ID de curso: " + idRespuestas);

		    // Obtener el usuario por su ID desde el ServiceContext
		    User user = UserLocalServiceUtil.getUserById(serviceContext.getUserId());

		    // Crear la instancia de T_Ul_Curso
		    T_Ul_ResEvaluacion t_ul_resevaluacion = t_Ul_ResEvaluacionPersistence.create(idRespuestas);

		    // Establecer los campos en el objeto t_ul_curso
		    t_ul_resevaluacion.setProblRespuestas(problRespuestas);
		    t_ul_resevaluacion.setOpcionRespuestas(opcionRespuestas);
		    t_ul_resevaluacion.setPuntajeRespuestas(puntajeRespuestas);
		    t_ul_resevaluacion.setT_Ul_Estudiante_id(T_Ul_Estudiante_id);
		    t_ul_resevaluacion.setT_Ul_PrgEvaluacion_id(T_Ul_PrgEvaluacion_id);
		    t_ul_resevaluacion.setT_Ul_Califi_id(T_Ul_Califi_id);
		    
		    
		    t_ul_resevaluacion.setUserId(serviceContext.getUserId());
		    t_ul_resevaluacion.setGroupId(serviceContext.getScopeGroupId());
		    t_ul_resevaluacion.setUserName(user.getFullName());
		    t_ul_resevaluacion.setCreateDate(new Date());
		    t_ul_resevaluacion.setModifiedDate(new Date());

		    // Guardar la instancia en la base de datos
		    t_Ul_ResEvaluacionPersistence.update(t_ul_resevaluacion);

		    log.info("Curso registrado correctamente: " + t_ul_resevaluacion.toString());

		    return t_ul_resevaluacion;
		}

	
	public T_Ul_ResEvaluacion updateT_Ul_ResEvaluacion(long idRespuestas, String problRespuestas, String opcionRespuestas, String puntajeRespuestas,
		    Long T_Ul_Estudiante_id, Long T_Ul_PrgEvaluacion_id, Long T_Ul_Califi_id, ServiceContext serviceContext) throws PortalException {
		
		//Buscar por ID el curso a modificar
		T_Ul_ResEvaluacion t_ul_resevaluacion = t_Ul_ResEvaluacionPersistence.findByPrimaryKey(idRespuestas);
		
		// Obtener el usuario por su ID desde el ServiceContext
		User user = UserLocalServiceUtil.getUserById(serviceContext.getUserId());
		
		// Establecer los campos en el objeto t_ul_curso
		t_ul_resevaluacion.setProblRespuestas(problRespuestas);
	    t_ul_resevaluacion.setOpcionRespuestas(opcionRespuestas);
	    t_ul_resevaluacion.setPuntajeRespuestas(puntajeRespuestas);
	    t_ul_resevaluacion.setT_Ul_Estudiante_id(T_Ul_Estudiante_id);
	    t_ul_resevaluacion.setT_Ul_PrgEvaluacion_id(T_Ul_PrgEvaluacion_id);
	    t_ul_resevaluacion.setT_Ul_Califi_id(T_Ul_Califi_id);
		

	    t_ul_resevaluacion.setUserId(serviceContext.getUserId()); 
	    t_ul_resevaluacion.setGroupId(serviceContext.getScopeGroupId()); 
	    t_ul_resevaluacion.setUserName(user.getFullName()); 
		
		// Guardar la instancia en la base de datos
		return t_Ul_ResEvaluacionPersistence.update(t_ul_resevaluacion);
	}
	
	public T_Ul_ResEvaluacion deleteT_Ul_ResEvaluacion(long idRespuestas) throws PortalException{
		return t_Ul_ResEvaluacionPersistence.remove(idRespuestas);
	}
	
	public T_Ul_ResEvaluacion getT_Ul_ResEvaluacion(long idRespuestas) throws PortalException{
		return t_Ul_ResEvaluacionPersistence.findByPrimaryKey(idRespuestas);
	}
	
	public List<T_Ul_ResEvaluacion> getT_Ul_ResEvaluacionByProblRespuestas(String problRespuestas){
		return t_Ul_ResEvaluacionPersistence.findByproblRespuestas(problRespuestas);
	}
	
	public List<T_Ul_ResEvaluacion> getAllT_Ul_ResEvaluacion(){
		return t_Ul_ResEvaluacionPersistence.findAll();
	}
	
	
}
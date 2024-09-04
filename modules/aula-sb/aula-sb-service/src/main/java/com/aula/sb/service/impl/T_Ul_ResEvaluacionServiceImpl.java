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
import com.aula.sb.service.T_Ul_ResEvaluacionLocalServiceUtil;
import com.aula.sb.service.base.T_Ul_ResEvaluacionServiceBaseImpl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;


import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=aulavirtual",
		"json.web.service.context.path=T_Ul_ResEvaluacion"
	},
	service = AopService.class
)
public class T_Ul_ResEvaluacionServiceImpl
	extends T_Ul_ResEvaluacionServiceBaseImpl {
	
	private final Log log = LogFactoryUtil.getLog(T_Ul_ResEvaluacionServiceImpl.class); 

	public T_Ul_ResEvaluacion createT_Ul_ResEvaluacion(String problRespuestas, String opcionRespuestas, String puntajeRespuestas,
		    Long T_Ul_Estudiante_id, Long T_Ul_PrgEvaluacion_id, Long T_Ul_Califi_id, ServiceContext serviceContext) throws PortalException {
	    
	    // Llamada al servicio local
		T_Ul_ResEvaluacion resevaluacion = T_Ul_ResEvaluacionLocalServiceUtil.createT_Ul_ResEvaluacion(problRespuestas, opcionRespuestas, puntajeRespuestas,
			    T_Ul_Estudiante_id, T_Ul_PrgEvaluacion_id, T_Ul_Califi_id, serviceContext);
	    
	    log.info("Respuestas evaluacion creado en el servicio remoto: " + resevaluacion);

	    return resevaluacion;
	}

	
	public T_Ul_ResEvaluacion updateT_Ul_ResEvaluacion(long idRespuestas, String problRespuestas, String opcionRespuestas, String puntajeRespuestas,
		    Long T_Ul_Estudiante_id, Long T_Ul_PrgEvaluacion_id, Long T_Ul_Califi_id, ServiceContext serviceContext) throws PortalException {
	    
	    
	    return T_Ul_ResEvaluacionLocalServiceUtil.updateT_Ul_ResEvaluacion(idRespuestas, problRespuestas, opcionRespuestas, puntajeRespuestas,
			    T_Ul_Estudiante_id, T_Ul_PrgEvaluacion_id, T_Ul_Califi_id, serviceContext);
	}
	
	public T_Ul_ResEvaluacion deleteT_Ul_ResEvaluacion(long idRespuestas) throws PortalException{
		return T_Ul_ResEvaluacionLocalServiceUtil.deleteT_Ul_ResEvaluacion(idRespuestas);
	}
	
	public T_Ul_ResEvaluacion getT_Ul_ResEvaluacion(long idRespuestas) throws PortalException{
		return T_Ul_ResEvaluacionLocalServiceUtil.getT_Ul_ResEvaluacion(idRespuestas);
	}
	
	public List<T_Ul_ResEvaluacion> getT_Ul_ResEvaluacionByProblRespuestas(String problRespuestas){
		return T_Ul_ResEvaluacionLocalServiceUtil.getT_Ul_ResEvaluacionByProblRespuestas(problRespuestas);
	}
	
	public List<T_Ul_ResEvaluacion> getAllT_Ul_ResEvaluacion(){
		return T_Ul_ResEvaluacionLocalServiceUtil.getAllT_Ul_ResEvaluacion();
	}
}
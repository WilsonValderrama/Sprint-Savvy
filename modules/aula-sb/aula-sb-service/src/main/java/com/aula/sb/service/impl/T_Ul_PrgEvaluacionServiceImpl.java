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


import com.aula.sb.model.T_Ul_PrgEvaluacion;
import com.aula.sb.service.T_Ul_PrgEvaluacionLocalServiceUtil;
import com.aula.sb.service.base.T_Ul_PrgEvaluacionServiceBaseImpl;

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
		"json.web.service.context.path=T_Ul_PrgEvaluacion"
	},
	service = AopService.class
)
public class T_Ul_PrgEvaluacionServiceImpl
	extends T_Ul_PrgEvaluacionServiceBaseImpl {
	
	private final Log log = LogFactoryUtil.getLog(T_Ul_PrgEvaluacionServiceImpl.class); 
	
	public T_Ul_PrgEvaluacion createT_Ul_PrgEvaluacion(String problPreguntas, String opcPreguntas,
			String puntajePreguntas, String intentoPreguntas, String limiteTPreguntas, Long T_Ul_Actividad_id,
			ServiceContext serviceContext) throws PortalException {
		
		log.info("Inicio de creacion de Preguntas Evaluación en el servicio remoto");
	    log.info("Parametros recibidos: problPreguntas=" + problPreguntas + ", opcPreguntas=" + opcPreguntas +
	            ", puntajePreguntas=" + puntajePreguntas + ", intentoPreguntas=" + intentoPreguntas +
	            ", limiteTPreguntas=" + limiteTPreguntas + ", T_Ul_Actividad_id=" + T_Ul_Actividad_id);
	    

	    // Verificar si algun parametro es null
	    if (problPreguntas == null || opcPreguntas == null || puntajePreguntas == null || 
	    		intentoPreguntas == null || limiteTPreguntas == null || T_Ul_Actividad_id == null) {
	        log.error("Algun parametro recibido es null.");
	        throw new PortalException("Algun parametro recibido es null.");
	    }
	    
	 // Llamada al servicio local
	    T_Ul_PrgEvaluacion preguntas = T_Ul_PrgEvaluacionLocalServiceUtil.createT_Ul_PrgEvaluacion(problPreguntas, 
	    		opcPreguntas, puntajePreguntas, intentoPreguntas, limiteTPreguntas, T_Ul_Actividad_id, serviceContext);
	    
	    log.info("Preguntas creadas en el servicio remoto: " + preguntas);
	
	 // Verifica el curso creado
	    if (preguntas == null) {
	        log.error("Pregunta creada es null.");
	        throw new PortalException("Preguntas creadas es null.");
	    }
	    
	    return preguntas;
	}
	
	public T_Ul_PrgEvaluacion updateT_Ul_PrgEvaluacion(Long idPreguntas, String problPreguntas, String opcPreguntas,
			String puntajePreguntas, String intentoPreguntas, String limiteTPreguntas, Long T_Ul_Actividad_id,
			ServiceContext serviceContext) throws PortalException {
	    
	    return T_Ul_PrgEvaluacionLocalServiceUtil.updateT_Ul_PrgEvaluacion(idPreguntas, problPreguntas, opcPreguntas, 
	    		puntajePreguntas, intentoPreguntas, limiteTPreguntas, T_Ul_Actividad_id, serviceContext);
	}
	
	public T_Ul_PrgEvaluacion deleteT_Ul_PrgEvaluacion(long idPreguntas) throws PortalException{
		return T_Ul_PrgEvaluacionLocalServiceUtil.deleteT_Ul_PrgEvaluacion(idPreguntas);
	}
	
	public T_Ul_PrgEvaluacion getT_Ul_PrgEvaluacion(long idPreguntas) throws PortalException{
		return T_Ul_PrgEvaluacionLocalServiceUtil.getT_Ul_PrgEvaluacion(idPreguntas);
	}
	
	
	
	public List<T_Ul_PrgEvaluacion> getAllT_Ul_PrgEvaluaciones(){
		return T_Ul_PrgEvaluacionLocalServiceUtil.getAllT_Ul_PrgEvaluaciones();
	}

}
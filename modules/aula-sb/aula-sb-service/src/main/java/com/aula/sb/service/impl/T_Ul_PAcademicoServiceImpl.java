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

import com.aula.sb.model.T_Ul_PAcademico;
import com.aula.sb.service.T_Ul_PAcademicoLocalServiceUtil;
import com.aula.sb.service.base.T_Ul_PAcademicoServiceBaseImpl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=aulavirtual",
		"json.web.service.context.path=T_Ul_PAcademico"
	},
	service = AopService.class
)
public class T_Ul_PAcademicoServiceImpl extends T_Ul_PAcademicoServiceBaseImpl {
	
	private final Log log = LogFactoryUtil.getLog(T_Ul_PAcademicoServiceImpl.class); 
	
	public T_Ul_PAcademico createT_Ul_PAcademico(String tituloPeriodo, String fInicioPeriodo, String fFinPeriodo,
				String porcPeriodo, Long T_Ul_Curso_id, ServiceContext serviceContext) throws PortalException {
		
		log.info("Inicio de creacion de curso en el servicio remoto");
	    log.info("Parametros recibidos: tituloPeriodo=" + tituloPeriodo + ", fInicioPeriodo=" + fInicioPeriodo +
	            ", fFinPeriodo=" + fFinPeriodo + ", porcPeriodo=" + porcPeriodo +
	            ", T_Ul_Curso_id=" + T_Ul_Curso_id);
	    
	 // Llamada al servicio local
	    T_Ul_PAcademico academico = T_Ul_PAcademicoLocalServiceUtil.createT_Ul_PAcademico(tituloPeriodo, _parseDate(fInicioPeriodo), _parseDate(fFinPeriodo), porcPeriodo, T_Ul_Curso_id, serviceContext);
	    
	    log.info("Curso creado en el servicio remoto: " + academico);

	    return academico;
	}
	
	private Date _parseDate(String dateString) throws PortalException {
	    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	    sdf.setLenient(false); // No permitir fechas como 32/13/2024
	    try {
	        return sdf.parse(dateString);
	    } catch (ParseException e) {
	        throw new PortalException("Fecha en formato incorrecto: " + dateString, e);
	    }
	}
	
	
	public T_Ul_PAcademico updateT_Ul_PAcademico(long idPeriodo, String tituloPeriodo, String fInicioPeriodo,
			String fFinPeriodo, String porcPeriodo, Long T_Ul_Curso_id, ServiceContext serviceContext)
			throws PortalException {
	    
	    Date inicioPeriodo = _parseDate(fInicioPeriodo);
	    Date finPeriodo = _parseDate(fFinPeriodo);
	    
	    return T_Ul_PAcademicoLocalServiceUtil.updateT_Ul_PAcademico(idPeriodo, tituloPeriodo, inicioPeriodo, finPeriodo, porcPeriodo, T_Ul_Curso_id, serviceContext);
	    
	}
	
	public T_Ul_PAcademico deleteT_Ul_PAcademico(long idPeriodo) throws PortalException{
		return T_Ul_PAcademicoLocalServiceUtil.deleteT_Ul_PAcademico(idPeriodo);
	}
	
	public T_Ul_PAcademico getT_Ul_PAcademico(long idPeriodo) throws PortalException{
		return T_Ul_PAcademicoLocalServiceUtil. getT_Ul_PAcademico(idPeriodo);
	}
	
	public List<T_Ul_PAcademico> getT_Ul_PAcademicoByName(String tituloPeriodo){
		return T_Ul_PAcademicoLocalServiceUtil.getT_Ul_PAcademicoByName(tituloPeriodo);
	}
	
	public List<T_Ul_PAcademico> getAllT_Ul_PAcademicos(){
		return T_Ul_PAcademicoLocalServiceUtil.getAllT_Ul_PAcademicos();
	}
}
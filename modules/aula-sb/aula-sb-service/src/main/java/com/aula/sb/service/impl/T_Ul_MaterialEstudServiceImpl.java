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

import com.aula.sb.model.T_Ul_Curso;
import com.aula.sb.model.T_Ul_MaterialEstud;
import com.aula.sb.model.T_Ul_MaterialEstudModel;
import com.aula.sb.service.T_Ul_CursoLocalServiceUtil;
import com.aula.sb.service.T_Ul_MaterialEstudLocalServiceUtil;
import com.aula.sb.service.base.T_Ul_MaterialEstudServiceBaseImpl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
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
@Component(property = { "json.web.service.context.name=aulavirtual",
		"json.web.service.context.path=T_Ul_MaterialEstud" }, service = AopService.class)
public class T_Ul_MaterialEstudServiceImpl extends T_Ul_MaterialEstudServiceBaseImpl {
	
	
	
	//Metodo crear material curso
	public T_Ul_MaterialEstud createMaterialEstudio(String tituloMaterial, String fCreacionMaterial, String urlArchMaterial, 
			String descripMaterial, ServiceContext serviceContext) throws PortalException { 
		
				T_Ul_MaterialEstud  materialCurso = (T_Ul_MaterialEstud) T_Ul_MaterialEstudLocalServiceUtil.createMaterialEstudio(tituloMaterial, _parseDate(fCreacionMaterial), urlArchMaterial, descripMaterial, serviceContext);

				return  materialCurso;
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
	
	//Metodo actualizar material curso
	public T_Ul_MaterialEstud updateT_Ul_MaterialEstud(long idMaterial, String tituloMaterial, String fCreacionMaterial, String urlArchMaterial, 
			String descripMaterial, ServiceContext serviceContext) throws PortalException {
		
	    Date creacionMaterial = _parseDate(fCreacionMaterial);
	   	        
	    return (T_Ul_MaterialEstud) T_Ul_MaterialEstudLocalServiceUtil.updateT_Ul_MaterialEstud(idMaterial, tituloMaterial, creacionMaterial, urlArchMaterial, descripMaterial, serviceContext);
	}
	
	//Metodo eliminar material curso por ID
	public T_Ul_MaterialEstud deleteT_Ul_MaterialEstud(long idMaterial) throws PortalException{
		return T_Ul_MaterialEstudLocalServiceUtil.deleteT_Ul_MaterialEstud(idMaterial);
	}
	
	//Metodo obtener material curso por ID
	public T_Ul_MaterialEstud getT_Ul_MaterialEstud(long idMaterial) throws PortalException{
		return T_Ul_MaterialEstudLocalServiceUtil.getT_Ul_MaterialEstud(idMaterial);
	}
	
	//Metodo obtener material curso por nombre
	public List<T_Ul_MaterialEstud> getT_Ul_MaterialEstudByName(String tituloMaterial){
		return T_Ul_MaterialEstudLocalServiceUtil.getT_Ul_MaterialEstudByName(tituloMaterial);
	}
	
	//Metodo obtener todo el material curso
	public List<T_Ul_MaterialEstud> getAllT_Ul_MaterialEstud(){
		return T_Ul_MaterialEstudLocalServiceUtil.getAllT_Ul_MaterialEstud();
	}

}
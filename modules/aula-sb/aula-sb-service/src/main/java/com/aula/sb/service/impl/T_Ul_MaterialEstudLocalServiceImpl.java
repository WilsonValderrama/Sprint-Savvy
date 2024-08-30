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
import com.aula.sb.service.base.T_Ul_MaterialEstudLocalServiceBaseImpl;

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
@Component(property = "model.class.name=com.aula.sb.model.T_Ul_MaterialEstud", service = AopService.class)
public class T_Ul_MaterialEstudLocalServiceImpl extends T_Ul_MaterialEstudLocalServiceBaseImpl {

	private final Log log = LogFactoryUtil.getLog(T_Ul_MaterialEstudLocalServiceImpl.class);


	//Metodo crear material curso
	public T_Ul_MaterialEstud createMaterialEstudio(String tituloMaterial, Date fCreacionMaterial, String urlArchMaterial, 
	String descripMaterial, ServiceContext serviceContext) throws PortalException {  

	Long idMaterial = counterLocalService.increment(); 
 
	User user = UserLocalServiceUtil.getUserById(serviceContext.getUserId()); 

	T_Ul_MaterialEstud t_ul_material = t_Ul_MaterialEstudPersistence.create(idMaterial); 

	t_ul_material.setTituloMaterial(tituloMaterial);	
	t_ul_material.setFCreacionMaterial(fCreacionMaterial);
	t_ul_material.setUrlArchMaterial(urlArchMaterial);
	t_ul_material.setDescripMaterial(descripMaterial);

	t_ul_material.setUserId(serviceContext.getUserId()); 
	t_ul_material.setGroupId(serviceContext.getScopeGroupId()); 
	t_ul_material.setUserName(user.getFullName()); 
	t_ul_material.setCreateDate(new Date()); 


	log.info(serviceContext.getUserId()); 
	log.info(serviceContext.getScopeGroupId()); 
	log.info(user.getFullName()); 
	log.info("Material:*** "+t_ul_material.toString()); 
	t_Ul_MaterialEstudPersistence.update(t_ul_material); 

	return t_ul_material; 

	}
	
	
	//Metodo actualizar material curso
	public T_Ul_MaterialEstud updateT_Ul_MaterialEstud(long idMaterial, String tituloMaterial, Date fCreacionMaterial, String urlArchMaterial, 
			String descripMaterial, ServiceContext serviceContext) throws PortalException {
		
		//Buscar por ID el material curso a modificar
		T_Ul_MaterialEstud t_ul_materialCurso = t_Ul_MaterialEstudPersistence.findByPrimaryKey(idMaterial);
		
		// Obtener el usuario por su ID desde el ServiceContext
		User user = UserLocalServiceUtil.getUserById(serviceContext.getUserId());
		
		// Establecer los campos en el objeto t_ul_curso
		t_ul_materialCurso.setTituloMaterial(tituloMaterial);
		t_ul_materialCurso.setFCreacionMaterial(fCreacionMaterial);
		t_ul_materialCurso.setUrlArchMaterial(urlArchMaterial);
		t_ul_materialCurso.setDescripMaterial(descripMaterial);

		
		t_ul_materialCurso.setUserId(serviceContext.getUserId()); 
		t_ul_materialCurso.setGroupId(serviceContext.getScopeGroupId()); 
		t_ul_materialCurso.setUserName(user.getFullName()); 
		
		// Guardar la instancia en la base de datos
		return t_Ul_MaterialEstudPersistence.update(t_ul_materialCurso);
	}
	
	
	//Metodo eliminar material curso por ID
	public T_Ul_MaterialEstud deleteT_Ul_MaterialEstud(long idMaterial) throws PortalException{
		return t_Ul_MaterialEstudPersistence.remove(idMaterial);
	}
	
	//Metodo obtener material curso por ID
	public T_Ul_MaterialEstud getT_Ul_MaterialEstud(long idMaterial) throws PortalException{
		return t_Ul_MaterialEstudPersistence.findByPrimaryKey(idMaterial);
	}
	
	//Metodo obtener material curso por nombre
	public List<T_Ul_MaterialEstud> getT_Ul_MaterialEstudByName(String tituloMaterial){
		return t_Ul_MaterialEstudPersistence.findByTituloMaterial(tituloMaterial);
	}
	
	//Metodo obtener todo el material de curso
	public List<T_Ul_MaterialEstud> getAllT_Ul_MaterialEstud(){
		return t_Ul_MaterialEstudPersistence.findAll();
	}
	

}
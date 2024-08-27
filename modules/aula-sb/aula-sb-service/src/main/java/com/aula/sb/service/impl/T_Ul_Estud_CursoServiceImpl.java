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

import com.aula.sb.model.T_Ul_Estud_Curso;
import com.aula.sb.service.T_Ul_Estud_CursoLocalServiceUtil;
import com.aula.sb.service.base.T_Ul_Estud_CursoServiceBaseImpl;
import com.aula.sb.service.persistence.T_Ul_Estud_CursoPK;
import com.aula.sb.service.persistence.T_Ul_Estud_CursoUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
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
	property = {
		"json.web.service.context.name=aulavirtual",
		"json.web.service.context.path=T_Ul_Estud_Curso"
	},
	service = AopService.class
)
public class T_Ul_Estud_CursoServiceImpl
	extends T_Ul_Estud_CursoServiceBaseImpl {
	
	public T_Ul_Estud_Curso createEstudCurso(long cursoId, long estudianteId ,ServiceContext serviceContext) throws PortalException {
	    T_Ul_Estud_Curso estudCurso = T_Ul_Estud_CursoLocalServiceUtil.createT_Ul_Estud_Curso(new T_Ul_Estud_CursoPK(cursoId, estudianteId));
	    
	    // Obtener el usuario por su ID desde el ServiceContext
	 	User user = UserLocalServiceUtil.getUserById(serviceContext.getUserId());
	    
	    estudCurso.setUserId(serviceContext.getUserId());
	    estudCurso.setGroupId(serviceContext.getScopeGroupId());
	    estudCurso.setUserName(user.getFullName());
	    estudCurso.setCreateDate(new Date());
	    estudCurso.setModifiedDate(new Date());
	    
	    // Persist the new entity in the database
	    estudCurso = T_Ul_Estud_CursoLocalServiceUtil.addT_Ul_Estud_Curso(estudCurso);
	    
	    return estudCurso;
	}
	
	public void deleteEstudCurso(long cursoId, long estudianteId) throws PortalException {
	    T_Ul_Estud_CursoLocalServiceUtil.deleteT_Ul_Estud_Curso(new T_Ul_Estud_CursoPK(cursoId, estudianteId));
	}
	
	public List<T_Ul_Estud_Curso> getAll() {
        return T_Ul_Estud_CursoLocalServiceUtil.getT_Ul_Estud_Cursos(-1, -1);
    }

    public List<T_Ul_Estud_Curso> getCursosByEstudianteId(long estudianteId) {
        return T_Ul_Estud_CursoUtil.findByT_Ul_Estudiante_id(estudianteId);
    }

    public List<T_Ul_Estud_Curso> getEstudiantesByCursoId(long cursoId) {
        return T_Ul_Estud_CursoUtil.findByT_Ul_Curso_id(cursoId);
    }
}
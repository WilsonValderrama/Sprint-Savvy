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



import com.aula.sb.model.T_Ul_AdminCurso;
import com.aula.sb.service.T_Ul_AdminCursoLocalServiceUtil;
import com.aula.sb.service.base.T_Ul_AdminCursoServiceBaseImpl;
import com.aula.sb.service.persistence.T_Ul_AdminCursoPK;
import com.aula.sb.service.persistence.T_Ul_AdminCursoUtil;
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
		"json.web.service.context.path=T_Ul_AdminCurso"
	},
	service = AopService.class
)
public class T_Ul_AdminCursoServiceImpl extends T_Ul_AdminCursoServiceBaseImpl {
	
	public T_Ul_AdminCurso createAdminCurso(long cursoId, long adminId , ServiceContext serviceContext) throws PortalException {
	    T_Ul_AdminCurso adminCurso = T_Ul_AdminCursoLocalServiceUtil.createT_Ul_AdminCurso(new T_Ul_AdminCursoPK(cursoId, adminId));
	    
	    // Obtener el usuario por su ID desde el ServiceContext
	 	User user = UserLocalServiceUtil.getUserById(serviceContext.getUserId());
	    
	 	adminCurso.setUserId(serviceContext.getUserId());
	 	adminCurso.setGroupId(serviceContext.getScopeGroupId());
	 	adminCurso.setUserName(user.getFullName());
	 	adminCurso.setCreateDate(new Date());
	 	adminCurso.setModifiedDate(new Date());
	    
	    // Persist the new entity in the database
	 	adminCurso = T_Ul_AdminCursoLocalServiceUtil.addT_Ul_AdminCurso(adminCurso);
	    
	    return adminCurso;
	}
	
	public void deleteAdminCurso(long cursoId, long adminId) throws PortalException {
	    T_Ul_AdminCursoLocalServiceUtil.deleteT_Ul_AdminCurso(new T_Ul_AdminCursoPK(cursoId, adminId));
	}
	
	public List<T_Ul_AdminCurso> getAll() {
        return T_Ul_AdminCursoLocalServiceUtil.getT_Ul_AdminCursos(-1, -1);
    }

    public List<T_Ul_AdminCurso> getAnminByCursoId(long cursoId) {
        return T_Ul_AdminCursoUtil.findByT_Ul_Curso_id(cursoId);
    }

}
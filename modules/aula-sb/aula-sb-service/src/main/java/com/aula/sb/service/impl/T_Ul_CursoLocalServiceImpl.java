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
import com.aula.sb.service.base.T_Ul_CursoLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the t_ ul_ curso local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * <code>com.aula.sb.service.T_Ul_CursoLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see T_Ul_CursoLocalServiceBaseImpl
 */
@Component(property = "model.class.name=com.aula.sb.model.T_Ul_Curso", service = AopService.class)
public class T_Ul_CursoLocalServiceImpl extends T_Ul_CursoLocalServiceBaseImpl {

	private final Log log = LogFactoryUtil.getLog(T_Ul_CursoLocalServiceImpl.class); 

	public T_Ul_Curso createT_Ul_Curso(String nombreCurso, Date fInicioCurso, Date fFinCurso, String colorCurso,
		    Long T_Ul_Califi_id, Long T_Ul_Profesor_id, ServiceContext serviceContext) throws PortalException {

		    // Incrementar el contador para obtener un nuevo ID de curso
		    Long idCurso = counterLocalService.increment();
		    log.info("Generado nuevo ID de curso: " + idCurso);

		    // Obtener el usuario por su ID desde el ServiceContext
		    User user = UserLocalServiceUtil.getUserById(serviceContext.getUserId());

		    // Crear la instancia de T_Ul_Curso
		    T_Ul_Curso t_ul_curso = t_Ul_CursoPersistence.create(idCurso);

		    // Establecer los campos en el objeto t_ul_curso
		    t_ul_curso.setNombreCurso(nombreCurso);
		    t_ul_curso.setFInicioCurso(fInicioCurso);
		    t_ul_curso.setFFinCurso(fFinCurso);
		    t_ul_curso.setColorCurso(colorCurso);
		    t_ul_curso.setT_Ul_Califi_id(T_Ul_Califi_id);
		    t_ul_curso.setT_Ul_Profesor_id(T_Ul_Profesor_id);
		    
		    t_ul_curso.setUserId(serviceContext.getUserId());
		    t_ul_curso.setGroupId(serviceContext.getScopeGroupId());
		    t_ul_curso.setUserName(user.getFullName());
		    t_ul_curso.setCreateDate(new Date());
		    t_ul_curso.setModifiedDate(new Date());

		    // Guardar la instancia en la base de datos
		    t_Ul_CursoPersistence.update(t_ul_curso);

		    log.info("Curso registrado correctamente: " + t_ul_curso.toString());

		    return t_ul_curso;
		}

	
	public T_Ul_Curso updateT_Ul_Curso(long idCurso, String nombreCurso, Date fInicioCurso, Date fFinCurso, String colorCurso,
			Long T_Ul_Califi_id,Long T_Ul_Profesor_id, ServiceContext serviceContext) throws PortalException {
		
		//Buscar por ID el curso a modificar
		T_Ul_Curso t_ul_curso = t_Ul_CursoPersistence.findByPrimaryKey(idCurso);
		
		// Obtener el usuario por su ID desde el ServiceContext
		User user = UserLocalServiceUtil.getUserById(serviceContext.getUserId());
		
		// Establecer los campos en el objeto t_ul_curso
		t_ul_curso.setNombreCurso(nombreCurso);
		t_ul_curso.setFInicioCurso(fInicioCurso);
		t_ul_curso.setFFinCurso(fFinCurso);
		t_ul_curso.setColorCurso(colorCurso);
		t_ul_curso.setT_Ul_Califi_id(T_Ul_Califi_id);
		t_ul_curso.setT_Ul_Profesor_id(T_Ul_Profesor_id);
		

		t_ul_curso.setUserId(serviceContext.getUserId()); 
		t_ul_curso.setGroupId(serviceContext.getScopeGroupId()); 
		t_ul_curso.setUserName(user.getFullName()); 
		
		// Guardar la instancia en la base de datos
		return t_Ul_CursoPersistence.update(t_ul_curso);
	}
	
	public T_Ul_Curso deleteT_Ul_Curso(long idCurso) throws PortalException{
		return t_Ul_CursoPersistence.remove(idCurso);
	}
	
	public T_Ul_Curso getT_Ul_Curso(long idCurso) throws PortalException{
		return t_Ul_CursoPersistence.findByPrimaryKey(idCurso);
	}
	
	public List<T_Ul_Curso> getT_Ul_CursoByName(String nombreCurso){
		return t_Ul_CursoPersistence.findByNombreCurso(nombreCurso);
	}
	
	public List<T_Ul_Curso> getAllT_Ul_Cursos(){
		return t_Ul_CursoPersistence.findAll();
	}
	
}
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
import com.aula.sb.service.base.T_Ul_PAcademicoLocalServiceBaseImpl;

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
@Component(property = "model.class.name=com.aula.sb.model.T_Ul_PAcademico", service = AopService.class)

public class T_Ul_PAcademicoLocalServiceImpl extends T_Ul_PAcademicoLocalServiceBaseImpl {

	private final Log log = LogFactoryUtil.getLog(T_Ul_PAcademicoLocalServiceImpl.class);

	public T_Ul_PAcademico createT_Ul_PAcademico(String tituloPeriodo, Date fInicioPeriodo, Date fFinPeriodo,
			String porcPeriodo, Long T_Ul_Curso_id, ServiceContext serviceContext) throws PortalException {

		// Incrementar el contador para obtener un nuevo ID de curso
		Long idPeriodo = counterLocalService.increment();
		log.info("Generado nuevo ID de curso: " + idPeriodo);

		// Obtener el usuario por su ID desde el ServiceContext
		User user = UserLocalServiceUtil.getUserById(serviceContext.getUserId());

		// Crear la instancia de T_Ul_Curso
		T_Ul_PAcademico t_ul_pacademico = t_Ul_PAcademicoPersistence.create(idPeriodo);

		// Establecer los campos en el objeto t_ul_pacademico
		t_ul_pacademico.setTituloPeriodo(tituloPeriodo);
		t_ul_pacademico.setFInicioPeriodo(fInicioPeriodo);
		t_ul_pacademico.setFFinPeriodo(fFinPeriodo);
		t_ul_pacademico.setPorcPeriodo(porcPeriodo);
		t_ul_pacademico.setT_Ul_Curso_id(T_Ul_Curso_id);

		t_ul_pacademico.setUserId(serviceContext.getUserId());
		t_ul_pacademico.setGroupId(serviceContext.getScopeGroupId());
		t_ul_pacademico.setUserName(user.getFullName());
		t_ul_pacademico.setCreateDate(new Date());
		t_ul_pacademico.setModifiedDate(new Date());

		// Guardar la instancia en la base de datos
		t_Ul_PAcademicoPersistence.update(t_ul_pacademico);

		log.info("Curso registrado correctamente: " + t_ul_pacademico.toString());

		return t_ul_pacademico;

	}

	public T_Ul_PAcademico updateT_Ul_PAcademico(long idPeriodo, String tituloPeriodo, Date fInicioPeriodo,
			Date fFinPeriodo, String porcPeriodo, Long T_Ul_Curso_id, ServiceContext serviceContext)
			throws PortalException {

		// Buscar por ID el curso a modificar
		T_Ul_PAcademico t_ul_pacademico = t_Ul_PAcademicoPersistence.findByPrimaryKey(idPeriodo);

		// Obtener el usuario por su ID desde el ServiceContext
		User user = UserLocalServiceUtil.getUserById(serviceContext.getUserId());

		// Establecer los campos en el objeto t_ul_pacademico
		t_ul_pacademico.setTituloPeriodo(tituloPeriodo);
		t_ul_pacademico.setFInicioPeriodo(fInicioPeriodo);
		t_ul_pacademico.setFFinPeriodo(fFinPeriodo);
		t_ul_pacademico.setPorcPeriodo(porcPeriodo);
		t_ul_pacademico.setT_Ul_Curso_id(T_Ul_Curso_id);

		t_ul_pacademico.setUserId(serviceContext.getUserId());
		t_ul_pacademico.setGroupId(serviceContext.getScopeGroupId());
		t_ul_pacademico.setUserName(user.getFullName());

		// Guardar la instancia en la base de datos
		return t_Ul_PAcademicoPersistence.update(t_ul_pacademico);
	}
	
	public T_Ul_PAcademico deleteT_Ul_PAcademico(long idPeriodo) throws PortalException{
		return t_Ul_PAcademicoPersistence.remove(idPeriodo);
	}
	
	public T_Ul_PAcademico getT_Ul_PAcademico(long idPeriodo) throws PortalException{
		return t_Ul_PAcademicoPersistence.findByPrimaryKey(idPeriodo);
	}
	
	public List<T_Ul_PAcademico> getT_Ul_PAcademicoByName(String tituloPeriodo){
		return t_Ul_PAcademicoPersistence.findByTituloPeriodo(tituloPeriodo);
	}
	
	public List<T_Ul_PAcademico> getAllT_Ul_PAcademicos(){
		return t_Ul_PAcademicoPersistence.findAll();
	}

}
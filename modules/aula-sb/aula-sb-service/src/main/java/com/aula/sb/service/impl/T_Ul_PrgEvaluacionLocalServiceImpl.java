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
import com.aula.sb.service.base.T_Ul_PrgEvaluacionLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(property = "model.class.name=com.aula.sb.model.T_Ul_PrgEvaluacion", service = AopService.class)
public class T_Ul_PrgEvaluacionLocalServiceImpl extends T_Ul_PrgEvaluacionLocalServiceBaseImpl {

	private final Log log = LogFactoryUtil.getLog(T_Ul_PrgEvaluacionLocalServiceImpl.class);

	public T_Ul_PrgEvaluacion createT_Ul_PrgEvaluacion(String problPreguntas, String opcPreguntas,
			String puntajePreguntas, String intentoPreguntas, String limiteTPreguntas, Long T_Ul_Actividad_id,
			ServiceContext serviceContext) throws PortalException {

		// Incrementar el contador para obtener un nuevo ID de curso
		Long idPreguntas = counterLocalService.increment();
		log.info("Generado nuevo ID de curso: " + idPreguntas);

		// Obtener el usuario por su ID desde el ServiceContext
		User user = UserLocalServiceUtil.getUserById(serviceContext.getUserId());

		// Crear la instancia de T_Ul_PrgEvaluacion
		T_Ul_PrgEvaluacion t_ul_prgEvaluacion = t_Ul_PrgEvaluacionPersistence.create(idPreguntas);

		// Establecer los campos en el objeto t_ul_curso
		t_ul_prgEvaluacion.setProblPreguntas(problPreguntas);
		t_ul_prgEvaluacion.setOpcPreguntas(opcPreguntas);
		t_ul_prgEvaluacion.setPuntajePreguntas(puntajePreguntas);
		t_ul_prgEvaluacion.setIntentoPreguntas(intentoPreguntas);
		t_ul_prgEvaluacion.setLimiteTPreguntas(limiteTPreguntas);
		t_ul_prgEvaluacion.setT_Ul_Actividad_id(T_Ul_Actividad_id);

		t_ul_prgEvaluacion.setUserId(serviceContext.getUserId());
		t_ul_prgEvaluacion.setGroupId(serviceContext.getScopeGroupId());
		t_ul_prgEvaluacion.setUserName(user.getFullName());
		t_ul_prgEvaluacion.setCreateDate(new Date());
		t_ul_prgEvaluacion.setModifiedDate(new Date());

		// Guardar la instancia en la base de datos
		t_Ul_PrgEvaluacionPersistence.update(t_ul_prgEvaluacion);

		log.info("Preguntas registradas correctamente: " + t_ul_prgEvaluacion.toString());

		return t_ul_prgEvaluacion;
	}

	public T_Ul_PrgEvaluacion updateT_Ul_PrgEvaluacion(Long idPreguntas, String problPreguntas, String opcPreguntas,
			String puntajePreguntas, String intentoPreguntas, String limiteTPreguntas, Long T_Ul_Actividad_id,
			ServiceContext serviceContext) throws PortalException {

		// Buscar por ID el curso a modificar
		T_Ul_PrgEvaluacion t_ul_prgEvaluacion = t_Ul_PrgEvaluacionPersistence.findByPrimaryKey(idPreguntas);

		// Obtener el usuario por su ID desde el ServiceContext
		User user = UserLocalServiceUtil.getUserById(serviceContext.getUserId());

		// Establecer los campos en el objeto t_ul_prgEvaluacion
		t_ul_prgEvaluacion.setProblPreguntas(problPreguntas);
		t_ul_prgEvaluacion.setOpcPreguntas(opcPreguntas);
		t_ul_prgEvaluacion.setPuntajePreguntas(puntajePreguntas);
		t_ul_prgEvaluacion.setIntentoPreguntas(intentoPreguntas);
		t_ul_prgEvaluacion.setLimiteTPreguntas(limiteTPreguntas);
		t_ul_prgEvaluacion.setT_Ul_Actividad_id(T_Ul_Actividad_id);

		t_ul_prgEvaluacion.setUserId(serviceContext.getUserId());
		t_ul_prgEvaluacion.setGroupId(serviceContext.getScopeGroupId());
		t_ul_prgEvaluacion.setUserName(user.getFullName());

		// Guardar la instancia en la base de datos
		return t_Ul_PrgEvaluacionPersistence.update(t_ul_prgEvaluacion);
	}

	public T_Ul_PrgEvaluacion deleteT_Ul_PrgEvaluacion(long idPreguntas) throws PortalException {
		return t_Ul_PrgEvaluacionPersistence.remove(idPreguntas);
	}

	public T_Ul_PrgEvaluacion getT_Ul_PrgEvaluacion(long idPreguntas) throws PortalException {
		return t_Ul_PrgEvaluacionPersistence.findByPrimaryKey(idPreguntas);
	}

	

	public List<T_Ul_PrgEvaluacion> getAllT_Ul_PrgEvaluaciones() {
		return t_Ul_PrgEvaluacionPersistence.findAll();
	}

}
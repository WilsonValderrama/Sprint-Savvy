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

import com.aula.sb.model.T_Ul_Calificacion;
import com.aula.sb.service.T_Ul_CalificacionLocalServiceUtil;
import com.aula.sb.service.base.T_Ul_CalificacionServiceBaseImpl;

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
		"json.web.service.context.path=T_Ul_Calificacion"
	},
	service = AopService.class
)
public class T_Ul_CalificacionServiceImpl
	extends T_Ul_CalificacionServiceBaseImpl {
	
	private final Log log = LogFactoryUtil.getLog(T_Ul_CalificacionServiceImpl.class);

	public T_Ul_Calificacion createT_Ul_Calificacion(String puntCalificacion,
			ServiceContext serviceContext) throws PortalException {

		// Llamada al servicio local
		T_Ul_Calificacion calificacion = T_Ul_CalificacionLocalServiceUtil.createT_Ul_Calificacion(puntCalificacion,
				serviceContext);

		log.info("Calificacion creado en el servicio remoto: " + calificacion);

		return calificacion;
	}


	public T_Ul_Calificacion updateT_Ul_Calificacion(long idCalificacion, String puntCalificacion, ServiceContext serviceContext) throws PortalException {
		

		return T_Ul_CalificacionLocalServiceUtil.updateT_Ul_Calificacion(idCalificacion, puntCalificacion,serviceContext);
	}

	public T_Ul_Calificacion deleteT_Ul_Calificacion(long idCalificacion) throws PortalException {
		return T_Ul_CalificacionLocalServiceUtil.deleteT_Ul_Calificacion(idCalificacion);
	}

	public T_Ul_Calificacion getT_Ul_Calificacion(long idCalificacion) throws PortalException {
		return T_Ul_CalificacionLocalServiceUtil.getT_Ul_Calificacion(idCalificacion);
	}


	public List<T_Ul_Calificacion> getAllT_Ul_Calificacion() {
		return T_Ul_CalificacionLocalServiceUtil.getAllT_Ul_Calificacion();
	}
}
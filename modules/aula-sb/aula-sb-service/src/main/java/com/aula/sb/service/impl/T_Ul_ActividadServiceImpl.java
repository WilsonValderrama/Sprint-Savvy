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

import com.aula.sb.model.T_Ul_Actividad;
import com.aula.sb.service.T_Ul_ActividadLocalServiceUtil;
import com.aula.sb.service.base.T_Ul_ActividadServiceBaseImpl;

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
@Component(property = { "json.web.service.context.name=aulavirtual",
		"json.web.service.context.path=T_Ul_Actividad" }, service = AopService.class)
public class T_Ul_ActividadServiceImpl extends T_Ul_ActividadServiceBaseImpl {

	private final Log log = LogFactoryUtil.getLog(T_Ul_CursoServiceImpl.class);

	public T_Ul_Actividad createT_Ul_Actividad(String tituloActividad, String tipoActividad, String descriActividad,
			String estadoEntrActividad, String fCreacActividad, String fCierrActividad, String porcActividad,
			ServiceContext serviceContext) throws PortalException {

		// Llamada al servicio local
		T_Ul_Actividad actividad = T_Ul_ActividadLocalServiceUtil.createT_Ul_Actividad(tituloActividad, tipoActividad,
				descriActividad, estadoEntrActividad, _parseDate(fCreacActividad), _parseDate(fCierrActividad),
				porcActividad, serviceContext);

		log.info("Curso creado en el servicio remoto: " + actividad);

		return actividad;
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

	public T_Ul_Actividad updateT_Ul_Actividad(long idActividad, String tituloActividad, String tipoActividad,
			String descriActividad, String estadoEntrActividad, String fCreacActividad, String fCierrActividad,
			String porcActividad, ServiceContext serviceContext) throws PortalException {
		Date creacionActividad = _parseDate(fCreacActividad);
		Date CierreActividad = _parseDate(fCierrActividad);

		return T_Ul_ActividadLocalServiceUtil.updateT_Ul_Actividad(idActividad, tituloActividad, tipoActividad,
				descriActividad, estadoEntrActividad, creacionActividad, CierreActividad, porcActividad,
				serviceContext);
	}

	public T_Ul_Actividad deleteT_Ul_Actividad(long idActividad) throws PortalException {
		return T_Ul_ActividadLocalServiceUtil.deleteT_Ul_Actividad(idActividad);
	}

	public T_Ul_Actividad getT_Ul_Actividad(long idActividad) throws PortalException {
		return T_Ul_ActividadLocalServiceUtil.deleteT_Ul_Actividad(idActividad);
	}

	public List<T_Ul_Actividad> getT_Ul_ActividadByTitulo(String tituloActividad) {
		return T_Ul_ActividadLocalServiceUtil.getT_Ul_ActividadByName(tituloActividad);
	}

	public List<T_Ul_Actividad> getAllT_Ul_Actividad() {
		return T_Ul_ActividadLocalServiceUtil.getAllT_Ul_Actividad();
	}

}
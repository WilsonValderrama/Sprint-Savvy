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

package com.aula.sb.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link T_Ul_ActividadService}.
 *
 * @author Brian Wing Shun Chan
 * @see T_Ul_ActividadService
 * @generated
 */
public class T_Ul_ActividadServiceWrapper
	implements ServiceWrapper<T_Ul_ActividadService>, T_Ul_ActividadService {

	public T_Ul_ActividadServiceWrapper(
		T_Ul_ActividadService t_Ul_ActividadService) {

		_t_Ul_ActividadService = t_Ul_ActividadService;
	}

	@Override
	public com.aula.sb.model.T_Ul_Actividad createT_Ul_Actividad(
			String tituloActividad, String tipoActividad,
			String descriActividad, String estadoEntrActividad,
			String fCreacActividad, String fCierrActividad,
			String porcActividad,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_ActividadService.createT_Ul_Actividad(
			tituloActividad, tipoActividad, descriActividad,
			estadoEntrActividad, fCreacActividad, fCierrActividad,
			porcActividad, serviceContext);
	}

	@Override
	public com.aula.sb.model.T_Ul_Actividad deleteT_Ul_Actividad(
			long idActividad)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_ActividadService.deleteT_Ul_Actividad(idActividad);
	}

	@Override
	public java.util.List<com.aula.sb.model.T_Ul_Actividad>
		getAllT_Ul_Actividad() {

		return _t_Ul_ActividadService.getAllT_Ul_Actividad();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _t_Ul_ActividadService.getOSGiServiceIdentifier();
	}

	@Override
	public com.aula.sb.model.T_Ul_Actividad getT_Ul_Actividad(long idActividad)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_ActividadService.getT_Ul_Actividad(idActividad);
	}

	@Override
	public java.util.List<com.aula.sb.model.T_Ul_Actividad>
		getT_Ul_ActividadByTitulo(String tituloActividad) {

		return _t_Ul_ActividadService.getT_Ul_ActividadByTitulo(
			tituloActividad);
	}

	@Override
	public com.aula.sb.model.T_Ul_Actividad updateT_Ul_Actividad(
			long idActividad, String tituloActividad, String tipoActividad,
			String descriActividad, String estadoEntrActividad,
			String fCreacActividad, String fCierrActividad,
			String porcActividad,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_ActividadService.updateT_Ul_Actividad(
			idActividad, tituloActividad, tipoActividad, descriActividad,
			estadoEntrActividad, fCreacActividad, fCierrActividad,
			porcActividad, serviceContext);
	}

	@Override
	public T_Ul_ActividadService getWrappedService() {
		return _t_Ul_ActividadService;
	}

	@Override
	public void setWrappedService(T_Ul_ActividadService t_Ul_ActividadService) {
		_t_Ul_ActividadService = t_Ul_ActividadService;
	}

	private T_Ul_ActividadService _t_Ul_ActividadService;

}
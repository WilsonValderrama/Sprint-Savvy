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
 * Provides a wrapper for {@link T_Ul_CalificacionService}.
 *
 * @author Brian Wing Shun Chan
 * @see T_Ul_CalificacionService
 * @generated
 */
public class T_Ul_CalificacionServiceWrapper
	implements ServiceWrapper<T_Ul_CalificacionService>,
			   T_Ul_CalificacionService {

	public T_Ul_CalificacionServiceWrapper(
		T_Ul_CalificacionService t_Ul_CalificacionService) {

		_t_Ul_CalificacionService = t_Ul_CalificacionService;
	}

	@Override
	public com.aula.sb.model.T_Ul_Calificacion createT_Ul_Calificacion(
			String puntCalificacion,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_CalificacionService.createT_Ul_Calificacion(
			puntCalificacion, serviceContext);
	}

	@Override
	public com.aula.sb.model.T_Ul_Calificacion deleteT_Ul_Calificacion(
			long idCalificacion)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_CalificacionService.deleteT_Ul_Calificacion(
			idCalificacion);
	}

	@Override
	public java.util.List<com.aula.sb.model.T_Ul_Calificacion>
		getAllT_Ul_Calificacion() {

		return _t_Ul_CalificacionService.getAllT_Ul_Calificacion();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _t_Ul_CalificacionService.getOSGiServiceIdentifier();
	}

	@Override
	public com.aula.sb.model.T_Ul_Calificacion getT_Ul_Calificacion(
			long idCalificacion)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_CalificacionService.getT_Ul_Calificacion(idCalificacion);
	}

	@Override
	public com.aula.sb.model.T_Ul_Calificacion updateT_Ul_Calificacion(
			long idCalificacion, String puntCalificacion,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_CalificacionService.updateT_Ul_Calificacion(
			idCalificacion, puntCalificacion, serviceContext);
	}

	@Override
	public T_Ul_CalificacionService getWrappedService() {
		return _t_Ul_CalificacionService;
	}

	@Override
	public void setWrappedService(
		T_Ul_CalificacionService t_Ul_CalificacionService) {

		_t_Ul_CalificacionService = t_Ul_CalificacionService;
	}

	private T_Ul_CalificacionService _t_Ul_CalificacionService;

}
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
 * Provides a wrapper for {@link T_Ul_ResEvaluacionService}.
 *
 * @author Brian Wing Shun Chan
 * @see T_Ul_ResEvaluacionService
 * @generated
 */
public class T_Ul_ResEvaluacionServiceWrapper
	implements ServiceWrapper<T_Ul_ResEvaluacionService>,
			   T_Ul_ResEvaluacionService {

	public T_Ul_ResEvaluacionServiceWrapper(
		T_Ul_ResEvaluacionService t_Ul_ResEvaluacionService) {

		_t_Ul_ResEvaluacionService = t_Ul_ResEvaluacionService;
	}

	@Override
	public com.aula.sb.model.T_Ul_ResEvaluacion createT_Ul_ResEvaluacion(
			String problRespuestas, String opcionRespuestas,
			String puntajeRespuestas, Long T_Ul_Estudiante_id,
			Long T_Ul_PrgEvaluacion_id, Long T_Ul_Califi_id,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_ResEvaluacionService.createT_Ul_ResEvaluacion(
			problRespuestas, opcionRespuestas, puntajeRespuestas,
			T_Ul_Estudiante_id, T_Ul_PrgEvaluacion_id, T_Ul_Califi_id,
			serviceContext);
	}

	@Override
	public com.aula.sb.model.T_Ul_ResEvaluacion deleteT_Ul_ResEvaluacion(
			long idRespuestas)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_ResEvaluacionService.deleteT_Ul_ResEvaluacion(
			idRespuestas);
	}

	@Override
	public java.util.List<com.aula.sb.model.T_Ul_ResEvaluacion>
		getAllT_Ul_ResEvaluacion() {

		return _t_Ul_ResEvaluacionService.getAllT_Ul_ResEvaluacion();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _t_Ul_ResEvaluacionService.getOSGiServiceIdentifier();
	}

	@Override
	public com.aula.sb.model.T_Ul_ResEvaluacion getT_Ul_ResEvaluacion(
			long idRespuestas)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_ResEvaluacionService.getT_Ul_ResEvaluacion(idRespuestas);
	}

	@Override
	public java.util.List<com.aula.sb.model.T_Ul_ResEvaluacion>
		getT_Ul_ResEvaluacionByProblRespuestas(String problRespuestas) {

		return _t_Ul_ResEvaluacionService.
			getT_Ul_ResEvaluacionByProblRespuestas(problRespuestas);
	}

	@Override
	public com.aula.sb.model.T_Ul_ResEvaluacion updateT_Ul_ResEvaluacion(
			long idRespuestas, String problRespuestas, String opcionRespuestas,
			String puntajeRespuestas, Long T_Ul_Estudiante_id,
			Long T_Ul_PrgEvaluacion_id, Long T_Ul_Califi_id,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_ResEvaluacionService.updateT_Ul_ResEvaluacion(
			idRespuestas, problRespuestas, opcionRespuestas, puntajeRespuestas,
			T_Ul_Estudiante_id, T_Ul_PrgEvaluacion_id, T_Ul_Califi_id,
			serviceContext);
	}

	@Override
	public T_Ul_ResEvaluacionService getWrappedService() {
		return _t_Ul_ResEvaluacionService;
	}

	@Override
	public void setWrappedService(
		T_Ul_ResEvaluacionService t_Ul_ResEvaluacionService) {

		_t_Ul_ResEvaluacionService = t_Ul_ResEvaluacionService;
	}

	private T_Ul_ResEvaluacionService _t_Ul_ResEvaluacionService;

}
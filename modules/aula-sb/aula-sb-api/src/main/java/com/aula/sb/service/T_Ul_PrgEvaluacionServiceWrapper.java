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
 * Provides a wrapper for {@link T_Ul_PrgEvaluacionService}.
 *
 * @author Brian Wing Shun Chan
 * @see T_Ul_PrgEvaluacionService
 * @generated
 */
public class T_Ul_PrgEvaluacionServiceWrapper
	implements ServiceWrapper<T_Ul_PrgEvaluacionService>,
			   T_Ul_PrgEvaluacionService {

	public T_Ul_PrgEvaluacionServiceWrapper(
		T_Ul_PrgEvaluacionService t_Ul_PrgEvaluacionService) {

		_t_Ul_PrgEvaluacionService = t_Ul_PrgEvaluacionService;
	}

	@Override
	public com.aula.sb.model.T_Ul_PrgEvaluacion createT_Ul_PrgEvaluacion(
			String problPreguntas, String opcPreguntas, String puntajePreguntas,
			String intentoPreguntas, String limiteTPreguntas,
			Long T_Ul_Actividad_id,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_PrgEvaluacionService.createT_Ul_PrgEvaluacion(
			problPreguntas, opcPreguntas, puntajePreguntas, intentoPreguntas,
			limiteTPreguntas, T_Ul_Actividad_id, serviceContext);
	}

	@Override
	public com.aula.sb.model.T_Ul_PrgEvaluacion deleteT_Ul_PrgEvaluacion(
			long idPreguntas)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_PrgEvaluacionService.deleteT_Ul_PrgEvaluacion(idPreguntas);
	}

	@Override
	public java.util.List<com.aula.sb.model.T_Ul_PrgEvaluacion>
		getAllT_Ul_PrgEvaluaciones() {

		return _t_Ul_PrgEvaluacionService.getAllT_Ul_PrgEvaluaciones();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _t_Ul_PrgEvaluacionService.getOSGiServiceIdentifier();
	}

	@Override
	public com.aula.sb.model.T_Ul_PrgEvaluacion getT_Ul_PrgEvaluacion(
			long idPreguntas)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_PrgEvaluacionService.getT_Ul_PrgEvaluacion(idPreguntas);
	}

	@Override
	public com.aula.sb.model.T_Ul_PrgEvaluacion updateT_Ul_PrgEvaluacion(
			Long idPreguntas, String problPreguntas, String opcPreguntas,
			String puntajePreguntas, String intentoPreguntas,
			String limiteTPreguntas, Long T_Ul_Actividad_id,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_PrgEvaluacionService.updateT_Ul_PrgEvaluacion(
			idPreguntas, problPreguntas, opcPreguntas, puntajePreguntas,
			intentoPreguntas, limiteTPreguntas, T_Ul_Actividad_id,
			serviceContext);
	}

	@Override
	public T_Ul_PrgEvaluacionService getWrappedService() {
		return _t_Ul_PrgEvaluacionService;
	}

	@Override
	public void setWrappedService(
		T_Ul_PrgEvaluacionService t_Ul_PrgEvaluacionService) {

		_t_Ul_PrgEvaluacionService = t_Ul_PrgEvaluacionService;
	}

	private T_Ul_PrgEvaluacionService _t_Ul_PrgEvaluacionService;

}
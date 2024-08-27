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
 * Provides a wrapper for {@link T_Ul_Estud_CursoService}.
 *
 * @author Brian Wing Shun Chan
 * @see T_Ul_Estud_CursoService
 * @generated
 */
public class T_Ul_Estud_CursoServiceWrapper
	implements ServiceWrapper<T_Ul_Estud_CursoService>,
			   T_Ul_Estud_CursoService {

	public T_Ul_Estud_CursoServiceWrapper(
		T_Ul_Estud_CursoService t_Ul_Estud_CursoService) {

		_t_Ul_Estud_CursoService = t_Ul_Estud_CursoService;
	}

	@Override
	public com.aula.sb.model.T_Ul_Estud_Curso createEstudCurso(
			long cursoId, long estudianteId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_Estud_CursoService.createEstudCurso(
			cursoId, estudianteId, serviceContext);
	}

	@Override
	public void deleteEstudCurso(long cursoId, long estudianteId)
		throws com.liferay.portal.kernel.exception.PortalException {

		_t_Ul_Estud_CursoService.deleteEstudCurso(cursoId, estudianteId);
	}

	@Override
	public java.util.List<com.aula.sb.model.T_Ul_Estud_Curso> getAll() {
		return _t_Ul_Estud_CursoService.getAll();
	}

	@Override
	public java.util.List<com.aula.sb.model.T_Ul_Estud_Curso>
		getCursosByEstudianteId(long estudianteId) {

		return _t_Ul_Estud_CursoService.getCursosByEstudianteId(estudianteId);
	}

	@Override
	public java.util.List<com.aula.sb.model.T_Ul_Estud_Curso>
		getEstudiantesByCursoId(long cursoId) {

		return _t_Ul_Estud_CursoService.getEstudiantesByCursoId(cursoId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _t_Ul_Estud_CursoService.getOSGiServiceIdentifier();
	}

	@Override
	public T_Ul_Estud_CursoService getWrappedService() {
		return _t_Ul_Estud_CursoService;
	}

	@Override
	public void setWrappedService(
		T_Ul_Estud_CursoService t_Ul_Estud_CursoService) {

		_t_Ul_Estud_CursoService = t_Ul_Estud_CursoService;
	}

	private T_Ul_Estud_CursoService _t_Ul_Estud_CursoService;

}
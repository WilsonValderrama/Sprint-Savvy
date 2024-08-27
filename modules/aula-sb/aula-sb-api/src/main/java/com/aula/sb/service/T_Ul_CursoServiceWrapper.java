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
 * Provides a wrapper for {@link T_Ul_CursoService}.
 *
 * @author Brian Wing Shun Chan
 * @see T_Ul_CursoService
 * @generated
 */
public class T_Ul_CursoServiceWrapper
	implements ServiceWrapper<T_Ul_CursoService>, T_Ul_CursoService {

	public T_Ul_CursoServiceWrapper(T_Ul_CursoService t_Ul_CursoService) {
		_t_Ul_CursoService = t_Ul_CursoService;
	}

	@Override
	public com.aula.sb.model.T_Ul_Curso createT_Ul_Curso(
			String nombreCurso, String fInicioCurso, String fFinCurso,
			String colorCurso, Long T_Ul_Califi_id, Long T_Ul_Profesor_id,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_CursoService.createT_Ul_Curso(
			nombreCurso, fInicioCurso, fFinCurso, colorCurso, T_Ul_Califi_id,
			T_Ul_Profesor_id, serviceContext);
	}

	@Override
	public com.aula.sb.model.T_Ul_Curso deleteT_Ul_Curso(long idCurso)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_CursoService.deleteT_Ul_Curso(idCurso);
	}

	@Override
	public java.util.List<com.aula.sb.model.T_Ul_Curso> getAllT_Ul_Cursos() {
		return _t_Ul_CursoService.getAllT_Ul_Cursos();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _t_Ul_CursoService.getOSGiServiceIdentifier();
	}

	@Override
	public com.aula.sb.model.T_Ul_Curso getT_Ul_Curso(long idCurso)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_CursoService.getT_Ul_Curso(idCurso);
	}

	@Override
	public java.util.List<com.aula.sb.model.T_Ul_Curso> getT_Ul_CursoByName(
		String nombreCurso) {

		return _t_Ul_CursoService.getT_Ul_CursoByName(nombreCurso);
	}

	@Override
	public com.aula.sb.model.T_Ul_Curso updateT_Ul_Curso(
			long idCurso, String nombreCurso, String fInicioCurso,
			String fFinCurso, String colorCurso, Long T_Ul_Califi_id,
			Long T_Ul_Profesor_id,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_CursoService.updateT_Ul_Curso(
			idCurso, nombreCurso, fInicioCurso, fFinCurso, colorCurso,
			T_Ul_Califi_id, T_Ul_Profesor_id, serviceContext);
	}

	@Override
	public T_Ul_CursoService getWrappedService() {
		return _t_Ul_CursoService;
	}

	@Override
	public void setWrappedService(T_Ul_CursoService t_Ul_CursoService) {
		_t_Ul_CursoService = t_Ul_CursoService;
	}

	private T_Ul_CursoService _t_Ul_CursoService;

}
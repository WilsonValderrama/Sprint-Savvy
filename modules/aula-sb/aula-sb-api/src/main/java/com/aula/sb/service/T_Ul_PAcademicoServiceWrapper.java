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
 * Provides a wrapper for {@link T_Ul_PAcademicoService}.
 *
 * @author Brian Wing Shun Chan
 * @see T_Ul_PAcademicoService
 * @generated
 */
public class T_Ul_PAcademicoServiceWrapper
	implements ServiceWrapper<T_Ul_PAcademicoService>, T_Ul_PAcademicoService {

	public T_Ul_PAcademicoServiceWrapper(
		T_Ul_PAcademicoService t_Ul_PAcademicoService) {

		_t_Ul_PAcademicoService = t_Ul_PAcademicoService;
	}

	@Override
	public com.aula.sb.model.T_Ul_PAcademico createT_Ul_PAcademico(
			String tituloPeriodo, String fInicioPeriodo, String fFinPeriodo,
			String porcPeriodo, Long T_Ul_Curso_id,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_PAcademicoService.createT_Ul_PAcademico(
			tituloPeriodo, fInicioPeriodo, fFinPeriodo, porcPeriodo,
			T_Ul_Curso_id, serviceContext);
	}

	@Override
	public com.aula.sb.model.T_Ul_PAcademico deleteT_Ul_PAcademico(
			long idPeriodo)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_PAcademicoService.deleteT_Ul_PAcademico(idPeriodo);
	}

	@Override
	public java.util.List<com.aula.sb.model.T_Ul_PAcademico>
		getAllT_Ul_PAcademicos() {

		return _t_Ul_PAcademicoService.getAllT_Ul_PAcademicos();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _t_Ul_PAcademicoService.getOSGiServiceIdentifier();
	}

	@Override
	public com.aula.sb.model.T_Ul_PAcademico getT_Ul_PAcademico(long idPeriodo)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_PAcademicoService.getT_Ul_PAcademico(idPeriodo);
	}

	@Override
	public java.util.List<com.aula.sb.model.T_Ul_PAcademico>
		getT_Ul_PAcademicoByName(String tituloPeriodo) {

		return _t_Ul_PAcademicoService.getT_Ul_PAcademicoByName(tituloPeriodo);
	}

	@Override
	public com.aula.sb.model.T_Ul_PAcademico updateT_Ul_PAcademico(
			long idPeriodo, String tituloPeriodo, String fInicioPeriodo,
			String fFinPeriodo, String porcPeriodo, Long T_Ul_Curso_id,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_PAcademicoService.updateT_Ul_PAcademico(
			idPeriodo, tituloPeriodo, fInicioPeriodo, fFinPeriodo, porcPeriodo,
			T_Ul_Curso_id, serviceContext);
	}

	@Override
	public T_Ul_PAcademicoService getWrappedService() {
		return _t_Ul_PAcademicoService;
	}

	@Override
	public void setWrappedService(
		T_Ul_PAcademicoService t_Ul_PAcademicoService) {

		_t_Ul_PAcademicoService = t_Ul_PAcademicoService;
	}

	private T_Ul_PAcademicoService _t_Ul_PAcademicoService;

}
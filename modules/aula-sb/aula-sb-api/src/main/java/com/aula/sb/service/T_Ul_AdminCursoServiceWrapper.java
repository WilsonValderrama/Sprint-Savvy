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
 * Provides a wrapper for {@link T_Ul_AdminCursoService}.
 *
 * @author Brian Wing Shun Chan
 * @see T_Ul_AdminCursoService
 * @generated
 */
public class T_Ul_AdminCursoServiceWrapper
	implements ServiceWrapper<T_Ul_AdminCursoService>, T_Ul_AdminCursoService {

	public T_Ul_AdminCursoServiceWrapper(
		T_Ul_AdminCursoService t_Ul_AdminCursoService) {

		_t_Ul_AdminCursoService = t_Ul_AdminCursoService;
	}

	@Override
	public com.aula.sb.model.T_Ul_AdminCurso createAdminCurso(
			long cursoId, long adminId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_AdminCursoService.createAdminCurso(
			cursoId, adminId, serviceContext);
	}

	@Override
	public void deleteAdminCurso(long cursoId, long adminId)
		throws com.liferay.portal.kernel.exception.PortalException {

		_t_Ul_AdminCursoService.deleteAdminCurso(cursoId, adminId);
	}

	@Override
	public java.util.List<com.aula.sb.model.T_Ul_AdminCurso> getAll() {
		return _t_Ul_AdminCursoService.getAll();
	}

	@Override
	public java.util.List<com.aula.sb.model.T_Ul_AdminCurso> getAnminByCursoId(
		long cursoId) {

		return _t_Ul_AdminCursoService.getAnminByCursoId(cursoId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _t_Ul_AdminCursoService.getOSGiServiceIdentifier();
	}

	@Override
	public T_Ul_AdminCursoService getWrappedService() {
		return _t_Ul_AdminCursoService;
	}

	@Override
	public void setWrappedService(
		T_Ul_AdminCursoService t_Ul_AdminCursoService) {

		_t_Ul_AdminCursoService = t_Ul_AdminCursoService;
	}

	private T_Ul_AdminCursoService _t_Ul_AdminCursoService;

}
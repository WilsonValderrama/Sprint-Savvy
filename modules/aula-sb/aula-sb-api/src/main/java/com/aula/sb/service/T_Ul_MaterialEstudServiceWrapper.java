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
 * Provides a wrapper for {@link T_Ul_MaterialEstudService}.
 *
 * @author Brian Wing Shun Chan
 * @see T_Ul_MaterialEstudService
 * @generated
 */
public class T_Ul_MaterialEstudServiceWrapper
	implements ServiceWrapper<T_Ul_MaterialEstudService>,
			   T_Ul_MaterialEstudService {

	public T_Ul_MaterialEstudServiceWrapper(
		T_Ul_MaterialEstudService t_Ul_MaterialEstudService) {

		_t_Ul_MaterialEstudService = t_Ul_MaterialEstudService;
	}

	@Override
	public com.aula.sb.model.T_Ul_MaterialEstud createMaterialEstudio(
			String tituloMaterial, String fCreacionMaterial,
			String urlArchMaterial, String descripMaterial,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_MaterialEstudService.createMaterialEstudio(
			tituloMaterial, fCreacionMaterial, urlArchMaterial, descripMaterial,
			serviceContext);
	}

	@Override
	public com.aula.sb.model.T_Ul_MaterialEstud deleteT_Ul_MaterialEstud(
			long idMaterial)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_MaterialEstudService.deleteT_Ul_MaterialEstud(idMaterial);
	}

	@Override
	public java.util.List<com.aula.sb.model.T_Ul_MaterialEstud>
		getAllT_Ul_MaterialEstud() {

		return _t_Ul_MaterialEstudService.getAllT_Ul_MaterialEstud();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _t_Ul_MaterialEstudService.getOSGiServiceIdentifier();
	}

	@Override
	public com.aula.sb.model.T_Ul_MaterialEstud getT_Ul_MaterialEstud(
			long idMaterial)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_MaterialEstudService.getT_Ul_MaterialEstud(idMaterial);
	}

	@Override
	public java.util.List<com.aula.sb.model.T_Ul_MaterialEstud>
		getT_Ul_MaterialEstudByName(String tituloMaterial) {

		return _t_Ul_MaterialEstudService.getT_Ul_MaterialEstudByName(
			tituloMaterial);
	}

	@Override
	public com.aula.sb.model.T_Ul_MaterialEstud updateT_Ul_MaterialEstud(
			long idMaterial, String tituloMaterial, String fCreacionMaterial,
			String urlArchMaterial, String descripMaterial,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_MaterialEstudService.updateT_Ul_MaterialEstud(
			idMaterial, tituloMaterial, fCreacionMaterial, urlArchMaterial,
			descripMaterial, serviceContext);
	}

	@Override
	public T_Ul_MaterialEstudService getWrappedService() {
		return _t_Ul_MaterialEstudService;
	}

	@Override
	public void setWrappedService(
		T_Ul_MaterialEstudService t_Ul_MaterialEstudService) {

		_t_Ul_MaterialEstudService = t_Ul_MaterialEstudService;
	}

	private T_Ul_MaterialEstudService _t_Ul_MaterialEstudService;

}
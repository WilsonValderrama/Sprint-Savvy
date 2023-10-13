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

package com.savvy.sb.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EtiquetaService}.
 *
 * @author Brian Wing Shun Chan
 * @see EtiquetaService
 * @generated
 */
public class EtiquetaServiceWrapper
	implements EtiquetaService, ServiceWrapper<EtiquetaService> {

	public EtiquetaServiceWrapper(EtiquetaService etiquetaService) {
		_etiquetaService = etiquetaService;
	}

	@Override
	public com.savvy.sb.model.Etiqueta actualizarEtiqueta(
			long etiquetaId, String tituloEtiqueta,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _etiquetaService.actualizarEtiqueta(
			etiquetaId, tituloEtiqueta, serviceContext);
	}

	@Override
	public com.savvy.sb.model.Etiqueta crearEtiqueta(
			String tituloEtiqueta,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _etiquetaService.crearEtiqueta(tituloEtiqueta, serviceContext);
	}

	@Override
	public com.savvy.sb.model.Etiqueta eliminarEtiqueta(long etiquetaId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _etiquetaService.eliminarEtiqueta(etiquetaId);
	}

	@Override
	public java.util.List<com.savvy.sb.model.Etiqueta> getAllEtiqueta() {
		return _etiquetaService.getAllEtiqueta();
	}

	@Override
	public com.savvy.sb.model.Etiqueta getEtiqueta(long etiquetaId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _etiquetaService.getEtiqueta(etiquetaId);
	}

	@Override
	public java.util.List<com.savvy.sb.model.Etiqueta> getEtiquetaByNombre(
		String tituloEtiqueta) {

		return _etiquetaService.getEtiquetaByNombre(tituloEtiqueta);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _etiquetaService.getOSGiServiceIdentifier();
	}

	@Override
	public EtiquetaService getWrappedService() {
		return _etiquetaService;
	}

	@Override
	public void setWrappedService(EtiquetaService etiquetaService) {
		_etiquetaService = etiquetaService;
	}

	private EtiquetaService _etiquetaService;

}
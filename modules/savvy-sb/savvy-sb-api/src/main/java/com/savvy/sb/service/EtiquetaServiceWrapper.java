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
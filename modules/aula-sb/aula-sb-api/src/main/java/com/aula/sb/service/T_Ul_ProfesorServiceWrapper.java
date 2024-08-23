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
 * Provides a wrapper for {@link T_Ul_ProfesorService}.
 *
 * @author Brian Wing Shun Chan
 * @see T_Ul_ProfesorService
 * @generated
 */
public class T_Ul_ProfesorServiceWrapper
	implements ServiceWrapper<T_Ul_ProfesorService>, T_Ul_ProfesorService {

	public T_Ul_ProfesorServiceWrapper(
		T_Ul_ProfesorService t_Ul_ProfesorService) {

		_t_Ul_ProfesorService = t_Ul_ProfesorService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _t_Ul_ProfesorService.getOSGiServiceIdentifier();
	}

	@Override
	public T_Ul_ProfesorService getWrappedService() {
		return _t_Ul_ProfesorService;
	}

	@Override
	public void setWrappedService(T_Ul_ProfesorService t_Ul_ProfesorService) {
		_t_Ul_ProfesorService = t_Ul_ProfesorService;
	}

	private T_Ul_ProfesorService _t_Ul_ProfesorService;

}
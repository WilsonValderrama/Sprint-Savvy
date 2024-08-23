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
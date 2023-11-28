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

import com.liferay.portal.kernel.exception.PortalException;

import com.savvy.sb.model.Sprint;

import java.util.List;

/**
 * Provides the remote service utility for Sprint. This utility wraps
 * <code>com.savvy.sb.service.impl.SprintServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see SprintService
 * @generated
 */
public class SprintServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.savvy.sb.service.impl.SprintServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static Sprint createSprint(
			String tituloSprint, String fechaInicio, String fechaFinal,
			String descripcion, String estado, String proyecto,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().createSprint(
			tituloSprint, fechaInicio, fechaFinal, descripcion, estado,
			proyecto, serviceContext);
	}

	public static Sprint deleteSprint(long sprintId) throws PortalException {
		return getService().deleteSprint(sprintId);
	}

	public static List<Sprint> getAllSprints() {
		return getService().getAllSprints();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static List<Sprint> getSprintByNombre(String tituloSprint) {
		return getService().getSprintByNombre(tituloSprint);
	}

	public static Sprint updateSprint(
			long sprintId, String tituloSprint, String fechaInicio,
			String fechaFinal, String descripcion, String estado,
			String proyecto,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().updateSprint(
			sprintId, tituloSprint, fechaInicio, fechaFinal, descripcion,
			estado, proyecto, serviceContext);
	}

	public static SprintService getService() {
		return _service;
	}

	private static volatile SprintService _service;

}
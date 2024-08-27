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

import com.aula.sb.model.T_Ul_AdminCurso;

import com.liferay.portal.kernel.exception.PortalException;

import java.util.List;

/**
 * Provides the remote service utility for T_Ul_AdminCurso. This utility wraps
 * <code>com.aula.sb.service.impl.T_Ul_AdminCursoServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see T_Ul_AdminCursoService
 * @generated
 */
public class T_Ul_AdminCursoServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.aula.sb.service.impl.T_Ul_AdminCursoServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static T_Ul_AdminCurso createAdminCurso(
			long cursoId, long adminId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().createAdminCurso(cursoId, adminId, serviceContext);
	}

	public static void deleteAdminCurso(long cursoId, long adminId)
		throws PortalException {

		getService().deleteAdminCurso(cursoId, adminId);
	}

	public static List<T_Ul_AdminCurso> getAll() {
		return getService().getAll();
	}

	public static List<T_Ul_AdminCurso> getAnminByCursoId(long cursoId) {
		return getService().getAnminByCursoId(cursoId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static T_Ul_AdminCursoService getService() {
		return _service;
	}

	private static volatile T_Ul_AdminCursoService _service;

}
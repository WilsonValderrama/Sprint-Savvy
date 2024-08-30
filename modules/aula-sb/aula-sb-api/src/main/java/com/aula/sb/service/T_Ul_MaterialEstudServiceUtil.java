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

import com.aula.sb.model.T_Ul_MaterialEstud;

import com.liferay.portal.kernel.exception.PortalException;

import java.util.List;

/**
 * Provides the remote service utility for T_Ul_MaterialEstud. This utility wraps
 * <code>com.aula.sb.service.impl.T_Ul_MaterialEstudServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see T_Ul_MaterialEstudService
 * @generated
 */
public class T_Ul_MaterialEstudServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.aula.sb.service.impl.T_Ul_MaterialEstudServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static T_Ul_MaterialEstud createMaterialEstudio(
			String tituloMaterial, String fCreacionMaterial,
			String urlArchMaterial, String descripMaterial,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().createMaterialEstudio(
			tituloMaterial, fCreacionMaterial, urlArchMaterial, descripMaterial,
			serviceContext);
	}

	public static T_Ul_MaterialEstud deleteT_Ul_MaterialEstud(long idMaterial)
		throws PortalException {

		return getService().deleteT_Ul_MaterialEstud(idMaterial);
	}

	public static List<T_Ul_MaterialEstud> getAllT_Ul_MaterialEstud() {
		return getService().getAllT_Ul_MaterialEstud();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static T_Ul_MaterialEstud getT_Ul_MaterialEstud(long idMaterial)
		throws PortalException {

		return getService().getT_Ul_MaterialEstud(idMaterial);
	}

	public static List<T_Ul_MaterialEstud> getT_Ul_MaterialEstudByName(
		String tituloMaterial) {

		return getService().getT_Ul_MaterialEstudByName(tituloMaterial);
	}

	public static T_Ul_MaterialEstud updateT_Ul_MaterialEstud(
			long idMaterial, String tituloMaterial, String fCreacionMaterial,
			String urlArchMaterial, String descripMaterial,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().updateT_Ul_MaterialEstud(
			idMaterial, tituloMaterial, fCreacionMaterial, urlArchMaterial,
			descripMaterial, serviceContext);
	}

	public static T_Ul_MaterialEstudService getService() {
		return _service;
	}

	private static volatile T_Ul_MaterialEstudService _service;

}
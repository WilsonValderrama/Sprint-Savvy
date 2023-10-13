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

import com.savvy.sb.model.Etiqueta;

import java.util.List;

/**
 * Provides the remote service utility for Etiqueta. This utility wraps
 * <code>com.savvy.sb.service.impl.EtiquetaServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see EtiquetaService
 * @generated
 */
public class EtiquetaServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.savvy.sb.service.impl.EtiquetaServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static Etiqueta actualizarEtiqueta(
			long etiquetaId, String tituloEtiqueta,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().actualizarEtiqueta(
			etiquetaId, tituloEtiqueta, serviceContext);
	}

	public static Etiqueta crearEtiqueta(
			String tituloEtiqueta,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().crearEtiqueta(tituloEtiqueta, serviceContext);
	}

	public static Etiqueta eliminarEtiqueta(long etiquetaId)
		throws PortalException {

		return getService().eliminarEtiqueta(etiquetaId);
	}

	public static List<Etiqueta> getAllEtiqueta() {
		return getService().getAllEtiqueta();
	}

	public static Etiqueta getEtiqueta(long etiquetaId) throws PortalException {
		return getService().getEtiqueta(etiquetaId);
	}

	public static List<Etiqueta> getEtiquetaByNombre(String tituloEtiqueta) {
		return getService().getEtiquetaByNombre(tituloEtiqueta);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static EtiquetaService getService() {
		return _service;
	}

	private static volatile EtiquetaService _service;

}
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

import com.aula.sb.model.T_Ul_Curso;

import com.liferay.portal.kernel.exception.PortalException;

import java.util.List;

/**
 * Provides the remote service utility for T_Ul_Curso. This utility wraps
 * <code>com.aula.sb.service.impl.T_Ul_CursoServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see T_Ul_CursoService
 * @generated
 */
public class T_Ul_CursoServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.aula.sb.service.impl.T_Ul_CursoServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static T_Ul_Curso createT_Ul_Curso(
			String nombreCurso, String fInicioCurso, String fFinCurso,
			String colorCurso, Long T_Ul_Califi_id, Long T_Ul_Profesor_id,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().createT_Ul_Curso(
			nombreCurso, fInicioCurso, fFinCurso, colorCurso, T_Ul_Califi_id,
			T_Ul_Profesor_id, serviceContext);
	}

	public static T_Ul_Curso deleteT_Ul_Curso(long idCurso)
		throws PortalException {

		return getService().deleteT_Ul_Curso(idCurso);
	}

	public static List<T_Ul_Curso> getAllT_Ul_Cursos() {
		return getService().getAllT_Ul_Cursos();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static T_Ul_Curso getT_Ul_Curso(long idCurso)
		throws PortalException {

		return getService().getT_Ul_Curso(idCurso);
	}

	public static List<T_Ul_Curso> getT_Ul_CursoByName(String nombreCurso) {
		return getService().getT_Ul_CursoByName(nombreCurso);
	}

	public static T_Ul_Curso updateT_Ul_Curso(
			long idCurso, String nombreCurso, String fInicioCurso,
			String fFinCurso, String colorCurso, Long T_Ul_Califi_id,
			Long T_Ul_Profesor_id,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().updateT_Ul_Curso(
			idCurso, nombreCurso, fInicioCurso, fFinCurso, colorCurso,
			T_Ul_Califi_id, T_Ul_Profesor_id, serviceContext);
	}

	public static T_Ul_CursoService getService() {
		return _service;
	}

	private static volatile T_Ul_CursoService _service;

}
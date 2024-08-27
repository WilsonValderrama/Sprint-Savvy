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

package com.aula.sb.service.http;

import com.aula.sb.service.T_Ul_Estud_CursoServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * <code>T_Ul_Estud_CursoServiceUtil</code> service
 * utility. The static methods of this class call the same methods of the
 * service utility. However, the signatures are different because it is
 * difficult for SOAP to support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a <code>java.util.List</code>,
 * that is translated to an array of
 * <code>com.aula.sb.model.T_Ul_Estud_CursoSoap</code>. If the method in the
 * service utility returns a
 * <code>com.aula.sb.model.T_Ul_Estud_Curso</code>, that is translated to a
 * <code>com.aula.sb.model.T_Ul_Estud_CursoSoap</code>. Methods that SOAP
 * cannot safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see T_Ul_Estud_CursoServiceHttp
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class T_Ul_Estud_CursoServiceSoap {

	public static com.aula.sb.model.T_Ul_Estud_CursoSoap createEstudCurso(
			long cursoId, long estudianteId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {

		try {
			com.aula.sb.model.T_Ul_Estud_Curso returnValue =
				T_Ul_Estud_CursoServiceUtil.createEstudCurso(
					cursoId, estudianteId, serviceContext);

			return com.aula.sb.model.T_Ul_Estud_CursoSoap.toSoapModel(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static void deleteEstudCurso(long cursoId, long estudianteId)
		throws RemoteException {

		try {
			T_Ul_Estud_CursoServiceUtil.deleteEstudCurso(cursoId, estudianteId);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.aula.sb.model.T_Ul_Estud_CursoSoap[] getAll()
		throws RemoteException {

		try {
			java.util.List<com.aula.sb.model.T_Ul_Estud_Curso> returnValue =
				T_Ul_Estud_CursoServiceUtil.getAll();

			return com.aula.sb.model.T_Ul_Estud_CursoSoap.toSoapModels(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.aula.sb.model.T_Ul_Estud_CursoSoap[]
			getCursosByEstudianteId(long estudianteId)
		throws RemoteException {

		try {
			java.util.List<com.aula.sb.model.T_Ul_Estud_Curso> returnValue =
				T_Ul_Estud_CursoServiceUtil.getCursosByEstudianteId(
					estudianteId);

			return com.aula.sb.model.T_Ul_Estud_CursoSoap.toSoapModels(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.aula.sb.model.T_Ul_Estud_CursoSoap[]
			getEstudiantesByCursoId(long cursoId)
		throws RemoteException {

		try {
			java.util.List<com.aula.sb.model.T_Ul_Estud_Curso> returnValue =
				T_Ul_Estud_CursoServiceUtil.getEstudiantesByCursoId(cursoId);

			return com.aula.sb.model.T_Ul_Estud_CursoSoap.toSoapModels(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		T_Ul_Estud_CursoServiceSoap.class);

}
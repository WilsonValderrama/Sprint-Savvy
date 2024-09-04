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

import com.aula.sb.service.T_Ul_PAcademicoServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * <code>T_Ul_PAcademicoServiceUtil</code> service
 * utility. The static methods of this class call the same methods of the
 * service utility. However, the signatures are different because it is
 * difficult for SOAP to support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a <code>java.util.List</code>,
 * that is translated to an array of
 * <code>com.aula.sb.model.T_Ul_PAcademicoSoap</code>. If the method in the
 * service utility returns a
 * <code>com.aula.sb.model.T_Ul_PAcademico</code>, that is translated to a
 * <code>com.aula.sb.model.T_Ul_PAcademicoSoap</code>. Methods that SOAP
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
 * @see T_Ul_PAcademicoServiceHttp
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class T_Ul_PAcademicoServiceSoap {

	public static com.aula.sb.model.T_Ul_PAcademicoSoap createT_Ul_PAcademico(
			String tituloPeriodo, String fInicioPeriodo, String fFinPeriodo,
			String porcPeriodo, Long T_Ul_Curso_id,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {

		try {
			com.aula.sb.model.T_Ul_PAcademico returnValue =
				T_Ul_PAcademicoServiceUtil.createT_Ul_PAcademico(
					tituloPeriodo, fInicioPeriodo, fFinPeriodo, porcPeriodo,
					T_Ul_Curso_id, serviceContext);

			return com.aula.sb.model.T_Ul_PAcademicoSoap.toSoapModel(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.aula.sb.model.T_Ul_PAcademicoSoap updateT_Ul_PAcademico(
			long idPeriodo, String tituloPeriodo, String fInicioPeriodo,
			String fFinPeriodo, String porcPeriodo, Long T_Ul_Curso_id,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {

		try {
			com.aula.sb.model.T_Ul_PAcademico returnValue =
				T_Ul_PAcademicoServiceUtil.updateT_Ul_PAcademico(
					idPeriodo, tituloPeriodo, fInicioPeriodo, fFinPeriodo,
					porcPeriodo, T_Ul_Curso_id, serviceContext);

			return com.aula.sb.model.T_Ul_PAcademicoSoap.toSoapModel(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.aula.sb.model.T_Ul_PAcademicoSoap deleteT_Ul_PAcademico(
			long idPeriodo)
		throws RemoteException {

		try {
			com.aula.sb.model.T_Ul_PAcademico returnValue =
				T_Ul_PAcademicoServiceUtil.deleteT_Ul_PAcademico(idPeriodo);

			return com.aula.sb.model.T_Ul_PAcademicoSoap.toSoapModel(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.aula.sb.model.T_Ul_PAcademicoSoap getT_Ul_PAcademico(
			long idPeriodo)
		throws RemoteException {

		try {
			com.aula.sb.model.T_Ul_PAcademico returnValue =
				T_Ul_PAcademicoServiceUtil.getT_Ul_PAcademico(idPeriodo);

			return com.aula.sb.model.T_Ul_PAcademicoSoap.toSoapModel(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.aula.sb.model.T_Ul_PAcademicoSoap[]
			getT_Ul_PAcademicoByName(String tituloPeriodo)
		throws RemoteException {

		try {
			java.util.List<com.aula.sb.model.T_Ul_PAcademico> returnValue =
				T_Ul_PAcademicoServiceUtil.getT_Ul_PAcademicoByName(
					tituloPeriodo);

			return com.aula.sb.model.T_Ul_PAcademicoSoap.toSoapModels(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.aula.sb.model.T_Ul_PAcademicoSoap[]
			getAllT_Ul_PAcademicos()
		throws RemoteException {

		try {
			java.util.List<com.aula.sb.model.T_Ul_PAcademico> returnValue =
				T_Ul_PAcademicoServiceUtil.getAllT_Ul_PAcademicos();

			return com.aula.sb.model.T_Ul_PAcademicoSoap.toSoapModels(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		T_Ul_PAcademicoServiceSoap.class);

}
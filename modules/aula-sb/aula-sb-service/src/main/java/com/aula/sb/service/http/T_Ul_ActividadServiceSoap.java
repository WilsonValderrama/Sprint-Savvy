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

import com.aula.sb.service.T_Ul_ActividadServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * <code>T_Ul_ActividadServiceUtil</code> service
 * utility. The static methods of this class call the same methods of the
 * service utility. However, the signatures are different because it is
 * difficult for SOAP to support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a <code>java.util.List</code>,
 * that is translated to an array of
 * <code>com.aula.sb.model.T_Ul_ActividadSoap</code>. If the method in the
 * service utility returns a
 * <code>com.aula.sb.model.T_Ul_Actividad</code>, that is translated to a
 * <code>com.aula.sb.model.T_Ul_ActividadSoap</code>. Methods that SOAP
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
 * @see T_Ul_ActividadServiceHttp
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class T_Ul_ActividadServiceSoap {

	public static com.aula.sb.model.T_Ul_ActividadSoap createT_Ul_Actividad(
			String tituloActividad, String tipoActividad,
			String descriActividad, String estadoEntrActividad,
			String fCreacActividad, String fCierrActividad,
			String porcActividad,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {

		try {
			com.aula.sb.model.T_Ul_Actividad returnValue =
				T_Ul_ActividadServiceUtil.createT_Ul_Actividad(
					tituloActividad, tipoActividad, descriActividad,
					estadoEntrActividad, fCreacActividad, fCierrActividad,
					porcActividad, serviceContext);

			return com.aula.sb.model.T_Ul_ActividadSoap.toSoapModel(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.aula.sb.model.T_Ul_ActividadSoap updateT_Ul_Actividad(
			long idActividad, String tituloActividad, String tipoActividad,
			String descriActividad, String estadoEntrActividad,
			String fCreacActividad, String fCierrActividad,
			String porcActividad,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {

		try {
			com.aula.sb.model.T_Ul_Actividad returnValue =
				T_Ul_ActividadServiceUtil.updateT_Ul_Actividad(
					idActividad, tituloActividad, tipoActividad,
					descriActividad, estadoEntrActividad, fCreacActividad,
					fCierrActividad, porcActividad, serviceContext);

			return com.aula.sb.model.T_Ul_ActividadSoap.toSoapModel(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.aula.sb.model.T_Ul_ActividadSoap deleteT_Ul_Actividad(
			long idActividad)
		throws RemoteException {

		try {
			com.aula.sb.model.T_Ul_Actividad returnValue =
				T_Ul_ActividadServiceUtil.deleteT_Ul_Actividad(idActividad);

			return com.aula.sb.model.T_Ul_ActividadSoap.toSoapModel(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.aula.sb.model.T_Ul_ActividadSoap getT_Ul_Actividad(
			long idActividad)
		throws RemoteException {

		try {
			com.aula.sb.model.T_Ul_Actividad returnValue =
				T_Ul_ActividadServiceUtil.getT_Ul_Actividad(idActividad);

			return com.aula.sb.model.T_Ul_ActividadSoap.toSoapModel(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.aula.sb.model.T_Ul_ActividadSoap[]
			getT_Ul_ActividadByTitulo(String tituloActividad)
		throws RemoteException {

		try {
			java.util.List<com.aula.sb.model.T_Ul_Actividad> returnValue =
				T_Ul_ActividadServiceUtil.getT_Ul_ActividadByTitulo(
					tituloActividad);

			return com.aula.sb.model.T_Ul_ActividadSoap.toSoapModels(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.aula.sb.model.T_Ul_ActividadSoap[] getAllT_Ul_Actividad()
		throws RemoteException {

		try {
			java.util.List<com.aula.sb.model.T_Ul_Actividad> returnValue =
				T_Ul_ActividadServiceUtil.getAllT_Ul_Actividad();

			return com.aula.sb.model.T_Ul_ActividadSoap.toSoapModels(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		T_Ul_ActividadServiceSoap.class);

}
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

import com.aula.sb.service.T_Ul_PrgEvaluacionServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * <code>T_Ul_PrgEvaluacionServiceUtil</code> service
 * utility. The static methods of this class call the same methods of the
 * service utility. However, the signatures are different because it is
 * difficult for SOAP to support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a <code>java.util.List</code>,
 * that is translated to an array of
 * <code>com.aula.sb.model.T_Ul_PrgEvaluacionSoap</code>. If the method in the
 * service utility returns a
 * <code>com.aula.sb.model.T_Ul_PrgEvaluacion</code>, that is translated to a
 * <code>com.aula.sb.model.T_Ul_PrgEvaluacionSoap</code>. Methods that SOAP
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
 * @see T_Ul_PrgEvaluacionServiceHttp
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class T_Ul_PrgEvaluacionServiceSoap {

	public static com.aula.sb.model.T_Ul_PrgEvaluacionSoap
			createT_Ul_PrgEvaluacion(
				String problPreguntas, String opcPreguntas,
				String puntajePreguntas, String intentoPreguntas,
				String limiteTPreguntas, Long T_Ul_Actividad_id,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {

		try {
			com.aula.sb.model.T_Ul_PrgEvaluacion returnValue =
				T_Ul_PrgEvaluacionServiceUtil.createT_Ul_PrgEvaluacion(
					problPreguntas, opcPreguntas, puntajePreguntas,
					intentoPreguntas, limiteTPreguntas, T_Ul_Actividad_id,
					serviceContext);

			return com.aula.sb.model.T_Ul_PrgEvaluacionSoap.toSoapModel(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.aula.sb.model.T_Ul_PrgEvaluacionSoap
			updateT_Ul_PrgEvaluacion(
				Long idPreguntas, String problPreguntas, String opcPreguntas,
				String puntajePreguntas, String intentoPreguntas,
				String limiteTPreguntas, Long T_Ul_Actividad_id,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {

		try {
			com.aula.sb.model.T_Ul_PrgEvaluacion returnValue =
				T_Ul_PrgEvaluacionServiceUtil.updateT_Ul_PrgEvaluacion(
					idPreguntas, problPreguntas, opcPreguntas, puntajePreguntas,
					intentoPreguntas, limiteTPreguntas, T_Ul_Actividad_id,
					serviceContext);

			return com.aula.sb.model.T_Ul_PrgEvaluacionSoap.toSoapModel(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.aula.sb.model.T_Ul_PrgEvaluacionSoap
			deleteT_Ul_PrgEvaluacion(long idPreguntas)
		throws RemoteException {

		try {
			com.aula.sb.model.T_Ul_PrgEvaluacion returnValue =
				T_Ul_PrgEvaluacionServiceUtil.deleteT_Ul_PrgEvaluacion(
					idPreguntas);

			return com.aula.sb.model.T_Ul_PrgEvaluacionSoap.toSoapModel(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.aula.sb.model.T_Ul_PrgEvaluacionSoap
			getT_Ul_PrgEvaluacion(long idPreguntas)
		throws RemoteException {

		try {
			com.aula.sb.model.T_Ul_PrgEvaluacion returnValue =
				T_Ul_PrgEvaluacionServiceUtil.getT_Ul_PrgEvaluacion(
					idPreguntas);

			return com.aula.sb.model.T_Ul_PrgEvaluacionSoap.toSoapModel(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.aula.sb.model.T_Ul_PrgEvaluacionSoap[]
			getAllT_Ul_PrgEvaluaciones()
		throws RemoteException {

		try {
			java.util.List<com.aula.sb.model.T_Ul_PrgEvaluacion> returnValue =
				T_Ul_PrgEvaluacionServiceUtil.getAllT_Ul_PrgEvaluaciones();

			return com.aula.sb.model.T_Ul_PrgEvaluacionSoap.toSoapModels(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		T_Ul_PrgEvaluacionServiceSoap.class);

}
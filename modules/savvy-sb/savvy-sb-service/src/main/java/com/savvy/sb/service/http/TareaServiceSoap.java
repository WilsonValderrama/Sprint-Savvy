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

package com.savvy.sb.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import com.savvy.sb.service.TareaServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * <code>TareaServiceUtil</code> service
 * utility. The static methods of this class call the same methods of the
 * service utility. However, the signatures are different because it is
 * difficult for SOAP to support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a <code>java.util.List</code>,
 * that is translated to an array of
 * <code>com.savvy.sb.model.TareaSoap</code>. If the method in the
 * service utility returns a
 * <code>com.savvy.sb.model.Tarea</code>, that is translated to a
 * <code>com.savvy.sb.model.TareaSoap</code>. Methods that SOAP
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
 * @see TareaServiceHttp
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class TareaServiceSoap {

	public static com.savvy.sb.model.TareaSoap createTarea(
			String nombreTarea, String proyecto, String responsable,
			String prioridad, String sprint, String estado, String fechaLimite,
			String resumen, String descripcion, String categoria,
			String etiqueta,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {

		try {
			com.savvy.sb.model.Tarea returnValue = TareaServiceUtil.createTarea(
				nombreTarea, proyecto, responsable, prioridad, sprint, estado,
				fechaLimite, resumen, descripcion, categoria, etiqueta,
				serviceContext);

			return com.savvy.sb.model.TareaSoap.toSoapModel(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.savvy.sb.model.TareaSoap updateTarea(
			long tareaId, String nombreTarea, String proyecto,
			String responsable, String prioridad, String sprint, String estado,
			String fechaLimite, String resumen, String descripcion,
			String categoria, String etiqueta,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {

		try {
			com.savvy.sb.model.Tarea returnValue = TareaServiceUtil.updateTarea(
				tareaId, nombreTarea, proyecto, responsable, prioridad, sprint,
				estado, fechaLimite, resumen, descripcion, categoria, etiqueta,
				serviceContext);

			return com.savvy.sb.model.TareaSoap.toSoapModel(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.savvy.sb.model.TareaSoap deleteTarea(long tareaId)
		throws RemoteException {

		try {
			com.savvy.sb.model.Tarea returnValue = TareaServiceUtil.deleteTarea(
				tareaId);

			return com.savvy.sb.model.TareaSoap.toSoapModel(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.savvy.sb.model.TareaSoap[] getAllTareas()
		throws RemoteException {

		try {
			java.util.List<com.savvy.sb.model.Tarea> returnValue =
				TareaServiceUtil.getAllTareas();

			return com.savvy.sb.model.TareaSoap.toSoapModels(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.savvy.sb.model.TareaSoap[] getTareaByNombre(
			String nombreTarea)
		throws RemoteException {

		try {
			java.util.List<com.savvy.sb.model.Tarea> returnValue =
				TareaServiceUtil.getTareaByNombre(nombreTarea);

			return com.savvy.sb.model.TareaSoap.toSoapModels(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(TareaServiceSoap.class);

}
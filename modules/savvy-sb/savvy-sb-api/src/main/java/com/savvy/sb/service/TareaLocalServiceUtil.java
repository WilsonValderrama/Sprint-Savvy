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

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.savvy.sb.model.Tarea;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for Tarea. This utility wraps
 * <code>com.savvy.sb.service.impl.TareaLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see TareaLocalService
 * @generated
 */
public class TareaLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.savvy.sb.service.impl.TareaLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the tarea to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TareaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tarea the tarea
	 * @return the tarea that was added
	 */
	public static Tarea addTarea(Tarea tarea) {
		return getService().addTarea(tarea);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new tarea with the primary key. Does not add the tarea to the database.
	 *
	 * @param tareaId the primary key for the new tarea
	 * @return the new tarea
	 */
	public static Tarea createTarea(long tareaId) {
		return getService().createTarea(tareaId);
	}

	public static Tarea createTarea(
			String nombreTarea, String proyecto, String responsable,
			String prioridad, String sprint, String estado, String fechaLimite,
			String resumen, String descripcion, String categoria,
			String etiqueta,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().createTarea(
			nombreTarea, proyecto, responsable, prioridad, sprint, estado,
			fechaLimite, resumen, descripcion, categoria, etiqueta,
			serviceContext);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the tarea with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TareaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tareaId the primary key of the tarea
	 * @return the tarea that was removed
	 * @throws PortalException if a tarea with the primary key could not be found
	 */
	public static Tarea deleteTarea(long tareaId) throws PortalException {
		return getService().deleteTarea(tareaId);
	}

	/**
	 * Deletes the tarea from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TareaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tarea the tarea
	 * @return the tarea that was removed
	 */
	public static Tarea deleteTarea(Tarea tarea) {
		return getService().deleteTarea(tarea);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.savvy.sb.model.impl.TareaModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.savvy.sb.model.impl.TareaModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static Tarea fetchTarea(long tareaId) {
		return getService().fetchTarea(tareaId);
	}

	/**
	 * Returns the tarea matching the UUID and group.
	 *
	 * @param uuid the tarea's UUID
	 * @param groupId the primary key of the group
	 * @return the matching tarea, or <code>null</code> if a matching tarea could not be found
	 */
	public static Tarea fetchTareaByUuidAndGroupId(String uuid, long groupId) {
		return getService().fetchTareaByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static List<Tarea> getAllTareas() {
		return getService().getAllTareas();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the tarea with the primary key.
	 *
	 * @param tareaId the primary key of the tarea
	 * @return the tarea
	 * @throws PortalException if a tarea with the primary key could not be found
	 */
	public static Tarea getTarea(long tareaId) throws PortalException {
		return getService().getTarea(tareaId);
	}

	public static List<Tarea> getTareaByNombre(String nombreTarea) {
		return getService().getTareaByNombre(nombreTarea);
	}

	/**
	 * Returns the tarea matching the UUID and group.
	 *
	 * @param uuid the tarea's UUID
	 * @param groupId the primary key of the group
	 * @return the matching tarea
	 * @throws PortalException if a matching tarea could not be found
	 */
	public static Tarea getTareaByUuidAndGroupId(String uuid, long groupId)
		throws PortalException {

		return getService().getTareaByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the tareas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.savvy.sb.model.impl.TareaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tareas
	 * @param end the upper bound of the range of tareas (not inclusive)
	 * @return the range of tareas
	 */
	public static List<Tarea> getTareas(int start, int end) {
		return getService().getTareas(start, end);
	}

	/**
	 * Returns all the tareas matching the UUID and company.
	 *
	 * @param uuid the UUID of the tareas
	 * @param companyId the primary key of the company
	 * @return the matching tareas, or an empty list if no matches were found
	 */
	public static List<Tarea> getTareasByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getTareasByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of tareas matching the UUID and company.
	 *
	 * @param uuid the UUID of the tareas
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of tareas
	 * @param end the upper bound of the range of tareas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching tareas, or an empty list if no matches were found
	 */
	public static List<Tarea> getTareasByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Tarea> orderByComparator) {

		return getService().getTareasByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of tareas.
	 *
	 * @return the number of tareas
	 */
	public static int getTareasCount() {
		return getService().getTareasCount();
	}

	public static Tarea updateTarea(
			long tareaId, String nombreTarea, String proyecto,
			String responsable, String prioridad, String sprint, String estado,
			String fechaLimite, String resumen, String descripcion,
			String categoria, String etiqueta,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().updateTarea(
			tareaId, nombreTarea, proyecto, responsable, prioridad, sprint,
			estado, fechaLimite, resumen, descripcion, categoria, etiqueta,
			serviceContext);
	}

	/**
	 * Updates the tarea in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TareaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tarea the tarea
	 * @return the tarea that was updated
	 */
	public static Tarea updateTarea(Tarea tarea) {
		return getService().updateTarea(tarea);
	}

	public static TareaLocalService getService() {
		return _service;
	}

	private static volatile TareaLocalService _service;

}
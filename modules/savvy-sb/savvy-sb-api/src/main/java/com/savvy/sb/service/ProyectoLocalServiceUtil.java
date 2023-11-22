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

import com.savvy.sb.model.Proyecto;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for Proyecto. This utility wraps
 * <code>com.savvy.sb.service.impl.ProyectoLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ProyectoLocalService
 * @generated
 */
public class ProyectoLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.savvy.sb.service.impl.ProyectoLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static Proyecto actualizarProyecto(
			long proyectoId, String tituloProyecto, String descripcion,
			String fechaInicio, String fechaFinal, String estado,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().actualizarProyecto(
			proyectoId, tituloProyecto, descripcion, fechaInicio, fechaFinal,
			estado, serviceContext);
	}

	/**
	 * Adds the proyecto to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ProyectoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param proyecto the proyecto
	 * @return the proyecto that was added
	 */
	public static Proyecto addProyecto(Proyecto proyecto) {
		return getService().addProyecto(proyecto);
	}

	public static Proyecto crearProyecto(
			String tituloProyecto, String descripcion, String fechaInicio,
			String fechaFinal, String estado,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().crearProyecto(
			tituloProyecto, descripcion, fechaInicio, fechaFinal, estado,
			serviceContext);
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
	 * Creates a new proyecto with the primary key. Does not add the proyecto to the database.
	 *
	 * @param proyectoId the primary key for the new proyecto
	 * @return the new proyecto
	 */
	public static Proyecto createProyecto(long proyectoId) {
		return getService().createProyecto(proyectoId);
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
	 * Deletes the proyecto with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ProyectoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param proyectoId the primary key of the proyecto
	 * @return the proyecto that was removed
	 * @throws PortalException if a proyecto with the primary key could not be found
	 */
	public static Proyecto deleteProyecto(long proyectoId)
		throws PortalException {

		return getService().deleteProyecto(proyectoId);
	}

	/**
	 * Deletes the proyecto from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ProyectoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param proyecto the proyecto
	 * @return the proyecto that was removed
	 */
	public static Proyecto deleteProyecto(Proyecto proyecto) {
		return getService().deleteProyecto(proyecto);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.savvy.sb.model.impl.ProyectoModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.savvy.sb.model.impl.ProyectoModelImpl</code>.
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

	public static Proyecto eliminarProyecto(long proyectoId)
		throws PortalException {

		return getService().eliminarProyecto(proyectoId);
	}

	public static Proyecto fetchProyecto(long proyectoId) {
		return getService().fetchProyecto(proyectoId);
	}

	/**
	 * Returns the proyecto matching the UUID and group.
	 *
	 * @param uuid the proyecto's UUID
	 * @param groupId the primary key of the group
	 * @return the matching proyecto, or <code>null</code> if a matching proyecto could not be found
	 */
	public static Proyecto fetchProyectoByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchProyectoByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static List<Proyecto> getAllProyectos() {
		return getService().getAllProyectos();
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
	 * Returns the proyecto with the primary key.
	 *
	 * @param proyectoId the primary key of the proyecto
	 * @return the proyecto
	 * @throws PortalException if a proyecto with the primary key could not be found
	 */
	public static Proyecto getProyecto(long proyectoId) throws PortalException {
		return getService().getProyecto(proyectoId);
	}

	public static List<Proyecto> getProyectoByNombre(String tituloProyecto) {
		return getService().getProyectoByNombre(tituloProyecto);
	}

	/**
	 * Returns the proyecto matching the UUID and group.
	 *
	 * @param uuid the proyecto's UUID
	 * @param groupId the primary key of the group
	 * @return the matching proyecto
	 * @throws PortalException if a matching proyecto could not be found
	 */
	public static Proyecto getProyectoByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getProyectoByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the proyectos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.savvy.sb.model.impl.ProyectoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of proyectos
	 * @param end the upper bound of the range of proyectos (not inclusive)
	 * @return the range of proyectos
	 */
	public static List<Proyecto> getProyectos(int start, int end) {
		return getService().getProyectos(start, end);
	}

	/**
	 * Returns all the proyectos matching the UUID and company.
	 *
	 * @param uuid the UUID of the proyectos
	 * @param companyId the primary key of the company
	 * @return the matching proyectos, or an empty list if no matches were found
	 */
	public static List<Proyecto> getProyectosByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getProyectosByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of proyectos matching the UUID and company.
	 *
	 * @param uuid the UUID of the proyectos
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of proyectos
	 * @param end the upper bound of the range of proyectos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching proyectos, or an empty list if no matches were found
	 */
	public static List<Proyecto> getProyectosByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Proyecto> orderByComparator) {

		return getService().getProyectosByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of proyectos.
	 *
	 * @return the number of proyectos
	 */
	public static int getProyectosCount() {
		return getService().getProyectosCount();
	}

	/**
	 * Updates the proyecto in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ProyectoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param proyecto the proyecto
	 * @return the proyecto that was updated
	 */
	public static Proyecto updateProyecto(Proyecto proyecto) {
		return getService().updateProyecto(proyecto);
	}

	public static ProyectoLocalService getService() {
		return _service;
	}

	private static volatile ProyectoLocalService _service;

}
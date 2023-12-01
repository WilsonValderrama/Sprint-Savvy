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

import com.savvy.sb.model.Sprint;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for Sprint. This utility wraps
 * <code>com.savvy.sb.service.impl.SprintLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see SprintLocalService
 * @generated
 */
public class SprintLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.savvy.sb.service.impl.SprintLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the sprint to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SprintLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sprint the sprint
	 * @return the sprint that was added
	 */
	public static Sprint addSprint(Sprint sprint) {
		return getService().addSprint(sprint);
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
	 * Creates a new sprint with the primary key. Does not add the sprint to the database.
	 *
	 * @param sprintId the primary key for the new sprint
	 * @return the new sprint
	 */
	public static Sprint createSprint(long sprintId) {
		return getService().createSprint(sprintId);
	}

	public static Sprint createSprint(
			String tituloSprint, String fechaInicio, String fechaFinal,
			String descripcion, String estado, String proyecto,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().createSprint(
			tituloSprint, fechaInicio, fechaFinal, descripcion, estado,
			proyecto, serviceContext);
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
	 * Deletes the sprint with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SprintLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sprintId the primary key of the sprint
	 * @return the sprint that was removed
	 * @throws PortalException if a sprint with the primary key could not be found
	 */
	public static Sprint deleteSprint(long sprintId) throws PortalException {
		return getService().deleteSprint(sprintId);
	}

	/**
	 * Deletes the sprint from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SprintLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sprint the sprint
	 * @return the sprint that was removed
	 */
	public static Sprint deleteSprint(Sprint sprint) {
		return getService().deleteSprint(sprint);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.savvy.sb.model.impl.SprintModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.savvy.sb.model.impl.SprintModelImpl</code>.
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

	public static Sprint fetchSprint(long sprintId) {
		return getService().fetchSprint(sprintId);
	}

	/**
	 * Returns the sprint matching the UUID and group.
	 *
	 * @param uuid the sprint's UUID
	 * @param groupId the primary key of the group
	 * @return the matching sprint, or <code>null</code> if a matching sprint could not be found
	 */
	public static Sprint fetchSprintByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchSprintByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static List<Sprint> getAllSprints() {
		return getService().getAllSprints();
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
	 * Returns the sprint with the primary key.
	 *
	 * @param sprintId the primary key of the sprint
	 * @return the sprint
	 * @throws PortalException if a sprint with the primary key could not be found
	 */
	public static Sprint getSprint(long sprintId) throws PortalException {
		return getService().getSprint(sprintId);
	}

	public static List<Sprint> getSprintByNombre(String tituloSprint) {
		return getService().getSprintByNombre(tituloSprint);
	}

	/**
	 * Returns the sprint matching the UUID and group.
	 *
	 * @param uuid the sprint's UUID
	 * @param groupId the primary key of the group
	 * @return the matching sprint
	 * @throws PortalException if a matching sprint could not be found
	 */
	public static Sprint getSprintByUuidAndGroupId(String uuid, long groupId)
		throws PortalException {

		return getService().getSprintByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the sprints.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.savvy.sb.model.impl.SprintModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sprints
	 * @param end the upper bound of the range of sprints (not inclusive)
	 * @return the range of sprints
	 */
	public static List<Sprint> getSprints(int start, int end) {
		return getService().getSprints(start, end);
	}

	/**
	 * Returns all the sprints matching the UUID and company.
	 *
	 * @param uuid the UUID of the sprints
	 * @param companyId the primary key of the company
	 * @return the matching sprints, or an empty list if no matches were found
	 */
	public static List<Sprint> getSprintsByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getSprintsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of sprints matching the UUID and company.
	 *
	 * @param uuid the UUID of the sprints
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of sprints
	 * @param end the upper bound of the range of sprints (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching sprints, or an empty list if no matches were found
	 */
	public static List<Sprint> getSprintsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Sprint> orderByComparator) {

		return getService().getSprintsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of sprints.
	 *
	 * @return the number of sprints
	 */
	public static int getSprintsCount() {
		return getService().getSprintsCount();
	}

	public static Sprint updateSprint(
			long sprintId, String tituloSprint, String fechaInicio,
			String fechaFinal, String descripcion, String estado,
			String proyecto,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().updateSprint(
			sprintId, tituloSprint, fechaInicio, fechaFinal, descripcion,
			estado, proyecto, serviceContext);
	}

	/**
	 * Updates the sprint in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SprintLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sprint the sprint
	 * @return the sprint that was updated
	 */
	public static Sprint updateSprint(Sprint sprint) {
		return getService().updateSprint(sprint);
	}

	public static SprintLocalService getService() {
		return _service;
	}

	private static volatile SprintLocalService _service;

}
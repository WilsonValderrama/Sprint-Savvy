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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SprintLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SprintLocalService
 * @generated
 */
public class SprintLocalServiceWrapper
	implements ServiceWrapper<SprintLocalService>, SprintLocalService {

	public SprintLocalServiceWrapper(SprintLocalService sprintLocalService) {
		_sprintLocalService = sprintLocalService;
	}

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
	@Override
	public com.savvy.sb.model.Sprint addSprint(
		com.savvy.sb.model.Sprint sprint) {

		return _sprintLocalService.addSprint(sprint);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sprintLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new sprint with the primary key. Does not add the sprint to the database.
	 *
	 * @param sprintId the primary key for the new sprint
	 * @return the new sprint
	 */
	@Override
	public com.savvy.sb.model.Sprint createSprint(long sprintId) {
		return _sprintLocalService.createSprint(sprintId);
	}

	@Override
	public com.savvy.sb.model.Sprint createSprint(
			String tituloSprint, String fechaInicio, String fechaFinal,
			String descripcion, String estado, String proyecto,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sprintLocalService.createSprint(
			tituloSprint, fechaInicio, fechaFinal, descripcion, estado,
			proyecto, serviceContext);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sprintLocalService.deletePersistedModel(persistedModel);
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
	@Override
	public com.savvy.sb.model.Sprint deleteSprint(long sprintId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sprintLocalService.deleteSprint(sprintId);
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
	@Override
	public com.savvy.sb.model.Sprint deleteSprint(
		com.savvy.sb.model.Sprint sprint) {

		return _sprintLocalService.deleteSprint(sprint);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sprintLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _sprintLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _sprintLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _sprintLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _sprintLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _sprintLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.savvy.sb.model.Sprint fetchSprint(long sprintId) {
		return _sprintLocalService.fetchSprint(sprintId);
	}

	/**
	 * Returns the sprint matching the UUID and group.
	 *
	 * @param uuid the sprint's UUID
	 * @param groupId the primary key of the group
	 * @return the matching sprint, or <code>null</code> if a matching sprint could not be found
	 */
	@Override
	public com.savvy.sb.model.Sprint fetchSprintByUuidAndGroupId(
		String uuid, long groupId) {

		return _sprintLocalService.fetchSprintByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sprintLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List<com.savvy.sb.model.Sprint> getAllSprints() {
		return _sprintLocalService.getAllSprints();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _sprintLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sprintLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sprintLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sprintLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the sprint with the primary key.
	 *
	 * @param sprintId the primary key of the sprint
	 * @return the sprint
	 * @throws PortalException if a sprint with the primary key could not be found
	 */
	@Override
	public com.savvy.sb.model.Sprint getSprint(long sprintId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sprintLocalService.getSprint(sprintId);
	}

	@Override
	public java.util.List<com.savvy.sb.model.Sprint> getSprintByNombre(
		String tituloSprint) {

		return _sprintLocalService.getSprintByNombre(tituloSprint);
	}

	/**
	 * Returns the sprint matching the UUID and group.
	 *
	 * @param uuid the sprint's UUID
	 * @param groupId the primary key of the group
	 * @return the matching sprint
	 * @throws PortalException if a matching sprint could not be found
	 */
	@Override
	public com.savvy.sb.model.Sprint getSprintByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sprintLocalService.getSprintByUuidAndGroupId(uuid, groupId);
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
	@Override
	public java.util.List<com.savvy.sb.model.Sprint> getSprints(
		int start, int end) {

		return _sprintLocalService.getSprints(start, end);
	}

	/**
	 * Returns all the sprints matching the UUID and company.
	 *
	 * @param uuid the UUID of the sprints
	 * @param companyId the primary key of the company
	 * @return the matching sprints, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.savvy.sb.model.Sprint>
		getSprintsByUuidAndCompanyId(String uuid, long companyId) {

		return _sprintLocalService.getSprintsByUuidAndCompanyId(
			uuid, companyId);
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
	@Override
	public java.util.List<com.savvy.sb.model.Sprint>
		getSprintsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.savvy.sb.model.Sprint> orderByComparator) {

		return _sprintLocalService.getSprintsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of sprints.
	 *
	 * @return the number of sprints
	 */
	@Override
	public int getSprintsCount() {
		return _sprintLocalService.getSprintsCount();
	}

	@Override
	public com.savvy.sb.model.Sprint updateSprint(
			long sprintId, String tituloSprint, String fechaInicio,
			String fechaFinal, String descripcion, String estado,
			String proyecto,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sprintLocalService.updateSprint(
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
	@Override
	public com.savvy.sb.model.Sprint updateSprint(
		com.savvy.sb.model.Sprint sprint) {

		return _sprintLocalService.updateSprint(sprint);
	}

	@Override
	public SprintLocalService getWrappedService() {
		return _sprintLocalService;
	}

	@Override
	public void setWrappedService(SprintLocalService sprintLocalService) {
		_sprintLocalService = sprintLocalService;
	}

	private SprintLocalService _sprintLocalService;

}
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
 * Provides a wrapper for {@link TareaLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TareaLocalService
 * @generated
 */
public class TareaLocalServiceWrapper
	implements ServiceWrapper<TareaLocalService>, TareaLocalService {

	public TareaLocalServiceWrapper(TareaLocalService tareaLocalService) {
		_tareaLocalService = tareaLocalService;
	}

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
	@Override
	public com.savvy.sb.model.Tarea addTarea(com.savvy.sb.model.Tarea tarea) {
		return _tareaLocalService.addTarea(tarea);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tareaLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new tarea with the primary key. Does not add the tarea to the database.
	 *
	 * @param tareaId the primary key for the new tarea
	 * @return the new tarea
	 */
	@Override
	public com.savvy.sb.model.Tarea createTarea(long tareaId) {
		return _tareaLocalService.createTarea(tareaId);
	}

	@Override
	public com.savvy.sb.model.Tarea createTarea(
			String nombreTarea, String proyecto, String responsable,
			String prioridad, String sprint, String estado, String fechaLimite,
			String resumen, String descripcion, String categoria,
			String etiqueta,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tareaLocalService.createTarea(
			nombreTarea, proyecto, responsable, prioridad, sprint, estado,
			fechaLimite, resumen, descripcion, categoria, etiqueta,
			serviceContext);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tareaLocalService.deletePersistedModel(persistedModel);
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
	@Override
	public com.savvy.sb.model.Tarea deleteTarea(long tareaId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tareaLocalService.deleteTarea(tareaId);
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
	@Override
	public com.savvy.sb.model.Tarea deleteTarea(
		com.savvy.sb.model.Tarea tarea) {

		return _tareaLocalService.deleteTarea(tarea);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tareaLocalService.dynamicQuery();
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

		return _tareaLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _tareaLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _tareaLocalService.dynamicQuery(
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

		return _tareaLocalService.dynamicQueryCount(dynamicQuery);
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

		return _tareaLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.savvy.sb.model.Tarea fetchTarea(long tareaId) {
		return _tareaLocalService.fetchTarea(tareaId);
	}

	/**
	 * Returns the tarea matching the UUID and group.
	 *
	 * @param uuid the tarea's UUID
	 * @param groupId the primary key of the group
	 * @return the matching tarea, or <code>null</code> if a matching tarea could not be found
	 */
	@Override
	public com.savvy.sb.model.Tarea fetchTareaByUuidAndGroupId(
		String uuid, long groupId) {

		return _tareaLocalService.fetchTareaByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _tareaLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List<com.savvy.sb.model.Tarea> getAllTareas() {
		return _tareaLocalService.getAllTareas();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _tareaLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _tareaLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tareaLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tareaLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the tarea with the primary key.
	 *
	 * @param tareaId the primary key of the tarea
	 * @return the tarea
	 * @throws PortalException if a tarea with the primary key could not be found
	 */
	@Override
	public com.savvy.sb.model.Tarea getTarea(long tareaId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tareaLocalService.getTarea(tareaId);
	}

	@Override
	public java.util.List<com.savvy.sb.model.Tarea> getTareaByNombre(
		String nombreTarea) {

		return _tareaLocalService.getTareaByNombre(nombreTarea);
	}

	/**
	 * Returns the tarea matching the UUID and group.
	 *
	 * @param uuid the tarea's UUID
	 * @param groupId the primary key of the group
	 * @return the matching tarea
	 * @throws PortalException if a matching tarea could not be found
	 */
	@Override
	public com.savvy.sb.model.Tarea getTareaByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tareaLocalService.getTareaByUuidAndGroupId(uuid, groupId);
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
	@Override
	public java.util.List<com.savvy.sb.model.Tarea> getTareas(
		int start, int end) {

		return _tareaLocalService.getTareas(start, end);
	}

	/**
	 * Returns all the tareas matching the UUID and company.
	 *
	 * @param uuid the UUID of the tareas
	 * @param companyId the primary key of the company
	 * @return the matching tareas, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.savvy.sb.model.Tarea> getTareasByUuidAndCompanyId(
		String uuid, long companyId) {

		return _tareaLocalService.getTareasByUuidAndCompanyId(uuid, companyId);
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
	@Override
	public java.util.List<com.savvy.sb.model.Tarea> getTareasByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<com.savvy.sb.model.Tarea> orderByComparator) {

		return _tareaLocalService.getTareasByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of tareas.
	 *
	 * @return the number of tareas
	 */
	@Override
	public int getTareasCount() {
		return _tareaLocalService.getTareasCount();
	}

	@Override
	public com.savvy.sb.model.Tarea updateTarea(
			long tareaId, String nombreTarea, String proyecto,
			String responsable, String prioridad, String sprint, String estado,
			String fechaLimite, String resumen, String descripcion,
			String categoria, String etiqueta,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tareaLocalService.updateTarea(
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
	@Override
	public com.savvy.sb.model.Tarea updateTarea(
		com.savvy.sb.model.Tarea tarea) {

		return _tareaLocalService.updateTarea(tarea);
	}

	@Override
	public TareaLocalService getWrappedService() {
		return _tareaLocalService;
	}

	@Override
	public void setWrappedService(TareaLocalService tareaLocalService) {
		_tareaLocalService = tareaLocalService;
	}

	private TareaLocalService _tareaLocalService;

}
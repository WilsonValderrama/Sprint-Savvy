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
 * Provides a wrapper for {@link ProyectoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ProyectoLocalService
 * @generated
 */
public class ProyectoLocalServiceWrapper
	implements ProyectoLocalService, ServiceWrapper<ProyectoLocalService> {

	public ProyectoLocalServiceWrapper(
		ProyectoLocalService proyectoLocalService) {

		_proyectoLocalService = proyectoLocalService;
	}

	@Override
	public com.savvy.sb.model.Proyecto actualizarProyecto(
			long proyectoId, String tituloProyecto, String descripcion,
			String fechaInicio, String fechaFinal, String estado,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _proyectoLocalService.actualizarProyecto(
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
	@Override
	public com.savvy.sb.model.Proyecto addProyecto(
		com.savvy.sb.model.Proyecto proyecto) {

		return _proyectoLocalService.addProyecto(proyecto);
	}

	@Override
	public com.savvy.sb.model.Proyecto crearProyecto(
			String tituloProyecto, String descripcion, String fechaInicio,
			String fechaFinal, String estado,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _proyectoLocalService.crearProyecto(
			tituloProyecto, descripcion, fechaInicio, fechaFinal, estado,
			serviceContext);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _proyectoLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new proyecto with the primary key. Does not add the proyecto to the database.
	 *
	 * @param proyectoId the primary key for the new proyecto
	 * @return the new proyecto
	 */
	@Override
	public com.savvy.sb.model.Proyecto createProyecto(long proyectoId) {
		return _proyectoLocalService.createProyecto(proyectoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _proyectoLocalService.deletePersistedModel(persistedModel);
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
	@Override
	public com.savvy.sb.model.Proyecto deleteProyecto(long proyectoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _proyectoLocalService.deleteProyecto(proyectoId);
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
	@Override
	public com.savvy.sb.model.Proyecto deleteProyecto(
		com.savvy.sb.model.Proyecto proyecto) {

		return _proyectoLocalService.deleteProyecto(proyecto);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _proyectoLocalService.dynamicQuery();
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

		return _proyectoLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _proyectoLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _proyectoLocalService.dynamicQuery(
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

		return _proyectoLocalService.dynamicQueryCount(dynamicQuery);
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

		return _proyectoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.savvy.sb.model.Proyecto eliminarProyecto(long proyectoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _proyectoLocalService.eliminarProyecto(proyectoId);
	}

	@Override
	public com.savvy.sb.model.Proyecto fetchProyecto(long proyectoId) {
		return _proyectoLocalService.fetchProyecto(proyectoId);
	}

	/**
	 * Returns the proyecto matching the UUID and group.
	 *
	 * @param uuid the proyecto's UUID
	 * @param groupId the primary key of the group
	 * @return the matching proyecto, or <code>null</code> if a matching proyecto could not be found
	 */
	@Override
	public com.savvy.sb.model.Proyecto fetchProyectoByUuidAndGroupId(
		String uuid, long groupId) {

		return _proyectoLocalService.fetchProyectoByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _proyectoLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List<com.savvy.sb.model.Proyecto> getAllProyectos() {
		return _proyectoLocalService.getAllProyectos();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _proyectoLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _proyectoLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _proyectoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _proyectoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the proyecto with the primary key.
	 *
	 * @param proyectoId the primary key of the proyecto
	 * @return the proyecto
	 * @throws PortalException if a proyecto with the primary key could not be found
	 */
	@Override
	public com.savvy.sb.model.Proyecto getProyecto(long proyectoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _proyectoLocalService.getProyecto(proyectoId);
	}

	@Override
	public java.util.List<com.savvy.sb.model.Proyecto> getProyectoByNombre(
		String tituloProyecto) {

		return _proyectoLocalService.getProyectoByNombre(tituloProyecto);
	}

	/**
	 * Returns the proyecto matching the UUID and group.
	 *
	 * @param uuid the proyecto's UUID
	 * @param groupId the primary key of the group
	 * @return the matching proyecto
	 * @throws PortalException if a matching proyecto could not be found
	 */
	@Override
	public com.savvy.sb.model.Proyecto getProyectoByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _proyectoLocalService.getProyectoByUuidAndGroupId(uuid, groupId);
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
	@Override
	public java.util.List<com.savvy.sb.model.Proyecto> getProyectos(
		int start, int end) {

		return _proyectoLocalService.getProyectos(start, end);
	}

	/**
	 * Returns all the proyectos matching the UUID and company.
	 *
	 * @param uuid the UUID of the proyectos
	 * @param companyId the primary key of the company
	 * @return the matching proyectos, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.savvy.sb.model.Proyecto>
		getProyectosByUuidAndCompanyId(String uuid, long companyId) {

		return _proyectoLocalService.getProyectosByUuidAndCompanyId(
			uuid, companyId);
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
	@Override
	public java.util.List<com.savvy.sb.model.Proyecto>
		getProyectosByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.savvy.sb.model.Proyecto> orderByComparator) {

		return _proyectoLocalService.getProyectosByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of proyectos.
	 *
	 * @return the number of proyectos
	 */
	@Override
	public int getProyectosCount() {
		return _proyectoLocalService.getProyectosCount();
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
	@Override
	public com.savvy.sb.model.Proyecto updateProyecto(
		com.savvy.sb.model.Proyecto proyecto) {

		return _proyectoLocalService.updateProyecto(proyecto);
	}

	@Override
	public ProyectoLocalService getWrappedService() {
		return _proyectoLocalService;
	}

	@Override
	public void setWrappedService(ProyectoLocalService proyectoLocalService) {
		_proyectoLocalService = proyectoLocalService;
	}

	private ProyectoLocalService _proyectoLocalService;

}
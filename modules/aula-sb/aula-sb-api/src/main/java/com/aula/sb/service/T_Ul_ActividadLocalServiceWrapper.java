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

package com.aula.sb.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link T_Ul_ActividadLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see T_Ul_ActividadLocalService
 * @generated
 */
public class T_Ul_ActividadLocalServiceWrapper
	implements ServiceWrapper<T_Ul_ActividadLocalService>,
			   T_Ul_ActividadLocalService {

	public T_Ul_ActividadLocalServiceWrapper(
		T_Ul_ActividadLocalService t_Ul_ActividadLocalService) {

		_t_Ul_ActividadLocalService = t_Ul_ActividadLocalService;
	}

	/**
	 * Adds the t_ ul_ actividad to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect T_Ul_ActividadLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param t_Ul_Actividad the t_ ul_ actividad
	 * @return the t_ ul_ actividad that was added
	 */
	@Override
	public com.aula.sb.model.T_Ul_Actividad addT_Ul_Actividad(
		com.aula.sb.model.T_Ul_Actividad t_Ul_Actividad) {

		return _t_Ul_ActividadLocalService.addT_Ul_Actividad(t_Ul_Actividad);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_ActividadLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new t_ ul_ actividad with the primary key. Does not add the t_ ul_ actividad to the database.
	 *
	 * @param idActividad the primary key for the new t_ ul_ actividad
	 * @return the new t_ ul_ actividad
	 */
	@Override
	public com.aula.sb.model.T_Ul_Actividad createT_Ul_Actividad(
		long idActividad) {

		return _t_Ul_ActividadLocalService.createT_Ul_Actividad(idActividad);
	}

	@Override
	public com.aula.sb.model.T_Ul_Actividad createT_Ul_Actividad(
			String tituloActividad, String tipoActividad,
			String descriActividad, String estadoEntrActividad,
			java.util.Date fCreacActividad, java.util.Date fCierrActividad,
			String porcActividad,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_ActividadLocalService.createT_Ul_Actividad(
			tituloActividad, tipoActividad, descriActividad,
			estadoEntrActividad, fCreacActividad, fCierrActividad,
			porcActividad, serviceContext);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_ActividadLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the t_ ul_ actividad with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect T_Ul_ActividadLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param idActividad the primary key of the t_ ul_ actividad
	 * @return the t_ ul_ actividad that was removed
	 * @throws PortalException if a t_ ul_ actividad with the primary key could not be found
	 */
	@Override
	public com.aula.sb.model.T_Ul_Actividad deleteT_Ul_Actividad(
			long idActividad)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_ActividadLocalService.deleteT_Ul_Actividad(idActividad);
	}

	/**
	 * Deletes the t_ ul_ actividad from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect T_Ul_ActividadLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param t_Ul_Actividad the t_ ul_ actividad
	 * @return the t_ ul_ actividad that was removed
	 */
	@Override
	public com.aula.sb.model.T_Ul_Actividad deleteT_Ul_Actividad(
		com.aula.sb.model.T_Ul_Actividad t_Ul_Actividad) {

		return _t_Ul_ActividadLocalService.deleteT_Ul_Actividad(t_Ul_Actividad);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _t_Ul_ActividadLocalService.dynamicQuery();
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

		return _t_Ul_ActividadLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.aula.sb.model.impl.T_Ul_ActividadModelImpl</code>.
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

		return _t_Ul_ActividadLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.aula.sb.model.impl.T_Ul_ActividadModelImpl</code>.
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

		return _t_Ul_ActividadLocalService.dynamicQuery(
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

		return _t_Ul_ActividadLocalService.dynamicQueryCount(dynamicQuery);
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

		return _t_Ul_ActividadLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.aula.sb.model.T_Ul_Actividad fetchT_Ul_Actividad(
		long idActividad) {

		return _t_Ul_ActividadLocalService.fetchT_Ul_Actividad(idActividad);
	}

	/**
	 * Returns the t_ ul_ actividad matching the UUID and group.
	 *
	 * @param uuid the t_ ul_ actividad's UUID
	 * @param groupId the primary key of the group
	 * @return the matching t_ ul_ actividad, or <code>null</code> if a matching t_ ul_ actividad could not be found
	 */
	@Override
	public com.aula.sb.model.T_Ul_Actividad fetchT_Ul_ActividadByUuidAndGroupId(
		String uuid, long groupId) {

		return _t_Ul_ActividadLocalService.fetchT_Ul_ActividadByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _t_Ul_ActividadLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List<com.aula.sb.model.T_Ul_Actividad>
		getAllT_Ul_Actividad() {

		return _t_Ul_ActividadLocalService.getAllT_Ul_Actividad();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _t_Ul_ActividadLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _t_Ul_ActividadLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _t_Ul_ActividadLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_ActividadLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the t_ ul_ actividad with the primary key.
	 *
	 * @param idActividad the primary key of the t_ ul_ actividad
	 * @return the t_ ul_ actividad
	 * @throws PortalException if a t_ ul_ actividad with the primary key could not be found
	 */
	@Override
	public com.aula.sb.model.T_Ul_Actividad getT_Ul_Actividad(long idActividad)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_ActividadLocalService.getT_Ul_Actividad(idActividad);
	}

	@Override
	public java.util.List<com.aula.sb.model.T_Ul_Actividad>
		getT_Ul_ActividadByName(String tituloActividad) {

		return _t_Ul_ActividadLocalService.getT_Ul_ActividadByName(
			tituloActividad);
	}

	/**
	 * Returns the t_ ul_ actividad matching the UUID and group.
	 *
	 * @param uuid the t_ ul_ actividad's UUID
	 * @param groupId the primary key of the group
	 * @return the matching t_ ul_ actividad
	 * @throws PortalException if a matching t_ ul_ actividad could not be found
	 */
	@Override
	public com.aula.sb.model.T_Ul_Actividad getT_Ul_ActividadByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_ActividadLocalService.getT_Ul_ActividadByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the t_ ul_ actividads.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.aula.sb.model.impl.T_Ul_ActividadModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_ actividads
	 * @param end the upper bound of the range of t_ ul_ actividads (not inclusive)
	 * @return the range of t_ ul_ actividads
	 */
	@Override
	public java.util.List<com.aula.sb.model.T_Ul_Actividad> getT_Ul_Actividads(
		int start, int end) {

		return _t_Ul_ActividadLocalService.getT_Ul_Actividads(start, end);
	}

	/**
	 * Returns all the t_ ul_ actividads matching the UUID and company.
	 *
	 * @param uuid the UUID of the t_ ul_ actividads
	 * @param companyId the primary key of the company
	 * @return the matching t_ ul_ actividads, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.aula.sb.model.T_Ul_Actividad>
		getT_Ul_ActividadsByUuidAndCompanyId(String uuid, long companyId) {

		return _t_Ul_ActividadLocalService.getT_Ul_ActividadsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of t_ ul_ actividads matching the UUID and company.
	 *
	 * @param uuid the UUID of the t_ ul_ actividads
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of t_ ul_ actividads
	 * @param end the upper bound of the range of t_ ul_ actividads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching t_ ul_ actividads, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.aula.sb.model.T_Ul_Actividad>
		getT_Ul_ActividadsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.aula.sb.model.T_Ul_Actividad> orderByComparator) {

		return _t_Ul_ActividadLocalService.getT_Ul_ActividadsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of t_ ul_ actividads.
	 *
	 * @return the number of t_ ul_ actividads
	 */
	@Override
	public int getT_Ul_ActividadsCount() {
		return _t_Ul_ActividadLocalService.getT_Ul_ActividadsCount();
	}

	@Override
	public com.aula.sb.model.T_Ul_Actividad updateT_Ul_Actividad(
			long idActividad, String tituloActividad, String tipoActividad,
			String descriActividad, String estadoEntrActividad,
			java.util.Date fCreacActividad, java.util.Date fCierrActividad,
			String porcActividad,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_ActividadLocalService.updateT_Ul_Actividad(
			idActividad, tituloActividad, tipoActividad, descriActividad,
			estadoEntrActividad, fCreacActividad, fCierrActividad,
			porcActividad, serviceContext);
	}

	/**
	 * Updates the t_ ul_ actividad in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect T_Ul_ActividadLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param t_Ul_Actividad the t_ ul_ actividad
	 * @return the t_ ul_ actividad that was updated
	 */
	@Override
	public com.aula.sb.model.T_Ul_Actividad updateT_Ul_Actividad(
		com.aula.sb.model.T_Ul_Actividad t_Ul_Actividad) {

		return _t_Ul_ActividadLocalService.updateT_Ul_Actividad(t_Ul_Actividad);
	}

	@Override
	public T_Ul_ActividadLocalService getWrappedService() {
		return _t_Ul_ActividadLocalService;
	}

	@Override
	public void setWrappedService(
		T_Ul_ActividadLocalService t_Ul_ActividadLocalService) {

		_t_Ul_ActividadLocalService = t_Ul_ActividadLocalService;
	}

	private T_Ul_ActividadLocalService _t_Ul_ActividadLocalService;

}
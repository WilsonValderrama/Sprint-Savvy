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
 * Provides a wrapper for {@link T_Ul_CalificacionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see T_Ul_CalificacionLocalService
 * @generated
 */
public class T_Ul_CalificacionLocalServiceWrapper
	implements ServiceWrapper<T_Ul_CalificacionLocalService>,
			   T_Ul_CalificacionLocalService {

	public T_Ul_CalificacionLocalServiceWrapper(
		T_Ul_CalificacionLocalService t_Ul_CalificacionLocalService) {

		_t_Ul_CalificacionLocalService = t_Ul_CalificacionLocalService;
	}

	/**
	 * Adds the t_ ul_ calificacion to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect T_Ul_CalificacionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param t_Ul_Calificacion the t_ ul_ calificacion
	 * @return the t_ ul_ calificacion that was added
	 */
	@Override
	public com.aula.sb.model.T_Ul_Calificacion addT_Ul_Calificacion(
		com.aula.sb.model.T_Ul_Calificacion t_Ul_Calificacion) {

		return _t_Ul_CalificacionLocalService.addT_Ul_Calificacion(
			t_Ul_Calificacion);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_CalificacionLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new t_ ul_ calificacion with the primary key. Does not add the t_ ul_ calificacion to the database.
	 *
	 * @param idCalificacion the primary key for the new t_ ul_ calificacion
	 * @return the new t_ ul_ calificacion
	 */
	@Override
	public com.aula.sb.model.T_Ul_Calificacion createT_Ul_Calificacion(
		long idCalificacion) {

		return _t_Ul_CalificacionLocalService.createT_Ul_Calificacion(
			idCalificacion);
	}

	@Override
	public com.aula.sb.model.T_Ul_Calificacion createT_Ul_Calificacion(
			String puntCalificacion,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_CalificacionLocalService.createT_Ul_Calificacion(
			puntCalificacion, serviceContext);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_CalificacionLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the t_ ul_ calificacion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect T_Ul_CalificacionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param idCalificacion the primary key of the t_ ul_ calificacion
	 * @return the t_ ul_ calificacion that was removed
	 * @throws PortalException if a t_ ul_ calificacion with the primary key could not be found
	 */
	@Override
	public com.aula.sb.model.T_Ul_Calificacion deleteT_Ul_Calificacion(
			long idCalificacion)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_CalificacionLocalService.deleteT_Ul_Calificacion(
			idCalificacion);
	}

	/**
	 * Deletes the t_ ul_ calificacion from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect T_Ul_CalificacionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param t_Ul_Calificacion the t_ ul_ calificacion
	 * @return the t_ ul_ calificacion that was removed
	 */
	@Override
	public com.aula.sb.model.T_Ul_Calificacion deleteT_Ul_Calificacion(
		com.aula.sb.model.T_Ul_Calificacion t_Ul_Calificacion) {

		return _t_Ul_CalificacionLocalService.deleteT_Ul_Calificacion(
			t_Ul_Calificacion);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _t_Ul_CalificacionLocalService.dynamicQuery();
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

		return _t_Ul_CalificacionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.aula.sb.model.impl.T_Ul_CalificacionModelImpl</code>.
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

		return _t_Ul_CalificacionLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.aula.sb.model.impl.T_Ul_CalificacionModelImpl</code>.
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

		return _t_Ul_CalificacionLocalService.dynamicQuery(
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

		return _t_Ul_CalificacionLocalService.dynamicQueryCount(dynamicQuery);
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

		return _t_Ul_CalificacionLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.aula.sb.model.T_Ul_Calificacion fetchT_Ul_Calificacion(
		long idCalificacion) {

		return _t_Ul_CalificacionLocalService.fetchT_Ul_Calificacion(
			idCalificacion);
	}

	/**
	 * Returns the t_ ul_ calificacion matching the UUID and group.
	 *
	 * @param uuid the t_ ul_ calificacion's UUID
	 * @param groupId the primary key of the group
	 * @return the matching t_ ul_ calificacion, or <code>null</code> if a matching t_ ul_ calificacion could not be found
	 */
	@Override
	public com.aula.sb.model.T_Ul_Calificacion
		fetchT_Ul_CalificacionByUuidAndGroupId(String uuid, long groupId) {

		return _t_Ul_CalificacionLocalService.
			fetchT_Ul_CalificacionByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _t_Ul_CalificacionLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List<com.aula.sb.model.T_Ul_Calificacion>
		getAllT_Ul_Calificacion() {

		return _t_Ul_CalificacionLocalService.getAllT_Ul_Calificacion();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _t_Ul_CalificacionLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _t_Ul_CalificacionLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _t_Ul_CalificacionLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_CalificacionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the t_ ul_ calificacion with the primary key.
	 *
	 * @param idCalificacion the primary key of the t_ ul_ calificacion
	 * @return the t_ ul_ calificacion
	 * @throws PortalException if a t_ ul_ calificacion with the primary key could not be found
	 */
	@Override
	public com.aula.sb.model.T_Ul_Calificacion getT_Ul_Calificacion(
			long idCalificacion)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_CalificacionLocalService.getT_Ul_Calificacion(
			idCalificacion);
	}

	/**
	 * Returns the t_ ul_ calificacion matching the UUID and group.
	 *
	 * @param uuid the t_ ul_ calificacion's UUID
	 * @param groupId the primary key of the group
	 * @return the matching t_ ul_ calificacion
	 * @throws PortalException if a matching t_ ul_ calificacion could not be found
	 */
	@Override
	public com.aula.sb.model.T_Ul_Calificacion
			getT_Ul_CalificacionByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_CalificacionLocalService.
			getT_Ul_CalificacionByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the t_ ul_ calificacions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.aula.sb.model.impl.T_Ul_CalificacionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_ calificacions
	 * @param end the upper bound of the range of t_ ul_ calificacions (not inclusive)
	 * @return the range of t_ ul_ calificacions
	 */
	@Override
	public java.util.List<com.aula.sb.model.T_Ul_Calificacion>
		getT_Ul_Calificacions(int start, int end) {

		return _t_Ul_CalificacionLocalService.getT_Ul_Calificacions(start, end);
	}

	/**
	 * Returns all the t_ ul_ calificacions matching the UUID and company.
	 *
	 * @param uuid the UUID of the t_ ul_ calificacions
	 * @param companyId the primary key of the company
	 * @return the matching t_ ul_ calificacions, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.aula.sb.model.T_Ul_Calificacion>
		getT_Ul_CalificacionsByUuidAndCompanyId(String uuid, long companyId) {

		return _t_Ul_CalificacionLocalService.
			getT_Ul_CalificacionsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of t_ ul_ calificacions matching the UUID and company.
	 *
	 * @param uuid the UUID of the t_ ul_ calificacions
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of t_ ul_ calificacions
	 * @param end the upper bound of the range of t_ ul_ calificacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching t_ ul_ calificacions, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.aula.sb.model.T_Ul_Calificacion>
		getT_Ul_CalificacionsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.aula.sb.model.T_Ul_Calificacion> orderByComparator) {

		return _t_Ul_CalificacionLocalService.
			getT_Ul_CalificacionsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of t_ ul_ calificacions.
	 *
	 * @return the number of t_ ul_ calificacions
	 */
	@Override
	public int getT_Ul_CalificacionsCount() {
		return _t_Ul_CalificacionLocalService.getT_Ul_CalificacionsCount();
	}

	@Override
	public com.aula.sb.model.T_Ul_Calificacion updateT_Ul_Calificacion(
			long idCalificacion, String puntCalificacion,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_CalificacionLocalService.updateT_Ul_Calificacion(
			idCalificacion, puntCalificacion, serviceContext);
	}

	/**
	 * Updates the t_ ul_ calificacion in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect T_Ul_CalificacionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param t_Ul_Calificacion the t_ ul_ calificacion
	 * @return the t_ ul_ calificacion that was updated
	 */
	@Override
	public com.aula.sb.model.T_Ul_Calificacion updateT_Ul_Calificacion(
		com.aula.sb.model.T_Ul_Calificacion t_Ul_Calificacion) {

		return _t_Ul_CalificacionLocalService.updateT_Ul_Calificacion(
			t_Ul_Calificacion);
	}

	@Override
	public T_Ul_CalificacionLocalService getWrappedService() {
		return _t_Ul_CalificacionLocalService;
	}

	@Override
	public void setWrappedService(
		T_Ul_CalificacionLocalService t_Ul_CalificacionLocalService) {

		_t_Ul_CalificacionLocalService = t_Ul_CalificacionLocalService;
	}

	private T_Ul_CalificacionLocalService _t_Ul_CalificacionLocalService;

}
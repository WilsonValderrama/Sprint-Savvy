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
 * Provides a wrapper for {@link T_Ul_EstudianteLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see T_Ul_EstudianteLocalService
 * @generated
 */
public class T_Ul_EstudianteLocalServiceWrapper
	implements ServiceWrapper<T_Ul_EstudianteLocalService>,
			   T_Ul_EstudianteLocalService {

	public T_Ul_EstudianteLocalServiceWrapper(
		T_Ul_EstudianteLocalService t_Ul_EstudianteLocalService) {

		_t_Ul_EstudianteLocalService = t_Ul_EstudianteLocalService;
	}

	/**
	 * Adds the t_ ul_ estudiante to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect T_Ul_EstudianteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param t_Ul_Estudiante the t_ ul_ estudiante
	 * @return the t_ ul_ estudiante that was added
	 */
	@Override
	public com.aula.sb.model.T_Ul_Estudiante addT_Ul_Estudiante(
		com.aula.sb.model.T_Ul_Estudiante t_Ul_Estudiante) {

		return _t_Ul_EstudianteLocalService.addT_Ul_Estudiante(t_Ul_Estudiante);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_EstudianteLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new t_ ul_ estudiante with the primary key. Does not add the t_ ul_ estudiante to the database.
	 *
	 * @param idEstudiante the primary key for the new t_ ul_ estudiante
	 * @return the new t_ ul_ estudiante
	 */
	@Override
	public com.aula.sb.model.T_Ul_Estudiante createT_Ul_Estudiante(
		long idEstudiante) {

		return _t_Ul_EstudianteLocalService.createT_Ul_Estudiante(idEstudiante);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_EstudianteLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the t_ ul_ estudiante with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect T_Ul_EstudianteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param idEstudiante the primary key of the t_ ul_ estudiante
	 * @return the t_ ul_ estudiante that was removed
	 * @throws PortalException if a t_ ul_ estudiante with the primary key could not be found
	 */
	@Override
	public com.aula.sb.model.T_Ul_Estudiante deleteT_Ul_Estudiante(
			long idEstudiante)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_EstudianteLocalService.deleteT_Ul_Estudiante(idEstudiante);
	}

	/**
	 * Deletes the t_ ul_ estudiante from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect T_Ul_EstudianteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param t_Ul_Estudiante the t_ ul_ estudiante
	 * @return the t_ ul_ estudiante that was removed
	 */
	@Override
	public com.aula.sb.model.T_Ul_Estudiante deleteT_Ul_Estudiante(
		com.aula.sb.model.T_Ul_Estudiante t_Ul_Estudiante) {

		return _t_Ul_EstudianteLocalService.deleteT_Ul_Estudiante(
			t_Ul_Estudiante);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _t_Ul_EstudianteLocalService.dynamicQuery();
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

		return _t_Ul_EstudianteLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.aula.sb.model.impl.T_Ul_EstudianteModelImpl</code>.
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

		return _t_Ul_EstudianteLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.aula.sb.model.impl.T_Ul_EstudianteModelImpl</code>.
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

		return _t_Ul_EstudianteLocalService.dynamicQuery(
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

		return _t_Ul_EstudianteLocalService.dynamicQueryCount(dynamicQuery);
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

		return _t_Ul_EstudianteLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.aula.sb.model.T_Ul_Estudiante fetchT_Ul_Estudiante(
		long idEstudiante) {

		return _t_Ul_EstudianteLocalService.fetchT_Ul_Estudiante(idEstudiante);
	}

	/**
	 * Returns the t_ ul_ estudiante matching the UUID and group.
	 *
	 * @param uuid the t_ ul_ estudiante's UUID
	 * @param groupId the primary key of the group
	 * @return the matching t_ ul_ estudiante, or <code>null</code> if a matching t_ ul_ estudiante could not be found
	 */
	@Override
	public com.aula.sb.model.T_Ul_Estudiante
		fetchT_Ul_EstudianteByUuidAndGroupId(String uuid, long groupId) {

		return _t_Ul_EstudianteLocalService.
			fetchT_Ul_EstudianteByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _t_Ul_EstudianteLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _t_Ul_EstudianteLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _t_Ul_EstudianteLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _t_Ul_EstudianteLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_EstudianteLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the t_ ul_ estudiante with the primary key.
	 *
	 * @param idEstudiante the primary key of the t_ ul_ estudiante
	 * @return the t_ ul_ estudiante
	 * @throws PortalException if a t_ ul_ estudiante with the primary key could not be found
	 */
	@Override
	public com.aula.sb.model.T_Ul_Estudiante getT_Ul_Estudiante(
			long idEstudiante)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_EstudianteLocalService.getT_Ul_Estudiante(idEstudiante);
	}

	/**
	 * Returns the t_ ul_ estudiante matching the UUID and group.
	 *
	 * @param uuid the t_ ul_ estudiante's UUID
	 * @param groupId the primary key of the group
	 * @return the matching t_ ul_ estudiante
	 * @throws PortalException if a matching t_ ul_ estudiante could not be found
	 */
	@Override
	public com.aula.sb.model.T_Ul_Estudiante getT_Ul_EstudianteByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_EstudianteLocalService.getT_Ul_EstudianteByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the t_ ul_ estudiantes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.aula.sb.model.impl.T_Ul_EstudianteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_ estudiantes
	 * @param end the upper bound of the range of t_ ul_ estudiantes (not inclusive)
	 * @return the range of t_ ul_ estudiantes
	 */
	@Override
	public java.util.List<com.aula.sb.model.T_Ul_Estudiante>
		getT_Ul_Estudiantes(int start, int end) {

		return _t_Ul_EstudianteLocalService.getT_Ul_Estudiantes(start, end);
	}

	/**
	 * Returns all the t_ ul_ estudiantes matching the UUID and company.
	 *
	 * @param uuid the UUID of the t_ ul_ estudiantes
	 * @param companyId the primary key of the company
	 * @return the matching t_ ul_ estudiantes, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.aula.sb.model.T_Ul_Estudiante>
		getT_Ul_EstudiantesByUuidAndCompanyId(String uuid, long companyId) {

		return _t_Ul_EstudianteLocalService.
			getT_Ul_EstudiantesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of t_ ul_ estudiantes matching the UUID and company.
	 *
	 * @param uuid the UUID of the t_ ul_ estudiantes
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of t_ ul_ estudiantes
	 * @param end the upper bound of the range of t_ ul_ estudiantes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching t_ ul_ estudiantes, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.aula.sb.model.T_Ul_Estudiante>
		getT_Ul_EstudiantesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.aula.sb.model.T_Ul_Estudiante> orderByComparator) {

		return _t_Ul_EstudianteLocalService.
			getT_Ul_EstudiantesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of t_ ul_ estudiantes.
	 *
	 * @return the number of t_ ul_ estudiantes
	 */
	@Override
	public int getT_Ul_EstudiantesCount() {
		return _t_Ul_EstudianteLocalService.getT_Ul_EstudiantesCount();
	}

	/**
	 * Updates the t_ ul_ estudiante in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect T_Ul_EstudianteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param t_Ul_Estudiante the t_ ul_ estudiante
	 * @return the t_ ul_ estudiante that was updated
	 */
	@Override
	public com.aula.sb.model.T_Ul_Estudiante updateT_Ul_Estudiante(
		com.aula.sb.model.T_Ul_Estudiante t_Ul_Estudiante) {

		return _t_Ul_EstudianteLocalService.updateT_Ul_Estudiante(
			t_Ul_Estudiante);
	}

	@Override
	public T_Ul_EstudianteLocalService getWrappedService() {
		return _t_Ul_EstudianteLocalService;
	}

	@Override
	public void setWrappedService(
		T_Ul_EstudianteLocalService t_Ul_EstudianteLocalService) {

		_t_Ul_EstudianteLocalService = t_Ul_EstudianteLocalService;
	}

	private T_Ul_EstudianteLocalService _t_Ul_EstudianteLocalService;

}
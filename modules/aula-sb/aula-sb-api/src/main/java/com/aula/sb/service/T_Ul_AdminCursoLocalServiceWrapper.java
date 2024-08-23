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
 * Provides a wrapper for {@link T_Ul_AdminCursoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see T_Ul_AdminCursoLocalService
 * @generated
 */
public class T_Ul_AdminCursoLocalServiceWrapper
	implements ServiceWrapper<T_Ul_AdminCursoLocalService>,
			   T_Ul_AdminCursoLocalService {

	public T_Ul_AdminCursoLocalServiceWrapper(
		T_Ul_AdminCursoLocalService t_Ul_AdminCursoLocalService) {

		_t_Ul_AdminCursoLocalService = t_Ul_AdminCursoLocalService;
	}

	/**
	 * Adds the t_ ul_ admin curso to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect T_Ul_AdminCursoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param t_Ul_AdminCurso the t_ ul_ admin curso
	 * @return the t_ ul_ admin curso that was added
	 */
	@Override
	public com.aula.sb.model.T_Ul_AdminCurso addT_Ul_AdminCurso(
		com.aula.sb.model.T_Ul_AdminCurso t_Ul_AdminCurso) {

		return _t_Ul_AdminCursoLocalService.addT_Ul_AdminCurso(t_Ul_AdminCurso);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_AdminCursoLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new t_ ul_ admin curso with the primary key. Does not add the t_ ul_ admin curso to the database.
	 *
	 * @param t_Ul_AdminCursoPK the primary key for the new t_ ul_ admin curso
	 * @return the new t_ ul_ admin curso
	 */
	@Override
	public com.aula.sb.model.T_Ul_AdminCurso createT_Ul_AdminCurso(
		com.aula.sb.service.persistence.T_Ul_AdminCursoPK t_Ul_AdminCursoPK) {

		return _t_Ul_AdminCursoLocalService.createT_Ul_AdminCurso(
			t_Ul_AdminCursoPK);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_AdminCursoLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the t_ ul_ admin curso from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect T_Ul_AdminCursoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param t_Ul_AdminCurso the t_ ul_ admin curso
	 * @return the t_ ul_ admin curso that was removed
	 */
	@Override
	public com.aula.sb.model.T_Ul_AdminCurso deleteT_Ul_AdminCurso(
		com.aula.sb.model.T_Ul_AdminCurso t_Ul_AdminCurso) {

		return _t_Ul_AdminCursoLocalService.deleteT_Ul_AdminCurso(
			t_Ul_AdminCurso);
	}

	/**
	 * Deletes the t_ ul_ admin curso with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect T_Ul_AdminCursoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param t_Ul_AdminCursoPK the primary key of the t_ ul_ admin curso
	 * @return the t_ ul_ admin curso that was removed
	 * @throws PortalException if a t_ ul_ admin curso with the primary key could not be found
	 */
	@Override
	public com.aula.sb.model.T_Ul_AdminCurso deleteT_Ul_AdminCurso(
			com.aula.sb.service.persistence.T_Ul_AdminCursoPK t_Ul_AdminCursoPK)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_AdminCursoLocalService.deleteT_Ul_AdminCurso(
			t_Ul_AdminCursoPK);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _t_Ul_AdminCursoLocalService.dynamicQuery();
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

		return _t_Ul_AdminCursoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.aula.sb.model.impl.T_Ul_AdminCursoModelImpl</code>.
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

		return _t_Ul_AdminCursoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.aula.sb.model.impl.T_Ul_AdminCursoModelImpl</code>.
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

		return _t_Ul_AdminCursoLocalService.dynamicQuery(
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

		return _t_Ul_AdminCursoLocalService.dynamicQueryCount(dynamicQuery);
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

		return _t_Ul_AdminCursoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.aula.sb.model.T_Ul_AdminCurso fetchT_Ul_AdminCurso(
		com.aula.sb.service.persistence.T_Ul_AdminCursoPK t_Ul_AdminCursoPK) {

		return _t_Ul_AdminCursoLocalService.fetchT_Ul_AdminCurso(
			t_Ul_AdminCursoPK);
	}

	/**
	 * Returns the t_ ul_ admin curso matching the UUID and group.
	 *
	 * @param uuid the t_ ul_ admin curso's UUID
	 * @param groupId the primary key of the group
	 * @return the matching t_ ul_ admin curso, or <code>null</code> if a matching t_ ul_ admin curso could not be found
	 */
	@Override
	public com.aula.sb.model.T_Ul_AdminCurso
		fetchT_Ul_AdminCursoByUuidAndGroupId(String uuid, long groupId) {

		return _t_Ul_AdminCursoLocalService.
			fetchT_Ul_AdminCursoByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _t_Ul_AdminCursoLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _t_Ul_AdminCursoLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _t_Ul_AdminCursoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _t_Ul_AdminCursoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_AdminCursoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the t_ ul_ admin curso with the primary key.
	 *
	 * @param t_Ul_AdminCursoPK the primary key of the t_ ul_ admin curso
	 * @return the t_ ul_ admin curso
	 * @throws PortalException if a t_ ul_ admin curso with the primary key could not be found
	 */
	@Override
	public com.aula.sb.model.T_Ul_AdminCurso getT_Ul_AdminCurso(
			com.aula.sb.service.persistence.T_Ul_AdminCursoPK t_Ul_AdminCursoPK)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_AdminCursoLocalService.getT_Ul_AdminCurso(
			t_Ul_AdminCursoPK);
	}

	/**
	 * Returns the t_ ul_ admin curso matching the UUID and group.
	 *
	 * @param uuid the t_ ul_ admin curso's UUID
	 * @param groupId the primary key of the group
	 * @return the matching t_ ul_ admin curso
	 * @throws PortalException if a matching t_ ul_ admin curso could not be found
	 */
	@Override
	public com.aula.sb.model.T_Ul_AdminCurso getT_Ul_AdminCursoByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_AdminCursoLocalService.getT_Ul_AdminCursoByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the t_ ul_ admin cursos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.aula.sb.model.impl.T_Ul_AdminCursoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_ admin cursos
	 * @param end the upper bound of the range of t_ ul_ admin cursos (not inclusive)
	 * @return the range of t_ ul_ admin cursos
	 */
	@Override
	public java.util.List<com.aula.sb.model.T_Ul_AdminCurso>
		getT_Ul_AdminCursos(int start, int end) {

		return _t_Ul_AdminCursoLocalService.getT_Ul_AdminCursos(start, end);
	}

	/**
	 * Returns all the t_ ul_ admin cursos matching the UUID and company.
	 *
	 * @param uuid the UUID of the t_ ul_ admin cursos
	 * @param companyId the primary key of the company
	 * @return the matching t_ ul_ admin cursos, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.aula.sb.model.T_Ul_AdminCurso>
		getT_Ul_AdminCursosByUuidAndCompanyId(String uuid, long companyId) {

		return _t_Ul_AdminCursoLocalService.
			getT_Ul_AdminCursosByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of t_ ul_ admin cursos matching the UUID and company.
	 *
	 * @param uuid the UUID of the t_ ul_ admin cursos
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of t_ ul_ admin cursos
	 * @param end the upper bound of the range of t_ ul_ admin cursos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching t_ ul_ admin cursos, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.aula.sb.model.T_Ul_AdminCurso>
		getT_Ul_AdminCursosByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.aula.sb.model.T_Ul_AdminCurso> orderByComparator) {

		return _t_Ul_AdminCursoLocalService.
			getT_Ul_AdminCursosByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of t_ ul_ admin cursos.
	 *
	 * @return the number of t_ ul_ admin cursos
	 */
	@Override
	public int getT_Ul_AdminCursosCount() {
		return _t_Ul_AdminCursoLocalService.getT_Ul_AdminCursosCount();
	}

	/**
	 * Updates the t_ ul_ admin curso in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect T_Ul_AdminCursoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param t_Ul_AdminCurso the t_ ul_ admin curso
	 * @return the t_ ul_ admin curso that was updated
	 */
	@Override
	public com.aula.sb.model.T_Ul_AdminCurso updateT_Ul_AdminCurso(
		com.aula.sb.model.T_Ul_AdminCurso t_Ul_AdminCurso) {

		return _t_Ul_AdminCursoLocalService.updateT_Ul_AdminCurso(
			t_Ul_AdminCurso);
	}

	@Override
	public T_Ul_AdminCursoLocalService getWrappedService() {
		return _t_Ul_AdminCursoLocalService;
	}

	@Override
	public void setWrappedService(
		T_Ul_AdminCursoLocalService t_Ul_AdminCursoLocalService) {

		_t_Ul_AdminCursoLocalService = t_Ul_AdminCursoLocalService;
	}

	private T_Ul_AdminCursoLocalService _t_Ul_AdminCursoLocalService;

}
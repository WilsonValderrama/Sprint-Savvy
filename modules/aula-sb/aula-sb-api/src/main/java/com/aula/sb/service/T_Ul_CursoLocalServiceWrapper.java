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
 * Provides a wrapper for {@link T_Ul_CursoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see T_Ul_CursoLocalService
 * @generated
 */
public class T_Ul_CursoLocalServiceWrapper
	implements ServiceWrapper<T_Ul_CursoLocalService>, T_Ul_CursoLocalService {

	public T_Ul_CursoLocalServiceWrapper(
		T_Ul_CursoLocalService t_Ul_CursoLocalService) {

		_t_Ul_CursoLocalService = t_Ul_CursoLocalService;
	}

	/**
	 * Adds the t_ ul_ curso to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect T_Ul_CursoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param t_Ul_Curso the t_ ul_ curso
	 * @return the t_ ul_ curso that was added
	 */
	@Override
	public com.aula.sb.model.T_Ul_Curso addT_Ul_Curso(
		com.aula.sb.model.T_Ul_Curso t_Ul_Curso) {

		return _t_Ul_CursoLocalService.addT_Ul_Curso(t_Ul_Curso);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_CursoLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new t_ ul_ curso with the primary key. Does not add the t_ ul_ curso to the database.
	 *
	 * @param idCurso the primary key for the new t_ ul_ curso
	 * @return the new t_ ul_ curso
	 */
	@Override
	public com.aula.sb.model.T_Ul_Curso createT_Ul_Curso(long idCurso) {
		return _t_Ul_CursoLocalService.createT_Ul_Curso(idCurso);
	}

	@Override
	public com.aula.sb.model.T_Ul_Curso createT_Ul_Curso(
			String nombreCurso, java.util.Date fInicioCurso,
			java.util.Date fFinCurso, Long T_Ul_Califi_id,
			Long T_Ul_Profesor_id,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_CursoLocalService.createT_Ul_Curso(
			nombreCurso, fInicioCurso, fFinCurso, T_Ul_Califi_id,
			T_Ul_Profesor_id, serviceContext);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_CursoLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the t_ ul_ curso with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect T_Ul_CursoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param idCurso the primary key of the t_ ul_ curso
	 * @return the t_ ul_ curso that was removed
	 * @throws PortalException if a t_ ul_ curso with the primary key could not be found
	 */
	@Override
	public com.aula.sb.model.T_Ul_Curso deleteT_Ul_Curso(long idCurso)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_CursoLocalService.deleteT_Ul_Curso(idCurso);
	}

	/**
	 * Deletes the t_ ul_ curso from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect T_Ul_CursoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param t_Ul_Curso the t_ ul_ curso
	 * @return the t_ ul_ curso that was removed
	 */
	@Override
	public com.aula.sb.model.T_Ul_Curso deleteT_Ul_Curso(
		com.aula.sb.model.T_Ul_Curso t_Ul_Curso) {

		return _t_Ul_CursoLocalService.deleteT_Ul_Curso(t_Ul_Curso);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _t_Ul_CursoLocalService.dynamicQuery();
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

		return _t_Ul_CursoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.aula.sb.model.impl.T_Ul_CursoModelImpl</code>.
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

		return _t_Ul_CursoLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.aula.sb.model.impl.T_Ul_CursoModelImpl</code>.
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

		return _t_Ul_CursoLocalService.dynamicQuery(
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

		return _t_Ul_CursoLocalService.dynamicQueryCount(dynamicQuery);
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

		return _t_Ul_CursoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.aula.sb.model.T_Ul_Curso fetchT_Ul_Curso(long idCurso) {
		return _t_Ul_CursoLocalService.fetchT_Ul_Curso(idCurso);
	}

	/**
	 * Returns the t_ ul_ curso matching the UUID and group.
	 *
	 * @param uuid the t_ ul_ curso's UUID
	 * @param groupId the primary key of the group
	 * @return the matching t_ ul_ curso, or <code>null</code> if a matching t_ ul_ curso could not be found
	 */
	@Override
	public com.aula.sb.model.T_Ul_Curso fetchT_Ul_CursoByUuidAndGroupId(
		String uuid, long groupId) {

		return _t_Ul_CursoLocalService.fetchT_Ul_CursoByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _t_Ul_CursoLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List<com.aula.sb.model.T_Ul_Curso> getAllT_Ul_Cursos() {
		return _t_Ul_CursoLocalService.getAllT_Ul_Cursos();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _t_Ul_CursoLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _t_Ul_CursoLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _t_Ul_CursoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_CursoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the t_ ul_ curso with the primary key.
	 *
	 * @param idCurso the primary key of the t_ ul_ curso
	 * @return the t_ ul_ curso
	 * @throws PortalException if a t_ ul_ curso with the primary key could not be found
	 */
	@Override
	public com.aula.sb.model.T_Ul_Curso getT_Ul_Curso(long idCurso)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_CursoLocalService.getT_Ul_Curso(idCurso);
	}

	@Override
	public java.util.List<com.aula.sb.model.T_Ul_Curso> getT_Ul_CursoByName(
		String nombreCurso) {

		return _t_Ul_CursoLocalService.getT_Ul_CursoByName(nombreCurso);
	}

	/**
	 * Returns the t_ ul_ curso matching the UUID and group.
	 *
	 * @param uuid the t_ ul_ curso's UUID
	 * @param groupId the primary key of the group
	 * @return the matching t_ ul_ curso
	 * @throws PortalException if a matching t_ ul_ curso could not be found
	 */
	@Override
	public com.aula.sb.model.T_Ul_Curso getT_Ul_CursoByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_CursoLocalService.getT_Ul_CursoByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the t_ ul_ cursos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.aula.sb.model.impl.T_Ul_CursoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_ cursos
	 * @param end the upper bound of the range of t_ ul_ cursos (not inclusive)
	 * @return the range of t_ ul_ cursos
	 */
	@Override
	public java.util.List<com.aula.sb.model.T_Ul_Curso> getT_Ul_Cursos(
		int start, int end) {

		return _t_Ul_CursoLocalService.getT_Ul_Cursos(start, end);
	}

	/**
	 * Returns all the t_ ul_ cursos matching the UUID and company.
	 *
	 * @param uuid the UUID of the t_ ul_ cursos
	 * @param companyId the primary key of the company
	 * @return the matching t_ ul_ cursos, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.aula.sb.model.T_Ul_Curso>
		getT_Ul_CursosByUuidAndCompanyId(String uuid, long companyId) {

		return _t_Ul_CursoLocalService.getT_Ul_CursosByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of t_ ul_ cursos matching the UUID and company.
	 *
	 * @param uuid the UUID of the t_ ul_ cursos
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of t_ ul_ cursos
	 * @param end the upper bound of the range of t_ ul_ cursos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching t_ ul_ cursos, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.aula.sb.model.T_Ul_Curso>
		getT_Ul_CursosByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.aula.sb.model.T_Ul_Curso> orderByComparator) {

		return _t_Ul_CursoLocalService.getT_Ul_CursosByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of t_ ul_ cursos.
	 *
	 * @return the number of t_ ul_ cursos
	 */
	@Override
	public int getT_Ul_CursosCount() {
		return _t_Ul_CursoLocalService.getT_Ul_CursosCount();
	}

	@Override
	public com.aula.sb.model.T_Ul_Curso updateT_Ul_Curso(
			long idCurso, String nombreCurso, java.util.Date fInicioCurso,
			java.util.Date fFinCurso, Long T_Ul_Califi_id,
			Long T_Ul_Profesor_id,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_CursoLocalService.updateT_Ul_Curso(
			idCurso, nombreCurso, fInicioCurso, fFinCurso, T_Ul_Califi_id,
			T_Ul_Profesor_id, serviceContext);
	}

	/**
	 * Updates the t_ ul_ curso in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect T_Ul_CursoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param t_Ul_Curso the t_ ul_ curso
	 * @return the t_ ul_ curso that was updated
	 */
	@Override
	public com.aula.sb.model.T_Ul_Curso updateT_Ul_Curso(
		com.aula.sb.model.T_Ul_Curso t_Ul_Curso) {

		return _t_Ul_CursoLocalService.updateT_Ul_Curso(t_Ul_Curso);
	}

	@Override
	public T_Ul_CursoLocalService getWrappedService() {
		return _t_Ul_CursoLocalService;
	}

	@Override
	public void setWrappedService(
		T_Ul_CursoLocalService t_Ul_CursoLocalService) {

		_t_Ul_CursoLocalService = t_Ul_CursoLocalService;
	}

	private T_Ul_CursoLocalService _t_Ul_CursoLocalService;

}
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
 * Provides a wrapper for {@link T_Ul_PAcademicoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see T_Ul_PAcademicoLocalService
 * @generated
 */
public class T_Ul_PAcademicoLocalServiceWrapper
	implements ServiceWrapper<T_Ul_PAcademicoLocalService>,
			   T_Ul_PAcademicoLocalService {

	public T_Ul_PAcademicoLocalServiceWrapper(
		T_Ul_PAcademicoLocalService t_Ul_PAcademicoLocalService) {

		_t_Ul_PAcademicoLocalService = t_Ul_PAcademicoLocalService;
	}

	/**
	 * Adds the t_ ul_p academico to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect T_Ul_PAcademicoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param t_Ul_PAcademico the t_ ul_p academico
	 * @return the t_ ul_p academico that was added
	 */
	@Override
	public com.aula.sb.model.T_Ul_PAcademico addT_Ul_PAcademico(
		com.aula.sb.model.T_Ul_PAcademico t_Ul_PAcademico) {

		return _t_Ul_PAcademicoLocalService.addT_Ul_PAcademico(t_Ul_PAcademico);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_PAcademicoLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new t_ ul_p academico with the primary key. Does not add the t_ ul_p academico to the database.
	 *
	 * @param idPeriodo the primary key for the new t_ ul_p academico
	 * @return the new t_ ul_p academico
	 */
	@Override
	public com.aula.sb.model.T_Ul_PAcademico createT_Ul_PAcademico(
		long idPeriodo) {

		return _t_Ul_PAcademicoLocalService.createT_Ul_PAcademico(idPeriodo);
	}

	@Override
	public com.aula.sb.model.T_Ul_PAcademico createT_Ul_PAcademico(
			String tituloPeriodo, java.util.Date fInicioPeriodo,
			java.util.Date fFinPeriodo, String porcPeriodo, Long T_Ul_Curso_id,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_PAcademicoLocalService.createT_Ul_PAcademico(
			tituloPeriodo, fInicioPeriodo, fFinPeriodo, porcPeriodo,
			T_Ul_Curso_id, serviceContext);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_PAcademicoLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the t_ ul_p academico with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect T_Ul_PAcademicoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param idPeriodo the primary key of the t_ ul_p academico
	 * @return the t_ ul_p academico that was removed
	 * @throws PortalException if a t_ ul_p academico with the primary key could not be found
	 */
	@Override
	public com.aula.sb.model.T_Ul_PAcademico deleteT_Ul_PAcademico(
			long idPeriodo)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_PAcademicoLocalService.deleteT_Ul_PAcademico(idPeriodo);
	}

	/**
	 * Deletes the t_ ul_p academico from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect T_Ul_PAcademicoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param t_Ul_PAcademico the t_ ul_p academico
	 * @return the t_ ul_p academico that was removed
	 */
	@Override
	public com.aula.sb.model.T_Ul_PAcademico deleteT_Ul_PAcademico(
		com.aula.sb.model.T_Ul_PAcademico t_Ul_PAcademico) {

		return _t_Ul_PAcademicoLocalService.deleteT_Ul_PAcademico(
			t_Ul_PAcademico);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _t_Ul_PAcademicoLocalService.dynamicQuery();
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

		return _t_Ul_PAcademicoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.aula.sb.model.impl.T_Ul_PAcademicoModelImpl</code>.
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

		return _t_Ul_PAcademicoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.aula.sb.model.impl.T_Ul_PAcademicoModelImpl</code>.
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

		return _t_Ul_PAcademicoLocalService.dynamicQuery(
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

		return _t_Ul_PAcademicoLocalService.dynamicQueryCount(dynamicQuery);
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

		return _t_Ul_PAcademicoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.aula.sb.model.T_Ul_PAcademico fetchT_Ul_PAcademico(
		long idPeriodo) {

		return _t_Ul_PAcademicoLocalService.fetchT_Ul_PAcademico(idPeriodo);
	}

	/**
	 * Returns the t_ ul_p academico matching the UUID and group.
	 *
	 * @param uuid the t_ ul_p academico's UUID
	 * @param groupId the primary key of the group
	 * @return the matching t_ ul_p academico, or <code>null</code> if a matching t_ ul_p academico could not be found
	 */
	@Override
	public com.aula.sb.model.T_Ul_PAcademico
		fetchT_Ul_PAcademicoByUuidAndGroupId(String uuid, long groupId) {

		return _t_Ul_PAcademicoLocalService.
			fetchT_Ul_PAcademicoByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _t_Ul_PAcademicoLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List<com.aula.sb.model.T_Ul_PAcademico>
		getAllT_Ul_PAcademicos() {

		return _t_Ul_PAcademicoLocalService.getAllT_Ul_PAcademicos();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _t_Ul_PAcademicoLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _t_Ul_PAcademicoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _t_Ul_PAcademicoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_PAcademicoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the t_ ul_p academico with the primary key.
	 *
	 * @param idPeriodo the primary key of the t_ ul_p academico
	 * @return the t_ ul_p academico
	 * @throws PortalException if a t_ ul_p academico with the primary key could not be found
	 */
	@Override
	public com.aula.sb.model.T_Ul_PAcademico getT_Ul_PAcademico(long idPeriodo)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_PAcademicoLocalService.getT_Ul_PAcademico(idPeriodo);
	}

	@Override
	public java.util.List<com.aula.sb.model.T_Ul_PAcademico>
		getT_Ul_PAcademicoByName(String tituloPeriodo) {

		return _t_Ul_PAcademicoLocalService.getT_Ul_PAcademicoByName(
			tituloPeriodo);
	}

	/**
	 * Returns the t_ ul_p academico matching the UUID and group.
	 *
	 * @param uuid the t_ ul_p academico's UUID
	 * @param groupId the primary key of the group
	 * @return the matching t_ ul_p academico
	 * @throws PortalException if a matching t_ ul_p academico could not be found
	 */
	@Override
	public com.aula.sb.model.T_Ul_PAcademico getT_Ul_PAcademicoByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_PAcademicoLocalService.getT_Ul_PAcademicoByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the t_ ul_p academicos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.aula.sb.model.impl.T_Ul_PAcademicoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_p academicos
	 * @param end the upper bound of the range of t_ ul_p academicos (not inclusive)
	 * @return the range of t_ ul_p academicos
	 */
	@Override
	public java.util.List<com.aula.sb.model.T_Ul_PAcademico>
		getT_Ul_PAcademicos(int start, int end) {

		return _t_Ul_PAcademicoLocalService.getT_Ul_PAcademicos(start, end);
	}

	/**
	 * Returns all the t_ ul_p academicos matching the UUID and company.
	 *
	 * @param uuid the UUID of the t_ ul_p academicos
	 * @param companyId the primary key of the company
	 * @return the matching t_ ul_p academicos, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.aula.sb.model.T_Ul_PAcademico>
		getT_Ul_PAcademicosByUuidAndCompanyId(String uuid, long companyId) {

		return _t_Ul_PAcademicoLocalService.
			getT_Ul_PAcademicosByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of t_ ul_p academicos matching the UUID and company.
	 *
	 * @param uuid the UUID of the t_ ul_p academicos
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of t_ ul_p academicos
	 * @param end the upper bound of the range of t_ ul_p academicos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching t_ ul_p academicos, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.aula.sb.model.T_Ul_PAcademico>
		getT_Ul_PAcademicosByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.aula.sb.model.T_Ul_PAcademico> orderByComparator) {

		return _t_Ul_PAcademicoLocalService.
			getT_Ul_PAcademicosByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of t_ ul_p academicos.
	 *
	 * @return the number of t_ ul_p academicos
	 */
	@Override
	public int getT_Ul_PAcademicosCount() {
		return _t_Ul_PAcademicoLocalService.getT_Ul_PAcademicosCount();
	}

	@Override
	public com.aula.sb.model.T_Ul_PAcademico updateT_Ul_PAcademico(
			long idPeriodo, String tituloPeriodo, java.util.Date fInicioPeriodo,
			java.util.Date fFinPeriodo, String porcPeriodo, Long T_Ul_Curso_id,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_PAcademicoLocalService.updateT_Ul_PAcademico(
			idPeriodo, tituloPeriodo, fInicioPeriodo, fFinPeriodo, porcPeriodo,
			T_Ul_Curso_id, serviceContext);
	}

	/**
	 * Updates the t_ ul_p academico in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect T_Ul_PAcademicoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param t_Ul_PAcademico the t_ ul_p academico
	 * @return the t_ ul_p academico that was updated
	 */
	@Override
	public com.aula.sb.model.T_Ul_PAcademico updateT_Ul_PAcademico(
		com.aula.sb.model.T_Ul_PAcademico t_Ul_PAcademico) {

		return _t_Ul_PAcademicoLocalService.updateT_Ul_PAcademico(
			t_Ul_PAcademico);
	}

	@Override
	public T_Ul_PAcademicoLocalService getWrappedService() {
		return _t_Ul_PAcademicoLocalService;
	}

	@Override
	public void setWrappedService(
		T_Ul_PAcademicoLocalService t_Ul_PAcademicoLocalService) {

		_t_Ul_PAcademicoLocalService = t_Ul_PAcademicoLocalService;
	}

	private T_Ul_PAcademicoLocalService _t_Ul_PAcademicoLocalService;

}
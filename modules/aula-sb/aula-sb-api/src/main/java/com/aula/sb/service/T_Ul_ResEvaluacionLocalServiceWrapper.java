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
 * Provides a wrapper for {@link T_Ul_ResEvaluacionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see T_Ul_ResEvaluacionLocalService
 * @generated
 */
public class T_Ul_ResEvaluacionLocalServiceWrapper
	implements ServiceWrapper<T_Ul_ResEvaluacionLocalService>,
			   T_Ul_ResEvaluacionLocalService {

	public T_Ul_ResEvaluacionLocalServiceWrapper(
		T_Ul_ResEvaluacionLocalService t_Ul_ResEvaluacionLocalService) {

		_t_Ul_ResEvaluacionLocalService = t_Ul_ResEvaluacionLocalService;
	}

	/**
	 * Adds the t_ ul_ res evaluacion to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect T_Ul_ResEvaluacionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param t_Ul_ResEvaluacion the t_ ul_ res evaluacion
	 * @return the t_ ul_ res evaluacion that was added
	 */
	@Override
	public com.aula.sb.model.T_Ul_ResEvaluacion addT_Ul_ResEvaluacion(
		com.aula.sb.model.T_Ul_ResEvaluacion t_Ul_ResEvaluacion) {

		return _t_Ul_ResEvaluacionLocalService.addT_Ul_ResEvaluacion(
			t_Ul_ResEvaluacion);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_ResEvaluacionLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new t_ ul_ res evaluacion with the primary key. Does not add the t_ ul_ res evaluacion to the database.
	 *
	 * @param idRespuestas the primary key for the new t_ ul_ res evaluacion
	 * @return the new t_ ul_ res evaluacion
	 */
	@Override
	public com.aula.sb.model.T_Ul_ResEvaluacion createT_Ul_ResEvaluacion(
		long idRespuestas) {

		return _t_Ul_ResEvaluacionLocalService.createT_Ul_ResEvaluacion(
			idRespuestas);
	}

	@Override
	public com.aula.sb.model.T_Ul_ResEvaluacion createT_Ul_ResEvaluacion(
			String problRespuestas, String opcionRespuestas,
			String puntajeRespuestas, Long T_Ul_Estudiante_id,
			Long T_Ul_PrgEvaluacion_id, Long T_Ul_Califi_id,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_ResEvaluacionLocalService.createT_Ul_ResEvaluacion(
			problRespuestas, opcionRespuestas, puntajeRespuestas,
			T_Ul_Estudiante_id, T_Ul_PrgEvaluacion_id, T_Ul_Califi_id,
			serviceContext);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_ResEvaluacionLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the t_ ul_ res evaluacion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect T_Ul_ResEvaluacionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param idRespuestas the primary key of the t_ ul_ res evaluacion
	 * @return the t_ ul_ res evaluacion that was removed
	 * @throws PortalException if a t_ ul_ res evaluacion with the primary key could not be found
	 */
	@Override
	public com.aula.sb.model.T_Ul_ResEvaluacion deleteT_Ul_ResEvaluacion(
			long idRespuestas)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_ResEvaluacionLocalService.deleteT_Ul_ResEvaluacion(
			idRespuestas);
	}

	/**
	 * Deletes the t_ ul_ res evaluacion from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect T_Ul_ResEvaluacionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param t_Ul_ResEvaluacion the t_ ul_ res evaluacion
	 * @return the t_ ul_ res evaluacion that was removed
	 */
	@Override
	public com.aula.sb.model.T_Ul_ResEvaluacion deleteT_Ul_ResEvaluacion(
		com.aula.sb.model.T_Ul_ResEvaluacion t_Ul_ResEvaluacion) {

		return _t_Ul_ResEvaluacionLocalService.deleteT_Ul_ResEvaluacion(
			t_Ul_ResEvaluacion);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _t_Ul_ResEvaluacionLocalService.dynamicQuery();
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

		return _t_Ul_ResEvaluacionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.aula.sb.model.impl.T_Ul_ResEvaluacionModelImpl</code>.
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

		return _t_Ul_ResEvaluacionLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.aula.sb.model.impl.T_Ul_ResEvaluacionModelImpl</code>.
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

		return _t_Ul_ResEvaluacionLocalService.dynamicQuery(
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

		return _t_Ul_ResEvaluacionLocalService.dynamicQueryCount(dynamicQuery);
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

		return _t_Ul_ResEvaluacionLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.aula.sb.model.T_Ul_ResEvaluacion fetchT_Ul_ResEvaluacion(
		long idRespuestas) {

		return _t_Ul_ResEvaluacionLocalService.fetchT_Ul_ResEvaluacion(
			idRespuestas);
	}

	/**
	 * Returns the t_ ul_ res evaluacion matching the UUID and group.
	 *
	 * @param uuid the t_ ul_ res evaluacion's UUID
	 * @param groupId the primary key of the group
	 * @return the matching t_ ul_ res evaluacion, or <code>null</code> if a matching t_ ul_ res evaluacion could not be found
	 */
	@Override
	public com.aula.sb.model.T_Ul_ResEvaluacion
		fetchT_Ul_ResEvaluacionByUuidAndGroupId(String uuid, long groupId) {

		return _t_Ul_ResEvaluacionLocalService.
			fetchT_Ul_ResEvaluacionByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _t_Ul_ResEvaluacionLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List<com.aula.sb.model.T_Ul_ResEvaluacion>
		getAllT_Ul_ResEvaluacion() {

		return _t_Ul_ResEvaluacionLocalService.getAllT_Ul_ResEvaluacion();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _t_Ul_ResEvaluacionLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _t_Ul_ResEvaluacionLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _t_Ul_ResEvaluacionLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_ResEvaluacionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the t_ ul_ res evaluacion with the primary key.
	 *
	 * @param idRespuestas the primary key of the t_ ul_ res evaluacion
	 * @return the t_ ul_ res evaluacion
	 * @throws PortalException if a t_ ul_ res evaluacion with the primary key could not be found
	 */
	@Override
	public com.aula.sb.model.T_Ul_ResEvaluacion getT_Ul_ResEvaluacion(
			long idRespuestas)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_ResEvaluacionLocalService.getT_Ul_ResEvaluacion(
			idRespuestas);
	}

	@Override
	public java.util.List<com.aula.sb.model.T_Ul_ResEvaluacion>
		getT_Ul_ResEvaluacionByProblRespuestas(String problRespuestas) {

		return _t_Ul_ResEvaluacionLocalService.
			getT_Ul_ResEvaluacionByProblRespuestas(problRespuestas);
	}

	/**
	 * Returns the t_ ul_ res evaluacion matching the UUID and group.
	 *
	 * @param uuid the t_ ul_ res evaluacion's UUID
	 * @param groupId the primary key of the group
	 * @return the matching t_ ul_ res evaluacion
	 * @throws PortalException if a matching t_ ul_ res evaluacion could not be found
	 */
	@Override
	public com.aula.sb.model.T_Ul_ResEvaluacion
			getT_Ul_ResEvaluacionByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_ResEvaluacionLocalService.
			getT_Ul_ResEvaluacionByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the t_ ul_ res evaluacions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.aula.sb.model.impl.T_Ul_ResEvaluacionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_ res evaluacions
	 * @param end the upper bound of the range of t_ ul_ res evaluacions (not inclusive)
	 * @return the range of t_ ul_ res evaluacions
	 */
	@Override
	public java.util.List<com.aula.sb.model.T_Ul_ResEvaluacion>
		getT_Ul_ResEvaluacions(int start, int end) {

		return _t_Ul_ResEvaluacionLocalService.getT_Ul_ResEvaluacions(
			start, end);
	}

	/**
	 * Returns all the t_ ul_ res evaluacions matching the UUID and company.
	 *
	 * @param uuid the UUID of the t_ ul_ res evaluacions
	 * @param companyId the primary key of the company
	 * @return the matching t_ ul_ res evaluacions, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.aula.sb.model.T_Ul_ResEvaluacion>
		getT_Ul_ResEvaluacionsByUuidAndCompanyId(String uuid, long companyId) {

		return _t_Ul_ResEvaluacionLocalService.
			getT_Ul_ResEvaluacionsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of t_ ul_ res evaluacions matching the UUID and company.
	 *
	 * @param uuid the UUID of the t_ ul_ res evaluacions
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of t_ ul_ res evaluacions
	 * @param end the upper bound of the range of t_ ul_ res evaluacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching t_ ul_ res evaluacions, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.aula.sb.model.T_Ul_ResEvaluacion>
		getT_Ul_ResEvaluacionsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.aula.sb.model.T_Ul_ResEvaluacion> orderByComparator) {

		return _t_Ul_ResEvaluacionLocalService.
			getT_Ul_ResEvaluacionsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of t_ ul_ res evaluacions.
	 *
	 * @return the number of t_ ul_ res evaluacions
	 */
	@Override
	public int getT_Ul_ResEvaluacionsCount() {
		return _t_Ul_ResEvaluacionLocalService.getT_Ul_ResEvaluacionsCount();
	}

	@Override
	public com.aula.sb.model.T_Ul_ResEvaluacion updateT_Ul_ResEvaluacion(
			long idRespuestas, String problRespuestas, String opcionRespuestas,
			String puntajeRespuestas, Long T_Ul_Estudiante_id,
			Long T_Ul_PrgEvaluacion_id, Long T_Ul_Califi_id,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_ResEvaluacionLocalService.updateT_Ul_ResEvaluacion(
			idRespuestas, problRespuestas, opcionRespuestas, puntajeRespuestas,
			T_Ul_Estudiante_id, T_Ul_PrgEvaluacion_id, T_Ul_Califi_id,
			serviceContext);
	}

	/**
	 * Updates the t_ ul_ res evaluacion in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect T_Ul_ResEvaluacionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param t_Ul_ResEvaluacion the t_ ul_ res evaluacion
	 * @return the t_ ul_ res evaluacion that was updated
	 */
	@Override
	public com.aula.sb.model.T_Ul_ResEvaluacion updateT_Ul_ResEvaluacion(
		com.aula.sb.model.T_Ul_ResEvaluacion t_Ul_ResEvaluacion) {

		return _t_Ul_ResEvaluacionLocalService.updateT_Ul_ResEvaluacion(
			t_Ul_ResEvaluacion);
	}

	@Override
	public T_Ul_ResEvaluacionLocalService getWrappedService() {
		return _t_Ul_ResEvaluacionLocalService;
	}

	@Override
	public void setWrappedService(
		T_Ul_ResEvaluacionLocalService t_Ul_ResEvaluacionLocalService) {

		_t_Ul_ResEvaluacionLocalService = t_Ul_ResEvaluacionLocalService;
	}

	private T_Ul_ResEvaluacionLocalService _t_Ul_ResEvaluacionLocalService;

}
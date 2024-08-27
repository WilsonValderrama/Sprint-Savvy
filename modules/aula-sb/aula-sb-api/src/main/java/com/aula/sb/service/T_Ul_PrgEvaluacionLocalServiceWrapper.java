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
 * Provides a wrapper for {@link T_Ul_PrgEvaluacionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see T_Ul_PrgEvaluacionLocalService
 * @generated
 */
public class T_Ul_PrgEvaluacionLocalServiceWrapper
	implements ServiceWrapper<T_Ul_PrgEvaluacionLocalService>,
			   T_Ul_PrgEvaluacionLocalService {

	public T_Ul_PrgEvaluacionLocalServiceWrapper(
		T_Ul_PrgEvaluacionLocalService t_Ul_PrgEvaluacionLocalService) {

		_t_Ul_PrgEvaluacionLocalService = t_Ul_PrgEvaluacionLocalService;
	}

	/**
	 * Adds the t_ ul_ prg evaluacion to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect T_Ul_PrgEvaluacionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param t_Ul_PrgEvaluacion the t_ ul_ prg evaluacion
	 * @return the t_ ul_ prg evaluacion that was added
	 */
	@Override
	public com.aula.sb.model.T_Ul_PrgEvaluacion addT_Ul_PrgEvaluacion(
		com.aula.sb.model.T_Ul_PrgEvaluacion t_Ul_PrgEvaluacion) {

		return _t_Ul_PrgEvaluacionLocalService.addT_Ul_PrgEvaluacion(
			t_Ul_PrgEvaluacion);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_PrgEvaluacionLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new t_ ul_ prg evaluacion with the primary key. Does not add the t_ ul_ prg evaluacion to the database.
	 *
	 * @param idPreguntas the primary key for the new t_ ul_ prg evaluacion
	 * @return the new t_ ul_ prg evaluacion
	 */
	@Override
	public com.aula.sb.model.T_Ul_PrgEvaluacion createT_Ul_PrgEvaluacion(
		long idPreguntas) {

		return _t_Ul_PrgEvaluacionLocalService.createT_Ul_PrgEvaluacion(
			idPreguntas);
	}

	@Override
	public com.aula.sb.model.T_Ul_PrgEvaluacion createT_Ul_PrgEvaluacion(
			String problPreguntas, String opcPreguntas, String puntajePreguntas,
			String intentoPreguntas, String limiteTPreguntas,
			Long T_Ul_Actividad_id,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_PrgEvaluacionLocalService.createT_Ul_PrgEvaluacion(
			problPreguntas, opcPreguntas, puntajePreguntas, intentoPreguntas,
			limiteTPreguntas, T_Ul_Actividad_id, serviceContext);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_PrgEvaluacionLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the t_ ul_ prg evaluacion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect T_Ul_PrgEvaluacionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param idPreguntas the primary key of the t_ ul_ prg evaluacion
	 * @return the t_ ul_ prg evaluacion that was removed
	 * @throws PortalException if a t_ ul_ prg evaluacion with the primary key could not be found
	 */
	@Override
	public com.aula.sb.model.T_Ul_PrgEvaluacion deleteT_Ul_PrgEvaluacion(
			long idPreguntas)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_PrgEvaluacionLocalService.deleteT_Ul_PrgEvaluacion(
			idPreguntas);
	}

	/**
	 * Deletes the t_ ul_ prg evaluacion from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect T_Ul_PrgEvaluacionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param t_Ul_PrgEvaluacion the t_ ul_ prg evaluacion
	 * @return the t_ ul_ prg evaluacion that was removed
	 */
	@Override
	public com.aula.sb.model.T_Ul_PrgEvaluacion deleteT_Ul_PrgEvaluacion(
		com.aula.sb.model.T_Ul_PrgEvaluacion t_Ul_PrgEvaluacion) {

		return _t_Ul_PrgEvaluacionLocalService.deleteT_Ul_PrgEvaluacion(
			t_Ul_PrgEvaluacion);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _t_Ul_PrgEvaluacionLocalService.dynamicQuery();
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

		return _t_Ul_PrgEvaluacionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.aula.sb.model.impl.T_Ul_PrgEvaluacionModelImpl</code>.
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

		return _t_Ul_PrgEvaluacionLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.aula.sb.model.impl.T_Ul_PrgEvaluacionModelImpl</code>.
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

		return _t_Ul_PrgEvaluacionLocalService.dynamicQuery(
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

		return _t_Ul_PrgEvaluacionLocalService.dynamicQueryCount(dynamicQuery);
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

		return _t_Ul_PrgEvaluacionLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.aula.sb.model.T_Ul_PrgEvaluacion fetchT_Ul_PrgEvaluacion(
		long idPreguntas) {

		return _t_Ul_PrgEvaluacionLocalService.fetchT_Ul_PrgEvaluacion(
			idPreguntas);
	}

	/**
	 * Returns the t_ ul_ prg evaluacion matching the UUID and group.
	 *
	 * @param uuid the t_ ul_ prg evaluacion's UUID
	 * @param groupId the primary key of the group
	 * @return the matching t_ ul_ prg evaluacion, or <code>null</code> if a matching t_ ul_ prg evaluacion could not be found
	 */
	@Override
	public com.aula.sb.model.T_Ul_PrgEvaluacion
		fetchT_Ul_PrgEvaluacionByUuidAndGroupId(String uuid, long groupId) {

		return _t_Ul_PrgEvaluacionLocalService.
			fetchT_Ul_PrgEvaluacionByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _t_Ul_PrgEvaluacionLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List<com.aula.sb.model.T_Ul_PrgEvaluacion>
		getAllT_Ul_PrgEvaluaciones() {

		return _t_Ul_PrgEvaluacionLocalService.getAllT_Ul_PrgEvaluaciones();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _t_Ul_PrgEvaluacionLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _t_Ul_PrgEvaluacionLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _t_Ul_PrgEvaluacionLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_PrgEvaluacionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the t_ ul_ prg evaluacion with the primary key.
	 *
	 * @param idPreguntas the primary key of the t_ ul_ prg evaluacion
	 * @return the t_ ul_ prg evaluacion
	 * @throws PortalException if a t_ ul_ prg evaluacion with the primary key could not be found
	 */
	@Override
	public com.aula.sb.model.T_Ul_PrgEvaluacion getT_Ul_PrgEvaluacion(
			long idPreguntas)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_PrgEvaluacionLocalService.getT_Ul_PrgEvaluacion(
			idPreguntas);
	}

	/**
	 * Returns the t_ ul_ prg evaluacion matching the UUID and group.
	 *
	 * @param uuid the t_ ul_ prg evaluacion's UUID
	 * @param groupId the primary key of the group
	 * @return the matching t_ ul_ prg evaluacion
	 * @throws PortalException if a matching t_ ul_ prg evaluacion could not be found
	 */
	@Override
	public com.aula.sb.model.T_Ul_PrgEvaluacion
			getT_Ul_PrgEvaluacionByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_PrgEvaluacionLocalService.
			getT_Ul_PrgEvaluacionByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the t_ ul_ prg evaluacions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.aula.sb.model.impl.T_Ul_PrgEvaluacionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_ prg evaluacions
	 * @param end the upper bound of the range of t_ ul_ prg evaluacions (not inclusive)
	 * @return the range of t_ ul_ prg evaluacions
	 */
	@Override
	public java.util.List<com.aula.sb.model.T_Ul_PrgEvaluacion>
		getT_Ul_PrgEvaluacions(int start, int end) {

		return _t_Ul_PrgEvaluacionLocalService.getT_Ul_PrgEvaluacions(
			start, end);
	}

	/**
	 * Returns all the t_ ul_ prg evaluacions matching the UUID and company.
	 *
	 * @param uuid the UUID of the t_ ul_ prg evaluacions
	 * @param companyId the primary key of the company
	 * @return the matching t_ ul_ prg evaluacions, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.aula.sb.model.T_Ul_PrgEvaluacion>
		getT_Ul_PrgEvaluacionsByUuidAndCompanyId(String uuid, long companyId) {

		return _t_Ul_PrgEvaluacionLocalService.
			getT_Ul_PrgEvaluacionsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of t_ ul_ prg evaluacions matching the UUID and company.
	 *
	 * @param uuid the UUID of the t_ ul_ prg evaluacions
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of t_ ul_ prg evaluacions
	 * @param end the upper bound of the range of t_ ul_ prg evaluacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching t_ ul_ prg evaluacions, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.aula.sb.model.T_Ul_PrgEvaluacion>
		getT_Ul_PrgEvaluacionsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.aula.sb.model.T_Ul_PrgEvaluacion> orderByComparator) {

		return _t_Ul_PrgEvaluacionLocalService.
			getT_Ul_PrgEvaluacionsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of t_ ul_ prg evaluacions.
	 *
	 * @return the number of t_ ul_ prg evaluacions
	 */
	@Override
	public int getT_Ul_PrgEvaluacionsCount() {
		return _t_Ul_PrgEvaluacionLocalService.getT_Ul_PrgEvaluacionsCount();
	}

	@Override
	public com.aula.sb.model.T_Ul_PrgEvaluacion updateT_Ul_PrgEvaluacion(
			Long idPreguntas, String problPreguntas, String opcPreguntas,
			String puntajePreguntas, String intentoPreguntas,
			String limiteTPreguntas, Long T_Ul_Actividad_id,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _t_Ul_PrgEvaluacionLocalService.updateT_Ul_PrgEvaluacion(
			idPreguntas, problPreguntas, opcPreguntas, puntajePreguntas,
			intentoPreguntas, limiteTPreguntas, T_Ul_Actividad_id,
			serviceContext);
	}

	/**
	 * Updates the t_ ul_ prg evaluacion in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect T_Ul_PrgEvaluacionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param t_Ul_PrgEvaluacion the t_ ul_ prg evaluacion
	 * @return the t_ ul_ prg evaluacion that was updated
	 */
	@Override
	public com.aula.sb.model.T_Ul_PrgEvaluacion updateT_Ul_PrgEvaluacion(
		com.aula.sb.model.T_Ul_PrgEvaluacion t_Ul_PrgEvaluacion) {

		return _t_Ul_PrgEvaluacionLocalService.updateT_Ul_PrgEvaluacion(
			t_Ul_PrgEvaluacion);
	}

	@Override
	public T_Ul_PrgEvaluacionLocalService getWrappedService() {
		return _t_Ul_PrgEvaluacionLocalService;
	}

	@Override
	public void setWrappedService(
		T_Ul_PrgEvaluacionLocalService t_Ul_PrgEvaluacionLocalService) {

		_t_Ul_PrgEvaluacionLocalService = t_Ul_PrgEvaluacionLocalService;
	}

	private T_Ul_PrgEvaluacionLocalService _t_Ul_PrgEvaluacionLocalService;

}
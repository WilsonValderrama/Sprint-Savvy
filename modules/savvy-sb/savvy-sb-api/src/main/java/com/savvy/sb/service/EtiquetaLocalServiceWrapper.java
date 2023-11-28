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
 * Provides a wrapper for {@link EtiquetaLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see EtiquetaLocalService
 * @generated
 */
public class EtiquetaLocalServiceWrapper
	implements EtiquetaLocalService, ServiceWrapper<EtiquetaLocalService> {

	public EtiquetaLocalServiceWrapper(
		EtiquetaLocalService etiquetaLocalService) {

		_etiquetaLocalService = etiquetaLocalService;
	}

	@Override
	public com.savvy.sb.model.Etiqueta actualizarEtiqueta(
			long etiquetaId, String tituloEtiqueta,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _etiquetaLocalService.actualizarEtiqueta(
			etiquetaId, tituloEtiqueta, serviceContext);
	}

	/**
	 * Adds the etiqueta to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EtiquetaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param etiqueta the etiqueta
	 * @return the etiqueta that was added
	 */
	@Override
	public com.savvy.sb.model.Etiqueta addEtiqueta(
		com.savvy.sb.model.Etiqueta etiqueta) {

		return _etiquetaLocalService.addEtiqueta(etiqueta);
	}

	@Override
	public com.savvy.sb.model.Etiqueta crearEtiqueta(
			String tituloEtiqueta,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _etiquetaLocalService.crearEtiqueta(
			tituloEtiqueta, serviceContext);
	}

	/**
	 * Creates a new etiqueta with the primary key. Does not add the etiqueta to the database.
	 *
	 * @param etiquetaId the primary key for the new etiqueta
	 * @return the new etiqueta
	 */
	@Override
	public com.savvy.sb.model.Etiqueta createEtiqueta(long etiquetaId) {
		return _etiquetaLocalService.createEtiqueta(etiquetaId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _etiquetaLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the etiqueta from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EtiquetaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param etiqueta the etiqueta
	 * @return the etiqueta that was removed
	 */
	@Override
	public com.savvy.sb.model.Etiqueta deleteEtiqueta(
		com.savvy.sb.model.Etiqueta etiqueta) {

		return _etiquetaLocalService.deleteEtiqueta(etiqueta);
	}

	/**
	 * Deletes the etiqueta with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EtiquetaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param etiquetaId the primary key of the etiqueta
	 * @return the etiqueta that was removed
	 * @throws PortalException if a etiqueta with the primary key could not be found
	 */
	@Override
	public com.savvy.sb.model.Etiqueta deleteEtiqueta(long etiquetaId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _etiquetaLocalService.deleteEtiqueta(etiquetaId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _etiquetaLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _etiquetaLocalService.dynamicQuery();
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

		return _etiquetaLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.savvy.sb.model.impl.EtiquetaModelImpl</code>.
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

		return _etiquetaLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.savvy.sb.model.impl.EtiquetaModelImpl</code>.
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

		return _etiquetaLocalService.dynamicQuery(
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

		return _etiquetaLocalService.dynamicQueryCount(dynamicQuery);
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

		return _etiquetaLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.savvy.sb.model.Etiqueta eliminarEtiqueta(long etiquetaId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _etiquetaLocalService.eliminarEtiqueta(etiquetaId);
	}

	@Override
	public com.savvy.sb.model.Etiqueta fetchEtiqueta(long etiquetaId) {
		return _etiquetaLocalService.fetchEtiqueta(etiquetaId);
	}

	/**
	 * Returns the etiqueta matching the UUID and group.
	 *
	 * @param uuid the etiqueta's UUID
	 * @param groupId the primary key of the group
	 * @return the matching etiqueta, or <code>null</code> if a matching etiqueta could not be found
	 */
	@Override
	public com.savvy.sb.model.Etiqueta fetchEtiquetaByUuidAndGroupId(
		String uuid, long groupId) {

		return _etiquetaLocalService.fetchEtiquetaByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _etiquetaLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List<com.savvy.sb.model.Etiqueta> getAllEtiquetas() {
		return _etiquetaLocalService.getAllEtiquetas();
	}

	/**
	 * Returns the etiqueta with the primary key.
	 *
	 * @param etiquetaId the primary key of the etiqueta
	 * @return the etiqueta
	 * @throws PortalException if a etiqueta with the primary key could not be found
	 */
	@Override
	public com.savvy.sb.model.Etiqueta getEtiqueta(long etiquetaId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _etiquetaLocalService.getEtiqueta(etiquetaId);
	}

	@Override
	public java.util.List<com.savvy.sb.model.Etiqueta> getEtiquetaByNombre(
		String tituloEtiqueta) {

		return _etiquetaLocalService.getEtiquetaByNombre(tituloEtiqueta);
	}

	/**
	 * Returns the etiqueta matching the UUID and group.
	 *
	 * @param uuid the etiqueta's UUID
	 * @param groupId the primary key of the group
	 * @return the matching etiqueta
	 * @throws PortalException if a matching etiqueta could not be found
	 */
	@Override
	public com.savvy.sb.model.Etiqueta getEtiquetaByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _etiquetaLocalService.getEtiquetaByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the etiquetas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.savvy.sb.model.impl.EtiquetaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of etiquetas
	 * @param end the upper bound of the range of etiquetas (not inclusive)
	 * @return the range of etiquetas
	 */
	@Override
	public java.util.List<com.savvy.sb.model.Etiqueta> getEtiquetas(
		int start, int end) {

		return _etiquetaLocalService.getEtiquetas(start, end);
	}

	/**
	 * Returns all the etiquetas matching the UUID and company.
	 *
	 * @param uuid the UUID of the etiquetas
	 * @param companyId the primary key of the company
	 * @return the matching etiquetas, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.savvy.sb.model.Etiqueta>
		getEtiquetasByUuidAndCompanyId(String uuid, long companyId) {

		return _etiquetaLocalService.getEtiquetasByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of etiquetas matching the UUID and company.
	 *
	 * @param uuid the UUID of the etiquetas
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of etiquetas
	 * @param end the upper bound of the range of etiquetas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching etiquetas, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.savvy.sb.model.Etiqueta>
		getEtiquetasByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.savvy.sb.model.Etiqueta> orderByComparator) {

		return _etiquetaLocalService.getEtiquetasByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of etiquetas.
	 *
	 * @return the number of etiquetas
	 */
	@Override
	public int getEtiquetasCount() {
		return _etiquetaLocalService.getEtiquetasCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _etiquetaLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _etiquetaLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _etiquetaLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _etiquetaLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the etiqueta in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EtiquetaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param etiqueta the etiqueta
	 * @return the etiqueta that was updated
	 */
	@Override
	public com.savvy.sb.model.Etiqueta updateEtiqueta(
		com.savvy.sb.model.Etiqueta etiqueta) {

		return _etiquetaLocalService.updateEtiqueta(etiqueta);
	}

	@Override
	public EtiquetaLocalService getWrappedService() {
		return _etiquetaLocalService;
	}

	@Override
	public void setWrappedService(EtiquetaLocalService etiquetaLocalService) {
		_etiquetaLocalService = etiquetaLocalService;
	}

	private EtiquetaLocalService _etiquetaLocalService;

}
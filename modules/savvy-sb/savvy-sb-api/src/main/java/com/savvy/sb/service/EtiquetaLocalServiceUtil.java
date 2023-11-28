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

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.savvy.sb.model.Etiqueta;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for Etiqueta. This utility wraps
 * <code>com.savvy.sb.service.impl.EtiquetaLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see EtiquetaLocalService
 * @generated
 */
public class EtiquetaLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.savvy.sb.service.impl.EtiquetaLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static Etiqueta actualizarEtiqueta(
			long etiquetaId, String tituloEtiqueta,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().actualizarEtiqueta(
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
	public static Etiqueta addEtiqueta(Etiqueta etiqueta) {
		return getService().addEtiqueta(etiqueta);
	}

	public static Etiqueta crearEtiqueta(
			String tituloEtiqueta,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().crearEtiqueta(tituloEtiqueta, serviceContext);
	}

	/**
	 * Creates a new etiqueta with the primary key. Does not add the etiqueta to the database.
	 *
	 * @param etiquetaId the primary key for the new etiqueta
	 * @return the new etiqueta
	 */
	public static Etiqueta createEtiqueta(long etiquetaId) {
		return getService().createEtiqueta(etiquetaId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
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
	public static Etiqueta deleteEtiqueta(Etiqueta etiqueta) {
		return getService().deleteEtiqueta(etiqueta);
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
	public static Etiqueta deleteEtiqueta(long etiquetaId)
		throws PortalException {

		return getService().deleteEtiqueta(etiquetaId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static Etiqueta eliminarEtiqueta(long etiquetaId)
		throws PortalException {

		return getService().eliminarEtiqueta(etiquetaId);
	}

	public static Etiqueta fetchEtiqueta(long etiquetaId) {
		return getService().fetchEtiqueta(etiquetaId);
	}

	/**
	 * Returns the etiqueta matching the UUID and group.
	 *
	 * @param uuid the etiqueta's UUID
	 * @param groupId the primary key of the group
	 * @return the matching etiqueta, or <code>null</code> if a matching etiqueta could not be found
	 */
	public static Etiqueta fetchEtiquetaByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchEtiquetaByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static List<Etiqueta> getAllEtiquetas() {
		return getService().getAllEtiquetas();
	}

	/**
	 * Returns the etiqueta with the primary key.
	 *
	 * @param etiquetaId the primary key of the etiqueta
	 * @return the etiqueta
	 * @throws PortalException if a etiqueta with the primary key could not be found
	 */
	public static Etiqueta getEtiqueta(long etiquetaId) throws PortalException {
		return getService().getEtiqueta(etiquetaId);
	}

	public static List<Etiqueta> getEtiquetaByNombre(String tituloEtiqueta) {
		return getService().getEtiquetaByNombre(tituloEtiqueta);
	}

	/**
	 * Returns the etiqueta matching the UUID and group.
	 *
	 * @param uuid the etiqueta's UUID
	 * @param groupId the primary key of the group
	 * @return the matching etiqueta
	 * @throws PortalException if a matching etiqueta could not be found
	 */
	public static Etiqueta getEtiquetaByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getEtiquetaByUuidAndGroupId(uuid, groupId);
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
	public static List<Etiqueta> getEtiquetas(int start, int end) {
		return getService().getEtiquetas(start, end);
	}

	/**
	 * Returns all the etiquetas matching the UUID and company.
	 *
	 * @param uuid the UUID of the etiquetas
	 * @param companyId the primary key of the company
	 * @return the matching etiquetas, or an empty list if no matches were found
	 */
	public static List<Etiqueta> getEtiquetasByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getEtiquetasByUuidAndCompanyId(uuid, companyId);
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
	public static List<Etiqueta> getEtiquetasByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Etiqueta> orderByComparator) {

		return getService().getEtiquetasByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of etiquetas.
	 *
	 * @return the number of etiquetas
	 */
	public static int getEtiquetasCount() {
		return getService().getEtiquetasCount();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
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
	public static Etiqueta updateEtiqueta(Etiqueta etiqueta) {
		return getService().updateEtiqueta(etiqueta);
	}

	public static EtiquetaLocalService getService() {
		return _service;
	}

	private static volatile EtiquetaLocalService _service;

}
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

import com.aula.sb.model.T_Ul_Administrador;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for T_Ul_Administrador. This utility wraps
 * <code>com.aula.sb.service.impl.T_Ul_AdministradorLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see T_Ul_AdministradorLocalService
 * @generated
 */
public class T_Ul_AdministradorLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.aula.sb.service.impl.T_Ul_AdministradorLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the t_ ul_ administrador to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect T_Ul_AdministradorLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param t_Ul_Administrador the t_ ul_ administrador
	 * @return the t_ ul_ administrador that was added
	 */
	public static T_Ul_Administrador addT_Ul_Administrador(
		T_Ul_Administrador t_Ul_Administrador) {

		return getService().addT_Ul_Administrador(t_Ul_Administrador);
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
	 * Creates a new t_ ul_ administrador with the primary key. Does not add the t_ ul_ administrador to the database.
	 *
	 * @param idAdmin the primary key for the new t_ ul_ administrador
	 * @return the new t_ ul_ administrador
	 */
	public static T_Ul_Administrador createT_Ul_Administrador(long idAdmin) {
		return getService().createT_Ul_Administrador(idAdmin);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the t_ ul_ administrador with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect T_Ul_AdministradorLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param idAdmin the primary key of the t_ ul_ administrador
	 * @return the t_ ul_ administrador that was removed
	 * @throws PortalException if a t_ ul_ administrador with the primary key could not be found
	 */
	public static T_Ul_Administrador deleteT_Ul_Administrador(long idAdmin)
		throws PortalException {

		return getService().deleteT_Ul_Administrador(idAdmin);
	}

	/**
	 * Deletes the t_ ul_ administrador from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect T_Ul_AdministradorLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param t_Ul_Administrador the t_ ul_ administrador
	 * @return the t_ ul_ administrador that was removed
	 */
	public static T_Ul_Administrador deleteT_Ul_Administrador(
		T_Ul_Administrador t_Ul_Administrador) {

		return getService().deleteT_Ul_Administrador(t_Ul_Administrador);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.aula.sb.model.impl.T_Ul_AdministradorModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.aula.sb.model.impl.T_Ul_AdministradorModelImpl</code>.
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

	public static T_Ul_Administrador fetchT_Ul_Administrador(long idAdmin) {
		return getService().fetchT_Ul_Administrador(idAdmin);
	}

	/**
	 * Returns the t_ ul_ administrador matching the UUID and group.
	 *
	 * @param uuid the t_ ul_ administrador's UUID
	 * @param groupId the primary key of the group
	 * @return the matching t_ ul_ administrador, or <code>null</code> if a matching t_ ul_ administrador could not be found
	 */
	public static T_Ul_Administrador fetchT_Ul_AdministradorByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchT_Ul_AdministradorByUuidAndGroupId(
			uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
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
	 * Returns the t_ ul_ administrador with the primary key.
	 *
	 * @param idAdmin the primary key of the t_ ul_ administrador
	 * @return the t_ ul_ administrador
	 * @throws PortalException if a t_ ul_ administrador with the primary key could not be found
	 */
	public static T_Ul_Administrador getT_Ul_Administrador(long idAdmin)
		throws PortalException {

		return getService().getT_Ul_Administrador(idAdmin);
	}

	/**
	 * Returns the t_ ul_ administrador matching the UUID and group.
	 *
	 * @param uuid the t_ ul_ administrador's UUID
	 * @param groupId the primary key of the group
	 * @return the matching t_ ul_ administrador
	 * @throws PortalException if a matching t_ ul_ administrador could not be found
	 */
	public static T_Ul_Administrador getT_Ul_AdministradorByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getT_Ul_AdministradorByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the t_ ul_ administradors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.aula.sb.model.impl.T_Ul_AdministradorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_ administradors
	 * @param end the upper bound of the range of t_ ul_ administradors (not inclusive)
	 * @return the range of t_ ul_ administradors
	 */
	public static List<T_Ul_Administrador> getT_Ul_Administradors(
		int start, int end) {

		return getService().getT_Ul_Administradors(start, end);
	}

	/**
	 * Returns all the t_ ul_ administradors matching the UUID and company.
	 *
	 * @param uuid the UUID of the t_ ul_ administradors
	 * @param companyId the primary key of the company
	 * @return the matching t_ ul_ administradors, or an empty list if no matches were found
	 */
	public static List<T_Ul_Administrador>
		getT_Ul_AdministradorsByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getT_Ul_AdministradorsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of t_ ul_ administradors matching the UUID and company.
	 *
	 * @param uuid the UUID of the t_ ul_ administradors
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of t_ ul_ administradors
	 * @param end the upper bound of the range of t_ ul_ administradors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching t_ ul_ administradors, or an empty list if no matches were found
	 */
	public static List<T_Ul_Administrador>
		getT_Ul_AdministradorsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<T_Ul_Administrador> orderByComparator) {

		return getService().getT_Ul_AdministradorsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of t_ ul_ administradors.
	 *
	 * @return the number of t_ ul_ administradors
	 */
	public static int getT_Ul_AdministradorsCount() {
		return getService().getT_Ul_AdministradorsCount();
	}

	/**
	 * Updates the t_ ul_ administrador in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect T_Ul_AdministradorLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param t_Ul_Administrador the t_ ul_ administrador
	 * @return the t_ ul_ administrador that was updated
	 */
	public static T_Ul_Administrador updateT_Ul_Administrador(
		T_Ul_Administrador t_Ul_Administrador) {

		return getService().updateT_Ul_Administrador(t_Ul_Administrador);
	}

	public static T_Ul_AdministradorLocalService getService() {
		return _service;
	}

	private static volatile T_Ul_AdministradorLocalService _service;

}
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

package com.aula.sb.service.persistence;

import com.aula.sb.model.T_Ul_Administrador;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the t_ ul_ administrador service. This utility wraps <code>com.aula.sb.service.persistence.impl.T_Ul_AdministradorPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see T_Ul_AdministradorPersistence
 * @generated
 */
public class T_Ul_AdministradorUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(T_Ul_Administrador t_Ul_Administrador) {
		getPersistence().clearCache(t_Ul_Administrador);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, T_Ul_Administrador> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<T_Ul_Administrador> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<T_Ul_Administrador> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<T_Ul_Administrador> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T_Ul_Administrador> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static T_Ul_Administrador update(
		T_Ul_Administrador t_Ul_Administrador) {

		return getPersistence().update(t_Ul_Administrador);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static T_Ul_Administrador update(
		T_Ul_Administrador t_Ul_Administrador, ServiceContext serviceContext) {

		return getPersistence().update(t_Ul_Administrador, serviceContext);
	}

	/**
	 * Returns all the t_ ul_ administradors where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching t_ ul_ administradors
	 */
	public static List<T_Ul_Administrador> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the t_ ul_ administradors where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_AdministradorModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of t_ ul_ administradors
	 * @param end the upper bound of the range of t_ ul_ administradors (not inclusive)
	 * @return the range of matching t_ ul_ administradors
	 */
	public static List<T_Ul_Administrador> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the t_ ul_ administradors where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_AdministradorModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of t_ ul_ administradors
	 * @param end the upper bound of the range of t_ ul_ administradors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t_ ul_ administradors
	 */
	public static List<T_Ul_Administrador> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<T_Ul_Administrador> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the t_ ul_ administradors where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_AdministradorModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of t_ ul_ administradors
	 * @param end the upper bound of the range of t_ ul_ administradors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching t_ ul_ administradors
	 */
	public static List<T_Ul_Administrador> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<T_Ul_Administrador> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first t_ ul_ administrador in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ administrador
	 * @throws NoSuchT_Ul_AdministradorException if a matching t_ ul_ administrador could not be found
	 */
	public static T_Ul_Administrador findByUuid_First(
			String uuid,
			OrderByComparator<T_Ul_Administrador> orderByComparator)
		throws com.aula.sb.exception.NoSuchT_Ul_AdministradorException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first t_ ul_ administrador in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ administrador, or <code>null</code> if a matching t_ ul_ administrador could not be found
	 */
	public static T_Ul_Administrador fetchByUuid_First(
		String uuid, OrderByComparator<T_Ul_Administrador> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last t_ ul_ administrador in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ administrador
	 * @throws NoSuchT_Ul_AdministradorException if a matching t_ ul_ administrador could not be found
	 */
	public static T_Ul_Administrador findByUuid_Last(
			String uuid,
			OrderByComparator<T_Ul_Administrador> orderByComparator)
		throws com.aula.sb.exception.NoSuchT_Ul_AdministradorException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last t_ ul_ administrador in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ administrador, or <code>null</code> if a matching t_ ul_ administrador could not be found
	 */
	public static T_Ul_Administrador fetchByUuid_Last(
		String uuid, OrderByComparator<T_Ul_Administrador> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the t_ ul_ administradors before and after the current t_ ul_ administrador in the ordered set where uuid = &#63;.
	 *
	 * @param idAdmin the primary key of the current t_ ul_ administrador
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t_ ul_ administrador
	 * @throws NoSuchT_Ul_AdministradorException if a t_ ul_ administrador with the primary key could not be found
	 */
	public static T_Ul_Administrador[] findByUuid_PrevAndNext(
			long idAdmin, String uuid,
			OrderByComparator<T_Ul_Administrador> orderByComparator)
		throws com.aula.sb.exception.NoSuchT_Ul_AdministradorException {

		return getPersistence().findByUuid_PrevAndNext(
			idAdmin, uuid, orderByComparator);
	}

	/**
	 * Removes all the t_ ul_ administradors where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of t_ ul_ administradors where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching t_ ul_ administradors
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the t_ ul_ administrador where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchT_Ul_AdministradorException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching t_ ul_ administrador
	 * @throws NoSuchT_Ul_AdministradorException if a matching t_ ul_ administrador could not be found
	 */
	public static T_Ul_Administrador findByUUID_G(String uuid, long groupId)
		throws com.aula.sb.exception.NoSuchT_Ul_AdministradorException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the t_ ul_ administrador where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching t_ ul_ administrador, or <code>null</code> if a matching t_ ul_ administrador could not be found
	 */
	public static T_Ul_Administrador fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the t_ ul_ administrador where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching t_ ul_ administrador, or <code>null</code> if a matching t_ ul_ administrador could not be found
	 */
	public static T_Ul_Administrador fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the t_ ul_ administrador where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the t_ ul_ administrador that was removed
	 */
	public static T_Ul_Administrador removeByUUID_G(String uuid, long groupId)
		throws com.aula.sb.exception.NoSuchT_Ul_AdministradorException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of t_ ul_ administradors where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching t_ ul_ administradors
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the t_ ul_ administradors where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching t_ ul_ administradors
	 */
	public static List<T_Ul_Administrador> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the t_ ul_ administradors where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_AdministradorModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of t_ ul_ administradors
	 * @param end the upper bound of the range of t_ ul_ administradors (not inclusive)
	 * @return the range of matching t_ ul_ administradors
	 */
	public static List<T_Ul_Administrador> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the t_ ul_ administradors where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_AdministradorModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of t_ ul_ administradors
	 * @param end the upper bound of the range of t_ ul_ administradors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t_ ul_ administradors
	 */
	public static List<T_Ul_Administrador> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<T_Ul_Administrador> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the t_ ul_ administradors where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_AdministradorModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of t_ ul_ administradors
	 * @param end the upper bound of the range of t_ ul_ administradors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching t_ ul_ administradors
	 */
	public static List<T_Ul_Administrador> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<T_Ul_Administrador> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first t_ ul_ administrador in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ administrador
	 * @throws NoSuchT_Ul_AdministradorException if a matching t_ ul_ administrador could not be found
	 */
	public static T_Ul_Administrador findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<T_Ul_Administrador> orderByComparator)
		throws com.aula.sb.exception.NoSuchT_Ul_AdministradorException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first t_ ul_ administrador in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ administrador, or <code>null</code> if a matching t_ ul_ administrador could not be found
	 */
	public static T_Ul_Administrador fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<T_Ul_Administrador> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last t_ ul_ administrador in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ administrador
	 * @throws NoSuchT_Ul_AdministradorException if a matching t_ ul_ administrador could not be found
	 */
	public static T_Ul_Administrador findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<T_Ul_Administrador> orderByComparator)
		throws com.aula.sb.exception.NoSuchT_Ul_AdministradorException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last t_ ul_ administrador in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ administrador, or <code>null</code> if a matching t_ ul_ administrador could not be found
	 */
	public static T_Ul_Administrador fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<T_Ul_Administrador> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the t_ ul_ administradors before and after the current t_ ul_ administrador in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param idAdmin the primary key of the current t_ ul_ administrador
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t_ ul_ administrador
	 * @throws NoSuchT_Ul_AdministradorException if a t_ ul_ administrador with the primary key could not be found
	 */
	public static T_Ul_Administrador[] findByUuid_C_PrevAndNext(
			long idAdmin, String uuid, long companyId,
			OrderByComparator<T_Ul_Administrador> orderByComparator)
		throws com.aula.sb.exception.NoSuchT_Ul_AdministradorException {

		return getPersistence().findByUuid_C_PrevAndNext(
			idAdmin, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the t_ ul_ administradors where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of t_ ul_ administradors where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching t_ ul_ administradors
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the t_ ul_ administradors where nombreAdmin = &#63;.
	 *
	 * @param nombreAdmin the nombre admin
	 * @return the matching t_ ul_ administradors
	 */
	public static List<T_Ul_Administrador> findBynombreAdmin(
		String nombreAdmin) {

		return getPersistence().findBynombreAdmin(nombreAdmin);
	}

	/**
	 * Returns a range of all the t_ ul_ administradors where nombreAdmin = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_AdministradorModelImpl</code>.
	 * </p>
	 *
	 * @param nombreAdmin the nombre admin
	 * @param start the lower bound of the range of t_ ul_ administradors
	 * @param end the upper bound of the range of t_ ul_ administradors (not inclusive)
	 * @return the range of matching t_ ul_ administradors
	 */
	public static List<T_Ul_Administrador> findBynombreAdmin(
		String nombreAdmin, int start, int end) {

		return getPersistence().findBynombreAdmin(nombreAdmin, start, end);
	}

	/**
	 * Returns an ordered range of all the t_ ul_ administradors where nombreAdmin = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_AdministradorModelImpl</code>.
	 * </p>
	 *
	 * @param nombreAdmin the nombre admin
	 * @param start the lower bound of the range of t_ ul_ administradors
	 * @param end the upper bound of the range of t_ ul_ administradors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t_ ul_ administradors
	 */
	public static List<T_Ul_Administrador> findBynombreAdmin(
		String nombreAdmin, int start, int end,
		OrderByComparator<T_Ul_Administrador> orderByComparator) {

		return getPersistence().findBynombreAdmin(
			nombreAdmin, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the t_ ul_ administradors where nombreAdmin = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_AdministradorModelImpl</code>.
	 * </p>
	 *
	 * @param nombreAdmin the nombre admin
	 * @param start the lower bound of the range of t_ ul_ administradors
	 * @param end the upper bound of the range of t_ ul_ administradors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching t_ ul_ administradors
	 */
	public static List<T_Ul_Administrador> findBynombreAdmin(
		String nombreAdmin, int start, int end,
		OrderByComparator<T_Ul_Administrador> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBynombreAdmin(
			nombreAdmin, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first t_ ul_ administrador in the ordered set where nombreAdmin = &#63;.
	 *
	 * @param nombreAdmin the nombre admin
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ administrador
	 * @throws NoSuchT_Ul_AdministradorException if a matching t_ ul_ administrador could not be found
	 */
	public static T_Ul_Administrador findBynombreAdmin_First(
			String nombreAdmin,
			OrderByComparator<T_Ul_Administrador> orderByComparator)
		throws com.aula.sb.exception.NoSuchT_Ul_AdministradorException {

		return getPersistence().findBynombreAdmin_First(
			nombreAdmin, orderByComparator);
	}

	/**
	 * Returns the first t_ ul_ administrador in the ordered set where nombreAdmin = &#63;.
	 *
	 * @param nombreAdmin the nombre admin
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ administrador, or <code>null</code> if a matching t_ ul_ administrador could not be found
	 */
	public static T_Ul_Administrador fetchBynombreAdmin_First(
		String nombreAdmin,
		OrderByComparator<T_Ul_Administrador> orderByComparator) {

		return getPersistence().fetchBynombreAdmin_First(
			nombreAdmin, orderByComparator);
	}

	/**
	 * Returns the last t_ ul_ administrador in the ordered set where nombreAdmin = &#63;.
	 *
	 * @param nombreAdmin the nombre admin
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ administrador
	 * @throws NoSuchT_Ul_AdministradorException if a matching t_ ul_ administrador could not be found
	 */
	public static T_Ul_Administrador findBynombreAdmin_Last(
			String nombreAdmin,
			OrderByComparator<T_Ul_Administrador> orderByComparator)
		throws com.aula.sb.exception.NoSuchT_Ul_AdministradorException {

		return getPersistence().findBynombreAdmin_Last(
			nombreAdmin, orderByComparator);
	}

	/**
	 * Returns the last t_ ul_ administrador in the ordered set where nombreAdmin = &#63;.
	 *
	 * @param nombreAdmin the nombre admin
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ administrador, or <code>null</code> if a matching t_ ul_ administrador could not be found
	 */
	public static T_Ul_Administrador fetchBynombreAdmin_Last(
		String nombreAdmin,
		OrderByComparator<T_Ul_Administrador> orderByComparator) {

		return getPersistence().fetchBynombreAdmin_Last(
			nombreAdmin, orderByComparator);
	}

	/**
	 * Returns the t_ ul_ administradors before and after the current t_ ul_ administrador in the ordered set where nombreAdmin = &#63;.
	 *
	 * @param idAdmin the primary key of the current t_ ul_ administrador
	 * @param nombreAdmin the nombre admin
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t_ ul_ administrador
	 * @throws NoSuchT_Ul_AdministradorException if a t_ ul_ administrador with the primary key could not be found
	 */
	public static T_Ul_Administrador[] findBynombreAdmin_PrevAndNext(
			long idAdmin, String nombreAdmin,
			OrderByComparator<T_Ul_Administrador> orderByComparator)
		throws com.aula.sb.exception.NoSuchT_Ul_AdministradorException {

		return getPersistence().findBynombreAdmin_PrevAndNext(
			idAdmin, nombreAdmin, orderByComparator);
	}

	/**
	 * Removes all the t_ ul_ administradors where nombreAdmin = &#63; from the database.
	 *
	 * @param nombreAdmin the nombre admin
	 */
	public static void removeBynombreAdmin(String nombreAdmin) {
		getPersistence().removeBynombreAdmin(nombreAdmin);
	}

	/**
	 * Returns the number of t_ ul_ administradors where nombreAdmin = &#63;.
	 *
	 * @param nombreAdmin the nombre admin
	 * @return the number of matching t_ ul_ administradors
	 */
	public static int countBynombreAdmin(String nombreAdmin) {
		return getPersistence().countBynombreAdmin(nombreAdmin);
	}

	/**
	 * Caches the t_ ul_ administrador in the entity cache if it is enabled.
	 *
	 * @param t_Ul_Administrador the t_ ul_ administrador
	 */
	public static void cacheResult(T_Ul_Administrador t_Ul_Administrador) {
		getPersistence().cacheResult(t_Ul_Administrador);
	}

	/**
	 * Caches the t_ ul_ administradors in the entity cache if it is enabled.
	 *
	 * @param t_Ul_Administradors the t_ ul_ administradors
	 */
	public static void cacheResult(
		List<T_Ul_Administrador> t_Ul_Administradors) {

		getPersistence().cacheResult(t_Ul_Administradors);
	}

	/**
	 * Creates a new t_ ul_ administrador with the primary key. Does not add the t_ ul_ administrador to the database.
	 *
	 * @param idAdmin the primary key for the new t_ ul_ administrador
	 * @return the new t_ ul_ administrador
	 */
	public static T_Ul_Administrador create(long idAdmin) {
		return getPersistence().create(idAdmin);
	}

	/**
	 * Removes the t_ ul_ administrador with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param idAdmin the primary key of the t_ ul_ administrador
	 * @return the t_ ul_ administrador that was removed
	 * @throws NoSuchT_Ul_AdministradorException if a t_ ul_ administrador with the primary key could not be found
	 */
	public static T_Ul_Administrador remove(long idAdmin)
		throws com.aula.sb.exception.NoSuchT_Ul_AdministradorException {

		return getPersistence().remove(idAdmin);
	}

	public static T_Ul_Administrador updateImpl(
		T_Ul_Administrador t_Ul_Administrador) {

		return getPersistence().updateImpl(t_Ul_Administrador);
	}

	/**
	 * Returns the t_ ul_ administrador with the primary key or throws a <code>NoSuchT_Ul_AdministradorException</code> if it could not be found.
	 *
	 * @param idAdmin the primary key of the t_ ul_ administrador
	 * @return the t_ ul_ administrador
	 * @throws NoSuchT_Ul_AdministradorException if a t_ ul_ administrador with the primary key could not be found
	 */
	public static T_Ul_Administrador findByPrimaryKey(long idAdmin)
		throws com.aula.sb.exception.NoSuchT_Ul_AdministradorException {

		return getPersistence().findByPrimaryKey(idAdmin);
	}

	/**
	 * Returns the t_ ul_ administrador with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param idAdmin the primary key of the t_ ul_ administrador
	 * @return the t_ ul_ administrador, or <code>null</code> if a t_ ul_ administrador with the primary key could not be found
	 */
	public static T_Ul_Administrador fetchByPrimaryKey(long idAdmin) {
		return getPersistence().fetchByPrimaryKey(idAdmin);
	}

	/**
	 * Returns all the t_ ul_ administradors.
	 *
	 * @return the t_ ul_ administradors
	 */
	public static List<T_Ul_Administrador> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the t_ ul_ administradors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_AdministradorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_ administradors
	 * @param end the upper bound of the range of t_ ul_ administradors (not inclusive)
	 * @return the range of t_ ul_ administradors
	 */
	public static List<T_Ul_Administrador> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the t_ ul_ administradors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_AdministradorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_ administradors
	 * @param end the upper bound of the range of t_ ul_ administradors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of t_ ul_ administradors
	 */
	public static List<T_Ul_Administrador> findAll(
		int start, int end,
		OrderByComparator<T_Ul_Administrador> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the t_ ul_ administradors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_AdministradorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_ administradors
	 * @param end the upper bound of the range of t_ ul_ administradors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of t_ ul_ administradors
	 */
	public static List<T_Ul_Administrador> findAll(
		int start, int end,
		OrderByComparator<T_Ul_Administrador> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the t_ ul_ administradors from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of t_ ul_ administradors.
	 *
	 * @return the number of t_ ul_ administradors
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static T_Ul_AdministradorPersistence getPersistence() {
		return _persistence;
	}

	private static volatile T_Ul_AdministradorPersistence _persistence;

}
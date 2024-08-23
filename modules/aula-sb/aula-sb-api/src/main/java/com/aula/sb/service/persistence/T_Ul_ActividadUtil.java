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

import com.aula.sb.model.T_Ul_Actividad;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the t_ ul_ actividad service. This utility wraps <code>com.aula.sb.service.persistence.impl.T_Ul_ActividadPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see T_Ul_ActividadPersistence
 * @generated
 */
public class T_Ul_ActividadUtil {

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
	public static void clearCache(T_Ul_Actividad t_Ul_Actividad) {
		getPersistence().clearCache(t_Ul_Actividad);
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
	public static Map<Serializable, T_Ul_Actividad> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<T_Ul_Actividad> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<T_Ul_Actividad> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<T_Ul_Actividad> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T_Ul_Actividad> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static T_Ul_Actividad update(T_Ul_Actividad t_Ul_Actividad) {
		return getPersistence().update(t_Ul_Actividad);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static T_Ul_Actividad update(
		T_Ul_Actividad t_Ul_Actividad, ServiceContext serviceContext) {

		return getPersistence().update(t_Ul_Actividad, serviceContext);
	}

	/**
	 * Returns all the t_ ul_ actividads where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching t_ ul_ actividads
	 */
	public static List<T_Ul_Actividad> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the t_ ul_ actividads where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_ActividadModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of t_ ul_ actividads
	 * @param end the upper bound of the range of t_ ul_ actividads (not inclusive)
	 * @return the range of matching t_ ul_ actividads
	 */
	public static List<T_Ul_Actividad> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the t_ ul_ actividads where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_ActividadModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of t_ ul_ actividads
	 * @param end the upper bound of the range of t_ ul_ actividads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t_ ul_ actividads
	 */
	public static List<T_Ul_Actividad> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<T_Ul_Actividad> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the t_ ul_ actividads where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_ActividadModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of t_ ul_ actividads
	 * @param end the upper bound of the range of t_ ul_ actividads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching t_ ul_ actividads
	 */
	public static List<T_Ul_Actividad> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<T_Ul_Actividad> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first t_ ul_ actividad in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ actividad
	 * @throws NoSuchT_Ul_ActividadException if a matching t_ ul_ actividad could not be found
	 */
	public static T_Ul_Actividad findByUuid_First(
			String uuid, OrderByComparator<T_Ul_Actividad> orderByComparator)
		throws com.aula.sb.exception.NoSuchT_Ul_ActividadException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first t_ ul_ actividad in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ actividad, or <code>null</code> if a matching t_ ul_ actividad could not be found
	 */
	public static T_Ul_Actividad fetchByUuid_First(
		String uuid, OrderByComparator<T_Ul_Actividad> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last t_ ul_ actividad in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ actividad
	 * @throws NoSuchT_Ul_ActividadException if a matching t_ ul_ actividad could not be found
	 */
	public static T_Ul_Actividad findByUuid_Last(
			String uuid, OrderByComparator<T_Ul_Actividad> orderByComparator)
		throws com.aula.sb.exception.NoSuchT_Ul_ActividadException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last t_ ul_ actividad in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ actividad, or <code>null</code> if a matching t_ ul_ actividad could not be found
	 */
	public static T_Ul_Actividad fetchByUuid_Last(
		String uuid, OrderByComparator<T_Ul_Actividad> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the t_ ul_ actividads before and after the current t_ ul_ actividad in the ordered set where uuid = &#63;.
	 *
	 * @param idActividad the primary key of the current t_ ul_ actividad
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t_ ul_ actividad
	 * @throws NoSuchT_Ul_ActividadException if a t_ ul_ actividad with the primary key could not be found
	 */
	public static T_Ul_Actividad[] findByUuid_PrevAndNext(
			long idActividad, String uuid,
			OrderByComparator<T_Ul_Actividad> orderByComparator)
		throws com.aula.sb.exception.NoSuchT_Ul_ActividadException {

		return getPersistence().findByUuid_PrevAndNext(
			idActividad, uuid, orderByComparator);
	}

	/**
	 * Removes all the t_ ul_ actividads where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of t_ ul_ actividads where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching t_ ul_ actividads
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the t_ ul_ actividad where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchT_Ul_ActividadException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching t_ ul_ actividad
	 * @throws NoSuchT_Ul_ActividadException if a matching t_ ul_ actividad could not be found
	 */
	public static T_Ul_Actividad findByUUID_G(String uuid, long groupId)
		throws com.aula.sb.exception.NoSuchT_Ul_ActividadException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the t_ ul_ actividad where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching t_ ul_ actividad, or <code>null</code> if a matching t_ ul_ actividad could not be found
	 */
	public static T_Ul_Actividad fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the t_ ul_ actividad where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching t_ ul_ actividad, or <code>null</code> if a matching t_ ul_ actividad could not be found
	 */
	public static T_Ul_Actividad fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the t_ ul_ actividad where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the t_ ul_ actividad that was removed
	 */
	public static T_Ul_Actividad removeByUUID_G(String uuid, long groupId)
		throws com.aula.sb.exception.NoSuchT_Ul_ActividadException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of t_ ul_ actividads where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching t_ ul_ actividads
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the t_ ul_ actividads where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching t_ ul_ actividads
	 */
	public static List<T_Ul_Actividad> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the t_ ul_ actividads where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_ActividadModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of t_ ul_ actividads
	 * @param end the upper bound of the range of t_ ul_ actividads (not inclusive)
	 * @return the range of matching t_ ul_ actividads
	 */
	public static List<T_Ul_Actividad> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the t_ ul_ actividads where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_ActividadModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of t_ ul_ actividads
	 * @param end the upper bound of the range of t_ ul_ actividads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t_ ul_ actividads
	 */
	public static List<T_Ul_Actividad> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<T_Ul_Actividad> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the t_ ul_ actividads where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_ActividadModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of t_ ul_ actividads
	 * @param end the upper bound of the range of t_ ul_ actividads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching t_ ul_ actividads
	 */
	public static List<T_Ul_Actividad> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<T_Ul_Actividad> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first t_ ul_ actividad in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ actividad
	 * @throws NoSuchT_Ul_ActividadException if a matching t_ ul_ actividad could not be found
	 */
	public static T_Ul_Actividad findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<T_Ul_Actividad> orderByComparator)
		throws com.aula.sb.exception.NoSuchT_Ul_ActividadException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first t_ ul_ actividad in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ actividad, or <code>null</code> if a matching t_ ul_ actividad could not be found
	 */
	public static T_Ul_Actividad fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<T_Ul_Actividad> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last t_ ul_ actividad in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ actividad
	 * @throws NoSuchT_Ul_ActividadException if a matching t_ ul_ actividad could not be found
	 */
	public static T_Ul_Actividad findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<T_Ul_Actividad> orderByComparator)
		throws com.aula.sb.exception.NoSuchT_Ul_ActividadException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last t_ ul_ actividad in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ actividad, or <code>null</code> if a matching t_ ul_ actividad could not be found
	 */
	public static T_Ul_Actividad fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<T_Ul_Actividad> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the t_ ul_ actividads before and after the current t_ ul_ actividad in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param idActividad the primary key of the current t_ ul_ actividad
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t_ ul_ actividad
	 * @throws NoSuchT_Ul_ActividadException if a t_ ul_ actividad with the primary key could not be found
	 */
	public static T_Ul_Actividad[] findByUuid_C_PrevAndNext(
			long idActividad, String uuid, long companyId,
			OrderByComparator<T_Ul_Actividad> orderByComparator)
		throws com.aula.sb.exception.NoSuchT_Ul_ActividadException {

		return getPersistence().findByUuid_C_PrevAndNext(
			idActividad, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the t_ ul_ actividads where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of t_ ul_ actividads where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching t_ ul_ actividads
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the t_ ul_ actividads where tituloActividad = &#63;.
	 *
	 * @param tituloActividad the titulo actividad
	 * @return the matching t_ ul_ actividads
	 */
	public static List<T_Ul_Actividad> findByTituloActividad(
		String tituloActividad) {

		return getPersistence().findByTituloActividad(tituloActividad);
	}

	/**
	 * Returns a range of all the t_ ul_ actividads where tituloActividad = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_ActividadModelImpl</code>.
	 * </p>
	 *
	 * @param tituloActividad the titulo actividad
	 * @param start the lower bound of the range of t_ ul_ actividads
	 * @param end the upper bound of the range of t_ ul_ actividads (not inclusive)
	 * @return the range of matching t_ ul_ actividads
	 */
	public static List<T_Ul_Actividad> findByTituloActividad(
		String tituloActividad, int start, int end) {

		return getPersistence().findByTituloActividad(
			tituloActividad, start, end);
	}

	/**
	 * Returns an ordered range of all the t_ ul_ actividads where tituloActividad = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_ActividadModelImpl</code>.
	 * </p>
	 *
	 * @param tituloActividad the titulo actividad
	 * @param start the lower bound of the range of t_ ul_ actividads
	 * @param end the upper bound of the range of t_ ul_ actividads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t_ ul_ actividads
	 */
	public static List<T_Ul_Actividad> findByTituloActividad(
		String tituloActividad, int start, int end,
		OrderByComparator<T_Ul_Actividad> orderByComparator) {

		return getPersistence().findByTituloActividad(
			tituloActividad, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the t_ ul_ actividads where tituloActividad = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_ActividadModelImpl</code>.
	 * </p>
	 *
	 * @param tituloActividad the titulo actividad
	 * @param start the lower bound of the range of t_ ul_ actividads
	 * @param end the upper bound of the range of t_ ul_ actividads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching t_ ul_ actividads
	 */
	public static List<T_Ul_Actividad> findByTituloActividad(
		String tituloActividad, int start, int end,
		OrderByComparator<T_Ul_Actividad> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByTituloActividad(
			tituloActividad, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first t_ ul_ actividad in the ordered set where tituloActividad = &#63;.
	 *
	 * @param tituloActividad the titulo actividad
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ actividad
	 * @throws NoSuchT_Ul_ActividadException if a matching t_ ul_ actividad could not be found
	 */
	public static T_Ul_Actividad findByTituloActividad_First(
			String tituloActividad,
			OrderByComparator<T_Ul_Actividad> orderByComparator)
		throws com.aula.sb.exception.NoSuchT_Ul_ActividadException {

		return getPersistence().findByTituloActividad_First(
			tituloActividad, orderByComparator);
	}

	/**
	 * Returns the first t_ ul_ actividad in the ordered set where tituloActividad = &#63;.
	 *
	 * @param tituloActividad the titulo actividad
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ actividad, or <code>null</code> if a matching t_ ul_ actividad could not be found
	 */
	public static T_Ul_Actividad fetchByTituloActividad_First(
		String tituloActividad,
		OrderByComparator<T_Ul_Actividad> orderByComparator) {

		return getPersistence().fetchByTituloActividad_First(
			tituloActividad, orderByComparator);
	}

	/**
	 * Returns the last t_ ul_ actividad in the ordered set where tituloActividad = &#63;.
	 *
	 * @param tituloActividad the titulo actividad
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ actividad
	 * @throws NoSuchT_Ul_ActividadException if a matching t_ ul_ actividad could not be found
	 */
	public static T_Ul_Actividad findByTituloActividad_Last(
			String tituloActividad,
			OrderByComparator<T_Ul_Actividad> orderByComparator)
		throws com.aula.sb.exception.NoSuchT_Ul_ActividadException {

		return getPersistence().findByTituloActividad_Last(
			tituloActividad, orderByComparator);
	}

	/**
	 * Returns the last t_ ul_ actividad in the ordered set where tituloActividad = &#63;.
	 *
	 * @param tituloActividad the titulo actividad
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ actividad, or <code>null</code> if a matching t_ ul_ actividad could not be found
	 */
	public static T_Ul_Actividad fetchByTituloActividad_Last(
		String tituloActividad,
		OrderByComparator<T_Ul_Actividad> orderByComparator) {

		return getPersistence().fetchByTituloActividad_Last(
			tituloActividad, orderByComparator);
	}

	/**
	 * Returns the t_ ul_ actividads before and after the current t_ ul_ actividad in the ordered set where tituloActividad = &#63;.
	 *
	 * @param idActividad the primary key of the current t_ ul_ actividad
	 * @param tituloActividad the titulo actividad
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t_ ul_ actividad
	 * @throws NoSuchT_Ul_ActividadException if a t_ ul_ actividad with the primary key could not be found
	 */
	public static T_Ul_Actividad[] findByTituloActividad_PrevAndNext(
			long idActividad, String tituloActividad,
			OrderByComparator<T_Ul_Actividad> orderByComparator)
		throws com.aula.sb.exception.NoSuchT_Ul_ActividadException {

		return getPersistence().findByTituloActividad_PrevAndNext(
			idActividad, tituloActividad, orderByComparator);
	}

	/**
	 * Removes all the t_ ul_ actividads where tituloActividad = &#63; from the database.
	 *
	 * @param tituloActividad the titulo actividad
	 */
	public static void removeByTituloActividad(String tituloActividad) {
		getPersistence().removeByTituloActividad(tituloActividad);
	}

	/**
	 * Returns the number of t_ ul_ actividads where tituloActividad = &#63;.
	 *
	 * @param tituloActividad the titulo actividad
	 * @return the number of matching t_ ul_ actividads
	 */
	public static int countByTituloActividad(String tituloActividad) {
		return getPersistence().countByTituloActividad(tituloActividad);
	}

	/**
	 * Caches the t_ ul_ actividad in the entity cache if it is enabled.
	 *
	 * @param t_Ul_Actividad the t_ ul_ actividad
	 */
	public static void cacheResult(T_Ul_Actividad t_Ul_Actividad) {
		getPersistence().cacheResult(t_Ul_Actividad);
	}

	/**
	 * Caches the t_ ul_ actividads in the entity cache if it is enabled.
	 *
	 * @param t_Ul_Actividads the t_ ul_ actividads
	 */
	public static void cacheResult(List<T_Ul_Actividad> t_Ul_Actividads) {
		getPersistence().cacheResult(t_Ul_Actividads);
	}

	/**
	 * Creates a new t_ ul_ actividad with the primary key. Does not add the t_ ul_ actividad to the database.
	 *
	 * @param idActividad the primary key for the new t_ ul_ actividad
	 * @return the new t_ ul_ actividad
	 */
	public static T_Ul_Actividad create(long idActividad) {
		return getPersistence().create(idActividad);
	}

	/**
	 * Removes the t_ ul_ actividad with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param idActividad the primary key of the t_ ul_ actividad
	 * @return the t_ ul_ actividad that was removed
	 * @throws NoSuchT_Ul_ActividadException if a t_ ul_ actividad with the primary key could not be found
	 */
	public static T_Ul_Actividad remove(long idActividad)
		throws com.aula.sb.exception.NoSuchT_Ul_ActividadException {

		return getPersistence().remove(idActividad);
	}

	public static T_Ul_Actividad updateImpl(T_Ul_Actividad t_Ul_Actividad) {
		return getPersistence().updateImpl(t_Ul_Actividad);
	}

	/**
	 * Returns the t_ ul_ actividad with the primary key or throws a <code>NoSuchT_Ul_ActividadException</code> if it could not be found.
	 *
	 * @param idActividad the primary key of the t_ ul_ actividad
	 * @return the t_ ul_ actividad
	 * @throws NoSuchT_Ul_ActividadException if a t_ ul_ actividad with the primary key could not be found
	 */
	public static T_Ul_Actividad findByPrimaryKey(long idActividad)
		throws com.aula.sb.exception.NoSuchT_Ul_ActividadException {

		return getPersistence().findByPrimaryKey(idActividad);
	}

	/**
	 * Returns the t_ ul_ actividad with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param idActividad the primary key of the t_ ul_ actividad
	 * @return the t_ ul_ actividad, or <code>null</code> if a t_ ul_ actividad with the primary key could not be found
	 */
	public static T_Ul_Actividad fetchByPrimaryKey(long idActividad) {
		return getPersistence().fetchByPrimaryKey(idActividad);
	}

	/**
	 * Returns all the t_ ul_ actividads.
	 *
	 * @return the t_ ul_ actividads
	 */
	public static List<T_Ul_Actividad> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the t_ ul_ actividads.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_ActividadModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_ actividads
	 * @param end the upper bound of the range of t_ ul_ actividads (not inclusive)
	 * @return the range of t_ ul_ actividads
	 */
	public static List<T_Ul_Actividad> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the t_ ul_ actividads.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_ActividadModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_ actividads
	 * @param end the upper bound of the range of t_ ul_ actividads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of t_ ul_ actividads
	 */
	public static List<T_Ul_Actividad> findAll(
		int start, int end,
		OrderByComparator<T_Ul_Actividad> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the t_ ul_ actividads.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_ActividadModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_ actividads
	 * @param end the upper bound of the range of t_ ul_ actividads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of t_ ul_ actividads
	 */
	public static List<T_Ul_Actividad> findAll(
		int start, int end, OrderByComparator<T_Ul_Actividad> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the t_ ul_ actividads from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of t_ ul_ actividads.
	 *
	 * @return the number of t_ ul_ actividads
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static T_Ul_ActividadPersistence getPersistence() {
		return _persistence;
	}

	private static volatile T_Ul_ActividadPersistence _persistence;

}
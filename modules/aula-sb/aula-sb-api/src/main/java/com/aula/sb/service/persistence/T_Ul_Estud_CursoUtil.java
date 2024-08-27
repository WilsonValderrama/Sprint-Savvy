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

import com.aula.sb.model.T_Ul_Estud_Curso;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the t_ ul_ estud_ curso service. This utility wraps <code>com.aula.sb.service.persistence.impl.T_Ul_Estud_CursoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see T_Ul_Estud_CursoPersistence
 * @generated
 */
public class T_Ul_Estud_CursoUtil {

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
	public static void clearCache(T_Ul_Estud_Curso t_Ul_Estud_Curso) {
		getPersistence().clearCache(t_Ul_Estud_Curso);
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
	public static Map<Serializable, T_Ul_Estud_Curso> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<T_Ul_Estud_Curso> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<T_Ul_Estud_Curso> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<T_Ul_Estud_Curso> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T_Ul_Estud_Curso> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static T_Ul_Estud_Curso update(T_Ul_Estud_Curso t_Ul_Estud_Curso) {
		return getPersistence().update(t_Ul_Estud_Curso);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static T_Ul_Estud_Curso update(
		T_Ul_Estud_Curso t_Ul_Estud_Curso, ServiceContext serviceContext) {

		return getPersistence().update(t_Ul_Estud_Curso, serviceContext);
	}

	/**
	 * Returns all the t_ ul_ estud_ cursos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching t_ ul_ estud_ cursos
	 */
	public static List<T_Ul_Estud_Curso> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the t_ ul_ estud_ cursos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_Estud_CursoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of t_ ul_ estud_ cursos
	 * @param end the upper bound of the range of t_ ul_ estud_ cursos (not inclusive)
	 * @return the range of matching t_ ul_ estud_ cursos
	 */
	public static List<T_Ul_Estud_Curso> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the t_ ul_ estud_ cursos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_Estud_CursoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of t_ ul_ estud_ cursos
	 * @param end the upper bound of the range of t_ ul_ estud_ cursos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t_ ul_ estud_ cursos
	 */
	public static List<T_Ul_Estud_Curso> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<T_Ul_Estud_Curso> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the t_ ul_ estud_ cursos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_Estud_CursoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of t_ ul_ estud_ cursos
	 * @param end the upper bound of the range of t_ ul_ estud_ cursos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching t_ ul_ estud_ cursos
	 */
	public static List<T_Ul_Estud_Curso> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<T_Ul_Estud_Curso> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first t_ ul_ estud_ curso in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ estud_ curso
	 * @throws NoSuchT_Ul_Estud_CursoException if a matching t_ ul_ estud_ curso could not be found
	 */
	public static T_Ul_Estud_Curso findByUuid_First(
			String uuid, OrderByComparator<T_Ul_Estud_Curso> orderByComparator)
		throws com.aula.sb.exception.NoSuchT_Ul_Estud_CursoException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first t_ ul_ estud_ curso in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ estud_ curso, or <code>null</code> if a matching t_ ul_ estud_ curso could not be found
	 */
	public static T_Ul_Estud_Curso fetchByUuid_First(
		String uuid, OrderByComparator<T_Ul_Estud_Curso> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last t_ ul_ estud_ curso in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ estud_ curso
	 * @throws NoSuchT_Ul_Estud_CursoException if a matching t_ ul_ estud_ curso could not be found
	 */
	public static T_Ul_Estud_Curso findByUuid_Last(
			String uuid, OrderByComparator<T_Ul_Estud_Curso> orderByComparator)
		throws com.aula.sb.exception.NoSuchT_Ul_Estud_CursoException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last t_ ul_ estud_ curso in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ estud_ curso, or <code>null</code> if a matching t_ ul_ estud_ curso could not be found
	 */
	public static T_Ul_Estud_Curso fetchByUuid_Last(
		String uuid, OrderByComparator<T_Ul_Estud_Curso> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the t_ ul_ estud_ cursos before and after the current t_ ul_ estud_ curso in the ordered set where uuid = &#63;.
	 *
	 * @param t_Ul_Estud_CursoPK the primary key of the current t_ ul_ estud_ curso
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t_ ul_ estud_ curso
	 * @throws NoSuchT_Ul_Estud_CursoException if a t_ ul_ estud_ curso with the primary key could not be found
	 */
	public static T_Ul_Estud_Curso[] findByUuid_PrevAndNext(
			T_Ul_Estud_CursoPK t_Ul_Estud_CursoPK, String uuid,
			OrderByComparator<T_Ul_Estud_Curso> orderByComparator)
		throws com.aula.sb.exception.NoSuchT_Ul_Estud_CursoException {

		return getPersistence().findByUuid_PrevAndNext(
			t_Ul_Estud_CursoPK, uuid, orderByComparator);
	}

	/**
	 * Removes all the t_ ul_ estud_ cursos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of t_ ul_ estud_ cursos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching t_ ul_ estud_ cursos
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the t_ ul_ estud_ curso where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchT_Ul_Estud_CursoException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching t_ ul_ estud_ curso
	 * @throws NoSuchT_Ul_Estud_CursoException if a matching t_ ul_ estud_ curso could not be found
	 */
	public static T_Ul_Estud_Curso findByUUID_G(String uuid, long groupId)
		throws com.aula.sb.exception.NoSuchT_Ul_Estud_CursoException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the t_ ul_ estud_ curso where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching t_ ul_ estud_ curso, or <code>null</code> if a matching t_ ul_ estud_ curso could not be found
	 */
	public static T_Ul_Estud_Curso fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the t_ ul_ estud_ curso where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching t_ ul_ estud_ curso, or <code>null</code> if a matching t_ ul_ estud_ curso could not be found
	 */
	public static T_Ul_Estud_Curso fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the t_ ul_ estud_ curso where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the t_ ul_ estud_ curso that was removed
	 */
	public static T_Ul_Estud_Curso removeByUUID_G(String uuid, long groupId)
		throws com.aula.sb.exception.NoSuchT_Ul_Estud_CursoException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of t_ ul_ estud_ cursos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching t_ ul_ estud_ cursos
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the t_ ul_ estud_ cursos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching t_ ul_ estud_ cursos
	 */
	public static List<T_Ul_Estud_Curso> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the t_ ul_ estud_ cursos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_Estud_CursoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of t_ ul_ estud_ cursos
	 * @param end the upper bound of the range of t_ ul_ estud_ cursos (not inclusive)
	 * @return the range of matching t_ ul_ estud_ cursos
	 */
	public static List<T_Ul_Estud_Curso> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the t_ ul_ estud_ cursos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_Estud_CursoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of t_ ul_ estud_ cursos
	 * @param end the upper bound of the range of t_ ul_ estud_ cursos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t_ ul_ estud_ cursos
	 */
	public static List<T_Ul_Estud_Curso> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<T_Ul_Estud_Curso> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the t_ ul_ estud_ cursos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_Estud_CursoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of t_ ul_ estud_ cursos
	 * @param end the upper bound of the range of t_ ul_ estud_ cursos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching t_ ul_ estud_ cursos
	 */
	public static List<T_Ul_Estud_Curso> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<T_Ul_Estud_Curso> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first t_ ul_ estud_ curso in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ estud_ curso
	 * @throws NoSuchT_Ul_Estud_CursoException if a matching t_ ul_ estud_ curso could not be found
	 */
	public static T_Ul_Estud_Curso findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<T_Ul_Estud_Curso> orderByComparator)
		throws com.aula.sb.exception.NoSuchT_Ul_Estud_CursoException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first t_ ul_ estud_ curso in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ estud_ curso, or <code>null</code> if a matching t_ ul_ estud_ curso could not be found
	 */
	public static T_Ul_Estud_Curso fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<T_Ul_Estud_Curso> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last t_ ul_ estud_ curso in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ estud_ curso
	 * @throws NoSuchT_Ul_Estud_CursoException if a matching t_ ul_ estud_ curso could not be found
	 */
	public static T_Ul_Estud_Curso findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<T_Ul_Estud_Curso> orderByComparator)
		throws com.aula.sb.exception.NoSuchT_Ul_Estud_CursoException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last t_ ul_ estud_ curso in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ estud_ curso, or <code>null</code> if a matching t_ ul_ estud_ curso could not be found
	 */
	public static T_Ul_Estud_Curso fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<T_Ul_Estud_Curso> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the t_ ul_ estud_ cursos before and after the current t_ ul_ estud_ curso in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param t_Ul_Estud_CursoPK the primary key of the current t_ ul_ estud_ curso
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t_ ul_ estud_ curso
	 * @throws NoSuchT_Ul_Estud_CursoException if a t_ ul_ estud_ curso with the primary key could not be found
	 */
	public static T_Ul_Estud_Curso[] findByUuid_C_PrevAndNext(
			T_Ul_Estud_CursoPK t_Ul_Estud_CursoPK, String uuid, long companyId,
			OrderByComparator<T_Ul_Estud_Curso> orderByComparator)
		throws com.aula.sb.exception.NoSuchT_Ul_Estud_CursoException {

		return getPersistence().findByUuid_C_PrevAndNext(
			t_Ul_Estud_CursoPK, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the t_ ul_ estud_ cursos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of t_ ul_ estud_ cursos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching t_ ul_ estud_ cursos
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the t_ ul_ estud_ cursos where T_Ul_Estudiante_id = &#63;.
	 *
	 * @param T_Ul_Estudiante_id the t_ ul_ estudiante_id
	 * @return the matching t_ ul_ estud_ cursos
	 */
	public static List<T_Ul_Estud_Curso> findByT_Ul_Estudiante_id(
		long T_Ul_Estudiante_id) {

		return getPersistence().findByT_Ul_Estudiante_id(T_Ul_Estudiante_id);
	}

	/**
	 * Returns a range of all the t_ ul_ estud_ cursos where T_Ul_Estudiante_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_Estud_CursoModelImpl</code>.
	 * </p>
	 *
	 * @param T_Ul_Estudiante_id the t_ ul_ estudiante_id
	 * @param start the lower bound of the range of t_ ul_ estud_ cursos
	 * @param end the upper bound of the range of t_ ul_ estud_ cursos (not inclusive)
	 * @return the range of matching t_ ul_ estud_ cursos
	 */
	public static List<T_Ul_Estud_Curso> findByT_Ul_Estudiante_id(
		long T_Ul_Estudiante_id, int start, int end) {

		return getPersistence().findByT_Ul_Estudiante_id(
			T_Ul_Estudiante_id, start, end);
	}

	/**
	 * Returns an ordered range of all the t_ ul_ estud_ cursos where T_Ul_Estudiante_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_Estud_CursoModelImpl</code>.
	 * </p>
	 *
	 * @param T_Ul_Estudiante_id the t_ ul_ estudiante_id
	 * @param start the lower bound of the range of t_ ul_ estud_ cursos
	 * @param end the upper bound of the range of t_ ul_ estud_ cursos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t_ ul_ estud_ cursos
	 */
	public static List<T_Ul_Estud_Curso> findByT_Ul_Estudiante_id(
		long T_Ul_Estudiante_id, int start, int end,
		OrderByComparator<T_Ul_Estud_Curso> orderByComparator) {

		return getPersistence().findByT_Ul_Estudiante_id(
			T_Ul_Estudiante_id, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the t_ ul_ estud_ cursos where T_Ul_Estudiante_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_Estud_CursoModelImpl</code>.
	 * </p>
	 *
	 * @param T_Ul_Estudiante_id the t_ ul_ estudiante_id
	 * @param start the lower bound of the range of t_ ul_ estud_ cursos
	 * @param end the upper bound of the range of t_ ul_ estud_ cursos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching t_ ul_ estud_ cursos
	 */
	public static List<T_Ul_Estud_Curso> findByT_Ul_Estudiante_id(
		long T_Ul_Estudiante_id, int start, int end,
		OrderByComparator<T_Ul_Estud_Curso> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByT_Ul_Estudiante_id(
			T_Ul_Estudiante_id, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first t_ ul_ estud_ curso in the ordered set where T_Ul_Estudiante_id = &#63;.
	 *
	 * @param T_Ul_Estudiante_id the t_ ul_ estudiante_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ estud_ curso
	 * @throws NoSuchT_Ul_Estud_CursoException if a matching t_ ul_ estud_ curso could not be found
	 */
	public static T_Ul_Estud_Curso findByT_Ul_Estudiante_id_First(
			long T_Ul_Estudiante_id,
			OrderByComparator<T_Ul_Estud_Curso> orderByComparator)
		throws com.aula.sb.exception.NoSuchT_Ul_Estud_CursoException {

		return getPersistence().findByT_Ul_Estudiante_id_First(
			T_Ul_Estudiante_id, orderByComparator);
	}

	/**
	 * Returns the first t_ ul_ estud_ curso in the ordered set where T_Ul_Estudiante_id = &#63;.
	 *
	 * @param T_Ul_Estudiante_id the t_ ul_ estudiante_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ estud_ curso, or <code>null</code> if a matching t_ ul_ estud_ curso could not be found
	 */
	public static T_Ul_Estud_Curso fetchByT_Ul_Estudiante_id_First(
		long T_Ul_Estudiante_id,
		OrderByComparator<T_Ul_Estud_Curso> orderByComparator) {

		return getPersistence().fetchByT_Ul_Estudiante_id_First(
			T_Ul_Estudiante_id, orderByComparator);
	}

	/**
	 * Returns the last t_ ul_ estud_ curso in the ordered set where T_Ul_Estudiante_id = &#63;.
	 *
	 * @param T_Ul_Estudiante_id the t_ ul_ estudiante_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ estud_ curso
	 * @throws NoSuchT_Ul_Estud_CursoException if a matching t_ ul_ estud_ curso could not be found
	 */
	public static T_Ul_Estud_Curso findByT_Ul_Estudiante_id_Last(
			long T_Ul_Estudiante_id,
			OrderByComparator<T_Ul_Estud_Curso> orderByComparator)
		throws com.aula.sb.exception.NoSuchT_Ul_Estud_CursoException {

		return getPersistence().findByT_Ul_Estudiante_id_Last(
			T_Ul_Estudiante_id, orderByComparator);
	}

	/**
	 * Returns the last t_ ul_ estud_ curso in the ordered set where T_Ul_Estudiante_id = &#63;.
	 *
	 * @param T_Ul_Estudiante_id the t_ ul_ estudiante_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ estud_ curso, or <code>null</code> if a matching t_ ul_ estud_ curso could not be found
	 */
	public static T_Ul_Estud_Curso fetchByT_Ul_Estudiante_id_Last(
		long T_Ul_Estudiante_id,
		OrderByComparator<T_Ul_Estud_Curso> orderByComparator) {

		return getPersistence().fetchByT_Ul_Estudiante_id_Last(
			T_Ul_Estudiante_id, orderByComparator);
	}

	/**
	 * Returns the t_ ul_ estud_ cursos before and after the current t_ ul_ estud_ curso in the ordered set where T_Ul_Estudiante_id = &#63;.
	 *
	 * @param t_Ul_Estud_CursoPK the primary key of the current t_ ul_ estud_ curso
	 * @param T_Ul_Estudiante_id the t_ ul_ estudiante_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t_ ul_ estud_ curso
	 * @throws NoSuchT_Ul_Estud_CursoException if a t_ ul_ estud_ curso with the primary key could not be found
	 */
	public static T_Ul_Estud_Curso[] findByT_Ul_Estudiante_id_PrevAndNext(
			T_Ul_Estud_CursoPK t_Ul_Estud_CursoPK, long T_Ul_Estudiante_id,
			OrderByComparator<T_Ul_Estud_Curso> orderByComparator)
		throws com.aula.sb.exception.NoSuchT_Ul_Estud_CursoException {

		return getPersistence().findByT_Ul_Estudiante_id_PrevAndNext(
			t_Ul_Estud_CursoPK, T_Ul_Estudiante_id, orderByComparator);
	}

	/**
	 * Removes all the t_ ul_ estud_ cursos where T_Ul_Estudiante_id = &#63; from the database.
	 *
	 * @param T_Ul_Estudiante_id the t_ ul_ estudiante_id
	 */
	public static void removeByT_Ul_Estudiante_id(long T_Ul_Estudiante_id) {
		getPersistence().removeByT_Ul_Estudiante_id(T_Ul_Estudiante_id);
	}

	/**
	 * Returns the number of t_ ul_ estud_ cursos where T_Ul_Estudiante_id = &#63;.
	 *
	 * @param T_Ul_Estudiante_id the t_ ul_ estudiante_id
	 * @return the number of matching t_ ul_ estud_ cursos
	 */
	public static int countByT_Ul_Estudiante_id(long T_Ul_Estudiante_id) {
		return getPersistence().countByT_Ul_Estudiante_id(T_Ul_Estudiante_id);
	}

	/**
	 * Returns all the t_ ul_ estud_ cursos where T_Ul_Curso_id = &#63;.
	 *
	 * @param T_Ul_Curso_id the t_ ul_ curso_id
	 * @return the matching t_ ul_ estud_ cursos
	 */
	public static List<T_Ul_Estud_Curso> findByT_Ul_Curso_id(
		long T_Ul_Curso_id) {

		return getPersistence().findByT_Ul_Curso_id(T_Ul_Curso_id);
	}

	/**
	 * Returns a range of all the t_ ul_ estud_ cursos where T_Ul_Curso_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_Estud_CursoModelImpl</code>.
	 * </p>
	 *
	 * @param T_Ul_Curso_id the t_ ul_ curso_id
	 * @param start the lower bound of the range of t_ ul_ estud_ cursos
	 * @param end the upper bound of the range of t_ ul_ estud_ cursos (not inclusive)
	 * @return the range of matching t_ ul_ estud_ cursos
	 */
	public static List<T_Ul_Estud_Curso> findByT_Ul_Curso_id(
		long T_Ul_Curso_id, int start, int end) {

		return getPersistence().findByT_Ul_Curso_id(T_Ul_Curso_id, start, end);
	}

	/**
	 * Returns an ordered range of all the t_ ul_ estud_ cursos where T_Ul_Curso_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_Estud_CursoModelImpl</code>.
	 * </p>
	 *
	 * @param T_Ul_Curso_id the t_ ul_ curso_id
	 * @param start the lower bound of the range of t_ ul_ estud_ cursos
	 * @param end the upper bound of the range of t_ ul_ estud_ cursos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t_ ul_ estud_ cursos
	 */
	public static List<T_Ul_Estud_Curso> findByT_Ul_Curso_id(
		long T_Ul_Curso_id, int start, int end,
		OrderByComparator<T_Ul_Estud_Curso> orderByComparator) {

		return getPersistence().findByT_Ul_Curso_id(
			T_Ul_Curso_id, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the t_ ul_ estud_ cursos where T_Ul_Curso_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_Estud_CursoModelImpl</code>.
	 * </p>
	 *
	 * @param T_Ul_Curso_id the t_ ul_ curso_id
	 * @param start the lower bound of the range of t_ ul_ estud_ cursos
	 * @param end the upper bound of the range of t_ ul_ estud_ cursos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching t_ ul_ estud_ cursos
	 */
	public static List<T_Ul_Estud_Curso> findByT_Ul_Curso_id(
		long T_Ul_Curso_id, int start, int end,
		OrderByComparator<T_Ul_Estud_Curso> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByT_Ul_Curso_id(
			T_Ul_Curso_id, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first t_ ul_ estud_ curso in the ordered set where T_Ul_Curso_id = &#63;.
	 *
	 * @param T_Ul_Curso_id the t_ ul_ curso_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ estud_ curso
	 * @throws NoSuchT_Ul_Estud_CursoException if a matching t_ ul_ estud_ curso could not be found
	 */
	public static T_Ul_Estud_Curso findByT_Ul_Curso_id_First(
			long T_Ul_Curso_id,
			OrderByComparator<T_Ul_Estud_Curso> orderByComparator)
		throws com.aula.sb.exception.NoSuchT_Ul_Estud_CursoException {

		return getPersistence().findByT_Ul_Curso_id_First(
			T_Ul_Curso_id, orderByComparator);
	}

	/**
	 * Returns the first t_ ul_ estud_ curso in the ordered set where T_Ul_Curso_id = &#63;.
	 *
	 * @param T_Ul_Curso_id the t_ ul_ curso_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ estud_ curso, or <code>null</code> if a matching t_ ul_ estud_ curso could not be found
	 */
	public static T_Ul_Estud_Curso fetchByT_Ul_Curso_id_First(
		long T_Ul_Curso_id,
		OrderByComparator<T_Ul_Estud_Curso> orderByComparator) {

		return getPersistence().fetchByT_Ul_Curso_id_First(
			T_Ul_Curso_id, orderByComparator);
	}

	/**
	 * Returns the last t_ ul_ estud_ curso in the ordered set where T_Ul_Curso_id = &#63;.
	 *
	 * @param T_Ul_Curso_id the t_ ul_ curso_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ estud_ curso
	 * @throws NoSuchT_Ul_Estud_CursoException if a matching t_ ul_ estud_ curso could not be found
	 */
	public static T_Ul_Estud_Curso findByT_Ul_Curso_id_Last(
			long T_Ul_Curso_id,
			OrderByComparator<T_Ul_Estud_Curso> orderByComparator)
		throws com.aula.sb.exception.NoSuchT_Ul_Estud_CursoException {

		return getPersistence().findByT_Ul_Curso_id_Last(
			T_Ul_Curso_id, orderByComparator);
	}

	/**
	 * Returns the last t_ ul_ estud_ curso in the ordered set where T_Ul_Curso_id = &#63;.
	 *
	 * @param T_Ul_Curso_id the t_ ul_ curso_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ estud_ curso, or <code>null</code> if a matching t_ ul_ estud_ curso could not be found
	 */
	public static T_Ul_Estud_Curso fetchByT_Ul_Curso_id_Last(
		long T_Ul_Curso_id,
		OrderByComparator<T_Ul_Estud_Curso> orderByComparator) {

		return getPersistence().fetchByT_Ul_Curso_id_Last(
			T_Ul_Curso_id, orderByComparator);
	}

	/**
	 * Returns the t_ ul_ estud_ cursos before and after the current t_ ul_ estud_ curso in the ordered set where T_Ul_Curso_id = &#63;.
	 *
	 * @param t_Ul_Estud_CursoPK the primary key of the current t_ ul_ estud_ curso
	 * @param T_Ul_Curso_id the t_ ul_ curso_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t_ ul_ estud_ curso
	 * @throws NoSuchT_Ul_Estud_CursoException if a t_ ul_ estud_ curso with the primary key could not be found
	 */
	public static T_Ul_Estud_Curso[] findByT_Ul_Curso_id_PrevAndNext(
			T_Ul_Estud_CursoPK t_Ul_Estud_CursoPK, long T_Ul_Curso_id,
			OrderByComparator<T_Ul_Estud_Curso> orderByComparator)
		throws com.aula.sb.exception.NoSuchT_Ul_Estud_CursoException {

		return getPersistence().findByT_Ul_Curso_id_PrevAndNext(
			t_Ul_Estud_CursoPK, T_Ul_Curso_id, orderByComparator);
	}

	/**
	 * Removes all the t_ ul_ estud_ cursos where T_Ul_Curso_id = &#63; from the database.
	 *
	 * @param T_Ul_Curso_id the t_ ul_ curso_id
	 */
	public static void removeByT_Ul_Curso_id(long T_Ul_Curso_id) {
		getPersistence().removeByT_Ul_Curso_id(T_Ul_Curso_id);
	}

	/**
	 * Returns the number of t_ ul_ estud_ cursos where T_Ul_Curso_id = &#63;.
	 *
	 * @param T_Ul_Curso_id the t_ ul_ curso_id
	 * @return the number of matching t_ ul_ estud_ cursos
	 */
	public static int countByT_Ul_Curso_id(long T_Ul_Curso_id) {
		return getPersistence().countByT_Ul_Curso_id(T_Ul_Curso_id);
	}

	/**
	 * Caches the t_ ul_ estud_ curso in the entity cache if it is enabled.
	 *
	 * @param t_Ul_Estud_Curso the t_ ul_ estud_ curso
	 */
	public static void cacheResult(T_Ul_Estud_Curso t_Ul_Estud_Curso) {
		getPersistence().cacheResult(t_Ul_Estud_Curso);
	}

	/**
	 * Caches the t_ ul_ estud_ cursos in the entity cache if it is enabled.
	 *
	 * @param t_Ul_Estud_Cursos the t_ ul_ estud_ cursos
	 */
	public static void cacheResult(List<T_Ul_Estud_Curso> t_Ul_Estud_Cursos) {
		getPersistence().cacheResult(t_Ul_Estud_Cursos);
	}

	/**
	 * Creates a new t_ ul_ estud_ curso with the primary key. Does not add the t_ ul_ estud_ curso to the database.
	 *
	 * @param t_Ul_Estud_CursoPK the primary key for the new t_ ul_ estud_ curso
	 * @return the new t_ ul_ estud_ curso
	 */
	public static T_Ul_Estud_Curso create(
		T_Ul_Estud_CursoPK t_Ul_Estud_CursoPK) {

		return getPersistence().create(t_Ul_Estud_CursoPK);
	}

	/**
	 * Removes the t_ ul_ estud_ curso with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param t_Ul_Estud_CursoPK the primary key of the t_ ul_ estud_ curso
	 * @return the t_ ul_ estud_ curso that was removed
	 * @throws NoSuchT_Ul_Estud_CursoException if a t_ ul_ estud_ curso with the primary key could not be found
	 */
	public static T_Ul_Estud_Curso remove(T_Ul_Estud_CursoPK t_Ul_Estud_CursoPK)
		throws com.aula.sb.exception.NoSuchT_Ul_Estud_CursoException {

		return getPersistence().remove(t_Ul_Estud_CursoPK);
	}

	public static T_Ul_Estud_Curso updateImpl(
		T_Ul_Estud_Curso t_Ul_Estud_Curso) {

		return getPersistence().updateImpl(t_Ul_Estud_Curso);
	}

	/**
	 * Returns the t_ ul_ estud_ curso with the primary key or throws a <code>NoSuchT_Ul_Estud_CursoException</code> if it could not be found.
	 *
	 * @param t_Ul_Estud_CursoPK the primary key of the t_ ul_ estud_ curso
	 * @return the t_ ul_ estud_ curso
	 * @throws NoSuchT_Ul_Estud_CursoException if a t_ ul_ estud_ curso with the primary key could not be found
	 */
	public static T_Ul_Estud_Curso findByPrimaryKey(
			T_Ul_Estud_CursoPK t_Ul_Estud_CursoPK)
		throws com.aula.sb.exception.NoSuchT_Ul_Estud_CursoException {

		return getPersistence().findByPrimaryKey(t_Ul_Estud_CursoPK);
	}

	/**
	 * Returns the t_ ul_ estud_ curso with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param t_Ul_Estud_CursoPK the primary key of the t_ ul_ estud_ curso
	 * @return the t_ ul_ estud_ curso, or <code>null</code> if a t_ ul_ estud_ curso with the primary key could not be found
	 */
	public static T_Ul_Estud_Curso fetchByPrimaryKey(
		T_Ul_Estud_CursoPK t_Ul_Estud_CursoPK) {

		return getPersistence().fetchByPrimaryKey(t_Ul_Estud_CursoPK);
	}

	/**
	 * Returns all the t_ ul_ estud_ cursos.
	 *
	 * @return the t_ ul_ estud_ cursos
	 */
	public static List<T_Ul_Estud_Curso> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the t_ ul_ estud_ cursos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_Estud_CursoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_ estud_ cursos
	 * @param end the upper bound of the range of t_ ul_ estud_ cursos (not inclusive)
	 * @return the range of t_ ul_ estud_ cursos
	 */
	public static List<T_Ul_Estud_Curso> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the t_ ul_ estud_ cursos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_Estud_CursoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_ estud_ cursos
	 * @param end the upper bound of the range of t_ ul_ estud_ cursos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of t_ ul_ estud_ cursos
	 */
	public static List<T_Ul_Estud_Curso> findAll(
		int start, int end,
		OrderByComparator<T_Ul_Estud_Curso> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the t_ ul_ estud_ cursos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_Estud_CursoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_ estud_ cursos
	 * @param end the upper bound of the range of t_ ul_ estud_ cursos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of t_ ul_ estud_ cursos
	 */
	public static List<T_Ul_Estud_Curso> findAll(
		int start, int end,
		OrderByComparator<T_Ul_Estud_Curso> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the t_ ul_ estud_ cursos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of t_ ul_ estud_ cursos.
	 *
	 * @return the number of t_ ul_ estud_ cursos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static Set<String> getCompoundPKColumnNames() {
		return getPersistence().getCompoundPKColumnNames();
	}

	public static T_Ul_Estud_CursoPersistence getPersistence() {
		return _persistence;
	}

	private static volatile T_Ul_Estud_CursoPersistence _persistence;

}
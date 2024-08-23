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

import com.aula.sb.model.T_Ul_Curso;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the t_ ul_ curso service. This utility wraps <code>com.aula.sb.service.persistence.impl.T_Ul_CursoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see T_Ul_CursoPersistence
 * @generated
 */
public class T_Ul_CursoUtil {

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
	public static void clearCache(T_Ul_Curso t_Ul_Curso) {
		getPersistence().clearCache(t_Ul_Curso);
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
	public static Map<Serializable, T_Ul_Curso> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<T_Ul_Curso> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<T_Ul_Curso> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<T_Ul_Curso> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T_Ul_Curso> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static T_Ul_Curso update(T_Ul_Curso t_Ul_Curso) {
		return getPersistence().update(t_Ul_Curso);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static T_Ul_Curso update(
		T_Ul_Curso t_Ul_Curso, ServiceContext serviceContext) {

		return getPersistence().update(t_Ul_Curso, serviceContext);
	}

	/**
	 * Returns all the t_ ul_ cursos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching t_ ul_ cursos
	 */
	public static List<T_Ul_Curso> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the t_ ul_ cursos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_CursoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of t_ ul_ cursos
	 * @param end the upper bound of the range of t_ ul_ cursos (not inclusive)
	 * @return the range of matching t_ ul_ cursos
	 */
	public static List<T_Ul_Curso> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the t_ ul_ cursos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_CursoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of t_ ul_ cursos
	 * @param end the upper bound of the range of t_ ul_ cursos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t_ ul_ cursos
	 */
	public static List<T_Ul_Curso> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<T_Ul_Curso> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the t_ ul_ cursos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_CursoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of t_ ul_ cursos
	 * @param end the upper bound of the range of t_ ul_ cursos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching t_ ul_ cursos
	 */
	public static List<T_Ul_Curso> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<T_Ul_Curso> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first t_ ul_ curso in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ curso
	 * @throws NoSuchT_Ul_CursoException if a matching t_ ul_ curso could not be found
	 */
	public static T_Ul_Curso findByUuid_First(
			String uuid, OrderByComparator<T_Ul_Curso> orderByComparator)
		throws com.aula.sb.exception.NoSuchT_Ul_CursoException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first t_ ul_ curso in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ curso, or <code>null</code> if a matching t_ ul_ curso could not be found
	 */
	public static T_Ul_Curso fetchByUuid_First(
		String uuid, OrderByComparator<T_Ul_Curso> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last t_ ul_ curso in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ curso
	 * @throws NoSuchT_Ul_CursoException if a matching t_ ul_ curso could not be found
	 */
	public static T_Ul_Curso findByUuid_Last(
			String uuid, OrderByComparator<T_Ul_Curso> orderByComparator)
		throws com.aula.sb.exception.NoSuchT_Ul_CursoException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last t_ ul_ curso in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ curso, or <code>null</code> if a matching t_ ul_ curso could not be found
	 */
	public static T_Ul_Curso fetchByUuid_Last(
		String uuid, OrderByComparator<T_Ul_Curso> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the t_ ul_ cursos before and after the current t_ ul_ curso in the ordered set where uuid = &#63;.
	 *
	 * @param idCurso the primary key of the current t_ ul_ curso
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t_ ul_ curso
	 * @throws NoSuchT_Ul_CursoException if a t_ ul_ curso with the primary key could not be found
	 */
	public static T_Ul_Curso[] findByUuid_PrevAndNext(
			long idCurso, String uuid,
			OrderByComparator<T_Ul_Curso> orderByComparator)
		throws com.aula.sb.exception.NoSuchT_Ul_CursoException {

		return getPersistence().findByUuid_PrevAndNext(
			idCurso, uuid, orderByComparator);
	}

	/**
	 * Removes all the t_ ul_ cursos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of t_ ul_ cursos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching t_ ul_ cursos
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the t_ ul_ curso where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchT_Ul_CursoException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching t_ ul_ curso
	 * @throws NoSuchT_Ul_CursoException if a matching t_ ul_ curso could not be found
	 */
	public static T_Ul_Curso findByUUID_G(String uuid, long groupId)
		throws com.aula.sb.exception.NoSuchT_Ul_CursoException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the t_ ul_ curso where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching t_ ul_ curso, or <code>null</code> if a matching t_ ul_ curso could not be found
	 */
	public static T_Ul_Curso fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the t_ ul_ curso where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching t_ ul_ curso, or <code>null</code> if a matching t_ ul_ curso could not be found
	 */
	public static T_Ul_Curso fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the t_ ul_ curso where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the t_ ul_ curso that was removed
	 */
	public static T_Ul_Curso removeByUUID_G(String uuid, long groupId)
		throws com.aula.sb.exception.NoSuchT_Ul_CursoException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of t_ ul_ cursos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching t_ ul_ cursos
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the t_ ul_ cursos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching t_ ul_ cursos
	 */
	public static List<T_Ul_Curso> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the t_ ul_ cursos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_CursoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of t_ ul_ cursos
	 * @param end the upper bound of the range of t_ ul_ cursos (not inclusive)
	 * @return the range of matching t_ ul_ cursos
	 */
	public static List<T_Ul_Curso> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the t_ ul_ cursos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_CursoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of t_ ul_ cursos
	 * @param end the upper bound of the range of t_ ul_ cursos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t_ ul_ cursos
	 */
	public static List<T_Ul_Curso> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<T_Ul_Curso> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the t_ ul_ cursos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_CursoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of t_ ul_ cursos
	 * @param end the upper bound of the range of t_ ul_ cursos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching t_ ul_ cursos
	 */
	public static List<T_Ul_Curso> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<T_Ul_Curso> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first t_ ul_ curso in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ curso
	 * @throws NoSuchT_Ul_CursoException if a matching t_ ul_ curso could not be found
	 */
	public static T_Ul_Curso findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<T_Ul_Curso> orderByComparator)
		throws com.aula.sb.exception.NoSuchT_Ul_CursoException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first t_ ul_ curso in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ curso, or <code>null</code> if a matching t_ ul_ curso could not be found
	 */
	public static T_Ul_Curso fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<T_Ul_Curso> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last t_ ul_ curso in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ curso
	 * @throws NoSuchT_Ul_CursoException if a matching t_ ul_ curso could not be found
	 */
	public static T_Ul_Curso findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<T_Ul_Curso> orderByComparator)
		throws com.aula.sb.exception.NoSuchT_Ul_CursoException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last t_ ul_ curso in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ curso, or <code>null</code> if a matching t_ ul_ curso could not be found
	 */
	public static T_Ul_Curso fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<T_Ul_Curso> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the t_ ul_ cursos before and after the current t_ ul_ curso in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param idCurso the primary key of the current t_ ul_ curso
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t_ ul_ curso
	 * @throws NoSuchT_Ul_CursoException if a t_ ul_ curso with the primary key could not be found
	 */
	public static T_Ul_Curso[] findByUuid_C_PrevAndNext(
			long idCurso, String uuid, long companyId,
			OrderByComparator<T_Ul_Curso> orderByComparator)
		throws com.aula.sb.exception.NoSuchT_Ul_CursoException {

		return getPersistence().findByUuid_C_PrevAndNext(
			idCurso, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the t_ ul_ cursos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of t_ ul_ cursos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching t_ ul_ cursos
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the t_ ul_ cursos where nombreCurso = &#63;.
	 *
	 * @param nombreCurso the nombre curso
	 * @return the matching t_ ul_ cursos
	 */
	public static List<T_Ul_Curso> findByNombreCurso(String nombreCurso) {
		return getPersistence().findByNombreCurso(nombreCurso);
	}

	/**
	 * Returns a range of all the t_ ul_ cursos where nombreCurso = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_CursoModelImpl</code>.
	 * </p>
	 *
	 * @param nombreCurso the nombre curso
	 * @param start the lower bound of the range of t_ ul_ cursos
	 * @param end the upper bound of the range of t_ ul_ cursos (not inclusive)
	 * @return the range of matching t_ ul_ cursos
	 */
	public static List<T_Ul_Curso> findByNombreCurso(
		String nombreCurso, int start, int end) {

		return getPersistence().findByNombreCurso(nombreCurso, start, end);
	}

	/**
	 * Returns an ordered range of all the t_ ul_ cursos where nombreCurso = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_CursoModelImpl</code>.
	 * </p>
	 *
	 * @param nombreCurso the nombre curso
	 * @param start the lower bound of the range of t_ ul_ cursos
	 * @param end the upper bound of the range of t_ ul_ cursos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t_ ul_ cursos
	 */
	public static List<T_Ul_Curso> findByNombreCurso(
		String nombreCurso, int start, int end,
		OrderByComparator<T_Ul_Curso> orderByComparator) {

		return getPersistence().findByNombreCurso(
			nombreCurso, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the t_ ul_ cursos where nombreCurso = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_CursoModelImpl</code>.
	 * </p>
	 *
	 * @param nombreCurso the nombre curso
	 * @param start the lower bound of the range of t_ ul_ cursos
	 * @param end the upper bound of the range of t_ ul_ cursos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching t_ ul_ cursos
	 */
	public static List<T_Ul_Curso> findByNombreCurso(
		String nombreCurso, int start, int end,
		OrderByComparator<T_Ul_Curso> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByNombreCurso(
			nombreCurso, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first t_ ul_ curso in the ordered set where nombreCurso = &#63;.
	 *
	 * @param nombreCurso the nombre curso
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ curso
	 * @throws NoSuchT_Ul_CursoException if a matching t_ ul_ curso could not be found
	 */
	public static T_Ul_Curso findByNombreCurso_First(
			String nombreCurso, OrderByComparator<T_Ul_Curso> orderByComparator)
		throws com.aula.sb.exception.NoSuchT_Ul_CursoException {

		return getPersistence().findByNombreCurso_First(
			nombreCurso, orderByComparator);
	}

	/**
	 * Returns the first t_ ul_ curso in the ordered set where nombreCurso = &#63;.
	 *
	 * @param nombreCurso the nombre curso
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ curso, or <code>null</code> if a matching t_ ul_ curso could not be found
	 */
	public static T_Ul_Curso fetchByNombreCurso_First(
		String nombreCurso, OrderByComparator<T_Ul_Curso> orderByComparator) {

		return getPersistence().fetchByNombreCurso_First(
			nombreCurso, orderByComparator);
	}

	/**
	 * Returns the last t_ ul_ curso in the ordered set where nombreCurso = &#63;.
	 *
	 * @param nombreCurso the nombre curso
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ curso
	 * @throws NoSuchT_Ul_CursoException if a matching t_ ul_ curso could not be found
	 */
	public static T_Ul_Curso findByNombreCurso_Last(
			String nombreCurso, OrderByComparator<T_Ul_Curso> orderByComparator)
		throws com.aula.sb.exception.NoSuchT_Ul_CursoException {

		return getPersistence().findByNombreCurso_Last(
			nombreCurso, orderByComparator);
	}

	/**
	 * Returns the last t_ ul_ curso in the ordered set where nombreCurso = &#63;.
	 *
	 * @param nombreCurso the nombre curso
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ curso, or <code>null</code> if a matching t_ ul_ curso could not be found
	 */
	public static T_Ul_Curso fetchByNombreCurso_Last(
		String nombreCurso, OrderByComparator<T_Ul_Curso> orderByComparator) {

		return getPersistence().fetchByNombreCurso_Last(
			nombreCurso, orderByComparator);
	}

	/**
	 * Returns the t_ ul_ cursos before and after the current t_ ul_ curso in the ordered set where nombreCurso = &#63;.
	 *
	 * @param idCurso the primary key of the current t_ ul_ curso
	 * @param nombreCurso the nombre curso
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t_ ul_ curso
	 * @throws NoSuchT_Ul_CursoException if a t_ ul_ curso with the primary key could not be found
	 */
	public static T_Ul_Curso[] findByNombreCurso_PrevAndNext(
			long idCurso, String nombreCurso,
			OrderByComparator<T_Ul_Curso> orderByComparator)
		throws com.aula.sb.exception.NoSuchT_Ul_CursoException {

		return getPersistence().findByNombreCurso_PrevAndNext(
			idCurso, nombreCurso, orderByComparator);
	}

	/**
	 * Removes all the t_ ul_ cursos where nombreCurso = &#63; from the database.
	 *
	 * @param nombreCurso the nombre curso
	 */
	public static void removeByNombreCurso(String nombreCurso) {
		getPersistence().removeByNombreCurso(nombreCurso);
	}

	/**
	 * Returns the number of t_ ul_ cursos where nombreCurso = &#63;.
	 *
	 * @param nombreCurso the nombre curso
	 * @return the number of matching t_ ul_ cursos
	 */
	public static int countByNombreCurso(String nombreCurso) {
		return getPersistence().countByNombreCurso(nombreCurso);
	}

	/**
	 * Caches the t_ ul_ curso in the entity cache if it is enabled.
	 *
	 * @param t_Ul_Curso the t_ ul_ curso
	 */
	public static void cacheResult(T_Ul_Curso t_Ul_Curso) {
		getPersistence().cacheResult(t_Ul_Curso);
	}

	/**
	 * Caches the t_ ul_ cursos in the entity cache if it is enabled.
	 *
	 * @param t_Ul_Cursos the t_ ul_ cursos
	 */
	public static void cacheResult(List<T_Ul_Curso> t_Ul_Cursos) {
		getPersistence().cacheResult(t_Ul_Cursos);
	}

	/**
	 * Creates a new t_ ul_ curso with the primary key. Does not add the t_ ul_ curso to the database.
	 *
	 * @param idCurso the primary key for the new t_ ul_ curso
	 * @return the new t_ ul_ curso
	 */
	public static T_Ul_Curso create(long idCurso) {
		return getPersistence().create(idCurso);
	}

	/**
	 * Removes the t_ ul_ curso with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param idCurso the primary key of the t_ ul_ curso
	 * @return the t_ ul_ curso that was removed
	 * @throws NoSuchT_Ul_CursoException if a t_ ul_ curso with the primary key could not be found
	 */
	public static T_Ul_Curso remove(long idCurso)
		throws com.aula.sb.exception.NoSuchT_Ul_CursoException {

		return getPersistence().remove(idCurso);
	}

	public static T_Ul_Curso updateImpl(T_Ul_Curso t_Ul_Curso) {
		return getPersistence().updateImpl(t_Ul_Curso);
	}

	/**
	 * Returns the t_ ul_ curso with the primary key or throws a <code>NoSuchT_Ul_CursoException</code> if it could not be found.
	 *
	 * @param idCurso the primary key of the t_ ul_ curso
	 * @return the t_ ul_ curso
	 * @throws NoSuchT_Ul_CursoException if a t_ ul_ curso with the primary key could not be found
	 */
	public static T_Ul_Curso findByPrimaryKey(long idCurso)
		throws com.aula.sb.exception.NoSuchT_Ul_CursoException {

		return getPersistence().findByPrimaryKey(idCurso);
	}

	/**
	 * Returns the t_ ul_ curso with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param idCurso the primary key of the t_ ul_ curso
	 * @return the t_ ul_ curso, or <code>null</code> if a t_ ul_ curso with the primary key could not be found
	 */
	public static T_Ul_Curso fetchByPrimaryKey(long idCurso) {
		return getPersistence().fetchByPrimaryKey(idCurso);
	}

	/**
	 * Returns all the t_ ul_ cursos.
	 *
	 * @return the t_ ul_ cursos
	 */
	public static List<T_Ul_Curso> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the t_ ul_ cursos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_CursoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_ cursos
	 * @param end the upper bound of the range of t_ ul_ cursos (not inclusive)
	 * @return the range of t_ ul_ cursos
	 */
	public static List<T_Ul_Curso> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the t_ ul_ cursos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_CursoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_ cursos
	 * @param end the upper bound of the range of t_ ul_ cursos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of t_ ul_ cursos
	 */
	public static List<T_Ul_Curso> findAll(
		int start, int end, OrderByComparator<T_Ul_Curso> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the t_ ul_ cursos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_CursoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_ cursos
	 * @param end the upper bound of the range of t_ ul_ cursos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of t_ ul_ cursos
	 */
	public static List<T_Ul_Curso> findAll(
		int start, int end, OrderByComparator<T_Ul_Curso> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the t_ ul_ cursos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of t_ ul_ cursos.
	 *
	 * @return the number of t_ ul_ cursos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static T_Ul_CursoPersistence getPersistence() {
		return _persistence;
	}

	private static volatile T_Ul_CursoPersistence _persistence;

}
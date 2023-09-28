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

package com.savvy.sb.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.savvy.sb.model.Proyecto;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the proyecto service. This utility wraps <code>com.savvy.sb.service.persistence.impl.ProyectoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProyectoPersistence
 * @generated
 */
public class ProyectoUtil {

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
	public static void clearCache(Proyecto proyecto) {
		getPersistence().clearCache(proyecto);
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
	public static Map<Serializable, Proyecto> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Proyecto> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Proyecto> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Proyecto> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Proyecto> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Proyecto update(Proyecto proyecto) {
		return getPersistence().update(proyecto);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Proyecto update(
		Proyecto proyecto, ServiceContext serviceContext) {

		return getPersistence().update(proyecto, serviceContext);
	}

	/**
	 * Returns all the proyectos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching proyectos
	 */
	public static List<Proyecto> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the proyectos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProyectoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of proyectos
	 * @param end the upper bound of the range of proyectos (not inclusive)
	 * @return the range of matching proyectos
	 */
	public static List<Proyecto> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the proyectos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProyectoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of proyectos
	 * @param end the upper bound of the range of proyectos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching proyectos
	 */
	public static List<Proyecto> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Proyecto> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the proyectos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProyectoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of proyectos
	 * @param end the upper bound of the range of proyectos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching proyectos
	 */
	public static List<Proyecto> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Proyecto> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first proyecto in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching proyecto
	 * @throws NoSuchProyectoException if a matching proyecto could not be found
	 */
	public static Proyecto findByUuid_First(
			String uuid, OrderByComparator<Proyecto> orderByComparator)
		throws com.savvy.sb.exception.NoSuchProyectoException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first proyecto in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching proyecto, or <code>null</code> if a matching proyecto could not be found
	 */
	public static Proyecto fetchByUuid_First(
		String uuid, OrderByComparator<Proyecto> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last proyecto in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching proyecto
	 * @throws NoSuchProyectoException if a matching proyecto could not be found
	 */
	public static Proyecto findByUuid_Last(
			String uuid, OrderByComparator<Proyecto> orderByComparator)
		throws com.savvy.sb.exception.NoSuchProyectoException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last proyecto in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching proyecto, or <code>null</code> if a matching proyecto could not be found
	 */
	public static Proyecto fetchByUuid_Last(
		String uuid, OrderByComparator<Proyecto> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the proyectos before and after the current proyecto in the ordered set where uuid = &#63;.
	 *
	 * @param proyectoId the primary key of the current proyecto
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next proyecto
	 * @throws NoSuchProyectoException if a proyecto with the primary key could not be found
	 */
	public static Proyecto[] findByUuid_PrevAndNext(
			long proyectoId, String uuid,
			OrderByComparator<Proyecto> orderByComparator)
		throws com.savvy.sb.exception.NoSuchProyectoException {

		return getPersistence().findByUuid_PrevAndNext(
			proyectoId, uuid, orderByComparator);
	}

	/**
	 * Removes all the proyectos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of proyectos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching proyectos
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the proyecto where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchProyectoException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching proyecto
	 * @throws NoSuchProyectoException if a matching proyecto could not be found
	 */
	public static Proyecto findByUUID_G(String uuid, long groupId)
		throws com.savvy.sb.exception.NoSuchProyectoException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the proyecto where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching proyecto, or <code>null</code> if a matching proyecto could not be found
	 */
	public static Proyecto fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the proyecto where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching proyecto, or <code>null</code> if a matching proyecto could not be found
	 */
	public static Proyecto fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the proyecto where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the proyecto that was removed
	 */
	public static Proyecto removeByUUID_G(String uuid, long groupId)
		throws com.savvy.sb.exception.NoSuchProyectoException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of proyectos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching proyectos
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the proyectos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching proyectos
	 */
	public static List<Proyecto> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the proyectos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProyectoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of proyectos
	 * @param end the upper bound of the range of proyectos (not inclusive)
	 * @return the range of matching proyectos
	 */
	public static List<Proyecto> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the proyectos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProyectoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of proyectos
	 * @param end the upper bound of the range of proyectos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching proyectos
	 */
	public static List<Proyecto> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Proyecto> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the proyectos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProyectoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of proyectos
	 * @param end the upper bound of the range of proyectos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching proyectos
	 */
	public static List<Proyecto> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Proyecto> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first proyecto in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching proyecto
	 * @throws NoSuchProyectoException if a matching proyecto could not be found
	 */
	public static Proyecto findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Proyecto> orderByComparator)
		throws com.savvy.sb.exception.NoSuchProyectoException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first proyecto in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching proyecto, or <code>null</code> if a matching proyecto could not be found
	 */
	public static Proyecto fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Proyecto> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last proyecto in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching proyecto
	 * @throws NoSuchProyectoException if a matching proyecto could not be found
	 */
	public static Proyecto findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Proyecto> orderByComparator)
		throws com.savvy.sb.exception.NoSuchProyectoException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last proyecto in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching proyecto, or <code>null</code> if a matching proyecto could not be found
	 */
	public static Proyecto fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Proyecto> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the proyectos before and after the current proyecto in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param proyectoId the primary key of the current proyecto
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next proyecto
	 * @throws NoSuchProyectoException if a proyecto with the primary key could not be found
	 */
	public static Proyecto[] findByUuid_C_PrevAndNext(
			long proyectoId, String uuid, long companyId,
			OrderByComparator<Proyecto> orderByComparator)
		throws com.savvy.sb.exception.NoSuchProyectoException {

		return getPersistence().findByUuid_C_PrevAndNext(
			proyectoId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the proyectos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of proyectos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching proyectos
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the proyectos where tituloProyecto = &#63;.
	 *
	 * @param tituloProyecto the titulo proyecto
	 * @return the matching proyectos
	 */
	public static List<Proyecto> findByTituloProyecto(String tituloProyecto) {
		return getPersistence().findByTituloProyecto(tituloProyecto);
	}

	/**
	 * Returns a range of all the proyectos where tituloProyecto = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProyectoModelImpl</code>.
	 * </p>
	 *
	 * @param tituloProyecto the titulo proyecto
	 * @param start the lower bound of the range of proyectos
	 * @param end the upper bound of the range of proyectos (not inclusive)
	 * @return the range of matching proyectos
	 */
	public static List<Proyecto> findByTituloProyecto(
		String tituloProyecto, int start, int end) {

		return getPersistence().findByTituloProyecto(
			tituloProyecto, start, end);
	}

	/**
	 * Returns an ordered range of all the proyectos where tituloProyecto = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProyectoModelImpl</code>.
	 * </p>
	 *
	 * @param tituloProyecto the titulo proyecto
	 * @param start the lower bound of the range of proyectos
	 * @param end the upper bound of the range of proyectos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching proyectos
	 */
	public static List<Proyecto> findByTituloProyecto(
		String tituloProyecto, int start, int end,
		OrderByComparator<Proyecto> orderByComparator) {

		return getPersistence().findByTituloProyecto(
			tituloProyecto, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the proyectos where tituloProyecto = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProyectoModelImpl</code>.
	 * </p>
	 *
	 * @param tituloProyecto the titulo proyecto
	 * @param start the lower bound of the range of proyectos
	 * @param end the upper bound of the range of proyectos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching proyectos
	 */
	public static List<Proyecto> findByTituloProyecto(
		String tituloProyecto, int start, int end,
		OrderByComparator<Proyecto> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByTituloProyecto(
			tituloProyecto, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first proyecto in the ordered set where tituloProyecto = &#63;.
	 *
	 * @param tituloProyecto the titulo proyecto
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching proyecto
	 * @throws NoSuchProyectoException if a matching proyecto could not be found
	 */
	public static Proyecto findByTituloProyecto_First(
			String tituloProyecto,
			OrderByComparator<Proyecto> orderByComparator)
		throws com.savvy.sb.exception.NoSuchProyectoException {

		return getPersistence().findByTituloProyecto_First(
			tituloProyecto, orderByComparator);
	}

	/**
	 * Returns the first proyecto in the ordered set where tituloProyecto = &#63;.
	 *
	 * @param tituloProyecto the titulo proyecto
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching proyecto, or <code>null</code> if a matching proyecto could not be found
	 */
	public static Proyecto fetchByTituloProyecto_First(
		String tituloProyecto, OrderByComparator<Proyecto> orderByComparator) {

		return getPersistence().fetchByTituloProyecto_First(
			tituloProyecto, orderByComparator);
	}

	/**
	 * Returns the last proyecto in the ordered set where tituloProyecto = &#63;.
	 *
	 * @param tituloProyecto the titulo proyecto
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching proyecto
	 * @throws NoSuchProyectoException if a matching proyecto could not be found
	 */
	public static Proyecto findByTituloProyecto_Last(
			String tituloProyecto,
			OrderByComparator<Proyecto> orderByComparator)
		throws com.savvy.sb.exception.NoSuchProyectoException {

		return getPersistence().findByTituloProyecto_Last(
			tituloProyecto, orderByComparator);
	}

	/**
	 * Returns the last proyecto in the ordered set where tituloProyecto = &#63;.
	 *
	 * @param tituloProyecto the titulo proyecto
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching proyecto, or <code>null</code> if a matching proyecto could not be found
	 */
	public static Proyecto fetchByTituloProyecto_Last(
		String tituloProyecto, OrderByComparator<Proyecto> orderByComparator) {

		return getPersistence().fetchByTituloProyecto_Last(
			tituloProyecto, orderByComparator);
	}

	/**
	 * Returns the proyectos before and after the current proyecto in the ordered set where tituloProyecto = &#63;.
	 *
	 * @param proyectoId the primary key of the current proyecto
	 * @param tituloProyecto the titulo proyecto
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next proyecto
	 * @throws NoSuchProyectoException if a proyecto with the primary key could not be found
	 */
	public static Proyecto[] findByTituloProyecto_PrevAndNext(
			long proyectoId, String tituloProyecto,
			OrderByComparator<Proyecto> orderByComparator)
		throws com.savvy.sb.exception.NoSuchProyectoException {

		return getPersistence().findByTituloProyecto_PrevAndNext(
			proyectoId, tituloProyecto, orderByComparator);
	}

	/**
	 * Removes all the proyectos where tituloProyecto = &#63; from the database.
	 *
	 * @param tituloProyecto the titulo proyecto
	 */
	public static void removeByTituloProyecto(String tituloProyecto) {
		getPersistence().removeByTituloProyecto(tituloProyecto);
	}

	/**
	 * Returns the number of proyectos where tituloProyecto = &#63;.
	 *
	 * @param tituloProyecto the titulo proyecto
	 * @return the number of matching proyectos
	 */
	public static int countByTituloProyecto(String tituloProyecto) {
		return getPersistence().countByTituloProyecto(tituloProyecto);
	}

	/**
	 * Caches the proyecto in the entity cache if it is enabled.
	 *
	 * @param proyecto the proyecto
	 */
	public static void cacheResult(Proyecto proyecto) {
		getPersistence().cacheResult(proyecto);
	}

	/**
	 * Caches the proyectos in the entity cache if it is enabled.
	 *
	 * @param proyectos the proyectos
	 */
	public static void cacheResult(List<Proyecto> proyectos) {
		getPersistence().cacheResult(proyectos);
	}

	/**
	 * Creates a new proyecto with the primary key. Does not add the proyecto to the database.
	 *
	 * @param proyectoId the primary key for the new proyecto
	 * @return the new proyecto
	 */
	public static Proyecto create(long proyectoId) {
		return getPersistence().create(proyectoId);
	}

	/**
	 * Removes the proyecto with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param proyectoId the primary key of the proyecto
	 * @return the proyecto that was removed
	 * @throws NoSuchProyectoException if a proyecto with the primary key could not be found
	 */
	public static Proyecto remove(long proyectoId)
		throws com.savvy.sb.exception.NoSuchProyectoException {

		return getPersistence().remove(proyectoId);
	}

	public static Proyecto updateImpl(Proyecto proyecto) {
		return getPersistence().updateImpl(proyecto);
	}

	/**
	 * Returns the proyecto with the primary key or throws a <code>NoSuchProyectoException</code> if it could not be found.
	 *
	 * @param proyectoId the primary key of the proyecto
	 * @return the proyecto
	 * @throws NoSuchProyectoException if a proyecto with the primary key could not be found
	 */
	public static Proyecto findByPrimaryKey(long proyectoId)
		throws com.savvy.sb.exception.NoSuchProyectoException {

		return getPersistence().findByPrimaryKey(proyectoId);
	}

	/**
	 * Returns the proyecto with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param proyectoId the primary key of the proyecto
	 * @return the proyecto, or <code>null</code> if a proyecto with the primary key could not be found
	 */
	public static Proyecto fetchByPrimaryKey(long proyectoId) {
		return getPersistence().fetchByPrimaryKey(proyectoId);
	}

	/**
	 * Returns all the proyectos.
	 *
	 * @return the proyectos
	 */
	public static List<Proyecto> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the proyectos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProyectoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of proyectos
	 * @param end the upper bound of the range of proyectos (not inclusive)
	 * @return the range of proyectos
	 */
	public static List<Proyecto> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the proyectos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProyectoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of proyectos
	 * @param end the upper bound of the range of proyectos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of proyectos
	 */
	public static List<Proyecto> findAll(
		int start, int end, OrderByComparator<Proyecto> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the proyectos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProyectoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of proyectos
	 * @param end the upper bound of the range of proyectos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of proyectos
	 */
	public static List<Proyecto> findAll(
		int start, int end, OrderByComparator<Proyecto> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the proyectos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of proyectos.
	 *
	 * @return the number of proyectos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ProyectoPersistence getPersistence() {
		return _persistence;
	}

	private static volatile ProyectoPersistence _persistence;

}
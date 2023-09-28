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

import com.savvy.sb.model.Sprint;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the sprint service. This utility wraps <code>com.savvy.sb.service.persistence.impl.SprintPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SprintPersistence
 * @generated
 */
public class SprintUtil {

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
	public static void clearCache(Sprint sprint) {
		getPersistence().clearCache(sprint);
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
	public static Map<Serializable, Sprint> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Sprint> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Sprint> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Sprint> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Sprint> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Sprint update(Sprint sprint) {
		return getPersistence().update(sprint);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Sprint update(Sprint sprint, ServiceContext serviceContext) {
		return getPersistence().update(sprint, serviceContext);
	}

	/**
	 * Returns all the sprints where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching sprints
	 */
	public static List<Sprint> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the sprints where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SprintModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sprints
	 * @param end the upper bound of the range of sprints (not inclusive)
	 * @return the range of matching sprints
	 */
	public static List<Sprint> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the sprints where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SprintModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sprints
	 * @param end the upper bound of the range of sprints (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sprints
	 */
	public static List<Sprint> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Sprint> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sprints where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SprintModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sprints
	 * @param end the upper bound of the range of sprints (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sprints
	 */
	public static List<Sprint> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Sprint> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first sprint in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sprint
	 * @throws NoSuchSprintException if a matching sprint could not be found
	 */
	public static Sprint findByUuid_First(
			String uuid, OrderByComparator<Sprint> orderByComparator)
		throws com.savvy.sb.exception.NoSuchSprintException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first sprint in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sprint, or <code>null</code> if a matching sprint could not be found
	 */
	public static Sprint fetchByUuid_First(
		String uuid, OrderByComparator<Sprint> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last sprint in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sprint
	 * @throws NoSuchSprintException if a matching sprint could not be found
	 */
	public static Sprint findByUuid_Last(
			String uuid, OrderByComparator<Sprint> orderByComparator)
		throws com.savvy.sb.exception.NoSuchSprintException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last sprint in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sprint, or <code>null</code> if a matching sprint could not be found
	 */
	public static Sprint fetchByUuid_Last(
		String uuid, OrderByComparator<Sprint> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the sprints before and after the current sprint in the ordered set where uuid = &#63;.
	 *
	 * @param sprintId the primary key of the current sprint
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sprint
	 * @throws NoSuchSprintException if a sprint with the primary key could not be found
	 */
	public static Sprint[] findByUuid_PrevAndNext(
			long sprintId, String uuid,
			OrderByComparator<Sprint> orderByComparator)
		throws com.savvy.sb.exception.NoSuchSprintException {

		return getPersistence().findByUuid_PrevAndNext(
			sprintId, uuid, orderByComparator);
	}

	/**
	 * Removes all the sprints where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of sprints where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching sprints
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the sprint where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchSprintException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching sprint
	 * @throws NoSuchSprintException if a matching sprint could not be found
	 */
	public static Sprint findByUUID_G(String uuid, long groupId)
		throws com.savvy.sb.exception.NoSuchSprintException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the sprint where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching sprint, or <code>null</code> if a matching sprint could not be found
	 */
	public static Sprint fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the sprint where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sprint, or <code>null</code> if a matching sprint could not be found
	 */
	public static Sprint fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the sprint where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the sprint that was removed
	 */
	public static Sprint removeByUUID_G(String uuid, long groupId)
		throws com.savvy.sb.exception.NoSuchSprintException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of sprints where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching sprints
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the sprints where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching sprints
	 */
	public static List<Sprint> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the sprints where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SprintModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of sprints
	 * @param end the upper bound of the range of sprints (not inclusive)
	 * @return the range of matching sprints
	 */
	public static List<Sprint> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the sprints where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SprintModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of sprints
	 * @param end the upper bound of the range of sprints (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sprints
	 */
	public static List<Sprint> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Sprint> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sprints where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SprintModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of sprints
	 * @param end the upper bound of the range of sprints (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sprints
	 */
	public static List<Sprint> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Sprint> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first sprint in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sprint
	 * @throws NoSuchSprintException if a matching sprint could not be found
	 */
	public static Sprint findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Sprint> orderByComparator)
		throws com.savvy.sb.exception.NoSuchSprintException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first sprint in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sprint, or <code>null</code> if a matching sprint could not be found
	 */
	public static Sprint fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Sprint> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last sprint in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sprint
	 * @throws NoSuchSprintException if a matching sprint could not be found
	 */
	public static Sprint findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Sprint> orderByComparator)
		throws com.savvy.sb.exception.NoSuchSprintException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last sprint in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sprint, or <code>null</code> if a matching sprint could not be found
	 */
	public static Sprint fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Sprint> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the sprints before and after the current sprint in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param sprintId the primary key of the current sprint
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sprint
	 * @throws NoSuchSprintException if a sprint with the primary key could not be found
	 */
	public static Sprint[] findByUuid_C_PrevAndNext(
			long sprintId, String uuid, long companyId,
			OrderByComparator<Sprint> orderByComparator)
		throws com.savvy.sb.exception.NoSuchSprintException {

		return getPersistence().findByUuid_C_PrevAndNext(
			sprintId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the sprints where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of sprints where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching sprints
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the sprints where tituloSprint = &#63;.
	 *
	 * @param tituloSprint the titulo sprint
	 * @return the matching sprints
	 */
	public static List<Sprint> findByTituloSprint(String tituloSprint) {
		return getPersistence().findByTituloSprint(tituloSprint);
	}

	/**
	 * Returns a range of all the sprints where tituloSprint = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SprintModelImpl</code>.
	 * </p>
	 *
	 * @param tituloSprint the titulo sprint
	 * @param start the lower bound of the range of sprints
	 * @param end the upper bound of the range of sprints (not inclusive)
	 * @return the range of matching sprints
	 */
	public static List<Sprint> findByTituloSprint(
		String tituloSprint, int start, int end) {

		return getPersistence().findByTituloSprint(tituloSprint, start, end);
	}

	/**
	 * Returns an ordered range of all the sprints where tituloSprint = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SprintModelImpl</code>.
	 * </p>
	 *
	 * @param tituloSprint the titulo sprint
	 * @param start the lower bound of the range of sprints
	 * @param end the upper bound of the range of sprints (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sprints
	 */
	public static List<Sprint> findByTituloSprint(
		String tituloSprint, int start, int end,
		OrderByComparator<Sprint> orderByComparator) {

		return getPersistence().findByTituloSprint(
			tituloSprint, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sprints where tituloSprint = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SprintModelImpl</code>.
	 * </p>
	 *
	 * @param tituloSprint the titulo sprint
	 * @param start the lower bound of the range of sprints
	 * @param end the upper bound of the range of sprints (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sprints
	 */
	public static List<Sprint> findByTituloSprint(
		String tituloSprint, int start, int end,
		OrderByComparator<Sprint> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByTituloSprint(
			tituloSprint, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first sprint in the ordered set where tituloSprint = &#63;.
	 *
	 * @param tituloSprint the titulo sprint
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sprint
	 * @throws NoSuchSprintException if a matching sprint could not be found
	 */
	public static Sprint findByTituloSprint_First(
			String tituloSprint, OrderByComparator<Sprint> orderByComparator)
		throws com.savvy.sb.exception.NoSuchSprintException {

		return getPersistence().findByTituloSprint_First(
			tituloSprint, orderByComparator);
	}

	/**
	 * Returns the first sprint in the ordered set where tituloSprint = &#63;.
	 *
	 * @param tituloSprint the titulo sprint
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sprint, or <code>null</code> if a matching sprint could not be found
	 */
	public static Sprint fetchByTituloSprint_First(
		String tituloSprint, OrderByComparator<Sprint> orderByComparator) {

		return getPersistence().fetchByTituloSprint_First(
			tituloSprint, orderByComparator);
	}

	/**
	 * Returns the last sprint in the ordered set where tituloSprint = &#63;.
	 *
	 * @param tituloSprint the titulo sprint
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sprint
	 * @throws NoSuchSprintException if a matching sprint could not be found
	 */
	public static Sprint findByTituloSprint_Last(
			String tituloSprint, OrderByComparator<Sprint> orderByComparator)
		throws com.savvy.sb.exception.NoSuchSprintException {

		return getPersistence().findByTituloSprint_Last(
			tituloSprint, orderByComparator);
	}

	/**
	 * Returns the last sprint in the ordered set where tituloSprint = &#63;.
	 *
	 * @param tituloSprint the titulo sprint
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sprint, or <code>null</code> if a matching sprint could not be found
	 */
	public static Sprint fetchByTituloSprint_Last(
		String tituloSprint, OrderByComparator<Sprint> orderByComparator) {

		return getPersistence().fetchByTituloSprint_Last(
			tituloSprint, orderByComparator);
	}

	/**
	 * Returns the sprints before and after the current sprint in the ordered set where tituloSprint = &#63;.
	 *
	 * @param sprintId the primary key of the current sprint
	 * @param tituloSprint the titulo sprint
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sprint
	 * @throws NoSuchSprintException if a sprint with the primary key could not be found
	 */
	public static Sprint[] findByTituloSprint_PrevAndNext(
			long sprintId, String tituloSprint,
			OrderByComparator<Sprint> orderByComparator)
		throws com.savvy.sb.exception.NoSuchSprintException {

		return getPersistence().findByTituloSprint_PrevAndNext(
			sprintId, tituloSprint, orderByComparator);
	}

	/**
	 * Removes all the sprints where tituloSprint = &#63; from the database.
	 *
	 * @param tituloSprint the titulo sprint
	 */
	public static void removeByTituloSprint(String tituloSprint) {
		getPersistence().removeByTituloSprint(tituloSprint);
	}

	/**
	 * Returns the number of sprints where tituloSprint = &#63;.
	 *
	 * @param tituloSprint the titulo sprint
	 * @return the number of matching sprints
	 */
	public static int countByTituloSprint(String tituloSprint) {
		return getPersistence().countByTituloSprint(tituloSprint);
	}

	/**
	 * Caches the sprint in the entity cache if it is enabled.
	 *
	 * @param sprint the sprint
	 */
	public static void cacheResult(Sprint sprint) {
		getPersistence().cacheResult(sprint);
	}

	/**
	 * Caches the sprints in the entity cache if it is enabled.
	 *
	 * @param sprints the sprints
	 */
	public static void cacheResult(List<Sprint> sprints) {
		getPersistence().cacheResult(sprints);
	}

	/**
	 * Creates a new sprint with the primary key. Does not add the sprint to the database.
	 *
	 * @param sprintId the primary key for the new sprint
	 * @return the new sprint
	 */
	public static Sprint create(long sprintId) {
		return getPersistence().create(sprintId);
	}

	/**
	 * Removes the sprint with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sprintId the primary key of the sprint
	 * @return the sprint that was removed
	 * @throws NoSuchSprintException if a sprint with the primary key could not be found
	 */
	public static Sprint remove(long sprintId)
		throws com.savvy.sb.exception.NoSuchSprintException {

		return getPersistence().remove(sprintId);
	}

	public static Sprint updateImpl(Sprint sprint) {
		return getPersistence().updateImpl(sprint);
	}

	/**
	 * Returns the sprint with the primary key or throws a <code>NoSuchSprintException</code> if it could not be found.
	 *
	 * @param sprintId the primary key of the sprint
	 * @return the sprint
	 * @throws NoSuchSprintException if a sprint with the primary key could not be found
	 */
	public static Sprint findByPrimaryKey(long sprintId)
		throws com.savvy.sb.exception.NoSuchSprintException {

		return getPersistence().findByPrimaryKey(sprintId);
	}

	/**
	 * Returns the sprint with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sprintId the primary key of the sprint
	 * @return the sprint, or <code>null</code> if a sprint with the primary key could not be found
	 */
	public static Sprint fetchByPrimaryKey(long sprintId) {
		return getPersistence().fetchByPrimaryKey(sprintId);
	}

	/**
	 * Returns all the sprints.
	 *
	 * @return the sprints
	 */
	public static List<Sprint> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the sprints.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SprintModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sprints
	 * @param end the upper bound of the range of sprints (not inclusive)
	 * @return the range of sprints
	 */
	public static List<Sprint> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the sprints.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SprintModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sprints
	 * @param end the upper bound of the range of sprints (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sprints
	 */
	public static List<Sprint> findAll(
		int start, int end, OrderByComparator<Sprint> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sprints.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SprintModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sprints
	 * @param end the upper bound of the range of sprints (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sprints
	 */
	public static List<Sprint> findAll(
		int start, int end, OrderByComparator<Sprint> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the sprints from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of sprints.
	 *
	 * @return the number of sprints
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SprintPersistence getPersistence() {
		return _persistence;
	}

	private static volatile SprintPersistence _persistence;

}
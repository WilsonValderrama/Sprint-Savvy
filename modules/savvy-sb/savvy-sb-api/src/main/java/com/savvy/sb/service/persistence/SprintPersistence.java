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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.savvy.sb.exception.NoSuchSprintException;
import com.savvy.sb.model.Sprint;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the sprint service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SprintUtil
 * @generated
 */
@ProviderType
public interface SprintPersistence extends BasePersistence<Sprint> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SprintUtil} to access the sprint persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the sprints where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching sprints
	 */
	public java.util.List<Sprint> findByUuid(String uuid);

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
	public java.util.List<Sprint> findByUuid(String uuid, int start, int end);

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
	public java.util.List<Sprint> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Sprint>
			orderByComparator);

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
	public java.util.List<Sprint> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Sprint>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first sprint in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sprint
	 * @throws NoSuchSprintException if a matching sprint could not be found
	 */
	public Sprint findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Sprint>
				orderByComparator)
		throws NoSuchSprintException;

	/**
	 * Returns the first sprint in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sprint, or <code>null</code> if a matching sprint could not be found
	 */
	public Sprint fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Sprint>
			orderByComparator);

	/**
	 * Returns the last sprint in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sprint
	 * @throws NoSuchSprintException if a matching sprint could not be found
	 */
	public Sprint findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Sprint>
				orderByComparator)
		throws NoSuchSprintException;

	/**
	 * Returns the last sprint in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sprint, or <code>null</code> if a matching sprint could not be found
	 */
	public Sprint fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Sprint>
			orderByComparator);

	/**
	 * Returns the sprints before and after the current sprint in the ordered set where uuid = &#63;.
	 *
	 * @param sprintId the primary key of the current sprint
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sprint
	 * @throws NoSuchSprintException if a sprint with the primary key could not be found
	 */
	public Sprint[] findByUuid_PrevAndNext(
			long sprintId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Sprint>
				orderByComparator)
		throws NoSuchSprintException;

	/**
	 * Removes all the sprints where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of sprints where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching sprints
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the sprint where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchSprintException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching sprint
	 * @throws NoSuchSprintException if a matching sprint could not be found
	 */
	public Sprint findByUUID_G(String uuid, long groupId)
		throws NoSuchSprintException;

	/**
	 * Returns the sprint where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching sprint, or <code>null</code> if a matching sprint could not be found
	 */
	public Sprint fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the sprint where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sprint, or <code>null</code> if a matching sprint could not be found
	 */
	public Sprint fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the sprint where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the sprint that was removed
	 */
	public Sprint removeByUUID_G(String uuid, long groupId)
		throws NoSuchSprintException;

	/**
	 * Returns the number of sprints where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching sprints
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the sprints where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching sprints
	 */
	public java.util.List<Sprint> findByUuid_C(String uuid, long companyId);

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
	public java.util.List<Sprint> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<Sprint> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Sprint>
			orderByComparator);

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
	public java.util.List<Sprint> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Sprint>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first sprint in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sprint
	 * @throws NoSuchSprintException if a matching sprint could not be found
	 */
	public Sprint findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Sprint>
				orderByComparator)
		throws NoSuchSprintException;

	/**
	 * Returns the first sprint in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sprint, or <code>null</code> if a matching sprint could not be found
	 */
	public Sprint fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Sprint>
			orderByComparator);

	/**
	 * Returns the last sprint in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sprint
	 * @throws NoSuchSprintException if a matching sprint could not be found
	 */
	public Sprint findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Sprint>
				orderByComparator)
		throws NoSuchSprintException;

	/**
	 * Returns the last sprint in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sprint, or <code>null</code> if a matching sprint could not be found
	 */
	public Sprint fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Sprint>
			orderByComparator);

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
	public Sprint[] findByUuid_C_PrevAndNext(
			long sprintId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Sprint>
				orderByComparator)
		throws NoSuchSprintException;

	/**
	 * Removes all the sprints where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of sprints where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching sprints
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the sprints where tituloSprint = &#63;.
	 *
	 * @param tituloSprint the titulo sprint
	 * @return the matching sprints
	 */
	public java.util.List<Sprint> findByTituloSprint(String tituloSprint);

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
	public java.util.List<Sprint> findByTituloSprint(
		String tituloSprint, int start, int end);

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
	public java.util.List<Sprint> findByTituloSprint(
		String tituloSprint, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Sprint>
			orderByComparator);

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
	public java.util.List<Sprint> findByTituloSprint(
		String tituloSprint, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Sprint>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first sprint in the ordered set where tituloSprint = &#63;.
	 *
	 * @param tituloSprint the titulo sprint
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sprint
	 * @throws NoSuchSprintException if a matching sprint could not be found
	 */
	public Sprint findByTituloSprint_First(
			String tituloSprint,
			com.liferay.portal.kernel.util.OrderByComparator<Sprint>
				orderByComparator)
		throws NoSuchSprintException;

	/**
	 * Returns the first sprint in the ordered set where tituloSprint = &#63;.
	 *
	 * @param tituloSprint the titulo sprint
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sprint, or <code>null</code> if a matching sprint could not be found
	 */
	public Sprint fetchByTituloSprint_First(
		String tituloSprint,
		com.liferay.portal.kernel.util.OrderByComparator<Sprint>
			orderByComparator);

	/**
	 * Returns the last sprint in the ordered set where tituloSprint = &#63;.
	 *
	 * @param tituloSprint the titulo sprint
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sprint
	 * @throws NoSuchSprintException if a matching sprint could not be found
	 */
	public Sprint findByTituloSprint_Last(
			String tituloSprint,
			com.liferay.portal.kernel.util.OrderByComparator<Sprint>
				orderByComparator)
		throws NoSuchSprintException;

	/**
	 * Returns the last sprint in the ordered set where tituloSprint = &#63;.
	 *
	 * @param tituloSprint the titulo sprint
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sprint, or <code>null</code> if a matching sprint could not be found
	 */
	public Sprint fetchByTituloSprint_Last(
		String tituloSprint,
		com.liferay.portal.kernel.util.OrderByComparator<Sprint>
			orderByComparator);

	/**
	 * Returns the sprints before and after the current sprint in the ordered set where tituloSprint = &#63;.
	 *
	 * @param sprintId the primary key of the current sprint
	 * @param tituloSprint the titulo sprint
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sprint
	 * @throws NoSuchSprintException if a sprint with the primary key could not be found
	 */
	public Sprint[] findByTituloSprint_PrevAndNext(
			long sprintId, String tituloSprint,
			com.liferay.portal.kernel.util.OrderByComparator<Sprint>
				orderByComparator)
		throws NoSuchSprintException;

	/**
	 * Removes all the sprints where tituloSprint = &#63; from the database.
	 *
	 * @param tituloSprint the titulo sprint
	 */
	public void removeByTituloSprint(String tituloSprint);

	/**
	 * Returns the number of sprints where tituloSprint = &#63;.
	 *
	 * @param tituloSprint the titulo sprint
	 * @return the number of matching sprints
	 */
	public int countByTituloSprint(String tituloSprint);

	/**
	 * Caches the sprint in the entity cache if it is enabled.
	 *
	 * @param sprint the sprint
	 */
	public void cacheResult(Sprint sprint);

	/**
	 * Caches the sprints in the entity cache if it is enabled.
	 *
	 * @param sprints the sprints
	 */
	public void cacheResult(java.util.List<Sprint> sprints);

	/**
	 * Creates a new sprint with the primary key. Does not add the sprint to the database.
	 *
	 * @param sprintId the primary key for the new sprint
	 * @return the new sprint
	 */
	public Sprint create(long sprintId);

	/**
	 * Removes the sprint with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sprintId the primary key of the sprint
	 * @return the sprint that was removed
	 * @throws NoSuchSprintException if a sprint with the primary key could not be found
	 */
	public Sprint remove(long sprintId) throws NoSuchSprintException;

	public Sprint updateImpl(Sprint sprint);

	/**
	 * Returns the sprint with the primary key or throws a <code>NoSuchSprintException</code> if it could not be found.
	 *
	 * @param sprintId the primary key of the sprint
	 * @return the sprint
	 * @throws NoSuchSprintException if a sprint with the primary key could not be found
	 */
	public Sprint findByPrimaryKey(long sprintId) throws NoSuchSprintException;

	/**
	 * Returns the sprint with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sprintId the primary key of the sprint
	 * @return the sprint, or <code>null</code> if a sprint with the primary key could not be found
	 */
	public Sprint fetchByPrimaryKey(long sprintId);

	/**
	 * Returns all the sprints.
	 *
	 * @return the sprints
	 */
	public java.util.List<Sprint> findAll();

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
	public java.util.List<Sprint> findAll(int start, int end);

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
	public java.util.List<Sprint> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Sprint>
			orderByComparator);

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
	public java.util.List<Sprint> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Sprint>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the sprints from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of sprints.
	 *
	 * @return the number of sprints
	 */
	public int countAll();

}
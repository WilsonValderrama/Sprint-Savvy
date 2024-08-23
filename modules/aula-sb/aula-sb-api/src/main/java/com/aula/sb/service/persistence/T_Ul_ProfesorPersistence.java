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

import com.aula.sb.exception.NoSuchT_Ul_ProfesorException;
import com.aula.sb.model.T_Ul_Profesor;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the t_ ul_ profesor service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see T_Ul_ProfesorUtil
 * @generated
 */
@ProviderType
public interface T_Ul_ProfesorPersistence
	extends BasePersistence<T_Ul_Profesor> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link T_Ul_ProfesorUtil} to access the t_ ul_ profesor persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the t_ ul_ profesors where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching t_ ul_ profesors
	 */
	public java.util.List<T_Ul_Profesor> findByUuid(String uuid);

	/**
	 * Returns a range of all the t_ ul_ profesors where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_ProfesorModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of t_ ul_ profesors
	 * @param end the upper bound of the range of t_ ul_ profesors (not inclusive)
	 * @return the range of matching t_ ul_ profesors
	 */
	public java.util.List<T_Ul_Profesor> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the t_ ul_ profesors where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_ProfesorModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of t_ ul_ profesors
	 * @param end the upper bound of the range of t_ ul_ profesors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t_ ul_ profesors
	 */
	public java.util.List<T_Ul_Profesor> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Profesor>
			orderByComparator);

	/**
	 * Returns an ordered range of all the t_ ul_ profesors where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_ProfesorModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of t_ ul_ profesors
	 * @param end the upper bound of the range of t_ ul_ profesors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching t_ ul_ profesors
	 */
	public java.util.List<T_Ul_Profesor> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Profesor>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first t_ ul_ profesor in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ profesor
	 * @throws NoSuchT_Ul_ProfesorException if a matching t_ ul_ profesor could not be found
	 */
	public T_Ul_Profesor findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Profesor>
				orderByComparator)
		throws NoSuchT_Ul_ProfesorException;

	/**
	 * Returns the first t_ ul_ profesor in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ profesor, or <code>null</code> if a matching t_ ul_ profesor could not be found
	 */
	public T_Ul_Profesor fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Profesor>
			orderByComparator);

	/**
	 * Returns the last t_ ul_ profesor in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ profesor
	 * @throws NoSuchT_Ul_ProfesorException if a matching t_ ul_ profesor could not be found
	 */
	public T_Ul_Profesor findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Profesor>
				orderByComparator)
		throws NoSuchT_Ul_ProfesorException;

	/**
	 * Returns the last t_ ul_ profesor in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ profesor, or <code>null</code> if a matching t_ ul_ profesor could not be found
	 */
	public T_Ul_Profesor fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Profesor>
			orderByComparator);

	/**
	 * Returns the t_ ul_ profesors before and after the current t_ ul_ profesor in the ordered set where uuid = &#63;.
	 *
	 * @param idProfesor the primary key of the current t_ ul_ profesor
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t_ ul_ profesor
	 * @throws NoSuchT_Ul_ProfesorException if a t_ ul_ profesor with the primary key could not be found
	 */
	public T_Ul_Profesor[] findByUuid_PrevAndNext(
			long idProfesor, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Profesor>
				orderByComparator)
		throws NoSuchT_Ul_ProfesorException;

	/**
	 * Removes all the t_ ul_ profesors where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of t_ ul_ profesors where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching t_ ul_ profesors
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the t_ ul_ profesor where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchT_Ul_ProfesorException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching t_ ul_ profesor
	 * @throws NoSuchT_Ul_ProfesorException if a matching t_ ul_ profesor could not be found
	 */
	public T_Ul_Profesor findByUUID_G(String uuid, long groupId)
		throws NoSuchT_Ul_ProfesorException;

	/**
	 * Returns the t_ ul_ profesor where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching t_ ul_ profesor, or <code>null</code> if a matching t_ ul_ profesor could not be found
	 */
	public T_Ul_Profesor fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the t_ ul_ profesor where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching t_ ul_ profesor, or <code>null</code> if a matching t_ ul_ profesor could not be found
	 */
	public T_Ul_Profesor fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the t_ ul_ profesor where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the t_ ul_ profesor that was removed
	 */
	public T_Ul_Profesor removeByUUID_G(String uuid, long groupId)
		throws NoSuchT_Ul_ProfesorException;

	/**
	 * Returns the number of t_ ul_ profesors where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching t_ ul_ profesors
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the t_ ul_ profesors where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching t_ ul_ profesors
	 */
	public java.util.List<T_Ul_Profesor> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the t_ ul_ profesors where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_ProfesorModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of t_ ul_ profesors
	 * @param end the upper bound of the range of t_ ul_ profesors (not inclusive)
	 * @return the range of matching t_ ul_ profesors
	 */
	public java.util.List<T_Ul_Profesor> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the t_ ul_ profesors where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_ProfesorModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of t_ ul_ profesors
	 * @param end the upper bound of the range of t_ ul_ profesors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t_ ul_ profesors
	 */
	public java.util.List<T_Ul_Profesor> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Profesor>
			orderByComparator);

	/**
	 * Returns an ordered range of all the t_ ul_ profesors where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_ProfesorModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of t_ ul_ profesors
	 * @param end the upper bound of the range of t_ ul_ profesors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching t_ ul_ profesors
	 */
	public java.util.List<T_Ul_Profesor> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Profesor>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first t_ ul_ profesor in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ profesor
	 * @throws NoSuchT_Ul_ProfesorException if a matching t_ ul_ profesor could not be found
	 */
	public T_Ul_Profesor findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Profesor>
				orderByComparator)
		throws NoSuchT_Ul_ProfesorException;

	/**
	 * Returns the first t_ ul_ profesor in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ profesor, or <code>null</code> if a matching t_ ul_ profesor could not be found
	 */
	public T_Ul_Profesor fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Profesor>
			orderByComparator);

	/**
	 * Returns the last t_ ul_ profesor in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ profesor
	 * @throws NoSuchT_Ul_ProfesorException if a matching t_ ul_ profesor could not be found
	 */
	public T_Ul_Profesor findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Profesor>
				orderByComparator)
		throws NoSuchT_Ul_ProfesorException;

	/**
	 * Returns the last t_ ul_ profesor in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ profesor, or <code>null</code> if a matching t_ ul_ profesor could not be found
	 */
	public T_Ul_Profesor fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Profesor>
			orderByComparator);

	/**
	 * Returns the t_ ul_ profesors before and after the current t_ ul_ profesor in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param idProfesor the primary key of the current t_ ul_ profesor
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t_ ul_ profesor
	 * @throws NoSuchT_Ul_ProfesorException if a t_ ul_ profesor with the primary key could not be found
	 */
	public T_Ul_Profesor[] findByUuid_C_PrevAndNext(
			long idProfesor, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Profesor>
				orderByComparator)
		throws NoSuchT_Ul_ProfesorException;

	/**
	 * Removes all the t_ ul_ profesors where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of t_ ul_ profesors where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching t_ ul_ profesors
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the t_ ul_ profesors where nombreProfesor = &#63;.
	 *
	 * @param nombreProfesor the nombre profesor
	 * @return the matching t_ ul_ profesors
	 */
	public java.util.List<T_Ul_Profesor> findBynombreProfesor(
		String nombreProfesor);

	/**
	 * Returns a range of all the t_ ul_ profesors where nombreProfesor = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_ProfesorModelImpl</code>.
	 * </p>
	 *
	 * @param nombreProfesor the nombre profesor
	 * @param start the lower bound of the range of t_ ul_ profesors
	 * @param end the upper bound of the range of t_ ul_ profesors (not inclusive)
	 * @return the range of matching t_ ul_ profesors
	 */
	public java.util.List<T_Ul_Profesor> findBynombreProfesor(
		String nombreProfesor, int start, int end);

	/**
	 * Returns an ordered range of all the t_ ul_ profesors where nombreProfesor = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_ProfesorModelImpl</code>.
	 * </p>
	 *
	 * @param nombreProfesor the nombre profesor
	 * @param start the lower bound of the range of t_ ul_ profesors
	 * @param end the upper bound of the range of t_ ul_ profesors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t_ ul_ profesors
	 */
	public java.util.List<T_Ul_Profesor> findBynombreProfesor(
		String nombreProfesor, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Profesor>
			orderByComparator);

	/**
	 * Returns an ordered range of all the t_ ul_ profesors where nombreProfesor = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_ProfesorModelImpl</code>.
	 * </p>
	 *
	 * @param nombreProfesor the nombre profesor
	 * @param start the lower bound of the range of t_ ul_ profesors
	 * @param end the upper bound of the range of t_ ul_ profesors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching t_ ul_ profesors
	 */
	public java.util.List<T_Ul_Profesor> findBynombreProfesor(
		String nombreProfesor, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Profesor>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first t_ ul_ profesor in the ordered set where nombreProfesor = &#63;.
	 *
	 * @param nombreProfesor the nombre profesor
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ profesor
	 * @throws NoSuchT_Ul_ProfesorException if a matching t_ ul_ profesor could not be found
	 */
	public T_Ul_Profesor findBynombreProfesor_First(
			String nombreProfesor,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Profesor>
				orderByComparator)
		throws NoSuchT_Ul_ProfesorException;

	/**
	 * Returns the first t_ ul_ profesor in the ordered set where nombreProfesor = &#63;.
	 *
	 * @param nombreProfesor the nombre profesor
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ profesor, or <code>null</code> if a matching t_ ul_ profesor could not be found
	 */
	public T_Ul_Profesor fetchBynombreProfesor_First(
		String nombreProfesor,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Profesor>
			orderByComparator);

	/**
	 * Returns the last t_ ul_ profesor in the ordered set where nombreProfesor = &#63;.
	 *
	 * @param nombreProfesor the nombre profesor
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ profesor
	 * @throws NoSuchT_Ul_ProfesorException if a matching t_ ul_ profesor could not be found
	 */
	public T_Ul_Profesor findBynombreProfesor_Last(
			String nombreProfesor,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Profesor>
				orderByComparator)
		throws NoSuchT_Ul_ProfesorException;

	/**
	 * Returns the last t_ ul_ profesor in the ordered set where nombreProfesor = &#63;.
	 *
	 * @param nombreProfesor the nombre profesor
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ profesor, or <code>null</code> if a matching t_ ul_ profesor could not be found
	 */
	public T_Ul_Profesor fetchBynombreProfesor_Last(
		String nombreProfesor,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Profesor>
			orderByComparator);

	/**
	 * Returns the t_ ul_ profesors before and after the current t_ ul_ profesor in the ordered set where nombreProfesor = &#63;.
	 *
	 * @param idProfesor the primary key of the current t_ ul_ profesor
	 * @param nombreProfesor the nombre profesor
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t_ ul_ profesor
	 * @throws NoSuchT_Ul_ProfesorException if a t_ ul_ profesor with the primary key could not be found
	 */
	public T_Ul_Profesor[] findBynombreProfesor_PrevAndNext(
			long idProfesor, String nombreProfesor,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Profesor>
				orderByComparator)
		throws NoSuchT_Ul_ProfesorException;

	/**
	 * Removes all the t_ ul_ profesors where nombreProfesor = &#63; from the database.
	 *
	 * @param nombreProfesor the nombre profesor
	 */
	public void removeBynombreProfesor(String nombreProfesor);

	/**
	 * Returns the number of t_ ul_ profesors where nombreProfesor = &#63;.
	 *
	 * @param nombreProfesor the nombre profesor
	 * @return the number of matching t_ ul_ profesors
	 */
	public int countBynombreProfesor(String nombreProfesor);

	/**
	 * Caches the t_ ul_ profesor in the entity cache if it is enabled.
	 *
	 * @param t_Ul_Profesor the t_ ul_ profesor
	 */
	public void cacheResult(T_Ul_Profesor t_Ul_Profesor);

	/**
	 * Caches the t_ ul_ profesors in the entity cache if it is enabled.
	 *
	 * @param t_Ul_Profesors the t_ ul_ profesors
	 */
	public void cacheResult(java.util.List<T_Ul_Profesor> t_Ul_Profesors);

	/**
	 * Creates a new t_ ul_ profesor with the primary key. Does not add the t_ ul_ profesor to the database.
	 *
	 * @param idProfesor the primary key for the new t_ ul_ profesor
	 * @return the new t_ ul_ profesor
	 */
	public T_Ul_Profesor create(long idProfesor);

	/**
	 * Removes the t_ ul_ profesor with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param idProfesor the primary key of the t_ ul_ profesor
	 * @return the t_ ul_ profesor that was removed
	 * @throws NoSuchT_Ul_ProfesorException if a t_ ul_ profesor with the primary key could not be found
	 */
	public T_Ul_Profesor remove(long idProfesor)
		throws NoSuchT_Ul_ProfesorException;

	public T_Ul_Profesor updateImpl(T_Ul_Profesor t_Ul_Profesor);

	/**
	 * Returns the t_ ul_ profesor with the primary key or throws a <code>NoSuchT_Ul_ProfesorException</code> if it could not be found.
	 *
	 * @param idProfesor the primary key of the t_ ul_ profesor
	 * @return the t_ ul_ profesor
	 * @throws NoSuchT_Ul_ProfesorException if a t_ ul_ profesor with the primary key could not be found
	 */
	public T_Ul_Profesor findByPrimaryKey(long idProfesor)
		throws NoSuchT_Ul_ProfesorException;

	/**
	 * Returns the t_ ul_ profesor with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param idProfesor the primary key of the t_ ul_ profesor
	 * @return the t_ ul_ profesor, or <code>null</code> if a t_ ul_ profesor with the primary key could not be found
	 */
	public T_Ul_Profesor fetchByPrimaryKey(long idProfesor);

	/**
	 * Returns all the t_ ul_ profesors.
	 *
	 * @return the t_ ul_ profesors
	 */
	public java.util.List<T_Ul_Profesor> findAll();

	/**
	 * Returns a range of all the t_ ul_ profesors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_ProfesorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_ profesors
	 * @param end the upper bound of the range of t_ ul_ profesors (not inclusive)
	 * @return the range of t_ ul_ profesors
	 */
	public java.util.List<T_Ul_Profesor> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the t_ ul_ profesors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_ProfesorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_ profesors
	 * @param end the upper bound of the range of t_ ul_ profesors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of t_ ul_ profesors
	 */
	public java.util.List<T_Ul_Profesor> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Profesor>
			orderByComparator);

	/**
	 * Returns an ordered range of all the t_ ul_ profesors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_ProfesorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_ profesors
	 * @param end the upper bound of the range of t_ ul_ profesors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of t_ ul_ profesors
	 */
	public java.util.List<T_Ul_Profesor> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Profesor>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the t_ ul_ profesors from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of t_ ul_ profesors.
	 *
	 * @return the number of t_ ul_ profesors
	 */
	public int countAll();

}
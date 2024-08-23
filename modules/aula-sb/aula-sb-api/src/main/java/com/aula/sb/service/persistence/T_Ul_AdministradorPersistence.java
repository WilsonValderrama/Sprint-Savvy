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

import com.aula.sb.exception.NoSuchT_Ul_AdministradorException;
import com.aula.sb.model.T_Ul_Administrador;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the t_ ul_ administrador service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see T_Ul_AdministradorUtil
 * @generated
 */
@ProviderType
public interface T_Ul_AdministradorPersistence
	extends BasePersistence<T_Ul_Administrador> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link T_Ul_AdministradorUtil} to access the t_ ul_ administrador persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the t_ ul_ administradors where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching t_ ul_ administradors
	 */
	public java.util.List<T_Ul_Administrador> findByUuid(String uuid);

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
	public java.util.List<T_Ul_Administrador> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<T_Ul_Administrador> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Administrador>
			orderByComparator);

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
	public java.util.List<T_Ul_Administrador> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Administrador>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first t_ ul_ administrador in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ administrador
	 * @throws NoSuchT_Ul_AdministradorException if a matching t_ ul_ administrador could not be found
	 */
	public T_Ul_Administrador findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Administrador>
				orderByComparator)
		throws NoSuchT_Ul_AdministradorException;

	/**
	 * Returns the first t_ ul_ administrador in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ administrador, or <code>null</code> if a matching t_ ul_ administrador could not be found
	 */
	public T_Ul_Administrador fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Administrador>
			orderByComparator);

	/**
	 * Returns the last t_ ul_ administrador in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ administrador
	 * @throws NoSuchT_Ul_AdministradorException if a matching t_ ul_ administrador could not be found
	 */
	public T_Ul_Administrador findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Administrador>
				orderByComparator)
		throws NoSuchT_Ul_AdministradorException;

	/**
	 * Returns the last t_ ul_ administrador in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ administrador, or <code>null</code> if a matching t_ ul_ administrador could not be found
	 */
	public T_Ul_Administrador fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Administrador>
			orderByComparator);

	/**
	 * Returns the t_ ul_ administradors before and after the current t_ ul_ administrador in the ordered set where uuid = &#63;.
	 *
	 * @param idAdmin the primary key of the current t_ ul_ administrador
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t_ ul_ administrador
	 * @throws NoSuchT_Ul_AdministradorException if a t_ ul_ administrador with the primary key could not be found
	 */
	public T_Ul_Administrador[] findByUuid_PrevAndNext(
			long idAdmin, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Administrador>
				orderByComparator)
		throws NoSuchT_Ul_AdministradorException;

	/**
	 * Removes all the t_ ul_ administradors where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of t_ ul_ administradors where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching t_ ul_ administradors
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the t_ ul_ administrador where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchT_Ul_AdministradorException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching t_ ul_ administrador
	 * @throws NoSuchT_Ul_AdministradorException if a matching t_ ul_ administrador could not be found
	 */
	public T_Ul_Administrador findByUUID_G(String uuid, long groupId)
		throws NoSuchT_Ul_AdministradorException;

	/**
	 * Returns the t_ ul_ administrador where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching t_ ul_ administrador, or <code>null</code> if a matching t_ ul_ administrador could not be found
	 */
	public T_Ul_Administrador fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the t_ ul_ administrador where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching t_ ul_ administrador, or <code>null</code> if a matching t_ ul_ administrador could not be found
	 */
	public T_Ul_Administrador fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the t_ ul_ administrador where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the t_ ul_ administrador that was removed
	 */
	public T_Ul_Administrador removeByUUID_G(String uuid, long groupId)
		throws NoSuchT_Ul_AdministradorException;

	/**
	 * Returns the number of t_ ul_ administradors where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching t_ ul_ administradors
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the t_ ul_ administradors where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching t_ ul_ administradors
	 */
	public java.util.List<T_Ul_Administrador> findByUuid_C(
		String uuid, long companyId);

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
	public java.util.List<T_Ul_Administrador> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<T_Ul_Administrador> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Administrador>
			orderByComparator);

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
	public java.util.List<T_Ul_Administrador> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Administrador>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first t_ ul_ administrador in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ administrador
	 * @throws NoSuchT_Ul_AdministradorException if a matching t_ ul_ administrador could not be found
	 */
	public T_Ul_Administrador findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Administrador>
				orderByComparator)
		throws NoSuchT_Ul_AdministradorException;

	/**
	 * Returns the first t_ ul_ administrador in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ administrador, or <code>null</code> if a matching t_ ul_ administrador could not be found
	 */
	public T_Ul_Administrador fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Administrador>
			orderByComparator);

	/**
	 * Returns the last t_ ul_ administrador in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ administrador
	 * @throws NoSuchT_Ul_AdministradorException if a matching t_ ul_ administrador could not be found
	 */
	public T_Ul_Administrador findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Administrador>
				orderByComparator)
		throws NoSuchT_Ul_AdministradorException;

	/**
	 * Returns the last t_ ul_ administrador in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ administrador, or <code>null</code> if a matching t_ ul_ administrador could not be found
	 */
	public T_Ul_Administrador fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Administrador>
			orderByComparator);

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
	public T_Ul_Administrador[] findByUuid_C_PrevAndNext(
			long idAdmin, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Administrador>
				orderByComparator)
		throws NoSuchT_Ul_AdministradorException;

	/**
	 * Removes all the t_ ul_ administradors where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of t_ ul_ administradors where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching t_ ul_ administradors
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the t_ ul_ administradors where nombreAdmin = &#63;.
	 *
	 * @param nombreAdmin the nombre admin
	 * @return the matching t_ ul_ administradors
	 */
	public java.util.List<T_Ul_Administrador> findBynombreAdmin(
		String nombreAdmin);

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
	public java.util.List<T_Ul_Administrador> findBynombreAdmin(
		String nombreAdmin, int start, int end);

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
	public java.util.List<T_Ul_Administrador> findBynombreAdmin(
		String nombreAdmin, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Administrador>
			orderByComparator);

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
	public java.util.List<T_Ul_Administrador> findBynombreAdmin(
		String nombreAdmin, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Administrador>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first t_ ul_ administrador in the ordered set where nombreAdmin = &#63;.
	 *
	 * @param nombreAdmin the nombre admin
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ administrador
	 * @throws NoSuchT_Ul_AdministradorException if a matching t_ ul_ administrador could not be found
	 */
	public T_Ul_Administrador findBynombreAdmin_First(
			String nombreAdmin,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Administrador>
				orderByComparator)
		throws NoSuchT_Ul_AdministradorException;

	/**
	 * Returns the first t_ ul_ administrador in the ordered set where nombreAdmin = &#63;.
	 *
	 * @param nombreAdmin the nombre admin
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ administrador, or <code>null</code> if a matching t_ ul_ administrador could not be found
	 */
	public T_Ul_Administrador fetchBynombreAdmin_First(
		String nombreAdmin,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Administrador>
			orderByComparator);

	/**
	 * Returns the last t_ ul_ administrador in the ordered set where nombreAdmin = &#63;.
	 *
	 * @param nombreAdmin the nombre admin
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ administrador
	 * @throws NoSuchT_Ul_AdministradorException if a matching t_ ul_ administrador could not be found
	 */
	public T_Ul_Administrador findBynombreAdmin_Last(
			String nombreAdmin,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Administrador>
				orderByComparator)
		throws NoSuchT_Ul_AdministradorException;

	/**
	 * Returns the last t_ ul_ administrador in the ordered set where nombreAdmin = &#63;.
	 *
	 * @param nombreAdmin the nombre admin
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ administrador, or <code>null</code> if a matching t_ ul_ administrador could not be found
	 */
	public T_Ul_Administrador fetchBynombreAdmin_Last(
		String nombreAdmin,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Administrador>
			orderByComparator);

	/**
	 * Returns the t_ ul_ administradors before and after the current t_ ul_ administrador in the ordered set where nombreAdmin = &#63;.
	 *
	 * @param idAdmin the primary key of the current t_ ul_ administrador
	 * @param nombreAdmin the nombre admin
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t_ ul_ administrador
	 * @throws NoSuchT_Ul_AdministradorException if a t_ ul_ administrador with the primary key could not be found
	 */
	public T_Ul_Administrador[] findBynombreAdmin_PrevAndNext(
			long idAdmin, String nombreAdmin,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Administrador>
				orderByComparator)
		throws NoSuchT_Ul_AdministradorException;

	/**
	 * Removes all the t_ ul_ administradors where nombreAdmin = &#63; from the database.
	 *
	 * @param nombreAdmin the nombre admin
	 */
	public void removeBynombreAdmin(String nombreAdmin);

	/**
	 * Returns the number of t_ ul_ administradors where nombreAdmin = &#63;.
	 *
	 * @param nombreAdmin the nombre admin
	 * @return the number of matching t_ ul_ administradors
	 */
	public int countBynombreAdmin(String nombreAdmin);

	/**
	 * Caches the t_ ul_ administrador in the entity cache if it is enabled.
	 *
	 * @param t_Ul_Administrador the t_ ul_ administrador
	 */
	public void cacheResult(T_Ul_Administrador t_Ul_Administrador);

	/**
	 * Caches the t_ ul_ administradors in the entity cache if it is enabled.
	 *
	 * @param t_Ul_Administradors the t_ ul_ administradors
	 */
	public void cacheResult(
		java.util.List<T_Ul_Administrador> t_Ul_Administradors);

	/**
	 * Creates a new t_ ul_ administrador with the primary key. Does not add the t_ ul_ administrador to the database.
	 *
	 * @param idAdmin the primary key for the new t_ ul_ administrador
	 * @return the new t_ ul_ administrador
	 */
	public T_Ul_Administrador create(long idAdmin);

	/**
	 * Removes the t_ ul_ administrador with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param idAdmin the primary key of the t_ ul_ administrador
	 * @return the t_ ul_ administrador that was removed
	 * @throws NoSuchT_Ul_AdministradorException if a t_ ul_ administrador with the primary key could not be found
	 */
	public T_Ul_Administrador remove(long idAdmin)
		throws NoSuchT_Ul_AdministradorException;

	public T_Ul_Administrador updateImpl(T_Ul_Administrador t_Ul_Administrador);

	/**
	 * Returns the t_ ul_ administrador with the primary key or throws a <code>NoSuchT_Ul_AdministradorException</code> if it could not be found.
	 *
	 * @param idAdmin the primary key of the t_ ul_ administrador
	 * @return the t_ ul_ administrador
	 * @throws NoSuchT_Ul_AdministradorException if a t_ ul_ administrador with the primary key could not be found
	 */
	public T_Ul_Administrador findByPrimaryKey(long idAdmin)
		throws NoSuchT_Ul_AdministradorException;

	/**
	 * Returns the t_ ul_ administrador with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param idAdmin the primary key of the t_ ul_ administrador
	 * @return the t_ ul_ administrador, or <code>null</code> if a t_ ul_ administrador with the primary key could not be found
	 */
	public T_Ul_Administrador fetchByPrimaryKey(long idAdmin);

	/**
	 * Returns all the t_ ul_ administradors.
	 *
	 * @return the t_ ul_ administradors
	 */
	public java.util.List<T_Ul_Administrador> findAll();

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
	public java.util.List<T_Ul_Administrador> findAll(int start, int end);

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
	public java.util.List<T_Ul_Administrador> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Administrador>
			orderByComparator);

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
	public java.util.List<T_Ul_Administrador> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Administrador>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the t_ ul_ administradors from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of t_ ul_ administradors.
	 *
	 * @return the number of t_ ul_ administradors
	 */
	public int countAll();

}
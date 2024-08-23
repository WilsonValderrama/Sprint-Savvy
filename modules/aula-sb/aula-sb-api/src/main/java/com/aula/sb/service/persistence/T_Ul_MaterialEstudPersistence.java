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

import com.aula.sb.exception.NoSuchT_Ul_MaterialEstudException;
import com.aula.sb.model.T_Ul_MaterialEstud;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the t_ ul_ material estud service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see T_Ul_MaterialEstudUtil
 * @generated
 */
@ProviderType
public interface T_Ul_MaterialEstudPersistence
	extends BasePersistence<T_Ul_MaterialEstud> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link T_Ul_MaterialEstudUtil} to access the t_ ul_ material estud persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the t_ ul_ material estuds where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching t_ ul_ material estuds
	 */
	public java.util.List<T_Ul_MaterialEstud> findByUuid(String uuid);

	/**
	 * Returns a range of all the t_ ul_ material estuds where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_MaterialEstudModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of t_ ul_ material estuds
	 * @param end the upper bound of the range of t_ ul_ material estuds (not inclusive)
	 * @return the range of matching t_ ul_ material estuds
	 */
	public java.util.List<T_Ul_MaterialEstud> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the t_ ul_ material estuds where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_MaterialEstudModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of t_ ul_ material estuds
	 * @param end the upper bound of the range of t_ ul_ material estuds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t_ ul_ material estuds
	 */
	public java.util.List<T_Ul_MaterialEstud> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_MaterialEstud>
			orderByComparator);

	/**
	 * Returns an ordered range of all the t_ ul_ material estuds where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_MaterialEstudModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of t_ ul_ material estuds
	 * @param end the upper bound of the range of t_ ul_ material estuds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching t_ ul_ material estuds
	 */
	public java.util.List<T_Ul_MaterialEstud> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_MaterialEstud>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first t_ ul_ material estud in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ material estud
	 * @throws NoSuchT_Ul_MaterialEstudException if a matching t_ ul_ material estud could not be found
	 */
	public T_Ul_MaterialEstud findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_MaterialEstud>
				orderByComparator)
		throws NoSuchT_Ul_MaterialEstudException;

	/**
	 * Returns the first t_ ul_ material estud in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ material estud, or <code>null</code> if a matching t_ ul_ material estud could not be found
	 */
	public T_Ul_MaterialEstud fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_MaterialEstud>
			orderByComparator);

	/**
	 * Returns the last t_ ul_ material estud in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ material estud
	 * @throws NoSuchT_Ul_MaterialEstudException if a matching t_ ul_ material estud could not be found
	 */
	public T_Ul_MaterialEstud findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_MaterialEstud>
				orderByComparator)
		throws NoSuchT_Ul_MaterialEstudException;

	/**
	 * Returns the last t_ ul_ material estud in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ material estud, or <code>null</code> if a matching t_ ul_ material estud could not be found
	 */
	public T_Ul_MaterialEstud fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_MaterialEstud>
			orderByComparator);

	/**
	 * Returns the t_ ul_ material estuds before and after the current t_ ul_ material estud in the ordered set where uuid = &#63;.
	 *
	 * @param idMaterial the primary key of the current t_ ul_ material estud
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t_ ul_ material estud
	 * @throws NoSuchT_Ul_MaterialEstudException if a t_ ul_ material estud with the primary key could not be found
	 */
	public T_Ul_MaterialEstud[] findByUuid_PrevAndNext(
			long idMaterial, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_MaterialEstud>
				orderByComparator)
		throws NoSuchT_Ul_MaterialEstudException;

	/**
	 * Removes all the t_ ul_ material estuds where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of t_ ul_ material estuds where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching t_ ul_ material estuds
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the t_ ul_ material estud where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchT_Ul_MaterialEstudException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching t_ ul_ material estud
	 * @throws NoSuchT_Ul_MaterialEstudException if a matching t_ ul_ material estud could not be found
	 */
	public T_Ul_MaterialEstud findByUUID_G(String uuid, long groupId)
		throws NoSuchT_Ul_MaterialEstudException;

	/**
	 * Returns the t_ ul_ material estud where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching t_ ul_ material estud, or <code>null</code> if a matching t_ ul_ material estud could not be found
	 */
	public T_Ul_MaterialEstud fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the t_ ul_ material estud where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching t_ ul_ material estud, or <code>null</code> if a matching t_ ul_ material estud could not be found
	 */
	public T_Ul_MaterialEstud fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the t_ ul_ material estud where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the t_ ul_ material estud that was removed
	 */
	public T_Ul_MaterialEstud removeByUUID_G(String uuid, long groupId)
		throws NoSuchT_Ul_MaterialEstudException;

	/**
	 * Returns the number of t_ ul_ material estuds where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching t_ ul_ material estuds
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the t_ ul_ material estuds where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching t_ ul_ material estuds
	 */
	public java.util.List<T_Ul_MaterialEstud> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the t_ ul_ material estuds where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_MaterialEstudModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of t_ ul_ material estuds
	 * @param end the upper bound of the range of t_ ul_ material estuds (not inclusive)
	 * @return the range of matching t_ ul_ material estuds
	 */
	public java.util.List<T_Ul_MaterialEstud> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the t_ ul_ material estuds where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_MaterialEstudModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of t_ ul_ material estuds
	 * @param end the upper bound of the range of t_ ul_ material estuds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t_ ul_ material estuds
	 */
	public java.util.List<T_Ul_MaterialEstud> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_MaterialEstud>
			orderByComparator);

	/**
	 * Returns an ordered range of all the t_ ul_ material estuds where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_MaterialEstudModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of t_ ul_ material estuds
	 * @param end the upper bound of the range of t_ ul_ material estuds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching t_ ul_ material estuds
	 */
	public java.util.List<T_Ul_MaterialEstud> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_MaterialEstud>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first t_ ul_ material estud in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ material estud
	 * @throws NoSuchT_Ul_MaterialEstudException if a matching t_ ul_ material estud could not be found
	 */
	public T_Ul_MaterialEstud findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_MaterialEstud>
				orderByComparator)
		throws NoSuchT_Ul_MaterialEstudException;

	/**
	 * Returns the first t_ ul_ material estud in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ material estud, or <code>null</code> if a matching t_ ul_ material estud could not be found
	 */
	public T_Ul_MaterialEstud fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_MaterialEstud>
			orderByComparator);

	/**
	 * Returns the last t_ ul_ material estud in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ material estud
	 * @throws NoSuchT_Ul_MaterialEstudException if a matching t_ ul_ material estud could not be found
	 */
	public T_Ul_MaterialEstud findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_MaterialEstud>
				orderByComparator)
		throws NoSuchT_Ul_MaterialEstudException;

	/**
	 * Returns the last t_ ul_ material estud in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ material estud, or <code>null</code> if a matching t_ ul_ material estud could not be found
	 */
	public T_Ul_MaterialEstud fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_MaterialEstud>
			orderByComparator);

	/**
	 * Returns the t_ ul_ material estuds before and after the current t_ ul_ material estud in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param idMaterial the primary key of the current t_ ul_ material estud
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t_ ul_ material estud
	 * @throws NoSuchT_Ul_MaterialEstudException if a t_ ul_ material estud with the primary key could not be found
	 */
	public T_Ul_MaterialEstud[] findByUuid_C_PrevAndNext(
			long idMaterial, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_MaterialEstud>
				orderByComparator)
		throws NoSuchT_Ul_MaterialEstudException;

	/**
	 * Removes all the t_ ul_ material estuds where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of t_ ul_ material estuds where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching t_ ul_ material estuds
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the t_ ul_ material estuds where tituloMaterial = &#63;.
	 *
	 * @param tituloMaterial the titulo material
	 * @return the matching t_ ul_ material estuds
	 */
	public java.util.List<T_Ul_MaterialEstud> findByTituloMaterial(
		String tituloMaterial);

	/**
	 * Returns a range of all the t_ ul_ material estuds where tituloMaterial = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_MaterialEstudModelImpl</code>.
	 * </p>
	 *
	 * @param tituloMaterial the titulo material
	 * @param start the lower bound of the range of t_ ul_ material estuds
	 * @param end the upper bound of the range of t_ ul_ material estuds (not inclusive)
	 * @return the range of matching t_ ul_ material estuds
	 */
	public java.util.List<T_Ul_MaterialEstud> findByTituloMaterial(
		String tituloMaterial, int start, int end);

	/**
	 * Returns an ordered range of all the t_ ul_ material estuds where tituloMaterial = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_MaterialEstudModelImpl</code>.
	 * </p>
	 *
	 * @param tituloMaterial the titulo material
	 * @param start the lower bound of the range of t_ ul_ material estuds
	 * @param end the upper bound of the range of t_ ul_ material estuds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t_ ul_ material estuds
	 */
	public java.util.List<T_Ul_MaterialEstud> findByTituloMaterial(
		String tituloMaterial, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_MaterialEstud>
			orderByComparator);

	/**
	 * Returns an ordered range of all the t_ ul_ material estuds where tituloMaterial = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_MaterialEstudModelImpl</code>.
	 * </p>
	 *
	 * @param tituloMaterial the titulo material
	 * @param start the lower bound of the range of t_ ul_ material estuds
	 * @param end the upper bound of the range of t_ ul_ material estuds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching t_ ul_ material estuds
	 */
	public java.util.List<T_Ul_MaterialEstud> findByTituloMaterial(
		String tituloMaterial, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_MaterialEstud>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first t_ ul_ material estud in the ordered set where tituloMaterial = &#63;.
	 *
	 * @param tituloMaterial the titulo material
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ material estud
	 * @throws NoSuchT_Ul_MaterialEstudException if a matching t_ ul_ material estud could not be found
	 */
	public T_Ul_MaterialEstud findByTituloMaterial_First(
			String tituloMaterial,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_MaterialEstud>
				orderByComparator)
		throws NoSuchT_Ul_MaterialEstudException;

	/**
	 * Returns the first t_ ul_ material estud in the ordered set where tituloMaterial = &#63;.
	 *
	 * @param tituloMaterial the titulo material
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ material estud, or <code>null</code> if a matching t_ ul_ material estud could not be found
	 */
	public T_Ul_MaterialEstud fetchByTituloMaterial_First(
		String tituloMaterial,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_MaterialEstud>
			orderByComparator);

	/**
	 * Returns the last t_ ul_ material estud in the ordered set where tituloMaterial = &#63;.
	 *
	 * @param tituloMaterial the titulo material
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ material estud
	 * @throws NoSuchT_Ul_MaterialEstudException if a matching t_ ul_ material estud could not be found
	 */
	public T_Ul_MaterialEstud findByTituloMaterial_Last(
			String tituloMaterial,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_MaterialEstud>
				orderByComparator)
		throws NoSuchT_Ul_MaterialEstudException;

	/**
	 * Returns the last t_ ul_ material estud in the ordered set where tituloMaterial = &#63;.
	 *
	 * @param tituloMaterial the titulo material
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ material estud, or <code>null</code> if a matching t_ ul_ material estud could not be found
	 */
	public T_Ul_MaterialEstud fetchByTituloMaterial_Last(
		String tituloMaterial,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_MaterialEstud>
			orderByComparator);

	/**
	 * Returns the t_ ul_ material estuds before and after the current t_ ul_ material estud in the ordered set where tituloMaterial = &#63;.
	 *
	 * @param idMaterial the primary key of the current t_ ul_ material estud
	 * @param tituloMaterial the titulo material
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t_ ul_ material estud
	 * @throws NoSuchT_Ul_MaterialEstudException if a t_ ul_ material estud with the primary key could not be found
	 */
	public T_Ul_MaterialEstud[] findByTituloMaterial_PrevAndNext(
			long idMaterial, String tituloMaterial,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_MaterialEstud>
				orderByComparator)
		throws NoSuchT_Ul_MaterialEstudException;

	/**
	 * Removes all the t_ ul_ material estuds where tituloMaterial = &#63; from the database.
	 *
	 * @param tituloMaterial the titulo material
	 */
	public void removeByTituloMaterial(String tituloMaterial);

	/**
	 * Returns the number of t_ ul_ material estuds where tituloMaterial = &#63;.
	 *
	 * @param tituloMaterial the titulo material
	 * @return the number of matching t_ ul_ material estuds
	 */
	public int countByTituloMaterial(String tituloMaterial);

	/**
	 * Caches the t_ ul_ material estud in the entity cache if it is enabled.
	 *
	 * @param t_Ul_MaterialEstud the t_ ul_ material estud
	 */
	public void cacheResult(T_Ul_MaterialEstud t_Ul_MaterialEstud);

	/**
	 * Caches the t_ ul_ material estuds in the entity cache if it is enabled.
	 *
	 * @param t_Ul_MaterialEstuds the t_ ul_ material estuds
	 */
	public void cacheResult(
		java.util.List<T_Ul_MaterialEstud> t_Ul_MaterialEstuds);

	/**
	 * Creates a new t_ ul_ material estud with the primary key. Does not add the t_ ul_ material estud to the database.
	 *
	 * @param idMaterial the primary key for the new t_ ul_ material estud
	 * @return the new t_ ul_ material estud
	 */
	public T_Ul_MaterialEstud create(long idMaterial);

	/**
	 * Removes the t_ ul_ material estud with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param idMaterial the primary key of the t_ ul_ material estud
	 * @return the t_ ul_ material estud that was removed
	 * @throws NoSuchT_Ul_MaterialEstudException if a t_ ul_ material estud with the primary key could not be found
	 */
	public T_Ul_MaterialEstud remove(long idMaterial)
		throws NoSuchT_Ul_MaterialEstudException;

	public T_Ul_MaterialEstud updateImpl(T_Ul_MaterialEstud t_Ul_MaterialEstud);

	/**
	 * Returns the t_ ul_ material estud with the primary key or throws a <code>NoSuchT_Ul_MaterialEstudException</code> if it could not be found.
	 *
	 * @param idMaterial the primary key of the t_ ul_ material estud
	 * @return the t_ ul_ material estud
	 * @throws NoSuchT_Ul_MaterialEstudException if a t_ ul_ material estud with the primary key could not be found
	 */
	public T_Ul_MaterialEstud findByPrimaryKey(long idMaterial)
		throws NoSuchT_Ul_MaterialEstudException;

	/**
	 * Returns the t_ ul_ material estud with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param idMaterial the primary key of the t_ ul_ material estud
	 * @return the t_ ul_ material estud, or <code>null</code> if a t_ ul_ material estud with the primary key could not be found
	 */
	public T_Ul_MaterialEstud fetchByPrimaryKey(long idMaterial);

	/**
	 * Returns all the t_ ul_ material estuds.
	 *
	 * @return the t_ ul_ material estuds
	 */
	public java.util.List<T_Ul_MaterialEstud> findAll();

	/**
	 * Returns a range of all the t_ ul_ material estuds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_MaterialEstudModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_ material estuds
	 * @param end the upper bound of the range of t_ ul_ material estuds (not inclusive)
	 * @return the range of t_ ul_ material estuds
	 */
	public java.util.List<T_Ul_MaterialEstud> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the t_ ul_ material estuds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_MaterialEstudModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_ material estuds
	 * @param end the upper bound of the range of t_ ul_ material estuds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of t_ ul_ material estuds
	 */
	public java.util.List<T_Ul_MaterialEstud> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_MaterialEstud>
			orderByComparator);

	/**
	 * Returns an ordered range of all the t_ ul_ material estuds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_MaterialEstudModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_ material estuds
	 * @param end the upper bound of the range of t_ ul_ material estuds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of t_ ul_ material estuds
	 */
	public java.util.List<T_Ul_MaterialEstud> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_MaterialEstud>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the t_ ul_ material estuds from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of t_ ul_ material estuds.
	 *
	 * @return the number of t_ ul_ material estuds
	 */
	public int countAll();

}
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

import com.aula.sb.exception.NoSuchT_Ul_ActividadException;
import com.aula.sb.model.T_Ul_Actividad;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the t_ ul_ actividad service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see T_Ul_ActividadUtil
 * @generated
 */
@ProviderType
public interface T_Ul_ActividadPersistence
	extends BasePersistence<T_Ul_Actividad> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link T_Ul_ActividadUtil} to access the t_ ul_ actividad persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the t_ ul_ actividads where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching t_ ul_ actividads
	 */
	public java.util.List<T_Ul_Actividad> findByUuid(String uuid);

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
	public java.util.List<T_Ul_Actividad> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<T_Ul_Actividad> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Actividad>
			orderByComparator);

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
	public java.util.List<T_Ul_Actividad> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Actividad>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first t_ ul_ actividad in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ actividad
	 * @throws NoSuchT_Ul_ActividadException if a matching t_ ul_ actividad could not be found
	 */
	public T_Ul_Actividad findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Actividad>
				orderByComparator)
		throws NoSuchT_Ul_ActividadException;

	/**
	 * Returns the first t_ ul_ actividad in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ actividad, or <code>null</code> if a matching t_ ul_ actividad could not be found
	 */
	public T_Ul_Actividad fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Actividad>
			orderByComparator);

	/**
	 * Returns the last t_ ul_ actividad in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ actividad
	 * @throws NoSuchT_Ul_ActividadException if a matching t_ ul_ actividad could not be found
	 */
	public T_Ul_Actividad findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Actividad>
				orderByComparator)
		throws NoSuchT_Ul_ActividadException;

	/**
	 * Returns the last t_ ul_ actividad in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ actividad, or <code>null</code> if a matching t_ ul_ actividad could not be found
	 */
	public T_Ul_Actividad fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Actividad>
			orderByComparator);

	/**
	 * Returns the t_ ul_ actividads before and after the current t_ ul_ actividad in the ordered set where uuid = &#63;.
	 *
	 * @param idActividad the primary key of the current t_ ul_ actividad
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t_ ul_ actividad
	 * @throws NoSuchT_Ul_ActividadException if a t_ ul_ actividad with the primary key could not be found
	 */
	public T_Ul_Actividad[] findByUuid_PrevAndNext(
			long idActividad, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Actividad>
				orderByComparator)
		throws NoSuchT_Ul_ActividadException;

	/**
	 * Removes all the t_ ul_ actividads where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of t_ ul_ actividads where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching t_ ul_ actividads
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the t_ ul_ actividad where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchT_Ul_ActividadException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching t_ ul_ actividad
	 * @throws NoSuchT_Ul_ActividadException if a matching t_ ul_ actividad could not be found
	 */
	public T_Ul_Actividad findByUUID_G(String uuid, long groupId)
		throws NoSuchT_Ul_ActividadException;

	/**
	 * Returns the t_ ul_ actividad where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching t_ ul_ actividad, or <code>null</code> if a matching t_ ul_ actividad could not be found
	 */
	public T_Ul_Actividad fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the t_ ul_ actividad where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching t_ ul_ actividad, or <code>null</code> if a matching t_ ul_ actividad could not be found
	 */
	public T_Ul_Actividad fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the t_ ul_ actividad where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the t_ ul_ actividad that was removed
	 */
	public T_Ul_Actividad removeByUUID_G(String uuid, long groupId)
		throws NoSuchT_Ul_ActividadException;

	/**
	 * Returns the number of t_ ul_ actividads where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching t_ ul_ actividads
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the t_ ul_ actividads where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching t_ ul_ actividads
	 */
	public java.util.List<T_Ul_Actividad> findByUuid_C(
		String uuid, long companyId);

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
	public java.util.List<T_Ul_Actividad> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<T_Ul_Actividad> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Actividad>
			orderByComparator);

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
	public java.util.List<T_Ul_Actividad> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Actividad>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first t_ ul_ actividad in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ actividad
	 * @throws NoSuchT_Ul_ActividadException if a matching t_ ul_ actividad could not be found
	 */
	public T_Ul_Actividad findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Actividad>
				orderByComparator)
		throws NoSuchT_Ul_ActividadException;

	/**
	 * Returns the first t_ ul_ actividad in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ actividad, or <code>null</code> if a matching t_ ul_ actividad could not be found
	 */
	public T_Ul_Actividad fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Actividad>
			orderByComparator);

	/**
	 * Returns the last t_ ul_ actividad in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ actividad
	 * @throws NoSuchT_Ul_ActividadException if a matching t_ ul_ actividad could not be found
	 */
	public T_Ul_Actividad findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Actividad>
				orderByComparator)
		throws NoSuchT_Ul_ActividadException;

	/**
	 * Returns the last t_ ul_ actividad in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ actividad, or <code>null</code> if a matching t_ ul_ actividad could not be found
	 */
	public T_Ul_Actividad fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Actividad>
			orderByComparator);

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
	public T_Ul_Actividad[] findByUuid_C_PrevAndNext(
			long idActividad, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Actividad>
				orderByComparator)
		throws NoSuchT_Ul_ActividadException;

	/**
	 * Removes all the t_ ul_ actividads where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of t_ ul_ actividads where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching t_ ul_ actividads
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the t_ ul_ actividads where tituloActividad = &#63;.
	 *
	 * @param tituloActividad the titulo actividad
	 * @return the matching t_ ul_ actividads
	 */
	public java.util.List<T_Ul_Actividad> findByTituloActividad(
		String tituloActividad);

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
	public java.util.List<T_Ul_Actividad> findByTituloActividad(
		String tituloActividad, int start, int end);

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
	public java.util.List<T_Ul_Actividad> findByTituloActividad(
		String tituloActividad, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Actividad>
			orderByComparator);

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
	public java.util.List<T_Ul_Actividad> findByTituloActividad(
		String tituloActividad, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Actividad>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first t_ ul_ actividad in the ordered set where tituloActividad = &#63;.
	 *
	 * @param tituloActividad the titulo actividad
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ actividad
	 * @throws NoSuchT_Ul_ActividadException if a matching t_ ul_ actividad could not be found
	 */
	public T_Ul_Actividad findByTituloActividad_First(
			String tituloActividad,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Actividad>
				orderByComparator)
		throws NoSuchT_Ul_ActividadException;

	/**
	 * Returns the first t_ ul_ actividad in the ordered set where tituloActividad = &#63;.
	 *
	 * @param tituloActividad the titulo actividad
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ actividad, or <code>null</code> if a matching t_ ul_ actividad could not be found
	 */
	public T_Ul_Actividad fetchByTituloActividad_First(
		String tituloActividad,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Actividad>
			orderByComparator);

	/**
	 * Returns the last t_ ul_ actividad in the ordered set where tituloActividad = &#63;.
	 *
	 * @param tituloActividad the titulo actividad
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ actividad
	 * @throws NoSuchT_Ul_ActividadException if a matching t_ ul_ actividad could not be found
	 */
	public T_Ul_Actividad findByTituloActividad_Last(
			String tituloActividad,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Actividad>
				orderByComparator)
		throws NoSuchT_Ul_ActividadException;

	/**
	 * Returns the last t_ ul_ actividad in the ordered set where tituloActividad = &#63;.
	 *
	 * @param tituloActividad the titulo actividad
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ actividad, or <code>null</code> if a matching t_ ul_ actividad could not be found
	 */
	public T_Ul_Actividad fetchByTituloActividad_Last(
		String tituloActividad,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Actividad>
			orderByComparator);

	/**
	 * Returns the t_ ul_ actividads before and after the current t_ ul_ actividad in the ordered set where tituloActividad = &#63;.
	 *
	 * @param idActividad the primary key of the current t_ ul_ actividad
	 * @param tituloActividad the titulo actividad
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t_ ul_ actividad
	 * @throws NoSuchT_Ul_ActividadException if a t_ ul_ actividad with the primary key could not be found
	 */
	public T_Ul_Actividad[] findByTituloActividad_PrevAndNext(
			long idActividad, String tituloActividad,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Actividad>
				orderByComparator)
		throws NoSuchT_Ul_ActividadException;

	/**
	 * Removes all the t_ ul_ actividads where tituloActividad = &#63; from the database.
	 *
	 * @param tituloActividad the titulo actividad
	 */
	public void removeByTituloActividad(String tituloActividad);

	/**
	 * Returns the number of t_ ul_ actividads where tituloActividad = &#63;.
	 *
	 * @param tituloActividad the titulo actividad
	 * @return the number of matching t_ ul_ actividads
	 */
	public int countByTituloActividad(String tituloActividad);

	/**
	 * Caches the t_ ul_ actividad in the entity cache if it is enabled.
	 *
	 * @param t_Ul_Actividad the t_ ul_ actividad
	 */
	public void cacheResult(T_Ul_Actividad t_Ul_Actividad);

	/**
	 * Caches the t_ ul_ actividads in the entity cache if it is enabled.
	 *
	 * @param t_Ul_Actividads the t_ ul_ actividads
	 */
	public void cacheResult(java.util.List<T_Ul_Actividad> t_Ul_Actividads);

	/**
	 * Creates a new t_ ul_ actividad with the primary key. Does not add the t_ ul_ actividad to the database.
	 *
	 * @param idActividad the primary key for the new t_ ul_ actividad
	 * @return the new t_ ul_ actividad
	 */
	public T_Ul_Actividad create(long idActividad);

	/**
	 * Removes the t_ ul_ actividad with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param idActividad the primary key of the t_ ul_ actividad
	 * @return the t_ ul_ actividad that was removed
	 * @throws NoSuchT_Ul_ActividadException if a t_ ul_ actividad with the primary key could not be found
	 */
	public T_Ul_Actividad remove(long idActividad)
		throws NoSuchT_Ul_ActividadException;

	public T_Ul_Actividad updateImpl(T_Ul_Actividad t_Ul_Actividad);

	/**
	 * Returns the t_ ul_ actividad with the primary key or throws a <code>NoSuchT_Ul_ActividadException</code> if it could not be found.
	 *
	 * @param idActividad the primary key of the t_ ul_ actividad
	 * @return the t_ ul_ actividad
	 * @throws NoSuchT_Ul_ActividadException if a t_ ul_ actividad with the primary key could not be found
	 */
	public T_Ul_Actividad findByPrimaryKey(long idActividad)
		throws NoSuchT_Ul_ActividadException;

	/**
	 * Returns the t_ ul_ actividad with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param idActividad the primary key of the t_ ul_ actividad
	 * @return the t_ ul_ actividad, or <code>null</code> if a t_ ul_ actividad with the primary key could not be found
	 */
	public T_Ul_Actividad fetchByPrimaryKey(long idActividad);

	/**
	 * Returns all the t_ ul_ actividads.
	 *
	 * @return the t_ ul_ actividads
	 */
	public java.util.List<T_Ul_Actividad> findAll();

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
	public java.util.List<T_Ul_Actividad> findAll(int start, int end);

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
	public java.util.List<T_Ul_Actividad> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Actividad>
			orderByComparator);

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
	public java.util.List<T_Ul_Actividad> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Actividad>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the t_ ul_ actividads from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of t_ ul_ actividads.
	 *
	 * @return the number of t_ ul_ actividads
	 */
	public int countAll();

}
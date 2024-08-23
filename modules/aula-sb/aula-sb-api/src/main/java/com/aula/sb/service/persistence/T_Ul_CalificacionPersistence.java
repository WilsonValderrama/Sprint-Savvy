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

import com.aula.sb.exception.NoSuchT_Ul_CalificacionException;
import com.aula.sb.model.T_Ul_Calificacion;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the t_ ul_ calificacion service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see T_Ul_CalificacionUtil
 * @generated
 */
@ProviderType
public interface T_Ul_CalificacionPersistence
	extends BasePersistence<T_Ul_Calificacion> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link T_Ul_CalificacionUtil} to access the t_ ul_ calificacion persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the t_ ul_ calificacions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching t_ ul_ calificacions
	 */
	public java.util.List<T_Ul_Calificacion> findByUuid(String uuid);

	/**
	 * Returns a range of all the t_ ul_ calificacions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_CalificacionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of t_ ul_ calificacions
	 * @param end the upper bound of the range of t_ ul_ calificacions (not inclusive)
	 * @return the range of matching t_ ul_ calificacions
	 */
	public java.util.List<T_Ul_Calificacion> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the t_ ul_ calificacions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_CalificacionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of t_ ul_ calificacions
	 * @param end the upper bound of the range of t_ ul_ calificacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t_ ul_ calificacions
	 */
	public java.util.List<T_Ul_Calificacion> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Calificacion>
			orderByComparator);

	/**
	 * Returns an ordered range of all the t_ ul_ calificacions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_CalificacionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of t_ ul_ calificacions
	 * @param end the upper bound of the range of t_ ul_ calificacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching t_ ul_ calificacions
	 */
	public java.util.List<T_Ul_Calificacion> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Calificacion>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first t_ ul_ calificacion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ calificacion
	 * @throws NoSuchT_Ul_CalificacionException if a matching t_ ul_ calificacion could not be found
	 */
	public T_Ul_Calificacion findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Calificacion>
				orderByComparator)
		throws NoSuchT_Ul_CalificacionException;

	/**
	 * Returns the first t_ ul_ calificacion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ calificacion, or <code>null</code> if a matching t_ ul_ calificacion could not be found
	 */
	public T_Ul_Calificacion fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Calificacion>
			orderByComparator);

	/**
	 * Returns the last t_ ul_ calificacion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ calificacion
	 * @throws NoSuchT_Ul_CalificacionException if a matching t_ ul_ calificacion could not be found
	 */
	public T_Ul_Calificacion findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Calificacion>
				orderByComparator)
		throws NoSuchT_Ul_CalificacionException;

	/**
	 * Returns the last t_ ul_ calificacion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ calificacion, or <code>null</code> if a matching t_ ul_ calificacion could not be found
	 */
	public T_Ul_Calificacion fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Calificacion>
			orderByComparator);

	/**
	 * Returns the t_ ul_ calificacions before and after the current t_ ul_ calificacion in the ordered set where uuid = &#63;.
	 *
	 * @param idCalificacion the primary key of the current t_ ul_ calificacion
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t_ ul_ calificacion
	 * @throws NoSuchT_Ul_CalificacionException if a t_ ul_ calificacion with the primary key could not be found
	 */
	public T_Ul_Calificacion[] findByUuid_PrevAndNext(
			long idCalificacion, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Calificacion>
				orderByComparator)
		throws NoSuchT_Ul_CalificacionException;

	/**
	 * Removes all the t_ ul_ calificacions where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of t_ ul_ calificacions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching t_ ul_ calificacions
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the t_ ul_ calificacion where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchT_Ul_CalificacionException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching t_ ul_ calificacion
	 * @throws NoSuchT_Ul_CalificacionException if a matching t_ ul_ calificacion could not be found
	 */
	public T_Ul_Calificacion findByUUID_G(String uuid, long groupId)
		throws NoSuchT_Ul_CalificacionException;

	/**
	 * Returns the t_ ul_ calificacion where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching t_ ul_ calificacion, or <code>null</code> if a matching t_ ul_ calificacion could not be found
	 */
	public T_Ul_Calificacion fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the t_ ul_ calificacion where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching t_ ul_ calificacion, or <code>null</code> if a matching t_ ul_ calificacion could not be found
	 */
	public T_Ul_Calificacion fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the t_ ul_ calificacion where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the t_ ul_ calificacion that was removed
	 */
	public T_Ul_Calificacion removeByUUID_G(String uuid, long groupId)
		throws NoSuchT_Ul_CalificacionException;

	/**
	 * Returns the number of t_ ul_ calificacions where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching t_ ul_ calificacions
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the t_ ul_ calificacions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching t_ ul_ calificacions
	 */
	public java.util.List<T_Ul_Calificacion> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the t_ ul_ calificacions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_CalificacionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of t_ ul_ calificacions
	 * @param end the upper bound of the range of t_ ul_ calificacions (not inclusive)
	 * @return the range of matching t_ ul_ calificacions
	 */
	public java.util.List<T_Ul_Calificacion> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the t_ ul_ calificacions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_CalificacionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of t_ ul_ calificacions
	 * @param end the upper bound of the range of t_ ul_ calificacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t_ ul_ calificacions
	 */
	public java.util.List<T_Ul_Calificacion> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Calificacion>
			orderByComparator);

	/**
	 * Returns an ordered range of all the t_ ul_ calificacions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_CalificacionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of t_ ul_ calificacions
	 * @param end the upper bound of the range of t_ ul_ calificacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching t_ ul_ calificacions
	 */
	public java.util.List<T_Ul_Calificacion> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Calificacion>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first t_ ul_ calificacion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ calificacion
	 * @throws NoSuchT_Ul_CalificacionException if a matching t_ ul_ calificacion could not be found
	 */
	public T_Ul_Calificacion findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Calificacion>
				orderByComparator)
		throws NoSuchT_Ul_CalificacionException;

	/**
	 * Returns the first t_ ul_ calificacion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ calificacion, or <code>null</code> if a matching t_ ul_ calificacion could not be found
	 */
	public T_Ul_Calificacion fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Calificacion>
			orderByComparator);

	/**
	 * Returns the last t_ ul_ calificacion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ calificacion
	 * @throws NoSuchT_Ul_CalificacionException if a matching t_ ul_ calificacion could not be found
	 */
	public T_Ul_Calificacion findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Calificacion>
				orderByComparator)
		throws NoSuchT_Ul_CalificacionException;

	/**
	 * Returns the last t_ ul_ calificacion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ calificacion, or <code>null</code> if a matching t_ ul_ calificacion could not be found
	 */
	public T_Ul_Calificacion fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Calificacion>
			orderByComparator);

	/**
	 * Returns the t_ ul_ calificacions before and after the current t_ ul_ calificacion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param idCalificacion the primary key of the current t_ ul_ calificacion
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t_ ul_ calificacion
	 * @throws NoSuchT_Ul_CalificacionException if a t_ ul_ calificacion with the primary key could not be found
	 */
	public T_Ul_Calificacion[] findByUuid_C_PrevAndNext(
			long idCalificacion, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Calificacion>
				orderByComparator)
		throws NoSuchT_Ul_CalificacionException;

	/**
	 * Removes all the t_ ul_ calificacions where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of t_ ul_ calificacions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching t_ ul_ calificacions
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the t_ ul_ calificacions where puntCalificacion = &#63;.
	 *
	 * @param puntCalificacion the punt calificacion
	 * @return the matching t_ ul_ calificacions
	 */
	public java.util.List<T_Ul_Calificacion> findBypuntCalificacion(
		String puntCalificacion);

	/**
	 * Returns a range of all the t_ ul_ calificacions where puntCalificacion = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_CalificacionModelImpl</code>.
	 * </p>
	 *
	 * @param puntCalificacion the punt calificacion
	 * @param start the lower bound of the range of t_ ul_ calificacions
	 * @param end the upper bound of the range of t_ ul_ calificacions (not inclusive)
	 * @return the range of matching t_ ul_ calificacions
	 */
	public java.util.List<T_Ul_Calificacion> findBypuntCalificacion(
		String puntCalificacion, int start, int end);

	/**
	 * Returns an ordered range of all the t_ ul_ calificacions where puntCalificacion = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_CalificacionModelImpl</code>.
	 * </p>
	 *
	 * @param puntCalificacion the punt calificacion
	 * @param start the lower bound of the range of t_ ul_ calificacions
	 * @param end the upper bound of the range of t_ ul_ calificacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t_ ul_ calificacions
	 */
	public java.util.List<T_Ul_Calificacion> findBypuntCalificacion(
		String puntCalificacion, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Calificacion>
			orderByComparator);

	/**
	 * Returns an ordered range of all the t_ ul_ calificacions where puntCalificacion = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_CalificacionModelImpl</code>.
	 * </p>
	 *
	 * @param puntCalificacion the punt calificacion
	 * @param start the lower bound of the range of t_ ul_ calificacions
	 * @param end the upper bound of the range of t_ ul_ calificacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching t_ ul_ calificacions
	 */
	public java.util.List<T_Ul_Calificacion> findBypuntCalificacion(
		String puntCalificacion, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Calificacion>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first t_ ul_ calificacion in the ordered set where puntCalificacion = &#63;.
	 *
	 * @param puntCalificacion the punt calificacion
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ calificacion
	 * @throws NoSuchT_Ul_CalificacionException if a matching t_ ul_ calificacion could not be found
	 */
	public T_Ul_Calificacion findBypuntCalificacion_First(
			String puntCalificacion,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Calificacion>
				orderByComparator)
		throws NoSuchT_Ul_CalificacionException;

	/**
	 * Returns the first t_ ul_ calificacion in the ordered set where puntCalificacion = &#63;.
	 *
	 * @param puntCalificacion the punt calificacion
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ calificacion, or <code>null</code> if a matching t_ ul_ calificacion could not be found
	 */
	public T_Ul_Calificacion fetchBypuntCalificacion_First(
		String puntCalificacion,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Calificacion>
			orderByComparator);

	/**
	 * Returns the last t_ ul_ calificacion in the ordered set where puntCalificacion = &#63;.
	 *
	 * @param puntCalificacion the punt calificacion
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ calificacion
	 * @throws NoSuchT_Ul_CalificacionException if a matching t_ ul_ calificacion could not be found
	 */
	public T_Ul_Calificacion findBypuntCalificacion_Last(
			String puntCalificacion,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Calificacion>
				orderByComparator)
		throws NoSuchT_Ul_CalificacionException;

	/**
	 * Returns the last t_ ul_ calificacion in the ordered set where puntCalificacion = &#63;.
	 *
	 * @param puntCalificacion the punt calificacion
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ calificacion, or <code>null</code> if a matching t_ ul_ calificacion could not be found
	 */
	public T_Ul_Calificacion fetchBypuntCalificacion_Last(
		String puntCalificacion,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Calificacion>
			orderByComparator);

	/**
	 * Returns the t_ ul_ calificacions before and after the current t_ ul_ calificacion in the ordered set where puntCalificacion = &#63;.
	 *
	 * @param idCalificacion the primary key of the current t_ ul_ calificacion
	 * @param puntCalificacion the punt calificacion
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t_ ul_ calificacion
	 * @throws NoSuchT_Ul_CalificacionException if a t_ ul_ calificacion with the primary key could not be found
	 */
	public T_Ul_Calificacion[] findBypuntCalificacion_PrevAndNext(
			long idCalificacion, String puntCalificacion,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Calificacion>
				orderByComparator)
		throws NoSuchT_Ul_CalificacionException;

	/**
	 * Removes all the t_ ul_ calificacions where puntCalificacion = &#63; from the database.
	 *
	 * @param puntCalificacion the punt calificacion
	 */
	public void removeBypuntCalificacion(String puntCalificacion);

	/**
	 * Returns the number of t_ ul_ calificacions where puntCalificacion = &#63;.
	 *
	 * @param puntCalificacion the punt calificacion
	 * @return the number of matching t_ ul_ calificacions
	 */
	public int countBypuntCalificacion(String puntCalificacion);

	/**
	 * Caches the t_ ul_ calificacion in the entity cache if it is enabled.
	 *
	 * @param t_Ul_Calificacion the t_ ul_ calificacion
	 */
	public void cacheResult(T_Ul_Calificacion t_Ul_Calificacion);

	/**
	 * Caches the t_ ul_ calificacions in the entity cache if it is enabled.
	 *
	 * @param t_Ul_Calificacions the t_ ul_ calificacions
	 */
	public void cacheResult(
		java.util.List<T_Ul_Calificacion> t_Ul_Calificacions);

	/**
	 * Creates a new t_ ul_ calificacion with the primary key. Does not add the t_ ul_ calificacion to the database.
	 *
	 * @param idCalificacion the primary key for the new t_ ul_ calificacion
	 * @return the new t_ ul_ calificacion
	 */
	public T_Ul_Calificacion create(long idCalificacion);

	/**
	 * Removes the t_ ul_ calificacion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param idCalificacion the primary key of the t_ ul_ calificacion
	 * @return the t_ ul_ calificacion that was removed
	 * @throws NoSuchT_Ul_CalificacionException if a t_ ul_ calificacion with the primary key could not be found
	 */
	public T_Ul_Calificacion remove(long idCalificacion)
		throws NoSuchT_Ul_CalificacionException;

	public T_Ul_Calificacion updateImpl(T_Ul_Calificacion t_Ul_Calificacion);

	/**
	 * Returns the t_ ul_ calificacion with the primary key or throws a <code>NoSuchT_Ul_CalificacionException</code> if it could not be found.
	 *
	 * @param idCalificacion the primary key of the t_ ul_ calificacion
	 * @return the t_ ul_ calificacion
	 * @throws NoSuchT_Ul_CalificacionException if a t_ ul_ calificacion with the primary key could not be found
	 */
	public T_Ul_Calificacion findByPrimaryKey(long idCalificacion)
		throws NoSuchT_Ul_CalificacionException;

	/**
	 * Returns the t_ ul_ calificacion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param idCalificacion the primary key of the t_ ul_ calificacion
	 * @return the t_ ul_ calificacion, or <code>null</code> if a t_ ul_ calificacion with the primary key could not be found
	 */
	public T_Ul_Calificacion fetchByPrimaryKey(long idCalificacion);

	/**
	 * Returns all the t_ ul_ calificacions.
	 *
	 * @return the t_ ul_ calificacions
	 */
	public java.util.List<T_Ul_Calificacion> findAll();

	/**
	 * Returns a range of all the t_ ul_ calificacions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_CalificacionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_ calificacions
	 * @param end the upper bound of the range of t_ ul_ calificacions (not inclusive)
	 * @return the range of t_ ul_ calificacions
	 */
	public java.util.List<T_Ul_Calificacion> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the t_ ul_ calificacions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_CalificacionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_ calificacions
	 * @param end the upper bound of the range of t_ ul_ calificacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of t_ ul_ calificacions
	 */
	public java.util.List<T_Ul_Calificacion> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Calificacion>
			orderByComparator);

	/**
	 * Returns an ordered range of all the t_ ul_ calificacions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_CalificacionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_ calificacions
	 * @param end the upper bound of the range of t_ ul_ calificacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of t_ ul_ calificacions
	 */
	public java.util.List<T_Ul_Calificacion> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Calificacion>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the t_ ul_ calificacions from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of t_ ul_ calificacions.
	 *
	 * @return the number of t_ ul_ calificacions
	 */
	public int countAll();

}
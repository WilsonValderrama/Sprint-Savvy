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

import com.aula.sb.exception.NoSuchT_Ul_ResEvaluacionException;
import com.aula.sb.model.T_Ul_ResEvaluacion;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the t_ ul_ res evaluacion service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see T_Ul_ResEvaluacionUtil
 * @generated
 */
@ProviderType
public interface T_Ul_ResEvaluacionPersistence
	extends BasePersistence<T_Ul_ResEvaluacion> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link T_Ul_ResEvaluacionUtil} to access the t_ ul_ res evaluacion persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the t_ ul_ res evaluacions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching t_ ul_ res evaluacions
	 */
	public java.util.List<T_Ul_ResEvaluacion> findByUuid(String uuid);

	/**
	 * Returns a range of all the t_ ul_ res evaluacions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_ResEvaluacionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of t_ ul_ res evaluacions
	 * @param end the upper bound of the range of t_ ul_ res evaluacions (not inclusive)
	 * @return the range of matching t_ ul_ res evaluacions
	 */
	public java.util.List<T_Ul_ResEvaluacion> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the t_ ul_ res evaluacions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_ResEvaluacionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of t_ ul_ res evaluacions
	 * @param end the upper bound of the range of t_ ul_ res evaluacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t_ ul_ res evaluacions
	 */
	public java.util.List<T_Ul_ResEvaluacion> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_ResEvaluacion>
			orderByComparator);

	/**
	 * Returns an ordered range of all the t_ ul_ res evaluacions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_ResEvaluacionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of t_ ul_ res evaluacions
	 * @param end the upper bound of the range of t_ ul_ res evaluacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching t_ ul_ res evaluacions
	 */
	public java.util.List<T_Ul_ResEvaluacion> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_ResEvaluacion>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first t_ ul_ res evaluacion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ res evaluacion
	 * @throws NoSuchT_Ul_ResEvaluacionException if a matching t_ ul_ res evaluacion could not be found
	 */
	public T_Ul_ResEvaluacion findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_ResEvaluacion>
				orderByComparator)
		throws NoSuchT_Ul_ResEvaluacionException;

	/**
	 * Returns the first t_ ul_ res evaluacion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ res evaluacion, or <code>null</code> if a matching t_ ul_ res evaluacion could not be found
	 */
	public T_Ul_ResEvaluacion fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_ResEvaluacion>
			orderByComparator);

	/**
	 * Returns the last t_ ul_ res evaluacion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ res evaluacion
	 * @throws NoSuchT_Ul_ResEvaluacionException if a matching t_ ul_ res evaluacion could not be found
	 */
	public T_Ul_ResEvaluacion findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_ResEvaluacion>
				orderByComparator)
		throws NoSuchT_Ul_ResEvaluacionException;

	/**
	 * Returns the last t_ ul_ res evaluacion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ res evaluacion, or <code>null</code> if a matching t_ ul_ res evaluacion could not be found
	 */
	public T_Ul_ResEvaluacion fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_ResEvaluacion>
			orderByComparator);

	/**
	 * Returns the t_ ul_ res evaluacions before and after the current t_ ul_ res evaluacion in the ordered set where uuid = &#63;.
	 *
	 * @param idRespuestas the primary key of the current t_ ul_ res evaluacion
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t_ ul_ res evaluacion
	 * @throws NoSuchT_Ul_ResEvaluacionException if a t_ ul_ res evaluacion with the primary key could not be found
	 */
	public T_Ul_ResEvaluacion[] findByUuid_PrevAndNext(
			long idRespuestas, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_ResEvaluacion>
				orderByComparator)
		throws NoSuchT_Ul_ResEvaluacionException;

	/**
	 * Removes all the t_ ul_ res evaluacions where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of t_ ul_ res evaluacions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching t_ ul_ res evaluacions
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the t_ ul_ res evaluacion where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchT_Ul_ResEvaluacionException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching t_ ul_ res evaluacion
	 * @throws NoSuchT_Ul_ResEvaluacionException if a matching t_ ul_ res evaluacion could not be found
	 */
	public T_Ul_ResEvaluacion findByUUID_G(String uuid, long groupId)
		throws NoSuchT_Ul_ResEvaluacionException;

	/**
	 * Returns the t_ ul_ res evaluacion where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching t_ ul_ res evaluacion, or <code>null</code> if a matching t_ ul_ res evaluacion could not be found
	 */
	public T_Ul_ResEvaluacion fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the t_ ul_ res evaluacion where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching t_ ul_ res evaluacion, or <code>null</code> if a matching t_ ul_ res evaluacion could not be found
	 */
	public T_Ul_ResEvaluacion fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the t_ ul_ res evaluacion where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the t_ ul_ res evaluacion that was removed
	 */
	public T_Ul_ResEvaluacion removeByUUID_G(String uuid, long groupId)
		throws NoSuchT_Ul_ResEvaluacionException;

	/**
	 * Returns the number of t_ ul_ res evaluacions where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching t_ ul_ res evaluacions
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the t_ ul_ res evaluacions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching t_ ul_ res evaluacions
	 */
	public java.util.List<T_Ul_ResEvaluacion> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the t_ ul_ res evaluacions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_ResEvaluacionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of t_ ul_ res evaluacions
	 * @param end the upper bound of the range of t_ ul_ res evaluacions (not inclusive)
	 * @return the range of matching t_ ul_ res evaluacions
	 */
	public java.util.List<T_Ul_ResEvaluacion> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the t_ ul_ res evaluacions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_ResEvaluacionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of t_ ul_ res evaluacions
	 * @param end the upper bound of the range of t_ ul_ res evaluacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t_ ul_ res evaluacions
	 */
	public java.util.List<T_Ul_ResEvaluacion> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_ResEvaluacion>
			orderByComparator);

	/**
	 * Returns an ordered range of all the t_ ul_ res evaluacions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_ResEvaluacionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of t_ ul_ res evaluacions
	 * @param end the upper bound of the range of t_ ul_ res evaluacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching t_ ul_ res evaluacions
	 */
	public java.util.List<T_Ul_ResEvaluacion> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_ResEvaluacion>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first t_ ul_ res evaluacion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ res evaluacion
	 * @throws NoSuchT_Ul_ResEvaluacionException if a matching t_ ul_ res evaluacion could not be found
	 */
	public T_Ul_ResEvaluacion findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_ResEvaluacion>
				orderByComparator)
		throws NoSuchT_Ul_ResEvaluacionException;

	/**
	 * Returns the first t_ ul_ res evaluacion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ res evaluacion, or <code>null</code> if a matching t_ ul_ res evaluacion could not be found
	 */
	public T_Ul_ResEvaluacion fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_ResEvaluacion>
			orderByComparator);

	/**
	 * Returns the last t_ ul_ res evaluacion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ res evaluacion
	 * @throws NoSuchT_Ul_ResEvaluacionException if a matching t_ ul_ res evaluacion could not be found
	 */
	public T_Ul_ResEvaluacion findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_ResEvaluacion>
				orderByComparator)
		throws NoSuchT_Ul_ResEvaluacionException;

	/**
	 * Returns the last t_ ul_ res evaluacion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ res evaluacion, or <code>null</code> if a matching t_ ul_ res evaluacion could not be found
	 */
	public T_Ul_ResEvaluacion fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_ResEvaluacion>
			orderByComparator);

	/**
	 * Returns the t_ ul_ res evaluacions before and after the current t_ ul_ res evaluacion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param idRespuestas the primary key of the current t_ ul_ res evaluacion
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t_ ul_ res evaluacion
	 * @throws NoSuchT_Ul_ResEvaluacionException if a t_ ul_ res evaluacion with the primary key could not be found
	 */
	public T_Ul_ResEvaluacion[] findByUuid_C_PrevAndNext(
			long idRespuestas, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_ResEvaluacion>
				orderByComparator)
		throws NoSuchT_Ul_ResEvaluacionException;

	/**
	 * Removes all the t_ ul_ res evaluacions where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of t_ ul_ res evaluacions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching t_ ul_ res evaluacions
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the t_ ul_ res evaluacions where problRespuestas = &#63;.
	 *
	 * @param problRespuestas the probl respuestas
	 * @return the matching t_ ul_ res evaluacions
	 */
	public java.util.List<T_Ul_ResEvaluacion> findByproblRespuestas(
		String problRespuestas);

	/**
	 * Returns a range of all the t_ ul_ res evaluacions where problRespuestas = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_ResEvaluacionModelImpl</code>.
	 * </p>
	 *
	 * @param problRespuestas the probl respuestas
	 * @param start the lower bound of the range of t_ ul_ res evaluacions
	 * @param end the upper bound of the range of t_ ul_ res evaluacions (not inclusive)
	 * @return the range of matching t_ ul_ res evaluacions
	 */
	public java.util.List<T_Ul_ResEvaluacion> findByproblRespuestas(
		String problRespuestas, int start, int end);

	/**
	 * Returns an ordered range of all the t_ ul_ res evaluacions where problRespuestas = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_ResEvaluacionModelImpl</code>.
	 * </p>
	 *
	 * @param problRespuestas the probl respuestas
	 * @param start the lower bound of the range of t_ ul_ res evaluacions
	 * @param end the upper bound of the range of t_ ul_ res evaluacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t_ ul_ res evaluacions
	 */
	public java.util.List<T_Ul_ResEvaluacion> findByproblRespuestas(
		String problRespuestas, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_ResEvaluacion>
			orderByComparator);

	/**
	 * Returns an ordered range of all the t_ ul_ res evaluacions where problRespuestas = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_ResEvaluacionModelImpl</code>.
	 * </p>
	 *
	 * @param problRespuestas the probl respuestas
	 * @param start the lower bound of the range of t_ ul_ res evaluacions
	 * @param end the upper bound of the range of t_ ul_ res evaluacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching t_ ul_ res evaluacions
	 */
	public java.util.List<T_Ul_ResEvaluacion> findByproblRespuestas(
		String problRespuestas, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_ResEvaluacion>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first t_ ul_ res evaluacion in the ordered set where problRespuestas = &#63;.
	 *
	 * @param problRespuestas the probl respuestas
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ res evaluacion
	 * @throws NoSuchT_Ul_ResEvaluacionException if a matching t_ ul_ res evaluacion could not be found
	 */
	public T_Ul_ResEvaluacion findByproblRespuestas_First(
			String problRespuestas,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_ResEvaluacion>
				orderByComparator)
		throws NoSuchT_Ul_ResEvaluacionException;

	/**
	 * Returns the first t_ ul_ res evaluacion in the ordered set where problRespuestas = &#63;.
	 *
	 * @param problRespuestas the probl respuestas
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ res evaluacion, or <code>null</code> if a matching t_ ul_ res evaluacion could not be found
	 */
	public T_Ul_ResEvaluacion fetchByproblRespuestas_First(
		String problRespuestas,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_ResEvaluacion>
			orderByComparator);

	/**
	 * Returns the last t_ ul_ res evaluacion in the ordered set where problRespuestas = &#63;.
	 *
	 * @param problRespuestas the probl respuestas
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ res evaluacion
	 * @throws NoSuchT_Ul_ResEvaluacionException if a matching t_ ul_ res evaluacion could not be found
	 */
	public T_Ul_ResEvaluacion findByproblRespuestas_Last(
			String problRespuestas,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_ResEvaluacion>
				orderByComparator)
		throws NoSuchT_Ul_ResEvaluacionException;

	/**
	 * Returns the last t_ ul_ res evaluacion in the ordered set where problRespuestas = &#63;.
	 *
	 * @param problRespuestas the probl respuestas
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ res evaluacion, or <code>null</code> if a matching t_ ul_ res evaluacion could not be found
	 */
	public T_Ul_ResEvaluacion fetchByproblRespuestas_Last(
		String problRespuestas,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_ResEvaluacion>
			orderByComparator);

	/**
	 * Returns the t_ ul_ res evaluacions before and after the current t_ ul_ res evaluacion in the ordered set where problRespuestas = &#63;.
	 *
	 * @param idRespuestas the primary key of the current t_ ul_ res evaluacion
	 * @param problRespuestas the probl respuestas
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t_ ul_ res evaluacion
	 * @throws NoSuchT_Ul_ResEvaluacionException if a t_ ul_ res evaluacion with the primary key could not be found
	 */
	public T_Ul_ResEvaluacion[] findByproblRespuestas_PrevAndNext(
			long idRespuestas, String problRespuestas,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_ResEvaluacion>
				orderByComparator)
		throws NoSuchT_Ul_ResEvaluacionException;

	/**
	 * Removes all the t_ ul_ res evaluacions where problRespuestas = &#63; from the database.
	 *
	 * @param problRespuestas the probl respuestas
	 */
	public void removeByproblRespuestas(String problRespuestas);

	/**
	 * Returns the number of t_ ul_ res evaluacions where problRespuestas = &#63;.
	 *
	 * @param problRespuestas the probl respuestas
	 * @return the number of matching t_ ul_ res evaluacions
	 */
	public int countByproblRespuestas(String problRespuestas);

	/**
	 * Caches the t_ ul_ res evaluacion in the entity cache if it is enabled.
	 *
	 * @param t_Ul_ResEvaluacion the t_ ul_ res evaluacion
	 */
	public void cacheResult(T_Ul_ResEvaluacion t_Ul_ResEvaluacion);

	/**
	 * Caches the t_ ul_ res evaluacions in the entity cache if it is enabled.
	 *
	 * @param t_Ul_ResEvaluacions the t_ ul_ res evaluacions
	 */
	public void cacheResult(
		java.util.List<T_Ul_ResEvaluacion> t_Ul_ResEvaluacions);

	/**
	 * Creates a new t_ ul_ res evaluacion with the primary key. Does not add the t_ ul_ res evaluacion to the database.
	 *
	 * @param idRespuestas the primary key for the new t_ ul_ res evaluacion
	 * @return the new t_ ul_ res evaluacion
	 */
	public T_Ul_ResEvaluacion create(long idRespuestas);

	/**
	 * Removes the t_ ul_ res evaluacion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param idRespuestas the primary key of the t_ ul_ res evaluacion
	 * @return the t_ ul_ res evaluacion that was removed
	 * @throws NoSuchT_Ul_ResEvaluacionException if a t_ ul_ res evaluacion with the primary key could not be found
	 */
	public T_Ul_ResEvaluacion remove(long idRespuestas)
		throws NoSuchT_Ul_ResEvaluacionException;

	public T_Ul_ResEvaluacion updateImpl(T_Ul_ResEvaluacion t_Ul_ResEvaluacion);

	/**
	 * Returns the t_ ul_ res evaluacion with the primary key or throws a <code>NoSuchT_Ul_ResEvaluacionException</code> if it could not be found.
	 *
	 * @param idRespuestas the primary key of the t_ ul_ res evaluacion
	 * @return the t_ ul_ res evaluacion
	 * @throws NoSuchT_Ul_ResEvaluacionException if a t_ ul_ res evaluacion with the primary key could not be found
	 */
	public T_Ul_ResEvaluacion findByPrimaryKey(long idRespuestas)
		throws NoSuchT_Ul_ResEvaluacionException;

	/**
	 * Returns the t_ ul_ res evaluacion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param idRespuestas the primary key of the t_ ul_ res evaluacion
	 * @return the t_ ul_ res evaluacion, or <code>null</code> if a t_ ul_ res evaluacion with the primary key could not be found
	 */
	public T_Ul_ResEvaluacion fetchByPrimaryKey(long idRespuestas);

	/**
	 * Returns all the t_ ul_ res evaluacions.
	 *
	 * @return the t_ ul_ res evaluacions
	 */
	public java.util.List<T_Ul_ResEvaluacion> findAll();

	/**
	 * Returns a range of all the t_ ul_ res evaluacions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_ResEvaluacionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_ res evaluacions
	 * @param end the upper bound of the range of t_ ul_ res evaluacions (not inclusive)
	 * @return the range of t_ ul_ res evaluacions
	 */
	public java.util.List<T_Ul_ResEvaluacion> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the t_ ul_ res evaluacions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_ResEvaluacionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_ res evaluacions
	 * @param end the upper bound of the range of t_ ul_ res evaluacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of t_ ul_ res evaluacions
	 */
	public java.util.List<T_Ul_ResEvaluacion> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_ResEvaluacion>
			orderByComparator);

	/**
	 * Returns an ordered range of all the t_ ul_ res evaluacions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_ResEvaluacionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_ res evaluacions
	 * @param end the upper bound of the range of t_ ul_ res evaluacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of t_ ul_ res evaluacions
	 */
	public java.util.List<T_Ul_ResEvaluacion> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_ResEvaluacion>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the t_ ul_ res evaluacions from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of t_ ul_ res evaluacions.
	 *
	 * @return the number of t_ ul_ res evaluacions
	 */
	public int countAll();

}
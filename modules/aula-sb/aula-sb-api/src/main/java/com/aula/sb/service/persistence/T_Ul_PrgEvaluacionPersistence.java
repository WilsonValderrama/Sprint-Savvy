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

import com.aula.sb.exception.NoSuchT_Ul_PrgEvaluacionException;
import com.aula.sb.model.T_Ul_PrgEvaluacion;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the t_ ul_ prg evaluacion service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see T_Ul_PrgEvaluacionUtil
 * @generated
 */
@ProviderType
public interface T_Ul_PrgEvaluacionPersistence
	extends BasePersistence<T_Ul_PrgEvaluacion> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link T_Ul_PrgEvaluacionUtil} to access the t_ ul_ prg evaluacion persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the t_ ul_ prg evaluacions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching t_ ul_ prg evaluacions
	 */
	public java.util.List<T_Ul_PrgEvaluacion> findByUuid(String uuid);

	/**
	 * Returns a range of all the t_ ul_ prg evaluacions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_PrgEvaluacionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of t_ ul_ prg evaluacions
	 * @param end the upper bound of the range of t_ ul_ prg evaluacions (not inclusive)
	 * @return the range of matching t_ ul_ prg evaluacions
	 */
	public java.util.List<T_Ul_PrgEvaluacion> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the t_ ul_ prg evaluacions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_PrgEvaluacionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of t_ ul_ prg evaluacions
	 * @param end the upper bound of the range of t_ ul_ prg evaluacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t_ ul_ prg evaluacions
	 */
	public java.util.List<T_Ul_PrgEvaluacion> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_PrgEvaluacion>
			orderByComparator);

	/**
	 * Returns an ordered range of all the t_ ul_ prg evaluacions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_PrgEvaluacionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of t_ ul_ prg evaluacions
	 * @param end the upper bound of the range of t_ ul_ prg evaluacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching t_ ul_ prg evaluacions
	 */
	public java.util.List<T_Ul_PrgEvaluacion> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_PrgEvaluacion>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first t_ ul_ prg evaluacion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ prg evaluacion
	 * @throws NoSuchT_Ul_PrgEvaluacionException if a matching t_ ul_ prg evaluacion could not be found
	 */
	public T_Ul_PrgEvaluacion findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_PrgEvaluacion>
				orderByComparator)
		throws NoSuchT_Ul_PrgEvaluacionException;

	/**
	 * Returns the first t_ ul_ prg evaluacion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ prg evaluacion, or <code>null</code> if a matching t_ ul_ prg evaluacion could not be found
	 */
	public T_Ul_PrgEvaluacion fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_PrgEvaluacion>
			orderByComparator);

	/**
	 * Returns the last t_ ul_ prg evaluacion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ prg evaluacion
	 * @throws NoSuchT_Ul_PrgEvaluacionException if a matching t_ ul_ prg evaluacion could not be found
	 */
	public T_Ul_PrgEvaluacion findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_PrgEvaluacion>
				orderByComparator)
		throws NoSuchT_Ul_PrgEvaluacionException;

	/**
	 * Returns the last t_ ul_ prg evaluacion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ prg evaluacion, or <code>null</code> if a matching t_ ul_ prg evaluacion could not be found
	 */
	public T_Ul_PrgEvaluacion fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_PrgEvaluacion>
			orderByComparator);

	/**
	 * Returns the t_ ul_ prg evaluacions before and after the current t_ ul_ prg evaluacion in the ordered set where uuid = &#63;.
	 *
	 * @param idPreguntas the primary key of the current t_ ul_ prg evaluacion
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t_ ul_ prg evaluacion
	 * @throws NoSuchT_Ul_PrgEvaluacionException if a t_ ul_ prg evaluacion with the primary key could not be found
	 */
	public T_Ul_PrgEvaluacion[] findByUuid_PrevAndNext(
			long idPreguntas, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_PrgEvaluacion>
				orderByComparator)
		throws NoSuchT_Ul_PrgEvaluacionException;

	/**
	 * Removes all the t_ ul_ prg evaluacions where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of t_ ul_ prg evaluacions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching t_ ul_ prg evaluacions
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the t_ ul_ prg evaluacion where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchT_Ul_PrgEvaluacionException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching t_ ul_ prg evaluacion
	 * @throws NoSuchT_Ul_PrgEvaluacionException if a matching t_ ul_ prg evaluacion could not be found
	 */
	public T_Ul_PrgEvaluacion findByUUID_G(String uuid, long groupId)
		throws NoSuchT_Ul_PrgEvaluacionException;

	/**
	 * Returns the t_ ul_ prg evaluacion where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching t_ ul_ prg evaluacion, or <code>null</code> if a matching t_ ul_ prg evaluacion could not be found
	 */
	public T_Ul_PrgEvaluacion fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the t_ ul_ prg evaluacion where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching t_ ul_ prg evaluacion, or <code>null</code> if a matching t_ ul_ prg evaluacion could not be found
	 */
	public T_Ul_PrgEvaluacion fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the t_ ul_ prg evaluacion where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the t_ ul_ prg evaluacion that was removed
	 */
	public T_Ul_PrgEvaluacion removeByUUID_G(String uuid, long groupId)
		throws NoSuchT_Ul_PrgEvaluacionException;

	/**
	 * Returns the number of t_ ul_ prg evaluacions where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching t_ ul_ prg evaluacions
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the t_ ul_ prg evaluacions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching t_ ul_ prg evaluacions
	 */
	public java.util.List<T_Ul_PrgEvaluacion> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the t_ ul_ prg evaluacions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_PrgEvaluacionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of t_ ul_ prg evaluacions
	 * @param end the upper bound of the range of t_ ul_ prg evaluacions (not inclusive)
	 * @return the range of matching t_ ul_ prg evaluacions
	 */
	public java.util.List<T_Ul_PrgEvaluacion> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the t_ ul_ prg evaluacions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_PrgEvaluacionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of t_ ul_ prg evaluacions
	 * @param end the upper bound of the range of t_ ul_ prg evaluacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t_ ul_ prg evaluacions
	 */
	public java.util.List<T_Ul_PrgEvaluacion> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_PrgEvaluacion>
			orderByComparator);

	/**
	 * Returns an ordered range of all the t_ ul_ prg evaluacions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_PrgEvaluacionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of t_ ul_ prg evaluacions
	 * @param end the upper bound of the range of t_ ul_ prg evaluacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching t_ ul_ prg evaluacions
	 */
	public java.util.List<T_Ul_PrgEvaluacion> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_PrgEvaluacion>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first t_ ul_ prg evaluacion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ prg evaluacion
	 * @throws NoSuchT_Ul_PrgEvaluacionException if a matching t_ ul_ prg evaluacion could not be found
	 */
	public T_Ul_PrgEvaluacion findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_PrgEvaluacion>
				orderByComparator)
		throws NoSuchT_Ul_PrgEvaluacionException;

	/**
	 * Returns the first t_ ul_ prg evaluacion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ prg evaluacion, or <code>null</code> if a matching t_ ul_ prg evaluacion could not be found
	 */
	public T_Ul_PrgEvaluacion fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_PrgEvaluacion>
			orderByComparator);

	/**
	 * Returns the last t_ ul_ prg evaluacion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ prg evaluacion
	 * @throws NoSuchT_Ul_PrgEvaluacionException if a matching t_ ul_ prg evaluacion could not be found
	 */
	public T_Ul_PrgEvaluacion findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_PrgEvaluacion>
				orderByComparator)
		throws NoSuchT_Ul_PrgEvaluacionException;

	/**
	 * Returns the last t_ ul_ prg evaluacion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ prg evaluacion, or <code>null</code> if a matching t_ ul_ prg evaluacion could not be found
	 */
	public T_Ul_PrgEvaluacion fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_PrgEvaluacion>
			orderByComparator);

	/**
	 * Returns the t_ ul_ prg evaluacions before and after the current t_ ul_ prg evaluacion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param idPreguntas the primary key of the current t_ ul_ prg evaluacion
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t_ ul_ prg evaluacion
	 * @throws NoSuchT_Ul_PrgEvaluacionException if a t_ ul_ prg evaluacion with the primary key could not be found
	 */
	public T_Ul_PrgEvaluacion[] findByUuid_C_PrevAndNext(
			long idPreguntas, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_PrgEvaluacion>
				orderByComparator)
		throws NoSuchT_Ul_PrgEvaluacionException;

	/**
	 * Removes all the t_ ul_ prg evaluacions where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of t_ ul_ prg evaluacions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching t_ ul_ prg evaluacions
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the t_ ul_ prg evaluacions where problPreguntas = &#63;.
	 *
	 * @param problPreguntas the probl preguntas
	 * @return the matching t_ ul_ prg evaluacions
	 */
	public java.util.List<T_Ul_PrgEvaluacion> findByproblPreguntas(
		String problPreguntas);

	/**
	 * Returns a range of all the t_ ul_ prg evaluacions where problPreguntas = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_PrgEvaluacionModelImpl</code>.
	 * </p>
	 *
	 * @param problPreguntas the probl preguntas
	 * @param start the lower bound of the range of t_ ul_ prg evaluacions
	 * @param end the upper bound of the range of t_ ul_ prg evaluacions (not inclusive)
	 * @return the range of matching t_ ul_ prg evaluacions
	 */
	public java.util.List<T_Ul_PrgEvaluacion> findByproblPreguntas(
		String problPreguntas, int start, int end);

	/**
	 * Returns an ordered range of all the t_ ul_ prg evaluacions where problPreguntas = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_PrgEvaluacionModelImpl</code>.
	 * </p>
	 *
	 * @param problPreguntas the probl preguntas
	 * @param start the lower bound of the range of t_ ul_ prg evaluacions
	 * @param end the upper bound of the range of t_ ul_ prg evaluacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t_ ul_ prg evaluacions
	 */
	public java.util.List<T_Ul_PrgEvaluacion> findByproblPreguntas(
		String problPreguntas, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_PrgEvaluacion>
			orderByComparator);

	/**
	 * Returns an ordered range of all the t_ ul_ prg evaluacions where problPreguntas = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_PrgEvaluacionModelImpl</code>.
	 * </p>
	 *
	 * @param problPreguntas the probl preguntas
	 * @param start the lower bound of the range of t_ ul_ prg evaluacions
	 * @param end the upper bound of the range of t_ ul_ prg evaluacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching t_ ul_ prg evaluacions
	 */
	public java.util.List<T_Ul_PrgEvaluacion> findByproblPreguntas(
		String problPreguntas, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_PrgEvaluacion>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first t_ ul_ prg evaluacion in the ordered set where problPreguntas = &#63;.
	 *
	 * @param problPreguntas the probl preguntas
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ prg evaluacion
	 * @throws NoSuchT_Ul_PrgEvaluacionException if a matching t_ ul_ prg evaluacion could not be found
	 */
	public T_Ul_PrgEvaluacion findByproblPreguntas_First(
			String problPreguntas,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_PrgEvaluacion>
				orderByComparator)
		throws NoSuchT_Ul_PrgEvaluacionException;

	/**
	 * Returns the first t_ ul_ prg evaluacion in the ordered set where problPreguntas = &#63;.
	 *
	 * @param problPreguntas the probl preguntas
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ prg evaluacion, or <code>null</code> if a matching t_ ul_ prg evaluacion could not be found
	 */
	public T_Ul_PrgEvaluacion fetchByproblPreguntas_First(
		String problPreguntas,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_PrgEvaluacion>
			orderByComparator);

	/**
	 * Returns the last t_ ul_ prg evaluacion in the ordered set where problPreguntas = &#63;.
	 *
	 * @param problPreguntas the probl preguntas
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ prg evaluacion
	 * @throws NoSuchT_Ul_PrgEvaluacionException if a matching t_ ul_ prg evaluacion could not be found
	 */
	public T_Ul_PrgEvaluacion findByproblPreguntas_Last(
			String problPreguntas,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_PrgEvaluacion>
				orderByComparator)
		throws NoSuchT_Ul_PrgEvaluacionException;

	/**
	 * Returns the last t_ ul_ prg evaluacion in the ordered set where problPreguntas = &#63;.
	 *
	 * @param problPreguntas the probl preguntas
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ prg evaluacion, or <code>null</code> if a matching t_ ul_ prg evaluacion could not be found
	 */
	public T_Ul_PrgEvaluacion fetchByproblPreguntas_Last(
		String problPreguntas,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_PrgEvaluacion>
			orderByComparator);

	/**
	 * Returns the t_ ul_ prg evaluacions before and after the current t_ ul_ prg evaluacion in the ordered set where problPreguntas = &#63;.
	 *
	 * @param idPreguntas the primary key of the current t_ ul_ prg evaluacion
	 * @param problPreguntas the probl preguntas
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t_ ul_ prg evaluacion
	 * @throws NoSuchT_Ul_PrgEvaluacionException if a t_ ul_ prg evaluacion with the primary key could not be found
	 */
	public T_Ul_PrgEvaluacion[] findByproblPreguntas_PrevAndNext(
			long idPreguntas, String problPreguntas,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_PrgEvaluacion>
				orderByComparator)
		throws NoSuchT_Ul_PrgEvaluacionException;

	/**
	 * Removes all the t_ ul_ prg evaluacions where problPreguntas = &#63; from the database.
	 *
	 * @param problPreguntas the probl preguntas
	 */
	public void removeByproblPreguntas(String problPreguntas);

	/**
	 * Returns the number of t_ ul_ prg evaluacions where problPreguntas = &#63;.
	 *
	 * @param problPreguntas the probl preguntas
	 * @return the number of matching t_ ul_ prg evaluacions
	 */
	public int countByproblPreguntas(String problPreguntas);

	/**
	 * Caches the t_ ul_ prg evaluacion in the entity cache if it is enabled.
	 *
	 * @param t_Ul_PrgEvaluacion the t_ ul_ prg evaluacion
	 */
	public void cacheResult(T_Ul_PrgEvaluacion t_Ul_PrgEvaluacion);

	/**
	 * Caches the t_ ul_ prg evaluacions in the entity cache if it is enabled.
	 *
	 * @param t_Ul_PrgEvaluacions the t_ ul_ prg evaluacions
	 */
	public void cacheResult(
		java.util.List<T_Ul_PrgEvaluacion> t_Ul_PrgEvaluacions);

	/**
	 * Creates a new t_ ul_ prg evaluacion with the primary key. Does not add the t_ ul_ prg evaluacion to the database.
	 *
	 * @param idPreguntas the primary key for the new t_ ul_ prg evaluacion
	 * @return the new t_ ul_ prg evaluacion
	 */
	public T_Ul_PrgEvaluacion create(long idPreguntas);

	/**
	 * Removes the t_ ul_ prg evaluacion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param idPreguntas the primary key of the t_ ul_ prg evaluacion
	 * @return the t_ ul_ prg evaluacion that was removed
	 * @throws NoSuchT_Ul_PrgEvaluacionException if a t_ ul_ prg evaluacion with the primary key could not be found
	 */
	public T_Ul_PrgEvaluacion remove(long idPreguntas)
		throws NoSuchT_Ul_PrgEvaluacionException;

	public T_Ul_PrgEvaluacion updateImpl(T_Ul_PrgEvaluacion t_Ul_PrgEvaluacion);

	/**
	 * Returns the t_ ul_ prg evaluacion with the primary key or throws a <code>NoSuchT_Ul_PrgEvaluacionException</code> if it could not be found.
	 *
	 * @param idPreguntas the primary key of the t_ ul_ prg evaluacion
	 * @return the t_ ul_ prg evaluacion
	 * @throws NoSuchT_Ul_PrgEvaluacionException if a t_ ul_ prg evaluacion with the primary key could not be found
	 */
	public T_Ul_PrgEvaluacion findByPrimaryKey(long idPreguntas)
		throws NoSuchT_Ul_PrgEvaluacionException;

	/**
	 * Returns the t_ ul_ prg evaluacion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param idPreguntas the primary key of the t_ ul_ prg evaluacion
	 * @return the t_ ul_ prg evaluacion, or <code>null</code> if a t_ ul_ prg evaluacion with the primary key could not be found
	 */
	public T_Ul_PrgEvaluacion fetchByPrimaryKey(long idPreguntas);

	/**
	 * Returns all the t_ ul_ prg evaluacions.
	 *
	 * @return the t_ ul_ prg evaluacions
	 */
	public java.util.List<T_Ul_PrgEvaluacion> findAll();

	/**
	 * Returns a range of all the t_ ul_ prg evaluacions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_PrgEvaluacionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_ prg evaluacions
	 * @param end the upper bound of the range of t_ ul_ prg evaluacions (not inclusive)
	 * @return the range of t_ ul_ prg evaluacions
	 */
	public java.util.List<T_Ul_PrgEvaluacion> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the t_ ul_ prg evaluacions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_PrgEvaluacionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_ prg evaluacions
	 * @param end the upper bound of the range of t_ ul_ prg evaluacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of t_ ul_ prg evaluacions
	 */
	public java.util.List<T_Ul_PrgEvaluacion> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_PrgEvaluacion>
			orderByComparator);

	/**
	 * Returns an ordered range of all the t_ ul_ prg evaluacions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_PrgEvaluacionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_ prg evaluacions
	 * @param end the upper bound of the range of t_ ul_ prg evaluacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of t_ ul_ prg evaluacions
	 */
	public java.util.List<T_Ul_PrgEvaluacion> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_PrgEvaluacion>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the t_ ul_ prg evaluacions from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of t_ ul_ prg evaluacions.
	 *
	 * @return the number of t_ ul_ prg evaluacions
	 */
	public int countAll();

}
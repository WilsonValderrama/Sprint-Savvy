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

import com.aula.sb.exception.NoSuchT_Ul_AdminCursoException;
import com.aula.sb.model.T_Ul_AdminCurso;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import java.util.Set;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the t_ ul_ admin curso service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see T_Ul_AdminCursoUtil
 * @generated
 */
@ProviderType
public interface T_Ul_AdminCursoPersistence
	extends BasePersistence<T_Ul_AdminCurso> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link T_Ul_AdminCursoUtil} to access the t_ ul_ admin curso persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the t_ ul_ admin cursos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching t_ ul_ admin cursos
	 */
	public java.util.List<T_Ul_AdminCurso> findByUuid(String uuid);

	/**
	 * Returns a range of all the t_ ul_ admin cursos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_AdminCursoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of t_ ul_ admin cursos
	 * @param end the upper bound of the range of t_ ul_ admin cursos (not inclusive)
	 * @return the range of matching t_ ul_ admin cursos
	 */
	public java.util.List<T_Ul_AdminCurso> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the t_ ul_ admin cursos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_AdminCursoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of t_ ul_ admin cursos
	 * @param end the upper bound of the range of t_ ul_ admin cursos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t_ ul_ admin cursos
	 */
	public java.util.List<T_Ul_AdminCurso> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_AdminCurso>
			orderByComparator);

	/**
	 * Returns an ordered range of all the t_ ul_ admin cursos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_AdminCursoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of t_ ul_ admin cursos
	 * @param end the upper bound of the range of t_ ul_ admin cursos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching t_ ul_ admin cursos
	 */
	public java.util.List<T_Ul_AdminCurso> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_AdminCurso>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first t_ ul_ admin curso in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ admin curso
	 * @throws NoSuchT_Ul_AdminCursoException if a matching t_ ul_ admin curso could not be found
	 */
	public T_Ul_AdminCurso findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_AdminCurso>
				orderByComparator)
		throws NoSuchT_Ul_AdminCursoException;

	/**
	 * Returns the first t_ ul_ admin curso in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ admin curso, or <code>null</code> if a matching t_ ul_ admin curso could not be found
	 */
	public T_Ul_AdminCurso fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_AdminCurso>
			orderByComparator);

	/**
	 * Returns the last t_ ul_ admin curso in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ admin curso
	 * @throws NoSuchT_Ul_AdminCursoException if a matching t_ ul_ admin curso could not be found
	 */
	public T_Ul_AdminCurso findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_AdminCurso>
				orderByComparator)
		throws NoSuchT_Ul_AdminCursoException;

	/**
	 * Returns the last t_ ul_ admin curso in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ admin curso, or <code>null</code> if a matching t_ ul_ admin curso could not be found
	 */
	public T_Ul_AdminCurso fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_AdminCurso>
			orderByComparator);

	/**
	 * Returns the t_ ul_ admin cursos before and after the current t_ ul_ admin curso in the ordered set where uuid = &#63;.
	 *
	 * @param t_Ul_AdminCursoPK the primary key of the current t_ ul_ admin curso
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t_ ul_ admin curso
	 * @throws NoSuchT_Ul_AdminCursoException if a t_ ul_ admin curso with the primary key could not be found
	 */
	public T_Ul_AdminCurso[] findByUuid_PrevAndNext(
			T_Ul_AdminCursoPK t_Ul_AdminCursoPK, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_AdminCurso>
				orderByComparator)
		throws NoSuchT_Ul_AdminCursoException;

	/**
	 * Removes all the t_ ul_ admin cursos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of t_ ul_ admin cursos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching t_ ul_ admin cursos
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the t_ ul_ admin curso where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchT_Ul_AdminCursoException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching t_ ul_ admin curso
	 * @throws NoSuchT_Ul_AdminCursoException if a matching t_ ul_ admin curso could not be found
	 */
	public T_Ul_AdminCurso findByUUID_G(String uuid, long groupId)
		throws NoSuchT_Ul_AdminCursoException;

	/**
	 * Returns the t_ ul_ admin curso where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching t_ ul_ admin curso, or <code>null</code> if a matching t_ ul_ admin curso could not be found
	 */
	public T_Ul_AdminCurso fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the t_ ul_ admin curso where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching t_ ul_ admin curso, or <code>null</code> if a matching t_ ul_ admin curso could not be found
	 */
	public T_Ul_AdminCurso fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the t_ ul_ admin curso where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the t_ ul_ admin curso that was removed
	 */
	public T_Ul_AdminCurso removeByUUID_G(String uuid, long groupId)
		throws NoSuchT_Ul_AdminCursoException;

	/**
	 * Returns the number of t_ ul_ admin cursos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching t_ ul_ admin cursos
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the t_ ul_ admin cursos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching t_ ul_ admin cursos
	 */
	public java.util.List<T_Ul_AdminCurso> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the t_ ul_ admin cursos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_AdminCursoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of t_ ul_ admin cursos
	 * @param end the upper bound of the range of t_ ul_ admin cursos (not inclusive)
	 * @return the range of matching t_ ul_ admin cursos
	 */
	public java.util.List<T_Ul_AdminCurso> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the t_ ul_ admin cursos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_AdminCursoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of t_ ul_ admin cursos
	 * @param end the upper bound of the range of t_ ul_ admin cursos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t_ ul_ admin cursos
	 */
	public java.util.List<T_Ul_AdminCurso> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_AdminCurso>
			orderByComparator);

	/**
	 * Returns an ordered range of all the t_ ul_ admin cursos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_AdminCursoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of t_ ul_ admin cursos
	 * @param end the upper bound of the range of t_ ul_ admin cursos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching t_ ul_ admin cursos
	 */
	public java.util.List<T_Ul_AdminCurso> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_AdminCurso>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first t_ ul_ admin curso in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ admin curso
	 * @throws NoSuchT_Ul_AdminCursoException if a matching t_ ul_ admin curso could not be found
	 */
	public T_Ul_AdminCurso findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_AdminCurso>
				orderByComparator)
		throws NoSuchT_Ul_AdminCursoException;

	/**
	 * Returns the first t_ ul_ admin curso in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ admin curso, or <code>null</code> if a matching t_ ul_ admin curso could not be found
	 */
	public T_Ul_AdminCurso fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_AdminCurso>
			orderByComparator);

	/**
	 * Returns the last t_ ul_ admin curso in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ admin curso
	 * @throws NoSuchT_Ul_AdminCursoException if a matching t_ ul_ admin curso could not be found
	 */
	public T_Ul_AdminCurso findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_AdminCurso>
				orderByComparator)
		throws NoSuchT_Ul_AdminCursoException;

	/**
	 * Returns the last t_ ul_ admin curso in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ admin curso, or <code>null</code> if a matching t_ ul_ admin curso could not be found
	 */
	public T_Ul_AdminCurso fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_AdminCurso>
			orderByComparator);

	/**
	 * Returns the t_ ul_ admin cursos before and after the current t_ ul_ admin curso in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param t_Ul_AdminCursoPK the primary key of the current t_ ul_ admin curso
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t_ ul_ admin curso
	 * @throws NoSuchT_Ul_AdminCursoException if a t_ ul_ admin curso with the primary key could not be found
	 */
	public T_Ul_AdminCurso[] findByUuid_C_PrevAndNext(
			T_Ul_AdminCursoPK t_Ul_AdminCursoPK, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_AdminCurso>
				orderByComparator)
		throws NoSuchT_Ul_AdminCursoException;

	/**
	 * Removes all the t_ ul_ admin cursos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of t_ ul_ admin cursos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching t_ ul_ admin cursos
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the t_ ul_ admin cursos where T_Ul_Curso_id = &#63;.
	 *
	 * @param T_Ul_Curso_id the t_ ul_ curso_id
	 * @return the matching t_ ul_ admin cursos
	 */
	public java.util.List<T_Ul_AdminCurso> findByT_Ul_Curso_id(
		long T_Ul_Curso_id);

	/**
	 * Returns a range of all the t_ ul_ admin cursos where T_Ul_Curso_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_AdminCursoModelImpl</code>.
	 * </p>
	 *
	 * @param T_Ul_Curso_id the t_ ul_ curso_id
	 * @param start the lower bound of the range of t_ ul_ admin cursos
	 * @param end the upper bound of the range of t_ ul_ admin cursos (not inclusive)
	 * @return the range of matching t_ ul_ admin cursos
	 */
	public java.util.List<T_Ul_AdminCurso> findByT_Ul_Curso_id(
		long T_Ul_Curso_id, int start, int end);

	/**
	 * Returns an ordered range of all the t_ ul_ admin cursos where T_Ul_Curso_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_AdminCursoModelImpl</code>.
	 * </p>
	 *
	 * @param T_Ul_Curso_id the t_ ul_ curso_id
	 * @param start the lower bound of the range of t_ ul_ admin cursos
	 * @param end the upper bound of the range of t_ ul_ admin cursos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t_ ul_ admin cursos
	 */
	public java.util.List<T_Ul_AdminCurso> findByT_Ul_Curso_id(
		long T_Ul_Curso_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_AdminCurso>
			orderByComparator);

	/**
	 * Returns an ordered range of all the t_ ul_ admin cursos where T_Ul_Curso_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_AdminCursoModelImpl</code>.
	 * </p>
	 *
	 * @param T_Ul_Curso_id the t_ ul_ curso_id
	 * @param start the lower bound of the range of t_ ul_ admin cursos
	 * @param end the upper bound of the range of t_ ul_ admin cursos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching t_ ul_ admin cursos
	 */
	public java.util.List<T_Ul_AdminCurso> findByT_Ul_Curso_id(
		long T_Ul_Curso_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_AdminCurso>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first t_ ul_ admin curso in the ordered set where T_Ul_Curso_id = &#63;.
	 *
	 * @param T_Ul_Curso_id the t_ ul_ curso_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ admin curso
	 * @throws NoSuchT_Ul_AdminCursoException if a matching t_ ul_ admin curso could not be found
	 */
	public T_Ul_AdminCurso findByT_Ul_Curso_id_First(
			long T_Ul_Curso_id,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_AdminCurso>
				orderByComparator)
		throws NoSuchT_Ul_AdminCursoException;

	/**
	 * Returns the first t_ ul_ admin curso in the ordered set where T_Ul_Curso_id = &#63;.
	 *
	 * @param T_Ul_Curso_id the t_ ul_ curso_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ admin curso, or <code>null</code> if a matching t_ ul_ admin curso could not be found
	 */
	public T_Ul_AdminCurso fetchByT_Ul_Curso_id_First(
		long T_Ul_Curso_id,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_AdminCurso>
			orderByComparator);

	/**
	 * Returns the last t_ ul_ admin curso in the ordered set where T_Ul_Curso_id = &#63;.
	 *
	 * @param T_Ul_Curso_id the t_ ul_ curso_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ admin curso
	 * @throws NoSuchT_Ul_AdminCursoException if a matching t_ ul_ admin curso could not be found
	 */
	public T_Ul_AdminCurso findByT_Ul_Curso_id_Last(
			long T_Ul_Curso_id,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_AdminCurso>
				orderByComparator)
		throws NoSuchT_Ul_AdminCursoException;

	/**
	 * Returns the last t_ ul_ admin curso in the ordered set where T_Ul_Curso_id = &#63;.
	 *
	 * @param T_Ul_Curso_id the t_ ul_ curso_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ admin curso, or <code>null</code> if a matching t_ ul_ admin curso could not be found
	 */
	public T_Ul_AdminCurso fetchByT_Ul_Curso_id_Last(
		long T_Ul_Curso_id,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_AdminCurso>
			orderByComparator);

	/**
	 * Returns the t_ ul_ admin cursos before and after the current t_ ul_ admin curso in the ordered set where T_Ul_Curso_id = &#63;.
	 *
	 * @param t_Ul_AdminCursoPK the primary key of the current t_ ul_ admin curso
	 * @param T_Ul_Curso_id the t_ ul_ curso_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t_ ul_ admin curso
	 * @throws NoSuchT_Ul_AdminCursoException if a t_ ul_ admin curso with the primary key could not be found
	 */
	public T_Ul_AdminCurso[] findByT_Ul_Curso_id_PrevAndNext(
			T_Ul_AdminCursoPK t_Ul_AdminCursoPK, long T_Ul_Curso_id,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_AdminCurso>
				orderByComparator)
		throws NoSuchT_Ul_AdminCursoException;

	/**
	 * Removes all the t_ ul_ admin cursos where T_Ul_Curso_id = &#63; from the database.
	 *
	 * @param T_Ul_Curso_id the t_ ul_ curso_id
	 */
	public void removeByT_Ul_Curso_id(long T_Ul_Curso_id);

	/**
	 * Returns the number of t_ ul_ admin cursos where T_Ul_Curso_id = &#63;.
	 *
	 * @param T_Ul_Curso_id the t_ ul_ curso_id
	 * @return the number of matching t_ ul_ admin cursos
	 */
	public int countByT_Ul_Curso_id(long T_Ul_Curso_id);

	/**
	 * Caches the t_ ul_ admin curso in the entity cache if it is enabled.
	 *
	 * @param t_Ul_AdminCurso the t_ ul_ admin curso
	 */
	public void cacheResult(T_Ul_AdminCurso t_Ul_AdminCurso);

	/**
	 * Caches the t_ ul_ admin cursos in the entity cache if it is enabled.
	 *
	 * @param t_Ul_AdminCursos the t_ ul_ admin cursos
	 */
	public void cacheResult(java.util.List<T_Ul_AdminCurso> t_Ul_AdminCursos);

	/**
	 * Creates a new t_ ul_ admin curso with the primary key. Does not add the t_ ul_ admin curso to the database.
	 *
	 * @param t_Ul_AdminCursoPK the primary key for the new t_ ul_ admin curso
	 * @return the new t_ ul_ admin curso
	 */
	public T_Ul_AdminCurso create(T_Ul_AdminCursoPK t_Ul_AdminCursoPK);

	/**
	 * Removes the t_ ul_ admin curso with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param t_Ul_AdminCursoPK the primary key of the t_ ul_ admin curso
	 * @return the t_ ul_ admin curso that was removed
	 * @throws NoSuchT_Ul_AdminCursoException if a t_ ul_ admin curso with the primary key could not be found
	 */
	public T_Ul_AdminCurso remove(T_Ul_AdminCursoPK t_Ul_AdminCursoPK)
		throws NoSuchT_Ul_AdminCursoException;

	public T_Ul_AdminCurso updateImpl(T_Ul_AdminCurso t_Ul_AdminCurso);

	/**
	 * Returns the t_ ul_ admin curso with the primary key or throws a <code>NoSuchT_Ul_AdminCursoException</code> if it could not be found.
	 *
	 * @param t_Ul_AdminCursoPK the primary key of the t_ ul_ admin curso
	 * @return the t_ ul_ admin curso
	 * @throws NoSuchT_Ul_AdminCursoException if a t_ ul_ admin curso with the primary key could not be found
	 */
	public T_Ul_AdminCurso findByPrimaryKey(T_Ul_AdminCursoPK t_Ul_AdminCursoPK)
		throws NoSuchT_Ul_AdminCursoException;

	/**
	 * Returns the t_ ul_ admin curso with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param t_Ul_AdminCursoPK the primary key of the t_ ul_ admin curso
	 * @return the t_ ul_ admin curso, or <code>null</code> if a t_ ul_ admin curso with the primary key could not be found
	 */
	public T_Ul_AdminCurso fetchByPrimaryKey(
		T_Ul_AdminCursoPK t_Ul_AdminCursoPK);

	/**
	 * Returns all the t_ ul_ admin cursos.
	 *
	 * @return the t_ ul_ admin cursos
	 */
	public java.util.List<T_Ul_AdminCurso> findAll();

	/**
	 * Returns a range of all the t_ ul_ admin cursos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_AdminCursoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_ admin cursos
	 * @param end the upper bound of the range of t_ ul_ admin cursos (not inclusive)
	 * @return the range of t_ ul_ admin cursos
	 */
	public java.util.List<T_Ul_AdminCurso> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the t_ ul_ admin cursos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_AdminCursoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_ admin cursos
	 * @param end the upper bound of the range of t_ ul_ admin cursos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of t_ ul_ admin cursos
	 */
	public java.util.List<T_Ul_AdminCurso> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_AdminCurso>
			orderByComparator);

	/**
	 * Returns an ordered range of all the t_ ul_ admin cursos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_AdminCursoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_ admin cursos
	 * @param end the upper bound of the range of t_ ul_ admin cursos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of t_ ul_ admin cursos
	 */
	public java.util.List<T_Ul_AdminCurso> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_AdminCurso>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the t_ ul_ admin cursos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of t_ ul_ admin cursos.
	 *
	 * @return the number of t_ ul_ admin cursos
	 */
	public int countAll();

	public Set<String> getCompoundPKColumnNames();

}
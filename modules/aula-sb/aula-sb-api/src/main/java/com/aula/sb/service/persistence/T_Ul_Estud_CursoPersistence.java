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

import com.aula.sb.exception.NoSuchT_Ul_Estud_CursoException;
import com.aula.sb.model.T_Ul_Estud_Curso;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import java.util.Set;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the t_ ul_ estud_ curso service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see T_Ul_Estud_CursoUtil
 * @generated
 */
@ProviderType
public interface T_Ul_Estud_CursoPersistence
	extends BasePersistence<T_Ul_Estud_Curso> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link T_Ul_Estud_CursoUtil} to access the t_ ul_ estud_ curso persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the t_ ul_ estud_ cursos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching t_ ul_ estud_ cursos
	 */
	public java.util.List<T_Ul_Estud_Curso> findByUuid(String uuid);

	/**
	 * Returns a range of all the t_ ul_ estud_ cursos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_Estud_CursoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of t_ ul_ estud_ cursos
	 * @param end the upper bound of the range of t_ ul_ estud_ cursos (not inclusive)
	 * @return the range of matching t_ ul_ estud_ cursos
	 */
	public java.util.List<T_Ul_Estud_Curso> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the t_ ul_ estud_ cursos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_Estud_CursoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of t_ ul_ estud_ cursos
	 * @param end the upper bound of the range of t_ ul_ estud_ cursos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t_ ul_ estud_ cursos
	 */
	public java.util.List<T_Ul_Estud_Curso> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Estud_Curso>
			orderByComparator);

	/**
	 * Returns an ordered range of all the t_ ul_ estud_ cursos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_Estud_CursoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of t_ ul_ estud_ cursos
	 * @param end the upper bound of the range of t_ ul_ estud_ cursos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching t_ ul_ estud_ cursos
	 */
	public java.util.List<T_Ul_Estud_Curso> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Estud_Curso>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first t_ ul_ estud_ curso in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ estud_ curso
	 * @throws NoSuchT_Ul_Estud_CursoException if a matching t_ ul_ estud_ curso could not be found
	 */
	public T_Ul_Estud_Curso findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Estud_Curso>
				orderByComparator)
		throws NoSuchT_Ul_Estud_CursoException;

	/**
	 * Returns the first t_ ul_ estud_ curso in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ estud_ curso, or <code>null</code> if a matching t_ ul_ estud_ curso could not be found
	 */
	public T_Ul_Estud_Curso fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Estud_Curso>
			orderByComparator);

	/**
	 * Returns the last t_ ul_ estud_ curso in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ estud_ curso
	 * @throws NoSuchT_Ul_Estud_CursoException if a matching t_ ul_ estud_ curso could not be found
	 */
	public T_Ul_Estud_Curso findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Estud_Curso>
				orderByComparator)
		throws NoSuchT_Ul_Estud_CursoException;

	/**
	 * Returns the last t_ ul_ estud_ curso in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ estud_ curso, or <code>null</code> if a matching t_ ul_ estud_ curso could not be found
	 */
	public T_Ul_Estud_Curso fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Estud_Curso>
			orderByComparator);

	/**
	 * Returns the t_ ul_ estud_ cursos before and after the current t_ ul_ estud_ curso in the ordered set where uuid = &#63;.
	 *
	 * @param t_Ul_Estud_CursoPK the primary key of the current t_ ul_ estud_ curso
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t_ ul_ estud_ curso
	 * @throws NoSuchT_Ul_Estud_CursoException if a t_ ul_ estud_ curso with the primary key could not be found
	 */
	public T_Ul_Estud_Curso[] findByUuid_PrevAndNext(
			T_Ul_Estud_CursoPK t_Ul_Estud_CursoPK, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Estud_Curso>
				orderByComparator)
		throws NoSuchT_Ul_Estud_CursoException;

	/**
	 * Removes all the t_ ul_ estud_ cursos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of t_ ul_ estud_ cursos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching t_ ul_ estud_ cursos
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the t_ ul_ estud_ curso where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchT_Ul_Estud_CursoException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching t_ ul_ estud_ curso
	 * @throws NoSuchT_Ul_Estud_CursoException if a matching t_ ul_ estud_ curso could not be found
	 */
	public T_Ul_Estud_Curso findByUUID_G(String uuid, long groupId)
		throws NoSuchT_Ul_Estud_CursoException;

	/**
	 * Returns the t_ ul_ estud_ curso where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching t_ ul_ estud_ curso, or <code>null</code> if a matching t_ ul_ estud_ curso could not be found
	 */
	public T_Ul_Estud_Curso fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the t_ ul_ estud_ curso where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching t_ ul_ estud_ curso, or <code>null</code> if a matching t_ ul_ estud_ curso could not be found
	 */
	public T_Ul_Estud_Curso fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the t_ ul_ estud_ curso where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the t_ ul_ estud_ curso that was removed
	 */
	public T_Ul_Estud_Curso removeByUUID_G(String uuid, long groupId)
		throws NoSuchT_Ul_Estud_CursoException;

	/**
	 * Returns the number of t_ ul_ estud_ cursos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching t_ ul_ estud_ cursos
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the t_ ul_ estud_ cursos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching t_ ul_ estud_ cursos
	 */
	public java.util.List<T_Ul_Estud_Curso> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the t_ ul_ estud_ cursos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_Estud_CursoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of t_ ul_ estud_ cursos
	 * @param end the upper bound of the range of t_ ul_ estud_ cursos (not inclusive)
	 * @return the range of matching t_ ul_ estud_ cursos
	 */
	public java.util.List<T_Ul_Estud_Curso> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the t_ ul_ estud_ cursos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_Estud_CursoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of t_ ul_ estud_ cursos
	 * @param end the upper bound of the range of t_ ul_ estud_ cursos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t_ ul_ estud_ cursos
	 */
	public java.util.List<T_Ul_Estud_Curso> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Estud_Curso>
			orderByComparator);

	/**
	 * Returns an ordered range of all the t_ ul_ estud_ cursos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_Estud_CursoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of t_ ul_ estud_ cursos
	 * @param end the upper bound of the range of t_ ul_ estud_ cursos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching t_ ul_ estud_ cursos
	 */
	public java.util.List<T_Ul_Estud_Curso> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Estud_Curso>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first t_ ul_ estud_ curso in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ estud_ curso
	 * @throws NoSuchT_Ul_Estud_CursoException if a matching t_ ul_ estud_ curso could not be found
	 */
	public T_Ul_Estud_Curso findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Estud_Curso>
				orderByComparator)
		throws NoSuchT_Ul_Estud_CursoException;

	/**
	 * Returns the first t_ ul_ estud_ curso in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ estud_ curso, or <code>null</code> if a matching t_ ul_ estud_ curso could not be found
	 */
	public T_Ul_Estud_Curso fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Estud_Curso>
			orderByComparator);

	/**
	 * Returns the last t_ ul_ estud_ curso in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ estud_ curso
	 * @throws NoSuchT_Ul_Estud_CursoException if a matching t_ ul_ estud_ curso could not be found
	 */
	public T_Ul_Estud_Curso findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Estud_Curso>
				orderByComparator)
		throws NoSuchT_Ul_Estud_CursoException;

	/**
	 * Returns the last t_ ul_ estud_ curso in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ estud_ curso, or <code>null</code> if a matching t_ ul_ estud_ curso could not be found
	 */
	public T_Ul_Estud_Curso fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Estud_Curso>
			orderByComparator);

	/**
	 * Returns the t_ ul_ estud_ cursos before and after the current t_ ul_ estud_ curso in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param t_Ul_Estud_CursoPK the primary key of the current t_ ul_ estud_ curso
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t_ ul_ estud_ curso
	 * @throws NoSuchT_Ul_Estud_CursoException if a t_ ul_ estud_ curso with the primary key could not be found
	 */
	public T_Ul_Estud_Curso[] findByUuid_C_PrevAndNext(
			T_Ul_Estud_CursoPK t_Ul_Estud_CursoPK, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Estud_Curso>
				orderByComparator)
		throws NoSuchT_Ul_Estud_CursoException;

	/**
	 * Removes all the t_ ul_ estud_ cursos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of t_ ul_ estud_ cursos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching t_ ul_ estud_ cursos
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the t_ ul_ estud_ cursos where T_Ul_Estudiante_id = &#63;.
	 *
	 * @param T_Ul_Estudiante_id the t_ ul_ estudiante_id
	 * @return the matching t_ ul_ estud_ cursos
	 */
	public java.util.List<T_Ul_Estud_Curso> findByT_Ul_Estudiante_id(
		long T_Ul_Estudiante_id);

	/**
	 * Returns a range of all the t_ ul_ estud_ cursos where T_Ul_Estudiante_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_Estud_CursoModelImpl</code>.
	 * </p>
	 *
	 * @param T_Ul_Estudiante_id the t_ ul_ estudiante_id
	 * @param start the lower bound of the range of t_ ul_ estud_ cursos
	 * @param end the upper bound of the range of t_ ul_ estud_ cursos (not inclusive)
	 * @return the range of matching t_ ul_ estud_ cursos
	 */
	public java.util.List<T_Ul_Estud_Curso> findByT_Ul_Estudiante_id(
		long T_Ul_Estudiante_id, int start, int end);

	/**
	 * Returns an ordered range of all the t_ ul_ estud_ cursos where T_Ul_Estudiante_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_Estud_CursoModelImpl</code>.
	 * </p>
	 *
	 * @param T_Ul_Estudiante_id the t_ ul_ estudiante_id
	 * @param start the lower bound of the range of t_ ul_ estud_ cursos
	 * @param end the upper bound of the range of t_ ul_ estud_ cursos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t_ ul_ estud_ cursos
	 */
	public java.util.List<T_Ul_Estud_Curso> findByT_Ul_Estudiante_id(
		long T_Ul_Estudiante_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Estud_Curso>
			orderByComparator);

	/**
	 * Returns an ordered range of all the t_ ul_ estud_ cursos where T_Ul_Estudiante_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_Estud_CursoModelImpl</code>.
	 * </p>
	 *
	 * @param T_Ul_Estudiante_id the t_ ul_ estudiante_id
	 * @param start the lower bound of the range of t_ ul_ estud_ cursos
	 * @param end the upper bound of the range of t_ ul_ estud_ cursos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching t_ ul_ estud_ cursos
	 */
	public java.util.List<T_Ul_Estud_Curso> findByT_Ul_Estudiante_id(
		long T_Ul_Estudiante_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Estud_Curso>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first t_ ul_ estud_ curso in the ordered set where T_Ul_Estudiante_id = &#63;.
	 *
	 * @param T_Ul_Estudiante_id the t_ ul_ estudiante_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ estud_ curso
	 * @throws NoSuchT_Ul_Estud_CursoException if a matching t_ ul_ estud_ curso could not be found
	 */
	public T_Ul_Estud_Curso findByT_Ul_Estudiante_id_First(
			long T_Ul_Estudiante_id,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Estud_Curso>
				orderByComparator)
		throws NoSuchT_Ul_Estud_CursoException;

	/**
	 * Returns the first t_ ul_ estud_ curso in the ordered set where T_Ul_Estudiante_id = &#63;.
	 *
	 * @param T_Ul_Estudiante_id the t_ ul_ estudiante_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ estud_ curso, or <code>null</code> if a matching t_ ul_ estud_ curso could not be found
	 */
	public T_Ul_Estud_Curso fetchByT_Ul_Estudiante_id_First(
		long T_Ul_Estudiante_id,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Estud_Curso>
			orderByComparator);

	/**
	 * Returns the last t_ ul_ estud_ curso in the ordered set where T_Ul_Estudiante_id = &#63;.
	 *
	 * @param T_Ul_Estudiante_id the t_ ul_ estudiante_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ estud_ curso
	 * @throws NoSuchT_Ul_Estud_CursoException if a matching t_ ul_ estud_ curso could not be found
	 */
	public T_Ul_Estud_Curso findByT_Ul_Estudiante_id_Last(
			long T_Ul_Estudiante_id,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Estud_Curso>
				orderByComparator)
		throws NoSuchT_Ul_Estud_CursoException;

	/**
	 * Returns the last t_ ul_ estud_ curso in the ordered set where T_Ul_Estudiante_id = &#63;.
	 *
	 * @param T_Ul_Estudiante_id the t_ ul_ estudiante_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ estud_ curso, or <code>null</code> if a matching t_ ul_ estud_ curso could not be found
	 */
	public T_Ul_Estud_Curso fetchByT_Ul_Estudiante_id_Last(
		long T_Ul_Estudiante_id,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Estud_Curso>
			orderByComparator);

	/**
	 * Returns the t_ ul_ estud_ cursos before and after the current t_ ul_ estud_ curso in the ordered set where T_Ul_Estudiante_id = &#63;.
	 *
	 * @param t_Ul_Estud_CursoPK the primary key of the current t_ ul_ estud_ curso
	 * @param T_Ul_Estudiante_id the t_ ul_ estudiante_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t_ ul_ estud_ curso
	 * @throws NoSuchT_Ul_Estud_CursoException if a t_ ul_ estud_ curso with the primary key could not be found
	 */
	public T_Ul_Estud_Curso[] findByT_Ul_Estudiante_id_PrevAndNext(
			T_Ul_Estud_CursoPK t_Ul_Estud_CursoPK, long T_Ul_Estudiante_id,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Estud_Curso>
				orderByComparator)
		throws NoSuchT_Ul_Estud_CursoException;

	/**
	 * Removes all the t_ ul_ estud_ cursos where T_Ul_Estudiante_id = &#63; from the database.
	 *
	 * @param T_Ul_Estudiante_id the t_ ul_ estudiante_id
	 */
	public void removeByT_Ul_Estudiante_id(long T_Ul_Estudiante_id);

	/**
	 * Returns the number of t_ ul_ estud_ cursos where T_Ul_Estudiante_id = &#63;.
	 *
	 * @param T_Ul_Estudiante_id the t_ ul_ estudiante_id
	 * @return the number of matching t_ ul_ estud_ cursos
	 */
	public int countByT_Ul_Estudiante_id(long T_Ul_Estudiante_id);

	/**
	 * Returns all the t_ ul_ estud_ cursos where T_Ul_Curso_id = &#63;.
	 *
	 * @param T_Ul_Curso_id the t_ ul_ curso_id
	 * @return the matching t_ ul_ estud_ cursos
	 */
	public java.util.List<T_Ul_Estud_Curso> findByT_Ul_Curso_id(
		long T_Ul_Curso_id);

	/**
	 * Returns a range of all the t_ ul_ estud_ cursos where T_Ul_Curso_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_Estud_CursoModelImpl</code>.
	 * </p>
	 *
	 * @param T_Ul_Curso_id the t_ ul_ curso_id
	 * @param start the lower bound of the range of t_ ul_ estud_ cursos
	 * @param end the upper bound of the range of t_ ul_ estud_ cursos (not inclusive)
	 * @return the range of matching t_ ul_ estud_ cursos
	 */
	public java.util.List<T_Ul_Estud_Curso> findByT_Ul_Curso_id(
		long T_Ul_Curso_id, int start, int end);

	/**
	 * Returns an ordered range of all the t_ ul_ estud_ cursos where T_Ul_Curso_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_Estud_CursoModelImpl</code>.
	 * </p>
	 *
	 * @param T_Ul_Curso_id the t_ ul_ curso_id
	 * @param start the lower bound of the range of t_ ul_ estud_ cursos
	 * @param end the upper bound of the range of t_ ul_ estud_ cursos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t_ ul_ estud_ cursos
	 */
	public java.util.List<T_Ul_Estud_Curso> findByT_Ul_Curso_id(
		long T_Ul_Curso_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Estud_Curso>
			orderByComparator);

	/**
	 * Returns an ordered range of all the t_ ul_ estud_ cursos where T_Ul_Curso_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_Estud_CursoModelImpl</code>.
	 * </p>
	 *
	 * @param T_Ul_Curso_id the t_ ul_ curso_id
	 * @param start the lower bound of the range of t_ ul_ estud_ cursos
	 * @param end the upper bound of the range of t_ ul_ estud_ cursos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching t_ ul_ estud_ cursos
	 */
	public java.util.List<T_Ul_Estud_Curso> findByT_Ul_Curso_id(
		long T_Ul_Curso_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Estud_Curso>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first t_ ul_ estud_ curso in the ordered set where T_Ul_Curso_id = &#63;.
	 *
	 * @param T_Ul_Curso_id the t_ ul_ curso_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ estud_ curso
	 * @throws NoSuchT_Ul_Estud_CursoException if a matching t_ ul_ estud_ curso could not be found
	 */
	public T_Ul_Estud_Curso findByT_Ul_Curso_id_First(
			long T_Ul_Curso_id,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Estud_Curso>
				orderByComparator)
		throws NoSuchT_Ul_Estud_CursoException;

	/**
	 * Returns the first t_ ul_ estud_ curso in the ordered set where T_Ul_Curso_id = &#63;.
	 *
	 * @param T_Ul_Curso_id the t_ ul_ curso_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ estud_ curso, or <code>null</code> if a matching t_ ul_ estud_ curso could not be found
	 */
	public T_Ul_Estud_Curso fetchByT_Ul_Curso_id_First(
		long T_Ul_Curso_id,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Estud_Curso>
			orderByComparator);

	/**
	 * Returns the last t_ ul_ estud_ curso in the ordered set where T_Ul_Curso_id = &#63;.
	 *
	 * @param T_Ul_Curso_id the t_ ul_ curso_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ estud_ curso
	 * @throws NoSuchT_Ul_Estud_CursoException if a matching t_ ul_ estud_ curso could not be found
	 */
	public T_Ul_Estud_Curso findByT_Ul_Curso_id_Last(
			long T_Ul_Curso_id,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Estud_Curso>
				orderByComparator)
		throws NoSuchT_Ul_Estud_CursoException;

	/**
	 * Returns the last t_ ul_ estud_ curso in the ordered set where T_Ul_Curso_id = &#63;.
	 *
	 * @param T_Ul_Curso_id the t_ ul_ curso_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ estud_ curso, or <code>null</code> if a matching t_ ul_ estud_ curso could not be found
	 */
	public T_Ul_Estud_Curso fetchByT_Ul_Curso_id_Last(
		long T_Ul_Curso_id,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Estud_Curso>
			orderByComparator);

	/**
	 * Returns the t_ ul_ estud_ cursos before and after the current t_ ul_ estud_ curso in the ordered set where T_Ul_Curso_id = &#63;.
	 *
	 * @param t_Ul_Estud_CursoPK the primary key of the current t_ ul_ estud_ curso
	 * @param T_Ul_Curso_id the t_ ul_ curso_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t_ ul_ estud_ curso
	 * @throws NoSuchT_Ul_Estud_CursoException if a t_ ul_ estud_ curso with the primary key could not be found
	 */
	public T_Ul_Estud_Curso[] findByT_Ul_Curso_id_PrevAndNext(
			T_Ul_Estud_CursoPK t_Ul_Estud_CursoPK, long T_Ul_Curso_id,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Estud_Curso>
				orderByComparator)
		throws NoSuchT_Ul_Estud_CursoException;

	/**
	 * Removes all the t_ ul_ estud_ cursos where T_Ul_Curso_id = &#63; from the database.
	 *
	 * @param T_Ul_Curso_id the t_ ul_ curso_id
	 */
	public void removeByT_Ul_Curso_id(long T_Ul_Curso_id);

	/**
	 * Returns the number of t_ ul_ estud_ cursos where T_Ul_Curso_id = &#63;.
	 *
	 * @param T_Ul_Curso_id the t_ ul_ curso_id
	 * @return the number of matching t_ ul_ estud_ cursos
	 */
	public int countByT_Ul_Curso_id(long T_Ul_Curso_id);

	/**
	 * Caches the t_ ul_ estud_ curso in the entity cache if it is enabled.
	 *
	 * @param t_Ul_Estud_Curso the t_ ul_ estud_ curso
	 */
	public void cacheResult(T_Ul_Estud_Curso t_Ul_Estud_Curso);

	/**
	 * Caches the t_ ul_ estud_ cursos in the entity cache if it is enabled.
	 *
	 * @param t_Ul_Estud_Cursos the t_ ul_ estud_ cursos
	 */
	public void cacheResult(java.util.List<T_Ul_Estud_Curso> t_Ul_Estud_Cursos);

	/**
	 * Creates a new t_ ul_ estud_ curso with the primary key. Does not add the t_ ul_ estud_ curso to the database.
	 *
	 * @param t_Ul_Estud_CursoPK the primary key for the new t_ ul_ estud_ curso
	 * @return the new t_ ul_ estud_ curso
	 */
	public T_Ul_Estud_Curso create(T_Ul_Estud_CursoPK t_Ul_Estud_CursoPK);

	/**
	 * Removes the t_ ul_ estud_ curso with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param t_Ul_Estud_CursoPK the primary key of the t_ ul_ estud_ curso
	 * @return the t_ ul_ estud_ curso that was removed
	 * @throws NoSuchT_Ul_Estud_CursoException if a t_ ul_ estud_ curso with the primary key could not be found
	 */
	public T_Ul_Estud_Curso remove(T_Ul_Estud_CursoPK t_Ul_Estud_CursoPK)
		throws NoSuchT_Ul_Estud_CursoException;

	public T_Ul_Estud_Curso updateImpl(T_Ul_Estud_Curso t_Ul_Estud_Curso);

	/**
	 * Returns the t_ ul_ estud_ curso with the primary key or throws a <code>NoSuchT_Ul_Estud_CursoException</code> if it could not be found.
	 *
	 * @param t_Ul_Estud_CursoPK the primary key of the t_ ul_ estud_ curso
	 * @return the t_ ul_ estud_ curso
	 * @throws NoSuchT_Ul_Estud_CursoException if a t_ ul_ estud_ curso with the primary key could not be found
	 */
	public T_Ul_Estud_Curso findByPrimaryKey(
			T_Ul_Estud_CursoPK t_Ul_Estud_CursoPK)
		throws NoSuchT_Ul_Estud_CursoException;

	/**
	 * Returns the t_ ul_ estud_ curso with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param t_Ul_Estud_CursoPK the primary key of the t_ ul_ estud_ curso
	 * @return the t_ ul_ estud_ curso, or <code>null</code> if a t_ ul_ estud_ curso with the primary key could not be found
	 */
	public T_Ul_Estud_Curso fetchByPrimaryKey(
		T_Ul_Estud_CursoPK t_Ul_Estud_CursoPK);

	/**
	 * Returns all the t_ ul_ estud_ cursos.
	 *
	 * @return the t_ ul_ estud_ cursos
	 */
	public java.util.List<T_Ul_Estud_Curso> findAll();

	/**
	 * Returns a range of all the t_ ul_ estud_ cursos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_Estud_CursoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_ estud_ cursos
	 * @param end the upper bound of the range of t_ ul_ estud_ cursos (not inclusive)
	 * @return the range of t_ ul_ estud_ cursos
	 */
	public java.util.List<T_Ul_Estud_Curso> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the t_ ul_ estud_ cursos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_Estud_CursoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_ estud_ cursos
	 * @param end the upper bound of the range of t_ ul_ estud_ cursos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of t_ ul_ estud_ cursos
	 */
	public java.util.List<T_Ul_Estud_Curso> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Estud_Curso>
			orderByComparator);

	/**
	 * Returns an ordered range of all the t_ ul_ estud_ cursos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_Estud_CursoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_ estud_ cursos
	 * @param end the upper bound of the range of t_ ul_ estud_ cursos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of t_ ul_ estud_ cursos
	 */
	public java.util.List<T_Ul_Estud_Curso> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Estud_Curso>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the t_ ul_ estud_ cursos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of t_ ul_ estud_ cursos.
	 *
	 * @return the number of t_ ul_ estud_ cursos
	 */
	public int countAll();

	public Set<String> getCompoundPKColumnNames();

}
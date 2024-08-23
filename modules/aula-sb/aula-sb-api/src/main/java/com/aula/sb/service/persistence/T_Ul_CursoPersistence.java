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

import com.aula.sb.exception.NoSuchT_Ul_CursoException;
import com.aula.sb.model.T_Ul_Curso;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the t_ ul_ curso service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see T_Ul_CursoUtil
 * @generated
 */
@ProviderType
public interface T_Ul_CursoPersistence extends BasePersistence<T_Ul_Curso> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link T_Ul_CursoUtil} to access the t_ ul_ curso persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the t_ ul_ cursos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching t_ ul_ cursos
	 */
	public java.util.List<T_Ul_Curso> findByUuid(String uuid);

	/**
	 * Returns a range of all the t_ ul_ cursos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_CursoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of t_ ul_ cursos
	 * @param end the upper bound of the range of t_ ul_ cursos (not inclusive)
	 * @return the range of matching t_ ul_ cursos
	 */
	public java.util.List<T_Ul_Curso> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the t_ ul_ cursos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_CursoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of t_ ul_ cursos
	 * @param end the upper bound of the range of t_ ul_ cursos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t_ ul_ cursos
	 */
	public java.util.List<T_Ul_Curso> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Curso>
			orderByComparator);

	/**
	 * Returns an ordered range of all the t_ ul_ cursos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_CursoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of t_ ul_ cursos
	 * @param end the upper bound of the range of t_ ul_ cursos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching t_ ul_ cursos
	 */
	public java.util.List<T_Ul_Curso> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Curso>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first t_ ul_ curso in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ curso
	 * @throws NoSuchT_Ul_CursoException if a matching t_ ul_ curso could not be found
	 */
	public T_Ul_Curso findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Curso>
				orderByComparator)
		throws NoSuchT_Ul_CursoException;

	/**
	 * Returns the first t_ ul_ curso in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ curso, or <code>null</code> if a matching t_ ul_ curso could not be found
	 */
	public T_Ul_Curso fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Curso>
			orderByComparator);

	/**
	 * Returns the last t_ ul_ curso in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ curso
	 * @throws NoSuchT_Ul_CursoException if a matching t_ ul_ curso could not be found
	 */
	public T_Ul_Curso findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Curso>
				orderByComparator)
		throws NoSuchT_Ul_CursoException;

	/**
	 * Returns the last t_ ul_ curso in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ curso, or <code>null</code> if a matching t_ ul_ curso could not be found
	 */
	public T_Ul_Curso fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Curso>
			orderByComparator);

	/**
	 * Returns the t_ ul_ cursos before and after the current t_ ul_ curso in the ordered set where uuid = &#63;.
	 *
	 * @param idCurso the primary key of the current t_ ul_ curso
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t_ ul_ curso
	 * @throws NoSuchT_Ul_CursoException if a t_ ul_ curso with the primary key could not be found
	 */
	public T_Ul_Curso[] findByUuid_PrevAndNext(
			long idCurso, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Curso>
				orderByComparator)
		throws NoSuchT_Ul_CursoException;

	/**
	 * Removes all the t_ ul_ cursos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of t_ ul_ cursos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching t_ ul_ cursos
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the t_ ul_ curso where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchT_Ul_CursoException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching t_ ul_ curso
	 * @throws NoSuchT_Ul_CursoException if a matching t_ ul_ curso could not be found
	 */
	public T_Ul_Curso findByUUID_G(String uuid, long groupId)
		throws NoSuchT_Ul_CursoException;

	/**
	 * Returns the t_ ul_ curso where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching t_ ul_ curso, or <code>null</code> if a matching t_ ul_ curso could not be found
	 */
	public T_Ul_Curso fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the t_ ul_ curso where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching t_ ul_ curso, or <code>null</code> if a matching t_ ul_ curso could not be found
	 */
	public T_Ul_Curso fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the t_ ul_ curso where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the t_ ul_ curso that was removed
	 */
	public T_Ul_Curso removeByUUID_G(String uuid, long groupId)
		throws NoSuchT_Ul_CursoException;

	/**
	 * Returns the number of t_ ul_ cursos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching t_ ul_ cursos
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the t_ ul_ cursos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching t_ ul_ cursos
	 */
	public java.util.List<T_Ul_Curso> findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the t_ ul_ cursos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_CursoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of t_ ul_ cursos
	 * @param end the upper bound of the range of t_ ul_ cursos (not inclusive)
	 * @return the range of matching t_ ul_ cursos
	 */
	public java.util.List<T_Ul_Curso> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the t_ ul_ cursos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_CursoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of t_ ul_ cursos
	 * @param end the upper bound of the range of t_ ul_ cursos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t_ ul_ cursos
	 */
	public java.util.List<T_Ul_Curso> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Curso>
			orderByComparator);

	/**
	 * Returns an ordered range of all the t_ ul_ cursos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_CursoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of t_ ul_ cursos
	 * @param end the upper bound of the range of t_ ul_ cursos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching t_ ul_ cursos
	 */
	public java.util.List<T_Ul_Curso> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Curso>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first t_ ul_ curso in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ curso
	 * @throws NoSuchT_Ul_CursoException if a matching t_ ul_ curso could not be found
	 */
	public T_Ul_Curso findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Curso>
				orderByComparator)
		throws NoSuchT_Ul_CursoException;

	/**
	 * Returns the first t_ ul_ curso in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ curso, or <code>null</code> if a matching t_ ul_ curso could not be found
	 */
	public T_Ul_Curso fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Curso>
			orderByComparator);

	/**
	 * Returns the last t_ ul_ curso in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ curso
	 * @throws NoSuchT_Ul_CursoException if a matching t_ ul_ curso could not be found
	 */
	public T_Ul_Curso findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Curso>
				orderByComparator)
		throws NoSuchT_Ul_CursoException;

	/**
	 * Returns the last t_ ul_ curso in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ curso, or <code>null</code> if a matching t_ ul_ curso could not be found
	 */
	public T_Ul_Curso fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Curso>
			orderByComparator);

	/**
	 * Returns the t_ ul_ cursos before and after the current t_ ul_ curso in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param idCurso the primary key of the current t_ ul_ curso
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t_ ul_ curso
	 * @throws NoSuchT_Ul_CursoException if a t_ ul_ curso with the primary key could not be found
	 */
	public T_Ul_Curso[] findByUuid_C_PrevAndNext(
			long idCurso, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Curso>
				orderByComparator)
		throws NoSuchT_Ul_CursoException;

	/**
	 * Removes all the t_ ul_ cursos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of t_ ul_ cursos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching t_ ul_ cursos
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the t_ ul_ cursos where nombreCurso = &#63;.
	 *
	 * @param nombreCurso the nombre curso
	 * @return the matching t_ ul_ cursos
	 */
	public java.util.List<T_Ul_Curso> findByNombreCurso(String nombreCurso);

	/**
	 * Returns a range of all the t_ ul_ cursos where nombreCurso = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_CursoModelImpl</code>.
	 * </p>
	 *
	 * @param nombreCurso the nombre curso
	 * @param start the lower bound of the range of t_ ul_ cursos
	 * @param end the upper bound of the range of t_ ul_ cursos (not inclusive)
	 * @return the range of matching t_ ul_ cursos
	 */
	public java.util.List<T_Ul_Curso> findByNombreCurso(
		String nombreCurso, int start, int end);

	/**
	 * Returns an ordered range of all the t_ ul_ cursos where nombreCurso = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_CursoModelImpl</code>.
	 * </p>
	 *
	 * @param nombreCurso the nombre curso
	 * @param start the lower bound of the range of t_ ul_ cursos
	 * @param end the upper bound of the range of t_ ul_ cursos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t_ ul_ cursos
	 */
	public java.util.List<T_Ul_Curso> findByNombreCurso(
		String nombreCurso, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Curso>
			orderByComparator);

	/**
	 * Returns an ordered range of all the t_ ul_ cursos where nombreCurso = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_CursoModelImpl</code>.
	 * </p>
	 *
	 * @param nombreCurso the nombre curso
	 * @param start the lower bound of the range of t_ ul_ cursos
	 * @param end the upper bound of the range of t_ ul_ cursos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching t_ ul_ cursos
	 */
	public java.util.List<T_Ul_Curso> findByNombreCurso(
		String nombreCurso, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Curso>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first t_ ul_ curso in the ordered set where nombreCurso = &#63;.
	 *
	 * @param nombreCurso the nombre curso
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ curso
	 * @throws NoSuchT_Ul_CursoException if a matching t_ ul_ curso could not be found
	 */
	public T_Ul_Curso findByNombreCurso_First(
			String nombreCurso,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Curso>
				orderByComparator)
		throws NoSuchT_Ul_CursoException;

	/**
	 * Returns the first t_ ul_ curso in the ordered set where nombreCurso = &#63;.
	 *
	 * @param nombreCurso the nombre curso
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ curso, or <code>null</code> if a matching t_ ul_ curso could not be found
	 */
	public T_Ul_Curso fetchByNombreCurso_First(
		String nombreCurso,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Curso>
			orderByComparator);

	/**
	 * Returns the last t_ ul_ curso in the ordered set where nombreCurso = &#63;.
	 *
	 * @param nombreCurso the nombre curso
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ curso
	 * @throws NoSuchT_Ul_CursoException if a matching t_ ul_ curso could not be found
	 */
	public T_Ul_Curso findByNombreCurso_Last(
			String nombreCurso,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Curso>
				orderByComparator)
		throws NoSuchT_Ul_CursoException;

	/**
	 * Returns the last t_ ul_ curso in the ordered set where nombreCurso = &#63;.
	 *
	 * @param nombreCurso the nombre curso
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ curso, or <code>null</code> if a matching t_ ul_ curso could not be found
	 */
	public T_Ul_Curso fetchByNombreCurso_Last(
		String nombreCurso,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Curso>
			orderByComparator);

	/**
	 * Returns the t_ ul_ cursos before and after the current t_ ul_ curso in the ordered set where nombreCurso = &#63;.
	 *
	 * @param idCurso the primary key of the current t_ ul_ curso
	 * @param nombreCurso the nombre curso
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t_ ul_ curso
	 * @throws NoSuchT_Ul_CursoException if a t_ ul_ curso with the primary key could not be found
	 */
	public T_Ul_Curso[] findByNombreCurso_PrevAndNext(
			long idCurso, String nombreCurso,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Curso>
				orderByComparator)
		throws NoSuchT_Ul_CursoException;

	/**
	 * Removes all the t_ ul_ cursos where nombreCurso = &#63; from the database.
	 *
	 * @param nombreCurso the nombre curso
	 */
	public void removeByNombreCurso(String nombreCurso);

	/**
	 * Returns the number of t_ ul_ cursos where nombreCurso = &#63;.
	 *
	 * @param nombreCurso the nombre curso
	 * @return the number of matching t_ ul_ cursos
	 */
	public int countByNombreCurso(String nombreCurso);

	/**
	 * Caches the t_ ul_ curso in the entity cache if it is enabled.
	 *
	 * @param t_Ul_Curso the t_ ul_ curso
	 */
	public void cacheResult(T_Ul_Curso t_Ul_Curso);

	/**
	 * Caches the t_ ul_ cursos in the entity cache if it is enabled.
	 *
	 * @param t_Ul_Cursos the t_ ul_ cursos
	 */
	public void cacheResult(java.util.List<T_Ul_Curso> t_Ul_Cursos);

	/**
	 * Creates a new t_ ul_ curso with the primary key. Does not add the t_ ul_ curso to the database.
	 *
	 * @param idCurso the primary key for the new t_ ul_ curso
	 * @return the new t_ ul_ curso
	 */
	public T_Ul_Curso create(long idCurso);

	/**
	 * Removes the t_ ul_ curso with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param idCurso the primary key of the t_ ul_ curso
	 * @return the t_ ul_ curso that was removed
	 * @throws NoSuchT_Ul_CursoException if a t_ ul_ curso with the primary key could not be found
	 */
	public T_Ul_Curso remove(long idCurso) throws NoSuchT_Ul_CursoException;

	public T_Ul_Curso updateImpl(T_Ul_Curso t_Ul_Curso);

	/**
	 * Returns the t_ ul_ curso with the primary key or throws a <code>NoSuchT_Ul_CursoException</code> if it could not be found.
	 *
	 * @param idCurso the primary key of the t_ ul_ curso
	 * @return the t_ ul_ curso
	 * @throws NoSuchT_Ul_CursoException if a t_ ul_ curso with the primary key could not be found
	 */
	public T_Ul_Curso findByPrimaryKey(long idCurso)
		throws NoSuchT_Ul_CursoException;

	/**
	 * Returns the t_ ul_ curso with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param idCurso the primary key of the t_ ul_ curso
	 * @return the t_ ul_ curso, or <code>null</code> if a t_ ul_ curso with the primary key could not be found
	 */
	public T_Ul_Curso fetchByPrimaryKey(long idCurso);

	/**
	 * Returns all the t_ ul_ cursos.
	 *
	 * @return the t_ ul_ cursos
	 */
	public java.util.List<T_Ul_Curso> findAll();

	/**
	 * Returns a range of all the t_ ul_ cursos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_CursoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_ cursos
	 * @param end the upper bound of the range of t_ ul_ cursos (not inclusive)
	 * @return the range of t_ ul_ cursos
	 */
	public java.util.List<T_Ul_Curso> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the t_ ul_ cursos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_CursoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_ cursos
	 * @param end the upper bound of the range of t_ ul_ cursos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of t_ ul_ cursos
	 */
	public java.util.List<T_Ul_Curso> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Curso>
			orderByComparator);

	/**
	 * Returns an ordered range of all the t_ ul_ cursos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_CursoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_ cursos
	 * @param end the upper bound of the range of t_ ul_ cursos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of t_ ul_ cursos
	 */
	public java.util.List<T_Ul_Curso> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Curso>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the t_ ul_ cursos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of t_ ul_ cursos.
	 *
	 * @return the number of t_ ul_ cursos
	 */
	public int countAll();

}
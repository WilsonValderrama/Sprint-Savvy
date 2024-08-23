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

import com.aula.sb.exception.NoSuchT_Ul_EstudianteException;
import com.aula.sb.model.T_Ul_Estudiante;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the t_ ul_ estudiante service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see T_Ul_EstudianteUtil
 * @generated
 */
@ProviderType
public interface T_Ul_EstudiantePersistence
	extends BasePersistence<T_Ul_Estudiante> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link T_Ul_EstudianteUtil} to access the t_ ul_ estudiante persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the t_ ul_ estudiantes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching t_ ul_ estudiantes
	 */
	public java.util.List<T_Ul_Estudiante> findByUuid(String uuid);

	/**
	 * Returns a range of all the t_ ul_ estudiantes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_EstudianteModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of t_ ul_ estudiantes
	 * @param end the upper bound of the range of t_ ul_ estudiantes (not inclusive)
	 * @return the range of matching t_ ul_ estudiantes
	 */
	public java.util.List<T_Ul_Estudiante> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the t_ ul_ estudiantes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_EstudianteModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of t_ ul_ estudiantes
	 * @param end the upper bound of the range of t_ ul_ estudiantes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t_ ul_ estudiantes
	 */
	public java.util.List<T_Ul_Estudiante> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Estudiante>
			orderByComparator);

	/**
	 * Returns an ordered range of all the t_ ul_ estudiantes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_EstudianteModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of t_ ul_ estudiantes
	 * @param end the upper bound of the range of t_ ul_ estudiantes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching t_ ul_ estudiantes
	 */
	public java.util.List<T_Ul_Estudiante> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Estudiante>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first t_ ul_ estudiante in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ estudiante
	 * @throws NoSuchT_Ul_EstudianteException if a matching t_ ul_ estudiante could not be found
	 */
	public T_Ul_Estudiante findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Estudiante>
				orderByComparator)
		throws NoSuchT_Ul_EstudianteException;

	/**
	 * Returns the first t_ ul_ estudiante in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ estudiante, or <code>null</code> if a matching t_ ul_ estudiante could not be found
	 */
	public T_Ul_Estudiante fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Estudiante>
			orderByComparator);

	/**
	 * Returns the last t_ ul_ estudiante in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ estudiante
	 * @throws NoSuchT_Ul_EstudianteException if a matching t_ ul_ estudiante could not be found
	 */
	public T_Ul_Estudiante findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Estudiante>
				orderByComparator)
		throws NoSuchT_Ul_EstudianteException;

	/**
	 * Returns the last t_ ul_ estudiante in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ estudiante, or <code>null</code> if a matching t_ ul_ estudiante could not be found
	 */
	public T_Ul_Estudiante fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Estudiante>
			orderByComparator);

	/**
	 * Returns the t_ ul_ estudiantes before and after the current t_ ul_ estudiante in the ordered set where uuid = &#63;.
	 *
	 * @param idEstudiante the primary key of the current t_ ul_ estudiante
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t_ ul_ estudiante
	 * @throws NoSuchT_Ul_EstudianteException if a t_ ul_ estudiante with the primary key could not be found
	 */
	public T_Ul_Estudiante[] findByUuid_PrevAndNext(
			long idEstudiante, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Estudiante>
				orderByComparator)
		throws NoSuchT_Ul_EstudianteException;

	/**
	 * Removes all the t_ ul_ estudiantes where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of t_ ul_ estudiantes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching t_ ul_ estudiantes
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the t_ ul_ estudiante where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchT_Ul_EstudianteException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching t_ ul_ estudiante
	 * @throws NoSuchT_Ul_EstudianteException if a matching t_ ul_ estudiante could not be found
	 */
	public T_Ul_Estudiante findByUUID_G(String uuid, long groupId)
		throws NoSuchT_Ul_EstudianteException;

	/**
	 * Returns the t_ ul_ estudiante where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching t_ ul_ estudiante, or <code>null</code> if a matching t_ ul_ estudiante could not be found
	 */
	public T_Ul_Estudiante fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the t_ ul_ estudiante where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching t_ ul_ estudiante, or <code>null</code> if a matching t_ ul_ estudiante could not be found
	 */
	public T_Ul_Estudiante fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the t_ ul_ estudiante where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the t_ ul_ estudiante that was removed
	 */
	public T_Ul_Estudiante removeByUUID_G(String uuid, long groupId)
		throws NoSuchT_Ul_EstudianteException;

	/**
	 * Returns the number of t_ ul_ estudiantes where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching t_ ul_ estudiantes
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the t_ ul_ estudiantes where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching t_ ul_ estudiantes
	 */
	public java.util.List<T_Ul_Estudiante> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the t_ ul_ estudiantes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_EstudianteModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of t_ ul_ estudiantes
	 * @param end the upper bound of the range of t_ ul_ estudiantes (not inclusive)
	 * @return the range of matching t_ ul_ estudiantes
	 */
	public java.util.List<T_Ul_Estudiante> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the t_ ul_ estudiantes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_EstudianteModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of t_ ul_ estudiantes
	 * @param end the upper bound of the range of t_ ul_ estudiantes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t_ ul_ estudiantes
	 */
	public java.util.List<T_Ul_Estudiante> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Estudiante>
			orderByComparator);

	/**
	 * Returns an ordered range of all the t_ ul_ estudiantes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_EstudianteModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of t_ ul_ estudiantes
	 * @param end the upper bound of the range of t_ ul_ estudiantes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching t_ ul_ estudiantes
	 */
	public java.util.List<T_Ul_Estudiante> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Estudiante>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first t_ ul_ estudiante in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ estudiante
	 * @throws NoSuchT_Ul_EstudianteException if a matching t_ ul_ estudiante could not be found
	 */
	public T_Ul_Estudiante findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Estudiante>
				orderByComparator)
		throws NoSuchT_Ul_EstudianteException;

	/**
	 * Returns the first t_ ul_ estudiante in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ estudiante, or <code>null</code> if a matching t_ ul_ estudiante could not be found
	 */
	public T_Ul_Estudiante fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Estudiante>
			orderByComparator);

	/**
	 * Returns the last t_ ul_ estudiante in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ estudiante
	 * @throws NoSuchT_Ul_EstudianteException if a matching t_ ul_ estudiante could not be found
	 */
	public T_Ul_Estudiante findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Estudiante>
				orderByComparator)
		throws NoSuchT_Ul_EstudianteException;

	/**
	 * Returns the last t_ ul_ estudiante in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ estudiante, or <code>null</code> if a matching t_ ul_ estudiante could not be found
	 */
	public T_Ul_Estudiante fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Estudiante>
			orderByComparator);

	/**
	 * Returns the t_ ul_ estudiantes before and after the current t_ ul_ estudiante in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param idEstudiante the primary key of the current t_ ul_ estudiante
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t_ ul_ estudiante
	 * @throws NoSuchT_Ul_EstudianteException if a t_ ul_ estudiante with the primary key could not be found
	 */
	public T_Ul_Estudiante[] findByUuid_C_PrevAndNext(
			long idEstudiante, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Estudiante>
				orderByComparator)
		throws NoSuchT_Ul_EstudianteException;

	/**
	 * Removes all the t_ ul_ estudiantes where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of t_ ul_ estudiantes where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching t_ ul_ estudiantes
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the t_ ul_ estudiantes where nombreEstudiante = &#63;.
	 *
	 * @param nombreEstudiante the nombre estudiante
	 * @return the matching t_ ul_ estudiantes
	 */
	public java.util.List<T_Ul_Estudiante> findBynombreEstudiante(
		String nombreEstudiante);

	/**
	 * Returns a range of all the t_ ul_ estudiantes where nombreEstudiante = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_EstudianteModelImpl</code>.
	 * </p>
	 *
	 * @param nombreEstudiante the nombre estudiante
	 * @param start the lower bound of the range of t_ ul_ estudiantes
	 * @param end the upper bound of the range of t_ ul_ estudiantes (not inclusive)
	 * @return the range of matching t_ ul_ estudiantes
	 */
	public java.util.List<T_Ul_Estudiante> findBynombreEstudiante(
		String nombreEstudiante, int start, int end);

	/**
	 * Returns an ordered range of all the t_ ul_ estudiantes where nombreEstudiante = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_EstudianteModelImpl</code>.
	 * </p>
	 *
	 * @param nombreEstudiante the nombre estudiante
	 * @param start the lower bound of the range of t_ ul_ estudiantes
	 * @param end the upper bound of the range of t_ ul_ estudiantes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t_ ul_ estudiantes
	 */
	public java.util.List<T_Ul_Estudiante> findBynombreEstudiante(
		String nombreEstudiante, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Estudiante>
			orderByComparator);

	/**
	 * Returns an ordered range of all the t_ ul_ estudiantes where nombreEstudiante = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_EstudianteModelImpl</code>.
	 * </p>
	 *
	 * @param nombreEstudiante the nombre estudiante
	 * @param start the lower bound of the range of t_ ul_ estudiantes
	 * @param end the upper bound of the range of t_ ul_ estudiantes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching t_ ul_ estudiantes
	 */
	public java.util.List<T_Ul_Estudiante> findBynombreEstudiante(
		String nombreEstudiante, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Estudiante>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first t_ ul_ estudiante in the ordered set where nombreEstudiante = &#63;.
	 *
	 * @param nombreEstudiante the nombre estudiante
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ estudiante
	 * @throws NoSuchT_Ul_EstudianteException if a matching t_ ul_ estudiante could not be found
	 */
	public T_Ul_Estudiante findBynombreEstudiante_First(
			String nombreEstudiante,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Estudiante>
				orderByComparator)
		throws NoSuchT_Ul_EstudianteException;

	/**
	 * Returns the first t_ ul_ estudiante in the ordered set where nombreEstudiante = &#63;.
	 *
	 * @param nombreEstudiante the nombre estudiante
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ estudiante, or <code>null</code> if a matching t_ ul_ estudiante could not be found
	 */
	public T_Ul_Estudiante fetchBynombreEstudiante_First(
		String nombreEstudiante,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Estudiante>
			orderByComparator);

	/**
	 * Returns the last t_ ul_ estudiante in the ordered set where nombreEstudiante = &#63;.
	 *
	 * @param nombreEstudiante the nombre estudiante
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ estudiante
	 * @throws NoSuchT_Ul_EstudianteException if a matching t_ ul_ estudiante could not be found
	 */
	public T_Ul_Estudiante findBynombreEstudiante_Last(
			String nombreEstudiante,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Estudiante>
				orderByComparator)
		throws NoSuchT_Ul_EstudianteException;

	/**
	 * Returns the last t_ ul_ estudiante in the ordered set where nombreEstudiante = &#63;.
	 *
	 * @param nombreEstudiante the nombre estudiante
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ estudiante, or <code>null</code> if a matching t_ ul_ estudiante could not be found
	 */
	public T_Ul_Estudiante fetchBynombreEstudiante_Last(
		String nombreEstudiante,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Estudiante>
			orderByComparator);

	/**
	 * Returns the t_ ul_ estudiantes before and after the current t_ ul_ estudiante in the ordered set where nombreEstudiante = &#63;.
	 *
	 * @param idEstudiante the primary key of the current t_ ul_ estudiante
	 * @param nombreEstudiante the nombre estudiante
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t_ ul_ estudiante
	 * @throws NoSuchT_Ul_EstudianteException if a t_ ul_ estudiante with the primary key could not be found
	 */
	public T_Ul_Estudiante[] findBynombreEstudiante_PrevAndNext(
			long idEstudiante, String nombreEstudiante,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Estudiante>
				orderByComparator)
		throws NoSuchT_Ul_EstudianteException;

	/**
	 * Removes all the t_ ul_ estudiantes where nombreEstudiante = &#63; from the database.
	 *
	 * @param nombreEstudiante the nombre estudiante
	 */
	public void removeBynombreEstudiante(String nombreEstudiante);

	/**
	 * Returns the number of t_ ul_ estudiantes where nombreEstudiante = &#63;.
	 *
	 * @param nombreEstudiante the nombre estudiante
	 * @return the number of matching t_ ul_ estudiantes
	 */
	public int countBynombreEstudiante(String nombreEstudiante);

	/**
	 * Caches the t_ ul_ estudiante in the entity cache if it is enabled.
	 *
	 * @param t_Ul_Estudiante the t_ ul_ estudiante
	 */
	public void cacheResult(T_Ul_Estudiante t_Ul_Estudiante);

	/**
	 * Caches the t_ ul_ estudiantes in the entity cache if it is enabled.
	 *
	 * @param t_Ul_Estudiantes the t_ ul_ estudiantes
	 */
	public void cacheResult(java.util.List<T_Ul_Estudiante> t_Ul_Estudiantes);

	/**
	 * Creates a new t_ ul_ estudiante with the primary key. Does not add the t_ ul_ estudiante to the database.
	 *
	 * @param idEstudiante the primary key for the new t_ ul_ estudiante
	 * @return the new t_ ul_ estudiante
	 */
	public T_Ul_Estudiante create(long idEstudiante);

	/**
	 * Removes the t_ ul_ estudiante with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param idEstudiante the primary key of the t_ ul_ estudiante
	 * @return the t_ ul_ estudiante that was removed
	 * @throws NoSuchT_Ul_EstudianteException if a t_ ul_ estudiante with the primary key could not be found
	 */
	public T_Ul_Estudiante remove(long idEstudiante)
		throws NoSuchT_Ul_EstudianteException;

	public T_Ul_Estudiante updateImpl(T_Ul_Estudiante t_Ul_Estudiante);

	/**
	 * Returns the t_ ul_ estudiante with the primary key or throws a <code>NoSuchT_Ul_EstudianteException</code> if it could not be found.
	 *
	 * @param idEstudiante the primary key of the t_ ul_ estudiante
	 * @return the t_ ul_ estudiante
	 * @throws NoSuchT_Ul_EstudianteException if a t_ ul_ estudiante with the primary key could not be found
	 */
	public T_Ul_Estudiante findByPrimaryKey(long idEstudiante)
		throws NoSuchT_Ul_EstudianteException;

	/**
	 * Returns the t_ ul_ estudiante with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param idEstudiante the primary key of the t_ ul_ estudiante
	 * @return the t_ ul_ estudiante, or <code>null</code> if a t_ ul_ estudiante with the primary key could not be found
	 */
	public T_Ul_Estudiante fetchByPrimaryKey(long idEstudiante);

	/**
	 * Returns all the t_ ul_ estudiantes.
	 *
	 * @return the t_ ul_ estudiantes
	 */
	public java.util.List<T_Ul_Estudiante> findAll();

	/**
	 * Returns a range of all the t_ ul_ estudiantes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_EstudianteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_ estudiantes
	 * @param end the upper bound of the range of t_ ul_ estudiantes (not inclusive)
	 * @return the range of t_ ul_ estudiantes
	 */
	public java.util.List<T_Ul_Estudiante> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the t_ ul_ estudiantes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_EstudianteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_ estudiantes
	 * @param end the upper bound of the range of t_ ul_ estudiantes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of t_ ul_ estudiantes
	 */
	public java.util.List<T_Ul_Estudiante> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Estudiante>
			orderByComparator);

	/**
	 * Returns an ordered range of all the t_ ul_ estudiantes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_EstudianteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_ estudiantes
	 * @param end the upper bound of the range of t_ ul_ estudiantes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of t_ ul_ estudiantes
	 */
	public java.util.List<T_Ul_Estudiante> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_Estudiante>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the t_ ul_ estudiantes from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of t_ ul_ estudiantes.
	 *
	 * @return the number of t_ ul_ estudiantes
	 */
	public int countAll();

}
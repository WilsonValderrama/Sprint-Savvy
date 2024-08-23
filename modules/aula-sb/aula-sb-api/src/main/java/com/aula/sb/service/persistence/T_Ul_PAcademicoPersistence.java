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

import com.aula.sb.exception.NoSuchT_Ul_PAcademicoException;
import com.aula.sb.model.T_Ul_PAcademico;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the t_ ul_p academico service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see T_Ul_PAcademicoUtil
 * @generated
 */
@ProviderType
public interface T_Ul_PAcademicoPersistence
	extends BasePersistence<T_Ul_PAcademico> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link T_Ul_PAcademicoUtil} to access the t_ ul_p academico persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the t_ ul_p academicos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching t_ ul_p academicos
	 */
	public java.util.List<T_Ul_PAcademico> findByUuid(String uuid);

	/**
	 * Returns a range of all the t_ ul_p academicos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_PAcademicoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of t_ ul_p academicos
	 * @param end the upper bound of the range of t_ ul_p academicos (not inclusive)
	 * @return the range of matching t_ ul_p academicos
	 */
	public java.util.List<T_Ul_PAcademico> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the t_ ul_p academicos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_PAcademicoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of t_ ul_p academicos
	 * @param end the upper bound of the range of t_ ul_p academicos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t_ ul_p academicos
	 */
	public java.util.List<T_Ul_PAcademico> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_PAcademico>
			orderByComparator);

	/**
	 * Returns an ordered range of all the t_ ul_p academicos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_PAcademicoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of t_ ul_p academicos
	 * @param end the upper bound of the range of t_ ul_p academicos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching t_ ul_p academicos
	 */
	public java.util.List<T_Ul_PAcademico> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_PAcademico>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first t_ ul_p academico in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_p academico
	 * @throws NoSuchT_Ul_PAcademicoException if a matching t_ ul_p academico could not be found
	 */
	public T_Ul_PAcademico findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_PAcademico>
				orderByComparator)
		throws NoSuchT_Ul_PAcademicoException;

	/**
	 * Returns the first t_ ul_p academico in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_p academico, or <code>null</code> if a matching t_ ul_p academico could not be found
	 */
	public T_Ul_PAcademico fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_PAcademico>
			orderByComparator);

	/**
	 * Returns the last t_ ul_p academico in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_p academico
	 * @throws NoSuchT_Ul_PAcademicoException if a matching t_ ul_p academico could not be found
	 */
	public T_Ul_PAcademico findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_PAcademico>
				orderByComparator)
		throws NoSuchT_Ul_PAcademicoException;

	/**
	 * Returns the last t_ ul_p academico in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_p academico, or <code>null</code> if a matching t_ ul_p academico could not be found
	 */
	public T_Ul_PAcademico fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_PAcademico>
			orderByComparator);

	/**
	 * Returns the t_ ul_p academicos before and after the current t_ ul_p academico in the ordered set where uuid = &#63;.
	 *
	 * @param idPeriodo the primary key of the current t_ ul_p academico
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t_ ul_p academico
	 * @throws NoSuchT_Ul_PAcademicoException if a t_ ul_p academico with the primary key could not be found
	 */
	public T_Ul_PAcademico[] findByUuid_PrevAndNext(
			long idPeriodo, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_PAcademico>
				orderByComparator)
		throws NoSuchT_Ul_PAcademicoException;

	/**
	 * Removes all the t_ ul_p academicos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of t_ ul_p academicos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching t_ ul_p academicos
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the t_ ul_p academico where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchT_Ul_PAcademicoException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching t_ ul_p academico
	 * @throws NoSuchT_Ul_PAcademicoException if a matching t_ ul_p academico could not be found
	 */
	public T_Ul_PAcademico findByUUID_G(String uuid, long groupId)
		throws NoSuchT_Ul_PAcademicoException;

	/**
	 * Returns the t_ ul_p academico where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching t_ ul_p academico, or <code>null</code> if a matching t_ ul_p academico could not be found
	 */
	public T_Ul_PAcademico fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the t_ ul_p academico where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching t_ ul_p academico, or <code>null</code> if a matching t_ ul_p academico could not be found
	 */
	public T_Ul_PAcademico fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the t_ ul_p academico where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the t_ ul_p academico that was removed
	 */
	public T_Ul_PAcademico removeByUUID_G(String uuid, long groupId)
		throws NoSuchT_Ul_PAcademicoException;

	/**
	 * Returns the number of t_ ul_p academicos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching t_ ul_p academicos
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the t_ ul_p academicos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching t_ ul_p academicos
	 */
	public java.util.List<T_Ul_PAcademico> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the t_ ul_p academicos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_PAcademicoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of t_ ul_p academicos
	 * @param end the upper bound of the range of t_ ul_p academicos (not inclusive)
	 * @return the range of matching t_ ul_p academicos
	 */
	public java.util.List<T_Ul_PAcademico> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the t_ ul_p academicos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_PAcademicoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of t_ ul_p academicos
	 * @param end the upper bound of the range of t_ ul_p academicos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t_ ul_p academicos
	 */
	public java.util.List<T_Ul_PAcademico> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_PAcademico>
			orderByComparator);

	/**
	 * Returns an ordered range of all the t_ ul_p academicos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_PAcademicoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of t_ ul_p academicos
	 * @param end the upper bound of the range of t_ ul_p academicos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching t_ ul_p academicos
	 */
	public java.util.List<T_Ul_PAcademico> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_PAcademico>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first t_ ul_p academico in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_p academico
	 * @throws NoSuchT_Ul_PAcademicoException if a matching t_ ul_p academico could not be found
	 */
	public T_Ul_PAcademico findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_PAcademico>
				orderByComparator)
		throws NoSuchT_Ul_PAcademicoException;

	/**
	 * Returns the first t_ ul_p academico in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_p academico, or <code>null</code> if a matching t_ ul_p academico could not be found
	 */
	public T_Ul_PAcademico fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_PAcademico>
			orderByComparator);

	/**
	 * Returns the last t_ ul_p academico in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_p academico
	 * @throws NoSuchT_Ul_PAcademicoException if a matching t_ ul_p academico could not be found
	 */
	public T_Ul_PAcademico findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_PAcademico>
				orderByComparator)
		throws NoSuchT_Ul_PAcademicoException;

	/**
	 * Returns the last t_ ul_p academico in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_p academico, or <code>null</code> if a matching t_ ul_p academico could not be found
	 */
	public T_Ul_PAcademico fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_PAcademico>
			orderByComparator);

	/**
	 * Returns the t_ ul_p academicos before and after the current t_ ul_p academico in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param idPeriodo the primary key of the current t_ ul_p academico
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t_ ul_p academico
	 * @throws NoSuchT_Ul_PAcademicoException if a t_ ul_p academico with the primary key could not be found
	 */
	public T_Ul_PAcademico[] findByUuid_C_PrevAndNext(
			long idPeriodo, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_PAcademico>
				orderByComparator)
		throws NoSuchT_Ul_PAcademicoException;

	/**
	 * Removes all the t_ ul_p academicos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of t_ ul_p academicos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching t_ ul_p academicos
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the t_ ul_p academicos where tituloPeriodo = &#63;.
	 *
	 * @param tituloPeriodo the titulo periodo
	 * @return the matching t_ ul_p academicos
	 */
	public java.util.List<T_Ul_PAcademico> findByTituloPeriodo(
		String tituloPeriodo);

	/**
	 * Returns a range of all the t_ ul_p academicos where tituloPeriodo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_PAcademicoModelImpl</code>.
	 * </p>
	 *
	 * @param tituloPeriodo the titulo periodo
	 * @param start the lower bound of the range of t_ ul_p academicos
	 * @param end the upper bound of the range of t_ ul_p academicos (not inclusive)
	 * @return the range of matching t_ ul_p academicos
	 */
	public java.util.List<T_Ul_PAcademico> findByTituloPeriodo(
		String tituloPeriodo, int start, int end);

	/**
	 * Returns an ordered range of all the t_ ul_p academicos where tituloPeriodo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_PAcademicoModelImpl</code>.
	 * </p>
	 *
	 * @param tituloPeriodo the titulo periodo
	 * @param start the lower bound of the range of t_ ul_p academicos
	 * @param end the upper bound of the range of t_ ul_p academicos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t_ ul_p academicos
	 */
	public java.util.List<T_Ul_PAcademico> findByTituloPeriodo(
		String tituloPeriodo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_PAcademico>
			orderByComparator);

	/**
	 * Returns an ordered range of all the t_ ul_p academicos where tituloPeriodo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_PAcademicoModelImpl</code>.
	 * </p>
	 *
	 * @param tituloPeriodo the titulo periodo
	 * @param start the lower bound of the range of t_ ul_p academicos
	 * @param end the upper bound of the range of t_ ul_p academicos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching t_ ul_p academicos
	 */
	public java.util.List<T_Ul_PAcademico> findByTituloPeriodo(
		String tituloPeriodo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_PAcademico>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first t_ ul_p academico in the ordered set where tituloPeriodo = &#63;.
	 *
	 * @param tituloPeriodo the titulo periodo
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_p academico
	 * @throws NoSuchT_Ul_PAcademicoException if a matching t_ ul_p academico could not be found
	 */
	public T_Ul_PAcademico findByTituloPeriodo_First(
			String tituloPeriodo,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_PAcademico>
				orderByComparator)
		throws NoSuchT_Ul_PAcademicoException;

	/**
	 * Returns the first t_ ul_p academico in the ordered set where tituloPeriodo = &#63;.
	 *
	 * @param tituloPeriodo the titulo periodo
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_p academico, or <code>null</code> if a matching t_ ul_p academico could not be found
	 */
	public T_Ul_PAcademico fetchByTituloPeriodo_First(
		String tituloPeriodo,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_PAcademico>
			orderByComparator);

	/**
	 * Returns the last t_ ul_p academico in the ordered set where tituloPeriodo = &#63;.
	 *
	 * @param tituloPeriodo the titulo periodo
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_p academico
	 * @throws NoSuchT_Ul_PAcademicoException if a matching t_ ul_p academico could not be found
	 */
	public T_Ul_PAcademico findByTituloPeriodo_Last(
			String tituloPeriodo,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_PAcademico>
				orderByComparator)
		throws NoSuchT_Ul_PAcademicoException;

	/**
	 * Returns the last t_ ul_p academico in the ordered set where tituloPeriodo = &#63;.
	 *
	 * @param tituloPeriodo the titulo periodo
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_p academico, or <code>null</code> if a matching t_ ul_p academico could not be found
	 */
	public T_Ul_PAcademico fetchByTituloPeriodo_Last(
		String tituloPeriodo,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_PAcademico>
			orderByComparator);

	/**
	 * Returns the t_ ul_p academicos before and after the current t_ ul_p academico in the ordered set where tituloPeriodo = &#63;.
	 *
	 * @param idPeriodo the primary key of the current t_ ul_p academico
	 * @param tituloPeriodo the titulo periodo
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t_ ul_p academico
	 * @throws NoSuchT_Ul_PAcademicoException if a t_ ul_p academico with the primary key could not be found
	 */
	public T_Ul_PAcademico[] findByTituloPeriodo_PrevAndNext(
			long idPeriodo, String tituloPeriodo,
			com.liferay.portal.kernel.util.OrderByComparator<T_Ul_PAcademico>
				orderByComparator)
		throws NoSuchT_Ul_PAcademicoException;

	/**
	 * Removes all the t_ ul_p academicos where tituloPeriodo = &#63; from the database.
	 *
	 * @param tituloPeriodo the titulo periodo
	 */
	public void removeByTituloPeriodo(String tituloPeriodo);

	/**
	 * Returns the number of t_ ul_p academicos where tituloPeriodo = &#63;.
	 *
	 * @param tituloPeriodo the titulo periodo
	 * @return the number of matching t_ ul_p academicos
	 */
	public int countByTituloPeriodo(String tituloPeriodo);

	/**
	 * Caches the t_ ul_p academico in the entity cache if it is enabled.
	 *
	 * @param t_Ul_PAcademico the t_ ul_p academico
	 */
	public void cacheResult(T_Ul_PAcademico t_Ul_PAcademico);

	/**
	 * Caches the t_ ul_p academicos in the entity cache if it is enabled.
	 *
	 * @param t_Ul_PAcademicos the t_ ul_p academicos
	 */
	public void cacheResult(java.util.List<T_Ul_PAcademico> t_Ul_PAcademicos);

	/**
	 * Creates a new t_ ul_p academico with the primary key. Does not add the t_ ul_p academico to the database.
	 *
	 * @param idPeriodo the primary key for the new t_ ul_p academico
	 * @return the new t_ ul_p academico
	 */
	public T_Ul_PAcademico create(long idPeriodo);

	/**
	 * Removes the t_ ul_p academico with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param idPeriodo the primary key of the t_ ul_p academico
	 * @return the t_ ul_p academico that was removed
	 * @throws NoSuchT_Ul_PAcademicoException if a t_ ul_p academico with the primary key could not be found
	 */
	public T_Ul_PAcademico remove(long idPeriodo)
		throws NoSuchT_Ul_PAcademicoException;

	public T_Ul_PAcademico updateImpl(T_Ul_PAcademico t_Ul_PAcademico);

	/**
	 * Returns the t_ ul_p academico with the primary key or throws a <code>NoSuchT_Ul_PAcademicoException</code> if it could not be found.
	 *
	 * @param idPeriodo the primary key of the t_ ul_p academico
	 * @return the t_ ul_p academico
	 * @throws NoSuchT_Ul_PAcademicoException if a t_ ul_p academico with the primary key could not be found
	 */
	public T_Ul_PAcademico findByPrimaryKey(long idPeriodo)
		throws NoSuchT_Ul_PAcademicoException;

	/**
	 * Returns the t_ ul_p academico with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param idPeriodo the primary key of the t_ ul_p academico
	 * @return the t_ ul_p academico, or <code>null</code> if a t_ ul_p academico with the primary key could not be found
	 */
	public T_Ul_PAcademico fetchByPrimaryKey(long idPeriodo);

	/**
	 * Returns all the t_ ul_p academicos.
	 *
	 * @return the t_ ul_p academicos
	 */
	public java.util.List<T_Ul_PAcademico> findAll();

	/**
	 * Returns a range of all the t_ ul_p academicos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_PAcademicoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_p academicos
	 * @param end the upper bound of the range of t_ ul_p academicos (not inclusive)
	 * @return the range of t_ ul_p academicos
	 */
	public java.util.List<T_Ul_PAcademico> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the t_ ul_p academicos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_PAcademicoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_p academicos
	 * @param end the upper bound of the range of t_ ul_p academicos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of t_ ul_p academicos
	 */
	public java.util.List<T_Ul_PAcademico> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_PAcademico>
			orderByComparator);

	/**
	 * Returns an ordered range of all the t_ ul_p academicos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_PAcademicoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_p academicos
	 * @param end the upper bound of the range of t_ ul_p academicos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of t_ ul_p academicos
	 */
	public java.util.List<T_Ul_PAcademico> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<T_Ul_PAcademico>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the t_ ul_p academicos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of t_ ul_p academicos.
	 *
	 * @return the number of t_ ul_p academicos
	 */
	public int countAll();

}
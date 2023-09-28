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

package com.savvy.sb.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.savvy.sb.model.Categoria;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the categoria service. This utility wraps <code>com.savvy.sb.service.persistence.impl.CategoriaPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CategoriaPersistence
 * @generated
 */
public class CategoriaUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Categoria categoria) {
		getPersistence().clearCache(categoria);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Categoria> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Categoria> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Categoria> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Categoria> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Categoria> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Categoria update(Categoria categoria) {
		return getPersistence().update(categoria);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Categoria update(
		Categoria categoria, ServiceContext serviceContext) {

		return getPersistence().update(categoria, serviceContext);
	}

	/**
	 * Returns all the categorias where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching categorias
	 */
	public static List<Categoria> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the categorias where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CategoriaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of categorias
	 * @param end the upper bound of the range of categorias (not inclusive)
	 * @return the range of matching categorias
	 */
	public static List<Categoria> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the categorias where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CategoriaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of categorias
	 * @param end the upper bound of the range of categorias (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching categorias
	 */
	public static List<Categoria> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Categoria> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the categorias where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CategoriaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of categorias
	 * @param end the upper bound of the range of categorias (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching categorias
	 */
	public static List<Categoria> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Categoria> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first categoria in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching categoria
	 * @throws NoSuchCategoriaException if a matching categoria could not be found
	 */
	public static Categoria findByUuid_First(
			String uuid, OrderByComparator<Categoria> orderByComparator)
		throws com.savvy.sb.exception.NoSuchCategoriaException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first categoria in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching categoria, or <code>null</code> if a matching categoria could not be found
	 */
	public static Categoria fetchByUuid_First(
		String uuid, OrderByComparator<Categoria> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last categoria in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching categoria
	 * @throws NoSuchCategoriaException if a matching categoria could not be found
	 */
	public static Categoria findByUuid_Last(
			String uuid, OrderByComparator<Categoria> orderByComparator)
		throws com.savvy.sb.exception.NoSuchCategoriaException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last categoria in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching categoria, or <code>null</code> if a matching categoria could not be found
	 */
	public static Categoria fetchByUuid_Last(
		String uuid, OrderByComparator<Categoria> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the categorias before and after the current categoria in the ordered set where uuid = &#63;.
	 *
	 * @param categoriaId the primary key of the current categoria
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next categoria
	 * @throws NoSuchCategoriaException if a categoria with the primary key could not be found
	 */
	public static Categoria[] findByUuid_PrevAndNext(
			long categoriaId, String uuid,
			OrderByComparator<Categoria> orderByComparator)
		throws com.savvy.sb.exception.NoSuchCategoriaException {

		return getPersistence().findByUuid_PrevAndNext(
			categoriaId, uuid, orderByComparator);
	}

	/**
	 * Removes all the categorias where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of categorias where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching categorias
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the categoria where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCategoriaException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching categoria
	 * @throws NoSuchCategoriaException if a matching categoria could not be found
	 */
	public static Categoria findByUUID_G(String uuid, long groupId)
		throws com.savvy.sb.exception.NoSuchCategoriaException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the categoria where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching categoria, or <code>null</code> if a matching categoria could not be found
	 */
	public static Categoria fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the categoria where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching categoria, or <code>null</code> if a matching categoria could not be found
	 */
	public static Categoria fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the categoria where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the categoria that was removed
	 */
	public static Categoria removeByUUID_G(String uuid, long groupId)
		throws com.savvy.sb.exception.NoSuchCategoriaException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of categorias where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching categorias
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the categorias where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching categorias
	 */
	public static List<Categoria> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the categorias where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CategoriaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of categorias
	 * @param end the upper bound of the range of categorias (not inclusive)
	 * @return the range of matching categorias
	 */
	public static List<Categoria> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the categorias where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CategoriaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of categorias
	 * @param end the upper bound of the range of categorias (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching categorias
	 */
	public static List<Categoria> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Categoria> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the categorias where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CategoriaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of categorias
	 * @param end the upper bound of the range of categorias (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching categorias
	 */
	public static List<Categoria> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Categoria> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first categoria in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching categoria
	 * @throws NoSuchCategoriaException if a matching categoria could not be found
	 */
	public static Categoria findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Categoria> orderByComparator)
		throws com.savvy.sb.exception.NoSuchCategoriaException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first categoria in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching categoria, or <code>null</code> if a matching categoria could not be found
	 */
	public static Categoria fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Categoria> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last categoria in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching categoria
	 * @throws NoSuchCategoriaException if a matching categoria could not be found
	 */
	public static Categoria findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Categoria> orderByComparator)
		throws com.savvy.sb.exception.NoSuchCategoriaException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last categoria in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching categoria, or <code>null</code> if a matching categoria could not be found
	 */
	public static Categoria fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Categoria> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the categorias before and after the current categoria in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param categoriaId the primary key of the current categoria
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next categoria
	 * @throws NoSuchCategoriaException if a categoria with the primary key could not be found
	 */
	public static Categoria[] findByUuid_C_PrevAndNext(
			long categoriaId, String uuid, long companyId,
			OrderByComparator<Categoria> orderByComparator)
		throws com.savvy.sb.exception.NoSuchCategoriaException {

		return getPersistence().findByUuid_C_PrevAndNext(
			categoriaId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the categorias where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of categorias where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching categorias
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the categorias where nombreCategoria = &#63;.
	 *
	 * @param nombreCategoria the nombre categoria
	 * @return the matching categorias
	 */
	public static List<Categoria> findByNombreCategoria(
		String nombreCategoria) {

		return getPersistence().findByNombreCategoria(nombreCategoria);
	}

	/**
	 * Returns a range of all the categorias where nombreCategoria = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CategoriaModelImpl</code>.
	 * </p>
	 *
	 * @param nombreCategoria the nombre categoria
	 * @param start the lower bound of the range of categorias
	 * @param end the upper bound of the range of categorias (not inclusive)
	 * @return the range of matching categorias
	 */
	public static List<Categoria> findByNombreCategoria(
		String nombreCategoria, int start, int end) {

		return getPersistence().findByNombreCategoria(
			nombreCategoria, start, end);
	}

	/**
	 * Returns an ordered range of all the categorias where nombreCategoria = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CategoriaModelImpl</code>.
	 * </p>
	 *
	 * @param nombreCategoria the nombre categoria
	 * @param start the lower bound of the range of categorias
	 * @param end the upper bound of the range of categorias (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching categorias
	 */
	public static List<Categoria> findByNombreCategoria(
		String nombreCategoria, int start, int end,
		OrderByComparator<Categoria> orderByComparator) {

		return getPersistence().findByNombreCategoria(
			nombreCategoria, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the categorias where nombreCategoria = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CategoriaModelImpl</code>.
	 * </p>
	 *
	 * @param nombreCategoria the nombre categoria
	 * @param start the lower bound of the range of categorias
	 * @param end the upper bound of the range of categorias (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching categorias
	 */
	public static List<Categoria> findByNombreCategoria(
		String nombreCategoria, int start, int end,
		OrderByComparator<Categoria> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByNombreCategoria(
			nombreCategoria, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first categoria in the ordered set where nombreCategoria = &#63;.
	 *
	 * @param nombreCategoria the nombre categoria
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching categoria
	 * @throws NoSuchCategoriaException if a matching categoria could not be found
	 */
	public static Categoria findByNombreCategoria_First(
			String nombreCategoria,
			OrderByComparator<Categoria> orderByComparator)
		throws com.savvy.sb.exception.NoSuchCategoriaException {

		return getPersistence().findByNombreCategoria_First(
			nombreCategoria, orderByComparator);
	}

	/**
	 * Returns the first categoria in the ordered set where nombreCategoria = &#63;.
	 *
	 * @param nombreCategoria the nombre categoria
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching categoria, or <code>null</code> if a matching categoria could not be found
	 */
	public static Categoria fetchByNombreCategoria_First(
		String nombreCategoria,
		OrderByComparator<Categoria> orderByComparator) {

		return getPersistence().fetchByNombreCategoria_First(
			nombreCategoria, orderByComparator);
	}

	/**
	 * Returns the last categoria in the ordered set where nombreCategoria = &#63;.
	 *
	 * @param nombreCategoria the nombre categoria
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching categoria
	 * @throws NoSuchCategoriaException if a matching categoria could not be found
	 */
	public static Categoria findByNombreCategoria_Last(
			String nombreCategoria,
			OrderByComparator<Categoria> orderByComparator)
		throws com.savvy.sb.exception.NoSuchCategoriaException {

		return getPersistence().findByNombreCategoria_Last(
			nombreCategoria, orderByComparator);
	}

	/**
	 * Returns the last categoria in the ordered set where nombreCategoria = &#63;.
	 *
	 * @param nombreCategoria the nombre categoria
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching categoria, or <code>null</code> if a matching categoria could not be found
	 */
	public static Categoria fetchByNombreCategoria_Last(
		String nombreCategoria,
		OrderByComparator<Categoria> orderByComparator) {

		return getPersistence().fetchByNombreCategoria_Last(
			nombreCategoria, orderByComparator);
	}

	/**
	 * Returns the categorias before and after the current categoria in the ordered set where nombreCategoria = &#63;.
	 *
	 * @param categoriaId the primary key of the current categoria
	 * @param nombreCategoria the nombre categoria
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next categoria
	 * @throws NoSuchCategoriaException if a categoria with the primary key could not be found
	 */
	public static Categoria[] findByNombreCategoria_PrevAndNext(
			long categoriaId, String nombreCategoria,
			OrderByComparator<Categoria> orderByComparator)
		throws com.savvy.sb.exception.NoSuchCategoriaException {

		return getPersistence().findByNombreCategoria_PrevAndNext(
			categoriaId, nombreCategoria, orderByComparator);
	}

	/**
	 * Removes all the categorias where nombreCategoria = &#63; from the database.
	 *
	 * @param nombreCategoria the nombre categoria
	 */
	public static void removeByNombreCategoria(String nombreCategoria) {
		getPersistence().removeByNombreCategoria(nombreCategoria);
	}

	/**
	 * Returns the number of categorias where nombreCategoria = &#63;.
	 *
	 * @param nombreCategoria the nombre categoria
	 * @return the number of matching categorias
	 */
	public static int countByNombreCategoria(String nombreCategoria) {
		return getPersistence().countByNombreCategoria(nombreCategoria);
	}

	/**
	 * Caches the categoria in the entity cache if it is enabled.
	 *
	 * @param categoria the categoria
	 */
	public static void cacheResult(Categoria categoria) {
		getPersistence().cacheResult(categoria);
	}

	/**
	 * Caches the categorias in the entity cache if it is enabled.
	 *
	 * @param categorias the categorias
	 */
	public static void cacheResult(List<Categoria> categorias) {
		getPersistence().cacheResult(categorias);
	}

	/**
	 * Creates a new categoria with the primary key. Does not add the categoria to the database.
	 *
	 * @param categoriaId the primary key for the new categoria
	 * @return the new categoria
	 */
	public static Categoria create(long categoriaId) {
		return getPersistence().create(categoriaId);
	}

	/**
	 * Removes the categoria with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param categoriaId the primary key of the categoria
	 * @return the categoria that was removed
	 * @throws NoSuchCategoriaException if a categoria with the primary key could not be found
	 */
	public static Categoria remove(long categoriaId)
		throws com.savvy.sb.exception.NoSuchCategoriaException {

		return getPersistence().remove(categoriaId);
	}

	public static Categoria updateImpl(Categoria categoria) {
		return getPersistence().updateImpl(categoria);
	}

	/**
	 * Returns the categoria with the primary key or throws a <code>NoSuchCategoriaException</code> if it could not be found.
	 *
	 * @param categoriaId the primary key of the categoria
	 * @return the categoria
	 * @throws NoSuchCategoriaException if a categoria with the primary key could not be found
	 */
	public static Categoria findByPrimaryKey(long categoriaId)
		throws com.savvy.sb.exception.NoSuchCategoriaException {

		return getPersistence().findByPrimaryKey(categoriaId);
	}

	/**
	 * Returns the categoria with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param categoriaId the primary key of the categoria
	 * @return the categoria, or <code>null</code> if a categoria with the primary key could not be found
	 */
	public static Categoria fetchByPrimaryKey(long categoriaId) {
		return getPersistence().fetchByPrimaryKey(categoriaId);
	}

	/**
	 * Returns all the categorias.
	 *
	 * @return the categorias
	 */
	public static List<Categoria> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the categorias.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CategoriaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of categorias
	 * @param end the upper bound of the range of categorias (not inclusive)
	 * @return the range of categorias
	 */
	public static List<Categoria> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the categorias.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CategoriaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of categorias
	 * @param end the upper bound of the range of categorias (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of categorias
	 */
	public static List<Categoria> findAll(
		int start, int end, OrderByComparator<Categoria> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the categorias.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CategoriaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of categorias
	 * @param end the upper bound of the range of categorias (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of categorias
	 */
	public static List<Categoria> findAll(
		int start, int end, OrderByComparator<Categoria> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the categorias from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of categorias.
	 *
	 * @return the number of categorias
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CategoriaPersistence getPersistence() {
		return _persistence;
	}

	private static volatile CategoriaPersistence _persistence;

}
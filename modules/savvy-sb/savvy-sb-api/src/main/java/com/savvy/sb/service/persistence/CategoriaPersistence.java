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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.savvy.sb.exception.NoSuchCategoriaException;
import com.savvy.sb.model.Categoria;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the categoria service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CategoriaUtil
 * @generated
 */
@ProviderType
public interface CategoriaPersistence extends BasePersistence<Categoria> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CategoriaUtil} to access the categoria persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the categorias where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching categorias
	 */
	public java.util.List<Categoria> findByUuid(String uuid);

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
	public java.util.List<Categoria> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<Categoria> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Categoria>
			orderByComparator);

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
	public java.util.List<Categoria> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Categoria>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first categoria in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching categoria
	 * @throws NoSuchCategoriaException if a matching categoria could not be found
	 */
	public Categoria findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Categoria>
				orderByComparator)
		throws NoSuchCategoriaException;

	/**
	 * Returns the first categoria in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching categoria, or <code>null</code> if a matching categoria could not be found
	 */
	public Categoria fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Categoria>
			orderByComparator);

	/**
	 * Returns the last categoria in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching categoria
	 * @throws NoSuchCategoriaException if a matching categoria could not be found
	 */
	public Categoria findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Categoria>
				orderByComparator)
		throws NoSuchCategoriaException;

	/**
	 * Returns the last categoria in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching categoria, or <code>null</code> if a matching categoria could not be found
	 */
	public Categoria fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Categoria>
			orderByComparator);

	/**
	 * Returns the categorias before and after the current categoria in the ordered set where uuid = &#63;.
	 *
	 * @param categoriaId the primary key of the current categoria
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next categoria
	 * @throws NoSuchCategoriaException if a categoria with the primary key could not be found
	 */
	public Categoria[] findByUuid_PrevAndNext(
			long categoriaId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Categoria>
				orderByComparator)
		throws NoSuchCategoriaException;

	/**
	 * Removes all the categorias where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of categorias where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching categorias
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the categoria where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCategoriaException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching categoria
	 * @throws NoSuchCategoriaException if a matching categoria could not be found
	 */
	public Categoria findByUUID_G(String uuid, long groupId)
		throws NoSuchCategoriaException;

	/**
	 * Returns the categoria where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching categoria, or <code>null</code> if a matching categoria could not be found
	 */
	public Categoria fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the categoria where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching categoria, or <code>null</code> if a matching categoria could not be found
	 */
	public Categoria fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the categoria where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the categoria that was removed
	 */
	public Categoria removeByUUID_G(String uuid, long groupId)
		throws NoSuchCategoriaException;

	/**
	 * Returns the number of categorias where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching categorias
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the categorias where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching categorias
	 */
	public java.util.List<Categoria> findByUuid_C(String uuid, long companyId);

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
	public java.util.List<Categoria> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<Categoria> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Categoria>
			orderByComparator);

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
	public java.util.List<Categoria> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Categoria>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first categoria in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching categoria
	 * @throws NoSuchCategoriaException if a matching categoria could not be found
	 */
	public Categoria findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Categoria>
				orderByComparator)
		throws NoSuchCategoriaException;

	/**
	 * Returns the first categoria in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching categoria, or <code>null</code> if a matching categoria could not be found
	 */
	public Categoria fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Categoria>
			orderByComparator);

	/**
	 * Returns the last categoria in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching categoria
	 * @throws NoSuchCategoriaException if a matching categoria could not be found
	 */
	public Categoria findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Categoria>
				orderByComparator)
		throws NoSuchCategoriaException;

	/**
	 * Returns the last categoria in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching categoria, or <code>null</code> if a matching categoria could not be found
	 */
	public Categoria fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Categoria>
			orderByComparator);

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
	public Categoria[] findByUuid_C_PrevAndNext(
			long categoriaId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Categoria>
				orderByComparator)
		throws NoSuchCategoriaException;

	/**
	 * Removes all the categorias where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of categorias where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching categorias
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the categorias where nombreCategoria = &#63;.
	 *
	 * @param nombreCategoria the nombre categoria
	 * @return the matching categorias
	 */
	public java.util.List<Categoria> findByNombreCategoria(
		String nombreCategoria);

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
	public java.util.List<Categoria> findByNombreCategoria(
		String nombreCategoria, int start, int end);

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
	public java.util.List<Categoria> findByNombreCategoria(
		String nombreCategoria, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Categoria>
			orderByComparator);

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
	public java.util.List<Categoria> findByNombreCategoria(
		String nombreCategoria, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Categoria>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first categoria in the ordered set where nombreCategoria = &#63;.
	 *
	 * @param nombreCategoria the nombre categoria
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching categoria
	 * @throws NoSuchCategoriaException if a matching categoria could not be found
	 */
	public Categoria findByNombreCategoria_First(
			String nombreCategoria,
			com.liferay.portal.kernel.util.OrderByComparator<Categoria>
				orderByComparator)
		throws NoSuchCategoriaException;

	/**
	 * Returns the first categoria in the ordered set where nombreCategoria = &#63;.
	 *
	 * @param nombreCategoria the nombre categoria
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching categoria, or <code>null</code> if a matching categoria could not be found
	 */
	public Categoria fetchByNombreCategoria_First(
		String nombreCategoria,
		com.liferay.portal.kernel.util.OrderByComparator<Categoria>
			orderByComparator);

	/**
	 * Returns the last categoria in the ordered set where nombreCategoria = &#63;.
	 *
	 * @param nombreCategoria the nombre categoria
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching categoria
	 * @throws NoSuchCategoriaException if a matching categoria could not be found
	 */
	public Categoria findByNombreCategoria_Last(
			String nombreCategoria,
			com.liferay.portal.kernel.util.OrderByComparator<Categoria>
				orderByComparator)
		throws NoSuchCategoriaException;

	/**
	 * Returns the last categoria in the ordered set where nombreCategoria = &#63;.
	 *
	 * @param nombreCategoria the nombre categoria
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching categoria, or <code>null</code> if a matching categoria could not be found
	 */
	public Categoria fetchByNombreCategoria_Last(
		String nombreCategoria,
		com.liferay.portal.kernel.util.OrderByComparator<Categoria>
			orderByComparator);

	/**
	 * Returns the categorias before and after the current categoria in the ordered set where nombreCategoria = &#63;.
	 *
	 * @param categoriaId the primary key of the current categoria
	 * @param nombreCategoria the nombre categoria
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next categoria
	 * @throws NoSuchCategoriaException if a categoria with the primary key could not be found
	 */
	public Categoria[] findByNombreCategoria_PrevAndNext(
			long categoriaId, String nombreCategoria,
			com.liferay.portal.kernel.util.OrderByComparator<Categoria>
				orderByComparator)
		throws NoSuchCategoriaException;

	/**
	 * Removes all the categorias where nombreCategoria = &#63; from the database.
	 *
	 * @param nombreCategoria the nombre categoria
	 */
	public void removeByNombreCategoria(String nombreCategoria);

	/**
	 * Returns the number of categorias where nombreCategoria = &#63;.
	 *
	 * @param nombreCategoria the nombre categoria
	 * @return the number of matching categorias
	 */
	public int countByNombreCategoria(String nombreCategoria);

	/**
	 * Caches the categoria in the entity cache if it is enabled.
	 *
	 * @param categoria the categoria
	 */
	public void cacheResult(Categoria categoria);

	/**
	 * Caches the categorias in the entity cache if it is enabled.
	 *
	 * @param categorias the categorias
	 */
	public void cacheResult(java.util.List<Categoria> categorias);

	/**
	 * Creates a new categoria with the primary key. Does not add the categoria to the database.
	 *
	 * @param categoriaId the primary key for the new categoria
	 * @return the new categoria
	 */
	public Categoria create(long categoriaId);

	/**
	 * Removes the categoria with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param categoriaId the primary key of the categoria
	 * @return the categoria that was removed
	 * @throws NoSuchCategoriaException if a categoria with the primary key could not be found
	 */
	public Categoria remove(long categoriaId) throws NoSuchCategoriaException;

	public Categoria updateImpl(Categoria categoria);

	/**
	 * Returns the categoria with the primary key or throws a <code>NoSuchCategoriaException</code> if it could not be found.
	 *
	 * @param categoriaId the primary key of the categoria
	 * @return the categoria
	 * @throws NoSuchCategoriaException if a categoria with the primary key could not be found
	 */
	public Categoria findByPrimaryKey(long categoriaId)
		throws NoSuchCategoriaException;

	/**
	 * Returns the categoria with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param categoriaId the primary key of the categoria
	 * @return the categoria, or <code>null</code> if a categoria with the primary key could not be found
	 */
	public Categoria fetchByPrimaryKey(long categoriaId);

	/**
	 * Returns all the categorias.
	 *
	 * @return the categorias
	 */
	public java.util.List<Categoria> findAll();

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
	public java.util.List<Categoria> findAll(int start, int end);

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
	public java.util.List<Categoria> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Categoria>
			orderByComparator);

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
	public java.util.List<Categoria> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Categoria>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the categorias from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of categorias.
	 *
	 * @return the number of categorias
	 */
	public int countAll();

}
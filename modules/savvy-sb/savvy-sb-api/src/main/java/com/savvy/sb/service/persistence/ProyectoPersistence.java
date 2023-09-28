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

import com.savvy.sb.exception.NoSuchProyectoException;
import com.savvy.sb.model.Proyecto;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the proyecto service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProyectoUtil
 * @generated
 */
@ProviderType
public interface ProyectoPersistence extends BasePersistence<Proyecto> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ProyectoUtil} to access the proyecto persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the proyectos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching proyectos
	 */
	public java.util.List<Proyecto> findByUuid(String uuid);

	/**
	 * Returns a range of all the proyectos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProyectoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of proyectos
	 * @param end the upper bound of the range of proyectos (not inclusive)
	 * @return the range of matching proyectos
	 */
	public java.util.List<Proyecto> findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the proyectos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProyectoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of proyectos
	 * @param end the upper bound of the range of proyectos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching proyectos
	 */
	public java.util.List<Proyecto> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Proyecto>
			orderByComparator);

	/**
	 * Returns an ordered range of all the proyectos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProyectoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of proyectos
	 * @param end the upper bound of the range of proyectos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching proyectos
	 */
	public java.util.List<Proyecto> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Proyecto>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first proyecto in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching proyecto
	 * @throws NoSuchProyectoException if a matching proyecto could not be found
	 */
	public Proyecto findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Proyecto>
				orderByComparator)
		throws NoSuchProyectoException;

	/**
	 * Returns the first proyecto in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching proyecto, or <code>null</code> if a matching proyecto could not be found
	 */
	public Proyecto fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Proyecto>
			orderByComparator);

	/**
	 * Returns the last proyecto in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching proyecto
	 * @throws NoSuchProyectoException if a matching proyecto could not be found
	 */
	public Proyecto findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Proyecto>
				orderByComparator)
		throws NoSuchProyectoException;

	/**
	 * Returns the last proyecto in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching proyecto, or <code>null</code> if a matching proyecto could not be found
	 */
	public Proyecto fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Proyecto>
			orderByComparator);

	/**
	 * Returns the proyectos before and after the current proyecto in the ordered set where uuid = &#63;.
	 *
	 * @param proyectoId the primary key of the current proyecto
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next proyecto
	 * @throws NoSuchProyectoException if a proyecto with the primary key could not be found
	 */
	public Proyecto[] findByUuid_PrevAndNext(
			long proyectoId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Proyecto>
				orderByComparator)
		throws NoSuchProyectoException;

	/**
	 * Removes all the proyectos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of proyectos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching proyectos
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the proyecto where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchProyectoException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching proyecto
	 * @throws NoSuchProyectoException if a matching proyecto could not be found
	 */
	public Proyecto findByUUID_G(String uuid, long groupId)
		throws NoSuchProyectoException;

	/**
	 * Returns the proyecto where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching proyecto, or <code>null</code> if a matching proyecto could not be found
	 */
	public Proyecto fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the proyecto where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching proyecto, or <code>null</code> if a matching proyecto could not be found
	 */
	public Proyecto fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the proyecto where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the proyecto that was removed
	 */
	public Proyecto removeByUUID_G(String uuid, long groupId)
		throws NoSuchProyectoException;

	/**
	 * Returns the number of proyectos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching proyectos
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the proyectos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching proyectos
	 */
	public java.util.List<Proyecto> findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the proyectos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProyectoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of proyectos
	 * @param end the upper bound of the range of proyectos (not inclusive)
	 * @return the range of matching proyectos
	 */
	public java.util.List<Proyecto> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the proyectos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProyectoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of proyectos
	 * @param end the upper bound of the range of proyectos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching proyectos
	 */
	public java.util.List<Proyecto> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Proyecto>
			orderByComparator);

	/**
	 * Returns an ordered range of all the proyectos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProyectoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of proyectos
	 * @param end the upper bound of the range of proyectos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching proyectos
	 */
	public java.util.List<Proyecto> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Proyecto>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first proyecto in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching proyecto
	 * @throws NoSuchProyectoException if a matching proyecto could not be found
	 */
	public Proyecto findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Proyecto>
				orderByComparator)
		throws NoSuchProyectoException;

	/**
	 * Returns the first proyecto in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching proyecto, or <code>null</code> if a matching proyecto could not be found
	 */
	public Proyecto fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Proyecto>
			orderByComparator);

	/**
	 * Returns the last proyecto in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching proyecto
	 * @throws NoSuchProyectoException if a matching proyecto could not be found
	 */
	public Proyecto findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Proyecto>
				orderByComparator)
		throws NoSuchProyectoException;

	/**
	 * Returns the last proyecto in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching proyecto, or <code>null</code> if a matching proyecto could not be found
	 */
	public Proyecto fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Proyecto>
			orderByComparator);

	/**
	 * Returns the proyectos before and after the current proyecto in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param proyectoId the primary key of the current proyecto
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next proyecto
	 * @throws NoSuchProyectoException if a proyecto with the primary key could not be found
	 */
	public Proyecto[] findByUuid_C_PrevAndNext(
			long proyectoId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Proyecto>
				orderByComparator)
		throws NoSuchProyectoException;

	/**
	 * Removes all the proyectos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of proyectos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching proyectos
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the proyectos where tituloProyecto = &#63;.
	 *
	 * @param tituloProyecto the titulo proyecto
	 * @return the matching proyectos
	 */
	public java.util.List<Proyecto> findByTituloProyecto(String tituloProyecto);

	/**
	 * Returns a range of all the proyectos where tituloProyecto = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProyectoModelImpl</code>.
	 * </p>
	 *
	 * @param tituloProyecto the titulo proyecto
	 * @param start the lower bound of the range of proyectos
	 * @param end the upper bound of the range of proyectos (not inclusive)
	 * @return the range of matching proyectos
	 */
	public java.util.List<Proyecto> findByTituloProyecto(
		String tituloProyecto, int start, int end);

	/**
	 * Returns an ordered range of all the proyectos where tituloProyecto = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProyectoModelImpl</code>.
	 * </p>
	 *
	 * @param tituloProyecto the titulo proyecto
	 * @param start the lower bound of the range of proyectos
	 * @param end the upper bound of the range of proyectos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching proyectos
	 */
	public java.util.List<Proyecto> findByTituloProyecto(
		String tituloProyecto, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Proyecto>
			orderByComparator);

	/**
	 * Returns an ordered range of all the proyectos where tituloProyecto = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProyectoModelImpl</code>.
	 * </p>
	 *
	 * @param tituloProyecto the titulo proyecto
	 * @param start the lower bound of the range of proyectos
	 * @param end the upper bound of the range of proyectos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching proyectos
	 */
	public java.util.List<Proyecto> findByTituloProyecto(
		String tituloProyecto, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Proyecto>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first proyecto in the ordered set where tituloProyecto = &#63;.
	 *
	 * @param tituloProyecto the titulo proyecto
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching proyecto
	 * @throws NoSuchProyectoException if a matching proyecto could not be found
	 */
	public Proyecto findByTituloProyecto_First(
			String tituloProyecto,
			com.liferay.portal.kernel.util.OrderByComparator<Proyecto>
				orderByComparator)
		throws NoSuchProyectoException;

	/**
	 * Returns the first proyecto in the ordered set where tituloProyecto = &#63;.
	 *
	 * @param tituloProyecto the titulo proyecto
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching proyecto, or <code>null</code> if a matching proyecto could not be found
	 */
	public Proyecto fetchByTituloProyecto_First(
		String tituloProyecto,
		com.liferay.portal.kernel.util.OrderByComparator<Proyecto>
			orderByComparator);

	/**
	 * Returns the last proyecto in the ordered set where tituloProyecto = &#63;.
	 *
	 * @param tituloProyecto the titulo proyecto
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching proyecto
	 * @throws NoSuchProyectoException if a matching proyecto could not be found
	 */
	public Proyecto findByTituloProyecto_Last(
			String tituloProyecto,
			com.liferay.portal.kernel.util.OrderByComparator<Proyecto>
				orderByComparator)
		throws NoSuchProyectoException;

	/**
	 * Returns the last proyecto in the ordered set where tituloProyecto = &#63;.
	 *
	 * @param tituloProyecto the titulo proyecto
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching proyecto, or <code>null</code> if a matching proyecto could not be found
	 */
	public Proyecto fetchByTituloProyecto_Last(
		String tituloProyecto,
		com.liferay.portal.kernel.util.OrderByComparator<Proyecto>
			orderByComparator);

	/**
	 * Returns the proyectos before and after the current proyecto in the ordered set where tituloProyecto = &#63;.
	 *
	 * @param proyectoId the primary key of the current proyecto
	 * @param tituloProyecto the titulo proyecto
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next proyecto
	 * @throws NoSuchProyectoException if a proyecto with the primary key could not be found
	 */
	public Proyecto[] findByTituloProyecto_PrevAndNext(
			long proyectoId, String tituloProyecto,
			com.liferay.portal.kernel.util.OrderByComparator<Proyecto>
				orderByComparator)
		throws NoSuchProyectoException;

	/**
	 * Removes all the proyectos where tituloProyecto = &#63; from the database.
	 *
	 * @param tituloProyecto the titulo proyecto
	 */
	public void removeByTituloProyecto(String tituloProyecto);

	/**
	 * Returns the number of proyectos where tituloProyecto = &#63;.
	 *
	 * @param tituloProyecto the titulo proyecto
	 * @return the number of matching proyectos
	 */
	public int countByTituloProyecto(String tituloProyecto);

	/**
	 * Caches the proyecto in the entity cache if it is enabled.
	 *
	 * @param proyecto the proyecto
	 */
	public void cacheResult(Proyecto proyecto);

	/**
	 * Caches the proyectos in the entity cache if it is enabled.
	 *
	 * @param proyectos the proyectos
	 */
	public void cacheResult(java.util.List<Proyecto> proyectos);

	/**
	 * Creates a new proyecto with the primary key. Does not add the proyecto to the database.
	 *
	 * @param proyectoId the primary key for the new proyecto
	 * @return the new proyecto
	 */
	public Proyecto create(long proyectoId);

	/**
	 * Removes the proyecto with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param proyectoId the primary key of the proyecto
	 * @return the proyecto that was removed
	 * @throws NoSuchProyectoException if a proyecto with the primary key could not be found
	 */
	public Proyecto remove(long proyectoId) throws NoSuchProyectoException;

	public Proyecto updateImpl(Proyecto proyecto);

	/**
	 * Returns the proyecto with the primary key or throws a <code>NoSuchProyectoException</code> if it could not be found.
	 *
	 * @param proyectoId the primary key of the proyecto
	 * @return the proyecto
	 * @throws NoSuchProyectoException if a proyecto with the primary key could not be found
	 */
	public Proyecto findByPrimaryKey(long proyectoId)
		throws NoSuchProyectoException;

	/**
	 * Returns the proyecto with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param proyectoId the primary key of the proyecto
	 * @return the proyecto, or <code>null</code> if a proyecto with the primary key could not be found
	 */
	public Proyecto fetchByPrimaryKey(long proyectoId);

	/**
	 * Returns all the proyectos.
	 *
	 * @return the proyectos
	 */
	public java.util.List<Proyecto> findAll();

	/**
	 * Returns a range of all the proyectos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProyectoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of proyectos
	 * @param end the upper bound of the range of proyectos (not inclusive)
	 * @return the range of proyectos
	 */
	public java.util.List<Proyecto> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the proyectos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProyectoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of proyectos
	 * @param end the upper bound of the range of proyectos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of proyectos
	 */
	public java.util.List<Proyecto> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Proyecto>
			orderByComparator);

	/**
	 * Returns an ordered range of all the proyectos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProyectoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of proyectos
	 * @param end the upper bound of the range of proyectos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of proyectos
	 */
	public java.util.List<Proyecto> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Proyecto>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the proyectos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of proyectos.
	 *
	 * @return the number of proyectos
	 */
	public int countAll();

}
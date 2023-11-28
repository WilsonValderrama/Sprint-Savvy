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

import com.savvy.sb.exception.NoSuchEtiquetaException;
import com.savvy.sb.model.Etiqueta;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the etiqueta service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EtiquetaUtil
 * @generated
 */
@ProviderType
public interface EtiquetaPersistence extends BasePersistence<Etiqueta> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EtiquetaUtil} to access the etiqueta persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the etiquetas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching etiquetas
	 */
	public java.util.List<Etiqueta> findByUuid(String uuid);

	/**
	 * Returns a range of all the etiquetas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EtiquetaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of etiquetas
	 * @param end the upper bound of the range of etiquetas (not inclusive)
	 * @return the range of matching etiquetas
	 */
	public java.util.List<Etiqueta> findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the etiquetas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EtiquetaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of etiquetas
	 * @param end the upper bound of the range of etiquetas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching etiquetas
	 */
	public java.util.List<Etiqueta> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Etiqueta>
			orderByComparator);

	/**
	 * Returns an ordered range of all the etiquetas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EtiquetaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of etiquetas
	 * @param end the upper bound of the range of etiquetas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching etiquetas
	 */
	public java.util.List<Etiqueta> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Etiqueta>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first etiqueta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching etiqueta
	 * @throws NoSuchEtiquetaException if a matching etiqueta could not be found
	 */
	public Etiqueta findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Etiqueta>
				orderByComparator)
		throws NoSuchEtiquetaException;

	/**
	 * Returns the first etiqueta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching etiqueta, or <code>null</code> if a matching etiqueta could not be found
	 */
	public Etiqueta fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Etiqueta>
			orderByComparator);

	/**
	 * Returns the last etiqueta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching etiqueta
	 * @throws NoSuchEtiquetaException if a matching etiqueta could not be found
	 */
	public Etiqueta findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Etiqueta>
				orderByComparator)
		throws NoSuchEtiquetaException;

	/**
	 * Returns the last etiqueta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching etiqueta, or <code>null</code> if a matching etiqueta could not be found
	 */
	public Etiqueta fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Etiqueta>
			orderByComparator);

	/**
	 * Returns the etiquetas before and after the current etiqueta in the ordered set where uuid = &#63;.
	 *
	 * @param etiquetaId the primary key of the current etiqueta
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next etiqueta
	 * @throws NoSuchEtiquetaException if a etiqueta with the primary key could not be found
	 */
	public Etiqueta[] findByUuid_PrevAndNext(
			long etiquetaId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Etiqueta>
				orderByComparator)
		throws NoSuchEtiquetaException;

	/**
	 * Removes all the etiquetas where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of etiquetas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching etiquetas
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the etiqueta where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchEtiquetaException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching etiqueta
	 * @throws NoSuchEtiquetaException if a matching etiqueta could not be found
	 */
	public Etiqueta findByUUID_G(String uuid, long groupId)
		throws NoSuchEtiquetaException;

	/**
	 * Returns the etiqueta where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching etiqueta, or <code>null</code> if a matching etiqueta could not be found
	 */
	public Etiqueta fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the etiqueta where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching etiqueta, or <code>null</code> if a matching etiqueta could not be found
	 */
	public Etiqueta fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the etiqueta where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the etiqueta that was removed
	 */
	public Etiqueta removeByUUID_G(String uuid, long groupId)
		throws NoSuchEtiquetaException;

	/**
	 * Returns the number of etiquetas where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching etiquetas
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the etiquetas where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching etiquetas
	 */
	public java.util.List<Etiqueta> findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the etiquetas where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EtiquetaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of etiquetas
	 * @param end the upper bound of the range of etiquetas (not inclusive)
	 * @return the range of matching etiquetas
	 */
	public java.util.List<Etiqueta> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the etiquetas where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EtiquetaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of etiquetas
	 * @param end the upper bound of the range of etiquetas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching etiquetas
	 */
	public java.util.List<Etiqueta> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Etiqueta>
			orderByComparator);

	/**
	 * Returns an ordered range of all the etiquetas where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EtiquetaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of etiquetas
	 * @param end the upper bound of the range of etiquetas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching etiquetas
	 */
	public java.util.List<Etiqueta> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Etiqueta>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first etiqueta in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching etiqueta
	 * @throws NoSuchEtiquetaException if a matching etiqueta could not be found
	 */
	public Etiqueta findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Etiqueta>
				orderByComparator)
		throws NoSuchEtiquetaException;

	/**
	 * Returns the first etiqueta in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching etiqueta, or <code>null</code> if a matching etiqueta could not be found
	 */
	public Etiqueta fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Etiqueta>
			orderByComparator);

	/**
	 * Returns the last etiqueta in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching etiqueta
	 * @throws NoSuchEtiquetaException if a matching etiqueta could not be found
	 */
	public Etiqueta findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Etiqueta>
				orderByComparator)
		throws NoSuchEtiquetaException;

	/**
	 * Returns the last etiqueta in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching etiqueta, or <code>null</code> if a matching etiqueta could not be found
	 */
	public Etiqueta fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Etiqueta>
			orderByComparator);

	/**
	 * Returns the etiquetas before and after the current etiqueta in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param etiquetaId the primary key of the current etiqueta
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next etiqueta
	 * @throws NoSuchEtiquetaException if a etiqueta with the primary key could not be found
	 */
	public Etiqueta[] findByUuid_C_PrevAndNext(
			long etiquetaId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Etiqueta>
				orderByComparator)
		throws NoSuchEtiquetaException;

	/**
	 * Removes all the etiquetas where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of etiquetas where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching etiquetas
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the etiquetas where tituloEtiqueta = &#63;.
	 *
	 * @param tituloEtiqueta the titulo etiqueta
	 * @return the matching etiquetas
	 */
	public java.util.List<Etiqueta> findByTituloEtiqueta(String tituloEtiqueta);

	/**
	 * Returns a range of all the etiquetas where tituloEtiqueta = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EtiquetaModelImpl</code>.
	 * </p>
	 *
	 * @param tituloEtiqueta the titulo etiqueta
	 * @param start the lower bound of the range of etiquetas
	 * @param end the upper bound of the range of etiquetas (not inclusive)
	 * @return the range of matching etiquetas
	 */
	public java.util.List<Etiqueta> findByTituloEtiqueta(
		String tituloEtiqueta, int start, int end);

	/**
	 * Returns an ordered range of all the etiquetas where tituloEtiqueta = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EtiquetaModelImpl</code>.
	 * </p>
	 *
	 * @param tituloEtiqueta the titulo etiqueta
	 * @param start the lower bound of the range of etiquetas
	 * @param end the upper bound of the range of etiquetas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching etiquetas
	 */
	public java.util.List<Etiqueta> findByTituloEtiqueta(
		String tituloEtiqueta, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Etiqueta>
			orderByComparator);

	/**
	 * Returns an ordered range of all the etiquetas where tituloEtiqueta = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EtiquetaModelImpl</code>.
	 * </p>
	 *
	 * @param tituloEtiqueta the titulo etiqueta
	 * @param start the lower bound of the range of etiquetas
	 * @param end the upper bound of the range of etiquetas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching etiquetas
	 */
	public java.util.List<Etiqueta> findByTituloEtiqueta(
		String tituloEtiqueta, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Etiqueta>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first etiqueta in the ordered set where tituloEtiqueta = &#63;.
	 *
	 * @param tituloEtiqueta the titulo etiqueta
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching etiqueta
	 * @throws NoSuchEtiquetaException if a matching etiqueta could not be found
	 */
	public Etiqueta findByTituloEtiqueta_First(
			String tituloEtiqueta,
			com.liferay.portal.kernel.util.OrderByComparator<Etiqueta>
				orderByComparator)
		throws NoSuchEtiquetaException;

	/**
	 * Returns the first etiqueta in the ordered set where tituloEtiqueta = &#63;.
	 *
	 * @param tituloEtiqueta the titulo etiqueta
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching etiqueta, or <code>null</code> if a matching etiqueta could not be found
	 */
	public Etiqueta fetchByTituloEtiqueta_First(
		String tituloEtiqueta,
		com.liferay.portal.kernel.util.OrderByComparator<Etiqueta>
			orderByComparator);

	/**
	 * Returns the last etiqueta in the ordered set where tituloEtiqueta = &#63;.
	 *
	 * @param tituloEtiqueta the titulo etiqueta
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching etiqueta
	 * @throws NoSuchEtiquetaException if a matching etiqueta could not be found
	 */
	public Etiqueta findByTituloEtiqueta_Last(
			String tituloEtiqueta,
			com.liferay.portal.kernel.util.OrderByComparator<Etiqueta>
				orderByComparator)
		throws NoSuchEtiquetaException;

	/**
	 * Returns the last etiqueta in the ordered set where tituloEtiqueta = &#63;.
	 *
	 * @param tituloEtiqueta the titulo etiqueta
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching etiqueta, or <code>null</code> if a matching etiqueta could not be found
	 */
	public Etiqueta fetchByTituloEtiqueta_Last(
		String tituloEtiqueta,
		com.liferay.portal.kernel.util.OrderByComparator<Etiqueta>
			orderByComparator);

	/**
	 * Returns the etiquetas before and after the current etiqueta in the ordered set where tituloEtiqueta = &#63;.
	 *
	 * @param etiquetaId the primary key of the current etiqueta
	 * @param tituloEtiqueta the titulo etiqueta
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next etiqueta
	 * @throws NoSuchEtiquetaException if a etiqueta with the primary key could not be found
	 */
	public Etiqueta[] findByTituloEtiqueta_PrevAndNext(
			long etiquetaId, String tituloEtiqueta,
			com.liferay.portal.kernel.util.OrderByComparator<Etiqueta>
				orderByComparator)
		throws NoSuchEtiquetaException;

	/**
	 * Removes all the etiquetas where tituloEtiqueta = &#63; from the database.
	 *
	 * @param tituloEtiqueta the titulo etiqueta
	 */
	public void removeByTituloEtiqueta(String tituloEtiqueta);

	/**
	 * Returns the number of etiquetas where tituloEtiqueta = &#63;.
	 *
	 * @param tituloEtiqueta the titulo etiqueta
	 * @return the number of matching etiquetas
	 */
	public int countByTituloEtiqueta(String tituloEtiqueta);

	/**
	 * Caches the etiqueta in the entity cache if it is enabled.
	 *
	 * @param etiqueta the etiqueta
	 */
	public void cacheResult(Etiqueta etiqueta);

	/**
	 * Caches the etiquetas in the entity cache if it is enabled.
	 *
	 * @param etiquetas the etiquetas
	 */
	public void cacheResult(java.util.List<Etiqueta> etiquetas);

	/**
	 * Creates a new etiqueta with the primary key. Does not add the etiqueta to the database.
	 *
	 * @param etiquetaId the primary key for the new etiqueta
	 * @return the new etiqueta
	 */
	public Etiqueta create(long etiquetaId);

	/**
	 * Removes the etiqueta with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param etiquetaId the primary key of the etiqueta
	 * @return the etiqueta that was removed
	 * @throws NoSuchEtiquetaException if a etiqueta with the primary key could not be found
	 */
	public Etiqueta remove(long etiquetaId) throws NoSuchEtiquetaException;

	public Etiqueta updateImpl(Etiqueta etiqueta);

	/**
	 * Returns the etiqueta with the primary key or throws a <code>NoSuchEtiquetaException</code> if it could not be found.
	 *
	 * @param etiquetaId the primary key of the etiqueta
	 * @return the etiqueta
	 * @throws NoSuchEtiquetaException if a etiqueta with the primary key could not be found
	 */
	public Etiqueta findByPrimaryKey(long etiquetaId)
		throws NoSuchEtiquetaException;

	/**
	 * Returns the etiqueta with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param etiquetaId the primary key of the etiqueta
	 * @return the etiqueta, or <code>null</code> if a etiqueta with the primary key could not be found
	 */
	public Etiqueta fetchByPrimaryKey(long etiquetaId);

	/**
	 * Returns all the etiquetas.
	 *
	 * @return the etiquetas
	 */
	public java.util.List<Etiqueta> findAll();

	/**
	 * Returns a range of all the etiquetas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EtiquetaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of etiquetas
	 * @param end the upper bound of the range of etiquetas (not inclusive)
	 * @return the range of etiquetas
	 */
	public java.util.List<Etiqueta> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the etiquetas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EtiquetaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of etiquetas
	 * @param end the upper bound of the range of etiquetas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of etiquetas
	 */
	public java.util.List<Etiqueta> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Etiqueta>
			orderByComparator);

	/**
	 * Returns an ordered range of all the etiquetas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EtiquetaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of etiquetas
	 * @param end the upper bound of the range of etiquetas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of etiquetas
	 */
	public java.util.List<Etiqueta> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Etiqueta>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the etiquetas from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of etiquetas.
	 *
	 * @return the number of etiquetas
	 */
	public int countAll();

}
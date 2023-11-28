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

import com.savvy.sb.model.Etiqueta;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the etiqueta service. This utility wraps <code>com.savvy.sb.service.persistence.impl.EtiquetaPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EtiquetaPersistence
 * @generated
 */
public class EtiquetaUtil {

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
	public static void clearCache(Etiqueta etiqueta) {
		getPersistence().clearCache(etiqueta);
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
	public static Map<Serializable, Etiqueta> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Etiqueta> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Etiqueta> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Etiqueta> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Etiqueta> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Etiqueta update(Etiqueta etiqueta) {
		return getPersistence().update(etiqueta);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Etiqueta update(
		Etiqueta etiqueta, ServiceContext serviceContext) {

		return getPersistence().update(etiqueta, serviceContext);
	}

	/**
	 * Returns all the etiquetas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching etiquetas
	 */
	public static List<Etiqueta> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

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
	public static List<Etiqueta> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

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
	public static List<Etiqueta> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Etiqueta> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

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
	public static List<Etiqueta> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Etiqueta> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first etiqueta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching etiqueta
	 * @throws NoSuchEtiquetaException if a matching etiqueta could not be found
	 */
	public static Etiqueta findByUuid_First(
			String uuid, OrderByComparator<Etiqueta> orderByComparator)
		throws com.savvy.sb.exception.NoSuchEtiquetaException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first etiqueta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching etiqueta, or <code>null</code> if a matching etiqueta could not be found
	 */
	public static Etiqueta fetchByUuid_First(
		String uuid, OrderByComparator<Etiqueta> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last etiqueta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching etiqueta
	 * @throws NoSuchEtiquetaException if a matching etiqueta could not be found
	 */
	public static Etiqueta findByUuid_Last(
			String uuid, OrderByComparator<Etiqueta> orderByComparator)
		throws com.savvy.sb.exception.NoSuchEtiquetaException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last etiqueta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching etiqueta, or <code>null</code> if a matching etiqueta could not be found
	 */
	public static Etiqueta fetchByUuid_Last(
		String uuid, OrderByComparator<Etiqueta> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the etiquetas before and after the current etiqueta in the ordered set where uuid = &#63;.
	 *
	 * @param etiquetaId the primary key of the current etiqueta
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next etiqueta
	 * @throws NoSuchEtiquetaException if a etiqueta with the primary key could not be found
	 */
	public static Etiqueta[] findByUuid_PrevAndNext(
			long etiquetaId, String uuid,
			OrderByComparator<Etiqueta> orderByComparator)
		throws com.savvy.sb.exception.NoSuchEtiquetaException {

		return getPersistence().findByUuid_PrevAndNext(
			etiquetaId, uuid, orderByComparator);
	}

	/**
	 * Removes all the etiquetas where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of etiquetas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching etiquetas
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the etiqueta where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchEtiquetaException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching etiqueta
	 * @throws NoSuchEtiquetaException if a matching etiqueta could not be found
	 */
	public static Etiqueta findByUUID_G(String uuid, long groupId)
		throws com.savvy.sb.exception.NoSuchEtiquetaException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the etiqueta where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching etiqueta, or <code>null</code> if a matching etiqueta could not be found
	 */
	public static Etiqueta fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the etiqueta where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching etiqueta, or <code>null</code> if a matching etiqueta could not be found
	 */
	public static Etiqueta fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the etiqueta where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the etiqueta that was removed
	 */
	public static Etiqueta removeByUUID_G(String uuid, long groupId)
		throws com.savvy.sb.exception.NoSuchEtiquetaException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of etiquetas where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching etiquetas
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the etiquetas where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching etiquetas
	 */
	public static List<Etiqueta> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

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
	public static List<Etiqueta> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

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
	public static List<Etiqueta> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Etiqueta> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

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
	public static List<Etiqueta> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Etiqueta> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first etiqueta in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching etiqueta
	 * @throws NoSuchEtiquetaException if a matching etiqueta could not be found
	 */
	public static Etiqueta findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Etiqueta> orderByComparator)
		throws com.savvy.sb.exception.NoSuchEtiquetaException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first etiqueta in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching etiqueta, or <code>null</code> if a matching etiqueta could not be found
	 */
	public static Etiqueta fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Etiqueta> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last etiqueta in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching etiqueta
	 * @throws NoSuchEtiquetaException if a matching etiqueta could not be found
	 */
	public static Etiqueta findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Etiqueta> orderByComparator)
		throws com.savvy.sb.exception.NoSuchEtiquetaException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last etiqueta in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching etiqueta, or <code>null</code> if a matching etiqueta could not be found
	 */
	public static Etiqueta fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Etiqueta> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

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
	public static Etiqueta[] findByUuid_C_PrevAndNext(
			long etiquetaId, String uuid, long companyId,
			OrderByComparator<Etiqueta> orderByComparator)
		throws com.savvy.sb.exception.NoSuchEtiquetaException {

		return getPersistence().findByUuid_C_PrevAndNext(
			etiquetaId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the etiquetas where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of etiquetas where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching etiquetas
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the etiquetas where tituloEtiqueta = &#63;.
	 *
	 * @param tituloEtiqueta the titulo etiqueta
	 * @return the matching etiquetas
	 */
	public static List<Etiqueta> findByTituloEtiqueta(String tituloEtiqueta) {
		return getPersistence().findByTituloEtiqueta(tituloEtiqueta);
	}

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
	public static List<Etiqueta> findByTituloEtiqueta(
		String tituloEtiqueta, int start, int end) {

		return getPersistence().findByTituloEtiqueta(
			tituloEtiqueta, start, end);
	}

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
	public static List<Etiqueta> findByTituloEtiqueta(
		String tituloEtiqueta, int start, int end,
		OrderByComparator<Etiqueta> orderByComparator) {

		return getPersistence().findByTituloEtiqueta(
			tituloEtiqueta, start, end, orderByComparator);
	}

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
	public static List<Etiqueta> findByTituloEtiqueta(
		String tituloEtiqueta, int start, int end,
		OrderByComparator<Etiqueta> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByTituloEtiqueta(
			tituloEtiqueta, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first etiqueta in the ordered set where tituloEtiqueta = &#63;.
	 *
	 * @param tituloEtiqueta the titulo etiqueta
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching etiqueta
	 * @throws NoSuchEtiquetaException if a matching etiqueta could not be found
	 */
	public static Etiqueta findByTituloEtiqueta_First(
			String tituloEtiqueta,
			OrderByComparator<Etiqueta> orderByComparator)
		throws com.savvy.sb.exception.NoSuchEtiquetaException {

		return getPersistence().findByTituloEtiqueta_First(
			tituloEtiqueta, orderByComparator);
	}

	/**
	 * Returns the first etiqueta in the ordered set where tituloEtiqueta = &#63;.
	 *
	 * @param tituloEtiqueta the titulo etiqueta
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching etiqueta, or <code>null</code> if a matching etiqueta could not be found
	 */
	public static Etiqueta fetchByTituloEtiqueta_First(
		String tituloEtiqueta, OrderByComparator<Etiqueta> orderByComparator) {

		return getPersistence().fetchByTituloEtiqueta_First(
			tituloEtiqueta, orderByComparator);
	}

	/**
	 * Returns the last etiqueta in the ordered set where tituloEtiqueta = &#63;.
	 *
	 * @param tituloEtiqueta the titulo etiqueta
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching etiqueta
	 * @throws NoSuchEtiquetaException if a matching etiqueta could not be found
	 */
	public static Etiqueta findByTituloEtiqueta_Last(
			String tituloEtiqueta,
			OrderByComparator<Etiqueta> orderByComparator)
		throws com.savvy.sb.exception.NoSuchEtiquetaException {

		return getPersistence().findByTituloEtiqueta_Last(
			tituloEtiqueta, orderByComparator);
	}

	/**
	 * Returns the last etiqueta in the ordered set where tituloEtiqueta = &#63;.
	 *
	 * @param tituloEtiqueta the titulo etiqueta
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching etiqueta, or <code>null</code> if a matching etiqueta could not be found
	 */
	public static Etiqueta fetchByTituloEtiqueta_Last(
		String tituloEtiqueta, OrderByComparator<Etiqueta> orderByComparator) {

		return getPersistence().fetchByTituloEtiqueta_Last(
			tituloEtiqueta, orderByComparator);
	}

	/**
	 * Returns the etiquetas before and after the current etiqueta in the ordered set where tituloEtiqueta = &#63;.
	 *
	 * @param etiquetaId the primary key of the current etiqueta
	 * @param tituloEtiqueta the titulo etiqueta
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next etiqueta
	 * @throws NoSuchEtiquetaException if a etiqueta with the primary key could not be found
	 */
	public static Etiqueta[] findByTituloEtiqueta_PrevAndNext(
			long etiquetaId, String tituloEtiqueta,
			OrderByComparator<Etiqueta> orderByComparator)
		throws com.savvy.sb.exception.NoSuchEtiquetaException {

		return getPersistence().findByTituloEtiqueta_PrevAndNext(
			etiquetaId, tituloEtiqueta, orderByComparator);
	}

	/**
	 * Removes all the etiquetas where tituloEtiqueta = &#63; from the database.
	 *
	 * @param tituloEtiqueta the titulo etiqueta
	 */
	public static void removeByTituloEtiqueta(String tituloEtiqueta) {
		getPersistence().removeByTituloEtiqueta(tituloEtiqueta);
	}

	/**
	 * Returns the number of etiquetas where tituloEtiqueta = &#63;.
	 *
	 * @param tituloEtiqueta the titulo etiqueta
	 * @return the number of matching etiquetas
	 */
	public static int countByTituloEtiqueta(String tituloEtiqueta) {
		return getPersistence().countByTituloEtiqueta(tituloEtiqueta);
	}

	/**
	 * Caches the etiqueta in the entity cache if it is enabled.
	 *
	 * @param etiqueta the etiqueta
	 */
	public static void cacheResult(Etiqueta etiqueta) {
		getPersistence().cacheResult(etiqueta);
	}

	/**
	 * Caches the etiquetas in the entity cache if it is enabled.
	 *
	 * @param etiquetas the etiquetas
	 */
	public static void cacheResult(List<Etiqueta> etiquetas) {
		getPersistence().cacheResult(etiquetas);
	}

	/**
	 * Creates a new etiqueta with the primary key. Does not add the etiqueta to the database.
	 *
	 * @param etiquetaId the primary key for the new etiqueta
	 * @return the new etiqueta
	 */
	public static Etiqueta create(long etiquetaId) {
		return getPersistence().create(etiquetaId);
	}

	/**
	 * Removes the etiqueta with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param etiquetaId the primary key of the etiqueta
	 * @return the etiqueta that was removed
	 * @throws NoSuchEtiquetaException if a etiqueta with the primary key could not be found
	 */
	public static Etiqueta remove(long etiquetaId)
		throws com.savvy.sb.exception.NoSuchEtiquetaException {

		return getPersistence().remove(etiquetaId);
	}

	public static Etiqueta updateImpl(Etiqueta etiqueta) {
		return getPersistence().updateImpl(etiqueta);
	}

	/**
	 * Returns the etiqueta with the primary key or throws a <code>NoSuchEtiquetaException</code> if it could not be found.
	 *
	 * @param etiquetaId the primary key of the etiqueta
	 * @return the etiqueta
	 * @throws NoSuchEtiquetaException if a etiqueta with the primary key could not be found
	 */
	public static Etiqueta findByPrimaryKey(long etiquetaId)
		throws com.savvy.sb.exception.NoSuchEtiquetaException {

		return getPersistence().findByPrimaryKey(etiquetaId);
	}

	/**
	 * Returns the etiqueta with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param etiquetaId the primary key of the etiqueta
	 * @return the etiqueta, or <code>null</code> if a etiqueta with the primary key could not be found
	 */
	public static Etiqueta fetchByPrimaryKey(long etiquetaId) {
		return getPersistence().fetchByPrimaryKey(etiquetaId);
	}

	/**
	 * Returns all the etiquetas.
	 *
	 * @return the etiquetas
	 */
	public static List<Etiqueta> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<Etiqueta> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<Etiqueta> findAll(
		int start, int end, OrderByComparator<Etiqueta> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<Etiqueta> findAll(
		int start, int end, OrderByComparator<Etiqueta> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the etiquetas from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of etiquetas.
	 *
	 * @return the number of etiquetas
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static EtiquetaPersistence getPersistence() {
		return _persistence;
	}

	private static volatile EtiquetaPersistence _persistence;

}
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

package com.savvy.sb.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.MapUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;

import com.savvy.sb.exception.NoSuchEtiquetaException;
import com.savvy.sb.model.Etiqueta;
import com.savvy.sb.model.impl.EtiquetaImpl;
import com.savvy.sb.model.impl.EtiquetaModelImpl;
import com.savvy.sb.service.persistence.EtiquetaPersistence;
import com.savvy.sb.service.persistence.EtiquetaUtil;
import com.savvy.sb.service.persistence.impl.constants.Servicio_SavvyPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import javax.sql.DataSource;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the etiqueta service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = EtiquetaPersistence.class)
public class EtiquetaPersistenceImpl
	extends BasePersistenceImpl<Etiqueta> implements EtiquetaPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>EtiquetaUtil</code> to access the etiqueta persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		EtiquetaImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByUuid;
	private FinderPath _finderPathWithoutPaginationFindByUuid;
	private FinderPath _finderPathCountByUuid;

	/**
	 * Returns all the etiquetas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching etiquetas
	 */
	@Override
	public List<Etiqueta> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Etiqueta> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<Etiqueta> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Etiqueta> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<Etiqueta> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Etiqueta> orderByComparator, boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid;
				finderArgs = new Object[] {uuid};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid;
			finderArgs = new Object[] {uuid, start, end, orderByComparator};
		}

		List<Etiqueta> list = null;

		if (useFinderCache) {
			list = (List<Etiqueta>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Etiqueta etiqueta : list) {
					if (!uuid.equals(etiqueta.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_ETIQUETA_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(EtiquetaModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				list = (List<Etiqueta>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first etiqueta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching etiqueta
	 * @throws NoSuchEtiquetaException if a matching etiqueta could not be found
	 */
	@Override
	public Etiqueta findByUuid_First(
			String uuid, OrderByComparator<Etiqueta> orderByComparator)
		throws NoSuchEtiquetaException {

		Etiqueta etiqueta = fetchByUuid_First(uuid, orderByComparator);

		if (etiqueta != null) {
			return etiqueta;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchEtiquetaException(sb.toString());
	}

	/**
	 * Returns the first etiqueta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching etiqueta, or <code>null</code> if a matching etiqueta could not be found
	 */
	@Override
	public Etiqueta fetchByUuid_First(
		String uuid, OrderByComparator<Etiqueta> orderByComparator) {

		List<Etiqueta> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last etiqueta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching etiqueta
	 * @throws NoSuchEtiquetaException if a matching etiqueta could not be found
	 */
	@Override
	public Etiqueta findByUuid_Last(
			String uuid, OrderByComparator<Etiqueta> orderByComparator)
		throws NoSuchEtiquetaException {

		Etiqueta etiqueta = fetchByUuid_Last(uuid, orderByComparator);

		if (etiqueta != null) {
			return etiqueta;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchEtiquetaException(sb.toString());
	}

	/**
	 * Returns the last etiqueta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching etiqueta, or <code>null</code> if a matching etiqueta could not be found
	 */
	@Override
	public Etiqueta fetchByUuid_Last(
		String uuid, OrderByComparator<Etiqueta> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Etiqueta> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Etiqueta[] findByUuid_PrevAndNext(
			long etiquetaId, String uuid,
			OrderByComparator<Etiqueta> orderByComparator)
		throws NoSuchEtiquetaException {

		uuid = Objects.toString(uuid, "");

		Etiqueta etiqueta = findByPrimaryKey(etiquetaId);

		Session session = null;

		try {
			session = openSession();

			Etiqueta[] array = new EtiquetaImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, etiqueta, uuid, orderByComparator, true);

			array[1] = etiqueta;

			array[2] = getByUuid_PrevAndNext(
				session, etiqueta, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Etiqueta getByUuid_PrevAndNext(
		Session session, Etiqueta etiqueta, String uuid,
		OrderByComparator<Etiqueta> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_ETIQUETA_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(EtiquetaModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(etiqueta)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Etiqueta> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the etiquetas where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Etiqueta etiqueta :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(etiqueta);
		}
	}

	/**
	 * Returns the number of etiquetas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching etiquetas
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ETIQUETA_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_2 =
		"etiqueta.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(etiqueta.uuid IS NULL OR etiqueta.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the etiqueta where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchEtiquetaException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching etiqueta
	 * @throws NoSuchEtiquetaException if a matching etiqueta could not be found
	 */
	@Override
	public Etiqueta findByUUID_G(String uuid, long groupId)
		throws NoSuchEtiquetaException {

		Etiqueta etiqueta = fetchByUUID_G(uuid, groupId);

		if (etiqueta == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("uuid=");
			sb.append(uuid);

			sb.append(", groupId=");
			sb.append(groupId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchEtiquetaException(sb.toString());
		}

		return etiqueta;
	}

	/**
	 * Returns the etiqueta where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching etiqueta, or <code>null</code> if a matching etiqueta could not be found
	 */
	@Override
	public Etiqueta fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the etiqueta where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching etiqueta, or <code>null</code> if a matching etiqueta could not be found
	 */
	@Override
	public Etiqueta fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {uuid, groupId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByUUID_G, finderArgs, this);
		}

		if (result instanceof Etiqueta) {
			Etiqueta etiqueta = (Etiqueta)result;

			if (!Objects.equals(uuid, etiqueta.getUuid()) ||
				(groupId != etiqueta.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_ETIQUETA_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(groupId);

				List<Etiqueta> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					Etiqueta etiqueta = list.get(0);

					result = etiqueta;

					cacheResult(etiqueta);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (Etiqueta)result;
		}
	}

	/**
	 * Removes the etiqueta where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the etiqueta that was removed
	 */
	@Override
	public Etiqueta removeByUUID_G(String uuid, long groupId)
		throws NoSuchEtiquetaException {

		Etiqueta etiqueta = findByUUID_G(uuid, groupId);

		return remove(etiqueta);
	}

	/**
	 * Returns the number of etiquetas where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching etiquetas
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_ETIQUETA_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(groupId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_G_UUID_2 =
		"etiqueta.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(etiqueta.uuid IS NULL OR etiqueta.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"etiqueta.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the etiquetas where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching etiquetas
	 */
	@Override
	public List<Etiqueta> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Etiqueta> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
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
	@Override
	public List<Etiqueta> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Etiqueta> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
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
	@Override
	public List<Etiqueta> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Etiqueta> orderByComparator, boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid_C;
				finderArgs = new Object[] {uuid, companyId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid_C;
			finderArgs = new Object[] {
				uuid, companyId, start, end, orderByComparator
			};
		}

		List<Etiqueta> list = null;

		if (useFinderCache) {
			list = (List<Etiqueta>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Etiqueta etiqueta : list) {
					if (!uuid.equals(etiqueta.getUuid()) ||
						(companyId != etiqueta.getCompanyId())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_ETIQUETA_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(EtiquetaModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(companyId);

				list = (List<Etiqueta>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public Etiqueta findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Etiqueta> orderByComparator)
		throws NoSuchEtiquetaException {

		Etiqueta etiqueta = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (etiqueta != null) {
			return etiqueta;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchEtiquetaException(sb.toString());
	}

	/**
	 * Returns the first etiqueta in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching etiqueta, or <code>null</code> if a matching etiqueta could not be found
	 */
	@Override
	public Etiqueta fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Etiqueta> orderByComparator) {

		List<Etiqueta> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Etiqueta findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Etiqueta> orderByComparator)
		throws NoSuchEtiquetaException {

		Etiqueta etiqueta = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (etiqueta != null) {
			return etiqueta;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchEtiquetaException(sb.toString());
	}

	/**
	 * Returns the last etiqueta in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching etiqueta, or <code>null</code> if a matching etiqueta could not be found
	 */
	@Override
	public Etiqueta fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Etiqueta> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<Etiqueta> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Etiqueta[] findByUuid_C_PrevAndNext(
			long etiquetaId, String uuid, long companyId,
			OrderByComparator<Etiqueta> orderByComparator)
		throws NoSuchEtiquetaException {

		uuid = Objects.toString(uuid, "");

		Etiqueta etiqueta = findByPrimaryKey(etiquetaId);

		Session session = null;

		try {
			session = openSession();

			Etiqueta[] array = new EtiquetaImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, etiqueta, uuid, companyId, orderByComparator, true);

			array[1] = etiqueta;

			array[2] = getByUuid_C_PrevAndNext(
				session, etiqueta, uuid, companyId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Etiqueta getByUuid_C_PrevAndNext(
		Session session, Etiqueta etiqueta, String uuid, long companyId,
		OrderByComparator<Etiqueta> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_ETIQUETA_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(EtiquetaModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		queryPos.add(companyId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(etiqueta)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Etiqueta> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the etiquetas where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (Etiqueta etiqueta :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(etiqueta);
		}
	}

	/**
	 * Returns the number of etiquetas where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching etiquetas
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_ETIQUETA_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(companyId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_C_UUID_2 =
		"etiqueta.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(etiqueta.uuid IS NULL OR etiqueta.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"etiqueta.companyId = ?";

	private FinderPath _finderPathWithPaginationFindByTituloEtiqueta;
	private FinderPath _finderPathWithoutPaginationFindByTituloEtiqueta;
	private FinderPath _finderPathCountByTituloEtiqueta;

	/**
	 * Returns all the etiquetas where tituloEtiqueta = &#63;.
	 *
	 * @param tituloEtiqueta the titulo etiqueta
	 * @return the matching etiquetas
	 */
	@Override
	public List<Etiqueta> findByTituloEtiqueta(String tituloEtiqueta) {
		return findByTituloEtiqueta(
			tituloEtiqueta, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Etiqueta> findByTituloEtiqueta(
		String tituloEtiqueta, int start, int end) {

		return findByTituloEtiqueta(tituloEtiqueta, start, end, null);
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
	@Override
	public List<Etiqueta> findByTituloEtiqueta(
		String tituloEtiqueta, int start, int end,
		OrderByComparator<Etiqueta> orderByComparator) {

		return findByTituloEtiqueta(
			tituloEtiqueta, start, end, orderByComparator, true);
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
	@Override
	public List<Etiqueta> findByTituloEtiqueta(
		String tituloEtiqueta, int start, int end,
		OrderByComparator<Etiqueta> orderByComparator, boolean useFinderCache) {

		tituloEtiqueta = Objects.toString(tituloEtiqueta, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByTituloEtiqueta;
				finderArgs = new Object[] {tituloEtiqueta};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByTituloEtiqueta;
			finderArgs = new Object[] {
				tituloEtiqueta, start, end, orderByComparator
			};
		}

		List<Etiqueta> list = null;

		if (useFinderCache) {
			list = (List<Etiqueta>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Etiqueta etiqueta : list) {
					if (!tituloEtiqueta.equals(etiqueta.getTituloEtiqueta())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_ETIQUETA_WHERE);

			boolean bindTituloEtiqueta = false;

			if (tituloEtiqueta.isEmpty()) {
				sb.append(_FINDER_COLUMN_TITULOETIQUETA_TITULOETIQUETA_3);
			}
			else {
				bindTituloEtiqueta = true;

				sb.append(_FINDER_COLUMN_TITULOETIQUETA_TITULOETIQUETA_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(EtiquetaModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindTituloEtiqueta) {
					queryPos.add(tituloEtiqueta);
				}

				list = (List<Etiqueta>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first etiqueta in the ordered set where tituloEtiqueta = &#63;.
	 *
	 * @param tituloEtiqueta the titulo etiqueta
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching etiqueta
	 * @throws NoSuchEtiquetaException if a matching etiqueta could not be found
	 */
	@Override
	public Etiqueta findByTituloEtiqueta_First(
			String tituloEtiqueta,
			OrderByComparator<Etiqueta> orderByComparator)
		throws NoSuchEtiquetaException {

		Etiqueta etiqueta = fetchByTituloEtiqueta_First(
			tituloEtiqueta, orderByComparator);

		if (etiqueta != null) {
			return etiqueta;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("tituloEtiqueta=");
		sb.append(tituloEtiqueta);

		sb.append("}");

		throw new NoSuchEtiquetaException(sb.toString());
	}

	/**
	 * Returns the first etiqueta in the ordered set where tituloEtiqueta = &#63;.
	 *
	 * @param tituloEtiqueta the titulo etiqueta
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching etiqueta, or <code>null</code> if a matching etiqueta could not be found
	 */
	@Override
	public Etiqueta fetchByTituloEtiqueta_First(
		String tituloEtiqueta, OrderByComparator<Etiqueta> orderByComparator) {

		List<Etiqueta> list = findByTituloEtiqueta(
			tituloEtiqueta, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last etiqueta in the ordered set where tituloEtiqueta = &#63;.
	 *
	 * @param tituloEtiqueta the titulo etiqueta
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching etiqueta
	 * @throws NoSuchEtiquetaException if a matching etiqueta could not be found
	 */
	@Override
	public Etiqueta findByTituloEtiqueta_Last(
			String tituloEtiqueta,
			OrderByComparator<Etiqueta> orderByComparator)
		throws NoSuchEtiquetaException {

		Etiqueta etiqueta = fetchByTituloEtiqueta_Last(
			tituloEtiqueta, orderByComparator);

		if (etiqueta != null) {
			return etiqueta;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("tituloEtiqueta=");
		sb.append(tituloEtiqueta);

		sb.append("}");

		throw new NoSuchEtiquetaException(sb.toString());
	}

	/**
	 * Returns the last etiqueta in the ordered set where tituloEtiqueta = &#63;.
	 *
	 * @param tituloEtiqueta the titulo etiqueta
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching etiqueta, or <code>null</code> if a matching etiqueta could not be found
	 */
	@Override
	public Etiqueta fetchByTituloEtiqueta_Last(
		String tituloEtiqueta, OrderByComparator<Etiqueta> orderByComparator) {

		int count = countByTituloEtiqueta(tituloEtiqueta);

		if (count == 0) {
			return null;
		}

		List<Etiqueta> list = findByTituloEtiqueta(
			tituloEtiqueta, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Etiqueta[] findByTituloEtiqueta_PrevAndNext(
			long etiquetaId, String tituloEtiqueta,
			OrderByComparator<Etiqueta> orderByComparator)
		throws NoSuchEtiquetaException {

		tituloEtiqueta = Objects.toString(tituloEtiqueta, "");

		Etiqueta etiqueta = findByPrimaryKey(etiquetaId);

		Session session = null;

		try {
			session = openSession();

			Etiqueta[] array = new EtiquetaImpl[3];

			array[0] = getByTituloEtiqueta_PrevAndNext(
				session, etiqueta, tituloEtiqueta, orderByComparator, true);

			array[1] = etiqueta;

			array[2] = getByTituloEtiqueta_PrevAndNext(
				session, etiqueta, tituloEtiqueta, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Etiqueta getByTituloEtiqueta_PrevAndNext(
		Session session, Etiqueta etiqueta, String tituloEtiqueta,
		OrderByComparator<Etiqueta> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_ETIQUETA_WHERE);

		boolean bindTituloEtiqueta = false;

		if (tituloEtiqueta.isEmpty()) {
			sb.append(_FINDER_COLUMN_TITULOETIQUETA_TITULOETIQUETA_3);
		}
		else {
			bindTituloEtiqueta = true;

			sb.append(_FINDER_COLUMN_TITULOETIQUETA_TITULOETIQUETA_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(EtiquetaModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindTituloEtiqueta) {
			queryPos.add(tituloEtiqueta);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(etiqueta)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Etiqueta> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the etiquetas where tituloEtiqueta = &#63; from the database.
	 *
	 * @param tituloEtiqueta the titulo etiqueta
	 */
	@Override
	public void removeByTituloEtiqueta(String tituloEtiqueta) {
		for (Etiqueta etiqueta :
				findByTituloEtiqueta(
					tituloEtiqueta, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(etiqueta);
		}
	}

	/**
	 * Returns the number of etiquetas where tituloEtiqueta = &#63;.
	 *
	 * @param tituloEtiqueta the titulo etiqueta
	 * @return the number of matching etiquetas
	 */
	@Override
	public int countByTituloEtiqueta(String tituloEtiqueta) {
		tituloEtiqueta = Objects.toString(tituloEtiqueta, "");

		FinderPath finderPath = _finderPathCountByTituloEtiqueta;

		Object[] finderArgs = new Object[] {tituloEtiqueta};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ETIQUETA_WHERE);

			boolean bindTituloEtiqueta = false;

			if (tituloEtiqueta.isEmpty()) {
				sb.append(_FINDER_COLUMN_TITULOETIQUETA_TITULOETIQUETA_3);
			}
			else {
				bindTituloEtiqueta = true;

				sb.append(_FINDER_COLUMN_TITULOETIQUETA_TITULOETIQUETA_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindTituloEtiqueta) {
					queryPos.add(tituloEtiqueta);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_TITULOETIQUETA_TITULOETIQUETA_2 =
		"etiqueta.tituloEtiqueta = ?";

	private static final String _FINDER_COLUMN_TITULOETIQUETA_TITULOETIQUETA_3 =
		"(etiqueta.tituloEtiqueta IS NULL OR etiqueta.tituloEtiqueta = '')";

	public EtiquetaPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(Etiqueta.class);

		setModelImplClass(EtiquetaImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the etiqueta in the entity cache if it is enabled.
	 *
	 * @param etiqueta the etiqueta
	 */
	@Override
	public void cacheResult(Etiqueta etiqueta) {
		entityCache.putResult(
			EtiquetaImpl.class, etiqueta.getPrimaryKey(), etiqueta);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {etiqueta.getUuid(), etiqueta.getGroupId()}, etiqueta);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the etiquetas in the entity cache if it is enabled.
	 *
	 * @param etiquetas the etiquetas
	 */
	@Override
	public void cacheResult(List<Etiqueta> etiquetas) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (etiquetas.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Etiqueta etiqueta : etiquetas) {
			if (entityCache.getResult(
					EtiquetaImpl.class, etiqueta.getPrimaryKey()) == null) {

				cacheResult(etiqueta);
			}
		}
	}

	/**
	 * Clears the cache for all etiquetas.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(EtiquetaImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the etiqueta.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Etiqueta etiqueta) {
		entityCache.removeResult(EtiquetaImpl.class, etiqueta);
	}

	@Override
	public void clearCache(List<Etiqueta> etiquetas) {
		for (Etiqueta etiqueta : etiquetas) {
			entityCache.removeResult(EtiquetaImpl.class, etiqueta);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(EtiquetaImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		EtiquetaModelImpl etiquetaModelImpl) {

		Object[] args = new Object[] {
			etiquetaModelImpl.getUuid(), etiquetaModelImpl.getGroupId()
		};

		finderCache.putResult(
			_finderPathCountByUUID_G, args, Long.valueOf(1), false);
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, etiquetaModelImpl, false);
	}

	/**
	 * Creates a new etiqueta with the primary key. Does not add the etiqueta to the database.
	 *
	 * @param etiquetaId the primary key for the new etiqueta
	 * @return the new etiqueta
	 */
	@Override
	public Etiqueta create(long etiquetaId) {
		Etiqueta etiqueta = new EtiquetaImpl();

		etiqueta.setNew(true);
		etiqueta.setPrimaryKey(etiquetaId);

		String uuid = PortalUUIDUtil.generate();

		etiqueta.setUuid(uuid);

		etiqueta.setCompanyId(CompanyThreadLocal.getCompanyId());

		return etiqueta;
	}

	/**
	 * Removes the etiqueta with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param etiquetaId the primary key of the etiqueta
	 * @return the etiqueta that was removed
	 * @throws NoSuchEtiquetaException if a etiqueta with the primary key could not be found
	 */
	@Override
	public Etiqueta remove(long etiquetaId) throws NoSuchEtiquetaException {
		return remove((Serializable)etiquetaId);
	}

	/**
	 * Removes the etiqueta with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the etiqueta
	 * @return the etiqueta that was removed
	 * @throws NoSuchEtiquetaException if a etiqueta with the primary key could not be found
	 */
	@Override
	public Etiqueta remove(Serializable primaryKey)
		throws NoSuchEtiquetaException {

		Session session = null;

		try {
			session = openSession();

			Etiqueta etiqueta = (Etiqueta)session.get(
				EtiquetaImpl.class, primaryKey);

			if (etiqueta == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEtiquetaException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(etiqueta);
		}
		catch (NoSuchEtiquetaException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Etiqueta removeImpl(Etiqueta etiqueta) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(etiqueta)) {
				etiqueta = (Etiqueta)session.get(
					EtiquetaImpl.class, etiqueta.getPrimaryKeyObj());
			}

			if (etiqueta != null) {
				session.delete(etiqueta);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (etiqueta != null) {
			clearCache(etiqueta);
		}

		return etiqueta;
	}

	@Override
	public Etiqueta updateImpl(Etiqueta etiqueta) {
		boolean isNew = etiqueta.isNew();

		if (!(etiqueta instanceof EtiquetaModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(etiqueta.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(etiqueta);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in etiqueta proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Etiqueta implementation " +
					etiqueta.getClass());
		}

		EtiquetaModelImpl etiquetaModelImpl = (EtiquetaModelImpl)etiqueta;

		if (Validator.isNull(etiqueta.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			etiqueta.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (etiqueta.getCreateDate() == null)) {
			if (serviceContext == null) {
				etiqueta.setCreateDate(date);
			}
			else {
				etiqueta.setCreateDate(serviceContext.getCreateDate(date));
			}
		}

		if (!etiquetaModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				etiqueta.setModifiedDate(date);
			}
			else {
				etiqueta.setModifiedDate(serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(etiqueta);
			}
			else {
				etiqueta = (Etiqueta)session.merge(etiqueta);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			EtiquetaImpl.class, etiquetaModelImpl, false, true);

		cacheUniqueFindersCache(etiquetaModelImpl);

		if (isNew) {
			etiqueta.setNew(false);
		}

		etiqueta.resetOriginalValues();

		return etiqueta;
	}

	/**
	 * Returns the etiqueta with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the etiqueta
	 * @return the etiqueta
	 * @throws NoSuchEtiquetaException if a etiqueta with the primary key could not be found
	 */
	@Override
	public Etiqueta findByPrimaryKey(Serializable primaryKey)
		throws NoSuchEtiquetaException {

		Etiqueta etiqueta = fetchByPrimaryKey(primaryKey);

		if (etiqueta == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchEtiquetaException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return etiqueta;
	}

	/**
	 * Returns the etiqueta with the primary key or throws a <code>NoSuchEtiquetaException</code> if it could not be found.
	 *
	 * @param etiquetaId the primary key of the etiqueta
	 * @return the etiqueta
	 * @throws NoSuchEtiquetaException if a etiqueta with the primary key could not be found
	 */
	@Override
	public Etiqueta findByPrimaryKey(long etiquetaId)
		throws NoSuchEtiquetaException {

		return findByPrimaryKey((Serializable)etiquetaId);
	}

	/**
	 * Returns the etiqueta with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param etiquetaId the primary key of the etiqueta
	 * @return the etiqueta, or <code>null</code> if a etiqueta with the primary key could not be found
	 */
	@Override
	public Etiqueta fetchByPrimaryKey(long etiquetaId) {
		return fetchByPrimaryKey((Serializable)etiquetaId);
	}

	/**
	 * Returns all the etiquetas.
	 *
	 * @return the etiquetas
	 */
	@Override
	public List<Etiqueta> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Etiqueta> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<Etiqueta> findAll(
		int start, int end, OrderByComparator<Etiqueta> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<Etiqueta> findAll(
		int start, int end, OrderByComparator<Etiqueta> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<Etiqueta> list = null;

		if (useFinderCache) {
			list = (List<Etiqueta>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ETIQUETA);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ETIQUETA;

				sql = sql.concat(EtiquetaModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Etiqueta>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the etiquetas from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Etiqueta etiqueta : findAll()) {
			remove(etiqueta);
		}
	}

	/**
	 * Returns the number of etiquetas.
	 *
	 * @return the number of etiquetas
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_ETIQUETA);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "etiquetaId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ETIQUETA;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return EtiquetaModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the etiqueta persistence.
	 */
	@Activate
	public void activate(BundleContext bundleContext) {
		_bundleContext = bundleContext;

		_argumentsResolverServiceRegistration = _bundleContext.registerService(
			ArgumentsResolver.class, new EtiquetaModelArgumentsResolver(),
			MapUtil.singletonDictionary(
				"model.class.name", Etiqueta.class.getName()));

		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathWithPaginationFindByUuid = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"uuid_"}, true);

		_finderPathWithoutPaginationFindByUuid = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			true);

		_finderPathCountByUuid = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			false);

		_finderPathFetchByUUID_G = _createFinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "groupId"}, true);

		_finderPathCountByUUID_G = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "groupId"}, false);

		_finderPathWithPaginationFindByUuid_C = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"uuid_", "companyId"}, true);

		_finderPathWithoutPaginationFindByUuid_C = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "companyId"}, true);

		_finderPathCountByUuid_C = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "companyId"}, false);

		_finderPathWithPaginationFindByTituloEtiqueta = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByTituloEtiqueta",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"tituloEtiqueta"}, true);

		_finderPathWithoutPaginationFindByTituloEtiqueta = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByTituloEtiqueta",
			new String[] {String.class.getName()},
			new String[] {"tituloEtiqueta"}, true);

		_finderPathCountByTituloEtiqueta = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTituloEtiqueta",
			new String[] {String.class.getName()},
			new String[] {"tituloEtiqueta"}, false);

		_setEtiquetaUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setEtiquetaUtilPersistence(null);

		entityCache.removeCache(EtiquetaImpl.class.getName());

		_argumentsResolverServiceRegistration.unregister();

		for (ServiceRegistration<FinderPath> serviceRegistration :
				_serviceRegistrations) {

			serviceRegistration.unregister();
		}
	}

	private void _setEtiquetaUtilPersistence(
		EtiquetaPersistence etiquetaPersistence) {

		try {
			Field field = EtiquetaUtil.class.getDeclaredField("_persistence");

			field.setAccessible(true);

			field.set(null, etiquetaPersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Override
	@Reference(
		target = Servicio_SavvyPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = Servicio_SavvyPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = Servicio_SavvyPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	private BundleContext _bundleContext;

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_ETIQUETA =
		"SELECT etiqueta FROM Etiqueta etiqueta";

	private static final String _SQL_SELECT_ETIQUETA_WHERE =
		"SELECT etiqueta FROM Etiqueta etiqueta WHERE ";

	private static final String _SQL_COUNT_ETIQUETA =
		"SELECT COUNT(etiqueta) FROM Etiqueta etiqueta";

	private static final String _SQL_COUNT_ETIQUETA_WHERE =
		"SELECT COUNT(etiqueta) FROM Etiqueta etiqueta WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "etiqueta.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Etiqueta exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No Etiqueta exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		EtiquetaPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	private FinderPath _createFinderPath(
		String cacheName, String methodName, String[] params,
		String[] columnNames, boolean baseModelResult) {

		FinderPath finderPath = new FinderPath(
			cacheName, methodName, params, columnNames, baseModelResult);

		if (!cacheName.equals(FINDER_CLASS_NAME_LIST_WITH_PAGINATION)) {
			_serviceRegistrations.add(
				_bundleContext.registerService(
					FinderPath.class, finderPath,
					MapUtil.singletonDictionary("cache.name", cacheName)));
		}

		return finderPath;
	}

	private Set<ServiceRegistration<FinderPath>> _serviceRegistrations =
		new HashSet<>();
	private ServiceRegistration<ArgumentsResolver>
		_argumentsResolverServiceRegistration;

	private static class EtiquetaModelArgumentsResolver
		implements ArgumentsResolver {

		@Override
		public Object[] getArguments(
			FinderPath finderPath, BaseModel<?> baseModel, boolean checkColumn,
			boolean original) {

			String[] columnNames = finderPath.getColumnNames();

			if ((columnNames == null) || (columnNames.length == 0)) {
				if (baseModel.isNew()) {
					return new Object[0];
				}

				return null;
			}

			EtiquetaModelImpl etiquetaModelImpl = (EtiquetaModelImpl)baseModel;

			long columnBitmask = etiquetaModelImpl.getColumnBitmask();

			if (!checkColumn || (columnBitmask == 0)) {
				return _getValue(etiquetaModelImpl, columnNames, original);
			}

			Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
				finderPath);

			if (finderPathColumnBitmask == null) {
				finderPathColumnBitmask = 0L;

				for (String columnName : columnNames) {
					finderPathColumnBitmask |=
						etiquetaModelImpl.getColumnBitmask(columnName);
				}

				if (finderPath.isBaseModelResult() &&
					(EtiquetaPersistenceImpl.
						FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION ==
							finderPath.getCacheName())) {

					finderPathColumnBitmask |= _ORDER_BY_COLUMNS_BITMASK;
				}

				_finderPathColumnBitmasksCache.put(
					finderPath, finderPathColumnBitmask);
			}

			if ((columnBitmask & finderPathColumnBitmask) != 0) {
				return _getValue(etiquetaModelImpl, columnNames, original);
			}

			return null;
		}

		private static Object[] _getValue(
			EtiquetaModelImpl etiquetaModelImpl, String[] columnNames,
			boolean original) {

			Object[] arguments = new Object[columnNames.length];

			for (int i = 0; i < arguments.length; i++) {
				String columnName = columnNames[i];

				if (original) {
					arguments[i] = etiquetaModelImpl.getColumnOriginalValue(
						columnName);
				}
				else {
					arguments[i] = etiquetaModelImpl.getColumnValue(columnName);
				}
			}

			return arguments;
		}

		private static final Map<FinderPath, Long>
			_finderPathColumnBitmasksCache = new ConcurrentHashMap<>();

		private static final long _ORDER_BY_COLUMNS_BITMASK;

		static {
			long orderByColumnsBitmask = 0;

			orderByColumnsBitmask |= EtiquetaModelImpl.getColumnBitmask(
				"tituloEtiqueta");

			_ORDER_BY_COLUMNS_BITMASK = orderByColumnsBitmask;
		}

	}

}
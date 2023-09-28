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

import com.savvy.sb.exception.NoSuchTareaException;
import com.savvy.sb.model.Tarea;
import com.savvy.sb.model.impl.TareaImpl;
import com.savvy.sb.model.impl.TareaModelImpl;
import com.savvy.sb.service.persistence.TareaPersistence;
import com.savvy.sb.service.persistence.TareaUtil;
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
 * The persistence implementation for the tarea service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = TareaPersistence.class)
public class TareaPersistenceImpl
	extends BasePersistenceImpl<Tarea> implements TareaPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>TareaUtil</code> to access the tarea persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		TareaImpl.class.getName();

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
	 * Returns all the tareas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching tareas
	 */
	@Override
	public List<Tarea> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tareas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TareaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of tareas
	 * @param end the upper bound of the range of tareas (not inclusive)
	 * @return the range of matching tareas
	 */
	@Override
	public List<Tarea> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tareas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TareaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of tareas
	 * @param end the upper bound of the range of tareas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tareas
	 */
	@Override
	public List<Tarea> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Tarea> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tareas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TareaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of tareas
	 * @param end the upper bound of the range of tareas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching tareas
	 */
	@Override
	public List<Tarea> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Tarea> orderByComparator, boolean useFinderCache) {

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

		List<Tarea> list = null;

		if (useFinderCache) {
			list = (List<Tarea>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Tarea tarea : list) {
					if (!uuid.equals(tarea.getUuid())) {
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

			sb.append(_SQL_SELECT_TAREA_WHERE);

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
				sb.append(TareaModelImpl.ORDER_BY_JPQL);
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

				list = (List<Tarea>)QueryUtil.list(
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
	 * Returns the first tarea in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tarea
	 * @throws NoSuchTareaException if a matching tarea could not be found
	 */
	@Override
	public Tarea findByUuid_First(
			String uuid, OrderByComparator<Tarea> orderByComparator)
		throws NoSuchTareaException {

		Tarea tarea = fetchByUuid_First(uuid, orderByComparator);

		if (tarea != null) {
			return tarea;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchTareaException(sb.toString());
	}

	/**
	 * Returns the first tarea in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tarea, or <code>null</code> if a matching tarea could not be found
	 */
	@Override
	public Tarea fetchByUuid_First(
		String uuid, OrderByComparator<Tarea> orderByComparator) {

		List<Tarea> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tarea in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tarea
	 * @throws NoSuchTareaException if a matching tarea could not be found
	 */
	@Override
	public Tarea findByUuid_Last(
			String uuid, OrderByComparator<Tarea> orderByComparator)
		throws NoSuchTareaException {

		Tarea tarea = fetchByUuid_Last(uuid, orderByComparator);

		if (tarea != null) {
			return tarea;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchTareaException(sb.toString());
	}

	/**
	 * Returns the last tarea in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tarea, or <code>null</code> if a matching tarea could not be found
	 */
	@Override
	public Tarea fetchByUuid_Last(
		String uuid, OrderByComparator<Tarea> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Tarea> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tareas before and after the current tarea in the ordered set where uuid = &#63;.
	 *
	 * @param tareaId the primary key of the current tarea
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tarea
	 * @throws NoSuchTareaException if a tarea with the primary key could not be found
	 */
	@Override
	public Tarea[] findByUuid_PrevAndNext(
			long tareaId, String uuid,
			OrderByComparator<Tarea> orderByComparator)
		throws NoSuchTareaException {

		uuid = Objects.toString(uuid, "");

		Tarea tarea = findByPrimaryKey(tareaId);

		Session session = null;

		try {
			session = openSession();

			Tarea[] array = new TareaImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, tarea, uuid, orderByComparator, true);

			array[1] = tarea;

			array[2] = getByUuid_PrevAndNext(
				session, tarea, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Tarea getByUuid_PrevAndNext(
		Session session, Tarea tarea, String uuid,
		OrderByComparator<Tarea> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_TAREA_WHERE);

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
			sb.append(TareaModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(tarea)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Tarea> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tareas where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Tarea tarea :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(tarea);
		}
	}

	/**
	 * Returns the number of tareas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching tareas
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_TAREA_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_UUID_2 = "tarea.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(tarea.uuid IS NULL OR tarea.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the tarea where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchTareaException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching tarea
	 * @throws NoSuchTareaException if a matching tarea could not be found
	 */
	@Override
	public Tarea findByUUID_G(String uuid, long groupId)
		throws NoSuchTareaException {

		Tarea tarea = fetchByUUID_G(uuid, groupId);

		if (tarea == null) {
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

			throw new NoSuchTareaException(sb.toString());
		}

		return tarea;
	}

	/**
	 * Returns the tarea where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching tarea, or <code>null</code> if a matching tarea could not be found
	 */
	@Override
	public Tarea fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the tarea where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tarea, or <code>null</code> if a matching tarea could not be found
	 */
	@Override
	public Tarea fetchByUUID_G(
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

		if (result instanceof Tarea) {
			Tarea tarea = (Tarea)result;

			if (!Objects.equals(uuid, tarea.getUuid()) ||
				(groupId != tarea.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_TAREA_WHERE);

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

				List<Tarea> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					Tarea tarea = list.get(0);

					result = tarea;

					cacheResult(tarea);
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
			return (Tarea)result;
		}
	}

	/**
	 * Removes the tarea where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the tarea that was removed
	 */
	@Override
	public Tarea removeByUUID_G(String uuid, long groupId)
		throws NoSuchTareaException {

		Tarea tarea = findByUUID_G(uuid, groupId);

		return remove(tarea);
	}

	/**
	 * Returns the number of tareas where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching tareas
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_TAREA_WHERE);

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
		"tarea.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(tarea.uuid IS NULL OR tarea.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"tarea.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the tareas where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching tareas
	 */
	@Override
	public List<Tarea> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tareas where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TareaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of tareas
	 * @param end the upper bound of the range of tareas (not inclusive)
	 * @return the range of matching tareas
	 */
	@Override
	public List<Tarea> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tareas where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TareaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of tareas
	 * @param end the upper bound of the range of tareas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tareas
	 */
	@Override
	public List<Tarea> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Tarea> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tareas where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TareaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of tareas
	 * @param end the upper bound of the range of tareas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching tareas
	 */
	@Override
	public List<Tarea> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Tarea> orderByComparator, boolean useFinderCache) {

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

		List<Tarea> list = null;

		if (useFinderCache) {
			list = (List<Tarea>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Tarea tarea : list) {
					if (!uuid.equals(tarea.getUuid()) ||
						(companyId != tarea.getCompanyId())) {

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

			sb.append(_SQL_SELECT_TAREA_WHERE);

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
				sb.append(TareaModelImpl.ORDER_BY_JPQL);
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

				list = (List<Tarea>)QueryUtil.list(
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
	 * Returns the first tarea in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tarea
	 * @throws NoSuchTareaException if a matching tarea could not be found
	 */
	@Override
	public Tarea findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Tarea> orderByComparator)
		throws NoSuchTareaException {

		Tarea tarea = fetchByUuid_C_First(uuid, companyId, orderByComparator);

		if (tarea != null) {
			return tarea;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchTareaException(sb.toString());
	}

	/**
	 * Returns the first tarea in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tarea, or <code>null</code> if a matching tarea could not be found
	 */
	@Override
	public Tarea fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Tarea> orderByComparator) {

		List<Tarea> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tarea in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tarea
	 * @throws NoSuchTareaException if a matching tarea could not be found
	 */
	@Override
	public Tarea findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Tarea> orderByComparator)
		throws NoSuchTareaException {

		Tarea tarea = fetchByUuid_C_Last(uuid, companyId, orderByComparator);

		if (tarea != null) {
			return tarea;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchTareaException(sb.toString());
	}

	/**
	 * Returns the last tarea in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tarea, or <code>null</code> if a matching tarea could not be found
	 */
	@Override
	public Tarea fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Tarea> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<Tarea> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tareas before and after the current tarea in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param tareaId the primary key of the current tarea
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tarea
	 * @throws NoSuchTareaException if a tarea with the primary key could not be found
	 */
	@Override
	public Tarea[] findByUuid_C_PrevAndNext(
			long tareaId, String uuid, long companyId,
			OrderByComparator<Tarea> orderByComparator)
		throws NoSuchTareaException {

		uuid = Objects.toString(uuid, "");

		Tarea tarea = findByPrimaryKey(tareaId);

		Session session = null;

		try {
			session = openSession();

			Tarea[] array = new TareaImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, tarea, uuid, companyId, orderByComparator, true);

			array[1] = tarea;

			array[2] = getByUuid_C_PrevAndNext(
				session, tarea, uuid, companyId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Tarea getByUuid_C_PrevAndNext(
		Session session, Tarea tarea, String uuid, long companyId,
		OrderByComparator<Tarea> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_TAREA_WHERE);

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
			sb.append(TareaModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(tarea)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Tarea> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tareas where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (Tarea tarea :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(tarea);
		}
	}

	/**
	 * Returns the number of tareas where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching tareas
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_TAREA_WHERE);

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
		"tarea.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(tarea.uuid IS NULL OR tarea.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"tarea.companyId = ?";

	private FinderPath _finderPathWithPaginationFindByNombreTarea;
	private FinderPath _finderPathWithoutPaginationFindByNombreTarea;
	private FinderPath _finderPathCountByNombreTarea;

	/**
	 * Returns all the tareas where nombreTarea = &#63;.
	 *
	 * @param nombreTarea the nombre tarea
	 * @return the matching tareas
	 */
	@Override
	public List<Tarea> findByNombreTarea(String nombreTarea) {
		return findByNombreTarea(
			nombreTarea, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tareas where nombreTarea = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TareaModelImpl</code>.
	 * </p>
	 *
	 * @param nombreTarea the nombre tarea
	 * @param start the lower bound of the range of tareas
	 * @param end the upper bound of the range of tareas (not inclusive)
	 * @return the range of matching tareas
	 */
	@Override
	public List<Tarea> findByNombreTarea(
		String nombreTarea, int start, int end) {

		return findByNombreTarea(nombreTarea, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tareas where nombreTarea = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TareaModelImpl</code>.
	 * </p>
	 *
	 * @param nombreTarea the nombre tarea
	 * @param start the lower bound of the range of tareas
	 * @param end the upper bound of the range of tareas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tareas
	 */
	@Override
	public List<Tarea> findByNombreTarea(
		String nombreTarea, int start, int end,
		OrderByComparator<Tarea> orderByComparator) {

		return findByNombreTarea(
			nombreTarea, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tareas where nombreTarea = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TareaModelImpl</code>.
	 * </p>
	 *
	 * @param nombreTarea the nombre tarea
	 * @param start the lower bound of the range of tareas
	 * @param end the upper bound of the range of tareas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching tareas
	 */
	@Override
	public List<Tarea> findByNombreTarea(
		String nombreTarea, int start, int end,
		OrderByComparator<Tarea> orderByComparator, boolean useFinderCache) {

		nombreTarea = Objects.toString(nombreTarea, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByNombreTarea;
				finderArgs = new Object[] {nombreTarea};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByNombreTarea;
			finderArgs = new Object[] {
				nombreTarea, start, end, orderByComparator
			};
		}

		List<Tarea> list = null;

		if (useFinderCache) {
			list = (List<Tarea>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Tarea tarea : list) {
					if (!nombreTarea.equals(tarea.getNombreTarea())) {
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

			sb.append(_SQL_SELECT_TAREA_WHERE);

			boolean bindNombreTarea = false;

			if (nombreTarea.isEmpty()) {
				sb.append(_FINDER_COLUMN_NOMBRETAREA_NOMBRETAREA_3);
			}
			else {
				bindNombreTarea = true;

				sb.append(_FINDER_COLUMN_NOMBRETAREA_NOMBRETAREA_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(TareaModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindNombreTarea) {
					queryPos.add(nombreTarea);
				}

				list = (List<Tarea>)QueryUtil.list(
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
	 * Returns the first tarea in the ordered set where nombreTarea = &#63;.
	 *
	 * @param nombreTarea the nombre tarea
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tarea
	 * @throws NoSuchTareaException if a matching tarea could not be found
	 */
	@Override
	public Tarea findByNombreTarea_First(
			String nombreTarea, OrderByComparator<Tarea> orderByComparator)
		throws NoSuchTareaException {

		Tarea tarea = fetchByNombreTarea_First(nombreTarea, orderByComparator);

		if (tarea != null) {
			return tarea;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("nombreTarea=");
		sb.append(nombreTarea);

		sb.append("}");

		throw new NoSuchTareaException(sb.toString());
	}

	/**
	 * Returns the first tarea in the ordered set where nombreTarea = &#63;.
	 *
	 * @param nombreTarea the nombre tarea
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tarea, or <code>null</code> if a matching tarea could not be found
	 */
	@Override
	public Tarea fetchByNombreTarea_First(
		String nombreTarea, OrderByComparator<Tarea> orderByComparator) {

		List<Tarea> list = findByNombreTarea(
			nombreTarea, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tarea in the ordered set where nombreTarea = &#63;.
	 *
	 * @param nombreTarea the nombre tarea
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tarea
	 * @throws NoSuchTareaException if a matching tarea could not be found
	 */
	@Override
	public Tarea findByNombreTarea_Last(
			String nombreTarea, OrderByComparator<Tarea> orderByComparator)
		throws NoSuchTareaException {

		Tarea tarea = fetchByNombreTarea_Last(nombreTarea, orderByComparator);

		if (tarea != null) {
			return tarea;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("nombreTarea=");
		sb.append(nombreTarea);

		sb.append("}");

		throw new NoSuchTareaException(sb.toString());
	}

	/**
	 * Returns the last tarea in the ordered set where nombreTarea = &#63;.
	 *
	 * @param nombreTarea the nombre tarea
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tarea, or <code>null</code> if a matching tarea could not be found
	 */
	@Override
	public Tarea fetchByNombreTarea_Last(
		String nombreTarea, OrderByComparator<Tarea> orderByComparator) {

		int count = countByNombreTarea(nombreTarea);

		if (count == 0) {
			return null;
		}

		List<Tarea> list = findByNombreTarea(
			nombreTarea, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tareas before and after the current tarea in the ordered set where nombreTarea = &#63;.
	 *
	 * @param tareaId the primary key of the current tarea
	 * @param nombreTarea the nombre tarea
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tarea
	 * @throws NoSuchTareaException if a tarea with the primary key could not be found
	 */
	@Override
	public Tarea[] findByNombreTarea_PrevAndNext(
			long tareaId, String nombreTarea,
			OrderByComparator<Tarea> orderByComparator)
		throws NoSuchTareaException {

		nombreTarea = Objects.toString(nombreTarea, "");

		Tarea tarea = findByPrimaryKey(tareaId);

		Session session = null;

		try {
			session = openSession();

			Tarea[] array = new TareaImpl[3];

			array[0] = getByNombreTarea_PrevAndNext(
				session, tarea, nombreTarea, orderByComparator, true);

			array[1] = tarea;

			array[2] = getByNombreTarea_PrevAndNext(
				session, tarea, nombreTarea, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Tarea getByNombreTarea_PrevAndNext(
		Session session, Tarea tarea, String nombreTarea,
		OrderByComparator<Tarea> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_TAREA_WHERE);

		boolean bindNombreTarea = false;

		if (nombreTarea.isEmpty()) {
			sb.append(_FINDER_COLUMN_NOMBRETAREA_NOMBRETAREA_3);
		}
		else {
			bindNombreTarea = true;

			sb.append(_FINDER_COLUMN_NOMBRETAREA_NOMBRETAREA_2);
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
			sb.append(TareaModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindNombreTarea) {
			queryPos.add(nombreTarea);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(tarea)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Tarea> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tareas where nombreTarea = &#63; from the database.
	 *
	 * @param nombreTarea the nombre tarea
	 */
	@Override
	public void removeByNombreTarea(String nombreTarea) {
		for (Tarea tarea :
				findByNombreTarea(
					nombreTarea, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(tarea);
		}
	}

	/**
	 * Returns the number of tareas where nombreTarea = &#63;.
	 *
	 * @param nombreTarea the nombre tarea
	 * @return the number of matching tareas
	 */
	@Override
	public int countByNombreTarea(String nombreTarea) {
		nombreTarea = Objects.toString(nombreTarea, "");

		FinderPath finderPath = _finderPathCountByNombreTarea;

		Object[] finderArgs = new Object[] {nombreTarea};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_TAREA_WHERE);

			boolean bindNombreTarea = false;

			if (nombreTarea.isEmpty()) {
				sb.append(_FINDER_COLUMN_NOMBRETAREA_NOMBRETAREA_3);
			}
			else {
				bindNombreTarea = true;

				sb.append(_FINDER_COLUMN_NOMBRETAREA_NOMBRETAREA_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindNombreTarea) {
					queryPos.add(nombreTarea);
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

	private static final String _FINDER_COLUMN_NOMBRETAREA_NOMBRETAREA_2 =
		"tarea.nombreTarea = ?";

	private static final String _FINDER_COLUMN_NOMBRETAREA_NOMBRETAREA_3 =
		"(tarea.nombreTarea IS NULL OR tarea.nombreTarea = '')";

	public TareaPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(Tarea.class);

		setModelImplClass(TareaImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the tarea in the entity cache if it is enabled.
	 *
	 * @param tarea the tarea
	 */
	@Override
	public void cacheResult(Tarea tarea) {
		entityCache.putResult(TareaImpl.class, tarea.getPrimaryKey(), tarea);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {tarea.getUuid(), tarea.getGroupId()}, tarea);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the tareas in the entity cache if it is enabled.
	 *
	 * @param tareas the tareas
	 */
	@Override
	public void cacheResult(List<Tarea> tareas) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (tareas.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Tarea tarea : tareas) {
			if (entityCache.getResult(TareaImpl.class, tarea.getPrimaryKey()) ==
					null) {

				cacheResult(tarea);
			}
		}
	}

	/**
	 * Clears the cache for all tareas.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TareaImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the tarea.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Tarea tarea) {
		entityCache.removeResult(TareaImpl.class, tarea);
	}

	@Override
	public void clearCache(List<Tarea> tareas) {
		for (Tarea tarea : tareas) {
			entityCache.removeResult(TareaImpl.class, tarea);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(TareaImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(TareaModelImpl tareaModelImpl) {
		Object[] args = new Object[] {
			tareaModelImpl.getUuid(), tareaModelImpl.getGroupId()
		};

		finderCache.putResult(
			_finderPathCountByUUID_G, args, Long.valueOf(1), false);
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, tareaModelImpl, false);
	}

	/**
	 * Creates a new tarea with the primary key. Does not add the tarea to the database.
	 *
	 * @param tareaId the primary key for the new tarea
	 * @return the new tarea
	 */
	@Override
	public Tarea create(long tareaId) {
		Tarea tarea = new TareaImpl();

		tarea.setNew(true);
		tarea.setPrimaryKey(tareaId);

		String uuid = PortalUUIDUtil.generate();

		tarea.setUuid(uuid);

		tarea.setCompanyId(CompanyThreadLocal.getCompanyId());

		return tarea;
	}

	/**
	 * Removes the tarea with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tareaId the primary key of the tarea
	 * @return the tarea that was removed
	 * @throws NoSuchTareaException if a tarea with the primary key could not be found
	 */
	@Override
	public Tarea remove(long tareaId) throws NoSuchTareaException {
		return remove((Serializable)tareaId);
	}

	/**
	 * Removes the tarea with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tarea
	 * @return the tarea that was removed
	 * @throws NoSuchTareaException if a tarea with the primary key could not be found
	 */
	@Override
	public Tarea remove(Serializable primaryKey) throws NoSuchTareaException {
		Session session = null;

		try {
			session = openSession();

			Tarea tarea = (Tarea)session.get(TareaImpl.class, primaryKey);

			if (tarea == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTareaException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(tarea);
		}
		catch (NoSuchTareaException noSuchEntityException) {
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
	protected Tarea removeImpl(Tarea tarea) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tarea)) {
				tarea = (Tarea)session.get(
					TareaImpl.class, tarea.getPrimaryKeyObj());
			}

			if (tarea != null) {
				session.delete(tarea);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (tarea != null) {
			clearCache(tarea);
		}

		return tarea;
	}

	@Override
	public Tarea updateImpl(Tarea tarea) {
		boolean isNew = tarea.isNew();

		if (!(tarea instanceof TareaModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(tarea.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(tarea);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in tarea proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Tarea implementation " +
					tarea.getClass());
		}

		TareaModelImpl tareaModelImpl = (TareaModelImpl)tarea;

		if (Validator.isNull(tarea.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			tarea.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (tarea.getCreateDate() == null)) {
			if (serviceContext == null) {
				tarea.setCreateDate(date);
			}
			else {
				tarea.setCreateDate(serviceContext.getCreateDate(date));
			}
		}

		if (!tareaModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				tarea.setModifiedDate(date);
			}
			else {
				tarea.setModifiedDate(serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(tarea);
			}
			else {
				tarea = (Tarea)session.merge(tarea);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(TareaImpl.class, tareaModelImpl, false, true);

		cacheUniqueFindersCache(tareaModelImpl);

		if (isNew) {
			tarea.setNew(false);
		}

		tarea.resetOriginalValues();

		return tarea;
	}

	/**
	 * Returns the tarea with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tarea
	 * @return the tarea
	 * @throws NoSuchTareaException if a tarea with the primary key could not be found
	 */
	@Override
	public Tarea findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTareaException {

		Tarea tarea = fetchByPrimaryKey(primaryKey);

		if (tarea == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTareaException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return tarea;
	}

	/**
	 * Returns the tarea with the primary key or throws a <code>NoSuchTareaException</code> if it could not be found.
	 *
	 * @param tareaId the primary key of the tarea
	 * @return the tarea
	 * @throws NoSuchTareaException if a tarea with the primary key could not be found
	 */
	@Override
	public Tarea findByPrimaryKey(long tareaId) throws NoSuchTareaException {
		return findByPrimaryKey((Serializable)tareaId);
	}

	/**
	 * Returns the tarea with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tareaId the primary key of the tarea
	 * @return the tarea, or <code>null</code> if a tarea with the primary key could not be found
	 */
	@Override
	public Tarea fetchByPrimaryKey(long tareaId) {
		return fetchByPrimaryKey((Serializable)tareaId);
	}

	/**
	 * Returns all the tareas.
	 *
	 * @return the tareas
	 */
	@Override
	public List<Tarea> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tareas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TareaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tareas
	 * @param end the upper bound of the range of tareas (not inclusive)
	 * @return the range of tareas
	 */
	@Override
	public List<Tarea> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tareas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TareaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tareas
	 * @param end the upper bound of the range of tareas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tareas
	 */
	@Override
	public List<Tarea> findAll(
		int start, int end, OrderByComparator<Tarea> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tareas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TareaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tareas
	 * @param end the upper bound of the range of tareas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tareas
	 */
	@Override
	public List<Tarea> findAll(
		int start, int end, OrderByComparator<Tarea> orderByComparator,
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

		List<Tarea> list = null;

		if (useFinderCache) {
			list = (List<Tarea>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_TAREA);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_TAREA;

				sql = sql.concat(TareaModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Tarea>)QueryUtil.list(
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
	 * Removes all the tareas from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Tarea tarea : findAll()) {
			remove(tarea);
		}
	}

	/**
	 * Returns the number of tareas.
	 *
	 * @return the number of tareas
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_TAREA);

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
		return "tareaId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_TAREA;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return TareaModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the tarea persistence.
	 */
	@Activate
	public void activate(BundleContext bundleContext) {
		_bundleContext = bundleContext;

		_argumentsResolverServiceRegistration = _bundleContext.registerService(
			ArgumentsResolver.class, new TareaModelArgumentsResolver(),
			MapUtil.singletonDictionary(
				"model.class.name", Tarea.class.getName()));

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

		_finderPathWithPaginationFindByNombreTarea = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByNombreTarea",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"nombreTarea"}, true);

		_finderPathWithoutPaginationFindByNombreTarea = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByNombreTarea",
			new String[] {String.class.getName()}, new String[] {"nombreTarea"},
			true);

		_finderPathCountByNombreTarea = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByNombreTarea",
			new String[] {String.class.getName()}, new String[] {"nombreTarea"},
			false);

		_setTareaUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setTareaUtilPersistence(null);

		entityCache.removeCache(TareaImpl.class.getName());

		_argumentsResolverServiceRegistration.unregister();

		for (ServiceRegistration<FinderPath> serviceRegistration :
				_serviceRegistrations) {

			serviceRegistration.unregister();
		}
	}

	private void _setTareaUtilPersistence(TareaPersistence tareaPersistence) {
		try {
			Field field = TareaUtil.class.getDeclaredField("_persistence");

			field.setAccessible(true);

			field.set(null, tareaPersistence);
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

	private static final String _SQL_SELECT_TAREA =
		"SELECT tarea FROM Tarea tarea";

	private static final String _SQL_SELECT_TAREA_WHERE =
		"SELECT tarea FROM Tarea tarea WHERE ";

	private static final String _SQL_COUNT_TAREA =
		"SELECT COUNT(tarea) FROM Tarea tarea";

	private static final String _SQL_COUNT_TAREA_WHERE =
		"SELECT COUNT(tarea) FROM Tarea tarea WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "tarea.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Tarea exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No Tarea exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		TareaPersistenceImpl.class);

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

	private static class TareaModelArgumentsResolver
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

			TareaModelImpl tareaModelImpl = (TareaModelImpl)baseModel;

			long columnBitmask = tareaModelImpl.getColumnBitmask();

			if (!checkColumn || (columnBitmask == 0)) {
				return _getValue(tareaModelImpl, columnNames, original);
			}

			Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
				finderPath);

			if (finderPathColumnBitmask == null) {
				finderPathColumnBitmask = 0L;

				for (String columnName : columnNames) {
					finderPathColumnBitmask |= tareaModelImpl.getColumnBitmask(
						columnName);
				}

				if (finderPath.isBaseModelResult() &&
					(TareaPersistenceImpl.
						FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION ==
							finderPath.getCacheName())) {

					finderPathColumnBitmask |= _ORDER_BY_COLUMNS_BITMASK;
				}

				_finderPathColumnBitmasksCache.put(
					finderPath, finderPathColumnBitmask);
			}

			if ((columnBitmask & finderPathColumnBitmask) != 0) {
				return _getValue(tareaModelImpl, columnNames, original);
			}

			return null;
		}

		private static Object[] _getValue(
			TareaModelImpl tareaModelImpl, String[] columnNames,
			boolean original) {

			Object[] arguments = new Object[columnNames.length];

			for (int i = 0; i < arguments.length; i++) {
				String columnName = columnNames[i];

				if (original) {
					arguments[i] = tareaModelImpl.getColumnOriginalValue(
						columnName);
				}
				else {
					arguments[i] = tareaModelImpl.getColumnValue(columnName);
				}
			}

			return arguments;
		}

		private static final Map<FinderPath, Long>
			_finderPathColumnBitmasksCache = new ConcurrentHashMap<>();

		private static final long _ORDER_BY_COLUMNS_BITMASK;

		static {
			long orderByColumnsBitmask = 0;

			orderByColumnsBitmask |= TareaModelImpl.getColumnBitmask(
				"nombreTarea");

			_ORDER_BY_COLUMNS_BITMASK = orderByColumnsBitmask;
		}

	}

}
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

import com.savvy.sb.exception.NoSuchSprintException;
import com.savvy.sb.model.Sprint;
import com.savvy.sb.model.impl.SprintImpl;
import com.savvy.sb.model.impl.SprintModelImpl;
import com.savvy.sb.service.persistence.SprintPersistence;
import com.savvy.sb.service.persistence.SprintUtil;
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
 * The persistence implementation for the sprint service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SprintPersistence.class)
public class SprintPersistenceImpl
	extends BasePersistenceImpl<Sprint> implements SprintPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SprintUtil</code> to access the sprint persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SprintImpl.class.getName();

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
	 * Returns all the sprints where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching sprints
	 */
	@Override
	public List<Sprint> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sprints where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SprintModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sprints
	 * @param end the upper bound of the range of sprints (not inclusive)
	 * @return the range of matching sprints
	 */
	@Override
	public List<Sprint> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the sprints where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SprintModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sprints
	 * @param end the upper bound of the range of sprints (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sprints
	 */
	@Override
	public List<Sprint> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Sprint> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sprints where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SprintModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sprints
	 * @param end the upper bound of the range of sprints (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sprints
	 */
	@Override
	public List<Sprint> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Sprint> orderByComparator, boolean useFinderCache) {

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

		List<Sprint> list = null;

		if (useFinderCache) {
			list = (List<Sprint>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Sprint sprint : list) {
					if (!uuid.equals(sprint.getUuid())) {
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

			sb.append(_SQL_SELECT_SPRINT_WHERE);

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
				sb.append(SprintModelImpl.ORDER_BY_JPQL);
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

				list = (List<Sprint>)QueryUtil.list(
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
	 * Returns the first sprint in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sprint
	 * @throws NoSuchSprintException if a matching sprint could not be found
	 */
	@Override
	public Sprint findByUuid_First(
			String uuid, OrderByComparator<Sprint> orderByComparator)
		throws NoSuchSprintException {

		Sprint sprint = fetchByUuid_First(uuid, orderByComparator);

		if (sprint != null) {
			return sprint;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchSprintException(sb.toString());
	}

	/**
	 * Returns the first sprint in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sprint, or <code>null</code> if a matching sprint could not be found
	 */
	@Override
	public Sprint fetchByUuid_First(
		String uuid, OrderByComparator<Sprint> orderByComparator) {

		List<Sprint> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last sprint in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sprint
	 * @throws NoSuchSprintException if a matching sprint could not be found
	 */
	@Override
	public Sprint findByUuid_Last(
			String uuid, OrderByComparator<Sprint> orderByComparator)
		throws NoSuchSprintException {

		Sprint sprint = fetchByUuid_Last(uuid, orderByComparator);

		if (sprint != null) {
			return sprint;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchSprintException(sb.toString());
	}

	/**
	 * Returns the last sprint in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sprint, or <code>null</code> if a matching sprint could not be found
	 */
	@Override
	public Sprint fetchByUuid_Last(
		String uuid, OrderByComparator<Sprint> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Sprint> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the sprints before and after the current sprint in the ordered set where uuid = &#63;.
	 *
	 * @param sprintId the primary key of the current sprint
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sprint
	 * @throws NoSuchSprintException if a sprint with the primary key could not be found
	 */
	@Override
	public Sprint[] findByUuid_PrevAndNext(
			long sprintId, String uuid,
			OrderByComparator<Sprint> orderByComparator)
		throws NoSuchSprintException {

		uuid = Objects.toString(uuid, "");

		Sprint sprint = findByPrimaryKey(sprintId);

		Session session = null;

		try {
			session = openSession();

			Sprint[] array = new SprintImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, sprint, uuid, orderByComparator, true);

			array[1] = sprint;

			array[2] = getByUuid_PrevAndNext(
				session, sprint, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Sprint getByUuid_PrevAndNext(
		Session session, Sprint sprint, String uuid,
		OrderByComparator<Sprint> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_SPRINT_WHERE);

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
			sb.append(SprintModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(sprint)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Sprint> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the sprints where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Sprint sprint :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(sprint);
		}
	}

	/**
	 * Returns the number of sprints where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching sprints
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SPRINT_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_UUID_2 = "sprint.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(sprint.uuid IS NULL OR sprint.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the sprint where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchSprintException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching sprint
	 * @throws NoSuchSprintException if a matching sprint could not be found
	 */
	@Override
	public Sprint findByUUID_G(String uuid, long groupId)
		throws NoSuchSprintException {

		Sprint sprint = fetchByUUID_G(uuid, groupId);

		if (sprint == null) {
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

			throw new NoSuchSprintException(sb.toString());
		}

		return sprint;
	}

	/**
	 * Returns the sprint where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching sprint, or <code>null</code> if a matching sprint could not be found
	 */
	@Override
	public Sprint fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the sprint where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sprint, or <code>null</code> if a matching sprint could not be found
	 */
	@Override
	public Sprint fetchByUUID_G(
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

		if (result instanceof Sprint) {
			Sprint sprint = (Sprint)result;

			if (!Objects.equals(uuid, sprint.getUuid()) ||
				(groupId != sprint.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_SPRINT_WHERE);

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

				List<Sprint> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					Sprint sprint = list.get(0);

					result = sprint;

					cacheResult(sprint);
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
			return (Sprint)result;
		}
	}

	/**
	 * Removes the sprint where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the sprint that was removed
	 */
	@Override
	public Sprint removeByUUID_G(String uuid, long groupId)
		throws NoSuchSprintException {

		Sprint sprint = findByUUID_G(uuid, groupId);

		return remove(sprint);
	}

	/**
	 * Returns the number of sprints where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching sprints
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_SPRINT_WHERE);

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
		"sprint.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(sprint.uuid IS NULL OR sprint.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"sprint.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the sprints where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching sprints
	 */
	@Override
	public List<Sprint> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sprints where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SprintModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of sprints
	 * @param end the upper bound of the range of sprints (not inclusive)
	 * @return the range of matching sprints
	 */
	@Override
	public List<Sprint> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the sprints where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SprintModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of sprints
	 * @param end the upper bound of the range of sprints (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sprints
	 */
	@Override
	public List<Sprint> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Sprint> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sprints where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SprintModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of sprints
	 * @param end the upper bound of the range of sprints (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sprints
	 */
	@Override
	public List<Sprint> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Sprint> orderByComparator, boolean useFinderCache) {

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

		List<Sprint> list = null;

		if (useFinderCache) {
			list = (List<Sprint>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Sprint sprint : list) {
					if (!uuid.equals(sprint.getUuid()) ||
						(companyId != sprint.getCompanyId())) {

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

			sb.append(_SQL_SELECT_SPRINT_WHERE);

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
				sb.append(SprintModelImpl.ORDER_BY_JPQL);
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

				list = (List<Sprint>)QueryUtil.list(
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
	 * Returns the first sprint in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sprint
	 * @throws NoSuchSprintException if a matching sprint could not be found
	 */
	@Override
	public Sprint findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Sprint> orderByComparator)
		throws NoSuchSprintException {

		Sprint sprint = fetchByUuid_C_First(uuid, companyId, orderByComparator);

		if (sprint != null) {
			return sprint;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchSprintException(sb.toString());
	}

	/**
	 * Returns the first sprint in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sprint, or <code>null</code> if a matching sprint could not be found
	 */
	@Override
	public Sprint fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Sprint> orderByComparator) {

		List<Sprint> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last sprint in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sprint
	 * @throws NoSuchSprintException if a matching sprint could not be found
	 */
	@Override
	public Sprint findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Sprint> orderByComparator)
		throws NoSuchSprintException {

		Sprint sprint = fetchByUuid_C_Last(uuid, companyId, orderByComparator);

		if (sprint != null) {
			return sprint;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchSprintException(sb.toString());
	}

	/**
	 * Returns the last sprint in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sprint, or <code>null</code> if a matching sprint could not be found
	 */
	@Override
	public Sprint fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Sprint> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<Sprint> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the sprints before and after the current sprint in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param sprintId the primary key of the current sprint
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sprint
	 * @throws NoSuchSprintException if a sprint with the primary key could not be found
	 */
	@Override
	public Sprint[] findByUuid_C_PrevAndNext(
			long sprintId, String uuid, long companyId,
			OrderByComparator<Sprint> orderByComparator)
		throws NoSuchSprintException {

		uuid = Objects.toString(uuid, "");

		Sprint sprint = findByPrimaryKey(sprintId);

		Session session = null;

		try {
			session = openSession();

			Sprint[] array = new SprintImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, sprint, uuid, companyId, orderByComparator, true);

			array[1] = sprint;

			array[2] = getByUuid_C_PrevAndNext(
				session, sprint, uuid, companyId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Sprint getByUuid_C_PrevAndNext(
		Session session, Sprint sprint, String uuid, long companyId,
		OrderByComparator<Sprint> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_SPRINT_WHERE);

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
			sb.append(SprintModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(sprint)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Sprint> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the sprints where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (Sprint sprint :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(sprint);
		}
	}

	/**
	 * Returns the number of sprints where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching sprints
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_SPRINT_WHERE);

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
		"sprint.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(sprint.uuid IS NULL OR sprint.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"sprint.companyId = ?";

	private FinderPath _finderPathWithPaginationFindByTituloSprint;
	private FinderPath _finderPathWithoutPaginationFindByTituloSprint;
	private FinderPath _finderPathCountByTituloSprint;

	/**
	 * Returns all the sprints where tituloSprint = &#63;.
	 *
	 * @param tituloSprint the titulo sprint
	 * @return the matching sprints
	 */
	@Override
	public List<Sprint> findByTituloSprint(String tituloSprint) {
		return findByTituloSprint(
			tituloSprint, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sprints where tituloSprint = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SprintModelImpl</code>.
	 * </p>
	 *
	 * @param tituloSprint the titulo sprint
	 * @param start the lower bound of the range of sprints
	 * @param end the upper bound of the range of sprints (not inclusive)
	 * @return the range of matching sprints
	 */
	@Override
	public List<Sprint> findByTituloSprint(
		String tituloSprint, int start, int end) {

		return findByTituloSprint(tituloSprint, start, end, null);
	}

	/**
	 * Returns an ordered range of all the sprints where tituloSprint = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SprintModelImpl</code>.
	 * </p>
	 *
	 * @param tituloSprint the titulo sprint
	 * @param start the lower bound of the range of sprints
	 * @param end the upper bound of the range of sprints (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sprints
	 */
	@Override
	public List<Sprint> findByTituloSprint(
		String tituloSprint, int start, int end,
		OrderByComparator<Sprint> orderByComparator) {

		return findByTituloSprint(
			tituloSprint, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sprints where tituloSprint = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SprintModelImpl</code>.
	 * </p>
	 *
	 * @param tituloSprint the titulo sprint
	 * @param start the lower bound of the range of sprints
	 * @param end the upper bound of the range of sprints (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sprints
	 */
	@Override
	public List<Sprint> findByTituloSprint(
		String tituloSprint, int start, int end,
		OrderByComparator<Sprint> orderByComparator, boolean useFinderCache) {

		tituloSprint = Objects.toString(tituloSprint, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByTituloSprint;
				finderArgs = new Object[] {tituloSprint};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByTituloSprint;
			finderArgs = new Object[] {
				tituloSprint, start, end, orderByComparator
			};
		}

		List<Sprint> list = null;

		if (useFinderCache) {
			list = (List<Sprint>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Sprint sprint : list) {
					if (!tituloSprint.equals(sprint.getTituloSprint())) {
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

			sb.append(_SQL_SELECT_SPRINT_WHERE);

			boolean bindTituloSprint = false;

			if (tituloSprint.isEmpty()) {
				sb.append(_FINDER_COLUMN_TITULOSPRINT_TITULOSPRINT_3);
			}
			else {
				bindTituloSprint = true;

				sb.append(_FINDER_COLUMN_TITULOSPRINT_TITULOSPRINT_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(SprintModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindTituloSprint) {
					queryPos.add(tituloSprint);
				}

				list = (List<Sprint>)QueryUtil.list(
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
	 * Returns the first sprint in the ordered set where tituloSprint = &#63;.
	 *
	 * @param tituloSprint the titulo sprint
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sprint
	 * @throws NoSuchSprintException if a matching sprint could not be found
	 */
	@Override
	public Sprint findByTituloSprint_First(
			String tituloSprint, OrderByComparator<Sprint> orderByComparator)
		throws NoSuchSprintException {

		Sprint sprint = fetchByTituloSprint_First(
			tituloSprint, orderByComparator);

		if (sprint != null) {
			return sprint;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("tituloSprint=");
		sb.append(tituloSprint);

		sb.append("}");

		throw new NoSuchSprintException(sb.toString());
	}

	/**
	 * Returns the first sprint in the ordered set where tituloSprint = &#63;.
	 *
	 * @param tituloSprint the titulo sprint
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sprint, or <code>null</code> if a matching sprint could not be found
	 */
	@Override
	public Sprint fetchByTituloSprint_First(
		String tituloSprint, OrderByComparator<Sprint> orderByComparator) {

		List<Sprint> list = findByTituloSprint(
			tituloSprint, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last sprint in the ordered set where tituloSprint = &#63;.
	 *
	 * @param tituloSprint the titulo sprint
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sprint
	 * @throws NoSuchSprintException if a matching sprint could not be found
	 */
	@Override
	public Sprint findByTituloSprint_Last(
			String tituloSprint, OrderByComparator<Sprint> orderByComparator)
		throws NoSuchSprintException {

		Sprint sprint = fetchByTituloSprint_Last(
			tituloSprint, orderByComparator);

		if (sprint != null) {
			return sprint;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("tituloSprint=");
		sb.append(tituloSprint);

		sb.append("}");

		throw new NoSuchSprintException(sb.toString());
	}

	/**
	 * Returns the last sprint in the ordered set where tituloSprint = &#63;.
	 *
	 * @param tituloSprint the titulo sprint
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sprint, or <code>null</code> if a matching sprint could not be found
	 */
	@Override
	public Sprint fetchByTituloSprint_Last(
		String tituloSprint, OrderByComparator<Sprint> orderByComparator) {

		int count = countByTituloSprint(tituloSprint);

		if (count == 0) {
			return null;
		}

		List<Sprint> list = findByTituloSprint(
			tituloSprint, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the sprints before and after the current sprint in the ordered set where tituloSprint = &#63;.
	 *
	 * @param sprintId the primary key of the current sprint
	 * @param tituloSprint the titulo sprint
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sprint
	 * @throws NoSuchSprintException if a sprint with the primary key could not be found
	 */
	@Override
	public Sprint[] findByTituloSprint_PrevAndNext(
			long sprintId, String tituloSprint,
			OrderByComparator<Sprint> orderByComparator)
		throws NoSuchSprintException {

		tituloSprint = Objects.toString(tituloSprint, "");

		Sprint sprint = findByPrimaryKey(sprintId);

		Session session = null;

		try {
			session = openSession();

			Sprint[] array = new SprintImpl[3];

			array[0] = getByTituloSprint_PrevAndNext(
				session, sprint, tituloSprint, orderByComparator, true);

			array[1] = sprint;

			array[2] = getByTituloSprint_PrevAndNext(
				session, sprint, tituloSprint, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Sprint getByTituloSprint_PrevAndNext(
		Session session, Sprint sprint, String tituloSprint,
		OrderByComparator<Sprint> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_SPRINT_WHERE);

		boolean bindTituloSprint = false;

		if (tituloSprint.isEmpty()) {
			sb.append(_FINDER_COLUMN_TITULOSPRINT_TITULOSPRINT_3);
		}
		else {
			bindTituloSprint = true;

			sb.append(_FINDER_COLUMN_TITULOSPRINT_TITULOSPRINT_2);
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
			sb.append(SprintModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindTituloSprint) {
			queryPos.add(tituloSprint);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(sprint)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Sprint> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the sprints where tituloSprint = &#63; from the database.
	 *
	 * @param tituloSprint the titulo sprint
	 */
	@Override
	public void removeByTituloSprint(String tituloSprint) {
		for (Sprint sprint :
				findByTituloSprint(
					tituloSprint, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(sprint);
		}
	}

	/**
	 * Returns the number of sprints where tituloSprint = &#63;.
	 *
	 * @param tituloSprint the titulo sprint
	 * @return the number of matching sprints
	 */
	@Override
	public int countByTituloSprint(String tituloSprint) {
		tituloSprint = Objects.toString(tituloSprint, "");

		FinderPath finderPath = _finderPathCountByTituloSprint;

		Object[] finderArgs = new Object[] {tituloSprint};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SPRINT_WHERE);

			boolean bindTituloSprint = false;

			if (tituloSprint.isEmpty()) {
				sb.append(_FINDER_COLUMN_TITULOSPRINT_TITULOSPRINT_3);
			}
			else {
				bindTituloSprint = true;

				sb.append(_FINDER_COLUMN_TITULOSPRINT_TITULOSPRINT_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindTituloSprint) {
					queryPos.add(tituloSprint);
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

	private static final String _FINDER_COLUMN_TITULOSPRINT_TITULOSPRINT_2 =
		"sprint.tituloSprint = ?";

	private static final String _FINDER_COLUMN_TITULOSPRINT_TITULOSPRINT_3 =
		"(sprint.tituloSprint IS NULL OR sprint.tituloSprint = '')";

	public SprintPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(Sprint.class);

		setModelImplClass(SprintImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the sprint in the entity cache if it is enabled.
	 *
	 * @param sprint the sprint
	 */
	@Override
	public void cacheResult(Sprint sprint) {
		entityCache.putResult(SprintImpl.class, sprint.getPrimaryKey(), sprint);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {sprint.getUuid(), sprint.getGroupId()}, sprint);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the sprints in the entity cache if it is enabled.
	 *
	 * @param sprints the sprints
	 */
	@Override
	public void cacheResult(List<Sprint> sprints) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (sprints.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Sprint sprint : sprints) {
			if (entityCache.getResult(
					SprintImpl.class, sprint.getPrimaryKey()) == null) {

				cacheResult(sprint);
			}
		}
	}

	/**
	 * Clears the cache for all sprints.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SprintImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the sprint.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Sprint sprint) {
		entityCache.removeResult(SprintImpl.class, sprint);
	}

	@Override
	public void clearCache(List<Sprint> sprints) {
		for (Sprint sprint : sprints) {
			entityCache.removeResult(SprintImpl.class, sprint);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(SprintImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(SprintModelImpl sprintModelImpl) {
		Object[] args = new Object[] {
			sprintModelImpl.getUuid(), sprintModelImpl.getGroupId()
		};

		finderCache.putResult(
			_finderPathCountByUUID_G, args, Long.valueOf(1), false);
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, sprintModelImpl, false);
	}

	/**
	 * Creates a new sprint with the primary key. Does not add the sprint to the database.
	 *
	 * @param sprintId the primary key for the new sprint
	 * @return the new sprint
	 */
	@Override
	public Sprint create(long sprintId) {
		Sprint sprint = new SprintImpl();

		sprint.setNew(true);
		sprint.setPrimaryKey(sprintId);

		String uuid = PortalUUIDUtil.generate();

		sprint.setUuid(uuid);

		sprint.setCompanyId(CompanyThreadLocal.getCompanyId());

		return sprint;
	}

	/**
	 * Removes the sprint with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sprintId the primary key of the sprint
	 * @return the sprint that was removed
	 * @throws NoSuchSprintException if a sprint with the primary key could not be found
	 */
	@Override
	public Sprint remove(long sprintId) throws NoSuchSprintException {
		return remove((Serializable)sprintId);
	}

	/**
	 * Removes the sprint with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sprint
	 * @return the sprint that was removed
	 * @throws NoSuchSprintException if a sprint with the primary key could not be found
	 */
	@Override
	public Sprint remove(Serializable primaryKey) throws NoSuchSprintException {
		Session session = null;

		try {
			session = openSession();

			Sprint sprint = (Sprint)session.get(SprintImpl.class, primaryKey);

			if (sprint == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSprintException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sprint);
		}
		catch (NoSuchSprintException noSuchEntityException) {
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
	protected Sprint removeImpl(Sprint sprint) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sprint)) {
				sprint = (Sprint)session.get(
					SprintImpl.class, sprint.getPrimaryKeyObj());
			}

			if (sprint != null) {
				session.delete(sprint);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sprint != null) {
			clearCache(sprint);
		}

		return sprint;
	}

	@Override
	public Sprint updateImpl(Sprint sprint) {
		boolean isNew = sprint.isNew();

		if (!(sprint instanceof SprintModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(sprint.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(sprint);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sprint proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Sprint implementation " +
					sprint.getClass());
		}

		SprintModelImpl sprintModelImpl = (SprintModelImpl)sprint;

		if (Validator.isNull(sprint.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			sprint.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (sprint.getCreateDate() == null)) {
			if (serviceContext == null) {
				sprint.setCreateDate(date);
			}
			else {
				sprint.setCreateDate(serviceContext.getCreateDate(date));
			}
		}

		if (!sprintModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				sprint.setModifiedDate(date);
			}
			else {
				sprint.setModifiedDate(serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sprint);
			}
			else {
				sprint = (Sprint)session.merge(sprint);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(SprintImpl.class, sprintModelImpl, false, true);

		cacheUniqueFindersCache(sprintModelImpl);

		if (isNew) {
			sprint.setNew(false);
		}

		sprint.resetOriginalValues();

		return sprint;
	}

	/**
	 * Returns the sprint with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sprint
	 * @return the sprint
	 * @throws NoSuchSprintException if a sprint with the primary key could not be found
	 */
	@Override
	public Sprint findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSprintException {

		Sprint sprint = fetchByPrimaryKey(primaryKey);

		if (sprint == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSprintException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sprint;
	}

	/**
	 * Returns the sprint with the primary key or throws a <code>NoSuchSprintException</code> if it could not be found.
	 *
	 * @param sprintId the primary key of the sprint
	 * @return the sprint
	 * @throws NoSuchSprintException if a sprint with the primary key could not be found
	 */
	@Override
	public Sprint findByPrimaryKey(long sprintId) throws NoSuchSprintException {
		return findByPrimaryKey((Serializable)sprintId);
	}

	/**
	 * Returns the sprint with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sprintId the primary key of the sprint
	 * @return the sprint, or <code>null</code> if a sprint with the primary key could not be found
	 */
	@Override
	public Sprint fetchByPrimaryKey(long sprintId) {
		return fetchByPrimaryKey((Serializable)sprintId);
	}

	/**
	 * Returns all the sprints.
	 *
	 * @return the sprints
	 */
	@Override
	public List<Sprint> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sprints.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SprintModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sprints
	 * @param end the upper bound of the range of sprints (not inclusive)
	 * @return the range of sprints
	 */
	@Override
	public List<Sprint> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sprints.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SprintModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sprints
	 * @param end the upper bound of the range of sprints (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sprints
	 */
	@Override
	public List<Sprint> findAll(
		int start, int end, OrderByComparator<Sprint> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sprints.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SprintModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sprints
	 * @param end the upper bound of the range of sprints (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sprints
	 */
	@Override
	public List<Sprint> findAll(
		int start, int end, OrderByComparator<Sprint> orderByComparator,
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

		List<Sprint> list = null;

		if (useFinderCache) {
			list = (List<Sprint>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SPRINT);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SPRINT;

				sql = sql.concat(SprintModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Sprint>)QueryUtil.list(
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
	 * Removes all the sprints from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Sprint sprint : findAll()) {
			remove(sprint);
		}
	}

	/**
	 * Returns the number of sprints.
	 *
	 * @return the number of sprints
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_SPRINT);

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
		return "sprintId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SPRINT;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SprintModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sprint persistence.
	 */
	@Activate
	public void activate(BundleContext bundleContext) {
		_bundleContext = bundleContext;

		_argumentsResolverServiceRegistration = _bundleContext.registerService(
			ArgumentsResolver.class, new SprintModelArgumentsResolver(),
			MapUtil.singletonDictionary(
				"model.class.name", Sprint.class.getName()));

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

		_finderPathWithPaginationFindByTituloSprint = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByTituloSprint",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"tituloSprint"}, true);

		_finderPathWithoutPaginationFindByTituloSprint = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByTituloSprint",
			new String[] {String.class.getName()},
			new String[] {"tituloSprint"}, true);

		_finderPathCountByTituloSprint = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTituloSprint",
			new String[] {String.class.getName()},
			new String[] {"tituloSprint"}, false);

		_setSprintUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setSprintUtilPersistence(null);

		entityCache.removeCache(SprintImpl.class.getName());

		_argumentsResolverServiceRegistration.unregister();

		for (ServiceRegistration<FinderPath> serviceRegistration :
				_serviceRegistrations) {

			serviceRegistration.unregister();
		}
	}

	private void _setSprintUtilPersistence(
		SprintPersistence sprintPersistence) {

		try {
			Field field = SprintUtil.class.getDeclaredField("_persistence");

			field.setAccessible(true);

			field.set(null, sprintPersistence);
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

	private static final String _SQL_SELECT_SPRINT =
		"SELECT sprint FROM Sprint sprint";

	private static final String _SQL_SELECT_SPRINT_WHERE =
		"SELECT sprint FROM Sprint sprint WHERE ";

	private static final String _SQL_COUNT_SPRINT =
		"SELECT COUNT(sprint) FROM Sprint sprint";

	private static final String _SQL_COUNT_SPRINT_WHERE =
		"SELECT COUNT(sprint) FROM Sprint sprint WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "sprint.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Sprint exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No Sprint exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SprintPersistenceImpl.class);

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

	private static class SprintModelArgumentsResolver
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

			SprintModelImpl sprintModelImpl = (SprintModelImpl)baseModel;

			long columnBitmask = sprintModelImpl.getColumnBitmask();

			if (!checkColumn || (columnBitmask == 0)) {
				return _getValue(sprintModelImpl, columnNames, original);
			}

			Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
				finderPath);

			if (finderPathColumnBitmask == null) {
				finderPathColumnBitmask = 0L;

				for (String columnName : columnNames) {
					finderPathColumnBitmask |= sprintModelImpl.getColumnBitmask(
						columnName);
				}

				if (finderPath.isBaseModelResult() &&
					(SprintPersistenceImpl.
						FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION ==
							finderPath.getCacheName())) {

					finderPathColumnBitmask |= _ORDER_BY_COLUMNS_BITMASK;
				}

				_finderPathColumnBitmasksCache.put(
					finderPath, finderPathColumnBitmask);
			}

			if ((columnBitmask & finderPathColumnBitmask) != 0) {
				return _getValue(sprintModelImpl, columnNames, original);
			}

			return null;
		}

		private static Object[] _getValue(
			SprintModelImpl sprintModelImpl, String[] columnNames,
			boolean original) {

			Object[] arguments = new Object[columnNames.length];

			for (int i = 0; i < arguments.length; i++) {
				String columnName = columnNames[i];

				if (original) {
					arguments[i] = sprintModelImpl.getColumnOriginalValue(
						columnName);
				}
				else {
					arguments[i] = sprintModelImpl.getColumnValue(columnName);
				}
			}

			return arguments;
		}

		private static final Map<FinderPath, Long>
			_finderPathColumnBitmasksCache = new ConcurrentHashMap<>();

		private static final long _ORDER_BY_COLUMNS_BITMASK;

		static {
			long orderByColumnsBitmask = 0;

			orderByColumnsBitmask |= SprintModelImpl.getColumnBitmask(
				"tituloSprint");

			_ORDER_BY_COLUMNS_BITMASK = orderByColumnsBitmask;
		}

	}

}
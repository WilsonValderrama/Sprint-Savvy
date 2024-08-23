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

package com.aula.sb.service.persistence.impl;

import com.aula.sb.exception.NoSuchT_Ul_CalificacionException;
import com.aula.sb.model.T_Ul_Calificacion;
import com.aula.sb.model.impl.T_Ul_CalificacionImpl;
import com.aula.sb.model.impl.T_Ul_CalificacionModelImpl;
import com.aula.sb.service.persistence.T_Ul_CalificacionPersistence;
import com.aula.sb.service.persistence.T_Ul_CalificacionUtil;
import com.aula.sb.service.persistence.impl.constants.AulaVirtualPersistenceConstants;

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
 * The persistence implementation for the t_ ul_ calificacion service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = T_Ul_CalificacionPersistence.class)
public class T_Ul_CalificacionPersistenceImpl
	extends BasePersistenceImpl<T_Ul_Calificacion>
	implements T_Ul_CalificacionPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>T_Ul_CalificacionUtil</code> to access the t_ ul_ calificacion persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		T_Ul_CalificacionImpl.class.getName();

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
	 * Returns all the t_ ul_ calificacions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching t_ ul_ calificacions
	 */
	@Override
	public List<T_Ul_Calificacion> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the t_ ul_ calificacions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_CalificacionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of t_ ul_ calificacions
	 * @param end the upper bound of the range of t_ ul_ calificacions (not inclusive)
	 * @return the range of matching t_ ul_ calificacions
	 */
	@Override
	public List<T_Ul_Calificacion> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the t_ ul_ calificacions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_CalificacionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of t_ ul_ calificacions
	 * @param end the upper bound of the range of t_ ul_ calificacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t_ ul_ calificacions
	 */
	@Override
	public List<T_Ul_Calificacion> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<T_Ul_Calificacion> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the t_ ul_ calificacions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_CalificacionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of t_ ul_ calificacions
	 * @param end the upper bound of the range of t_ ul_ calificacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching t_ ul_ calificacions
	 */
	@Override
	public List<T_Ul_Calificacion> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<T_Ul_Calificacion> orderByComparator,
		boolean useFinderCache) {

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

		List<T_Ul_Calificacion> list = null;

		if (useFinderCache) {
			list = (List<T_Ul_Calificacion>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (T_Ul_Calificacion t_Ul_Calificacion : list) {
					if (!uuid.equals(t_Ul_Calificacion.getUuid())) {
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

			sb.append(_SQL_SELECT_T_UL_CALIFICACION_WHERE);

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
				sb.append(T_Ul_CalificacionModelImpl.ORDER_BY_JPQL);
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

				list = (List<T_Ul_Calificacion>)QueryUtil.list(
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
	 * Returns the first t_ ul_ calificacion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ calificacion
	 * @throws NoSuchT_Ul_CalificacionException if a matching t_ ul_ calificacion could not be found
	 */
	@Override
	public T_Ul_Calificacion findByUuid_First(
			String uuid, OrderByComparator<T_Ul_Calificacion> orderByComparator)
		throws NoSuchT_Ul_CalificacionException {

		T_Ul_Calificacion t_Ul_Calificacion = fetchByUuid_First(
			uuid, orderByComparator);

		if (t_Ul_Calificacion != null) {
			return t_Ul_Calificacion;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchT_Ul_CalificacionException(sb.toString());
	}

	/**
	 * Returns the first t_ ul_ calificacion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ calificacion, or <code>null</code> if a matching t_ ul_ calificacion could not be found
	 */
	@Override
	public T_Ul_Calificacion fetchByUuid_First(
		String uuid, OrderByComparator<T_Ul_Calificacion> orderByComparator) {

		List<T_Ul_Calificacion> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last t_ ul_ calificacion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ calificacion
	 * @throws NoSuchT_Ul_CalificacionException if a matching t_ ul_ calificacion could not be found
	 */
	@Override
	public T_Ul_Calificacion findByUuid_Last(
			String uuid, OrderByComparator<T_Ul_Calificacion> orderByComparator)
		throws NoSuchT_Ul_CalificacionException {

		T_Ul_Calificacion t_Ul_Calificacion = fetchByUuid_Last(
			uuid, orderByComparator);

		if (t_Ul_Calificacion != null) {
			return t_Ul_Calificacion;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchT_Ul_CalificacionException(sb.toString());
	}

	/**
	 * Returns the last t_ ul_ calificacion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ calificacion, or <code>null</code> if a matching t_ ul_ calificacion could not be found
	 */
	@Override
	public T_Ul_Calificacion fetchByUuid_Last(
		String uuid, OrderByComparator<T_Ul_Calificacion> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<T_Ul_Calificacion> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the t_ ul_ calificacions before and after the current t_ ul_ calificacion in the ordered set where uuid = &#63;.
	 *
	 * @param idCalificacion the primary key of the current t_ ul_ calificacion
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t_ ul_ calificacion
	 * @throws NoSuchT_Ul_CalificacionException if a t_ ul_ calificacion with the primary key could not be found
	 */
	@Override
	public T_Ul_Calificacion[] findByUuid_PrevAndNext(
			long idCalificacion, String uuid,
			OrderByComparator<T_Ul_Calificacion> orderByComparator)
		throws NoSuchT_Ul_CalificacionException {

		uuid = Objects.toString(uuid, "");

		T_Ul_Calificacion t_Ul_Calificacion = findByPrimaryKey(idCalificacion);

		Session session = null;

		try {
			session = openSession();

			T_Ul_Calificacion[] array = new T_Ul_CalificacionImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, t_Ul_Calificacion, uuid, orderByComparator, true);

			array[1] = t_Ul_Calificacion;

			array[2] = getByUuid_PrevAndNext(
				session, t_Ul_Calificacion, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected T_Ul_Calificacion getByUuid_PrevAndNext(
		Session session, T_Ul_Calificacion t_Ul_Calificacion, String uuid,
		OrderByComparator<T_Ul_Calificacion> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_T_UL_CALIFICACION_WHERE);

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
			sb.append(T_Ul_CalificacionModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(
						t_Ul_Calificacion)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<T_Ul_Calificacion> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the t_ ul_ calificacions where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (T_Ul_Calificacion t_Ul_Calificacion :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(t_Ul_Calificacion);
		}
	}

	/**
	 * Returns the number of t_ ul_ calificacions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching t_ ul_ calificacions
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_T_UL_CALIFICACION_WHERE);

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
		"t_Ul_Calificacion.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(t_Ul_Calificacion.uuid IS NULL OR t_Ul_Calificacion.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the t_ ul_ calificacion where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchT_Ul_CalificacionException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching t_ ul_ calificacion
	 * @throws NoSuchT_Ul_CalificacionException if a matching t_ ul_ calificacion could not be found
	 */
	@Override
	public T_Ul_Calificacion findByUUID_G(String uuid, long groupId)
		throws NoSuchT_Ul_CalificacionException {

		T_Ul_Calificacion t_Ul_Calificacion = fetchByUUID_G(uuid, groupId);

		if (t_Ul_Calificacion == null) {
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

			throw new NoSuchT_Ul_CalificacionException(sb.toString());
		}

		return t_Ul_Calificacion;
	}

	/**
	 * Returns the t_ ul_ calificacion where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching t_ ul_ calificacion, or <code>null</code> if a matching t_ ul_ calificacion could not be found
	 */
	@Override
	public T_Ul_Calificacion fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the t_ ul_ calificacion where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching t_ ul_ calificacion, or <code>null</code> if a matching t_ ul_ calificacion could not be found
	 */
	@Override
	public T_Ul_Calificacion fetchByUUID_G(
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

		if (result instanceof T_Ul_Calificacion) {
			T_Ul_Calificacion t_Ul_Calificacion = (T_Ul_Calificacion)result;

			if (!Objects.equals(uuid, t_Ul_Calificacion.getUuid()) ||
				(groupId != t_Ul_Calificacion.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_T_UL_CALIFICACION_WHERE);

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

				List<T_Ul_Calificacion> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					T_Ul_Calificacion t_Ul_Calificacion = list.get(0);

					result = t_Ul_Calificacion;

					cacheResult(t_Ul_Calificacion);
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
			return (T_Ul_Calificacion)result;
		}
	}

	/**
	 * Removes the t_ ul_ calificacion where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the t_ ul_ calificacion that was removed
	 */
	@Override
	public T_Ul_Calificacion removeByUUID_G(String uuid, long groupId)
		throws NoSuchT_Ul_CalificacionException {

		T_Ul_Calificacion t_Ul_Calificacion = findByUUID_G(uuid, groupId);

		return remove(t_Ul_Calificacion);
	}

	/**
	 * Returns the number of t_ ul_ calificacions where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching t_ ul_ calificacions
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_T_UL_CALIFICACION_WHERE);

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
		"t_Ul_Calificacion.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(t_Ul_Calificacion.uuid IS NULL OR t_Ul_Calificacion.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"t_Ul_Calificacion.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the t_ ul_ calificacions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching t_ ul_ calificacions
	 */
	@Override
	public List<T_Ul_Calificacion> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the t_ ul_ calificacions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_CalificacionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of t_ ul_ calificacions
	 * @param end the upper bound of the range of t_ ul_ calificacions (not inclusive)
	 * @return the range of matching t_ ul_ calificacions
	 */
	@Override
	public List<T_Ul_Calificacion> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the t_ ul_ calificacions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_CalificacionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of t_ ul_ calificacions
	 * @param end the upper bound of the range of t_ ul_ calificacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t_ ul_ calificacions
	 */
	@Override
	public List<T_Ul_Calificacion> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<T_Ul_Calificacion> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the t_ ul_ calificacions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_CalificacionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of t_ ul_ calificacions
	 * @param end the upper bound of the range of t_ ul_ calificacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching t_ ul_ calificacions
	 */
	@Override
	public List<T_Ul_Calificacion> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<T_Ul_Calificacion> orderByComparator,
		boolean useFinderCache) {

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

		List<T_Ul_Calificacion> list = null;

		if (useFinderCache) {
			list = (List<T_Ul_Calificacion>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (T_Ul_Calificacion t_Ul_Calificacion : list) {
					if (!uuid.equals(t_Ul_Calificacion.getUuid()) ||
						(companyId != t_Ul_Calificacion.getCompanyId())) {

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

			sb.append(_SQL_SELECT_T_UL_CALIFICACION_WHERE);

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
				sb.append(T_Ul_CalificacionModelImpl.ORDER_BY_JPQL);
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

				list = (List<T_Ul_Calificacion>)QueryUtil.list(
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
	 * Returns the first t_ ul_ calificacion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ calificacion
	 * @throws NoSuchT_Ul_CalificacionException if a matching t_ ul_ calificacion could not be found
	 */
	@Override
	public T_Ul_Calificacion findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<T_Ul_Calificacion> orderByComparator)
		throws NoSuchT_Ul_CalificacionException {

		T_Ul_Calificacion t_Ul_Calificacion = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (t_Ul_Calificacion != null) {
			return t_Ul_Calificacion;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchT_Ul_CalificacionException(sb.toString());
	}

	/**
	 * Returns the first t_ ul_ calificacion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ calificacion, or <code>null</code> if a matching t_ ul_ calificacion could not be found
	 */
	@Override
	public T_Ul_Calificacion fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<T_Ul_Calificacion> orderByComparator) {

		List<T_Ul_Calificacion> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last t_ ul_ calificacion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ calificacion
	 * @throws NoSuchT_Ul_CalificacionException if a matching t_ ul_ calificacion could not be found
	 */
	@Override
	public T_Ul_Calificacion findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<T_Ul_Calificacion> orderByComparator)
		throws NoSuchT_Ul_CalificacionException {

		T_Ul_Calificacion t_Ul_Calificacion = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (t_Ul_Calificacion != null) {
			return t_Ul_Calificacion;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchT_Ul_CalificacionException(sb.toString());
	}

	/**
	 * Returns the last t_ ul_ calificacion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ calificacion, or <code>null</code> if a matching t_ ul_ calificacion could not be found
	 */
	@Override
	public T_Ul_Calificacion fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<T_Ul_Calificacion> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<T_Ul_Calificacion> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the t_ ul_ calificacions before and after the current t_ ul_ calificacion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param idCalificacion the primary key of the current t_ ul_ calificacion
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t_ ul_ calificacion
	 * @throws NoSuchT_Ul_CalificacionException if a t_ ul_ calificacion with the primary key could not be found
	 */
	@Override
	public T_Ul_Calificacion[] findByUuid_C_PrevAndNext(
			long idCalificacion, String uuid, long companyId,
			OrderByComparator<T_Ul_Calificacion> orderByComparator)
		throws NoSuchT_Ul_CalificacionException {

		uuid = Objects.toString(uuid, "");

		T_Ul_Calificacion t_Ul_Calificacion = findByPrimaryKey(idCalificacion);

		Session session = null;

		try {
			session = openSession();

			T_Ul_Calificacion[] array = new T_Ul_CalificacionImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, t_Ul_Calificacion, uuid, companyId, orderByComparator,
				true);

			array[1] = t_Ul_Calificacion;

			array[2] = getByUuid_C_PrevAndNext(
				session, t_Ul_Calificacion, uuid, companyId, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected T_Ul_Calificacion getByUuid_C_PrevAndNext(
		Session session, T_Ul_Calificacion t_Ul_Calificacion, String uuid,
		long companyId, OrderByComparator<T_Ul_Calificacion> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_T_UL_CALIFICACION_WHERE);

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
			sb.append(T_Ul_CalificacionModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(
						t_Ul_Calificacion)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<T_Ul_Calificacion> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the t_ ul_ calificacions where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (T_Ul_Calificacion t_Ul_Calificacion :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(t_Ul_Calificacion);
		}
	}

	/**
	 * Returns the number of t_ ul_ calificacions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching t_ ul_ calificacions
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_T_UL_CALIFICACION_WHERE);

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
		"t_Ul_Calificacion.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(t_Ul_Calificacion.uuid IS NULL OR t_Ul_Calificacion.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"t_Ul_Calificacion.companyId = ?";

	private FinderPath _finderPathWithPaginationFindBypuntCalificacion;
	private FinderPath _finderPathWithoutPaginationFindBypuntCalificacion;
	private FinderPath _finderPathCountBypuntCalificacion;

	/**
	 * Returns all the t_ ul_ calificacions where puntCalificacion = &#63;.
	 *
	 * @param puntCalificacion the punt calificacion
	 * @return the matching t_ ul_ calificacions
	 */
	@Override
	public List<T_Ul_Calificacion> findBypuntCalificacion(
		String puntCalificacion) {

		return findBypuntCalificacion(
			puntCalificacion, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the t_ ul_ calificacions where puntCalificacion = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_CalificacionModelImpl</code>.
	 * </p>
	 *
	 * @param puntCalificacion the punt calificacion
	 * @param start the lower bound of the range of t_ ul_ calificacions
	 * @param end the upper bound of the range of t_ ul_ calificacions (not inclusive)
	 * @return the range of matching t_ ul_ calificacions
	 */
	@Override
	public List<T_Ul_Calificacion> findBypuntCalificacion(
		String puntCalificacion, int start, int end) {

		return findBypuntCalificacion(puntCalificacion, start, end, null);
	}

	/**
	 * Returns an ordered range of all the t_ ul_ calificacions where puntCalificacion = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_CalificacionModelImpl</code>.
	 * </p>
	 *
	 * @param puntCalificacion the punt calificacion
	 * @param start the lower bound of the range of t_ ul_ calificacions
	 * @param end the upper bound of the range of t_ ul_ calificacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t_ ul_ calificacions
	 */
	@Override
	public List<T_Ul_Calificacion> findBypuntCalificacion(
		String puntCalificacion, int start, int end,
		OrderByComparator<T_Ul_Calificacion> orderByComparator) {

		return findBypuntCalificacion(
			puntCalificacion, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the t_ ul_ calificacions where puntCalificacion = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_CalificacionModelImpl</code>.
	 * </p>
	 *
	 * @param puntCalificacion the punt calificacion
	 * @param start the lower bound of the range of t_ ul_ calificacions
	 * @param end the upper bound of the range of t_ ul_ calificacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching t_ ul_ calificacions
	 */
	@Override
	public List<T_Ul_Calificacion> findBypuntCalificacion(
		String puntCalificacion, int start, int end,
		OrderByComparator<T_Ul_Calificacion> orderByComparator,
		boolean useFinderCache) {

		puntCalificacion = Objects.toString(puntCalificacion, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBypuntCalificacion;
				finderArgs = new Object[] {puntCalificacion};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBypuntCalificacion;
			finderArgs = new Object[] {
				puntCalificacion, start, end, orderByComparator
			};
		}

		List<T_Ul_Calificacion> list = null;

		if (useFinderCache) {
			list = (List<T_Ul_Calificacion>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (T_Ul_Calificacion t_Ul_Calificacion : list) {
					if (!puntCalificacion.equals(
							t_Ul_Calificacion.getPuntCalificacion())) {

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

			sb.append(_SQL_SELECT_T_UL_CALIFICACION_WHERE);

			boolean bindPuntCalificacion = false;

			if (puntCalificacion.isEmpty()) {
				sb.append(_FINDER_COLUMN_PUNTCALIFICACION_PUNTCALIFICACION_3);
			}
			else {
				bindPuntCalificacion = true;

				sb.append(_FINDER_COLUMN_PUNTCALIFICACION_PUNTCALIFICACION_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(T_Ul_CalificacionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindPuntCalificacion) {
					queryPos.add(puntCalificacion);
				}

				list = (List<T_Ul_Calificacion>)QueryUtil.list(
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
	 * Returns the first t_ ul_ calificacion in the ordered set where puntCalificacion = &#63;.
	 *
	 * @param puntCalificacion the punt calificacion
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ calificacion
	 * @throws NoSuchT_Ul_CalificacionException if a matching t_ ul_ calificacion could not be found
	 */
	@Override
	public T_Ul_Calificacion findBypuntCalificacion_First(
			String puntCalificacion,
			OrderByComparator<T_Ul_Calificacion> orderByComparator)
		throws NoSuchT_Ul_CalificacionException {

		T_Ul_Calificacion t_Ul_Calificacion = fetchBypuntCalificacion_First(
			puntCalificacion, orderByComparator);

		if (t_Ul_Calificacion != null) {
			return t_Ul_Calificacion;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("puntCalificacion=");
		sb.append(puntCalificacion);

		sb.append("}");

		throw new NoSuchT_Ul_CalificacionException(sb.toString());
	}

	/**
	 * Returns the first t_ ul_ calificacion in the ordered set where puntCalificacion = &#63;.
	 *
	 * @param puntCalificacion the punt calificacion
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ calificacion, or <code>null</code> if a matching t_ ul_ calificacion could not be found
	 */
	@Override
	public T_Ul_Calificacion fetchBypuntCalificacion_First(
		String puntCalificacion,
		OrderByComparator<T_Ul_Calificacion> orderByComparator) {

		List<T_Ul_Calificacion> list = findBypuntCalificacion(
			puntCalificacion, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last t_ ul_ calificacion in the ordered set where puntCalificacion = &#63;.
	 *
	 * @param puntCalificacion the punt calificacion
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ calificacion
	 * @throws NoSuchT_Ul_CalificacionException if a matching t_ ul_ calificacion could not be found
	 */
	@Override
	public T_Ul_Calificacion findBypuntCalificacion_Last(
			String puntCalificacion,
			OrderByComparator<T_Ul_Calificacion> orderByComparator)
		throws NoSuchT_Ul_CalificacionException {

		T_Ul_Calificacion t_Ul_Calificacion = fetchBypuntCalificacion_Last(
			puntCalificacion, orderByComparator);

		if (t_Ul_Calificacion != null) {
			return t_Ul_Calificacion;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("puntCalificacion=");
		sb.append(puntCalificacion);

		sb.append("}");

		throw new NoSuchT_Ul_CalificacionException(sb.toString());
	}

	/**
	 * Returns the last t_ ul_ calificacion in the ordered set where puntCalificacion = &#63;.
	 *
	 * @param puntCalificacion the punt calificacion
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ calificacion, or <code>null</code> if a matching t_ ul_ calificacion could not be found
	 */
	@Override
	public T_Ul_Calificacion fetchBypuntCalificacion_Last(
		String puntCalificacion,
		OrderByComparator<T_Ul_Calificacion> orderByComparator) {

		int count = countBypuntCalificacion(puntCalificacion);

		if (count == 0) {
			return null;
		}

		List<T_Ul_Calificacion> list = findBypuntCalificacion(
			puntCalificacion, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the t_ ul_ calificacions before and after the current t_ ul_ calificacion in the ordered set where puntCalificacion = &#63;.
	 *
	 * @param idCalificacion the primary key of the current t_ ul_ calificacion
	 * @param puntCalificacion the punt calificacion
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t_ ul_ calificacion
	 * @throws NoSuchT_Ul_CalificacionException if a t_ ul_ calificacion with the primary key could not be found
	 */
	@Override
	public T_Ul_Calificacion[] findBypuntCalificacion_PrevAndNext(
			long idCalificacion, String puntCalificacion,
			OrderByComparator<T_Ul_Calificacion> orderByComparator)
		throws NoSuchT_Ul_CalificacionException {

		puntCalificacion = Objects.toString(puntCalificacion, "");

		T_Ul_Calificacion t_Ul_Calificacion = findByPrimaryKey(idCalificacion);

		Session session = null;

		try {
			session = openSession();

			T_Ul_Calificacion[] array = new T_Ul_CalificacionImpl[3];

			array[0] = getBypuntCalificacion_PrevAndNext(
				session, t_Ul_Calificacion, puntCalificacion, orderByComparator,
				true);

			array[1] = t_Ul_Calificacion;

			array[2] = getBypuntCalificacion_PrevAndNext(
				session, t_Ul_Calificacion, puntCalificacion, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected T_Ul_Calificacion getBypuntCalificacion_PrevAndNext(
		Session session, T_Ul_Calificacion t_Ul_Calificacion,
		String puntCalificacion,
		OrderByComparator<T_Ul_Calificacion> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_T_UL_CALIFICACION_WHERE);

		boolean bindPuntCalificacion = false;

		if (puntCalificacion.isEmpty()) {
			sb.append(_FINDER_COLUMN_PUNTCALIFICACION_PUNTCALIFICACION_3);
		}
		else {
			bindPuntCalificacion = true;

			sb.append(_FINDER_COLUMN_PUNTCALIFICACION_PUNTCALIFICACION_2);
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
			sb.append(T_Ul_CalificacionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindPuntCalificacion) {
			queryPos.add(puntCalificacion);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						t_Ul_Calificacion)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<T_Ul_Calificacion> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the t_ ul_ calificacions where puntCalificacion = &#63; from the database.
	 *
	 * @param puntCalificacion the punt calificacion
	 */
	@Override
	public void removeBypuntCalificacion(String puntCalificacion) {
		for (T_Ul_Calificacion t_Ul_Calificacion :
				findBypuntCalificacion(
					puntCalificacion, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(t_Ul_Calificacion);
		}
	}

	/**
	 * Returns the number of t_ ul_ calificacions where puntCalificacion = &#63;.
	 *
	 * @param puntCalificacion the punt calificacion
	 * @return the number of matching t_ ul_ calificacions
	 */
	@Override
	public int countBypuntCalificacion(String puntCalificacion) {
		puntCalificacion = Objects.toString(puntCalificacion, "");

		FinderPath finderPath = _finderPathCountBypuntCalificacion;

		Object[] finderArgs = new Object[] {puntCalificacion};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_T_UL_CALIFICACION_WHERE);

			boolean bindPuntCalificacion = false;

			if (puntCalificacion.isEmpty()) {
				sb.append(_FINDER_COLUMN_PUNTCALIFICACION_PUNTCALIFICACION_3);
			}
			else {
				bindPuntCalificacion = true;

				sb.append(_FINDER_COLUMN_PUNTCALIFICACION_PUNTCALIFICACION_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindPuntCalificacion) {
					queryPos.add(puntCalificacion);
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

	private static final String
		_FINDER_COLUMN_PUNTCALIFICACION_PUNTCALIFICACION_2 =
			"t_Ul_Calificacion.puntCalificacion = ?";

	private static final String
		_FINDER_COLUMN_PUNTCALIFICACION_PUNTCALIFICACION_3 =
			"(t_Ul_Calificacion.puntCalificacion IS NULL OR t_Ul_Calificacion.puntCalificacion = '')";

	public T_Ul_CalificacionPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(T_Ul_Calificacion.class);

		setModelImplClass(T_Ul_CalificacionImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the t_ ul_ calificacion in the entity cache if it is enabled.
	 *
	 * @param t_Ul_Calificacion the t_ ul_ calificacion
	 */
	@Override
	public void cacheResult(T_Ul_Calificacion t_Ul_Calificacion) {
		entityCache.putResult(
			T_Ul_CalificacionImpl.class, t_Ul_Calificacion.getPrimaryKey(),
			t_Ul_Calificacion);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				t_Ul_Calificacion.getUuid(), t_Ul_Calificacion.getGroupId()
			},
			t_Ul_Calificacion);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the t_ ul_ calificacions in the entity cache if it is enabled.
	 *
	 * @param t_Ul_Calificacions the t_ ul_ calificacions
	 */
	@Override
	public void cacheResult(List<T_Ul_Calificacion> t_Ul_Calificacions) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (t_Ul_Calificacions.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (T_Ul_Calificacion t_Ul_Calificacion : t_Ul_Calificacions) {
			if (entityCache.getResult(
					T_Ul_CalificacionImpl.class,
					t_Ul_Calificacion.getPrimaryKey()) == null) {

				cacheResult(t_Ul_Calificacion);
			}
		}
	}

	/**
	 * Clears the cache for all t_ ul_ calificacions.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(T_Ul_CalificacionImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the t_ ul_ calificacion.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(T_Ul_Calificacion t_Ul_Calificacion) {
		entityCache.removeResult(
			T_Ul_CalificacionImpl.class, t_Ul_Calificacion);
	}

	@Override
	public void clearCache(List<T_Ul_Calificacion> t_Ul_Calificacions) {
		for (T_Ul_Calificacion t_Ul_Calificacion : t_Ul_Calificacions) {
			entityCache.removeResult(
				T_Ul_CalificacionImpl.class, t_Ul_Calificacion);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(T_Ul_CalificacionImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		T_Ul_CalificacionModelImpl t_Ul_CalificacionModelImpl) {

		Object[] args = new Object[] {
			t_Ul_CalificacionModelImpl.getUuid(),
			t_Ul_CalificacionModelImpl.getGroupId()
		};

		finderCache.putResult(
			_finderPathCountByUUID_G, args, Long.valueOf(1), false);
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, t_Ul_CalificacionModelImpl, false);
	}

	/**
	 * Creates a new t_ ul_ calificacion with the primary key. Does not add the t_ ul_ calificacion to the database.
	 *
	 * @param idCalificacion the primary key for the new t_ ul_ calificacion
	 * @return the new t_ ul_ calificacion
	 */
	@Override
	public T_Ul_Calificacion create(long idCalificacion) {
		T_Ul_Calificacion t_Ul_Calificacion = new T_Ul_CalificacionImpl();

		t_Ul_Calificacion.setNew(true);
		t_Ul_Calificacion.setPrimaryKey(idCalificacion);

		String uuid = PortalUUIDUtil.generate();

		t_Ul_Calificacion.setUuid(uuid);

		t_Ul_Calificacion.setCompanyId(CompanyThreadLocal.getCompanyId());

		return t_Ul_Calificacion;
	}

	/**
	 * Removes the t_ ul_ calificacion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param idCalificacion the primary key of the t_ ul_ calificacion
	 * @return the t_ ul_ calificacion that was removed
	 * @throws NoSuchT_Ul_CalificacionException if a t_ ul_ calificacion with the primary key could not be found
	 */
	@Override
	public T_Ul_Calificacion remove(long idCalificacion)
		throws NoSuchT_Ul_CalificacionException {

		return remove((Serializable)idCalificacion);
	}

	/**
	 * Removes the t_ ul_ calificacion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the t_ ul_ calificacion
	 * @return the t_ ul_ calificacion that was removed
	 * @throws NoSuchT_Ul_CalificacionException if a t_ ul_ calificacion with the primary key could not be found
	 */
	@Override
	public T_Ul_Calificacion remove(Serializable primaryKey)
		throws NoSuchT_Ul_CalificacionException {

		Session session = null;

		try {
			session = openSession();

			T_Ul_Calificacion t_Ul_Calificacion =
				(T_Ul_Calificacion)session.get(
					T_Ul_CalificacionImpl.class, primaryKey);

			if (t_Ul_Calificacion == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchT_Ul_CalificacionException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(t_Ul_Calificacion);
		}
		catch (NoSuchT_Ul_CalificacionException noSuchEntityException) {
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
	protected T_Ul_Calificacion removeImpl(
		T_Ul_Calificacion t_Ul_Calificacion) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(t_Ul_Calificacion)) {
				t_Ul_Calificacion = (T_Ul_Calificacion)session.get(
					T_Ul_CalificacionImpl.class,
					t_Ul_Calificacion.getPrimaryKeyObj());
			}

			if (t_Ul_Calificacion != null) {
				session.delete(t_Ul_Calificacion);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (t_Ul_Calificacion != null) {
			clearCache(t_Ul_Calificacion);
		}

		return t_Ul_Calificacion;
	}

	@Override
	public T_Ul_Calificacion updateImpl(T_Ul_Calificacion t_Ul_Calificacion) {
		boolean isNew = t_Ul_Calificacion.isNew();

		if (!(t_Ul_Calificacion instanceof T_Ul_CalificacionModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(t_Ul_Calificacion.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					t_Ul_Calificacion);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in t_Ul_Calificacion proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom T_Ul_Calificacion implementation " +
					t_Ul_Calificacion.getClass());
		}

		T_Ul_CalificacionModelImpl t_Ul_CalificacionModelImpl =
			(T_Ul_CalificacionModelImpl)t_Ul_Calificacion;

		if (Validator.isNull(t_Ul_Calificacion.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			t_Ul_Calificacion.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (t_Ul_Calificacion.getCreateDate() == null)) {
			if (serviceContext == null) {
				t_Ul_Calificacion.setCreateDate(date);
			}
			else {
				t_Ul_Calificacion.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!t_Ul_CalificacionModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				t_Ul_Calificacion.setModifiedDate(date);
			}
			else {
				t_Ul_Calificacion.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(t_Ul_Calificacion);
			}
			else {
				t_Ul_Calificacion = (T_Ul_Calificacion)session.merge(
					t_Ul_Calificacion);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			T_Ul_CalificacionImpl.class, t_Ul_CalificacionModelImpl, false,
			true);

		cacheUniqueFindersCache(t_Ul_CalificacionModelImpl);

		if (isNew) {
			t_Ul_Calificacion.setNew(false);
		}

		t_Ul_Calificacion.resetOriginalValues();

		return t_Ul_Calificacion;
	}

	/**
	 * Returns the t_ ul_ calificacion with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the t_ ul_ calificacion
	 * @return the t_ ul_ calificacion
	 * @throws NoSuchT_Ul_CalificacionException if a t_ ul_ calificacion with the primary key could not be found
	 */
	@Override
	public T_Ul_Calificacion findByPrimaryKey(Serializable primaryKey)
		throws NoSuchT_Ul_CalificacionException {

		T_Ul_Calificacion t_Ul_Calificacion = fetchByPrimaryKey(primaryKey);

		if (t_Ul_Calificacion == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchT_Ul_CalificacionException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return t_Ul_Calificacion;
	}

	/**
	 * Returns the t_ ul_ calificacion with the primary key or throws a <code>NoSuchT_Ul_CalificacionException</code> if it could not be found.
	 *
	 * @param idCalificacion the primary key of the t_ ul_ calificacion
	 * @return the t_ ul_ calificacion
	 * @throws NoSuchT_Ul_CalificacionException if a t_ ul_ calificacion with the primary key could not be found
	 */
	@Override
	public T_Ul_Calificacion findByPrimaryKey(long idCalificacion)
		throws NoSuchT_Ul_CalificacionException {

		return findByPrimaryKey((Serializable)idCalificacion);
	}

	/**
	 * Returns the t_ ul_ calificacion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param idCalificacion the primary key of the t_ ul_ calificacion
	 * @return the t_ ul_ calificacion, or <code>null</code> if a t_ ul_ calificacion with the primary key could not be found
	 */
	@Override
	public T_Ul_Calificacion fetchByPrimaryKey(long idCalificacion) {
		return fetchByPrimaryKey((Serializable)idCalificacion);
	}

	/**
	 * Returns all the t_ ul_ calificacions.
	 *
	 * @return the t_ ul_ calificacions
	 */
	@Override
	public List<T_Ul_Calificacion> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the t_ ul_ calificacions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_CalificacionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_ calificacions
	 * @param end the upper bound of the range of t_ ul_ calificacions (not inclusive)
	 * @return the range of t_ ul_ calificacions
	 */
	@Override
	public List<T_Ul_Calificacion> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the t_ ul_ calificacions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_CalificacionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_ calificacions
	 * @param end the upper bound of the range of t_ ul_ calificacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of t_ ul_ calificacions
	 */
	@Override
	public List<T_Ul_Calificacion> findAll(
		int start, int end,
		OrderByComparator<T_Ul_Calificacion> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the t_ ul_ calificacions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_CalificacionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_ calificacions
	 * @param end the upper bound of the range of t_ ul_ calificacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of t_ ul_ calificacions
	 */
	@Override
	public List<T_Ul_Calificacion> findAll(
		int start, int end,
		OrderByComparator<T_Ul_Calificacion> orderByComparator,
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

		List<T_Ul_Calificacion> list = null;

		if (useFinderCache) {
			list = (List<T_Ul_Calificacion>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_T_UL_CALIFICACION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_T_UL_CALIFICACION;

				sql = sql.concat(T_Ul_CalificacionModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<T_Ul_Calificacion>)QueryUtil.list(
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
	 * Removes all the t_ ul_ calificacions from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (T_Ul_Calificacion t_Ul_Calificacion : findAll()) {
			remove(t_Ul_Calificacion);
		}
	}

	/**
	 * Returns the number of t_ ul_ calificacions.
	 *
	 * @return the number of t_ ul_ calificacions
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_T_UL_CALIFICACION);

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
		return "idCalificacion";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_T_UL_CALIFICACION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return T_Ul_CalificacionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the t_ ul_ calificacion persistence.
	 */
	@Activate
	public void activate(BundleContext bundleContext) {
		_bundleContext = bundleContext;

		_argumentsResolverServiceRegistration = _bundleContext.registerService(
			ArgumentsResolver.class,
			new T_Ul_CalificacionModelArgumentsResolver(),
			MapUtil.singletonDictionary(
				"model.class.name", T_Ul_Calificacion.class.getName()));

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

		_finderPathWithPaginationFindBypuntCalificacion = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBypuntCalificacion",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"puntCalificacion"}, true);

		_finderPathWithoutPaginationFindBypuntCalificacion = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBypuntCalificacion",
			new String[] {String.class.getName()},
			new String[] {"puntCalificacion"}, true);

		_finderPathCountBypuntCalificacion = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBypuntCalificacion", new String[] {String.class.getName()},
			new String[] {"puntCalificacion"}, false);

		_setT_Ul_CalificacionUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setT_Ul_CalificacionUtilPersistence(null);

		entityCache.removeCache(T_Ul_CalificacionImpl.class.getName());

		_argumentsResolverServiceRegistration.unregister();

		for (ServiceRegistration<FinderPath> serviceRegistration :
				_serviceRegistrations) {

			serviceRegistration.unregister();
		}
	}

	private void _setT_Ul_CalificacionUtilPersistence(
		T_Ul_CalificacionPersistence t_Ul_CalificacionPersistence) {

		try {
			Field field = T_Ul_CalificacionUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, t_Ul_CalificacionPersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Override
	@Reference(
		target = AulaVirtualPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = AulaVirtualPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = AulaVirtualPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
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

	private static final String _SQL_SELECT_T_UL_CALIFICACION =
		"SELECT t_Ul_Calificacion FROM T_Ul_Calificacion t_Ul_Calificacion";

	private static final String _SQL_SELECT_T_UL_CALIFICACION_WHERE =
		"SELECT t_Ul_Calificacion FROM T_Ul_Calificacion t_Ul_Calificacion WHERE ";

	private static final String _SQL_COUNT_T_UL_CALIFICACION =
		"SELECT COUNT(t_Ul_Calificacion) FROM T_Ul_Calificacion t_Ul_Calificacion";

	private static final String _SQL_COUNT_T_UL_CALIFICACION_WHERE =
		"SELECT COUNT(t_Ul_Calificacion) FROM T_Ul_Calificacion t_Ul_Calificacion WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "t_Ul_Calificacion.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No T_Ul_Calificacion exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No T_Ul_Calificacion exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		T_Ul_CalificacionPersistenceImpl.class);

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

	private static class T_Ul_CalificacionModelArgumentsResolver
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

			T_Ul_CalificacionModelImpl t_Ul_CalificacionModelImpl =
				(T_Ul_CalificacionModelImpl)baseModel;

			long columnBitmask = t_Ul_CalificacionModelImpl.getColumnBitmask();

			if (!checkColumn || (columnBitmask == 0)) {
				return _getValue(
					t_Ul_CalificacionModelImpl, columnNames, original);
			}

			Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
				finderPath);

			if (finderPathColumnBitmask == null) {
				finderPathColumnBitmask = 0L;

				for (String columnName : columnNames) {
					finderPathColumnBitmask |=
						t_Ul_CalificacionModelImpl.getColumnBitmask(columnName);
				}

				if (finderPath.isBaseModelResult() &&
					(T_Ul_CalificacionPersistenceImpl.
						FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION ==
							finderPath.getCacheName())) {

					finderPathColumnBitmask |= _ORDER_BY_COLUMNS_BITMASK;
				}

				_finderPathColumnBitmasksCache.put(
					finderPath, finderPathColumnBitmask);
			}

			if ((columnBitmask & finderPathColumnBitmask) != 0) {
				return _getValue(
					t_Ul_CalificacionModelImpl, columnNames, original);
			}

			return null;
		}

		private static Object[] _getValue(
			T_Ul_CalificacionModelImpl t_Ul_CalificacionModelImpl,
			String[] columnNames, boolean original) {

			Object[] arguments = new Object[columnNames.length];

			for (int i = 0; i < arguments.length; i++) {
				String columnName = columnNames[i];

				if (original) {
					arguments[i] =
						t_Ul_CalificacionModelImpl.getColumnOriginalValue(
							columnName);
				}
				else {
					arguments[i] = t_Ul_CalificacionModelImpl.getColumnValue(
						columnName);
				}
			}

			return arguments;
		}

		private static final Map<FinderPath, Long>
			_finderPathColumnBitmasksCache = new ConcurrentHashMap<>();

		private static final long _ORDER_BY_COLUMNS_BITMASK;

		static {
			long orderByColumnsBitmask = 0;

			_ORDER_BY_COLUMNS_BITMASK = orderByColumnsBitmask;
		}

	}

}
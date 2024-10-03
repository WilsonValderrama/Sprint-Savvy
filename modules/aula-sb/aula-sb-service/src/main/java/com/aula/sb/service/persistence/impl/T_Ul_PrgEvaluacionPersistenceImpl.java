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

import com.aula.sb.exception.NoSuchT_Ul_PrgEvaluacionException;
import com.aula.sb.model.T_Ul_PrgEvaluacion;
import com.aula.sb.model.impl.T_Ul_PrgEvaluacionImpl;
import com.aula.sb.model.impl.T_Ul_PrgEvaluacionModelImpl;
import com.aula.sb.service.persistence.T_Ul_PrgEvaluacionPersistence;
import com.aula.sb.service.persistence.T_Ul_PrgEvaluacionUtil;
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
 * The persistence implementation for the t_ ul_ prg evaluacion service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = T_Ul_PrgEvaluacionPersistence.class)
public class T_Ul_PrgEvaluacionPersistenceImpl
	extends BasePersistenceImpl<T_Ul_PrgEvaluacion>
	implements T_Ul_PrgEvaluacionPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>T_Ul_PrgEvaluacionUtil</code> to access the t_ ul_ prg evaluacion persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		T_Ul_PrgEvaluacionImpl.class.getName();

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
	 * Returns all the t_ ul_ prg evaluacions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching t_ ul_ prg evaluacions
	 */
	@Override
	public List<T_Ul_PrgEvaluacion> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the t_ ul_ prg evaluacions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_PrgEvaluacionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of t_ ul_ prg evaluacions
	 * @param end the upper bound of the range of t_ ul_ prg evaluacions (not inclusive)
	 * @return the range of matching t_ ul_ prg evaluacions
	 */
	@Override
	public List<T_Ul_PrgEvaluacion> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the t_ ul_ prg evaluacions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_PrgEvaluacionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of t_ ul_ prg evaluacions
	 * @param end the upper bound of the range of t_ ul_ prg evaluacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t_ ul_ prg evaluacions
	 */
	@Override
	public List<T_Ul_PrgEvaluacion> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<T_Ul_PrgEvaluacion> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the t_ ul_ prg evaluacions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_PrgEvaluacionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of t_ ul_ prg evaluacions
	 * @param end the upper bound of the range of t_ ul_ prg evaluacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching t_ ul_ prg evaluacions
	 */
	@Override
	public List<T_Ul_PrgEvaluacion> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<T_Ul_PrgEvaluacion> orderByComparator,
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

		List<T_Ul_PrgEvaluacion> list = null;

		if (useFinderCache) {
			list = (List<T_Ul_PrgEvaluacion>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (T_Ul_PrgEvaluacion t_Ul_PrgEvaluacion : list) {
					if (!uuid.equals(t_Ul_PrgEvaluacion.getUuid())) {
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

			sb.append(_SQL_SELECT_T_UL_PRGEVALUACION_WHERE);

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
				sb.append(T_Ul_PrgEvaluacionModelImpl.ORDER_BY_JPQL);
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

				list = (List<T_Ul_PrgEvaluacion>)QueryUtil.list(
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
	 * Returns the first t_ ul_ prg evaluacion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ prg evaluacion
	 * @throws NoSuchT_Ul_PrgEvaluacionException if a matching t_ ul_ prg evaluacion could not be found
	 */
	@Override
	public T_Ul_PrgEvaluacion findByUuid_First(
			String uuid,
			OrderByComparator<T_Ul_PrgEvaluacion> orderByComparator)
		throws NoSuchT_Ul_PrgEvaluacionException {

		T_Ul_PrgEvaluacion t_Ul_PrgEvaluacion = fetchByUuid_First(
			uuid, orderByComparator);

		if (t_Ul_PrgEvaluacion != null) {
			return t_Ul_PrgEvaluacion;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchT_Ul_PrgEvaluacionException(sb.toString());
	}

	/**
	 * Returns the first t_ ul_ prg evaluacion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ prg evaluacion, or <code>null</code> if a matching t_ ul_ prg evaluacion could not be found
	 */
	@Override
	public T_Ul_PrgEvaluacion fetchByUuid_First(
		String uuid, OrderByComparator<T_Ul_PrgEvaluacion> orderByComparator) {

		List<T_Ul_PrgEvaluacion> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last t_ ul_ prg evaluacion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ prg evaluacion
	 * @throws NoSuchT_Ul_PrgEvaluacionException if a matching t_ ul_ prg evaluacion could not be found
	 */
	@Override
	public T_Ul_PrgEvaluacion findByUuid_Last(
			String uuid,
			OrderByComparator<T_Ul_PrgEvaluacion> orderByComparator)
		throws NoSuchT_Ul_PrgEvaluacionException {

		T_Ul_PrgEvaluacion t_Ul_PrgEvaluacion = fetchByUuid_Last(
			uuid, orderByComparator);

		if (t_Ul_PrgEvaluacion != null) {
			return t_Ul_PrgEvaluacion;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchT_Ul_PrgEvaluacionException(sb.toString());
	}

	/**
	 * Returns the last t_ ul_ prg evaluacion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ prg evaluacion, or <code>null</code> if a matching t_ ul_ prg evaluacion could not be found
	 */
	@Override
	public T_Ul_PrgEvaluacion fetchByUuid_Last(
		String uuid, OrderByComparator<T_Ul_PrgEvaluacion> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<T_Ul_PrgEvaluacion> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the t_ ul_ prg evaluacions before and after the current t_ ul_ prg evaluacion in the ordered set where uuid = &#63;.
	 *
	 * @param idPreguntas the primary key of the current t_ ul_ prg evaluacion
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t_ ul_ prg evaluacion
	 * @throws NoSuchT_Ul_PrgEvaluacionException if a t_ ul_ prg evaluacion with the primary key could not be found
	 */
	@Override
	public T_Ul_PrgEvaluacion[] findByUuid_PrevAndNext(
			long idPreguntas, String uuid,
			OrderByComparator<T_Ul_PrgEvaluacion> orderByComparator)
		throws NoSuchT_Ul_PrgEvaluacionException {

		uuid = Objects.toString(uuid, "");

		T_Ul_PrgEvaluacion t_Ul_PrgEvaluacion = findByPrimaryKey(idPreguntas);

		Session session = null;

		try {
			session = openSession();

			T_Ul_PrgEvaluacion[] array = new T_Ul_PrgEvaluacionImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, t_Ul_PrgEvaluacion, uuid, orderByComparator, true);

			array[1] = t_Ul_PrgEvaluacion;

			array[2] = getByUuid_PrevAndNext(
				session, t_Ul_PrgEvaluacion, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected T_Ul_PrgEvaluacion getByUuid_PrevAndNext(
		Session session, T_Ul_PrgEvaluacion t_Ul_PrgEvaluacion, String uuid,
		OrderByComparator<T_Ul_PrgEvaluacion> orderByComparator,
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

		sb.append(_SQL_SELECT_T_UL_PRGEVALUACION_WHERE);

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
			sb.append(T_Ul_PrgEvaluacionModelImpl.ORDER_BY_JPQL);
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
						t_Ul_PrgEvaluacion)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<T_Ul_PrgEvaluacion> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the t_ ul_ prg evaluacions where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (T_Ul_PrgEvaluacion t_Ul_PrgEvaluacion :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(t_Ul_PrgEvaluacion);
		}
	}

	/**
	 * Returns the number of t_ ul_ prg evaluacions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching t_ ul_ prg evaluacions
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_T_UL_PRGEVALUACION_WHERE);

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
		"t_Ul_PrgEvaluacion.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(t_Ul_PrgEvaluacion.uuid IS NULL OR t_Ul_PrgEvaluacion.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the t_ ul_ prg evaluacion where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchT_Ul_PrgEvaluacionException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching t_ ul_ prg evaluacion
	 * @throws NoSuchT_Ul_PrgEvaluacionException if a matching t_ ul_ prg evaluacion could not be found
	 */
	@Override
	public T_Ul_PrgEvaluacion findByUUID_G(String uuid, long groupId)
		throws NoSuchT_Ul_PrgEvaluacionException {

		T_Ul_PrgEvaluacion t_Ul_PrgEvaluacion = fetchByUUID_G(uuid, groupId);

		if (t_Ul_PrgEvaluacion == null) {
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

			throw new NoSuchT_Ul_PrgEvaluacionException(sb.toString());
		}

		return t_Ul_PrgEvaluacion;
	}

	/**
	 * Returns the t_ ul_ prg evaluacion where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching t_ ul_ prg evaluacion, or <code>null</code> if a matching t_ ul_ prg evaluacion could not be found
	 */
	@Override
	public T_Ul_PrgEvaluacion fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the t_ ul_ prg evaluacion where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching t_ ul_ prg evaluacion, or <code>null</code> if a matching t_ ul_ prg evaluacion could not be found
	 */
	@Override
	public T_Ul_PrgEvaluacion fetchByUUID_G(
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

		if (result instanceof T_Ul_PrgEvaluacion) {
			T_Ul_PrgEvaluacion t_Ul_PrgEvaluacion = (T_Ul_PrgEvaluacion)result;

			if (!Objects.equals(uuid, t_Ul_PrgEvaluacion.getUuid()) ||
				(groupId != t_Ul_PrgEvaluacion.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_T_UL_PRGEVALUACION_WHERE);

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

				List<T_Ul_PrgEvaluacion> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					T_Ul_PrgEvaluacion t_Ul_PrgEvaluacion = list.get(0);

					result = t_Ul_PrgEvaluacion;

					cacheResult(t_Ul_PrgEvaluacion);
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
			return (T_Ul_PrgEvaluacion)result;
		}
	}

	/**
	 * Removes the t_ ul_ prg evaluacion where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the t_ ul_ prg evaluacion that was removed
	 */
	@Override
	public T_Ul_PrgEvaluacion removeByUUID_G(String uuid, long groupId)
		throws NoSuchT_Ul_PrgEvaluacionException {

		T_Ul_PrgEvaluacion t_Ul_PrgEvaluacion = findByUUID_G(uuid, groupId);

		return remove(t_Ul_PrgEvaluacion);
	}

	/**
	 * Returns the number of t_ ul_ prg evaluacions where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching t_ ul_ prg evaluacions
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_T_UL_PRGEVALUACION_WHERE);

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
		"t_Ul_PrgEvaluacion.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(t_Ul_PrgEvaluacion.uuid IS NULL OR t_Ul_PrgEvaluacion.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"t_Ul_PrgEvaluacion.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the t_ ul_ prg evaluacions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching t_ ul_ prg evaluacions
	 */
	@Override
	public List<T_Ul_PrgEvaluacion> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the t_ ul_ prg evaluacions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_PrgEvaluacionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of t_ ul_ prg evaluacions
	 * @param end the upper bound of the range of t_ ul_ prg evaluacions (not inclusive)
	 * @return the range of matching t_ ul_ prg evaluacions
	 */
	@Override
	public List<T_Ul_PrgEvaluacion> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the t_ ul_ prg evaluacions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_PrgEvaluacionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of t_ ul_ prg evaluacions
	 * @param end the upper bound of the range of t_ ul_ prg evaluacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t_ ul_ prg evaluacions
	 */
	@Override
	public List<T_Ul_PrgEvaluacion> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<T_Ul_PrgEvaluacion> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the t_ ul_ prg evaluacions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_PrgEvaluacionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of t_ ul_ prg evaluacions
	 * @param end the upper bound of the range of t_ ul_ prg evaluacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching t_ ul_ prg evaluacions
	 */
	@Override
	public List<T_Ul_PrgEvaluacion> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<T_Ul_PrgEvaluacion> orderByComparator,
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

		List<T_Ul_PrgEvaluacion> list = null;

		if (useFinderCache) {
			list = (List<T_Ul_PrgEvaluacion>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (T_Ul_PrgEvaluacion t_Ul_PrgEvaluacion : list) {
					if (!uuid.equals(t_Ul_PrgEvaluacion.getUuid()) ||
						(companyId != t_Ul_PrgEvaluacion.getCompanyId())) {

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

			sb.append(_SQL_SELECT_T_UL_PRGEVALUACION_WHERE);

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
				sb.append(T_Ul_PrgEvaluacionModelImpl.ORDER_BY_JPQL);
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

				list = (List<T_Ul_PrgEvaluacion>)QueryUtil.list(
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
	 * Returns the first t_ ul_ prg evaluacion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ prg evaluacion
	 * @throws NoSuchT_Ul_PrgEvaluacionException if a matching t_ ul_ prg evaluacion could not be found
	 */
	@Override
	public T_Ul_PrgEvaluacion findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<T_Ul_PrgEvaluacion> orderByComparator)
		throws NoSuchT_Ul_PrgEvaluacionException {

		T_Ul_PrgEvaluacion t_Ul_PrgEvaluacion = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (t_Ul_PrgEvaluacion != null) {
			return t_Ul_PrgEvaluacion;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchT_Ul_PrgEvaluacionException(sb.toString());
	}

	/**
	 * Returns the first t_ ul_ prg evaluacion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ prg evaluacion, or <code>null</code> if a matching t_ ul_ prg evaluacion could not be found
	 */
	@Override
	public T_Ul_PrgEvaluacion fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<T_Ul_PrgEvaluacion> orderByComparator) {

		List<T_Ul_PrgEvaluacion> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last t_ ul_ prg evaluacion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ prg evaluacion
	 * @throws NoSuchT_Ul_PrgEvaluacionException if a matching t_ ul_ prg evaluacion could not be found
	 */
	@Override
	public T_Ul_PrgEvaluacion findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<T_Ul_PrgEvaluacion> orderByComparator)
		throws NoSuchT_Ul_PrgEvaluacionException {

		T_Ul_PrgEvaluacion t_Ul_PrgEvaluacion = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (t_Ul_PrgEvaluacion != null) {
			return t_Ul_PrgEvaluacion;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchT_Ul_PrgEvaluacionException(sb.toString());
	}

	/**
	 * Returns the last t_ ul_ prg evaluacion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ prg evaluacion, or <code>null</code> if a matching t_ ul_ prg evaluacion could not be found
	 */
	@Override
	public T_Ul_PrgEvaluacion fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<T_Ul_PrgEvaluacion> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<T_Ul_PrgEvaluacion> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the t_ ul_ prg evaluacions before and after the current t_ ul_ prg evaluacion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param idPreguntas the primary key of the current t_ ul_ prg evaluacion
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t_ ul_ prg evaluacion
	 * @throws NoSuchT_Ul_PrgEvaluacionException if a t_ ul_ prg evaluacion with the primary key could not be found
	 */
	@Override
	public T_Ul_PrgEvaluacion[] findByUuid_C_PrevAndNext(
			long idPreguntas, String uuid, long companyId,
			OrderByComparator<T_Ul_PrgEvaluacion> orderByComparator)
		throws NoSuchT_Ul_PrgEvaluacionException {

		uuid = Objects.toString(uuid, "");

		T_Ul_PrgEvaluacion t_Ul_PrgEvaluacion = findByPrimaryKey(idPreguntas);

		Session session = null;

		try {
			session = openSession();

			T_Ul_PrgEvaluacion[] array = new T_Ul_PrgEvaluacionImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, t_Ul_PrgEvaluacion, uuid, companyId, orderByComparator,
				true);

			array[1] = t_Ul_PrgEvaluacion;

			array[2] = getByUuid_C_PrevAndNext(
				session, t_Ul_PrgEvaluacion, uuid, companyId, orderByComparator,
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

	protected T_Ul_PrgEvaluacion getByUuid_C_PrevAndNext(
		Session session, T_Ul_PrgEvaluacion t_Ul_PrgEvaluacion, String uuid,
		long companyId, OrderByComparator<T_Ul_PrgEvaluacion> orderByComparator,
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

		sb.append(_SQL_SELECT_T_UL_PRGEVALUACION_WHERE);

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
			sb.append(T_Ul_PrgEvaluacionModelImpl.ORDER_BY_JPQL);
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
						t_Ul_PrgEvaluacion)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<T_Ul_PrgEvaluacion> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the t_ ul_ prg evaluacions where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (T_Ul_PrgEvaluacion t_Ul_PrgEvaluacion :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(t_Ul_PrgEvaluacion);
		}
	}

	/**
	 * Returns the number of t_ ul_ prg evaluacions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching t_ ul_ prg evaluacions
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_T_UL_PRGEVALUACION_WHERE);

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
		"t_Ul_PrgEvaluacion.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(t_Ul_PrgEvaluacion.uuid IS NULL OR t_Ul_PrgEvaluacion.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"t_Ul_PrgEvaluacion.companyId = ?";

	private FinderPath _finderPathWithPaginationFindByproblPreguntas;
	private FinderPath _finderPathWithoutPaginationFindByproblPreguntas;
	private FinderPath _finderPathCountByproblPreguntas;

	/**
	 * Returns all the t_ ul_ prg evaluacions where problPreguntas = &#63;.
	 *
	 * @param problPreguntas the probl preguntas
	 * @return the matching t_ ul_ prg evaluacions
	 */
	@Override
	public List<T_Ul_PrgEvaluacion> findByproblPreguntas(
		String problPreguntas) {

		return findByproblPreguntas(
			problPreguntas, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the t_ ul_ prg evaluacions where problPreguntas = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_PrgEvaluacionModelImpl</code>.
	 * </p>
	 *
	 * @param problPreguntas the probl preguntas
	 * @param start the lower bound of the range of t_ ul_ prg evaluacions
	 * @param end the upper bound of the range of t_ ul_ prg evaluacions (not inclusive)
	 * @return the range of matching t_ ul_ prg evaluacions
	 */
	@Override
	public List<T_Ul_PrgEvaluacion> findByproblPreguntas(
		String problPreguntas, int start, int end) {

		return findByproblPreguntas(problPreguntas, start, end, null);
	}

	/**
	 * Returns an ordered range of all the t_ ul_ prg evaluacions where problPreguntas = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_PrgEvaluacionModelImpl</code>.
	 * </p>
	 *
	 * @param problPreguntas the probl preguntas
	 * @param start the lower bound of the range of t_ ul_ prg evaluacions
	 * @param end the upper bound of the range of t_ ul_ prg evaluacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t_ ul_ prg evaluacions
	 */
	@Override
	public List<T_Ul_PrgEvaluacion> findByproblPreguntas(
		String problPreguntas, int start, int end,
		OrderByComparator<T_Ul_PrgEvaluacion> orderByComparator) {

		return findByproblPreguntas(
			problPreguntas, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the t_ ul_ prg evaluacions where problPreguntas = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_PrgEvaluacionModelImpl</code>.
	 * </p>
	 *
	 * @param problPreguntas the probl preguntas
	 * @param start the lower bound of the range of t_ ul_ prg evaluacions
	 * @param end the upper bound of the range of t_ ul_ prg evaluacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching t_ ul_ prg evaluacions
	 */
	@Override
	public List<T_Ul_PrgEvaluacion> findByproblPreguntas(
		String problPreguntas, int start, int end,
		OrderByComparator<T_Ul_PrgEvaluacion> orderByComparator,
		boolean useFinderCache) {

		problPreguntas = Objects.toString(problPreguntas, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByproblPreguntas;
				finderArgs = new Object[] {problPreguntas};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByproblPreguntas;
			finderArgs = new Object[] {
				problPreguntas, start, end, orderByComparator
			};
		}

		List<T_Ul_PrgEvaluacion> list = null;

		if (useFinderCache) {
			list = (List<T_Ul_PrgEvaluacion>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (T_Ul_PrgEvaluacion t_Ul_PrgEvaluacion : list) {
					if (!problPreguntas.equals(
							t_Ul_PrgEvaluacion.getProblPreguntas())) {

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

			sb.append(_SQL_SELECT_T_UL_PRGEVALUACION_WHERE);

			boolean bindProblPreguntas = false;

			if (problPreguntas.isEmpty()) {
				sb.append(_FINDER_COLUMN_PROBLPREGUNTAS_PROBLPREGUNTAS_3);
			}
			else {
				bindProblPreguntas = true;

				sb.append(_FINDER_COLUMN_PROBLPREGUNTAS_PROBLPREGUNTAS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(T_Ul_PrgEvaluacionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindProblPreguntas) {
					queryPos.add(problPreguntas);
				}

				list = (List<T_Ul_PrgEvaluacion>)QueryUtil.list(
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
	 * Returns the first t_ ul_ prg evaluacion in the ordered set where problPreguntas = &#63;.
	 *
	 * @param problPreguntas the probl preguntas
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ prg evaluacion
	 * @throws NoSuchT_Ul_PrgEvaluacionException if a matching t_ ul_ prg evaluacion could not be found
	 */
	@Override
	public T_Ul_PrgEvaluacion findByproblPreguntas_First(
			String problPreguntas,
			OrderByComparator<T_Ul_PrgEvaluacion> orderByComparator)
		throws NoSuchT_Ul_PrgEvaluacionException {

		T_Ul_PrgEvaluacion t_Ul_PrgEvaluacion = fetchByproblPreguntas_First(
			problPreguntas, orderByComparator);

		if (t_Ul_PrgEvaluacion != null) {
			return t_Ul_PrgEvaluacion;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("problPreguntas=");
		sb.append(problPreguntas);

		sb.append("}");

		throw new NoSuchT_Ul_PrgEvaluacionException(sb.toString());
	}

	/**
	 * Returns the first t_ ul_ prg evaluacion in the ordered set where problPreguntas = &#63;.
	 *
	 * @param problPreguntas the probl preguntas
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ prg evaluacion, or <code>null</code> if a matching t_ ul_ prg evaluacion could not be found
	 */
	@Override
	public T_Ul_PrgEvaluacion fetchByproblPreguntas_First(
		String problPreguntas,
		OrderByComparator<T_Ul_PrgEvaluacion> orderByComparator) {

		List<T_Ul_PrgEvaluacion> list = findByproblPreguntas(
			problPreguntas, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last t_ ul_ prg evaluacion in the ordered set where problPreguntas = &#63;.
	 *
	 * @param problPreguntas the probl preguntas
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ prg evaluacion
	 * @throws NoSuchT_Ul_PrgEvaluacionException if a matching t_ ul_ prg evaluacion could not be found
	 */
	@Override
	public T_Ul_PrgEvaluacion findByproblPreguntas_Last(
			String problPreguntas,
			OrderByComparator<T_Ul_PrgEvaluacion> orderByComparator)
		throws NoSuchT_Ul_PrgEvaluacionException {

		T_Ul_PrgEvaluacion t_Ul_PrgEvaluacion = fetchByproblPreguntas_Last(
			problPreguntas, orderByComparator);

		if (t_Ul_PrgEvaluacion != null) {
			return t_Ul_PrgEvaluacion;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("problPreguntas=");
		sb.append(problPreguntas);

		sb.append("}");

		throw new NoSuchT_Ul_PrgEvaluacionException(sb.toString());
	}

	/**
	 * Returns the last t_ ul_ prg evaluacion in the ordered set where problPreguntas = &#63;.
	 *
	 * @param problPreguntas the probl preguntas
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ prg evaluacion, or <code>null</code> if a matching t_ ul_ prg evaluacion could not be found
	 */
	@Override
	public T_Ul_PrgEvaluacion fetchByproblPreguntas_Last(
		String problPreguntas,
		OrderByComparator<T_Ul_PrgEvaluacion> orderByComparator) {

		int count = countByproblPreguntas(problPreguntas);

		if (count == 0) {
			return null;
		}

		List<T_Ul_PrgEvaluacion> list = findByproblPreguntas(
			problPreguntas, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the t_ ul_ prg evaluacions before and after the current t_ ul_ prg evaluacion in the ordered set where problPreguntas = &#63;.
	 *
	 * @param idPreguntas the primary key of the current t_ ul_ prg evaluacion
	 * @param problPreguntas the probl preguntas
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t_ ul_ prg evaluacion
	 * @throws NoSuchT_Ul_PrgEvaluacionException if a t_ ul_ prg evaluacion with the primary key could not be found
	 */
	@Override
	public T_Ul_PrgEvaluacion[] findByproblPreguntas_PrevAndNext(
			long idPreguntas, String problPreguntas,
			OrderByComparator<T_Ul_PrgEvaluacion> orderByComparator)
		throws NoSuchT_Ul_PrgEvaluacionException {

		problPreguntas = Objects.toString(problPreguntas, "");

		T_Ul_PrgEvaluacion t_Ul_PrgEvaluacion = findByPrimaryKey(idPreguntas);

		Session session = null;

		try {
			session = openSession();

			T_Ul_PrgEvaluacion[] array = new T_Ul_PrgEvaluacionImpl[3];

			array[0] = getByproblPreguntas_PrevAndNext(
				session, t_Ul_PrgEvaluacion, problPreguntas, orderByComparator,
				true);

			array[1] = t_Ul_PrgEvaluacion;

			array[2] = getByproblPreguntas_PrevAndNext(
				session, t_Ul_PrgEvaluacion, problPreguntas, orderByComparator,
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

	protected T_Ul_PrgEvaluacion getByproblPreguntas_PrevAndNext(
		Session session, T_Ul_PrgEvaluacion t_Ul_PrgEvaluacion,
		String problPreguntas,
		OrderByComparator<T_Ul_PrgEvaluacion> orderByComparator,
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

		sb.append(_SQL_SELECT_T_UL_PRGEVALUACION_WHERE);

		boolean bindProblPreguntas = false;

		if (problPreguntas.isEmpty()) {
			sb.append(_FINDER_COLUMN_PROBLPREGUNTAS_PROBLPREGUNTAS_3);
		}
		else {
			bindProblPreguntas = true;

			sb.append(_FINDER_COLUMN_PROBLPREGUNTAS_PROBLPREGUNTAS_2);
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
			sb.append(T_Ul_PrgEvaluacionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindProblPreguntas) {
			queryPos.add(problPreguntas);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						t_Ul_PrgEvaluacion)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<T_Ul_PrgEvaluacion> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the t_ ul_ prg evaluacions where problPreguntas = &#63; from the database.
	 *
	 * @param problPreguntas the probl preguntas
	 */
	@Override
	public void removeByproblPreguntas(String problPreguntas) {
		for (T_Ul_PrgEvaluacion t_Ul_PrgEvaluacion :
				findByproblPreguntas(
					problPreguntas, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(t_Ul_PrgEvaluacion);
		}
	}

	/**
	 * Returns the number of t_ ul_ prg evaluacions where problPreguntas = &#63;.
	 *
	 * @param problPreguntas the probl preguntas
	 * @return the number of matching t_ ul_ prg evaluacions
	 */
	@Override
	public int countByproblPreguntas(String problPreguntas) {
		problPreguntas = Objects.toString(problPreguntas, "");

		FinderPath finderPath = _finderPathCountByproblPreguntas;

		Object[] finderArgs = new Object[] {problPreguntas};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_T_UL_PRGEVALUACION_WHERE);

			boolean bindProblPreguntas = false;

			if (problPreguntas.isEmpty()) {
				sb.append(_FINDER_COLUMN_PROBLPREGUNTAS_PROBLPREGUNTAS_3);
			}
			else {
				bindProblPreguntas = true;

				sb.append(_FINDER_COLUMN_PROBLPREGUNTAS_PROBLPREGUNTAS_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindProblPreguntas) {
					queryPos.add(problPreguntas);
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

	private static final String _FINDER_COLUMN_PROBLPREGUNTAS_PROBLPREGUNTAS_2 =
		"t_Ul_PrgEvaluacion.problPreguntas = ?";

	private static final String _FINDER_COLUMN_PROBLPREGUNTAS_PROBLPREGUNTAS_3 =
		"(t_Ul_PrgEvaluacion.problPreguntas IS NULL OR t_Ul_PrgEvaluacion.problPreguntas = '')";

	public T_Ul_PrgEvaluacionPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(T_Ul_PrgEvaluacion.class);

		setModelImplClass(T_Ul_PrgEvaluacionImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the t_ ul_ prg evaluacion in the entity cache if it is enabled.
	 *
	 * @param t_Ul_PrgEvaluacion the t_ ul_ prg evaluacion
	 */
	@Override
	public void cacheResult(T_Ul_PrgEvaluacion t_Ul_PrgEvaluacion) {
		entityCache.putResult(
			T_Ul_PrgEvaluacionImpl.class, t_Ul_PrgEvaluacion.getPrimaryKey(),
			t_Ul_PrgEvaluacion);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				t_Ul_PrgEvaluacion.getUuid(), t_Ul_PrgEvaluacion.getGroupId()
			},
			t_Ul_PrgEvaluacion);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the t_ ul_ prg evaluacions in the entity cache if it is enabled.
	 *
	 * @param t_Ul_PrgEvaluacions the t_ ul_ prg evaluacions
	 */
	@Override
	public void cacheResult(List<T_Ul_PrgEvaluacion> t_Ul_PrgEvaluacions) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (t_Ul_PrgEvaluacions.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (T_Ul_PrgEvaluacion t_Ul_PrgEvaluacion : t_Ul_PrgEvaluacions) {
			if (entityCache.getResult(
					T_Ul_PrgEvaluacionImpl.class,
					t_Ul_PrgEvaluacion.getPrimaryKey()) == null) {

				cacheResult(t_Ul_PrgEvaluacion);
			}
		}
	}

	/**
	 * Clears the cache for all t_ ul_ prg evaluacions.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(T_Ul_PrgEvaluacionImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the t_ ul_ prg evaluacion.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(T_Ul_PrgEvaluacion t_Ul_PrgEvaluacion) {
		entityCache.removeResult(
			T_Ul_PrgEvaluacionImpl.class, t_Ul_PrgEvaluacion);
	}

	@Override
	public void clearCache(List<T_Ul_PrgEvaluacion> t_Ul_PrgEvaluacions) {
		for (T_Ul_PrgEvaluacion t_Ul_PrgEvaluacion : t_Ul_PrgEvaluacions) {
			entityCache.removeResult(
				T_Ul_PrgEvaluacionImpl.class, t_Ul_PrgEvaluacion);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(T_Ul_PrgEvaluacionImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		T_Ul_PrgEvaluacionModelImpl t_Ul_PrgEvaluacionModelImpl) {

		Object[] args = new Object[] {
			t_Ul_PrgEvaluacionModelImpl.getUuid(),
			t_Ul_PrgEvaluacionModelImpl.getGroupId()
		};

		finderCache.putResult(
			_finderPathCountByUUID_G, args, Long.valueOf(1), false);
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, t_Ul_PrgEvaluacionModelImpl, false);
	}

	/**
	 * Creates a new t_ ul_ prg evaluacion with the primary key. Does not add the t_ ul_ prg evaluacion to the database.
	 *
	 * @param idPreguntas the primary key for the new t_ ul_ prg evaluacion
	 * @return the new t_ ul_ prg evaluacion
	 */
	@Override
	public T_Ul_PrgEvaluacion create(long idPreguntas) {
		T_Ul_PrgEvaluacion t_Ul_PrgEvaluacion = new T_Ul_PrgEvaluacionImpl();

		t_Ul_PrgEvaluacion.setNew(true);
		t_Ul_PrgEvaluacion.setPrimaryKey(idPreguntas);

		String uuid = PortalUUIDUtil.generate();

		t_Ul_PrgEvaluacion.setUuid(uuid);

		t_Ul_PrgEvaluacion.setCompanyId(CompanyThreadLocal.getCompanyId());

		return t_Ul_PrgEvaluacion;
	}

	/**
	 * Removes the t_ ul_ prg evaluacion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param idPreguntas the primary key of the t_ ul_ prg evaluacion
	 * @return the t_ ul_ prg evaluacion that was removed
	 * @throws NoSuchT_Ul_PrgEvaluacionException if a t_ ul_ prg evaluacion with the primary key could not be found
	 */
	@Override
	public T_Ul_PrgEvaluacion remove(long idPreguntas)
		throws NoSuchT_Ul_PrgEvaluacionException {

		return remove((Serializable)idPreguntas);
	}

	/**
	 * Removes the t_ ul_ prg evaluacion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the t_ ul_ prg evaluacion
	 * @return the t_ ul_ prg evaluacion that was removed
	 * @throws NoSuchT_Ul_PrgEvaluacionException if a t_ ul_ prg evaluacion with the primary key could not be found
	 */
	@Override
	public T_Ul_PrgEvaluacion remove(Serializable primaryKey)
		throws NoSuchT_Ul_PrgEvaluacionException {

		Session session = null;

		try {
			session = openSession();

			T_Ul_PrgEvaluacion t_Ul_PrgEvaluacion =
				(T_Ul_PrgEvaluacion)session.get(
					T_Ul_PrgEvaluacionImpl.class, primaryKey);

			if (t_Ul_PrgEvaluacion == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchT_Ul_PrgEvaluacionException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(t_Ul_PrgEvaluacion);
		}
		catch (NoSuchT_Ul_PrgEvaluacionException noSuchEntityException) {
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
	protected T_Ul_PrgEvaluacion removeImpl(
		T_Ul_PrgEvaluacion t_Ul_PrgEvaluacion) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(t_Ul_PrgEvaluacion)) {
				t_Ul_PrgEvaluacion = (T_Ul_PrgEvaluacion)session.get(
					T_Ul_PrgEvaluacionImpl.class,
					t_Ul_PrgEvaluacion.getPrimaryKeyObj());
			}

			if (t_Ul_PrgEvaluacion != null) {
				session.delete(t_Ul_PrgEvaluacion);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (t_Ul_PrgEvaluacion != null) {
			clearCache(t_Ul_PrgEvaluacion);
		}

		return t_Ul_PrgEvaluacion;
	}

	@Override
	public T_Ul_PrgEvaluacion updateImpl(
		T_Ul_PrgEvaluacion t_Ul_PrgEvaluacion) {

		boolean isNew = t_Ul_PrgEvaluacion.isNew();

		if (!(t_Ul_PrgEvaluacion instanceof T_Ul_PrgEvaluacionModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(t_Ul_PrgEvaluacion.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					t_Ul_PrgEvaluacion);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in t_Ul_PrgEvaluacion proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom T_Ul_PrgEvaluacion implementation " +
					t_Ul_PrgEvaluacion.getClass());
		}

		T_Ul_PrgEvaluacionModelImpl t_Ul_PrgEvaluacionModelImpl =
			(T_Ul_PrgEvaluacionModelImpl)t_Ul_PrgEvaluacion;

		if (Validator.isNull(t_Ul_PrgEvaluacion.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			t_Ul_PrgEvaluacion.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (t_Ul_PrgEvaluacion.getCreateDate() == null)) {
			if (serviceContext == null) {
				t_Ul_PrgEvaluacion.setCreateDate(date);
			}
			else {
				t_Ul_PrgEvaluacion.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!t_Ul_PrgEvaluacionModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				t_Ul_PrgEvaluacion.setModifiedDate(date);
			}
			else {
				t_Ul_PrgEvaluacion.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(t_Ul_PrgEvaluacion);
			}
			else {
				t_Ul_PrgEvaluacion = (T_Ul_PrgEvaluacion)session.merge(
					t_Ul_PrgEvaluacion);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			T_Ul_PrgEvaluacionImpl.class, t_Ul_PrgEvaluacionModelImpl, false,
			true);

		cacheUniqueFindersCache(t_Ul_PrgEvaluacionModelImpl);

		if (isNew) {
			t_Ul_PrgEvaluacion.setNew(false);
		}

		t_Ul_PrgEvaluacion.resetOriginalValues();

		return t_Ul_PrgEvaluacion;
	}

	/**
	 * Returns the t_ ul_ prg evaluacion with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the t_ ul_ prg evaluacion
	 * @return the t_ ul_ prg evaluacion
	 * @throws NoSuchT_Ul_PrgEvaluacionException if a t_ ul_ prg evaluacion with the primary key could not be found
	 */
	@Override
	public T_Ul_PrgEvaluacion findByPrimaryKey(Serializable primaryKey)
		throws NoSuchT_Ul_PrgEvaluacionException {

		T_Ul_PrgEvaluacion t_Ul_PrgEvaluacion = fetchByPrimaryKey(primaryKey);

		if (t_Ul_PrgEvaluacion == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchT_Ul_PrgEvaluacionException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return t_Ul_PrgEvaluacion;
	}

	/**
	 * Returns the t_ ul_ prg evaluacion with the primary key or throws a <code>NoSuchT_Ul_PrgEvaluacionException</code> if it could not be found.
	 *
	 * @param idPreguntas the primary key of the t_ ul_ prg evaluacion
	 * @return the t_ ul_ prg evaluacion
	 * @throws NoSuchT_Ul_PrgEvaluacionException if a t_ ul_ prg evaluacion with the primary key could not be found
	 */
	@Override
	public T_Ul_PrgEvaluacion findByPrimaryKey(long idPreguntas)
		throws NoSuchT_Ul_PrgEvaluacionException {

		return findByPrimaryKey((Serializable)idPreguntas);
	}

	/**
	 * Returns the t_ ul_ prg evaluacion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param idPreguntas the primary key of the t_ ul_ prg evaluacion
	 * @return the t_ ul_ prg evaluacion, or <code>null</code> if a t_ ul_ prg evaluacion with the primary key could not be found
	 */
	@Override
	public T_Ul_PrgEvaluacion fetchByPrimaryKey(long idPreguntas) {
		return fetchByPrimaryKey((Serializable)idPreguntas);
	}

	/**
	 * Returns all the t_ ul_ prg evaluacions.
	 *
	 * @return the t_ ul_ prg evaluacions
	 */
	@Override
	public List<T_Ul_PrgEvaluacion> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the t_ ul_ prg evaluacions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_PrgEvaluacionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_ prg evaluacions
	 * @param end the upper bound of the range of t_ ul_ prg evaluacions (not inclusive)
	 * @return the range of t_ ul_ prg evaluacions
	 */
	@Override
	public List<T_Ul_PrgEvaluacion> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the t_ ul_ prg evaluacions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_PrgEvaluacionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_ prg evaluacions
	 * @param end the upper bound of the range of t_ ul_ prg evaluacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of t_ ul_ prg evaluacions
	 */
	@Override
	public List<T_Ul_PrgEvaluacion> findAll(
		int start, int end,
		OrderByComparator<T_Ul_PrgEvaluacion> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the t_ ul_ prg evaluacions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_PrgEvaluacionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_ prg evaluacions
	 * @param end the upper bound of the range of t_ ul_ prg evaluacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of t_ ul_ prg evaluacions
	 */
	@Override
	public List<T_Ul_PrgEvaluacion> findAll(
		int start, int end,
		OrderByComparator<T_Ul_PrgEvaluacion> orderByComparator,
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

		List<T_Ul_PrgEvaluacion> list = null;

		if (useFinderCache) {
			list = (List<T_Ul_PrgEvaluacion>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_T_UL_PRGEVALUACION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_T_UL_PRGEVALUACION;

				sql = sql.concat(T_Ul_PrgEvaluacionModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<T_Ul_PrgEvaluacion>)QueryUtil.list(
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
	 * Removes all the t_ ul_ prg evaluacions from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (T_Ul_PrgEvaluacion t_Ul_PrgEvaluacion : findAll()) {
			remove(t_Ul_PrgEvaluacion);
		}
	}

	/**
	 * Returns the number of t_ ul_ prg evaluacions.
	 *
	 * @return the number of t_ ul_ prg evaluacions
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_T_UL_PRGEVALUACION);

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
		return "idPreguntas";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_T_UL_PRGEVALUACION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return T_Ul_PrgEvaluacionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the t_ ul_ prg evaluacion persistence.
	 */
	@Activate
	public void activate(BundleContext bundleContext) {
		_bundleContext = bundleContext;

		_argumentsResolverServiceRegistration = _bundleContext.registerService(
			ArgumentsResolver.class,
			new T_Ul_PrgEvaluacionModelArgumentsResolver(),
			MapUtil.singletonDictionary(
				"model.class.name", T_Ul_PrgEvaluacion.class.getName()));

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

		_finderPathWithPaginationFindByproblPreguntas = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByproblPreguntas",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"problPreguntas"}, true);

		_finderPathWithoutPaginationFindByproblPreguntas = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByproblPreguntas",
			new String[] {String.class.getName()},
			new String[] {"problPreguntas"}, true);

		_finderPathCountByproblPreguntas = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByproblPreguntas",
			new String[] {String.class.getName()},
			new String[] {"problPreguntas"}, false);

		_setT_Ul_PrgEvaluacionUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setT_Ul_PrgEvaluacionUtilPersistence(null);

		entityCache.removeCache(T_Ul_PrgEvaluacionImpl.class.getName());

		_argumentsResolverServiceRegistration.unregister();

		for (ServiceRegistration<FinderPath> serviceRegistration :
				_serviceRegistrations) {

			serviceRegistration.unregister();
		}
	}

	private void _setT_Ul_PrgEvaluacionUtilPersistence(
		T_Ul_PrgEvaluacionPersistence t_Ul_PrgEvaluacionPersistence) {

		try {
			Field field = T_Ul_PrgEvaluacionUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, t_Ul_PrgEvaluacionPersistence);
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

	private static final String _SQL_SELECT_T_UL_PRGEVALUACION =
		"SELECT t_Ul_PrgEvaluacion FROM T_Ul_PrgEvaluacion t_Ul_PrgEvaluacion";

	private static final String _SQL_SELECT_T_UL_PRGEVALUACION_WHERE =
		"SELECT t_Ul_PrgEvaluacion FROM T_Ul_PrgEvaluacion t_Ul_PrgEvaluacion WHERE ";

	private static final String _SQL_COUNT_T_UL_PRGEVALUACION =
		"SELECT COUNT(t_Ul_PrgEvaluacion) FROM T_Ul_PrgEvaluacion t_Ul_PrgEvaluacion";

	private static final String _SQL_COUNT_T_UL_PRGEVALUACION_WHERE =
		"SELECT COUNT(t_Ul_PrgEvaluacion) FROM T_Ul_PrgEvaluacion t_Ul_PrgEvaluacion WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "t_Ul_PrgEvaluacion.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No T_Ul_PrgEvaluacion exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No T_Ul_PrgEvaluacion exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		T_Ul_PrgEvaluacionPersistenceImpl.class);

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

	private static class T_Ul_PrgEvaluacionModelArgumentsResolver
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

			T_Ul_PrgEvaluacionModelImpl t_Ul_PrgEvaluacionModelImpl =
				(T_Ul_PrgEvaluacionModelImpl)baseModel;

			long columnBitmask = t_Ul_PrgEvaluacionModelImpl.getColumnBitmask();

			if (!checkColumn || (columnBitmask == 0)) {
				return _getValue(
					t_Ul_PrgEvaluacionModelImpl, columnNames, original);
			}

			Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
				finderPath);

			if (finderPathColumnBitmask == null) {
				finderPathColumnBitmask = 0L;

				for (String columnName : columnNames) {
					finderPathColumnBitmask |=
						t_Ul_PrgEvaluacionModelImpl.getColumnBitmask(
							columnName);
				}

				if (finderPath.isBaseModelResult() &&
					(T_Ul_PrgEvaluacionPersistenceImpl.
						FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION ==
							finderPath.getCacheName())) {

					finderPathColumnBitmask |= _ORDER_BY_COLUMNS_BITMASK;
				}

				_finderPathColumnBitmasksCache.put(
					finderPath, finderPathColumnBitmask);
			}

			if ((columnBitmask & finderPathColumnBitmask) != 0) {
				return _getValue(
					t_Ul_PrgEvaluacionModelImpl, columnNames, original);
			}

			return null;
		}

		private static Object[] _getValue(
			T_Ul_PrgEvaluacionModelImpl t_Ul_PrgEvaluacionModelImpl,
			String[] columnNames, boolean original) {

			Object[] arguments = new Object[columnNames.length];

			for (int i = 0; i < arguments.length; i++) {
				String columnName = columnNames[i];

				if (original) {
					arguments[i] =
						t_Ul_PrgEvaluacionModelImpl.getColumnOriginalValue(
							columnName);
				}
				else {
					arguments[i] = t_Ul_PrgEvaluacionModelImpl.getColumnValue(
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
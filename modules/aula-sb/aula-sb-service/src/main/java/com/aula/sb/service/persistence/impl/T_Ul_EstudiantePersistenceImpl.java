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

import com.aula.sb.exception.NoSuchT_Ul_EstudianteException;
import com.aula.sb.model.T_Ul_Estudiante;
import com.aula.sb.model.impl.T_Ul_EstudianteImpl;
import com.aula.sb.model.impl.T_Ul_EstudianteModelImpl;
import com.aula.sb.service.persistence.T_Ul_EstudiantePersistence;
import com.aula.sb.service.persistence.T_Ul_EstudianteUtil;
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
 * The persistence implementation for the t_ ul_ estudiante service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = T_Ul_EstudiantePersistence.class)
public class T_Ul_EstudiantePersistenceImpl
	extends BasePersistenceImpl<T_Ul_Estudiante>
	implements T_Ul_EstudiantePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>T_Ul_EstudianteUtil</code> to access the t_ ul_ estudiante persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		T_Ul_EstudianteImpl.class.getName();

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
	 * Returns all the t_ ul_ estudiantes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching t_ ul_ estudiantes
	 */
	@Override
	public List<T_Ul_Estudiante> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the t_ ul_ estudiantes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_EstudianteModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of t_ ul_ estudiantes
	 * @param end the upper bound of the range of t_ ul_ estudiantes (not inclusive)
	 * @return the range of matching t_ ul_ estudiantes
	 */
	@Override
	public List<T_Ul_Estudiante> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the t_ ul_ estudiantes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_EstudianteModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of t_ ul_ estudiantes
	 * @param end the upper bound of the range of t_ ul_ estudiantes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t_ ul_ estudiantes
	 */
	@Override
	public List<T_Ul_Estudiante> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<T_Ul_Estudiante> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the t_ ul_ estudiantes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_EstudianteModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of t_ ul_ estudiantes
	 * @param end the upper bound of the range of t_ ul_ estudiantes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching t_ ul_ estudiantes
	 */
	@Override
	public List<T_Ul_Estudiante> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<T_Ul_Estudiante> orderByComparator,
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

		List<T_Ul_Estudiante> list = null;

		if (useFinderCache) {
			list = (List<T_Ul_Estudiante>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (T_Ul_Estudiante t_Ul_Estudiante : list) {
					if (!uuid.equals(t_Ul_Estudiante.getUuid())) {
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

			sb.append(_SQL_SELECT_T_UL_ESTUDIANTE_WHERE);

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
				sb.append(T_Ul_EstudianteModelImpl.ORDER_BY_JPQL);
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

				list = (List<T_Ul_Estudiante>)QueryUtil.list(
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
	 * Returns the first t_ ul_ estudiante in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ estudiante
	 * @throws NoSuchT_Ul_EstudianteException if a matching t_ ul_ estudiante could not be found
	 */
	@Override
	public T_Ul_Estudiante findByUuid_First(
			String uuid, OrderByComparator<T_Ul_Estudiante> orderByComparator)
		throws NoSuchT_Ul_EstudianteException {

		T_Ul_Estudiante t_Ul_Estudiante = fetchByUuid_First(
			uuid, orderByComparator);

		if (t_Ul_Estudiante != null) {
			return t_Ul_Estudiante;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchT_Ul_EstudianteException(sb.toString());
	}

	/**
	 * Returns the first t_ ul_ estudiante in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ estudiante, or <code>null</code> if a matching t_ ul_ estudiante could not be found
	 */
	@Override
	public T_Ul_Estudiante fetchByUuid_First(
		String uuid, OrderByComparator<T_Ul_Estudiante> orderByComparator) {

		List<T_Ul_Estudiante> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last t_ ul_ estudiante in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ estudiante
	 * @throws NoSuchT_Ul_EstudianteException if a matching t_ ul_ estudiante could not be found
	 */
	@Override
	public T_Ul_Estudiante findByUuid_Last(
			String uuid, OrderByComparator<T_Ul_Estudiante> orderByComparator)
		throws NoSuchT_Ul_EstudianteException {

		T_Ul_Estudiante t_Ul_Estudiante = fetchByUuid_Last(
			uuid, orderByComparator);

		if (t_Ul_Estudiante != null) {
			return t_Ul_Estudiante;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchT_Ul_EstudianteException(sb.toString());
	}

	/**
	 * Returns the last t_ ul_ estudiante in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ estudiante, or <code>null</code> if a matching t_ ul_ estudiante could not be found
	 */
	@Override
	public T_Ul_Estudiante fetchByUuid_Last(
		String uuid, OrderByComparator<T_Ul_Estudiante> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<T_Ul_Estudiante> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the t_ ul_ estudiantes before and after the current t_ ul_ estudiante in the ordered set where uuid = &#63;.
	 *
	 * @param idEstudiante the primary key of the current t_ ul_ estudiante
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t_ ul_ estudiante
	 * @throws NoSuchT_Ul_EstudianteException if a t_ ul_ estudiante with the primary key could not be found
	 */
	@Override
	public T_Ul_Estudiante[] findByUuid_PrevAndNext(
			long idEstudiante, String uuid,
			OrderByComparator<T_Ul_Estudiante> orderByComparator)
		throws NoSuchT_Ul_EstudianteException {

		uuid = Objects.toString(uuid, "");

		T_Ul_Estudiante t_Ul_Estudiante = findByPrimaryKey(idEstudiante);

		Session session = null;

		try {
			session = openSession();

			T_Ul_Estudiante[] array = new T_Ul_EstudianteImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, t_Ul_Estudiante, uuid, orderByComparator, true);

			array[1] = t_Ul_Estudiante;

			array[2] = getByUuid_PrevAndNext(
				session, t_Ul_Estudiante, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected T_Ul_Estudiante getByUuid_PrevAndNext(
		Session session, T_Ul_Estudiante t_Ul_Estudiante, String uuid,
		OrderByComparator<T_Ul_Estudiante> orderByComparator,
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

		sb.append(_SQL_SELECT_T_UL_ESTUDIANTE_WHERE);

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
			sb.append(T_Ul_EstudianteModelImpl.ORDER_BY_JPQL);
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
						t_Ul_Estudiante)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<T_Ul_Estudiante> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the t_ ul_ estudiantes where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (T_Ul_Estudiante t_Ul_Estudiante :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(t_Ul_Estudiante);
		}
	}

	/**
	 * Returns the number of t_ ul_ estudiantes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching t_ ul_ estudiantes
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_T_UL_ESTUDIANTE_WHERE);

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
		"t_Ul_Estudiante.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(t_Ul_Estudiante.uuid IS NULL OR t_Ul_Estudiante.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the t_ ul_ estudiante where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchT_Ul_EstudianteException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching t_ ul_ estudiante
	 * @throws NoSuchT_Ul_EstudianteException if a matching t_ ul_ estudiante could not be found
	 */
	@Override
	public T_Ul_Estudiante findByUUID_G(String uuid, long groupId)
		throws NoSuchT_Ul_EstudianteException {

		T_Ul_Estudiante t_Ul_Estudiante = fetchByUUID_G(uuid, groupId);

		if (t_Ul_Estudiante == null) {
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

			throw new NoSuchT_Ul_EstudianteException(sb.toString());
		}

		return t_Ul_Estudiante;
	}

	/**
	 * Returns the t_ ul_ estudiante where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching t_ ul_ estudiante, or <code>null</code> if a matching t_ ul_ estudiante could not be found
	 */
	@Override
	public T_Ul_Estudiante fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the t_ ul_ estudiante where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching t_ ul_ estudiante, or <code>null</code> if a matching t_ ul_ estudiante could not be found
	 */
	@Override
	public T_Ul_Estudiante fetchByUUID_G(
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

		if (result instanceof T_Ul_Estudiante) {
			T_Ul_Estudiante t_Ul_Estudiante = (T_Ul_Estudiante)result;

			if (!Objects.equals(uuid, t_Ul_Estudiante.getUuid()) ||
				(groupId != t_Ul_Estudiante.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_T_UL_ESTUDIANTE_WHERE);

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

				List<T_Ul_Estudiante> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					T_Ul_Estudiante t_Ul_Estudiante = list.get(0);

					result = t_Ul_Estudiante;

					cacheResult(t_Ul_Estudiante);
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
			return (T_Ul_Estudiante)result;
		}
	}

	/**
	 * Removes the t_ ul_ estudiante where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the t_ ul_ estudiante that was removed
	 */
	@Override
	public T_Ul_Estudiante removeByUUID_G(String uuid, long groupId)
		throws NoSuchT_Ul_EstudianteException {

		T_Ul_Estudiante t_Ul_Estudiante = findByUUID_G(uuid, groupId);

		return remove(t_Ul_Estudiante);
	}

	/**
	 * Returns the number of t_ ul_ estudiantes where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching t_ ul_ estudiantes
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_T_UL_ESTUDIANTE_WHERE);

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
		"t_Ul_Estudiante.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(t_Ul_Estudiante.uuid IS NULL OR t_Ul_Estudiante.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"t_Ul_Estudiante.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the t_ ul_ estudiantes where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching t_ ul_ estudiantes
	 */
	@Override
	public List<T_Ul_Estudiante> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the t_ ul_ estudiantes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_EstudianteModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of t_ ul_ estudiantes
	 * @param end the upper bound of the range of t_ ul_ estudiantes (not inclusive)
	 * @return the range of matching t_ ul_ estudiantes
	 */
	@Override
	public List<T_Ul_Estudiante> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the t_ ul_ estudiantes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_EstudianteModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of t_ ul_ estudiantes
	 * @param end the upper bound of the range of t_ ul_ estudiantes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t_ ul_ estudiantes
	 */
	@Override
	public List<T_Ul_Estudiante> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<T_Ul_Estudiante> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the t_ ul_ estudiantes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_EstudianteModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of t_ ul_ estudiantes
	 * @param end the upper bound of the range of t_ ul_ estudiantes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching t_ ul_ estudiantes
	 */
	@Override
	public List<T_Ul_Estudiante> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<T_Ul_Estudiante> orderByComparator,
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

		List<T_Ul_Estudiante> list = null;

		if (useFinderCache) {
			list = (List<T_Ul_Estudiante>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (T_Ul_Estudiante t_Ul_Estudiante : list) {
					if (!uuid.equals(t_Ul_Estudiante.getUuid()) ||
						(companyId != t_Ul_Estudiante.getCompanyId())) {

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

			sb.append(_SQL_SELECT_T_UL_ESTUDIANTE_WHERE);

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
				sb.append(T_Ul_EstudianteModelImpl.ORDER_BY_JPQL);
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

				list = (List<T_Ul_Estudiante>)QueryUtil.list(
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
	 * Returns the first t_ ul_ estudiante in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ estudiante
	 * @throws NoSuchT_Ul_EstudianteException if a matching t_ ul_ estudiante could not be found
	 */
	@Override
	public T_Ul_Estudiante findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<T_Ul_Estudiante> orderByComparator)
		throws NoSuchT_Ul_EstudianteException {

		T_Ul_Estudiante t_Ul_Estudiante = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (t_Ul_Estudiante != null) {
			return t_Ul_Estudiante;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchT_Ul_EstudianteException(sb.toString());
	}

	/**
	 * Returns the first t_ ul_ estudiante in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ estudiante, or <code>null</code> if a matching t_ ul_ estudiante could not be found
	 */
	@Override
	public T_Ul_Estudiante fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<T_Ul_Estudiante> orderByComparator) {

		List<T_Ul_Estudiante> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last t_ ul_ estudiante in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ estudiante
	 * @throws NoSuchT_Ul_EstudianteException if a matching t_ ul_ estudiante could not be found
	 */
	@Override
	public T_Ul_Estudiante findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<T_Ul_Estudiante> orderByComparator)
		throws NoSuchT_Ul_EstudianteException {

		T_Ul_Estudiante t_Ul_Estudiante = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (t_Ul_Estudiante != null) {
			return t_Ul_Estudiante;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchT_Ul_EstudianteException(sb.toString());
	}

	/**
	 * Returns the last t_ ul_ estudiante in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ estudiante, or <code>null</code> if a matching t_ ul_ estudiante could not be found
	 */
	@Override
	public T_Ul_Estudiante fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<T_Ul_Estudiante> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<T_Ul_Estudiante> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the t_ ul_ estudiantes before and after the current t_ ul_ estudiante in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param idEstudiante the primary key of the current t_ ul_ estudiante
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t_ ul_ estudiante
	 * @throws NoSuchT_Ul_EstudianteException if a t_ ul_ estudiante with the primary key could not be found
	 */
	@Override
	public T_Ul_Estudiante[] findByUuid_C_PrevAndNext(
			long idEstudiante, String uuid, long companyId,
			OrderByComparator<T_Ul_Estudiante> orderByComparator)
		throws NoSuchT_Ul_EstudianteException {

		uuid = Objects.toString(uuid, "");

		T_Ul_Estudiante t_Ul_Estudiante = findByPrimaryKey(idEstudiante);

		Session session = null;

		try {
			session = openSession();

			T_Ul_Estudiante[] array = new T_Ul_EstudianteImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, t_Ul_Estudiante, uuid, companyId, orderByComparator,
				true);

			array[1] = t_Ul_Estudiante;

			array[2] = getByUuid_C_PrevAndNext(
				session, t_Ul_Estudiante, uuid, companyId, orderByComparator,
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

	protected T_Ul_Estudiante getByUuid_C_PrevAndNext(
		Session session, T_Ul_Estudiante t_Ul_Estudiante, String uuid,
		long companyId, OrderByComparator<T_Ul_Estudiante> orderByComparator,
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

		sb.append(_SQL_SELECT_T_UL_ESTUDIANTE_WHERE);

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
			sb.append(T_Ul_EstudianteModelImpl.ORDER_BY_JPQL);
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
						t_Ul_Estudiante)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<T_Ul_Estudiante> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the t_ ul_ estudiantes where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (T_Ul_Estudiante t_Ul_Estudiante :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(t_Ul_Estudiante);
		}
	}

	/**
	 * Returns the number of t_ ul_ estudiantes where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching t_ ul_ estudiantes
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_T_UL_ESTUDIANTE_WHERE);

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
		"t_Ul_Estudiante.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(t_Ul_Estudiante.uuid IS NULL OR t_Ul_Estudiante.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"t_Ul_Estudiante.companyId = ?";

	private FinderPath _finderPathWithPaginationFindBynombreEstudiante;
	private FinderPath _finderPathWithoutPaginationFindBynombreEstudiante;
	private FinderPath _finderPathCountBynombreEstudiante;

	/**
	 * Returns all the t_ ul_ estudiantes where nombreEstudiante = &#63;.
	 *
	 * @param nombreEstudiante the nombre estudiante
	 * @return the matching t_ ul_ estudiantes
	 */
	@Override
	public List<T_Ul_Estudiante> findBynombreEstudiante(
		String nombreEstudiante) {

		return findBynombreEstudiante(
			nombreEstudiante, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the t_ ul_ estudiantes where nombreEstudiante = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_EstudianteModelImpl</code>.
	 * </p>
	 *
	 * @param nombreEstudiante the nombre estudiante
	 * @param start the lower bound of the range of t_ ul_ estudiantes
	 * @param end the upper bound of the range of t_ ul_ estudiantes (not inclusive)
	 * @return the range of matching t_ ul_ estudiantes
	 */
	@Override
	public List<T_Ul_Estudiante> findBynombreEstudiante(
		String nombreEstudiante, int start, int end) {

		return findBynombreEstudiante(nombreEstudiante, start, end, null);
	}

	/**
	 * Returns an ordered range of all the t_ ul_ estudiantes where nombreEstudiante = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_EstudianteModelImpl</code>.
	 * </p>
	 *
	 * @param nombreEstudiante the nombre estudiante
	 * @param start the lower bound of the range of t_ ul_ estudiantes
	 * @param end the upper bound of the range of t_ ul_ estudiantes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t_ ul_ estudiantes
	 */
	@Override
	public List<T_Ul_Estudiante> findBynombreEstudiante(
		String nombreEstudiante, int start, int end,
		OrderByComparator<T_Ul_Estudiante> orderByComparator) {

		return findBynombreEstudiante(
			nombreEstudiante, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the t_ ul_ estudiantes where nombreEstudiante = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_EstudianteModelImpl</code>.
	 * </p>
	 *
	 * @param nombreEstudiante the nombre estudiante
	 * @param start the lower bound of the range of t_ ul_ estudiantes
	 * @param end the upper bound of the range of t_ ul_ estudiantes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching t_ ul_ estudiantes
	 */
	@Override
	public List<T_Ul_Estudiante> findBynombreEstudiante(
		String nombreEstudiante, int start, int end,
		OrderByComparator<T_Ul_Estudiante> orderByComparator,
		boolean useFinderCache) {

		nombreEstudiante = Objects.toString(nombreEstudiante, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBynombreEstudiante;
				finderArgs = new Object[] {nombreEstudiante};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBynombreEstudiante;
			finderArgs = new Object[] {
				nombreEstudiante, start, end, orderByComparator
			};
		}

		List<T_Ul_Estudiante> list = null;

		if (useFinderCache) {
			list = (List<T_Ul_Estudiante>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (T_Ul_Estudiante t_Ul_Estudiante : list) {
					if (!nombreEstudiante.equals(
							t_Ul_Estudiante.getNombreEstudiante())) {

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

			sb.append(_SQL_SELECT_T_UL_ESTUDIANTE_WHERE);

			boolean bindNombreEstudiante = false;

			if (nombreEstudiante.isEmpty()) {
				sb.append(_FINDER_COLUMN_NOMBREESTUDIANTE_NOMBREESTUDIANTE_3);
			}
			else {
				bindNombreEstudiante = true;

				sb.append(_FINDER_COLUMN_NOMBREESTUDIANTE_NOMBREESTUDIANTE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(T_Ul_EstudianteModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindNombreEstudiante) {
					queryPos.add(nombreEstudiante);
				}

				list = (List<T_Ul_Estudiante>)QueryUtil.list(
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
	 * Returns the first t_ ul_ estudiante in the ordered set where nombreEstudiante = &#63;.
	 *
	 * @param nombreEstudiante the nombre estudiante
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ estudiante
	 * @throws NoSuchT_Ul_EstudianteException if a matching t_ ul_ estudiante could not be found
	 */
	@Override
	public T_Ul_Estudiante findBynombreEstudiante_First(
			String nombreEstudiante,
			OrderByComparator<T_Ul_Estudiante> orderByComparator)
		throws NoSuchT_Ul_EstudianteException {

		T_Ul_Estudiante t_Ul_Estudiante = fetchBynombreEstudiante_First(
			nombreEstudiante, orderByComparator);

		if (t_Ul_Estudiante != null) {
			return t_Ul_Estudiante;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("nombreEstudiante=");
		sb.append(nombreEstudiante);

		sb.append("}");

		throw new NoSuchT_Ul_EstudianteException(sb.toString());
	}

	/**
	 * Returns the first t_ ul_ estudiante in the ordered set where nombreEstudiante = &#63;.
	 *
	 * @param nombreEstudiante the nombre estudiante
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t_ ul_ estudiante, or <code>null</code> if a matching t_ ul_ estudiante could not be found
	 */
	@Override
	public T_Ul_Estudiante fetchBynombreEstudiante_First(
		String nombreEstudiante,
		OrderByComparator<T_Ul_Estudiante> orderByComparator) {

		List<T_Ul_Estudiante> list = findBynombreEstudiante(
			nombreEstudiante, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last t_ ul_ estudiante in the ordered set where nombreEstudiante = &#63;.
	 *
	 * @param nombreEstudiante the nombre estudiante
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ estudiante
	 * @throws NoSuchT_Ul_EstudianteException if a matching t_ ul_ estudiante could not be found
	 */
	@Override
	public T_Ul_Estudiante findBynombreEstudiante_Last(
			String nombreEstudiante,
			OrderByComparator<T_Ul_Estudiante> orderByComparator)
		throws NoSuchT_Ul_EstudianteException {

		T_Ul_Estudiante t_Ul_Estudiante = fetchBynombreEstudiante_Last(
			nombreEstudiante, orderByComparator);

		if (t_Ul_Estudiante != null) {
			return t_Ul_Estudiante;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("nombreEstudiante=");
		sb.append(nombreEstudiante);

		sb.append("}");

		throw new NoSuchT_Ul_EstudianteException(sb.toString());
	}

	/**
	 * Returns the last t_ ul_ estudiante in the ordered set where nombreEstudiante = &#63;.
	 *
	 * @param nombreEstudiante the nombre estudiante
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t_ ul_ estudiante, or <code>null</code> if a matching t_ ul_ estudiante could not be found
	 */
	@Override
	public T_Ul_Estudiante fetchBynombreEstudiante_Last(
		String nombreEstudiante,
		OrderByComparator<T_Ul_Estudiante> orderByComparator) {

		int count = countBynombreEstudiante(nombreEstudiante);

		if (count == 0) {
			return null;
		}

		List<T_Ul_Estudiante> list = findBynombreEstudiante(
			nombreEstudiante, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the t_ ul_ estudiantes before and after the current t_ ul_ estudiante in the ordered set where nombreEstudiante = &#63;.
	 *
	 * @param idEstudiante the primary key of the current t_ ul_ estudiante
	 * @param nombreEstudiante the nombre estudiante
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t_ ul_ estudiante
	 * @throws NoSuchT_Ul_EstudianteException if a t_ ul_ estudiante with the primary key could not be found
	 */
	@Override
	public T_Ul_Estudiante[] findBynombreEstudiante_PrevAndNext(
			long idEstudiante, String nombreEstudiante,
			OrderByComparator<T_Ul_Estudiante> orderByComparator)
		throws NoSuchT_Ul_EstudianteException {

		nombreEstudiante = Objects.toString(nombreEstudiante, "");

		T_Ul_Estudiante t_Ul_Estudiante = findByPrimaryKey(idEstudiante);

		Session session = null;

		try {
			session = openSession();

			T_Ul_Estudiante[] array = new T_Ul_EstudianteImpl[3];

			array[0] = getBynombreEstudiante_PrevAndNext(
				session, t_Ul_Estudiante, nombreEstudiante, orderByComparator,
				true);

			array[1] = t_Ul_Estudiante;

			array[2] = getBynombreEstudiante_PrevAndNext(
				session, t_Ul_Estudiante, nombreEstudiante, orderByComparator,
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

	protected T_Ul_Estudiante getBynombreEstudiante_PrevAndNext(
		Session session, T_Ul_Estudiante t_Ul_Estudiante,
		String nombreEstudiante,
		OrderByComparator<T_Ul_Estudiante> orderByComparator,
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

		sb.append(_SQL_SELECT_T_UL_ESTUDIANTE_WHERE);

		boolean bindNombreEstudiante = false;

		if (nombreEstudiante.isEmpty()) {
			sb.append(_FINDER_COLUMN_NOMBREESTUDIANTE_NOMBREESTUDIANTE_3);
		}
		else {
			bindNombreEstudiante = true;

			sb.append(_FINDER_COLUMN_NOMBREESTUDIANTE_NOMBREESTUDIANTE_2);
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
			sb.append(T_Ul_EstudianteModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindNombreEstudiante) {
			queryPos.add(nombreEstudiante);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						t_Ul_Estudiante)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<T_Ul_Estudiante> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the t_ ul_ estudiantes where nombreEstudiante = &#63; from the database.
	 *
	 * @param nombreEstudiante the nombre estudiante
	 */
	@Override
	public void removeBynombreEstudiante(String nombreEstudiante) {
		for (T_Ul_Estudiante t_Ul_Estudiante :
				findBynombreEstudiante(
					nombreEstudiante, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(t_Ul_Estudiante);
		}
	}

	/**
	 * Returns the number of t_ ul_ estudiantes where nombreEstudiante = &#63;.
	 *
	 * @param nombreEstudiante the nombre estudiante
	 * @return the number of matching t_ ul_ estudiantes
	 */
	@Override
	public int countBynombreEstudiante(String nombreEstudiante) {
		nombreEstudiante = Objects.toString(nombreEstudiante, "");

		FinderPath finderPath = _finderPathCountBynombreEstudiante;

		Object[] finderArgs = new Object[] {nombreEstudiante};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_T_UL_ESTUDIANTE_WHERE);

			boolean bindNombreEstudiante = false;

			if (nombreEstudiante.isEmpty()) {
				sb.append(_FINDER_COLUMN_NOMBREESTUDIANTE_NOMBREESTUDIANTE_3);
			}
			else {
				bindNombreEstudiante = true;

				sb.append(_FINDER_COLUMN_NOMBREESTUDIANTE_NOMBREESTUDIANTE_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindNombreEstudiante) {
					queryPos.add(nombreEstudiante);
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
		_FINDER_COLUMN_NOMBREESTUDIANTE_NOMBREESTUDIANTE_2 =
			"t_Ul_Estudiante.nombreEstudiante = ?";

	private static final String
		_FINDER_COLUMN_NOMBREESTUDIANTE_NOMBREESTUDIANTE_3 =
			"(t_Ul_Estudiante.nombreEstudiante IS NULL OR t_Ul_Estudiante.nombreEstudiante = '')";

	public T_Ul_EstudiantePersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(T_Ul_Estudiante.class);

		setModelImplClass(T_Ul_EstudianteImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the t_ ul_ estudiante in the entity cache if it is enabled.
	 *
	 * @param t_Ul_Estudiante the t_ ul_ estudiante
	 */
	@Override
	public void cacheResult(T_Ul_Estudiante t_Ul_Estudiante) {
		entityCache.putResult(
			T_Ul_EstudianteImpl.class, t_Ul_Estudiante.getPrimaryKey(),
			t_Ul_Estudiante);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				t_Ul_Estudiante.getUuid(), t_Ul_Estudiante.getGroupId()
			},
			t_Ul_Estudiante);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the t_ ul_ estudiantes in the entity cache if it is enabled.
	 *
	 * @param t_Ul_Estudiantes the t_ ul_ estudiantes
	 */
	@Override
	public void cacheResult(List<T_Ul_Estudiante> t_Ul_Estudiantes) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (t_Ul_Estudiantes.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (T_Ul_Estudiante t_Ul_Estudiante : t_Ul_Estudiantes) {
			if (entityCache.getResult(
					T_Ul_EstudianteImpl.class,
					t_Ul_Estudiante.getPrimaryKey()) == null) {

				cacheResult(t_Ul_Estudiante);
			}
		}
	}

	/**
	 * Clears the cache for all t_ ul_ estudiantes.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(T_Ul_EstudianteImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the t_ ul_ estudiante.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(T_Ul_Estudiante t_Ul_Estudiante) {
		entityCache.removeResult(T_Ul_EstudianteImpl.class, t_Ul_Estudiante);
	}

	@Override
	public void clearCache(List<T_Ul_Estudiante> t_Ul_Estudiantes) {
		for (T_Ul_Estudiante t_Ul_Estudiante : t_Ul_Estudiantes) {
			entityCache.removeResult(
				T_Ul_EstudianteImpl.class, t_Ul_Estudiante);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(T_Ul_EstudianteImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		T_Ul_EstudianteModelImpl t_Ul_EstudianteModelImpl) {

		Object[] args = new Object[] {
			t_Ul_EstudianteModelImpl.getUuid(),
			t_Ul_EstudianteModelImpl.getGroupId()
		};

		finderCache.putResult(
			_finderPathCountByUUID_G, args, Long.valueOf(1), false);
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, t_Ul_EstudianteModelImpl, false);
	}

	/**
	 * Creates a new t_ ul_ estudiante with the primary key. Does not add the t_ ul_ estudiante to the database.
	 *
	 * @param idEstudiante the primary key for the new t_ ul_ estudiante
	 * @return the new t_ ul_ estudiante
	 */
	@Override
	public T_Ul_Estudiante create(long idEstudiante) {
		T_Ul_Estudiante t_Ul_Estudiante = new T_Ul_EstudianteImpl();

		t_Ul_Estudiante.setNew(true);
		t_Ul_Estudiante.setPrimaryKey(idEstudiante);

		String uuid = PortalUUIDUtil.generate();

		t_Ul_Estudiante.setUuid(uuid);

		t_Ul_Estudiante.setCompanyId(CompanyThreadLocal.getCompanyId());

		return t_Ul_Estudiante;
	}

	/**
	 * Removes the t_ ul_ estudiante with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param idEstudiante the primary key of the t_ ul_ estudiante
	 * @return the t_ ul_ estudiante that was removed
	 * @throws NoSuchT_Ul_EstudianteException if a t_ ul_ estudiante with the primary key could not be found
	 */
	@Override
	public T_Ul_Estudiante remove(long idEstudiante)
		throws NoSuchT_Ul_EstudianteException {

		return remove((Serializable)idEstudiante);
	}

	/**
	 * Removes the t_ ul_ estudiante with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the t_ ul_ estudiante
	 * @return the t_ ul_ estudiante that was removed
	 * @throws NoSuchT_Ul_EstudianteException if a t_ ul_ estudiante with the primary key could not be found
	 */
	@Override
	public T_Ul_Estudiante remove(Serializable primaryKey)
		throws NoSuchT_Ul_EstudianteException {

		Session session = null;

		try {
			session = openSession();

			T_Ul_Estudiante t_Ul_Estudiante = (T_Ul_Estudiante)session.get(
				T_Ul_EstudianteImpl.class, primaryKey);

			if (t_Ul_Estudiante == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchT_Ul_EstudianteException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(t_Ul_Estudiante);
		}
		catch (NoSuchT_Ul_EstudianteException noSuchEntityException) {
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
	protected T_Ul_Estudiante removeImpl(T_Ul_Estudiante t_Ul_Estudiante) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(t_Ul_Estudiante)) {
				t_Ul_Estudiante = (T_Ul_Estudiante)session.get(
					T_Ul_EstudianteImpl.class,
					t_Ul_Estudiante.getPrimaryKeyObj());
			}

			if (t_Ul_Estudiante != null) {
				session.delete(t_Ul_Estudiante);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (t_Ul_Estudiante != null) {
			clearCache(t_Ul_Estudiante);
		}

		return t_Ul_Estudiante;
	}

	@Override
	public T_Ul_Estudiante updateImpl(T_Ul_Estudiante t_Ul_Estudiante) {
		boolean isNew = t_Ul_Estudiante.isNew();

		if (!(t_Ul_Estudiante instanceof T_Ul_EstudianteModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(t_Ul_Estudiante.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					t_Ul_Estudiante);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in t_Ul_Estudiante proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom T_Ul_Estudiante implementation " +
					t_Ul_Estudiante.getClass());
		}

		T_Ul_EstudianteModelImpl t_Ul_EstudianteModelImpl =
			(T_Ul_EstudianteModelImpl)t_Ul_Estudiante;

		if (Validator.isNull(t_Ul_Estudiante.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			t_Ul_Estudiante.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (t_Ul_Estudiante.getCreateDate() == null)) {
			if (serviceContext == null) {
				t_Ul_Estudiante.setCreateDate(date);
			}
			else {
				t_Ul_Estudiante.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!t_Ul_EstudianteModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				t_Ul_Estudiante.setModifiedDate(date);
			}
			else {
				t_Ul_Estudiante.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(t_Ul_Estudiante);
			}
			else {
				t_Ul_Estudiante = (T_Ul_Estudiante)session.merge(
					t_Ul_Estudiante);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			T_Ul_EstudianteImpl.class, t_Ul_EstudianteModelImpl, false, true);

		cacheUniqueFindersCache(t_Ul_EstudianteModelImpl);

		if (isNew) {
			t_Ul_Estudiante.setNew(false);
		}

		t_Ul_Estudiante.resetOriginalValues();

		return t_Ul_Estudiante;
	}

	/**
	 * Returns the t_ ul_ estudiante with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the t_ ul_ estudiante
	 * @return the t_ ul_ estudiante
	 * @throws NoSuchT_Ul_EstudianteException if a t_ ul_ estudiante with the primary key could not be found
	 */
	@Override
	public T_Ul_Estudiante findByPrimaryKey(Serializable primaryKey)
		throws NoSuchT_Ul_EstudianteException {

		T_Ul_Estudiante t_Ul_Estudiante = fetchByPrimaryKey(primaryKey);

		if (t_Ul_Estudiante == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchT_Ul_EstudianteException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return t_Ul_Estudiante;
	}

	/**
	 * Returns the t_ ul_ estudiante with the primary key or throws a <code>NoSuchT_Ul_EstudianteException</code> if it could not be found.
	 *
	 * @param idEstudiante the primary key of the t_ ul_ estudiante
	 * @return the t_ ul_ estudiante
	 * @throws NoSuchT_Ul_EstudianteException if a t_ ul_ estudiante with the primary key could not be found
	 */
	@Override
	public T_Ul_Estudiante findByPrimaryKey(long idEstudiante)
		throws NoSuchT_Ul_EstudianteException {

		return findByPrimaryKey((Serializable)idEstudiante);
	}

	/**
	 * Returns the t_ ul_ estudiante with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param idEstudiante the primary key of the t_ ul_ estudiante
	 * @return the t_ ul_ estudiante, or <code>null</code> if a t_ ul_ estudiante with the primary key could not be found
	 */
	@Override
	public T_Ul_Estudiante fetchByPrimaryKey(long idEstudiante) {
		return fetchByPrimaryKey((Serializable)idEstudiante);
	}

	/**
	 * Returns all the t_ ul_ estudiantes.
	 *
	 * @return the t_ ul_ estudiantes
	 */
	@Override
	public List<T_Ul_Estudiante> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the t_ ul_ estudiantes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_EstudianteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_ estudiantes
	 * @param end the upper bound of the range of t_ ul_ estudiantes (not inclusive)
	 * @return the range of t_ ul_ estudiantes
	 */
	@Override
	public List<T_Ul_Estudiante> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the t_ ul_ estudiantes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_EstudianteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_ estudiantes
	 * @param end the upper bound of the range of t_ ul_ estudiantes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of t_ ul_ estudiantes
	 */
	@Override
	public List<T_Ul_Estudiante> findAll(
		int start, int end,
		OrderByComparator<T_Ul_Estudiante> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the t_ ul_ estudiantes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>T_Ul_EstudianteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_ estudiantes
	 * @param end the upper bound of the range of t_ ul_ estudiantes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of t_ ul_ estudiantes
	 */
	@Override
	public List<T_Ul_Estudiante> findAll(
		int start, int end,
		OrderByComparator<T_Ul_Estudiante> orderByComparator,
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

		List<T_Ul_Estudiante> list = null;

		if (useFinderCache) {
			list = (List<T_Ul_Estudiante>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_T_UL_ESTUDIANTE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_T_UL_ESTUDIANTE;

				sql = sql.concat(T_Ul_EstudianteModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<T_Ul_Estudiante>)QueryUtil.list(
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
	 * Removes all the t_ ul_ estudiantes from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (T_Ul_Estudiante t_Ul_Estudiante : findAll()) {
			remove(t_Ul_Estudiante);
		}
	}

	/**
	 * Returns the number of t_ ul_ estudiantes.
	 *
	 * @return the number of t_ ul_ estudiantes
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_T_UL_ESTUDIANTE);

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
		return "idEstudiante";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_T_UL_ESTUDIANTE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return T_Ul_EstudianteModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the t_ ul_ estudiante persistence.
	 */
	@Activate
	public void activate(BundleContext bundleContext) {
		_bundleContext = bundleContext;

		_argumentsResolverServiceRegistration = _bundleContext.registerService(
			ArgumentsResolver.class,
			new T_Ul_EstudianteModelArgumentsResolver(),
			MapUtil.singletonDictionary(
				"model.class.name", T_Ul_Estudiante.class.getName()));

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

		_finderPathWithPaginationFindBynombreEstudiante = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBynombreEstudiante",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"nombreEstudiante"}, true);

		_finderPathWithoutPaginationFindBynombreEstudiante = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBynombreEstudiante",
			new String[] {String.class.getName()},
			new String[] {"nombreEstudiante"}, true);

		_finderPathCountBynombreEstudiante = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBynombreEstudiante", new String[] {String.class.getName()},
			new String[] {"nombreEstudiante"}, false);

		_setT_Ul_EstudianteUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setT_Ul_EstudianteUtilPersistence(null);

		entityCache.removeCache(T_Ul_EstudianteImpl.class.getName());

		_argumentsResolverServiceRegistration.unregister();

		for (ServiceRegistration<FinderPath> serviceRegistration :
				_serviceRegistrations) {

			serviceRegistration.unregister();
		}
	}

	private void _setT_Ul_EstudianteUtilPersistence(
		T_Ul_EstudiantePersistence t_Ul_EstudiantePersistence) {

		try {
			Field field = T_Ul_EstudianteUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, t_Ul_EstudiantePersistence);
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

	private static final String _SQL_SELECT_T_UL_ESTUDIANTE =
		"SELECT t_Ul_Estudiante FROM T_Ul_Estudiante t_Ul_Estudiante";

	private static final String _SQL_SELECT_T_UL_ESTUDIANTE_WHERE =
		"SELECT t_Ul_Estudiante FROM T_Ul_Estudiante t_Ul_Estudiante WHERE ";

	private static final String _SQL_COUNT_T_UL_ESTUDIANTE =
		"SELECT COUNT(t_Ul_Estudiante) FROM T_Ul_Estudiante t_Ul_Estudiante";

	private static final String _SQL_COUNT_T_UL_ESTUDIANTE_WHERE =
		"SELECT COUNT(t_Ul_Estudiante) FROM T_Ul_Estudiante t_Ul_Estudiante WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "t_Ul_Estudiante.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No T_Ul_Estudiante exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No T_Ul_Estudiante exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		T_Ul_EstudiantePersistenceImpl.class);

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

	private static class T_Ul_EstudianteModelArgumentsResolver
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

			T_Ul_EstudianteModelImpl t_Ul_EstudianteModelImpl =
				(T_Ul_EstudianteModelImpl)baseModel;

			long columnBitmask = t_Ul_EstudianteModelImpl.getColumnBitmask();

			if (!checkColumn || (columnBitmask == 0)) {
				return _getValue(
					t_Ul_EstudianteModelImpl, columnNames, original);
			}

			Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
				finderPath);

			if (finderPathColumnBitmask == null) {
				finderPathColumnBitmask = 0L;

				for (String columnName : columnNames) {
					finderPathColumnBitmask |=
						t_Ul_EstudianteModelImpl.getColumnBitmask(columnName);
				}

				if (finderPath.isBaseModelResult() &&
					(T_Ul_EstudiantePersistenceImpl.
						FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION ==
							finderPath.getCacheName())) {

					finderPathColumnBitmask |= _ORDER_BY_COLUMNS_BITMASK;
				}

				_finderPathColumnBitmasksCache.put(
					finderPath, finderPathColumnBitmask);
			}

			if ((columnBitmask & finderPathColumnBitmask) != 0) {
				return _getValue(
					t_Ul_EstudianteModelImpl, columnNames, original);
			}

			return null;
		}

		private static Object[] _getValue(
			T_Ul_EstudianteModelImpl t_Ul_EstudianteModelImpl,
			String[] columnNames, boolean original) {

			Object[] arguments = new Object[columnNames.length];

			for (int i = 0; i < arguments.length; i++) {
				String columnName = columnNames[i];

				if (original) {
					arguments[i] =
						t_Ul_EstudianteModelImpl.getColumnOriginalValue(
							columnName);
				}
				else {
					arguments[i] = t_Ul_EstudianteModelImpl.getColumnValue(
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
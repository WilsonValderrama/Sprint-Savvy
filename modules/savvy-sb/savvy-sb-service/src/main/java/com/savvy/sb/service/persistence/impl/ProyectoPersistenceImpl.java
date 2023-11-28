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

import com.savvy.sb.exception.NoSuchProyectoException;
import com.savvy.sb.model.Proyecto;
import com.savvy.sb.model.impl.ProyectoImpl;
import com.savvy.sb.model.impl.ProyectoModelImpl;
import com.savvy.sb.service.persistence.ProyectoPersistence;
import com.savvy.sb.service.persistence.ProyectoUtil;
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
 * The persistence implementation for the proyecto service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = ProyectoPersistence.class)
public class ProyectoPersistenceImpl
	extends BasePersistenceImpl<Proyecto> implements ProyectoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>ProyectoUtil</code> to access the proyecto persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		ProyectoImpl.class.getName();

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
	 * Returns all the proyectos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching proyectos
	 */
	@Override
	public List<Proyecto> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<Proyecto> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

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
	@Override
	public List<Proyecto> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Proyecto> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

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
	@Override
	public List<Proyecto> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Proyecto> orderByComparator, boolean useFinderCache) {

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

		List<Proyecto> list = null;

		if (useFinderCache) {
			list = (List<Proyecto>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Proyecto proyecto : list) {
					if (!uuid.equals(proyecto.getUuid())) {
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

			sb.append(_SQL_SELECT_PROYECTO_WHERE);

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
				sb.append(ProyectoModelImpl.ORDER_BY_JPQL);
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

				list = (List<Proyecto>)QueryUtil.list(
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
	 * Returns the first proyecto in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching proyecto
	 * @throws NoSuchProyectoException if a matching proyecto could not be found
	 */
	@Override
	public Proyecto findByUuid_First(
			String uuid, OrderByComparator<Proyecto> orderByComparator)
		throws NoSuchProyectoException {

		Proyecto proyecto = fetchByUuid_First(uuid, orderByComparator);

		if (proyecto != null) {
			return proyecto;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchProyectoException(sb.toString());
	}

	/**
	 * Returns the first proyecto in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching proyecto, or <code>null</code> if a matching proyecto could not be found
	 */
	@Override
	public Proyecto fetchByUuid_First(
		String uuid, OrderByComparator<Proyecto> orderByComparator) {

		List<Proyecto> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last proyecto in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching proyecto
	 * @throws NoSuchProyectoException if a matching proyecto could not be found
	 */
	@Override
	public Proyecto findByUuid_Last(
			String uuid, OrderByComparator<Proyecto> orderByComparator)
		throws NoSuchProyectoException {

		Proyecto proyecto = fetchByUuid_Last(uuid, orderByComparator);

		if (proyecto != null) {
			return proyecto;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchProyectoException(sb.toString());
	}

	/**
	 * Returns the last proyecto in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching proyecto, or <code>null</code> if a matching proyecto could not be found
	 */
	@Override
	public Proyecto fetchByUuid_Last(
		String uuid, OrderByComparator<Proyecto> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Proyecto> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the proyectos before and after the current proyecto in the ordered set where uuid = &#63;.
	 *
	 * @param proyectoId the primary key of the current proyecto
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next proyecto
	 * @throws NoSuchProyectoException if a proyecto with the primary key could not be found
	 */
	@Override
	public Proyecto[] findByUuid_PrevAndNext(
			long proyectoId, String uuid,
			OrderByComparator<Proyecto> orderByComparator)
		throws NoSuchProyectoException {

		uuid = Objects.toString(uuid, "");

		Proyecto proyecto = findByPrimaryKey(proyectoId);

		Session session = null;

		try {
			session = openSession();

			Proyecto[] array = new ProyectoImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, proyecto, uuid, orderByComparator, true);

			array[1] = proyecto;

			array[2] = getByUuid_PrevAndNext(
				session, proyecto, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Proyecto getByUuid_PrevAndNext(
		Session session, Proyecto proyecto, String uuid,
		OrderByComparator<Proyecto> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_PROYECTO_WHERE);

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
			sb.append(ProyectoModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(proyecto)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Proyecto> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the proyectos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Proyecto proyecto :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(proyecto);
		}
	}

	/**
	 * Returns the number of proyectos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching proyectos
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PROYECTO_WHERE);

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
		"proyecto.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(proyecto.uuid IS NULL OR proyecto.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the proyecto where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchProyectoException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching proyecto
	 * @throws NoSuchProyectoException if a matching proyecto could not be found
	 */
	@Override
	public Proyecto findByUUID_G(String uuid, long groupId)
		throws NoSuchProyectoException {

		Proyecto proyecto = fetchByUUID_G(uuid, groupId);

		if (proyecto == null) {
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

			throw new NoSuchProyectoException(sb.toString());
		}

		return proyecto;
	}

	/**
	 * Returns the proyecto where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching proyecto, or <code>null</code> if a matching proyecto could not be found
	 */
	@Override
	public Proyecto fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the proyecto where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching proyecto, or <code>null</code> if a matching proyecto could not be found
	 */
	@Override
	public Proyecto fetchByUUID_G(
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

		if (result instanceof Proyecto) {
			Proyecto proyecto = (Proyecto)result;

			if (!Objects.equals(uuid, proyecto.getUuid()) ||
				(groupId != proyecto.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_PROYECTO_WHERE);

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

				List<Proyecto> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					Proyecto proyecto = list.get(0);

					result = proyecto;

					cacheResult(proyecto);
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
			return (Proyecto)result;
		}
	}

	/**
	 * Removes the proyecto where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the proyecto that was removed
	 */
	@Override
	public Proyecto removeByUUID_G(String uuid, long groupId)
		throws NoSuchProyectoException {

		Proyecto proyecto = findByUUID_G(uuid, groupId);

		return remove(proyecto);
	}

	/**
	 * Returns the number of proyectos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching proyectos
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_PROYECTO_WHERE);

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
		"proyecto.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(proyecto.uuid IS NULL OR proyecto.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"proyecto.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the proyectos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching proyectos
	 */
	@Override
	public List<Proyecto> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<Proyecto> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

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
	@Override
	public List<Proyecto> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Proyecto> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

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
	@Override
	public List<Proyecto> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Proyecto> orderByComparator, boolean useFinderCache) {

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

		List<Proyecto> list = null;

		if (useFinderCache) {
			list = (List<Proyecto>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Proyecto proyecto : list) {
					if (!uuid.equals(proyecto.getUuid()) ||
						(companyId != proyecto.getCompanyId())) {

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

			sb.append(_SQL_SELECT_PROYECTO_WHERE);

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
				sb.append(ProyectoModelImpl.ORDER_BY_JPQL);
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

				list = (List<Proyecto>)QueryUtil.list(
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
	 * Returns the first proyecto in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching proyecto
	 * @throws NoSuchProyectoException if a matching proyecto could not be found
	 */
	@Override
	public Proyecto findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Proyecto> orderByComparator)
		throws NoSuchProyectoException {

		Proyecto proyecto = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (proyecto != null) {
			return proyecto;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchProyectoException(sb.toString());
	}

	/**
	 * Returns the first proyecto in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching proyecto, or <code>null</code> if a matching proyecto could not be found
	 */
	@Override
	public Proyecto fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Proyecto> orderByComparator) {

		List<Proyecto> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last proyecto in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching proyecto
	 * @throws NoSuchProyectoException if a matching proyecto could not be found
	 */
	@Override
	public Proyecto findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Proyecto> orderByComparator)
		throws NoSuchProyectoException {

		Proyecto proyecto = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (proyecto != null) {
			return proyecto;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchProyectoException(sb.toString());
	}

	/**
	 * Returns the last proyecto in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching proyecto, or <code>null</code> if a matching proyecto could not be found
	 */
	@Override
	public Proyecto fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Proyecto> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<Proyecto> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

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
	@Override
	public Proyecto[] findByUuid_C_PrevAndNext(
			long proyectoId, String uuid, long companyId,
			OrderByComparator<Proyecto> orderByComparator)
		throws NoSuchProyectoException {

		uuid = Objects.toString(uuid, "");

		Proyecto proyecto = findByPrimaryKey(proyectoId);

		Session session = null;

		try {
			session = openSession();

			Proyecto[] array = new ProyectoImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, proyecto, uuid, companyId, orderByComparator, true);

			array[1] = proyecto;

			array[2] = getByUuid_C_PrevAndNext(
				session, proyecto, uuid, companyId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Proyecto getByUuid_C_PrevAndNext(
		Session session, Proyecto proyecto, String uuid, long companyId,
		OrderByComparator<Proyecto> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_PROYECTO_WHERE);

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
			sb.append(ProyectoModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(proyecto)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Proyecto> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the proyectos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (Proyecto proyecto :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(proyecto);
		}
	}

	/**
	 * Returns the number of proyectos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching proyectos
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_PROYECTO_WHERE);

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
		"proyecto.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(proyecto.uuid IS NULL OR proyecto.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"proyecto.companyId = ?";

	private FinderPath _finderPathWithPaginationFindByTituloProyecto;
	private FinderPath _finderPathWithoutPaginationFindByTituloProyecto;
	private FinderPath _finderPathCountByTituloProyecto;

	/**
	 * Returns all the proyectos where tituloProyecto = &#63;.
	 *
	 * @param tituloProyecto the titulo proyecto
	 * @return the matching proyectos
	 */
	@Override
	public List<Proyecto> findByTituloProyecto(String tituloProyecto) {
		return findByTituloProyecto(
			tituloProyecto, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<Proyecto> findByTituloProyecto(
		String tituloProyecto, int start, int end) {

		return findByTituloProyecto(tituloProyecto, start, end, null);
	}

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
	@Override
	public List<Proyecto> findByTituloProyecto(
		String tituloProyecto, int start, int end,
		OrderByComparator<Proyecto> orderByComparator) {

		return findByTituloProyecto(
			tituloProyecto, start, end, orderByComparator, true);
	}

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
	@Override
	public List<Proyecto> findByTituloProyecto(
		String tituloProyecto, int start, int end,
		OrderByComparator<Proyecto> orderByComparator, boolean useFinderCache) {

		tituloProyecto = Objects.toString(tituloProyecto, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByTituloProyecto;
				finderArgs = new Object[] {tituloProyecto};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByTituloProyecto;
			finderArgs = new Object[] {
				tituloProyecto, start, end, orderByComparator
			};
		}

		List<Proyecto> list = null;

		if (useFinderCache) {
			list = (List<Proyecto>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Proyecto proyecto : list) {
					if (!tituloProyecto.equals(proyecto.getTituloProyecto())) {
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

			sb.append(_SQL_SELECT_PROYECTO_WHERE);

			boolean bindTituloProyecto = false;

			if (tituloProyecto.isEmpty()) {
				sb.append(_FINDER_COLUMN_TITULOPROYECTO_TITULOPROYECTO_3);
			}
			else {
				bindTituloProyecto = true;

				sb.append(_FINDER_COLUMN_TITULOPROYECTO_TITULOPROYECTO_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ProyectoModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindTituloProyecto) {
					queryPos.add(tituloProyecto);
				}

				list = (List<Proyecto>)QueryUtil.list(
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
	 * Returns the first proyecto in the ordered set where tituloProyecto = &#63;.
	 *
	 * @param tituloProyecto the titulo proyecto
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching proyecto
	 * @throws NoSuchProyectoException if a matching proyecto could not be found
	 */
	@Override
	public Proyecto findByTituloProyecto_First(
			String tituloProyecto,
			OrderByComparator<Proyecto> orderByComparator)
		throws NoSuchProyectoException {

		Proyecto proyecto = fetchByTituloProyecto_First(
			tituloProyecto, orderByComparator);

		if (proyecto != null) {
			return proyecto;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("tituloProyecto=");
		sb.append(tituloProyecto);

		sb.append("}");

		throw new NoSuchProyectoException(sb.toString());
	}

	/**
	 * Returns the first proyecto in the ordered set where tituloProyecto = &#63;.
	 *
	 * @param tituloProyecto the titulo proyecto
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching proyecto, or <code>null</code> if a matching proyecto could not be found
	 */
	@Override
	public Proyecto fetchByTituloProyecto_First(
		String tituloProyecto, OrderByComparator<Proyecto> orderByComparator) {

		List<Proyecto> list = findByTituloProyecto(
			tituloProyecto, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last proyecto in the ordered set where tituloProyecto = &#63;.
	 *
	 * @param tituloProyecto the titulo proyecto
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching proyecto
	 * @throws NoSuchProyectoException if a matching proyecto could not be found
	 */
	@Override
	public Proyecto findByTituloProyecto_Last(
			String tituloProyecto,
			OrderByComparator<Proyecto> orderByComparator)
		throws NoSuchProyectoException {

		Proyecto proyecto = fetchByTituloProyecto_Last(
			tituloProyecto, orderByComparator);

		if (proyecto != null) {
			return proyecto;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("tituloProyecto=");
		sb.append(tituloProyecto);

		sb.append("}");

		throw new NoSuchProyectoException(sb.toString());
	}

	/**
	 * Returns the last proyecto in the ordered set where tituloProyecto = &#63;.
	 *
	 * @param tituloProyecto the titulo proyecto
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching proyecto, or <code>null</code> if a matching proyecto could not be found
	 */
	@Override
	public Proyecto fetchByTituloProyecto_Last(
		String tituloProyecto, OrderByComparator<Proyecto> orderByComparator) {

		int count = countByTituloProyecto(tituloProyecto);

		if (count == 0) {
			return null;
		}

		List<Proyecto> list = findByTituloProyecto(
			tituloProyecto, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the proyectos before and after the current proyecto in the ordered set where tituloProyecto = &#63;.
	 *
	 * @param proyectoId the primary key of the current proyecto
	 * @param tituloProyecto the titulo proyecto
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next proyecto
	 * @throws NoSuchProyectoException if a proyecto with the primary key could not be found
	 */
	@Override
	public Proyecto[] findByTituloProyecto_PrevAndNext(
			long proyectoId, String tituloProyecto,
			OrderByComparator<Proyecto> orderByComparator)
		throws NoSuchProyectoException {

		tituloProyecto = Objects.toString(tituloProyecto, "");

		Proyecto proyecto = findByPrimaryKey(proyectoId);

		Session session = null;

		try {
			session = openSession();

			Proyecto[] array = new ProyectoImpl[3];

			array[0] = getByTituloProyecto_PrevAndNext(
				session, proyecto, tituloProyecto, orderByComparator, true);

			array[1] = proyecto;

			array[2] = getByTituloProyecto_PrevAndNext(
				session, proyecto, tituloProyecto, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Proyecto getByTituloProyecto_PrevAndNext(
		Session session, Proyecto proyecto, String tituloProyecto,
		OrderByComparator<Proyecto> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_PROYECTO_WHERE);

		boolean bindTituloProyecto = false;

		if (tituloProyecto.isEmpty()) {
			sb.append(_FINDER_COLUMN_TITULOPROYECTO_TITULOPROYECTO_3);
		}
		else {
			bindTituloProyecto = true;

			sb.append(_FINDER_COLUMN_TITULOPROYECTO_TITULOPROYECTO_2);
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
			sb.append(ProyectoModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindTituloProyecto) {
			queryPos.add(tituloProyecto);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(proyecto)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Proyecto> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the proyectos where tituloProyecto = &#63; from the database.
	 *
	 * @param tituloProyecto the titulo proyecto
	 */
	@Override
	public void removeByTituloProyecto(String tituloProyecto) {
		for (Proyecto proyecto :
				findByTituloProyecto(
					tituloProyecto, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(proyecto);
		}
	}

	/**
	 * Returns the number of proyectos where tituloProyecto = &#63;.
	 *
	 * @param tituloProyecto the titulo proyecto
	 * @return the number of matching proyectos
	 */
	@Override
	public int countByTituloProyecto(String tituloProyecto) {
		tituloProyecto = Objects.toString(tituloProyecto, "");

		FinderPath finderPath = _finderPathCountByTituloProyecto;

		Object[] finderArgs = new Object[] {tituloProyecto};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PROYECTO_WHERE);

			boolean bindTituloProyecto = false;

			if (tituloProyecto.isEmpty()) {
				sb.append(_FINDER_COLUMN_TITULOPROYECTO_TITULOPROYECTO_3);
			}
			else {
				bindTituloProyecto = true;

				sb.append(_FINDER_COLUMN_TITULOPROYECTO_TITULOPROYECTO_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindTituloProyecto) {
					queryPos.add(tituloProyecto);
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

	private static final String _FINDER_COLUMN_TITULOPROYECTO_TITULOPROYECTO_2 =
		"proyecto.tituloProyecto = ?";

	private static final String _FINDER_COLUMN_TITULOPROYECTO_TITULOPROYECTO_3 =
		"(proyecto.tituloProyecto IS NULL OR proyecto.tituloProyecto = '')";

	public ProyectoPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(Proyecto.class);

		setModelImplClass(ProyectoImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the proyecto in the entity cache if it is enabled.
	 *
	 * @param proyecto the proyecto
	 */
	@Override
	public void cacheResult(Proyecto proyecto) {
		entityCache.putResult(
			ProyectoImpl.class, proyecto.getPrimaryKey(), proyecto);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {proyecto.getUuid(), proyecto.getGroupId()}, proyecto);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the proyectos in the entity cache if it is enabled.
	 *
	 * @param proyectos the proyectos
	 */
	@Override
	public void cacheResult(List<Proyecto> proyectos) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (proyectos.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Proyecto proyecto : proyectos) {
			if (entityCache.getResult(
					ProyectoImpl.class, proyecto.getPrimaryKey()) == null) {

				cacheResult(proyecto);
			}
		}
	}

	/**
	 * Clears the cache for all proyectos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ProyectoImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the proyecto.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Proyecto proyecto) {
		entityCache.removeResult(ProyectoImpl.class, proyecto);
	}

	@Override
	public void clearCache(List<Proyecto> proyectos) {
		for (Proyecto proyecto : proyectos) {
			entityCache.removeResult(ProyectoImpl.class, proyecto);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(ProyectoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		ProyectoModelImpl proyectoModelImpl) {

		Object[] args = new Object[] {
			proyectoModelImpl.getUuid(), proyectoModelImpl.getGroupId()
		};

		finderCache.putResult(
			_finderPathCountByUUID_G, args, Long.valueOf(1), false);
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, proyectoModelImpl, false);
	}

	/**
	 * Creates a new proyecto with the primary key. Does not add the proyecto to the database.
	 *
	 * @param proyectoId the primary key for the new proyecto
	 * @return the new proyecto
	 */
	@Override
	public Proyecto create(long proyectoId) {
		Proyecto proyecto = new ProyectoImpl();

		proyecto.setNew(true);
		proyecto.setPrimaryKey(proyectoId);

		String uuid = PortalUUIDUtil.generate();

		proyecto.setUuid(uuid);

		proyecto.setCompanyId(CompanyThreadLocal.getCompanyId());

		return proyecto;
	}

	/**
	 * Removes the proyecto with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param proyectoId the primary key of the proyecto
	 * @return the proyecto that was removed
	 * @throws NoSuchProyectoException if a proyecto with the primary key could not be found
	 */
	@Override
	public Proyecto remove(long proyectoId) throws NoSuchProyectoException {
		return remove((Serializable)proyectoId);
	}

	/**
	 * Removes the proyecto with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the proyecto
	 * @return the proyecto that was removed
	 * @throws NoSuchProyectoException if a proyecto with the primary key could not be found
	 */
	@Override
	public Proyecto remove(Serializable primaryKey)
		throws NoSuchProyectoException {

		Session session = null;

		try {
			session = openSession();

			Proyecto proyecto = (Proyecto)session.get(
				ProyectoImpl.class, primaryKey);

			if (proyecto == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchProyectoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(proyecto);
		}
		catch (NoSuchProyectoException noSuchEntityException) {
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
	protected Proyecto removeImpl(Proyecto proyecto) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(proyecto)) {
				proyecto = (Proyecto)session.get(
					ProyectoImpl.class, proyecto.getPrimaryKeyObj());
			}

			if (proyecto != null) {
				session.delete(proyecto);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (proyecto != null) {
			clearCache(proyecto);
		}

		return proyecto;
	}

	@Override
	public Proyecto updateImpl(Proyecto proyecto) {
		boolean isNew = proyecto.isNew();

		if (!(proyecto instanceof ProyectoModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(proyecto.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(proyecto);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in proyecto proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Proyecto implementation " +
					proyecto.getClass());
		}

		ProyectoModelImpl proyectoModelImpl = (ProyectoModelImpl)proyecto;

		if (Validator.isNull(proyecto.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			proyecto.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (proyecto.getCreateDate() == null)) {
			if (serviceContext == null) {
				proyecto.setCreateDate(date);
			}
			else {
				proyecto.setCreateDate(serviceContext.getCreateDate(date));
			}
		}

		if (!proyectoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				proyecto.setModifiedDate(date);
			}
			else {
				proyecto.setModifiedDate(serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(proyecto);
			}
			else {
				proyecto = (Proyecto)session.merge(proyecto);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			ProyectoImpl.class, proyectoModelImpl, false, true);

		cacheUniqueFindersCache(proyectoModelImpl);

		if (isNew) {
			proyecto.setNew(false);
		}

		proyecto.resetOriginalValues();

		return proyecto;
	}

	/**
	 * Returns the proyecto with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the proyecto
	 * @return the proyecto
	 * @throws NoSuchProyectoException if a proyecto with the primary key could not be found
	 */
	@Override
	public Proyecto findByPrimaryKey(Serializable primaryKey)
		throws NoSuchProyectoException {

		Proyecto proyecto = fetchByPrimaryKey(primaryKey);

		if (proyecto == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchProyectoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return proyecto;
	}

	/**
	 * Returns the proyecto with the primary key or throws a <code>NoSuchProyectoException</code> if it could not be found.
	 *
	 * @param proyectoId the primary key of the proyecto
	 * @return the proyecto
	 * @throws NoSuchProyectoException if a proyecto with the primary key could not be found
	 */
	@Override
	public Proyecto findByPrimaryKey(long proyectoId)
		throws NoSuchProyectoException {

		return findByPrimaryKey((Serializable)proyectoId);
	}

	/**
	 * Returns the proyecto with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param proyectoId the primary key of the proyecto
	 * @return the proyecto, or <code>null</code> if a proyecto with the primary key could not be found
	 */
	@Override
	public Proyecto fetchByPrimaryKey(long proyectoId) {
		return fetchByPrimaryKey((Serializable)proyectoId);
	}

	/**
	 * Returns all the proyectos.
	 *
	 * @return the proyectos
	 */
	@Override
	public List<Proyecto> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<Proyecto> findAll(int start, int end) {
		return findAll(start, end, null);
	}

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
	@Override
	public List<Proyecto> findAll(
		int start, int end, OrderByComparator<Proyecto> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

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
	@Override
	public List<Proyecto> findAll(
		int start, int end, OrderByComparator<Proyecto> orderByComparator,
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

		List<Proyecto> list = null;

		if (useFinderCache) {
			list = (List<Proyecto>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_PROYECTO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_PROYECTO;

				sql = sql.concat(ProyectoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Proyecto>)QueryUtil.list(
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
	 * Removes all the proyectos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Proyecto proyecto : findAll()) {
			remove(proyecto);
		}
	}

	/**
	 * Returns the number of proyectos.
	 *
	 * @return the number of proyectos
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_PROYECTO);

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
		return "proyectoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_PROYECTO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ProyectoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the proyecto persistence.
	 */
	@Activate
	public void activate(BundleContext bundleContext) {
		_bundleContext = bundleContext;

		_argumentsResolverServiceRegistration = _bundleContext.registerService(
			ArgumentsResolver.class, new ProyectoModelArgumentsResolver(),
			MapUtil.singletonDictionary(
				"model.class.name", Proyecto.class.getName()));

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

		_finderPathWithPaginationFindByTituloProyecto = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByTituloProyecto",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"tituloProyecto"}, true);

		_finderPathWithoutPaginationFindByTituloProyecto = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByTituloProyecto",
			new String[] {String.class.getName()},
			new String[] {"tituloProyecto"}, true);

		_finderPathCountByTituloProyecto = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTituloProyecto",
			new String[] {String.class.getName()},
			new String[] {"tituloProyecto"}, false);

		_setProyectoUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setProyectoUtilPersistence(null);

		entityCache.removeCache(ProyectoImpl.class.getName());

		_argumentsResolverServiceRegistration.unregister();

		for (ServiceRegistration<FinderPath> serviceRegistration :
				_serviceRegistrations) {

			serviceRegistration.unregister();
		}
	}

	private void _setProyectoUtilPersistence(
		ProyectoPersistence proyectoPersistence) {

		try {
			Field field = ProyectoUtil.class.getDeclaredField("_persistence");

			field.setAccessible(true);

			field.set(null, proyectoPersistence);
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

	private static final String _SQL_SELECT_PROYECTO =
		"SELECT proyecto FROM Proyecto proyecto";

	private static final String _SQL_SELECT_PROYECTO_WHERE =
		"SELECT proyecto FROM Proyecto proyecto WHERE ";

	private static final String _SQL_COUNT_PROYECTO =
		"SELECT COUNT(proyecto) FROM Proyecto proyecto";

	private static final String _SQL_COUNT_PROYECTO_WHERE =
		"SELECT COUNT(proyecto) FROM Proyecto proyecto WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "proyecto.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Proyecto exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No Proyecto exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		ProyectoPersistenceImpl.class);

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

	private static class ProyectoModelArgumentsResolver
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

			ProyectoModelImpl proyectoModelImpl = (ProyectoModelImpl)baseModel;

			long columnBitmask = proyectoModelImpl.getColumnBitmask();

			if (!checkColumn || (columnBitmask == 0)) {
				return _getValue(proyectoModelImpl, columnNames, original);
			}

			Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
				finderPath);

			if (finderPathColumnBitmask == null) {
				finderPathColumnBitmask = 0L;

				for (String columnName : columnNames) {
					finderPathColumnBitmask |=
						proyectoModelImpl.getColumnBitmask(columnName);
				}

				if (finderPath.isBaseModelResult() &&
					(ProyectoPersistenceImpl.
						FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION ==
							finderPath.getCacheName())) {

					finderPathColumnBitmask |= _ORDER_BY_COLUMNS_BITMASK;
				}

				_finderPathColumnBitmasksCache.put(
					finderPath, finderPathColumnBitmask);
			}

			if ((columnBitmask & finderPathColumnBitmask) != 0) {
				return _getValue(proyectoModelImpl, columnNames, original);
			}

			return null;
		}

		private static Object[] _getValue(
			ProyectoModelImpl proyectoModelImpl, String[] columnNames,
			boolean original) {

			Object[] arguments = new Object[columnNames.length];

			for (int i = 0; i < arguments.length; i++) {
				String columnName = columnNames[i];

				if (original) {
					arguments[i] = proyectoModelImpl.getColumnOriginalValue(
						columnName);
				}
				else {
					arguments[i] = proyectoModelImpl.getColumnValue(columnName);
				}
			}

			return arguments;
		}

		private static final Map<FinderPath, Long>
			_finderPathColumnBitmasksCache = new ConcurrentHashMap<>();

		private static final long _ORDER_BY_COLUMNS_BITMASK;

		static {
			long orderByColumnsBitmask = 0;

			orderByColumnsBitmask |= ProyectoModelImpl.getColumnBitmask(
				"tituloProyecto");

			_ORDER_BY_COLUMNS_BITMASK = orderByColumnsBitmask;
		}

	}

}
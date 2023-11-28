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

import com.savvy.sb.exception.NoSuchCategoriaException;
import com.savvy.sb.model.Categoria;
import com.savvy.sb.model.impl.CategoriaImpl;
import com.savvy.sb.model.impl.CategoriaModelImpl;
import com.savvy.sb.service.persistence.CategoriaPersistence;
import com.savvy.sb.service.persistence.CategoriaUtil;
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
 * The persistence implementation for the categoria service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = CategoriaPersistence.class)
public class CategoriaPersistenceImpl
	extends BasePersistenceImpl<Categoria> implements CategoriaPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CategoriaUtil</code> to access the categoria persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CategoriaImpl.class.getName();

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
	 * Returns all the categorias where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching categorias
	 */
	@Override
	public List<Categoria> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the categorias where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CategoriaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of categorias
	 * @param end the upper bound of the range of categorias (not inclusive)
	 * @return the range of matching categorias
	 */
	@Override
	public List<Categoria> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the categorias where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CategoriaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of categorias
	 * @param end the upper bound of the range of categorias (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching categorias
	 */
	@Override
	public List<Categoria> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Categoria> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the categorias where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CategoriaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of categorias
	 * @param end the upper bound of the range of categorias (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching categorias
	 */
	@Override
	public List<Categoria> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Categoria> orderByComparator,
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

		List<Categoria> list = null;

		if (useFinderCache) {
			list = (List<Categoria>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Categoria categoria : list) {
					if (!uuid.equals(categoria.getUuid())) {
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

			sb.append(_SQL_SELECT_CATEGORIA_WHERE);

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
				sb.append(CategoriaModelImpl.ORDER_BY_JPQL);
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

				list = (List<Categoria>)QueryUtil.list(
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
	 * Returns the first categoria in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching categoria
	 * @throws NoSuchCategoriaException if a matching categoria could not be found
	 */
	@Override
	public Categoria findByUuid_First(
			String uuid, OrderByComparator<Categoria> orderByComparator)
		throws NoSuchCategoriaException {

		Categoria categoria = fetchByUuid_First(uuid, orderByComparator);

		if (categoria != null) {
			return categoria;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchCategoriaException(sb.toString());
	}

	/**
	 * Returns the first categoria in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching categoria, or <code>null</code> if a matching categoria could not be found
	 */
	@Override
	public Categoria fetchByUuid_First(
		String uuid, OrderByComparator<Categoria> orderByComparator) {

		List<Categoria> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last categoria in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching categoria
	 * @throws NoSuchCategoriaException if a matching categoria could not be found
	 */
	@Override
	public Categoria findByUuid_Last(
			String uuid, OrderByComparator<Categoria> orderByComparator)
		throws NoSuchCategoriaException {

		Categoria categoria = fetchByUuid_Last(uuid, orderByComparator);

		if (categoria != null) {
			return categoria;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchCategoriaException(sb.toString());
	}

	/**
	 * Returns the last categoria in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching categoria, or <code>null</code> if a matching categoria could not be found
	 */
	@Override
	public Categoria fetchByUuid_Last(
		String uuid, OrderByComparator<Categoria> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Categoria> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the categorias before and after the current categoria in the ordered set where uuid = &#63;.
	 *
	 * @param categoriaId the primary key of the current categoria
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next categoria
	 * @throws NoSuchCategoriaException if a categoria with the primary key could not be found
	 */
	@Override
	public Categoria[] findByUuid_PrevAndNext(
			long categoriaId, String uuid,
			OrderByComparator<Categoria> orderByComparator)
		throws NoSuchCategoriaException {

		uuid = Objects.toString(uuid, "");

		Categoria categoria = findByPrimaryKey(categoriaId);

		Session session = null;

		try {
			session = openSession();

			Categoria[] array = new CategoriaImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, categoria, uuid, orderByComparator, true);

			array[1] = categoria;

			array[2] = getByUuid_PrevAndNext(
				session, categoria, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Categoria getByUuid_PrevAndNext(
		Session session, Categoria categoria, String uuid,
		OrderByComparator<Categoria> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_CATEGORIA_WHERE);

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
			sb.append(CategoriaModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(categoria)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Categoria> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the categorias where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Categoria categoria :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(categoria);
		}
	}

	/**
	 * Returns the number of categorias where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching categorias
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CATEGORIA_WHERE);

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
		"categoria.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(categoria.uuid IS NULL OR categoria.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the categoria where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCategoriaException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching categoria
	 * @throws NoSuchCategoriaException if a matching categoria could not be found
	 */
	@Override
	public Categoria findByUUID_G(String uuid, long groupId)
		throws NoSuchCategoriaException {

		Categoria categoria = fetchByUUID_G(uuid, groupId);

		if (categoria == null) {
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

			throw new NoSuchCategoriaException(sb.toString());
		}

		return categoria;
	}

	/**
	 * Returns the categoria where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching categoria, or <code>null</code> if a matching categoria could not be found
	 */
	@Override
	public Categoria fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the categoria where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching categoria, or <code>null</code> if a matching categoria could not be found
	 */
	@Override
	public Categoria fetchByUUID_G(
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

		if (result instanceof Categoria) {
			Categoria categoria = (Categoria)result;

			if (!Objects.equals(uuid, categoria.getUuid()) ||
				(groupId != categoria.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_CATEGORIA_WHERE);

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

				List<Categoria> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					Categoria categoria = list.get(0);

					result = categoria;

					cacheResult(categoria);
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
			return (Categoria)result;
		}
	}

	/**
	 * Removes the categoria where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the categoria that was removed
	 */
	@Override
	public Categoria removeByUUID_G(String uuid, long groupId)
		throws NoSuchCategoriaException {

		Categoria categoria = findByUUID_G(uuid, groupId);

		return remove(categoria);
	}

	/**
	 * Returns the number of categorias where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching categorias
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_CATEGORIA_WHERE);

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
		"categoria.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(categoria.uuid IS NULL OR categoria.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"categoria.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the categorias where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching categorias
	 */
	@Override
	public List<Categoria> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the categorias where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CategoriaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of categorias
	 * @param end the upper bound of the range of categorias (not inclusive)
	 * @return the range of matching categorias
	 */
	@Override
	public List<Categoria> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the categorias where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CategoriaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of categorias
	 * @param end the upper bound of the range of categorias (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching categorias
	 */
	@Override
	public List<Categoria> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Categoria> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the categorias where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CategoriaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of categorias
	 * @param end the upper bound of the range of categorias (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching categorias
	 */
	@Override
	public List<Categoria> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Categoria> orderByComparator,
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

		List<Categoria> list = null;

		if (useFinderCache) {
			list = (List<Categoria>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Categoria categoria : list) {
					if (!uuid.equals(categoria.getUuid()) ||
						(companyId != categoria.getCompanyId())) {

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

			sb.append(_SQL_SELECT_CATEGORIA_WHERE);

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
				sb.append(CategoriaModelImpl.ORDER_BY_JPQL);
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

				list = (List<Categoria>)QueryUtil.list(
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
	 * Returns the first categoria in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching categoria
	 * @throws NoSuchCategoriaException if a matching categoria could not be found
	 */
	@Override
	public Categoria findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Categoria> orderByComparator)
		throws NoSuchCategoriaException {

		Categoria categoria = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (categoria != null) {
			return categoria;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchCategoriaException(sb.toString());
	}

	/**
	 * Returns the first categoria in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching categoria, or <code>null</code> if a matching categoria could not be found
	 */
	@Override
	public Categoria fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Categoria> orderByComparator) {

		List<Categoria> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last categoria in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching categoria
	 * @throws NoSuchCategoriaException if a matching categoria could not be found
	 */
	@Override
	public Categoria findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Categoria> orderByComparator)
		throws NoSuchCategoriaException {

		Categoria categoria = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (categoria != null) {
			return categoria;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchCategoriaException(sb.toString());
	}

	/**
	 * Returns the last categoria in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching categoria, or <code>null</code> if a matching categoria could not be found
	 */
	@Override
	public Categoria fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Categoria> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<Categoria> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the categorias before and after the current categoria in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param categoriaId the primary key of the current categoria
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next categoria
	 * @throws NoSuchCategoriaException if a categoria with the primary key could not be found
	 */
	@Override
	public Categoria[] findByUuid_C_PrevAndNext(
			long categoriaId, String uuid, long companyId,
			OrderByComparator<Categoria> orderByComparator)
		throws NoSuchCategoriaException {

		uuid = Objects.toString(uuid, "");

		Categoria categoria = findByPrimaryKey(categoriaId);

		Session session = null;

		try {
			session = openSession();

			Categoria[] array = new CategoriaImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, categoria, uuid, companyId, orderByComparator, true);

			array[1] = categoria;

			array[2] = getByUuid_C_PrevAndNext(
				session, categoria, uuid, companyId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Categoria getByUuid_C_PrevAndNext(
		Session session, Categoria categoria, String uuid, long companyId,
		OrderByComparator<Categoria> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_CATEGORIA_WHERE);

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
			sb.append(CategoriaModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(categoria)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Categoria> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the categorias where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (Categoria categoria :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(categoria);
		}
	}

	/**
	 * Returns the number of categorias where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching categorias
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_CATEGORIA_WHERE);

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
		"categoria.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(categoria.uuid IS NULL OR categoria.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"categoria.companyId = ?";

	private FinderPath _finderPathWithPaginationFindByNombreCategoria;
	private FinderPath _finderPathWithoutPaginationFindByNombreCategoria;
	private FinderPath _finderPathCountByNombreCategoria;

	/**
	 * Returns all the categorias where nombreCategoria = &#63;.
	 *
	 * @param nombreCategoria the nombre categoria
	 * @return the matching categorias
	 */
	@Override
	public List<Categoria> findByNombreCategoria(String nombreCategoria) {
		return findByNombreCategoria(
			nombreCategoria, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the categorias where nombreCategoria = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CategoriaModelImpl</code>.
	 * </p>
	 *
	 * @param nombreCategoria the nombre categoria
	 * @param start the lower bound of the range of categorias
	 * @param end the upper bound of the range of categorias (not inclusive)
	 * @return the range of matching categorias
	 */
	@Override
	public List<Categoria> findByNombreCategoria(
		String nombreCategoria, int start, int end) {

		return findByNombreCategoria(nombreCategoria, start, end, null);
	}

	/**
	 * Returns an ordered range of all the categorias where nombreCategoria = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CategoriaModelImpl</code>.
	 * </p>
	 *
	 * @param nombreCategoria the nombre categoria
	 * @param start the lower bound of the range of categorias
	 * @param end the upper bound of the range of categorias (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching categorias
	 */
	@Override
	public List<Categoria> findByNombreCategoria(
		String nombreCategoria, int start, int end,
		OrderByComparator<Categoria> orderByComparator) {

		return findByNombreCategoria(
			nombreCategoria, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the categorias where nombreCategoria = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CategoriaModelImpl</code>.
	 * </p>
	 *
	 * @param nombreCategoria the nombre categoria
	 * @param start the lower bound of the range of categorias
	 * @param end the upper bound of the range of categorias (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching categorias
	 */
	@Override
	public List<Categoria> findByNombreCategoria(
		String nombreCategoria, int start, int end,
		OrderByComparator<Categoria> orderByComparator,
		boolean useFinderCache) {

		nombreCategoria = Objects.toString(nombreCategoria, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByNombreCategoria;
				finderArgs = new Object[] {nombreCategoria};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByNombreCategoria;
			finderArgs = new Object[] {
				nombreCategoria, start, end, orderByComparator
			};
		}

		List<Categoria> list = null;

		if (useFinderCache) {
			list = (List<Categoria>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Categoria categoria : list) {
					if (!nombreCategoria.equals(
							categoria.getNombreCategoria())) {

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

			sb.append(_SQL_SELECT_CATEGORIA_WHERE);

			boolean bindNombreCategoria = false;

			if (nombreCategoria.isEmpty()) {
				sb.append(_FINDER_COLUMN_NOMBRECATEGORIA_NOMBRECATEGORIA_3);
			}
			else {
				bindNombreCategoria = true;

				sb.append(_FINDER_COLUMN_NOMBRECATEGORIA_NOMBRECATEGORIA_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(CategoriaModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindNombreCategoria) {
					queryPos.add(nombreCategoria);
				}

				list = (List<Categoria>)QueryUtil.list(
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
	 * Returns the first categoria in the ordered set where nombreCategoria = &#63;.
	 *
	 * @param nombreCategoria the nombre categoria
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching categoria
	 * @throws NoSuchCategoriaException if a matching categoria could not be found
	 */
	@Override
	public Categoria findByNombreCategoria_First(
			String nombreCategoria,
			OrderByComparator<Categoria> orderByComparator)
		throws NoSuchCategoriaException {

		Categoria categoria = fetchByNombreCategoria_First(
			nombreCategoria, orderByComparator);

		if (categoria != null) {
			return categoria;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("nombreCategoria=");
		sb.append(nombreCategoria);

		sb.append("}");

		throw new NoSuchCategoriaException(sb.toString());
	}

	/**
	 * Returns the first categoria in the ordered set where nombreCategoria = &#63;.
	 *
	 * @param nombreCategoria the nombre categoria
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching categoria, or <code>null</code> if a matching categoria could not be found
	 */
	@Override
	public Categoria fetchByNombreCategoria_First(
		String nombreCategoria,
		OrderByComparator<Categoria> orderByComparator) {

		List<Categoria> list = findByNombreCategoria(
			nombreCategoria, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last categoria in the ordered set where nombreCategoria = &#63;.
	 *
	 * @param nombreCategoria the nombre categoria
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching categoria
	 * @throws NoSuchCategoriaException if a matching categoria could not be found
	 */
	@Override
	public Categoria findByNombreCategoria_Last(
			String nombreCategoria,
			OrderByComparator<Categoria> orderByComparator)
		throws NoSuchCategoriaException {

		Categoria categoria = fetchByNombreCategoria_Last(
			nombreCategoria, orderByComparator);

		if (categoria != null) {
			return categoria;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("nombreCategoria=");
		sb.append(nombreCategoria);

		sb.append("}");

		throw new NoSuchCategoriaException(sb.toString());
	}

	/**
	 * Returns the last categoria in the ordered set where nombreCategoria = &#63;.
	 *
	 * @param nombreCategoria the nombre categoria
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching categoria, or <code>null</code> if a matching categoria could not be found
	 */
	@Override
	public Categoria fetchByNombreCategoria_Last(
		String nombreCategoria,
		OrderByComparator<Categoria> orderByComparator) {

		int count = countByNombreCategoria(nombreCategoria);

		if (count == 0) {
			return null;
		}

		List<Categoria> list = findByNombreCategoria(
			nombreCategoria, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the categorias before and after the current categoria in the ordered set where nombreCategoria = &#63;.
	 *
	 * @param categoriaId the primary key of the current categoria
	 * @param nombreCategoria the nombre categoria
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next categoria
	 * @throws NoSuchCategoriaException if a categoria with the primary key could not be found
	 */
	@Override
	public Categoria[] findByNombreCategoria_PrevAndNext(
			long categoriaId, String nombreCategoria,
			OrderByComparator<Categoria> orderByComparator)
		throws NoSuchCategoriaException {

		nombreCategoria = Objects.toString(nombreCategoria, "");

		Categoria categoria = findByPrimaryKey(categoriaId);

		Session session = null;

		try {
			session = openSession();

			Categoria[] array = new CategoriaImpl[3];

			array[0] = getByNombreCategoria_PrevAndNext(
				session, categoria, nombreCategoria, orderByComparator, true);

			array[1] = categoria;

			array[2] = getByNombreCategoria_PrevAndNext(
				session, categoria, nombreCategoria, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Categoria getByNombreCategoria_PrevAndNext(
		Session session, Categoria categoria, String nombreCategoria,
		OrderByComparator<Categoria> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_CATEGORIA_WHERE);

		boolean bindNombreCategoria = false;

		if (nombreCategoria.isEmpty()) {
			sb.append(_FINDER_COLUMN_NOMBRECATEGORIA_NOMBRECATEGORIA_3);
		}
		else {
			bindNombreCategoria = true;

			sb.append(_FINDER_COLUMN_NOMBRECATEGORIA_NOMBRECATEGORIA_2);
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
			sb.append(CategoriaModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindNombreCategoria) {
			queryPos.add(nombreCategoria);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(categoria)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Categoria> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the categorias where nombreCategoria = &#63; from the database.
	 *
	 * @param nombreCategoria the nombre categoria
	 */
	@Override
	public void removeByNombreCategoria(String nombreCategoria) {
		for (Categoria categoria :
				findByNombreCategoria(
					nombreCategoria, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(categoria);
		}
	}

	/**
	 * Returns the number of categorias where nombreCategoria = &#63;.
	 *
	 * @param nombreCategoria the nombre categoria
	 * @return the number of matching categorias
	 */
	@Override
	public int countByNombreCategoria(String nombreCategoria) {
		nombreCategoria = Objects.toString(nombreCategoria, "");

		FinderPath finderPath = _finderPathCountByNombreCategoria;

		Object[] finderArgs = new Object[] {nombreCategoria};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CATEGORIA_WHERE);

			boolean bindNombreCategoria = false;

			if (nombreCategoria.isEmpty()) {
				sb.append(_FINDER_COLUMN_NOMBRECATEGORIA_NOMBRECATEGORIA_3);
			}
			else {
				bindNombreCategoria = true;

				sb.append(_FINDER_COLUMN_NOMBRECATEGORIA_NOMBRECATEGORIA_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindNombreCategoria) {
					queryPos.add(nombreCategoria);
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
		_FINDER_COLUMN_NOMBRECATEGORIA_NOMBRECATEGORIA_2 =
			"categoria.nombreCategoria = ?";

	private static final String
		_FINDER_COLUMN_NOMBRECATEGORIA_NOMBRECATEGORIA_3 =
			"(categoria.nombreCategoria IS NULL OR categoria.nombreCategoria = '')";

	public CategoriaPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(Categoria.class);

		setModelImplClass(CategoriaImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the categoria in the entity cache if it is enabled.
	 *
	 * @param categoria the categoria
	 */
	@Override
	public void cacheResult(Categoria categoria) {
		entityCache.putResult(
			CategoriaImpl.class, categoria.getPrimaryKey(), categoria);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {categoria.getUuid(), categoria.getGroupId()},
			categoria);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the categorias in the entity cache if it is enabled.
	 *
	 * @param categorias the categorias
	 */
	@Override
	public void cacheResult(List<Categoria> categorias) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (categorias.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Categoria categoria : categorias) {
			if (entityCache.getResult(
					CategoriaImpl.class, categoria.getPrimaryKey()) == null) {

				cacheResult(categoria);
			}
		}
	}

	/**
	 * Clears the cache for all categorias.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CategoriaImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the categoria.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Categoria categoria) {
		entityCache.removeResult(CategoriaImpl.class, categoria);
	}

	@Override
	public void clearCache(List<Categoria> categorias) {
		for (Categoria categoria : categorias) {
			entityCache.removeResult(CategoriaImpl.class, categoria);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(CategoriaImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		CategoriaModelImpl categoriaModelImpl) {

		Object[] args = new Object[] {
			categoriaModelImpl.getUuid(), categoriaModelImpl.getGroupId()
		};

		finderCache.putResult(
			_finderPathCountByUUID_G, args, Long.valueOf(1), false);
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, categoriaModelImpl, false);
	}

	/**
	 * Creates a new categoria with the primary key. Does not add the categoria to the database.
	 *
	 * @param categoriaId the primary key for the new categoria
	 * @return the new categoria
	 */
	@Override
	public Categoria create(long categoriaId) {
		Categoria categoria = new CategoriaImpl();

		categoria.setNew(true);
		categoria.setPrimaryKey(categoriaId);

		String uuid = PortalUUIDUtil.generate();

		categoria.setUuid(uuid);

		categoria.setCompanyId(CompanyThreadLocal.getCompanyId());

		return categoria;
	}

	/**
	 * Removes the categoria with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param categoriaId the primary key of the categoria
	 * @return the categoria that was removed
	 * @throws NoSuchCategoriaException if a categoria with the primary key could not be found
	 */
	@Override
	public Categoria remove(long categoriaId) throws NoSuchCategoriaException {
		return remove((Serializable)categoriaId);
	}

	/**
	 * Removes the categoria with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the categoria
	 * @return the categoria that was removed
	 * @throws NoSuchCategoriaException if a categoria with the primary key could not be found
	 */
	@Override
	public Categoria remove(Serializable primaryKey)
		throws NoSuchCategoriaException {

		Session session = null;

		try {
			session = openSession();

			Categoria categoria = (Categoria)session.get(
				CategoriaImpl.class, primaryKey);

			if (categoria == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCategoriaException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(categoria);
		}
		catch (NoSuchCategoriaException noSuchEntityException) {
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
	protected Categoria removeImpl(Categoria categoria) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(categoria)) {
				categoria = (Categoria)session.get(
					CategoriaImpl.class, categoria.getPrimaryKeyObj());
			}

			if (categoria != null) {
				session.delete(categoria);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (categoria != null) {
			clearCache(categoria);
		}

		return categoria;
	}

	@Override
	public Categoria updateImpl(Categoria categoria) {
		boolean isNew = categoria.isNew();

		if (!(categoria instanceof CategoriaModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(categoria.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(categoria);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in categoria proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Categoria implementation " +
					categoria.getClass());
		}

		CategoriaModelImpl categoriaModelImpl = (CategoriaModelImpl)categoria;

		if (Validator.isNull(categoria.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			categoria.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (categoria.getCreateDate() == null)) {
			if (serviceContext == null) {
				categoria.setCreateDate(date);
			}
			else {
				categoria.setCreateDate(serviceContext.getCreateDate(date));
			}
		}

		if (!categoriaModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				categoria.setModifiedDate(date);
			}
			else {
				categoria.setModifiedDate(serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(categoria);
			}
			else {
				categoria = (Categoria)session.merge(categoria);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			CategoriaImpl.class, categoriaModelImpl, false, true);

		cacheUniqueFindersCache(categoriaModelImpl);

		if (isNew) {
			categoria.setNew(false);
		}

		categoria.resetOriginalValues();

		return categoria;
	}

	/**
	 * Returns the categoria with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the categoria
	 * @return the categoria
	 * @throws NoSuchCategoriaException if a categoria with the primary key could not be found
	 */
	@Override
	public Categoria findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCategoriaException {

		Categoria categoria = fetchByPrimaryKey(primaryKey);

		if (categoria == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCategoriaException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return categoria;
	}

	/**
	 * Returns the categoria with the primary key or throws a <code>NoSuchCategoriaException</code> if it could not be found.
	 *
	 * @param categoriaId the primary key of the categoria
	 * @return the categoria
	 * @throws NoSuchCategoriaException if a categoria with the primary key could not be found
	 */
	@Override
	public Categoria findByPrimaryKey(long categoriaId)
		throws NoSuchCategoriaException {

		return findByPrimaryKey((Serializable)categoriaId);
	}

	/**
	 * Returns the categoria with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param categoriaId the primary key of the categoria
	 * @return the categoria, or <code>null</code> if a categoria with the primary key could not be found
	 */
	@Override
	public Categoria fetchByPrimaryKey(long categoriaId) {
		return fetchByPrimaryKey((Serializable)categoriaId);
	}

	/**
	 * Returns all the categorias.
	 *
	 * @return the categorias
	 */
	@Override
	public List<Categoria> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the categorias.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CategoriaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of categorias
	 * @param end the upper bound of the range of categorias (not inclusive)
	 * @return the range of categorias
	 */
	@Override
	public List<Categoria> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the categorias.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CategoriaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of categorias
	 * @param end the upper bound of the range of categorias (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of categorias
	 */
	@Override
	public List<Categoria> findAll(
		int start, int end, OrderByComparator<Categoria> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the categorias.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CategoriaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of categorias
	 * @param end the upper bound of the range of categorias (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of categorias
	 */
	@Override
	public List<Categoria> findAll(
		int start, int end, OrderByComparator<Categoria> orderByComparator,
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

		List<Categoria> list = null;

		if (useFinderCache) {
			list = (List<Categoria>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_CATEGORIA);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_CATEGORIA;

				sql = sql.concat(CategoriaModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Categoria>)QueryUtil.list(
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
	 * Removes all the categorias from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Categoria categoria : findAll()) {
			remove(categoria);
		}
	}

	/**
	 * Returns the number of categorias.
	 *
	 * @return the number of categorias
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_CATEGORIA);

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
		return "categoriaId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_CATEGORIA;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CategoriaModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the categoria persistence.
	 */
	@Activate
	public void activate(BundleContext bundleContext) {
		_bundleContext = bundleContext;

		_argumentsResolverServiceRegistration = _bundleContext.registerService(
			ArgumentsResolver.class, new CategoriaModelArgumentsResolver(),
			MapUtil.singletonDictionary(
				"model.class.name", Categoria.class.getName()));

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

		_finderPathWithPaginationFindByNombreCategoria = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByNombreCategoria",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"nombreCategoria"}, true);

		_finderPathWithoutPaginationFindByNombreCategoria = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByNombreCategoria",
			new String[] {String.class.getName()},
			new String[] {"nombreCategoria"}, true);

		_finderPathCountByNombreCategoria = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByNombreCategoria",
			new String[] {String.class.getName()},
			new String[] {"nombreCategoria"}, false);

		_setCategoriaUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setCategoriaUtilPersistence(null);

		entityCache.removeCache(CategoriaImpl.class.getName());

		_argumentsResolverServiceRegistration.unregister();

		for (ServiceRegistration<FinderPath> serviceRegistration :
				_serviceRegistrations) {

			serviceRegistration.unregister();
		}
	}

	private void _setCategoriaUtilPersistence(
		CategoriaPersistence categoriaPersistence) {

		try {
			Field field = CategoriaUtil.class.getDeclaredField("_persistence");

			field.setAccessible(true);

			field.set(null, categoriaPersistence);
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

	private static final String _SQL_SELECT_CATEGORIA =
		"SELECT categoria FROM Categoria categoria";

	private static final String _SQL_SELECT_CATEGORIA_WHERE =
		"SELECT categoria FROM Categoria categoria WHERE ";

	private static final String _SQL_COUNT_CATEGORIA =
		"SELECT COUNT(categoria) FROM Categoria categoria";

	private static final String _SQL_COUNT_CATEGORIA_WHERE =
		"SELECT COUNT(categoria) FROM Categoria categoria WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "categoria.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Categoria exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No Categoria exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CategoriaPersistenceImpl.class);

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

	private static class CategoriaModelArgumentsResolver
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

			CategoriaModelImpl categoriaModelImpl =
				(CategoriaModelImpl)baseModel;

			long columnBitmask = categoriaModelImpl.getColumnBitmask();

			if (!checkColumn || (columnBitmask == 0)) {
				return _getValue(categoriaModelImpl, columnNames, original);
			}

			Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
				finderPath);

			if (finderPathColumnBitmask == null) {
				finderPathColumnBitmask = 0L;

				for (String columnName : columnNames) {
					finderPathColumnBitmask |=
						categoriaModelImpl.getColumnBitmask(columnName);
				}

				if (finderPath.isBaseModelResult() &&
					(CategoriaPersistenceImpl.
						FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION ==
							finderPath.getCacheName())) {

					finderPathColumnBitmask |= _ORDER_BY_COLUMNS_BITMASK;
				}

				_finderPathColumnBitmasksCache.put(
					finderPath, finderPathColumnBitmask);
			}

			if ((columnBitmask & finderPathColumnBitmask) != 0) {
				return _getValue(categoriaModelImpl, columnNames, original);
			}

			return null;
		}

		private static Object[] _getValue(
			CategoriaModelImpl categoriaModelImpl, String[] columnNames,
			boolean original) {

			Object[] arguments = new Object[columnNames.length];

			for (int i = 0; i < arguments.length; i++) {
				String columnName = columnNames[i];

				if (original) {
					arguments[i] = categoriaModelImpl.getColumnOriginalValue(
						columnName);
				}
				else {
					arguments[i] = categoriaModelImpl.getColumnValue(
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

			orderByColumnsBitmask |= CategoriaModelImpl.getColumnBitmask(
				"nombreCategoria");

			_ORDER_BY_COLUMNS_BITMASK = orderByColumnsBitmask;
		}

	}

}
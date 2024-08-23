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

package com.aula.sb.model.impl;

import com.aula.sb.model.T_Ul_Actividad;
import com.aula.sb.model.T_Ul_ActividadModel;
import com.aula.sb.model.T_Ul_ActividadSoap;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.sql.Blob;
import java.sql.Types;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the T_Ul_Actividad service. Represents a row in the &quot;AulaVirtual_T_Ul_Actividad&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>T_Ul_ActividadModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link T_Ul_ActividadImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see T_Ul_ActividadImpl
 * @generated
 */
@JSON(strict = true)
public class T_Ul_ActividadModelImpl
	extends BaseModelImpl<T_Ul_Actividad> implements T_Ul_ActividadModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a t_ ul_ actividad model instance should use the <code>T_Ul_Actividad</code> interface instead.
	 */
	public static final String TABLE_NAME = "AulaVirtual_T_Ul_Actividad";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"idActividad", Types.BIGINT},
		{"tituloActividad", Types.VARCHAR}, {"tipoActividad", Types.VARCHAR},
		{"descriActividad", Types.VARCHAR},
		{"estadoEntrActividad", Types.VARCHAR},
		{"fCreacActividad", Types.TIMESTAMP},
		{"fCierrActividad", Types.TIMESTAMP}, {"porcActividad", Types.VARCHAR},
		{"T_Ul_Califi_id", Types.BIGINT}, {"T_Ul_PAcademico_id", Types.BIGINT},
		{"groupId", Types.BIGINT}, {"companyId", Types.BIGINT},
		{"userId", Types.BIGINT}, {"userName", Types.VARCHAR},
		{"createDate", Types.TIMESTAMP}, {"modifiedDate", Types.TIMESTAMP}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("idActividad", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("tituloActividad", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("tipoActividad", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("descriActividad", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("estadoEntrActividad", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("fCreacActividad", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("fCierrActividad", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("porcActividad", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("T_Ul_Califi_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("T_Ul_PAcademico_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
	}

	public static final String TABLE_SQL_CREATE =
		"create table AulaVirtual_T_Ul_Actividad (uuid_ VARCHAR(75) null,idActividad LONG not null primary key,tituloActividad VARCHAR(75) null,tipoActividad VARCHAR(75) null,descriActividad VARCHAR(75) null,estadoEntrActividad VARCHAR(75) null,fCreacActividad DATE null,fCierrActividad DATE null,porcActividad VARCHAR(75) null,T_Ul_Califi_id LONG,T_Ul_PAcademico_id LONG,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null)";

	public static final String TABLE_SQL_DROP =
		"drop table AulaVirtual_T_Ul_Actividad";

	public static final String ORDER_BY_JPQL =
		" ORDER BY t_Ul_Actividad.idActividad ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY AulaVirtual_T_Ul_Actividad.idActividad ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long COMPANYID_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long GROUPID_COLUMN_BITMASK = 2L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long TITULOACTIVIDAD_COLUMN_BITMASK = 4L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long UUID_COLUMN_BITMASK = 8L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long IDACTIVIDAD_COLUMN_BITMASK = 16L;

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setEntityCacheEnabled(boolean entityCacheEnabled) {
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setFinderCacheEnabled(boolean finderCacheEnabled) {
	}

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static T_Ul_Actividad toModel(T_Ul_ActividadSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		T_Ul_Actividad model = new T_Ul_ActividadImpl();

		model.setUuid(soapModel.getUuid());
		model.setIdActividad(soapModel.getIdActividad());
		model.setTituloActividad(soapModel.getTituloActividad());
		model.setTipoActividad(soapModel.getTipoActividad());
		model.setDescriActividad(soapModel.getDescriActividad());
		model.setEstadoEntrActividad(soapModel.getEstadoEntrActividad());
		model.setFCreacActividad(soapModel.getFCreacActividad());
		model.setFCierrActividad(soapModel.getFCierrActividad());
		model.setPorcActividad(soapModel.getPorcActividad());
		model.setT_Ul_Califi_id(soapModel.getT_Ul_Califi_id());
		model.setT_Ul_PAcademico_id(soapModel.getT_Ul_PAcademico_id());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static List<T_Ul_Actividad> toModels(
		T_Ul_ActividadSoap[] soapModels) {

		if (soapModels == null) {
			return null;
		}

		List<T_Ul_Actividad> models = new ArrayList<T_Ul_Actividad>(
			soapModels.length);

		for (T_Ul_ActividadSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public T_Ul_ActividadModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _idActividad;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setIdActividad(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _idActividad;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return T_Ul_Actividad.class;
	}

	@Override
	public String getModelClassName() {
		return T_Ul_Actividad.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<T_Ul_Actividad, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<T_Ul_Actividad, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<T_Ul_Actividad, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((T_Ul_Actividad)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<T_Ul_Actividad, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<T_Ul_Actividad, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(T_Ul_Actividad)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<T_Ul_Actividad, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<T_Ul_Actividad, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static final Map<String, Function<T_Ul_Actividad, Object>>
		_attributeGetterFunctions;

	static {
		Map<String, Function<T_Ul_Actividad, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<T_Ul_Actividad, Object>>();

		attributeGetterFunctions.put("uuid", T_Ul_Actividad::getUuid);
		attributeGetterFunctions.put(
			"idActividad", T_Ul_Actividad::getIdActividad);
		attributeGetterFunctions.put(
			"tituloActividad", T_Ul_Actividad::getTituloActividad);
		attributeGetterFunctions.put(
			"tipoActividad", T_Ul_Actividad::getTipoActividad);
		attributeGetterFunctions.put(
			"descriActividad", T_Ul_Actividad::getDescriActividad);
		attributeGetterFunctions.put(
			"estadoEntrActividad", T_Ul_Actividad::getEstadoEntrActividad);
		attributeGetterFunctions.put(
			"fCreacActividad", T_Ul_Actividad::getFCreacActividad);
		attributeGetterFunctions.put(
			"fCierrActividad", T_Ul_Actividad::getFCierrActividad);
		attributeGetterFunctions.put(
			"porcActividad", T_Ul_Actividad::getPorcActividad);
		attributeGetterFunctions.put(
			"T_Ul_Califi_id", T_Ul_Actividad::getT_Ul_Califi_id);
		attributeGetterFunctions.put(
			"T_Ul_PAcademico_id", T_Ul_Actividad::getT_Ul_PAcademico_id);
		attributeGetterFunctions.put("groupId", T_Ul_Actividad::getGroupId);
		attributeGetterFunctions.put("companyId", T_Ul_Actividad::getCompanyId);
		attributeGetterFunctions.put("userId", T_Ul_Actividad::getUserId);
		attributeGetterFunctions.put("userName", T_Ul_Actividad::getUserName);
		attributeGetterFunctions.put(
			"createDate", T_Ul_Actividad::getCreateDate);
		attributeGetterFunctions.put(
			"modifiedDate", T_Ul_Actividad::getModifiedDate);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
	}

	private static final Map<String, BiConsumer<T_Ul_Actividad, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, BiConsumer<T_Ul_Actividad, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<T_Ul_Actividad, ?>>();

		attributeSetterBiConsumers.put(
			"uuid",
			(BiConsumer<T_Ul_Actividad, String>)T_Ul_Actividad::setUuid);
		attributeSetterBiConsumers.put(
			"idActividad",
			(BiConsumer<T_Ul_Actividad, Long>)T_Ul_Actividad::setIdActividad);
		attributeSetterBiConsumers.put(
			"tituloActividad",
			(BiConsumer<T_Ul_Actividad, String>)
				T_Ul_Actividad::setTituloActividad);
		attributeSetterBiConsumers.put(
			"tipoActividad",
			(BiConsumer<T_Ul_Actividad, String>)
				T_Ul_Actividad::setTipoActividad);
		attributeSetterBiConsumers.put(
			"descriActividad",
			(BiConsumer<T_Ul_Actividad, String>)
				T_Ul_Actividad::setDescriActividad);
		attributeSetterBiConsumers.put(
			"estadoEntrActividad",
			(BiConsumer<T_Ul_Actividad, String>)
				T_Ul_Actividad::setEstadoEntrActividad);
		attributeSetterBiConsumers.put(
			"fCreacActividad",
			(BiConsumer<T_Ul_Actividad, Date>)
				T_Ul_Actividad::setFCreacActividad);
		attributeSetterBiConsumers.put(
			"fCierrActividad",
			(BiConsumer<T_Ul_Actividad, Date>)
				T_Ul_Actividad::setFCierrActividad);
		attributeSetterBiConsumers.put(
			"porcActividad",
			(BiConsumer<T_Ul_Actividad, String>)
				T_Ul_Actividad::setPorcActividad);
		attributeSetterBiConsumers.put(
			"T_Ul_Califi_id",
			(BiConsumer<T_Ul_Actividad, Long>)
				T_Ul_Actividad::setT_Ul_Califi_id);
		attributeSetterBiConsumers.put(
			"T_Ul_PAcademico_id",
			(BiConsumer<T_Ul_Actividad, Long>)
				T_Ul_Actividad::setT_Ul_PAcademico_id);
		attributeSetterBiConsumers.put(
			"groupId",
			(BiConsumer<T_Ul_Actividad, Long>)T_Ul_Actividad::setGroupId);
		attributeSetterBiConsumers.put(
			"companyId",
			(BiConsumer<T_Ul_Actividad, Long>)T_Ul_Actividad::setCompanyId);
		attributeSetterBiConsumers.put(
			"userId",
			(BiConsumer<T_Ul_Actividad, Long>)T_Ul_Actividad::setUserId);
		attributeSetterBiConsumers.put(
			"userName",
			(BiConsumer<T_Ul_Actividad, String>)T_Ul_Actividad::setUserName);
		attributeSetterBiConsumers.put(
			"createDate",
			(BiConsumer<T_Ul_Actividad, Date>)T_Ul_Actividad::setCreateDate);
		attributeSetterBiConsumers.put(
			"modifiedDate",
			(BiConsumer<T_Ul_Actividad, Date>)T_Ul_Actividad::setModifiedDate);

		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_uuid = uuid;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public String getOriginalUuid() {
		return getColumnOriginalValue("uuid_");
	}

	@JSON
	@Override
	public long getIdActividad() {
		return _idActividad;
	}

	@Override
	public void setIdActividad(long idActividad) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_idActividad = idActividad;
	}

	@JSON
	@Override
	public String getTituloActividad() {
		if (_tituloActividad == null) {
			return "";
		}
		else {
			return _tituloActividad;
		}
	}

	@Override
	public void setTituloActividad(String tituloActividad) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_tituloActividad = tituloActividad;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public String getOriginalTituloActividad() {
		return getColumnOriginalValue("tituloActividad");
	}

	@JSON
	@Override
	public String getTipoActividad() {
		if (_tipoActividad == null) {
			return "";
		}
		else {
			return _tipoActividad;
		}
	}

	@Override
	public void setTipoActividad(String tipoActividad) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_tipoActividad = tipoActividad;
	}

	@JSON
	@Override
	public String getDescriActividad() {
		if (_descriActividad == null) {
			return "";
		}
		else {
			return _descriActividad;
		}
	}

	@Override
	public void setDescriActividad(String descriActividad) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_descriActividad = descriActividad;
	}

	@JSON
	@Override
	public String getEstadoEntrActividad() {
		if (_estadoEntrActividad == null) {
			return "";
		}
		else {
			return _estadoEntrActividad;
		}
	}

	@Override
	public void setEstadoEntrActividad(String estadoEntrActividad) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_estadoEntrActividad = estadoEntrActividad;
	}

	@JSON
	@Override
	public Date getFCreacActividad() {
		return _fCreacActividad;
	}

	@Override
	public void setFCreacActividad(Date fCreacActividad) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_fCreacActividad = fCreacActividad;
	}

	@JSON
	@Override
	public Date getFCierrActividad() {
		return _fCierrActividad;
	}

	@Override
	public void setFCierrActividad(Date fCierrActividad) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_fCierrActividad = fCierrActividad;
	}

	@JSON
	@Override
	public String getPorcActividad() {
		if (_porcActividad == null) {
			return "";
		}
		else {
			return _porcActividad;
		}
	}

	@Override
	public void setPorcActividad(String porcActividad) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_porcActividad = porcActividad;
	}

	@JSON
	@Override
	public long getT_Ul_Califi_id() {
		return _T_Ul_Califi_id;
	}

	@Override
	public void setT_Ul_Califi_id(long T_Ul_Califi_id) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_T_Ul_Califi_id = T_Ul_Califi_id;
	}

	@JSON
	@Override
	public long getT_Ul_PAcademico_id() {
		return _T_Ul_PAcademico_id;
	}

	@Override
	public void setT_Ul_PAcademico_id(long T_Ul_PAcademico_id) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_T_Ul_PAcademico_id = T_Ul_PAcademico_id;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_groupId = groupId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalGroupId() {
		return GetterUtil.getLong(this.<Long>getColumnOriginalValue("groupId"));
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_companyId = companyId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalCompanyId() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("companyId"));
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException portalException) {
			return "";
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return "";
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_userName = userName;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_modifiedDate = modifiedDate;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(
			PortalUtil.getClassNameId(T_Ul_Actividad.class.getName()));
	}

	public long getColumnBitmask() {
		if (_columnBitmask > 0) {
			return _columnBitmask;
		}

		if ((_columnOriginalValues == null) ||
			(_columnOriginalValues == Collections.EMPTY_MAP)) {

			return 0;
		}

		for (Map.Entry<String, Object> entry :
				_columnOriginalValues.entrySet()) {

			if (!Objects.equals(
					entry.getValue(), getColumnValue(entry.getKey()))) {

				_columnBitmask |= _columnBitmasks.get(entry.getKey());
			}
		}

		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			getCompanyId(), T_Ul_Actividad.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public T_Ul_Actividad toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, T_Ul_Actividad>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		T_Ul_ActividadImpl t_Ul_ActividadImpl = new T_Ul_ActividadImpl();

		t_Ul_ActividadImpl.setUuid(getUuid());
		t_Ul_ActividadImpl.setIdActividad(getIdActividad());
		t_Ul_ActividadImpl.setTituloActividad(getTituloActividad());
		t_Ul_ActividadImpl.setTipoActividad(getTipoActividad());
		t_Ul_ActividadImpl.setDescriActividad(getDescriActividad());
		t_Ul_ActividadImpl.setEstadoEntrActividad(getEstadoEntrActividad());
		t_Ul_ActividadImpl.setFCreacActividad(getFCreacActividad());
		t_Ul_ActividadImpl.setFCierrActividad(getFCierrActividad());
		t_Ul_ActividadImpl.setPorcActividad(getPorcActividad());
		t_Ul_ActividadImpl.setT_Ul_Califi_id(getT_Ul_Califi_id());
		t_Ul_ActividadImpl.setT_Ul_PAcademico_id(getT_Ul_PAcademico_id());
		t_Ul_ActividadImpl.setGroupId(getGroupId());
		t_Ul_ActividadImpl.setCompanyId(getCompanyId());
		t_Ul_ActividadImpl.setUserId(getUserId());
		t_Ul_ActividadImpl.setUserName(getUserName());
		t_Ul_ActividadImpl.setCreateDate(getCreateDate());
		t_Ul_ActividadImpl.setModifiedDate(getModifiedDate());

		t_Ul_ActividadImpl.resetOriginalValues();

		return t_Ul_ActividadImpl;
	}

	@Override
	public int compareTo(T_Ul_Actividad t_Ul_Actividad) {
		int value = 0;

		if (getIdActividad() < t_Ul_Actividad.getIdActividad()) {
			value = -1;
		}
		else if (getIdActividad() > t_Ul_Actividad.getIdActividad()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof T_Ul_Actividad)) {
			return false;
		}

		T_Ul_Actividad t_Ul_Actividad = (T_Ul_Actividad)object;

		long primaryKey = t_Ul_Actividad.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isEntityCacheEnabled() {
		return true;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isFinderCacheEnabled() {
		return true;
	}

	@Override
	public void resetOriginalValues() {
		_columnOriginalValues = Collections.emptyMap();

		_setModifiedDate = false;

		_columnBitmask = 0;
	}

	@Override
	public CacheModel<T_Ul_Actividad> toCacheModel() {
		T_Ul_ActividadCacheModel t_Ul_ActividadCacheModel =
			new T_Ul_ActividadCacheModel();

		t_Ul_ActividadCacheModel.uuid = getUuid();

		String uuid = t_Ul_ActividadCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			t_Ul_ActividadCacheModel.uuid = null;
		}

		t_Ul_ActividadCacheModel.idActividad = getIdActividad();

		t_Ul_ActividadCacheModel.tituloActividad = getTituloActividad();

		String tituloActividad = t_Ul_ActividadCacheModel.tituloActividad;

		if ((tituloActividad != null) && (tituloActividad.length() == 0)) {
			t_Ul_ActividadCacheModel.tituloActividad = null;
		}

		t_Ul_ActividadCacheModel.tipoActividad = getTipoActividad();

		String tipoActividad = t_Ul_ActividadCacheModel.tipoActividad;

		if ((tipoActividad != null) && (tipoActividad.length() == 0)) {
			t_Ul_ActividadCacheModel.tipoActividad = null;
		}

		t_Ul_ActividadCacheModel.descriActividad = getDescriActividad();

		String descriActividad = t_Ul_ActividadCacheModel.descriActividad;

		if ((descriActividad != null) && (descriActividad.length() == 0)) {
			t_Ul_ActividadCacheModel.descriActividad = null;
		}

		t_Ul_ActividadCacheModel.estadoEntrActividad = getEstadoEntrActividad();

		String estadoEntrActividad =
			t_Ul_ActividadCacheModel.estadoEntrActividad;

		if ((estadoEntrActividad != null) &&
			(estadoEntrActividad.length() == 0)) {

			t_Ul_ActividadCacheModel.estadoEntrActividad = null;
		}

		Date fCreacActividad = getFCreacActividad();

		if (fCreacActividad != null) {
			t_Ul_ActividadCacheModel.fCreacActividad =
				fCreacActividad.getTime();
		}
		else {
			t_Ul_ActividadCacheModel.fCreacActividad = Long.MIN_VALUE;
		}

		Date fCierrActividad = getFCierrActividad();

		if (fCierrActividad != null) {
			t_Ul_ActividadCacheModel.fCierrActividad =
				fCierrActividad.getTime();
		}
		else {
			t_Ul_ActividadCacheModel.fCierrActividad = Long.MIN_VALUE;
		}

		t_Ul_ActividadCacheModel.porcActividad = getPorcActividad();

		String porcActividad = t_Ul_ActividadCacheModel.porcActividad;

		if ((porcActividad != null) && (porcActividad.length() == 0)) {
			t_Ul_ActividadCacheModel.porcActividad = null;
		}

		t_Ul_ActividadCacheModel.T_Ul_Califi_id = getT_Ul_Califi_id();

		t_Ul_ActividadCacheModel.T_Ul_PAcademico_id = getT_Ul_PAcademico_id();

		t_Ul_ActividadCacheModel.groupId = getGroupId();

		t_Ul_ActividadCacheModel.companyId = getCompanyId();

		t_Ul_ActividadCacheModel.userId = getUserId();

		t_Ul_ActividadCacheModel.userName = getUserName();

		String userName = t_Ul_ActividadCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			t_Ul_ActividadCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			t_Ul_ActividadCacheModel.createDate = createDate.getTime();
		}
		else {
			t_Ul_ActividadCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			t_Ul_ActividadCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			t_Ul_ActividadCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		return t_Ul_ActividadCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<T_Ul_Actividad, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<T_Ul_Actividad, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<T_Ul_Actividad, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply((T_Ul_Actividad)this);

			if (value == null) {
				sb.append("null");
			}
			else if (value instanceof Blob || value instanceof Date ||
					 value instanceof Map || value instanceof String) {

				sb.append(
					"\"" + StringUtil.replace(value.toString(), "\"", "'") +
						"\"");
			}
			else {
				sb.append(value);
			}

			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		Map<String, Function<T_Ul_Actividad, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<T_Ul_Actividad, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<T_Ul_Actividad, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((T_Ul_Actividad)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, T_Ul_Actividad>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					T_Ul_Actividad.class, ModelWrapper.class);

	}

	private String _uuid;
	private long _idActividad;
	private String _tituloActividad;
	private String _tipoActividad;
	private String _descriActividad;
	private String _estadoEntrActividad;
	private Date _fCreacActividad;
	private Date _fCierrActividad;
	private String _porcActividad;
	private long _T_Ul_Califi_id;
	private long _T_Ul_PAcademico_id;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;

	public <T> T getColumnValue(String columnName) {
		columnName = _attributeNames.getOrDefault(columnName, columnName);

		Function<T_Ul_Actividad, Object> function =
			_attributeGetterFunctions.get(columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((T_Ul_Actividad)this);
	}

	public <T> T getColumnOriginalValue(String columnName) {
		if (_columnOriginalValues == null) {
			return null;
		}

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		return (T)_columnOriginalValues.get(columnName);
	}

	private void _setColumnOriginalValues() {
		_columnOriginalValues = new HashMap<String, Object>();

		_columnOriginalValues.put("uuid_", _uuid);
		_columnOriginalValues.put("idActividad", _idActividad);
		_columnOriginalValues.put("tituloActividad", _tituloActividad);
		_columnOriginalValues.put("tipoActividad", _tipoActividad);
		_columnOriginalValues.put("descriActividad", _descriActividad);
		_columnOriginalValues.put("estadoEntrActividad", _estadoEntrActividad);
		_columnOriginalValues.put("fCreacActividad", _fCreacActividad);
		_columnOriginalValues.put("fCierrActividad", _fCierrActividad);
		_columnOriginalValues.put("porcActividad", _porcActividad);
		_columnOriginalValues.put("T_Ul_Califi_id", _T_Ul_Califi_id);
		_columnOriginalValues.put("T_Ul_PAcademico_id", _T_Ul_PAcademico_id);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
	}

	private static final Map<String, String> _attributeNames;

	static {
		Map<String, String> attributeNames = new HashMap<>();

		attributeNames.put("uuid_", "uuid");

		_attributeNames = Collections.unmodifiableMap(attributeNames);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("uuid_", 1L);

		columnBitmasks.put("idActividad", 2L);

		columnBitmasks.put("tituloActividad", 4L);

		columnBitmasks.put("tipoActividad", 8L);

		columnBitmasks.put("descriActividad", 16L);

		columnBitmasks.put("estadoEntrActividad", 32L);

		columnBitmasks.put("fCreacActividad", 64L);

		columnBitmasks.put("fCierrActividad", 128L);

		columnBitmasks.put("porcActividad", 256L);

		columnBitmasks.put("T_Ul_Califi_id", 512L);

		columnBitmasks.put("T_Ul_PAcademico_id", 1024L);

		columnBitmasks.put("groupId", 2048L);

		columnBitmasks.put("companyId", 4096L);

		columnBitmasks.put("userId", 8192L);

		columnBitmasks.put("userName", 16384L);

		columnBitmasks.put("createDate", 32768L);

		columnBitmasks.put("modifiedDate", 65536L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private T_Ul_Actividad _escapedModel;

}
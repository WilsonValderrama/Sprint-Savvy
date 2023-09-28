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

package com.savvy.sb.model.impl;

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

import com.savvy.sb.model.Proyecto;
import com.savvy.sb.model.ProyectoModel;
import com.savvy.sb.model.ProyectoSoap;

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
 * The base model implementation for the Proyecto service. Represents a row in the &quot;Servicio_Savvy_Proyecto&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>ProyectoModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ProyectoImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProyectoImpl
 * @generated
 */
@JSON(strict = true)
public class ProyectoModelImpl
	extends BaseModelImpl<Proyecto> implements ProyectoModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a proyecto model instance should use the <code>Proyecto</code> interface instead.
	 */
	public static final String TABLE_NAME = "Servicio_Savvy_Proyecto";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"proyectoId", Types.BIGINT},
		{"groupId", Types.BIGINT}, {"companyId", Types.BIGINT},
		{"userId", Types.BIGINT}, {"userName", Types.VARCHAR},
		{"createDate", Types.TIMESTAMP}, {"modifiedDate", Types.TIMESTAMP},
		{"tituloProyecto", Types.VARCHAR}, {"descripcion", Types.VARCHAR},
		{"fechaInicio", Types.TIMESTAMP}, {"fechaFinal", Types.TIMESTAMP},
		{"estado", Types.VARCHAR}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("proyectoId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("tituloProyecto", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("descripcion", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("fechaInicio", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("fechaFinal", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("estado", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE =
		"create table Servicio_Savvy_Proyecto (uuid_ VARCHAR(75) null,proyectoId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,tituloProyecto VARCHAR(75) null,descripcion VARCHAR(75) null,fechaInicio DATE null,fechaFinal DATE null,estado VARCHAR(75) null)";

	public static final String TABLE_SQL_DROP =
		"drop table Servicio_Savvy_Proyecto";

	public static final String ORDER_BY_JPQL =
		" ORDER BY proyecto.tituloProyecto ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY Servicio_Savvy_Proyecto.tituloProyecto ASC";

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
	public static final long TITULOPROYECTO_COLUMN_BITMASK = 4L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long UUID_COLUMN_BITMASK = 8L;

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
	public static Proyecto toModel(ProyectoSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Proyecto model = new ProyectoImpl();

		model.setUuid(soapModel.getUuid());
		model.setProyectoId(soapModel.getProyectoId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setTituloProyecto(soapModel.getTituloProyecto());
		model.setDescripcion(soapModel.getDescripcion());
		model.setFechaInicio(soapModel.getFechaInicio());
		model.setFechaFinal(soapModel.getFechaFinal());
		model.setEstado(soapModel.getEstado());

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
	public static List<Proyecto> toModels(ProyectoSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Proyecto> models = new ArrayList<Proyecto>(soapModels.length);

		for (ProyectoSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public ProyectoModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _proyectoId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setProyectoId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _proyectoId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Proyecto.class;
	}

	@Override
	public String getModelClassName() {
		return Proyecto.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<Proyecto, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<Proyecto, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Proyecto, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((Proyecto)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<Proyecto, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<Proyecto, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(Proyecto)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<Proyecto, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<Proyecto, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static final Map<String, Function<Proyecto, Object>>
		_attributeGetterFunctions;

	static {
		Map<String, Function<Proyecto, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<Proyecto, Object>>();

		attributeGetterFunctions.put("uuid", Proyecto::getUuid);
		attributeGetterFunctions.put("proyectoId", Proyecto::getProyectoId);
		attributeGetterFunctions.put("groupId", Proyecto::getGroupId);
		attributeGetterFunctions.put("companyId", Proyecto::getCompanyId);
		attributeGetterFunctions.put("userId", Proyecto::getUserId);
		attributeGetterFunctions.put("userName", Proyecto::getUserName);
		attributeGetterFunctions.put("createDate", Proyecto::getCreateDate);
		attributeGetterFunctions.put("modifiedDate", Proyecto::getModifiedDate);
		attributeGetterFunctions.put(
			"tituloProyecto", Proyecto::getTituloProyecto);
		attributeGetterFunctions.put("descripcion", Proyecto::getDescripcion);
		attributeGetterFunctions.put("fechaInicio", Proyecto::getFechaInicio);
		attributeGetterFunctions.put("fechaFinal", Proyecto::getFechaFinal);
		attributeGetterFunctions.put("estado", Proyecto::getEstado);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
	}

	private static final Map<String, BiConsumer<Proyecto, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, BiConsumer<Proyecto, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<Proyecto, ?>>();

		attributeSetterBiConsumers.put(
			"uuid", (BiConsumer<Proyecto, String>)Proyecto::setUuid);
		attributeSetterBiConsumers.put(
			"proyectoId", (BiConsumer<Proyecto, Long>)Proyecto::setProyectoId);
		attributeSetterBiConsumers.put(
			"groupId", (BiConsumer<Proyecto, Long>)Proyecto::setGroupId);
		attributeSetterBiConsumers.put(
			"companyId", (BiConsumer<Proyecto, Long>)Proyecto::setCompanyId);
		attributeSetterBiConsumers.put(
			"userId", (BiConsumer<Proyecto, Long>)Proyecto::setUserId);
		attributeSetterBiConsumers.put(
			"userName", (BiConsumer<Proyecto, String>)Proyecto::setUserName);
		attributeSetterBiConsumers.put(
			"createDate", (BiConsumer<Proyecto, Date>)Proyecto::setCreateDate);
		attributeSetterBiConsumers.put(
			"modifiedDate",
			(BiConsumer<Proyecto, Date>)Proyecto::setModifiedDate);
		attributeSetterBiConsumers.put(
			"tituloProyecto",
			(BiConsumer<Proyecto, String>)Proyecto::setTituloProyecto);
		attributeSetterBiConsumers.put(
			"descripcion",
			(BiConsumer<Proyecto, String>)Proyecto::setDescripcion);
		attributeSetterBiConsumers.put(
			"fechaInicio",
			(BiConsumer<Proyecto, Date>)Proyecto::setFechaInicio);
		attributeSetterBiConsumers.put(
			"fechaFinal", (BiConsumer<Proyecto, Date>)Proyecto::setFechaFinal);
		attributeSetterBiConsumers.put(
			"estado", (BiConsumer<Proyecto, String>)Proyecto::setEstado);

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
	public long getProyectoId() {
		return _proyectoId;
	}

	@Override
	public void setProyectoId(long proyectoId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_proyectoId = proyectoId;
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

	@JSON
	@Override
	public String getTituloProyecto() {
		if (_tituloProyecto == null) {
			return "";
		}
		else {
			return _tituloProyecto;
		}
	}

	@Override
	public void setTituloProyecto(String tituloProyecto) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_tituloProyecto = tituloProyecto;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public String getOriginalTituloProyecto() {
		return getColumnOriginalValue("tituloProyecto");
	}

	@JSON
	@Override
	public String getDescripcion() {
		if (_descripcion == null) {
			return "";
		}
		else {
			return _descripcion;
		}
	}

	@Override
	public void setDescripcion(String descripcion) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_descripcion = descripcion;
	}

	@JSON
	@Override
	public Date getFechaInicio() {
		return _fechaInicio;
	}

	@Override
	public void setFechaInicio(Date fechaInicio) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_fechaInicio = fechaInicio;
	}

	@JSON
	@Override
	public Date getFechaFinal() {
		return _fechaFinal;
	}

	@Override
	public void setFechaFinal(Date fechaFinal) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_fechaFinal = fechaFinal;
	}

	@JSON
	@Override
	public String getEstado() {
		if (_estado == null) {
			return "";
		}
		else {
			return _estado;
		}
	}

	@Override
	public void setEstado(String estado) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_estado = estado;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(
			PortalUtil.getClassNameId(Proyecto.class.getName()));
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
			getCompanyId(), Proyecto.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Proyecto toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, Proyecto>
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
		ProyectoImpl proyectoImpl = new ProyectoImpl();

		proyectoImpl.setUuid(getUuid());
		proyectoImpl.setProyectoId(getProyectoId());
		proyectoImpl.setGroupId(getGroupId());
		proyectoImpl.setCompanyId(getCompanyId());
		proyectoImpl.setUserId(getUserId());
		proyectoImpl.setUserName(getUserName());
		proyectoImpl.setCreateDate(getCreateDate());
		proyectoImpl.setModifiedDate(getModifiedDate());
		proyectoImpl.setTituloProyecto(getTituloProyecto());
		proyectoImpl.setDescripcion(getDescripcion());
		proyectoImpl.setFechaInicio(getFechaInicio());
		proyectoImpl.setFechaFinal(getFechaFinal());
		proyectoImpl.setEstado(getEstado());

		proyectoImpl.resetOriginalValues();

		return proyectoImpl;
	}

	@Override
	public int compareTo(Proyecto proyecto) {
		int value = 0;

		value = getTituloProyecto().compareTo(proyecto.getTituloProyecto());

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

		if (!(object instanceof Proyecto)) {
			return false;
		}

		Proyecto proyecto = (Proyecto)object;

		long primaryKey = proyecto.getPrimaryKey();

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
	public CacheModel<Proyecto> toCacheModel() {
		ProyectoCacheModel proyectoCacheModel = new ProyectoCacheModel();

		proyectoCacheModel.uuid = getUuid();

		String uuid = proyectoCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			proyectoCacheModel.uuid = null;
		}

		proyectoCacheModel.proyectoId = getProyectoId();

		proyectoCacheModel.groupId = getGroupId();

		proyectoCacheModel.companyId = getCompanyId();

		proyectoCacheModel.userId = getUserId();

		proyectoCacheModel.userName = getUserName();

		String userName = proyectoCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			proyectoCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			proyectoCacheModel.createDate = createDate.getTime();
		}
		else {
			proyectoCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			proyectoCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			proyectoCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		proyectoCacheModel.tituloProyecto = getTituloProyecto();

		String tituloProyecto = proyectoCacheModel.tituloProyecto;

		if ((tituloProyecto != null) && (tituloProyecto.length() == 0)) {
			proyectoCacheModel.tituloProyecto = null;
		}

		proyectoCacheModel.descripcion = getDescripcion();

		String descripcion = proyectoCacheModel.descripcion;

		if ((descripcion != null) && (descripcion.length() == 0)) {
			proyectoCacheModel.descripcion = null;
		}

		Date fechaInicio = getFechaInicio();

		if (fechaInicio != null) {
			proyectoCacheModel.fechaInicio = fechaInicio.getTime();
		}
		else {
			proyectoCacheModel.fechaInicio = Long.MIN_VALUE;
		}

		Date fechaFinal = getFechaFinal();

		if (fechaFinal != null) {
			proyectoCacheModel.fechaFinal = fechaFinal.getTime();
		}
		else {
			proyectoCacheModel.fechaFinal = Long.MIN_VALUE;
		}

		proyectoCacheModel.estado = getEstado();

		String estado = proyectoCacheModel.estado;

		if ((estado != null) && (estado.length() == 0)) {
			proyectoCacheModel.estado = null;
		}

		return proyectoCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<Proyecto, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<Proyecto, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Proyecto, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply((Proyecto)this);

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
		Map<String, Function<Proyecto, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<Proyecto, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Proyecto, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((Proyecto)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, Proyecto>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					Proyecto.class, ModelWrapper.class);

	}

	private String _uuid;
	private long _proyectoId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _tituloProyecto;
	private String _descripcion;
	private Date _fechaInicio;
	private Date _fechaFinal;
	private String _estado;

	public <T> T getColumnValue(String columnName) {
		columnName = _attributeNames.getOrDefault(columnName, columnName);

		Function<Proyecto, Object> function = _attributeGetterFunctions.get(
			columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((Proyecto)this);
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
		_columnOriginalValues.put("proyectoId", _proyectoId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("tituloProyecto", _tituloProyecto);
		_columnOriginalValues.put("descripcion", _descripcion);
		_columnOriginalValues.put("fechaInicio", _fechaInicio);
		_columnOriginalValues.put("fechaFinal", _fechaFinal);
		_columnOriginalValues.put("estado", _estado);
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

		columnBitmasks.put("proyectoId", 2L);

		columnBitmasks.put("groupId", 4L);

		columnBitmasks.put("companyId", 8L);

		columnBitmasks.put("userId", 16L);

		columnBitmasks.put("userName", 32L);

		columnBitmasks.put("createDate", 64L);

		columnBitmasks.put("modifiedDate", 128L);

		columnBitmasks.put("tituloProyecto", 256L);

		columnBitmasks.put("descripcion", 512L);

		columnBitmasks.put("fechaInicio", 1024L);

		columnBitmasks.put("fechaFinal", 2048L);

		columnBitmasks.put("estado", 4096L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private Proyecto _escapedModel;

}
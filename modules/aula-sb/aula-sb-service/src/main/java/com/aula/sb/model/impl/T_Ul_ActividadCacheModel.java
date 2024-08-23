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

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing T_Ul_Actividad in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class T_Ul_ActividadCacheModel
	implements CacheModel<T_Ul_Actividad>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof T_Ul_ActividadCacheModel)) {
			return false;
		}

		T_Ul_ActividadCacheModel t_Ul_ActividadCacheModel =
			(T_Ul_ActividadCacheModel)object;

		if (idActividad == t_Ul_ActividadCacheModel.idActividad) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, idActividad);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", idActividad=");
		sb.append(idActividad);
		sb.append(", tituloActividad=");
		sb.append(tituloActividad);
		sb.append(", tipoActividad=");
		sb.append(tipoActividad);
		sb.append(", descriActividad=");
		sb.append(descriActividad);
		sb.append(", estadoEntrActividad=");
		sb.append(estadoEntrActividad);
		sb.append(", fCreacActividad=");
		sb.append(fCreacActividad);
		sb.append(", fCierrActividad=");
		sb.append(fCierrActividad);
		sb.append(", porcActividad=");
		sb.append(porcActividad);
		sb.append(", T_Ul_Califi_id=");
		sb.append(T_Ul_Califi_id);
		sb.append(", T_Ul_PAcademico_id=");
		sb.append(T_Ul_PAcademico_id);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public T_Ul_Actividad toEntityModel() {
		T_Ul_ActividadImpl t_Ul_ActividadImpl = new T_Ul_ActividadImpl();

		if (uuid == null) {
			t_Ul_ActividadImpl.setUuid("");
		}
		else {
			t_Ul_ActividadImpl.setUuid(uuid);
		}

		t_Ul_ActividadImpl.setIdActividad(idActividad);

		if (tituloActividad == null) {
			t_Ul_ActividadImpl.setTituloActividad("");
		}
		else {
			t_Ul_ActividadImpl.setTituloActividad(tituloActividad);
		}

		if (tipoActividad == null) {
			t_Ul_ActividadImpl.setTipoActividad("");
		}
		else {
			t_Ul_ActividadImpl.setTipoActividad(tipoActividad);
		}

		if (descriActividad == null) {
			t_Ul_ActividadImpl.setDescriActividad("");
		}
		else {
			t_Ul_ActividadImpl.setDescriActividad(descriActividad);
		}

		if (estadoEntrActividad == null) {
			t_Ul_ActividadImpl.setEstadoEntrActividad("");
		}
		else {
			t_Ul_ActividadImpl.setEstadoEntrActividad(estadoEntrActividad);
		}

		if (fCreacActividad == Long.MIN_VALUE) {
			t_Ul_ActividadImpl.setFCreacActividad(null);
		}
		else {
			t_Ul_ActividadImpl.setFCreacActividad(new Date(fCreacActividad));
		}

		if (fCierrActividad == Long.MIN_VALUE) {
			t_Ul_ActividadImpl.setFCierrActividad(null);
		}
		else {
			t_Ul_ActividadImpl.setFCierrActividad(new Date(fCierrActividad));
		}

		if (porcActividad == null) {
			t_Ul_ActividadImpl.setPorcActividad("");
		}
		else {
			t_Ul_ActividadImpl.setPorcActividad(porcActividad);
		}

		t_Ul_ActividadImpl.setT_Ul_Califi_id(T_Ul_Califi_id);
		t_Ul_ActividadImpl.setT_Ul_PAcademico_id(T_Ul_PAcademico_id);
		t_Ul_ActividadImpl.setGroupId(groupId);
		t_Ul_ActividadImpl.setCompanyId(companyId);
		t_Ul_ActividadImpl.setUserId(userId);

		if (userName == null) {
			t_Ul_ActividadImpl.setUserName("");
		}
		else {
			t_Ul_ActividadImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			t_Ul_ActividadImpl.setCreateDate(null);
		}
		else {
			t_Ul_ActividadImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			t_Ul_ActividadImpl.setModifiedDate(null);
		}
		else {
			t_Ul_ActividadImpl.setModifiedDate(new Date(modifiedDate));
		}

		t_Ul_ActividadImpl.resetOriginalValues();

		return t_Ul_ActividadImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		idActividad = objectInput.readLong();
		tituloActividad = objectInput.readUTF();
		tipoActividad = objectInput.readUTF();
		descriActividad = objectInput.readUTF();
		estadoEntrActividad = objectInput.readUTF();
		fCreacActividad = objectInput.readLong();
		fCierrActividad = objectInput.readLong();
		porcActividad = objectInput.readUTF();

		T_Ul_Califi_id = objectInput.readLong();

		T_Ul_PAcademico_id = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(idActividad);

		if (tituloActividad == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(tituloActividad);
		}

		if (tipoActividad == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(tipoActividad);
		}

		if (descriActividad == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(descriActividad);
		}

		if (estadoEntrActividad == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(estadoEntrActividad);
		}

		objectOutput.writeLong(fCreacActividad);
		objectOutput.writeLong(fCierrActividad);

		if (porcActividad == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(porcActividad);
		}

		objectOutput.writeLong(T_Ul_Califi_id);

		objectOutput.writeLong(T_Ul_PAcademico_id);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
	}

	public String uuid;
	public long idActividad;
	public String tituloActividad;
	public String tipoActividad;
	public String descriActividad;
	public String estadoEntrActividad;
	public long fCreacActividad;
	public long fCierrActividad;
	public String porcActividad;
	public long T_Ul_Califi_id;
	public long T_Ul_PAcademico_id;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;

}
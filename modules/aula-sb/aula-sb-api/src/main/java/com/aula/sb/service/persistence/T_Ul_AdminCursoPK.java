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

package com.aula.sb.service.persistence;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;

import java.io.Serializable;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class T_Ul_AdminCursoPK
	implements Comparable<T_Ul_AdminCursoPK>, Serializable {

	public long T_Ul_Admin_id;
	public long T_Ul_Curso_id;

	public T_Ul_AdminCursoPK() {
	}

	public T_Ul_AdminCursoPK(long T_Ul_Admin_id, long T_Ul_Curso_id) {
		this.T_Ul_Admin_id = T_Ul_Admin_id;
		this.T_Ul_Curso_id = T_Ul_Curso_id;
	}

	public long getT_Ul_Admin_id() {
		return T_Ul_Admin_id;
	}

	public void setT_Ul_Admin_id(long T_Ul_Admin_id) {
		this.T_Ul_Admin_id = T_Ul_Admin_id;
	}

	public long getT_Ul_Curso_id() {
		return T_Ul_Curso_id;
	}

	public void setT_Ul_Curso_id(long T_Ul_Curso_id) {
		this.T_Ul_Curso_id = T_Ul_Curso_id;
	}

	@Override
	public int compareTo(T_Ul_AdminCursoPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		if (T_Ul_Admin_id < pk.T_Ul_Admin_id) {
			value = -1;
		}
		else if (T_Ul_Admin_id > pk.T_Ul_Admin_id) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		if (T_Ul_Curso_id < pk.T_Ul_Curso_id) {
			value = -1;
		}
		else if (T_Ul_Curso_id > pk.T_Ul_Curso_id) {
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

		if (!(object instanceof T_Ul_AdminCursoPK)) {
			return false;
		}

		T_Ul_AdminCursoPK pk = (T_Ul_AdminCursoPK)object;

		if ((T_Ul_Admin_id == pk.T_Ul_Admin_id) &&
			(T_Ul_Curso_id == pk.T_Ul_Curso_id)) {

			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		int hashCode = 0;

		hashCode = HashUtil.hash(hashCode, T_Ul_Admin_id);
		hashCode = HashUtil.hash(hashCode, T_Ul_Curso_id);

		return hashCode;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(6);

		sb.append("{");

		sb.append("T_Ul_Admin_id=");

		sb.append(T_Ul_Admin_id);
		sb.append(", T_Ul_Curso_id=");

		sb.append(T_Ul_Curso_id);

		sb.append("}");

		return sb.toString();
	}

}
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
import com.aula.sb.service.T_Ul_ActividadLocalServiceUtil;

/**
 * The extended model base implementation for the T_Ul_Actividad service. Represents a row in the &quot;AulaVirtual_T_Ul_Actividad&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link T_Ul_ActividadImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see T_Ul_ActividadImpl
 * @see T_Ul_Actividad
 * @generated
 */
public abstract class T_Ul_ActividadBaseImpl
	extends T_Ul_ActividadModelImpl implements T_Ul_Actividad {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a t_ ul_ actividad model instance should use the <code>T_Ul_Actividad</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			T_Ul_ActividadLocalServiceUtil.addT_Ul_Actividad(this);
		}
		else {
			T_Ul_ActividadLocalServiceUtil.updateT_Ul_Actividad(this);
		}
	}

}
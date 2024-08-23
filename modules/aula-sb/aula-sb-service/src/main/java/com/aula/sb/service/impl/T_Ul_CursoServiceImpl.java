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

package com.aula.sb.service.impl;

import com.aula.sb.model.T_Ul_Curso;
import com.aula.sb.service.T_Ul_CursoLocalServiceUtil;
import com.aula.sb.service.base.T_Ul_CursoServiceBaseImpl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the t_ ul_ curso remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.aula.sb.service.T_Ul_CursoService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see T_Ul_CursoServiceBaseImpl
 */
@Component(
	property = {
		"json.web.service.context.name=aulavirtual",
		"json.web.service.context.path=T_Ul_Curso"
	},
	service = AopService.class
)
public class T_Ul_CursoServiceImpl extends T_Ul_CursoServiceBaseImpl {
	
	private final Log log = LogFactoryUtil.getLog(T_Ul_CursoServiceImpl.class); 

	public T_Ul_Curso createT_Ul_Curso(String nombreCurso, String fInicioCurso, String fFinCurso, Long T_Ul_Califi_id,
	        Long T_Ul_Profesor_id, ServiceContext serviceContext) throws PortalException {
	    
	    log.info("Inicio de creacion de curso en el servicio remoto");
	    log.info("Parametros recibidos: nombreCurso=" + nombreCurso + ", fInicioCurso=" + fInicioCurso +
	            ", fFinCurso=" + fFinCurso + ", T_Ul_Califi_id=" + T_Ul_Califi_id +
	            ", T_Ul_Profesor_id=" + T_Ul_Profesor_id);
	    
	    // Verificar si algun parametro es null
	    if (nombreCurso == null || fInicioCurso == null || fFinCurso == null || 
	        T_Ul_Califi_id == null || T_Ul_Profesor_id == null) {
	        log.error("Algun parametro recibido es null.");
	        throw new PortalException("Algun parametro recibido es null.");
	    }

	    // Llamada al servicio local
	    T_Ul_Curso curso = T_Ul_CursoLocalServiceUtil.createT_Ul_Curso(nombreCurso, _parseDate(fInicioCurso), _parseDate(fFinCurso), T_Ul_Califi_id, T_Ul_Profesor_id, serviceContext);
	    
	    log.info("Curso creado en el servicio remoto: " + curso);

	    // Verifica el curso creado
	    if (curso == null) {
	        log.error("El curso creado es null.");
	        throw new PortalException("El curso creado es null.");
	    }
	    
	    return curso;
	}

	private Date _parseDate(String dateString) throws PortalException {
	    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	    sdf.setLenient(false); // No permitir fechas como 32/13/2024
	    try {
	        return sdf.parse(dateString);
	    } catch (ParseException e) {
	        throw new PortalException("Fecha en formato incorrecto: " + dateString, e);
	    }
	}
	
	public T_Ul_Curso updateT_Ul_Curso(long idCurso, String nombreCurso, String fInicioCurso, String fFinCurso, Long T_Ul_Califi_id,
	        Long T_Ul_Profesor_id, ServiceContext serviceContext) throws PortalException {
	    
	    Date inicioCurso = _parseDate(fInicioCurso);
	    Date finCurso = _parseDate(fFinCurso);
	    
	    return T_Ul_CursoLocalServiceUtil.updateT_Ul_Curso(idCurso, nombreCurso, inicioCurso, finCurso, T_Ul_Califi_id, T_Ul_Profesor_id, serviceContext);
	}
	
	public T_Ul_Curso deleteT_Ul_Curso(long idCurso) throws PortalException{
		return T_Ul_CursoLocalServiceUtil.deleteT_Ul_Curso(idCurso);
	}
	
	public T_Ul_Curso getT_Ul_Curso(long idCurso) throws PortalException{
		return T_Ul_CursoLocalServiceUtil.getT_Ul_Curso(idCurso);
	}
	
	public List<T_Ul_Curso> getT_Ul_CursoByName(String nombreCurso){
		return T_Ul_CursoLocalServiceUtil.getT_Ul_CursoByName(nombreCurso);
	}
	
	public List<T_Ul_Curso> getAllT_Ul_Cursos(){
		return T_Ul_CursoLocalServiceUtil.getAllT_Ul_Cursos();
	}


}
package com.savvy.sb.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.savvy.sb.model.Proyecto;
import com.savvy.sb.service.base.ProyectoLocalServiceBaseImpl;
import java.util.List;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.savvy.sb.model.Proyecto",
	service = AopService.class
)
public class ProyectoLocalServiceImpl extends ProyectoLocalServiceBaseImpl {
	

private final Log log = LogFactoryUtil.getLog(ProyectoLocalServiceImpl.class);

	
	public Proyecto crearProyecto(String tituloProyecto, String descripcion, String fechaInicio,
			String fechaFinal, String estado, ServiceContext serviceContext) throws PortalException {
	
		Long proyectoId = counterLocalService.increment();
		
		User user = UserLocalServiceUtil.getUserById(serviceContext.getUserId());
		Proyecto proyecto = proyectoPersistence.create(proyectoId);

		proyecto.setTituloProyecto(tituloProyecto);
		proyecto.setDescripcion(descripcion);
		proyecto.setFechaInicio(fechaInicio);
		proyecto.setFechaFinal(fechaFinal);
		proyecto.setEstado(estado);
		

		proyecto.setUserId(serviceContext.getUserId());
		proyecto.setGroupId(serviceContext.getScopeGroupId());
		proyecto.setUserName(user.getFullName());
		
		log.info(serviceContext.getUserId());
		log.info(serviceContext.getScopeGroupId());
		log.info(user.getFullName());
		proyectoPersistence.update(proyecto);
		
		return proyecto;
		}
	
	public Proyecto actualizarProyecto(long proyectoId, String tituloProyecto, String descripcion, String fechaInicio,
			String fechaFinal, String estado, ServiceContext serviceContext) throws PortalException {
		
		Proyecto proyecto = proyectoPersistence.findByPrimaryKey(proyectoId);
		User user = UserLocalServiceUtil.getUserById(serviceContext.getUserId());

		proyecto.setTituloProyecto(tituloProyecto);
		proyecto.setDescripcion(descripcion);
		proyecto.setFechaInicio(fechaInicio);
		proyecto.setFechaFinal(fechaFinal);
		proyecto.setEstado(estado);
	
		proyecto.setUserId(serviceContext.getUserId());
		proyecto.setGroupId(serviceContext.getScopeGroupId());
		proyecto.setUserName(user.getFullName());
		
		return proyectoPersistence.update(proyecto);
		}
	
	public Proyecto eliminarProyecto(long proyectoId) throws PortalException {

		return proyectoPersistence.remove(proyectoId);
	}
	
	public Proyecto getProyecto(long proyectoId) throws PortalException {

		return proyectoPersistence.findByPrimaryKey(proyectoId);
	}
	
	public List<Proyecto> getProyectoByNombre(String tituloProyecto) {
		return proyectoPersistence.findByTituloProyecto(tituloProyecto);
	}
	
	public List<Proyecto> getAllProyectos() {
		return proyectoPersistence.findAll();
	}
	

}
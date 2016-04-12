package com.telefonica.plataformaconcursos.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.telefonica.plataformaconcursos.model.Asignados;
import com.telefonica.plataformaconcursos.service.base.AsignadosLocalServiceBaseImpl;

/**
 * The implementation of the asignados local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.telefonica.plataformaconcursos.service.AsignadosLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.telefonica.plataformaconcursos.service.base.AsignadosLocalServiceBaseImpl
 * @see com.telefonica.plataformaconcursos.service.AsignadosLocalServiceUtil
 */
public class AsignadosLocalServiceImpl extends AsignadosLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.telefonica.plataformaconcursos.service.AsignadosLocalServiceUtil} to access the asignados local service.
     */
	public List<Asignados> findByUsuarioId(long usuarioId) throws SystemException{
		
		return getAsignadosPersistence().findByUsuarioId(usuarioId);
	}
	
	public List<Asignados> findByConcursoId(long concursoId) throws SystemException{
		
		return getAsignadosPersistence().findByConcursoId(concursoId);
	}
	
	
	
}

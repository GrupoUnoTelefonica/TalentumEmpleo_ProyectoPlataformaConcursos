package com.telefonica.plataformaconcursos.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.telefonica.plataformaconcursos.model.Concurso;
import com.telefonica.plataformaconcursos.service.base.ConcursoLocalServiceBaseImpl;

/**
 * The implementation of the concurso local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.telefonica.plataformaconcursos.service.ConcursoLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.telefonica.plataformaconcursos.service.base.ConcursoLocalServiceBaseImpl
 * @see com.telefonica.plataformaconcursos.service.ConcursoLocalServiceUtil
 */
public class ConcursoLocalServiceImpl extends ConcursoLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.telefonica.plataformaconcursos.service.ConcursoLocalServiceUtil} to access the concurso local service.
     */
	public List<Concurso> findByEmpresaId(long empresaId) throws SystemException{
		return concursoPersistence.findByEmpresaId(empresaId);
	}
}

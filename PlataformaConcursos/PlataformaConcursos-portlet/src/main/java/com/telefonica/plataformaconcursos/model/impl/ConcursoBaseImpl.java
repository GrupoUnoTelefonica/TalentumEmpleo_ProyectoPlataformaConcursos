package com.telefonica.plataformaconcursos.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import com.telefonica.plataformaconcursos.model.Concurso;
import com.telefonica.plataformaconcursos.service.ConcursoLocalServiceUtil;

/**
 * The extended model base implementation for the Concurso service. Represents a row in the &quot;concurso&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ConcursoImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ConcursoImpl
 * @see com.telefonica.plataformaconcursos.model.Concurso
 * @generated
 */
public abstract class ConcursoBaseImpl extends ConcursoModelImpl
    implements Concurso {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a concurso model instance should use the {@link Concurso} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            ConcursoLocalServiceUtil.addConcurso(this);
        } else {
            ConcursoLocalServiceUtil.updateConcurso(this);
        }
    }
}

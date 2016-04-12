package com.telefonica.plataformaconcursos.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import com.telefonica.plataformaconcursos.service.AsignadosLocalServiceUtil;
import com.telefonica.plataformaconcursos.service.AsignadosServiceUtil;
import com.telefonica.plataformaconcursos.service.ClpSerializer;
import com.telefonica.plataformaconcursos.service.ConcursoLocalServiceUtil;
import com.telefonica.plataformaconcursos.service.ConcursoServiceUtil;
import com.telefonica.plataformaconcursos.service.EmpresaLocalServiceUtil;
import com.telefonica.plataformaconcursos.service.EmpresaServiceUtil;
import com.telefonica.plataformaconcursos.service.UsuarioLocalServiceUtil;
import com.telefonica.plataformaconcursos.service.UsuarioServiceUtil;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            AsignadosLocalServiceUtil.clearService();

            AsignadosServiceUtil.clearService();
            ConcursoLocalServiceUtil.clearService();

            ConcursoServiceUtil.clearService();
            EmpresaLocalServiceUtil.clearService();

            EmpresaServiceUtil.clearService();
            UsuarioLocalServiceUtil.clearService();

            UsuarioServiceUtil.clearService();
        }
    }
}

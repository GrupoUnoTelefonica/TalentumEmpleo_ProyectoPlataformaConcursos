package com.telefonica.plataformaconcursos.service.base;

import com.telefonica.plataformaconcursos.service.AsignadosServiceUtil;

import java.util.Arrays;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AsignadosServiceClpInvoker {
    private String _methodName36;
    private String[] _methodParameterTypes36;
    private String _methodName37;
    private String[] _methodParameterTypes37;

    public AsignadosServiceClpInvoker() {
        _methodName36 = "getBeanIdentifier";

        _methodParameterTypes36 = new String[] {  };

        _methodName37 = "setBeanIdentifier";

        _methodParameterTypes37 = new String[] { "java.lang.String" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName36.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes36, parameterTypes)) {
            return AsignadosServiceUtil.getBeanIdentifier();
        }

        if (_methodName37.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes37, parameterTypes)) {
            AsignadosServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        throw new UnsupportedOperationException();
    }
}

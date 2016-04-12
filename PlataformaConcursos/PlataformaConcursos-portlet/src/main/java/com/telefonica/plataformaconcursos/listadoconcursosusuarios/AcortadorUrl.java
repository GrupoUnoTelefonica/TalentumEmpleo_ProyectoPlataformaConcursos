package com.telefonica.plataformaconcursos.listadoconcursosusuarios;

import javaQuery.j2ee.tinyURL;


public class AcortadorUrl {

   
    public static String urlShortener(String urlLong) {

            tinyURL tU = new tinyURL();
            String getLink = tU.getTinyURL(urlLong);
            return getLink;
    }

}

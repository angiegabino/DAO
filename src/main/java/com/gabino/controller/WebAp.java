
package com.gabino.controller;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class WebAp extends AbstractAnnotationConfigDispatcherServletInitializer {
    
     @Override
            protected Class<?>[] getRootConfigClasses() {
            System.out.println("Caragando configuracion de clases config !!");
            return new Class<?>[0];
            }

    @Override
        protected Class<?>[] getServletConfigClasses() {
        System.out.println("Cargando configuracion de Servlets !!");
        return new Class<?>[]{WebAppConfig.class};
        }

    @Override
        protected String[] getServletMappings() {
        System.out.println("Caragando configuracion de cservicios!!");
        return new String[]{"/servicios/"};
        }
}

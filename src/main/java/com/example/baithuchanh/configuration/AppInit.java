package com.example.baithuchanh.configuration;


import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    public AppInit() {
    }

    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{com.example.baithuchanh.configuration.AppConfig.class};
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[0];
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}

//package com.weather.config;
//
//import org.springframework.web.filter.CharacterEncodingFilter;
//import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
//
//import javax.servlet.Filter;
//
///**
// * @Author Verlamov Michail
// * @Mail verlamov.m@gmail.com
// * @GitHub VMAproject
// * Date 22.12.16 Time 17:12
// */
//public class Initializer extends AbstractAnnotationConfigDispatcherServletInitializer {
//
//
//    protected Filter[] getServletFilter() {
//        CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
//        encodingFilter.setEncoding("UTF-8");
//        encodingFilter.setForceEncoding(true);
//        return new Filter[]{encodingFilter};
//    }
//
//    @Override
//    protected Class<?>[] getRootConfigClasses() {
//        return new Class[]{WebAppConfig.class};
//    }
//
//    @Override
//    protected Class<?>[] getServletConfigClasses() {
//        return null;
//    }
//
//    @Override
//    protected String[] getServletMappings() {
//        return new String[]{"/"};
//    }
//}

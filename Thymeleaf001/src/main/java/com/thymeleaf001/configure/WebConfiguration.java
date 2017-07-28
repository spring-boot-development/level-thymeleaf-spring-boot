//package com.thymeleaf001.configure;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//import org.thymeleaf.TemplateEngine;
//import org.thymeleaf.spring4.SpringTemplateEngine;
//import org.thymeleaf.templateresolver.ServletContextTemplateResolver;
//import org.thymeleaf.templateresolver.TemplateResolver;
//
///**
// * Created by hiemseyha on 7/28/17.
// */
//
//@Configuration
//@EnableWebMvc
//@ComponentScan("com.thymeleaf001.controller")
//public class WebConfiguration extends WebMvcConfigurerAdapter{
//
//    private static final String TEMPLATE_RESOLVER_PREFIX = "/WEB-INF/templates/";
//    private static final String TEMPLATE_RESOLVER_SUFFIX = ".html";
//    private static final String TEMPLATE_RESOLVER_TEMPLATE_MODE = "HTML5";
//
//
//    @Bean
//    public TemplateEngine templateEngine() {
//        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
//        templateEngine.setTemplateResolver(templateResolver());
//        return templateEngine;
//    }
//
//    @Bean
//    public TemplateResolver templateResolver() {
//        TemplateResolver templateResolver = new ServletContextTemplateResolver();
//        templateResolver.setPrefix(TEMPLATE_RESOLVER_PREFIX);
//        templateResolver.setSuffix(TEMPLATE_RESOLVER_SUFFIX);
//        templateResolver.setTemplateMode(TEMPLATE_RESOLVER_TEMPLATE_MODE);
//        return  templateResolver;
//
//    }
//}

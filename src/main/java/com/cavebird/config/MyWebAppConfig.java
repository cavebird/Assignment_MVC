package com.cavebird.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.cavebird")
public class MyWebAppConfig implements WebMvcConfigurer {

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        //viewResolver.setViewClass(JstlView.class);//Not any more required
        viewResolver.setPrefix("/WEB-INF/view/");
        viewResolver.setSuffix(".jsp");
        registry.viewResolver(viewResolver);
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("/static/");
    }

//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        MyInterceptor interceptor = new MyInterceptor();
//        registry.addInterceptor(interceptor);
//    }
    
//    @Bean // to dilono bean gia na bei ston spring container
//    public MessageSource sourceOfMessages(){
//        ResourceBundleMessageSource bundle = new ResourceBundleMessageSource();
//        bundle.setBasename("mymessages");
//        return bundle;
//    }
}

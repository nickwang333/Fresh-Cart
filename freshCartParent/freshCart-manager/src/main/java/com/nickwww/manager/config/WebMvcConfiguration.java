package com.nickwww.manager.config;

import com.nickwww.manager.interceptor.LoginAuthInterceptor;
import com.nickwww.manager.properties.UserProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class WebMvcConfiguration implements WebMvcConfigurer {

    @Autowired
    private LoginAuthInterceptor loginAuthInterceptor;

    @Autowired
    private UserProperties userProperties;

    // Interceptor registry
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginAuthInterceptor)
                .excludePathPatterns(userProperties.getNoAuthUrls())
                .addPathPatterns("/**");
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry. addMapping( "/**")
                .allowCredentials(true)
                .allowedOriginPatterns("")
                .allowedMethods ("*")
                .allowedHeaders("*") ;
    }
}

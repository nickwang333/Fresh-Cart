package com.nickwww.manager.config;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class WebMvcConfiguration implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry. addMapping( "/**")
                .allowCredentials(true)
                .allowedOriginPatterns("")
                .allowedMethods ("*")
                .allowedHeaders("*") ;
    }
}

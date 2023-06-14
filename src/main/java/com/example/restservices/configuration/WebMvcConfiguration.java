package com.example.restservices.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/task/**")
                .allowedOrigins("http://localhost/")
                .allowedMethods("GET", "POST", "DELETE", "PUT", "PATCH", "OPTIONS")
                .allowedHeaders("Origin", "Accept", "X-Requested-With", "Content-Type", "Authorization",
                        "Access-Control-Request-Method", "Access-Control-Request-Headers", ", X-PINGOTHER",
                        "X-CSRF-TOKEN", "app_id", "app_key")
                .allowCredentials(true)
                .exposedHeaders("*")
                .maxAge(4800);
    }

}

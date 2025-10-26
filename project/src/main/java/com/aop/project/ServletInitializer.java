package com.aop.project;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.stereotype.Component;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


    @Component
    public class ServletInitializer extends SpringBootServletInitializer {

        @Override
        protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
            return application.sources(ProjectApplication.class);
        }

    }


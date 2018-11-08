package org.debashis.practice.app;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.annotation.PostConstruct;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class SpringBootPracticeApp {

    @Autowired
    private MyDomain domain;

    public static final Logger LOGGER = Logger.getLogger(SpringBootPracticeApp.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringBootPracticeApp.class, args);
    }

    @PostConstruct
    public void showDomain() {
        LOGGER.info("domain : "+domain.getName()+" , "+domain.getApp());
    }
}

package org.debashis.practice.app;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class MyConfiguration {

    @Profile("local")
    @Bean
    @Qualifier("custom-objectMapper")
    @ConditionalOnProperty(name = "createNewObjectMapper", havingValue = "true")
    public ObjectMapper ObjectMapper() {
        return new ObjectMapper();
    }
}

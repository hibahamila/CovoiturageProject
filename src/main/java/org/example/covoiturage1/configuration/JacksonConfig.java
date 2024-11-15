package org.example.covoiturage1.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JacksonConfig {

    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        // Enregistre le module JavaTimeModule pour gérer les types Java Time comme LocalDateTime
        objectMapper.registerModule(new JavaTimeModule());
        objectMapper.findAndRegisterModules(); // Cette ligne peut être utile pour enregistrer les autres modules nécessaires
        return objectMapper;
    }
}

package dev.naimsulejmani.gr1facebook.config;

import dev.naimsulejmani.gr1facebook.repositories.initializer.UserDataInitializer;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public ApplicationRunner initializer(UserDataInitializer initializer) {
        return args -> initializer.run();
    }
}

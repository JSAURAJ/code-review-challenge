package com.idealista;

import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.idealista.application.AdsService;

@Configuration
public class AppConfig {
    
    @Autowired
    private AdsService adsService;
    
    @Bean
    public SmartInitializingSingleton initialize() {
        return () -> {
            adsService.calculateScores();
        };
    }
}

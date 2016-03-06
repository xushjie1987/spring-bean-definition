package com.oneapm.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    
    @Bean
    public static BDRegistryBean bdRegistryBean() {
        return new BDRegistryBean();
    }
    
}

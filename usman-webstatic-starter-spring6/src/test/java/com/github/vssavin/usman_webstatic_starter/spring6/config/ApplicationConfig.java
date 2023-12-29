package com.github.vssavin.usman_webstatic_starter.spring6.config;

import com.github.vssavin.usmancore.spring6.config.DefaultSecurityConfig;
import org.springframework.context.annotation.*;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

/**
 * @author vssavin on 29.12.2023.
 */
@Configuration
@ComponentScan({ "com.github.vssavin.usman_webstatic_starter.*" })
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.github.vssavin.usmancore.*")
@EnableWebSecurity
@Import({ DefaultSecurityConfig.class })
public class ApplicationConfig {

    @Bean
    public RequestMappingHandlerMapping requestMappingHandlerMapping() {
        return new RequestMappingHandlerMapping();
    }

}

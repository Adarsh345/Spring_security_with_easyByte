package com.easyByte.config;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class ProjectSecurityConfig {
 // In spring security first Http request is intercepted by spring security filter
 // so specify type and configurtion of spring security we need configure spring security filter.
 @Bean
 SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
     http.authorizeHttpRequests((requests) -> requests.anyRequest().authenticated());
     http.formLogin(withDefaults());
     http.httpBasic(withDefaults());
     return http.build();
 }
 
}

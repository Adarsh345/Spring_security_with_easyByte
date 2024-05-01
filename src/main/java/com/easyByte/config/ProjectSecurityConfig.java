package com.easyByte.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfig {
    // In spring security first Http request is intercepted by spring security filter
    // so specify type and configurtion of spring security we need configure spring security filter.

    /*
    * This is the configuration for some of the urls which need authencation and some of the urls
    * need to tobe authencated.
    * */
    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests((requests) -> requests.
                        requestMatchers("/myAccount", "/myBalance", "/myLonas", "/myCards").authenticated()
                        .requestMatchers("/notices", "/contact").permitAll())
                .formLogin(Customizer.withDefaults())
                .httpBasic(Customizer.withDefaults());
        return http.build();
    }


    /*
     * Configuration for deny all request
     */
    /* @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests((requests) -> requests.
                       anyRequest().denyAll());
        return http.build();
    } */

    /*
     * configuration for permit all request
     * */
   /* @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests((requests) -> requests.
                       anyRequest().permitAll());
        return http.build();
    }*/


}

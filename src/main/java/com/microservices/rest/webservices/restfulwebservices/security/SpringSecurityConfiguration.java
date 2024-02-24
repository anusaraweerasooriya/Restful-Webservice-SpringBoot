package com.microservices.rest.webservices.restfulwebservices.security;

import static org.springframework.security.config.Customizer.withDefaults;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfiguration {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        //01) All requests should be authenticated
         http.authorizeHttpRequests(
                 auth -> auth.anyRequest().authenticated()
         );

        //02) If a request is not authenticated, a web page is shown
        http.httpBasic(withDefaults());

        //03) CSRF -> POST, PUT
        http.csrf().disable();

        return http.build();
    }
}

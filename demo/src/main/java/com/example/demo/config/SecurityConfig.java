package com.example.demo.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception{
        httpSecurity.csrf(csrf -> csrf.disable()).authorizeHttpRequests(auth -> auth.
                requestMatchers("/swagger-ui/**","/v3/api-docs/**").permitAll()
                .requestMatchers(HttpMethod.GET,"/**").permitAll()
                .requestMatchers("/auth/**").permitAll()
                .anyRequest().authenticated()).httpBasic(Customizer.withDefaults());
        return httpSecurity.build();
    }

    @Bean
    public OpenAPI customOpenApi(){
        return new OpenAPI().addSecurityItem(new SecurityRequirement().addList("basicScheme"))
                .components(new Components().addSecuritySchemes("basicScheme",new SecurityScheme()
                        .type(SecurityScheme.Type.HTTP).scheme("basic")));
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}

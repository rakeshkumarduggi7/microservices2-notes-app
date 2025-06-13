package com.microsservices2.Microservices2_userservice.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
@Configuration
@EnableWebSecurity
public class custConfig {
    @Autowired
    UserDetailsService uds;
    @Bean
    public SecurityFilterChain filters(HttpSecurity http) throws Exception{
    return http.csrf(customizer->customizer.disable())
            .authorizeHttpRequests(req->req
                    .requestMatchers("/user/signup").permitAll()
                    .anyRequest().authenticated())
            .httpBasic(Customizer.withDefaults())
            .sessionManagement(ses->ses.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
            .build();
}
@Bean
    public AuthenticationProvider authprovider(){
    DaoAuthenticationProvider provider=new DaoAuthenticationProvider();
    provider.setPasswordEncoder(new BCryptPasswordEncoder(12));
    provider.setUserDetailsService(uds);
    return provider;
}

}

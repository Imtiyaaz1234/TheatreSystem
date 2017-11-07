package com.TPFinalGroupAssign.TheatreSystem.Security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@Configuration
public class SecurityConfig {
    protected void configure(AuthenticationManagerBuilder amb) throws Exception{

    }


    protected void configure(HttpSecurity httpSecurity) throws Exception{

        httpSecurity.csrf().disable();
    }
}

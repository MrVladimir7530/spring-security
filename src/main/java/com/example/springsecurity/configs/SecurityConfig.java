package com.example.springsecurity.configs;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/authenticated/**").authenticated()
//                .antMatchers("/admin/**").hasAnyRole("ADMIN", "SUPERADMIN")
//                .antMatchers("/profile/**").authenticated()
                .and()
                .formLogin()
                .and()
                .logout().logoutSuccessUrl("/");
    }
}

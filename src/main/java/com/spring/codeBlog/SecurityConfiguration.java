package com.spring.codeBlog;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
@EnableWebSecurity
public class SecurityConfiguration  extends WebSecurityConfigurerAdapter{
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
                .csrf()
                .disable()
                .authorizeRequests()
                .antMatchers("/**").permitAll()
                .anyRequest().authenticated();
    }
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("../templates/**");
    }
}

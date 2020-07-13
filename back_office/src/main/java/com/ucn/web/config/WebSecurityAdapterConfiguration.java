package com.ucn.web.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityAdapterConfiguration extends WebSecurityConfigurerAdapter{

	@Autowired
	public WebSecurityConfig webSecurityConfig;
	
	
    @Override
    protected void configure(HttpSecurity http) throws Exception{
//      http.csrf().disable();
        http.csrf().ignoringAntMatchers(webSecurityConfig.getDoLogin(), webSecurityConfig.getDoLogout());
//    	http.exceptionHandling().accessDeniedPage(webSecurityConfig.getAccessDenied());
    }
}

package com.edu.upeu.auth;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter{
	
	public void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers(HttpMethod.GET, "/api/categoria").permitAll()
		 .antMatchers(HttpMethod.GET, "/api/categoria/{id}").hasAnyAuthority("USER", "ADMIN")
		 .antMatchers(HttpMethod.POST, "/api/savecat").hasAnyAuthority("USER, ADMIN")
		 .antMatchers(HttpMethod.PUT, "/api/editcat/{id}").hasAnyAuthority("USER", "ADMIN")
		 .antMatchers(HttpMethod.DELETE, "/api/deletecat/{id}").hasAnyAuthority("USER", "ADMIN")
		 .anyRequest().authenticated();
	}

}
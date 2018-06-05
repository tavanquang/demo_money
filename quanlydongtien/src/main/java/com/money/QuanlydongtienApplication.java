package com.money;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import com.money.service.impl.UserLoginServiceImpl;

@SpringBootApplication
public class QuanlydongtienApplication extends WebSecurityConfigurerAdapter{

	@Autowired
	UserLoginServiceImpl userDetailsService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(QuanlydongtienApplication.class, args);
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeRequests()
		.antMatchers("").permitAll().anyRequest()
		.authenticated().and().formLogin().loginPage("/login")
		.defaultSuccessUrl("/").failureUrl("/login?e=error")
		.permitAll().and().logout().permitAll().and()
		.exceptionHandling().accessDeniedPage("/login?e=deny");
	}
	
	@Override
	public void configure(WebSecurity web) throws Exception {
		// TODO Auto-generated method stub
		super.configure(web);
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		auth.userDetailsService(userDetailsService);
	}
	
	
	
	
}

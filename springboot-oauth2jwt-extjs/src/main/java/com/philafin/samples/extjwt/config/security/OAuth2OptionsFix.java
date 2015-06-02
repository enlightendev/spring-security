package com.philafin.samples.extjwt.config.security;


import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

/**
 * http://stackoverflow.com/questions/24492835/spring-security-oauth-stackoverflowexception
 */

@Configuration
@Order(-1)
public class OAuth2OptionsFix extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // @formatter:off
        http
            .requestMatchers().antMatchers(HttpMethod.OPTIONS, "/oauth/token", "/api/**")
            .and().csrf().disable()
            .authorizeRequests().anyRequest().permitAll()
            .and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        // @formatter:on
    }
}
package io.enlightendev.resourceserver.config.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;

/**
 * EnableResourceServer annotation enables a Spring Security filter named OAuth2AuthenticationProcessingFilter that
 * authenticates requests using a passed in OAuth2 token. The ResourceServerConfigurerAdapter provides methods
 * that can be used to access rules to secure resources using HttpSecurity class
 */
@Configuration
@EnableResourceServer
public class OAuth2ResourceServerConfig extends ResourceServerConfigurerAdapter {

    /**
     * The name of this resource id must match the name that we used in the authorization server.
     * @param resources
     * @throws Exception
     */
    @Override
    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
        resources.resourceId("E2DWResource");
    }

    /**
     * Configure the paths protected by this resource
     * @param http
     * @throws Exception
     */
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
                .requestMatchers().antMatchers("/api/oauth2/**")
                .and()
                .authorizeRequests().antMatchers("/api/oauth2/**").authenticated();

    }
}
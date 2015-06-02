package com.philafin.samples.extjwt.config.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * https://spring.io/guides/gs/rest-service-cors/
 * http://stackoverflow.com/questions/22846309/cors-filter-not-working-as-intended
 */
@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class CORSConfig implements Filter {


    private final static Logger log = LoggerFactory.getLogger(CORSConfig.class);

    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {

        //log.info("Adding Access Control Response Headers");

        HttpServletResponse response = (HttpServletResponse) res;
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "PUT, POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "origin, accept, x-requested-with, content-type, authorization");
        chain.doFilter(req, res);
    }

    public void init(FilterConfig filterConfig) {
    }

    public void destroy() {
    }

}

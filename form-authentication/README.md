## About

- Showing custom form for authentication instead of basic http authentication.

- Front end app and server side are served from the same server process. Future versions are saved from separate
processes.


## Security

We implement our own security config class that extends WebSecurityConfigurerAdapter so that we can override
methods to implement our particular requirements.


## Users

This application does not override the default user store created by including <artifactId>spring-boot-starter-security</artifactId>.
Thus we have only one user configured using application.yml

TODO: override default user store with custom.

## Angular

- served directly from public folder
- our static content is in resources/public.



## Reference

- form login
http://docs.spring.io/autorepo/docs/spring-security/4.0.0.M1/apidocs/org/springframework/security/config/annotation/web/builders/HttpSecurity.html#formLogin()

- logout
http://docs.spring.io/autorepo/docs/spring-security/4.0.0.M1/apidocs/org/springframework/security/config/annotation/web/builders/HttpSecurity.html#logout()



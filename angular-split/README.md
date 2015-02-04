## About

Shows a sample single page application (in angular) served by its own server process and authenticates
against its own server.

Upon successful login a request is made to a resource server that acts as an api server hosted by another separate process.

## What to look out for

- client side
    - much like form-authentication module: configured for form authentication by overriding default http
      security.
    - using default user store: single user configured in application.yml


- resource/api server
    - the resource server must be configured to allow CORS since client is on separate process.
    - the resource server in this case is not protecting the api.



TODO: protect resource server using tokens.

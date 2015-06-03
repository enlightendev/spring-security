var app = {};

app.config = {
    SERVICE_ENDPOINT: "http://localhost:8080/",
    OAUTH_ENDPOINT: "http://localhost:8080/oauth/token",
    OAUTH_BASIC_AUTH: btoa("springboot-oauth2jwt:secret")
};

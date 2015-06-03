Ext.define('ExtJwt.Application', {
    extend: 'Ext.app.Application',

    name: 'ExtJwt',

    models: [
        'UserModel'
    ],

    stores: [],

    views: [
        'login.LoginView',
        'MainView',
        'user.UserView'
    ],

    launch: function () {
        var isAuthenticated = localStorage.getItem("isAuthenticated");

        Ext.widget(isAuthenticated == "true" ? 'mainview' : 'login');

        ExtJwt.config = {
            SERVICE_ENDPOINT: "http://localhost:8080/",
            OAUTH_ENDPOINT: "http://localhost:8080/oauth/token",
            OAUTH_BASIC_AUTH: btoa("springboot-oauth2jwt:secret")
        };
    }
});
Ext.define('ExtJwt.Application', {
    extend: 'Ext.app.Application',

    name: 'ExtJwt',

    models: [
        'UserModel'
    ],

    stores: [],

    views: [
        'MainView',
        'UserView'
    ],

    launch: function () {
        Ext.create('ExtJwt.view.MainView');

        ExtJwt.config = {
            OAUTH_ENDPOINT: "http://localhost:8080/oauth/token",
            OAUTH_BASIC_AUTH: btoa("springboot-oauth2jwt:secret")
        };
    }
});
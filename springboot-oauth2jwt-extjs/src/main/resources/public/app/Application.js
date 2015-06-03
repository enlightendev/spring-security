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
    }
});
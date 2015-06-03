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

        Ext.Ajax.on('beforerequest', globalInterceptor);

        Ext.widget(isAuthenticated == "true" ? 'mainview' : 'login');
    }
});

function globalInterceptor(conn, options, eOpts) {
    console.log(arguments);
    if (localStorage.getItem('isAuthenticated') == "true") {
        if (!options.headers) options.headers = {};
        options.headers.Authorization = 'Bearer ' + localStorage.getItem('access_token');
    }
    console.log("Test interceptor");
}
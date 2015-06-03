Ext.define('ExtJwt.view.login.LoginController', {
    extend: 'Ext.app.ViewController',
    alias: 'controller.login',

    onLoginClick: function () {
        Ext.Ajax.request({
            scope: this,
            method: "POST",

            url: ExtJwt.config.OAUTH_ENDPOINT,
            headers: {
                "Authorization": "Basic " + ExtJwt.config.OAUTH_BASIC_AUTH
            },
            params: this.getReferences().form.getValues(),
            success: this.onLoginSuccess,
            failure: this.onLoginFailure
        });
    },

    onLoginSuccess: function (response) {
        var tokenDetail = Ext.decode(response.responseText);

        localStorage.clear();
        localStorage.setItem("isAuthenticated", true);
        localStorage.setItem("access_token", tokenDetail.access_token);
        localStorage.setItem("roles", tokenDetail.scope);

        this.getView().destroy();

        Ext.widget('mainview');
    },

    onLoginFailure: function (response) {
        localStorage.setItem("isAuthenticated", false);
        Ext.Msg.alert("Login failure", "Username or password is incorrect");
    }
});
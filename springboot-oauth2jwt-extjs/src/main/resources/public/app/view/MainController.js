Ext.define('ExtJwt.view.MainController', {
    extend: 'Ext.app.ViewController',
    alias: 'controller.main',

    onLogoutClick: function() {
        localStorage.clear();
        this.getView().destroy();
        Ext.widget('login');
    }
});
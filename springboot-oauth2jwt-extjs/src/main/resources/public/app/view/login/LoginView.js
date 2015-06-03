Ext.define('ExtJwt.view.login.LoginView', {
    extend: 'Ext.window.Window',
    xtype: 'login',

    controller: 'login',

    requires: [
        'ExtJwt.view.login.LoginController'
    ],

    bodyPadding: 10,
    title: 'JWT Login',
    closable: false,
    resizable: false,
    autoShow: true,

    items: {
        xtype: 'form',
        reference: 'form',
        bodyPadding: 5,
        items: [{
            xtype: 'textfield',
            name: 'username',
            fieldLabel: 'Username',
            allowBlank: false
        }, {
            xtype: 'textfield',
            name: 'password',
            inputType: 'password',
            fieldLabel: 'Password',
            allowBlank: false
        }, {
            xtype: 'hiddenfield',
            name: 'grant_type',
            value: 'password'
        }],
        buttons: [{
            text: 'Login',
            formBind: true,
            listeners: {
                click: 'onLoginClick'
            }
        }]
    }
});
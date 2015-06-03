Ext.define('ExtJwt.view.MainView', {
    extend: 'Ext.container.Viewport',
    alias: 'widget.mainview',

    controller: 'main',

    requires: [
        'ExtJwt.view.MainController'
    ],

    layout: 'border',

    items: [{
        xtype: 'panel',
        title: 'ExtJS example with JWT',
        region: 'center',

        items: [{
            xtype: 'userview'
        }],

        tbar: ['->', {
            text: 'logout',
            listeners: {
                click: 'onLogoutClick'
            }
        }]
    }]
});
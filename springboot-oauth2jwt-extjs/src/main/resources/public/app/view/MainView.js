Ext.define('ExtJwt.view.MainView', {
    extend: 'Ext.container.Viewport',
    alias: 'widget.extjwtmainview',

    layout: 'border',

    items: [{
        xtype: 'panel',
        title: 'ExtJS example with JWT',
        region: 'center',
        items: [{
            xtype: 'userview'
        }]
    }]
});
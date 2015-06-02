Ext.define('ExtJwt.store.UserDataStore', {
    extend: 'Ext.data.Store',
    alias: 'store.userdatastore',

    requires: [
        'SolarAdmin.model.CertModel',
        'Ext.data.proxy.Ajax',
        'Ext.data.reader.Json'
    ],

    constructor: function(cfg) {
        var me = this;
        cfg = cfg || {};
        me.callParent([Ext.apply({
            storeId: 'CertDataStore',
            autoLoad: true,
            model: 'SolarAdmin.model.CertModel',
            proxy: {
                type: 'ajax',
                url: 'data/certs.json',
                reader: {
                    type: 'json',
                    rootProperty: 'data'
                }
            }
        }, cfg)]);
    }
});
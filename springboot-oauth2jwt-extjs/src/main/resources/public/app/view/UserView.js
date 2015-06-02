Ext.define('ExtJwt.view.UserView', {
    extend: 'Ext.grid.Panel',
    alias: 'widget.userview',
    reference: 'caseGridRef',

    requires: ['ExtJwt.view.UserViewModel'],

    viewModel: {
        type: 'userviewmodel'
    },

    bind: {
        store: '{usermodel}'
    },

    columns: [{
        xtype: 'gridcolumn',
        dataIndex: 'firstName',
        text: 'First Name',
        flex: 1
    }, {
        xtype: 'gridcolumn',
        dataIndex: 'lastName',
        text: 'Last Name',
        flex: 1
    }, {
        xtype: 'gridcolumn',
        dataIndex: 'email',
        text: 'Email',
        flex: 2
    }]

});
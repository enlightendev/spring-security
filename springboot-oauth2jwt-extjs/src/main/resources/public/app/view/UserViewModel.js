Ext.define('ExtJwt.view.UserViewModel', {
    extend: 'Ext.app.ViewModel',
    alias: 'viewmodel.userviewmodel',

    stores: {
        usermodel: {
            autoLoad: true,
            model: 'ExtJwt.model.UserModel',
            proxy: {
                type: 'ajax',
                api: {
                    read: 'http://localhost:8080/api/user/list'
                },
                headers: {
                    'Authorization': 'Bearer ' + localStorage.getItem('user-token')
                },
                reader: {
                    type: 'json',
                    headers: {'Accept': 'application/json'}
                }
            }
        }
    }
});
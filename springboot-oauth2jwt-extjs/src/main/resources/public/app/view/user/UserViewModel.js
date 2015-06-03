Ext.define('ExtJwt.view.user.UserViewModel', {
    extend: 'Ext.app.ViewModel',
    alias: 'viewmodel.userviewmodel',

    stores: {
        usermodel: {
            autoLoad: true,
            model: 'ExtJwt.model.UserModel',
            proxy: {
                type: 'ajax',
                api: {
                    read: app.config.SERVICE_ENDPOINT + 'api/user/list'
                },
                headers: {
                    'Authorization': 'Bearer ' + localStorage.getItem('access_token')
                },
                reader: {
                    type: 'json',
                    headers: {'Accept': 'application/json'}
                }
            }
        }
    }
});
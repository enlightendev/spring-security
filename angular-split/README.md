## About

Shows a sample single page application (in angular) served by its own server process and authenticates
against its own server.

Upon successful login a request is made to a resource server that acts as an api server hosted by another separate process.

NOTE:
web user is authenticating against front end server application, not against back end. Once user is
authenticated on front end we can make request to unprotected back end.

    $scope.login = function () {
                $http.post('login', $.param($scope.credentials), {
                    headers: {
                        "content-type": "application/x-www-form-urlencoded"
                    }
                }).success(function (data) {

in future versions I would like client side to be completely dumb and authenticate against back end api

    $scope.login = function () {
                $http.post('http://localhost:9090/api/login', $.param($scope.credentials), {
                    headers: {
                        "content-type": "application/x-www-form-urlencoded"
                    }
                }).success(function (data) {

basically that means the front end server should not have a SecurityConfiguration class
or UserController class,etc


## What to look out for

- client side
    - much like form-authentication module: configured for form authentication by overriding default http
      security.
    - using default user store: single user configured in application.yml


- resource/api server
    - the resource server must be configured to allow CORS since client is on separate process.
    - the resource server in this case is not protecting the api.



TODO: protect resource server using tokens.

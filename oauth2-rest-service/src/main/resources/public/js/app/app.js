angular.module('MainApp', ['ngRoute','http-auth-interceptor'])

    .config(function ($routeProvider, $httpProvider) {

        $routeProvider.when('/', {
            templateUrl: 'home.html',
            controller: 'home'
        }).when('/login', {
            templateUrl: 'login.html',
            controller: 'navigation'
        }).when('/scratch', {
            templateUrl: 'scratch.html',
            controller: 'ScratchController'
        }) .otherwise('/');
    })

    .controller('navigation', function ($rootScope, $scope, $http, $location, $route) {

        $scope.tab = function (route) {
            return $route.current && route === $route.current.controller;
        };


        $scope.credentials = {};
        $scope.login = function () {

        };

        $scope.logout = function () {

        }
    })

    .controller('home', function ($scope, $http) {

        $http.get('http://localhost:8080/greeting').success(function (data) {
            $scope.greeting = data;
        });

    })

    .controller('ScratchController', function ($scope, $log) {

        $scope.user = 'TestUsr';

    })

    ;

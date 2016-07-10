var automationApp = angular.module('automationApp', ['ui.bootstrap','smart-table','ngResource']);

automationApp.factory('User', ['$resource', function ($resource) {
    return $resource('http://localhost:8080/AutomationDashboard/results/:id');
}]);
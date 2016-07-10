automationApp.controller('safeCtrl', ['$scope', function ($scope) {

//    var firstnames = ['Laurent', 'Blandine', 'Olivier', 'Max'];
//    var lastnames = ['Renard', 'Faivre', 'Frere', 'Eponge'];
//    var statuss = ['failed', 'pass'];
//    var dates = ['1987-05-21', '1987-04-25', '1955-08-27', '1966-06-06'];
//    var id = 1;
//
//    function generateRandomItem(id) {
//
//        var id = Math.floor(Math.random() * 2000);
//        var project = lastnames[Math.floor(Math.random() * 3)];
//        var executionDate = dates[Math.floor(Math.random() * 3)];
//        var testcase = Math.floor(Math.random() * 2000);
//        var status = statuss[Math.floor(Math.random() * 2)];
//
//        return {
//            id: id,
//            project: project,
//            testcase: testcase,
//            date: new Date(executionDate),
//            status: status,
//            ENV: ENV
//        }
//    }

    $scope.rowCollection = [];

    for (id; id < 5; id++) {
        $scope.rowCollection.push(generateRandomItem(id));
    }

    //add to the real data holder
    $scope.addRandomItem = function addRandomItem() {
        $scope.rowCollection.push(generateRandomItem(id));
        id++;
    };

    //remove to the real data holder
    $scope.removeItem = function removeItem(row) {
        var index = $scope.rowCollection.indexOf(row);
        if (index !== -1) {
            $scope.rowCollection.splice(index, 1);
        }
    }
}]);
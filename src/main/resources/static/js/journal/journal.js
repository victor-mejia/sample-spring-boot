(function(){
    var app = angular.module('journal',[]);
    var fileUploadForm = document.getElementById("uploadFileForm");

    app.directive('fileModel', ['$parse', function ($parse) {
        return {
            restrict: 'A',
            link: function(scope, element, attrs) {
                var model = $parse(attrs.fileModel);
                var modelSetter = model.assign;

                element.bind('change', function(){
                    scope.$apply(function(){
                        modelSetter(scope, element[0].files[0]);
                    });
                });
            }
        };
    }]);

    app.service('fileUpload', ['$http', function ($http) {
        this.uploadFileToUrl = function(file, uploadUrl){
            var fd = new FormData();
            fd.append('file', file);
            $http.post(uploadUrl, fd, {
                transformRequest: angular.identity,
                headers: {'Content-Type': undefined}
            })
            .success(function(data){
                alert("Success: "+data);
            })
            .error(function(err){
                alert("Error: "+err);
            });
        };
    }]);

    app.controller('UploadFileController',['$scope', 'fileUpload',function($scope, fileUpload){
        this.uploadFile = function(){
             var file = $scope.file;
             console.log('file is ' );
             console.dir(file);
             var uploadUrl = "service/file";
             fileUpload.uploadFileToUrl(file, uploadUrl);
        };
    }]);
})();

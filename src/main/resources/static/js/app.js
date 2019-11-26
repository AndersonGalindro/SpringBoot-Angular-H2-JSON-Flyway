//criação do modulo principal da aplicação
var AppCrud = angular.module("AppCrud", []);


//Criação de controller
AppCrud.controller("indexController", function($scope, $http) {

	$scope.avisos = [];
	$scope.aviso = {};

	// Carregar Dados
	ListarAvisos = function() {

		$http({
			method : 'GET',
			url : 'http://localhost:8080/Aviso'
		}).then(function(response) {
			$scope.avisos = response.data;

		}, function(response) {
			console.log(response.data);
			console.log(response.status);
		});

	};

	// Salvar Dados
	$scope.SalvarAvisos = function() {

		$http({
			method : 'POST',
			url : 'http://localhost:8080/Aviso',
			data : $scope.aviso
		}).then(function(response) {
			ListarAvisos
			// $scope.avisos.push(response.data);
			ListarAvisos();

		}, function(response) {
			console.log(response.data);
			console.log(response.status);
		});
		$scope.aviso = {};

	}

	// Excluir Dados
	$scope.ExcluirAviso = function(aviso) {

		$http({
			method : 'DELETE',
			url : 'http://localhost:8080/Aviso/' + aviso.id
		}).then(function(response) {

			// Varrer Array
			for (i = 0; i < $scope.avisos.length; i++) {
				if ($scope.avisos[i].id == aviso.id) {
					$scope.avisos.splice(i, 1);
					break;
				}
			}
		}, function(response) {
			console.log(response.data);
			console.log(response.status);
		});

	}

	// Alterar Dados
	$scope.AlterarAviso = function(modificarAviso) {
		$scope.aviso = angular.copy(modificarAviso);
		

	};

	// Limpar Campo
	$scope.limparCampo = function() {
		$scope.aviso = {};
	};

	ListarAvisos();
		
	
	
});
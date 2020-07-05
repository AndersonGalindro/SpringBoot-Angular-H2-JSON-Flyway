//criação do modulo principal da aplicação
var AppCrud = angular.module("AppCrud", []);

// Criação de controller
AppCrud.controller("indexController", function($scope, $http) {

	$scope.avisos = [];
	$scope.aviso = {};

	// Carregar Dados
	$scope.ListarAvisos = function() {

		$http({
			method : 'GET',
			url : '/aviso'
		}).then(function(response) {
			$scope.avisos = response.data;

		}, function(response) {
			alert("falha ao buscar avisos");
		});

	};

	// Salvar Dados
	$scope.SalvarAvisos = function() {

		$http({
			method : $scope.aviso.id ? 'PUT' : 'POST',
			url : $scope.aviso.id ? '/aviso/' + $scope.aviso.id : '/aviso',
			data : $scope.aviso
		}).then(function(response) {

			$scope.ListarAvisos();

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
			url : '/aviso/' + aviso.id
		}).then(function(response) {
			alert("Excluido com sucesso!");
			$scope.ListarAvisos();
		}, function(response) {
			alert("Falha ao excluir!");

		});

	}

	// Alterar Dados
	$scope.AlterarAviso = function(modificarAviso) {
		$scope.aviso = angular.copy(modificarAviso);

	};

	// Limpar Campo
	$scope.limparCampo = function() {
		$scope.aviso;
	};

	$scope.ListarAvisos();

});
package Com.Crud.SpringBootAngular.Controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import Com.Crud.SpringBootAngular.Model.AvisosModel;
import Com.Crud.SpringBootAngular.Service.AvisoService;

@Controller
public class AvisoController {

	@Autowired
	AvisoService avisoService;

	// Entrada De Dados
	@RequestMapping(method = RequestMethod.POST, value = "/Aviso", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AvisosModel> MetodoRetornar(@RequestBody AvisosModel Cadastro) {
		// TODO Auto-generated method stub

		AvisosModel AvisoCadastrado = avisoService.Cadastrar(Cadastro);

		return new ResponseEntity<AvisosModel>(AvisoCadastrado, HttpStatus.CREATED);

	}

	// Saida De Dados
	@RequestMapping(method = RequestMethod.GET, value = "/Aviso", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<AvisosModel>> BuscasTodosAvisos() {
		// TODO Auto-generated method stub

		Collection<AvisosModel> AvisoCadastrado = avisoService.BuscasTodos();
		return new ResponseEntity<>(AvisoCadastrado, HttpStatus.OK);

	}

	// Exclusão de Dados
	@RequestMapping(method = RequestMethod.DELETE, value = "/Aviso/{id}")
	public ResponseEntity<AvisosModel> ExcluirAviso(@PathVariable Integer id) {
		// TODO Auto-generated method stub

		AvisosModel AvisoValido = avisoService.VarrendoId(id);

		if (AvisoValido == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		avisoService.ExcluirAviso(AvisoValido);
		return new ResponseEntity<AvisosModel>(HttpStatus.OK);
	}

	// Modificar Dados
	@RequestMapping(method = RequestMethod.PUT, value = "/Aviso", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AvisosModel> AlterarAviso(@RequestBody AvisosModel Aviso) {
		// TODO Auto-generated method stub

		AvisosModel AtualizarAviso = avisoService.ModificarAviso(Aviso);

		return new ResponseEntity<AvisosModel>(AtualizarAviso, HttpStatus.OK);

	}

}

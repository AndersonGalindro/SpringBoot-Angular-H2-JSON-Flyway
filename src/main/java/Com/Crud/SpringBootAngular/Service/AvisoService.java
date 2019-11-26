package Com.Crud.SpringBootAngular.Service;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import Com.Crud.SpringBootAngular.Model.AvisosModel;

@Service
public class AvisoService {

	@Autowired
	BancoDeDados Ponte;

	// Regra De Negocio
	@PostMapping("/save")
	public AvisosModel Cadastrar(AvisosModel Cadastro) {
		return Ponte.save(Cadastro);
	}

	public Collection<AvisosModel> BuscasTodos() {
		return Ponte.findAll();
	}

	@PostMapping("/delete")
	public void ExcluirAviso(AvisosModel Cadastro) {
		Ponte.delete(Cadastro);
	}

	public AvisosModel VarrendoId(Integer id) {
		return Ponte.getOne(id);
	}

	public AvisosModel ModificarAviso(AvisosModel Cadastro) {
		return Ponte.save(Cadastro);

	}

	@GetMapping("/")
	public String showPage(Model model, @RequestParam(defaultValue = "0") int page) {
		model.addAttribute("data", Ponte.findAll(new PageRequest(page, 4)));
		return "index";
	}

}

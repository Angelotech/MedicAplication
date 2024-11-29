package www.br.WebAplication3.controlles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import www.br.WebAplication3.Model.FichaDeAtendimento;
import www.br.WebAplication3.Repository.FichaAtendimentoRepository;

@RestController
public class FichaDeAtendimentoController {
	
	@Autowired
	FichaAtendimentoRepository fichaAtendimentorepository;
	
	
	@PostMapping(value = "/salvarficha")
	@ResponseBody
	public ResponseEntity<FichaDeAtendimento> salvarficha(@RequestBody FichaDeAtendimento fichaMedica){
		FichaDeAtendimento ficha = fichaAtendimentorepository.save(fichaMedica);
		return new ResponseEntity<FichaDeAtendimento>(ficha,HttpStatus.CREATED);
	}
	
	@PutMapping(value = "atualizarclientes")
	@ResponseBody
	public ResponseEntity<?> atualizar(@RequestBody FichaDeAtendimento fichamedica){
		if (fichamedica.getId() <= 0) {
			return new ResponseEntity<String>("valor de id é invalido",HttpStatus.OK);
			
		} else {
			FichaDeAtendimento fichaAtualizada = fichaAtendimentorepository.saveAndFlush(fichamedica);
			return new ResponseEntity<FichaDeAtendimento>(fichaAtualizada,HttpStatus.OK);
		}
	
	}
	
	
	@GetMapping(value = "/listaAtendimento")
	@ResponseBody
	public ResponseEntity<List<FichaDeAtendimento>> listaAtendimento(){
		
		List<FichaDeAtendimento> atendimento = fichaAtendimentorepository.findAll();
		
		return new ResponseEntity<List<FichaDeAtendimento>>(atendimento,HttpStatus.OK);
	}

	@GetMapping(value = "/buscarprocedimento")
	@ResponseBody
	public ResponseEntity<List<FichaDeAtendimento>>  buscarprocedimento(@RequestParam(name = "procedimentos") String procedimentos){
		List<FichaDeAtendimento> procedimento = fichaAtendimentorepository.buscarprocedimento(procedimentos.trim().toUpperCase());
		return new ResponseEntity<List<FichaDeAtendimento>>(procedimento,HttpStatus.OK);
	}
	 
	@GetMapping(value = "buscarnome")
	@ResponseBody
	public ResponseEntity<List<FichaDeAtendimento>> buscarnome(@RequestParam(name = "nome") String nome){
		List<FichaDeAtendimento> nomes = fichaAtendimentorepository.bucarnome(nome.trim().toUpperCase());
		return new ResponseEntity<List<FichaDeAtendimento>>(nomes,HttpStatus.OK);
	}
	
	
	@DeleteMapping(value = "delete")
	@ResponseBody
	public ResponseEntity<String> delete (@RequestParam Integer idficha){
		fichaAtendimentorepository.deleteById(idficha);
	
		return new ResponseEntity<String>("deletado com sucesso", HttpStatus.OK);
	}
	
	
	
	
	
	
	
	
	

}

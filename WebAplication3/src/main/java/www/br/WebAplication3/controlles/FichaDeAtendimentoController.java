package www.br.WebAplication3.controlles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import www.br.WebAplication3.Model.FichaDeAtendimento;
import www.br.WebAplication3.Repository.FichaAtendimentoRepository;

@RestController
public class FichaDeAtendimentoController {
	
	@Autowired
	FichaAtendimentoRepository fichaAtendimentorepository;

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
	
	
	
	
	
	
	

}

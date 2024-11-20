package www.br.WebAplication3.controlles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import www.br.WebAplication3.Model.CadastroUsuario;
import www.br.WebAplication3.Model.FichaDeAtendimento;
import www.br.WebAplication3.Repository.UsuarioRepository;

@RestController
public class UsuarioController {
	
	@Autowired
	UsuarioRepository usuariorepository;
	
	
	@PostMapping(value = "/Salvar/Usuario")
	@ResponseBody
	public ResponseEntity<CadastroUsuario> salvar (@RequestBody CadastroUsuario usuario){
		CadastroUsuario user = usuariorepository.save(usuario);
		
		return new ResponseEntity<CadastroUsuario>(user, HttpStatus.CREATED);
		
	}
	
	@GetMapping(value = "lista/Usuario")
	@ResponseBody
	public ResponseEntity<List<CadastroUsuario>> listausuario(){
		
		List<CadastroUsuario> usuarios = usuariorepository.findAll();
		
		return new ResponseEntity<List<CadastroUsuario>>(usuarios, HttpStatus.OK);
		
	}
	
	@GetMapping(value = "bucarid/Usuario")
	@ResponseBody
	public ResponseEntity<CadastroUsuario> buscarId(@RequestParam (name = "buscaid") Integer buscarid){
		CadastroUsuario usuarioId = usuariorepository.findById(buscarid).get();
		return new ResponseEntity<CadastroUsuario>(usuarioId,HttpStatus.OK);
	}
	
	@GetMapping(value = "buscarnome/Usuario")
	@ResponseBody
	public ResponseEntity<List<CadastroUsuario>> buscarnome(@RequestParam(name = "nome")String nome){
		List<CadastroUsuario> usuarioNome = usuariorepository.buscapornome(nome.trim().toUpperCase());
		
		return new ResponseEntity<List<CadastroUsuario>>(usuarioNome, HttpStatus.OK);
	}
	 
	 @GetMapping(value = "buscarporcargo/Usuario")
	 @ResponseBody
	 public ResponseEntity<List<CadastroUsuario>> buscaporcargo(@RequestParam(name = "cargo") String cargo){
		 List<CadastroUsuario> usuarioCargo = usuariorepository.buscaporcargo(cargo.trim().toUpperCase());
		 return new ResponseEntity<List<CadastroUsuario>>(usuarioCargo,HttpStatus.OK);
		 	 
	 }
	 
	 @GetMapping(value = "buscarpormatricula")
	 @ResponseBody
	 public ResponseEntity<List<CadastroUsuario>> buscapormatricula(@RequestParam(name = "matricula") String matricula){
		 List<CadastroUsuario> usuarioMatricula = usuariorepository.buscapormatricula(matricula.trim().toUpperCase());
		 return new ResponseEntity<List<CadastroUsuario>>(usuarioMatricula,HttpStatus.OK);
		  
	 }
	 
	 
	 
		
	

			
	
	
	
	
	
	
	
	
	
	

}

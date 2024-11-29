package www.br.WebAplication3.controlles;

import java.util.List;

import org.hibernate.stat.CacheableDataStatistics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter;
import org.springframework.data.convert.ConverterBuilder.WritingConverterAware;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import www.br.WebAplication3.Model.CadastroClientes;
import www.br.WebAplication3.Model.CadastroUsuario;
import www.br.WebAplication3.Model.FichaDeAtendimento;
import www.br.WebAplication3.Repository.DoutoresRepository;
import www.br.WebAplication3.Repository.UsuarioRepository;

@RestController
public class UsuarioController {
	
	@Autowired
	UsuarioRepository usuariorepository;
	
	
	@PostMapping(value = "/SalvarUsuario")
	@ResponseBody
	public ResponseEntity<CadastroUsuario> salvar (@RequestBody CadastroUsuario usuario){
		CadastroUsuario user = usuariorepository.save(usuario);
		
		return new ResponseEntity<CadastroUsuario>(user, HttpStatus.CREATED);
		
	}
	
	@GetMapping(value = "/listaUsuario")
	@ResponseBody
	public ResponseEntity<List<CadastroUsuario>> listausuario(){
		
		List<CadastroUsuario> usuarios = usuariorepository.findAll();
		
		return new ResponseEntity<List<CadastroUsuario>>(usuarios, HttpStatus.OK);
		
	}
	
	 @PutMapping(value = "/atualizarUsuario")
	 @ResponseBody
	 public ResponseEntity<?> atualizar (@RequestBody CadastroUsuario cadastrousuario) {
	      if (cadastrousuario.getId() <= 0) {
	           return new ResponseEntity<String>("valor de id invalido", HttpStatus.OK);

	      } else {
	    	   
	    	CadastroUsuario Caduser = usuariorepository.saveAndFlush(cadastrousuario);
	    	 return new ResponseEntity<CadastroUsuario>(Caduser,HttpStatus.OK);
	    	    
	       }
	   }
	   
	   
	   @GetMapping(value = "/listaAAtendimento")
	   @ResponseBody
	   public ResponseEntity<List<CadastroUsuario>> listaUsuario(){
		   
		   List<CadastroUsuario> lista = usuariorepository.findAll();
		   
		   return new ResponseEntity<List<CadastroUsuario>>(lista,HttpStatus.OK);

	   }
	
	@GetMapping(value = "/bucaridUsuario")
	@ResponseBody
	public ResponseEntity<CadastroUsuario> buscarId(@RequestParam (name = "buscaid") Integer buscarid){
		CadastroUsuario usuarioId = usuariorepository.findById(buscarid).get();
		return new ResponseEntity<CadastroUsuario>(usuarioId,HttpStatus.OK);
	}
	
	@GetMapping(value = "/buscarnomeUsuario")
	@ResponseBody
	public ResponseEntity<List<CadastroUsuario>> buscarnome(@RequestParam(name = "nome")String nome){
		List<CadastroUsuario> usuarioNome = usuariorepository.buscapornome(nome.trim().toUpperCase());
		
		return new ResponseEntity<List<CadastroUsuario>>(usuarioNome, HttpStatus.OK);
	}
	 
	 @GetMapping(value = "/buscarporcargoUsuario")
	 @ResponseBody
	 public ResponseEntity<List<CadastroUsuario>> buscaporcargo(@RequestParam(name = "cargo") String cargo){
		 List<CadastroUsuario> usuarioCargo = usuariorepository.buscaporcargo(cargo.trim().toUpperCase());
		 return new ResponseEntity<List<CadastroUsuario>>(usuarioCargo,HttpStatus.OK);
		 	 
	 }
	 
	 @GetMapping(value = "/buscarpormatricula")
	 @ResponseBody
	 public ResponseEntity<List<CadastroUsuario>> buscapormatricula(@RequestParam(name = "matricula") String matricula){
		 List<CadastroUsuario> usuarioMatricula = usuariorepository.buscapormatricula(matricula.trim().toUpperCase());
		 return new ResponseEntity<List<CadastroUsuario>>(usuarioMatricula,HttpStatus.OK);
		  
	 }
	 
	 @DeleteMapping(value = "/deleteDoutores")
	 @ResponseBody
	 public ResponseEntity<String> deletarUser(@RequestParam Integer id){
		 usuariorepository.deleteById(id);
		 
		 return new ResponseEntity<String>("deletado com sucesso", HttpStatus.OK);
		 
		 
	 }
	  


	

}

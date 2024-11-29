package www.br.WebAplication3.controlles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import www.br.WebAplication3.Model.CadastroClientes;
import www.br.WebAplication3.Repository.ClientesRepository;
import java.util.List;


@RestController
public class ClientesControlles {

    @Autowired
     ClientesRepository clientesRepository;

    @PostMapping(value = "/salvarclientes")
    @ResponseBody
    public ResponseEntity<CadastroClientes> salvar(@RequestBody CadastroClientes cadastroclientes){
    	CadastroClientes cadClientes = clientesRepository.save(cadastroclientes);
    	return new ResponseEntity<CadastroClientes>(cadClientes,HttpStatus.OK);
    	
    }

   @GetMapping(value = "/buscaclientesnome")
   @ResponseBody
   public ResponseEntity<List<CadastroClientes>> buscacliente(@RequestParam(name = "name")String name){
	   List<CadastroClientes> clientes = clientesRepository.buscacliente(name.trim().toUpperCase());
	   return new  ResponseEntity<List<CadastroClientes>>(clientes,HttpStatus.OK);  
   }
   
   
   @GetMapping(value = "/buscaclientesRG")
   @ResponseBody
   public ResponseEntity<List<CadastroClientes>> buscaRG(@RequestParam(name = "RG")String RG){
	   List<CadastroClientes> clientes = clientesRepository.buscaRG(RG.trim().toUpperCase());
	   return new ResponseEntity<List<CadastroClientes>>(clientes,HttpStatus.OK);
	   
	   
   } 
   
   @GetMapping(value = "/buscaclienteCPF")
   @ResponseBody
   public ResponseEntity<List<CadastroClientes>> buscaCpf(@RequestParam (name = "CPF")String Cpf){
	   List<CadastroClientes> clientes = clientesRepository.buscaCpf(Cpf.trim().toUpperCase());
	   return new ResponseEntity<List<CadastroClientes>>(clientes,HttpStatus.OK);
	   
   
   }

   @PutMapping(value = "/atualizarclientes/")
    @ResponseBody
    public ResponseEntity<?> atualizar (@RequestBody CadastroClientes cadastroclientes) {
       if (cadastroclientes.getId() <= 0) {
           return new ResponseEntity<String>("valor de id invalido", HttpStatus.OK);

       } else {
           CadastroClientes clientes = clientesRepository.saveAndFlush(cadastroclientes);
           return new ResponseEntity<CadastroClientes>(clientes, HttpStatus.OK);

       }
   }
   
   @GetMapping(value = "/listclientes")
   @ResponseBody
   public ResponseEntity<List<CadastroClientes>> listaclientes(){
	   List<CadastroClientes> clientes = clientesRepository.findAll();
	   
	   return new ResponseEntity<List<CadastroClientes>>(clientes,HttpStatus.OK);
   }
   
   
   
   @DeleteMapping(value = "/deleteClientes")
   @ResponseBody
   public ResponseEntity<String> delete(@RequestParam Integer idCadastroClientes){
	   clientesRepository.deleteById(idCadastroClientes);
	   return new ResponseEntity<String>("deletado com sucesso", HttpStatus.OK);
   }
   
  
   
}  


    

   
   
    
   







package www.br.WebAplication3.controlles;
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
import www.br.WebAplication3.Model.CadastroDR;
import www.br.WebAplication3.Repository.DoutoresRepository;
import java.util.List;

public class DRcontroller {

    @Autowired
    private DoutoresRepository doutoresRepository;

    @PostMapping(value = "/salvarDoutores")
    @ResponseBody
    public ResponseEntity<CadastroDR> salvar(@RequestBody CadastroDR cadastroDR) {

      //  CadastroDR cadDR = DoutoresRepository.save(cadastroDR);
        CadastroDR cadDR = doutoresRepository.save(cadastroDR);
        return new ResponseEntity<CadastroDR>(cadDR,HttpStatus.CREATED);
    }

    @GetMapping(value = "/buscaDRid")
    @ResponseBody
    public ResponseEntity<CadastroDR> buscarDRid(@RequestParam(name = "idDR")Integer idDR) {
        CadastroDR cadastrodr = doutoresRepository.findById(idDR).get();
        return new ResponseEntity<CadastroDR>(cadastrodr,HttpStatus.OK);
    }

    @GetMapping(value = "/buscapornome")
    @ResponseBody
    public ResponseEntity<List<CadastroDR>> buscapornome(@RequestParam(name = "name")String name){
        List<CadastroDR> doutores = doutoresRepository.buscapornome(name.trim().toUpperCase());
        return new ResponseEntity<List<CadastroDR>>(doutores,HttpStatus.OK);
    }  
    @PutMapping(value = "/atualizar")
    @ResponseBody
    public ResponseEntity<?> atualizar (@RequestBody CadastroDR cadastroDR){
        if(cadastroDR.getId()<= 0) {
            return new ResponseEntity<String>("valor de id invalido", HttpStatus.OK);

        } else {
            CadastroDR  cddoutores = doutoresRepository.saveAndFlush(cadastroDR);
            return new ResponseEntity<CadastroDR>(cddoutores,HttpStatus.OK);

        }
    }


    @DeleteMapping(value = "/deleteDoutores")
    @ResponseBody
    public ResponseEntity<String> delete(@RequestParam Integer idcadastroDR){
        doutoresRepository.deleteById(idcadastroDR);

        return new ResponseEntity<String>("deletado com sucesso", HttpStatus.OK);
        

    }

}

package www.br.WebAplication3.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import www.br.WebAplication3.Model.CadastroClientes;
import www.br.WebAplication3.Model.CadastroDR;
import www.br.WebAplication3.Model.CadastroUsuario;
import www.br.WebAplication3.Model.FichaDeAtendimento;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
import org.springframework.data.repository.query.Param;


@Repository
public interface FichaAtendimentoRepository extends JpaRepository<FichaDeAtendimento,Integer>{

    @Query(value = "SELECT n FROM FichaDeAtendimento n WHERE upper(trim(n.procedimentos)) LIKE %?1%")
    List<FichaDeAtendimento> buscaprocedimento(String procedimento);

    @Query(value = "SELECT f FROM FichaDeAtendimento f WHERE upper(trim(f.paciente.nome)) LIKE %?1%")
    List<FichaDeAtendimento> nomenaficha(String nome);

    @Query(value = "SELECT c FROM CadastroDR c WHERE upper(trim(c.CRM)) LIKE %?1%")
   List<CadastroDR> buscarporcrm(String CRM);






}








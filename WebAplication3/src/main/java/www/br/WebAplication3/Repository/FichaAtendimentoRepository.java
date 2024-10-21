package www.br.WebAplication3.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import www.br.WebAplication3.Model.CadastroUsuario;
import www.br.WebAplication3.Model.FichaDeAtendimento;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface FichaAtendimentoRepository extends JpaRepository<FichaDeAtendimento,Integer>{

/*    List<FichaDeAtendimento> findByPacienteNome(String nome) */

    @Query(value = "SELECT f FROM FichaDeAtendimento f WHERE upper(trim.(f.paciente.nome) like %1%")
    List<FichaDeAtendimento> buscarPorNomePaciente(String nome);

   /* @Query("SELECT f FROM FichaDeAtendimento f WHERE upper(trim.(f.paciente.nome)) like%1%)
            List<FichaDeAtendimento> buscarPorNomePaciente(String nome);*/
}






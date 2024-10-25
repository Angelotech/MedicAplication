package www.br.WebAplication3.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import www.br.WebAplication3.Model.CadastroDR;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface DoutoresRepository extends JpaRepository<CadastroDR, Integer>{

    @Query(value = "SELECT c FROM CadastroDR c WHERE upper(trim(c.CRM)) LIKE %?1%")
    List<CadastroDR> buscarporcrm(String CRM);

    @Query(value = "SELECT n FROM CadastroDR n WHERE upper(trim(n.nome)) LIKE %?1%")
    List<CadastroDR> buscapornome(String nome);

    @Query(value = "SELECT e FROM CadastroDR e WHERE upper(trim(e.especialidade)) LIKE %?1%")
    List<CadastroDR> buscaporesp(String especialidade);

}

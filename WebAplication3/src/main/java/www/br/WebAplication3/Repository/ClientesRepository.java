package www.br.WebAplication3.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import www.br.WebAplication3.Model.CadastroClientes;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ClientesRepository extends JpaRepository<CadastroClientes, Integer> {


   @Query(value ="SELECT r FROM CadastroClientes r WHERE upper(trim(r.RG)) LIKE %?1%")
    List<CadastroClientes> buscaRG(String RG);

    @Query(value = "SELECT n FROM CadastroClientes n WHERE upper(trim(n.nome)) LIKE %?1%")
    List<CadastroClientes> buscacliente(String nome);

    @Query(value = "SELECT c FROM CadastroClientes c WHERE upper(trim(c.Cpf)) LIKE %?1%")
    List<CadastroClientes> buscaCpf(String Cpf);

    




}


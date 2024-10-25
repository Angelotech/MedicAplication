package www.br.WebAplication3.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import www.br.WebAplication3.Model.CadastroUsuario;
import java.util.List;
import org.springframework.data.jpa.repository.Query;

import www.br.WebAplication3.Model.CadastroUsuario;

public interface UsuarioRepository extends JpaRepository<CadastroUsuario,Integer> {
    @Query(value = "SELECT u FROM CadastroUsuario u WHERE upper(trim(u.nome)) LIKE %?1%")
    List<CadastroUsuario> buscapornome(String nome);

    @Query(value = "SELECT c FROM CadastroUsuario c WHERE upper(trim(c.Cargo)) LIKE %?1%")
    List<CadastroUsuario> buscaporcargo( String Cargo);

    @Query(value = "SELECT m FROM CadastroUsuario m WHERE upper(trim(m.matricula)) LIKE %?1%")
    List<CadastroUsuario> buscapormatricula( String matricula);
}












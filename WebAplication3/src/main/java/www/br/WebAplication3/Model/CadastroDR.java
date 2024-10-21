package www.br.WebAplication3.Model;

import jakarta.persistence.*;


import java.io.Serializable;
import java.util.Objects;

@Entity
@SequenceGenerator(name = "seq_DR", sequenceName = "seq_DR", allocationSize = 1, initialValue = 1)
public class CadastroDR extends CadastroUsuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(unique = true)
    private Integer id;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private CadastroUsuario usuario;
    @Column(nullable = false, length = 100, unique = true)
    private String CRM;
    @Column(nullable = false, length = 50)
    private String especialidade;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public CadastroUsuario getUsuario() {
		return usuario;
	}
	public void setUsuario(CadastroUsuario usuario) {
		this.usuario = usuario;
	}
	public String getCRM() {
		return CRM;
	}
	public void setCRM(String cRM) {
		CRM = cRM;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	
    
    
    


}


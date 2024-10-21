package www.br.WebAplication3.Model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import jakarta.persistence.*;

@Entity
@Table(name = "Cadastro_usuario")
@SequenceGenerator(name = "Seq_Usuario", sequenceName = "Usuario", allocationSize = 1, initialValue = 1)
public  class CadastroUsuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(nullable = false,length = 100,unique = true)
    private String Username;
    @Column(nullable = false,length = 20)
    private String Passaword;

    @Column(nullable = false,length = 100, unique = true)
    private String nome;
    @Column(nullable = false,length = 100)
    private String email;
    @Column(nullable = false,length = 40)
    private String setor;
    @Column(nullable = false,length = 100, unique = true)
    private String matricula;
    @Column(nullable = false)
    private Boolean acesso;
    @Column(nullable = false,length = 50, unique = true)
    private String Cpf;
    @Column(nullable = false,length = 50, unique = true)
    private String RG;
    @Column(nullable = false,length = 100)
    private String Residencia;
    @Column(nullable = false,length = 50)
    private String Cargo;


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassaword() {
		return Passaword;
	}
	public void setPassaword(String passaword) {
		Passaword = passaword;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public Boolean getAcesso() {
		return acesso;
	}
	public void setAcesso(Boolean acesso) {
		this.acesso = acesso;
	}
	public String getCpf() {
		return Cpf;
	}
	public void setCpf(String cpf) {
		Cpf = cpf;
	}
	public String getRG() {
		return RG;
	}
	public void setRG(String rG) {
		RG = rG;
	}
	public String getResidencia() {
		return Residencia;
	}
	public void setResidencia(String residencia) {
		Residencia = residencia;
	}
	public String getCargo() {
		return Cargo;
	}
	public void setCargo(String cargo) {
		Cargo = cargo;
	}


	@Override
	public int hashCode() {
		return Objects.hash(Cargo, Cpf, Passaword, RG, Residencia, Username, acesso, email, id,
				matricula, nome, setor);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CadastroUsuario other = (CadastroUsuario) obj;
		return Objects.equals(Cargo, other.Cargo) && Objects.equals(Cpf, other.Cpf)
				&& Objects.equals(Passaword, other.Passaword) && Objects.equals(RG, other.RG)
				&& Objects.equals(Residencia, other.Residencia) && Objects.equals(Username, other.Username)
				&& Objects.equals(id, other.id) && Objects.equals(matricula, other.matricula)
				&& Objects.equals(nome, other.nome) && Objects.equals(setor, other.setor);
	    }
	}
    
    
    



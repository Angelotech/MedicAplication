package www.br.WebAplication3.Model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import jakarta.persistence.*;

@Entity
@Table(name = "Cadastro_usuario")
@SequenceGenerator(name = "Seq_Usuario", sequenceName = "Usuario", allocationSize = 1, initialValue = 1)
public  class CadastroUsuario implements Serializable {
    
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Seq_Usuario")
    private Integer id;

    @Column(nullable = false,length = 100,unique = true)
    private String Username;
    @Column(nullable = false,length = 20)
    private String Passaword;

    @Column(nullable = false,length = 100, unique = true)
    private String nome;
    @Column(nullable = false,length = 100)
    private Character email;
    @Column(nullable = false,length = 40)
    private String setor;
    @Column(nullable = false,length = 100, unique = true)
    private Character matricula;
    @Column(nullable = false)
    private Boolean acesso;
    @Column(nullable = false,length = 50, unique = true)
    private String Cpf;
    @Column(nullable = false,length = 50, unique = true)
    private String RG;
    @Column(nullable = false,length = 500)
    private String endereco;
    @Column(nullable = false,length = 500)
    private String cidade;
    @Column(nullable = false,length = 500)
    private Character estado;
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
	public Character getEmail() {
		return email;
	}
	public void setEmail(Character email) {
		this.email = email;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public Character getMatricula() {
		return matricula;
	}
	public void setMatricula(Character matricula) {
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
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public Character getEstado() {
		return estado;
	}
	public void setEstado(Character estado) {
		this.estado = estado;
	}
	public String getCargo() {
		return Cargo;
	}
	public void setCargo(String cargo) {
		Cargo = cargo;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    


}
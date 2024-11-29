package www.br.WebAplication3.Model;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "CadastroClientes")
@SequenceGenerator(name = "Seq_Clientes", sequenceName = "Seq_Cliente", allocationSize = 1, initialValue = 1)
public class CadastroClientes implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Seq_Clientes")
    @Column(unique = true, nullable = false)
    private Integer id;
    @Column(nullable = false, length = 500 , unique = true)
    private String clienteNome;
    @Column(nullable = false, length = 200)
    private Date dataNascimento;
    @Column(unique = true ,length = 100, nullable = false)
    private String cpf;
    @Column(nullable = false, unique = true, length = 50)
    private String Rg;
    @Column(nullable = false,length = 500)
    private String endereco;
    @Column(nullable = false,length = 500)
    private String cidade;
    @Column(nullable = false,length = 500)
    private Character estado;
    @Column(nullable = false, length = 50)
    private Character numeroTelefone;
    @Column(unique = true, nullable  = false, length = 100)
    private Character Email;
    @Column(nullable = true, length = 20)
    private Character Sexo;
	private Boolean PlSaude;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getClienteNome() {
		return clienteNome;
	}
	public void setClienteNome(String clienteNome) {
		this.clienteNome = clienteNome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return Rg;
	}
	public void setRg(String rg) {
		Rg = rg;
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
	public Character getNumeroTelefone() {
		return numeroTelefone;
	}
	public void setNumeroTelefone(Character numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}
	public Character getEmail() {
		return Email;
	}
	public void setEmail(Character email) {
		Email = email;
	}
	public Character getSexo() {
		return Sexo;
	}
	public void setSexo(Character sexo) {
		Sexo = sexo;
	}
	public Boolean getPlSaude() {
		return PlSaude;
	}
	public void setPlSaude(Boolean plSaude) {
		PlSaude = plSaude;
	}
	
	

	
	


    
    





}


package www.br.WebAplication3.Model;


import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Objects;


@Entity
@Table(name = "CadastroClientes")
@SequenceGenerator(name = "Seq_Clientes", sequenceName = "Seq_Cliente", allocationSize = 1, initialValue = 1)
public class CadastroClientes implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(unique = true, nullable = false)
    private Integer id;
    @Column(nullable = false, length = 500)
    private String nome;
    @Column(nullable = false, length = 200)
    private String DateNasc;
    @Column(unique = true ,length = 100, nullable = false)
    private String Cpf;
    @Column(nullable = false, unique = true, length = 50)
    private String RG;
    @Column(nullable = false,length = 500)
    private String Endereco;
    @Column(nullable = false, length = 50)
    private String NumTelefone;
    @Column(nullable = false, length = 100)
    private String Email;
    @Column(nullable = true, length = 20)
    private String Sexo;
	private Boolean PlSaude;

	public Boolean getPlSaude() {
		return PlSaude ;
	}
	public void setPlSaude(Boolean PlSaude) {
		this.PlSaude = PlSaude;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getDateNasc() {
		return DateNasc;
	}
	public void setDateNasc(String dateNasc) {
		DateNasc = dateNasc;
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
		return Endereco;
	}
	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	public String getNumTelefone() {
		return NumTelefone;
	}
	public void setNumTelefone(String numTelefone) {
		NumTelefone = numTelefone;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getSexo() {
		return Sexo;
	}
	public void setSexo(String sexo) {
		Sexo = sexo;
	}
	


    
    





}


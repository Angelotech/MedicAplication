package www.br.WebAplication3.Model;

import jakarta.persistence.*;

import java.io.Serializable;

import java.util.Objects;

@Entity(name = "plano_de_saude")
@SequenceGenerator(name = "Seq_PLsaude", sequenceName = "Seq_PLsaude", initialValue = 1, allocationSize = 1)
public class CadastroPlanoDeSaude extends CadastroClientes implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(unique = true)
    private Integer id;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private CadastroClientes clientes;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private CadastroDR medicos;

    @Column(nullable = false, unique = true)
    private float valor;
    @Column(nullable = false, length = 50)
    private String tipo;
    @Column(nullable = false, length = 200)
    private String Cobertura;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public CadastroClientes getClientes() {
		return clientes;
	}
	public void setClientes(CadastroClientes clientes) {
		this.clientes = clientes;
	}
	public CadastroDR getMedicos() {
		return medicos;
	}
	public void setMedicos(CadastroDR medicos) {
		this.medicos = medicos;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getCobertura() {
		return Cobertura;
	}
	public void setCobertura(String cobertura) {
		Cobertura = cobertura;
	}
    
    
    
    
}



package www.br.WebAplication3.Model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Timestamp;
import java.time.format.DateTimeFormatter;
import java.util.Objects;



@Entity
@Table(name = "ficha_de_atendimento")
@SequenceGenerator(name = "ficha_de_atendimento", sequenceName = "Seq_ficha", initialValue = 1, allocationSize = 1)
public class FichaDeAtendimento implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ficha_de_atendimento")
    private Integer Id;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private CadastroClientes paciente;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private CadastroDR medicos;

    @Column(nullable = false)
    private CadastroPlanoDeSaude planoDeSaude;
	@Column(nullable = false)
    private String procedimentos;

    @Column(nullable = false)
    private Timestamp horaAtendimento;
    

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public CadastroClientes getPaciente() {
		return paciente;
	}

	public void setPaciente(CadastroClientes paciente) {
		this.paciente = paciente;
	}

	public CadastroDR getMedicos() {
		return medicos;
	}

	public void setMedicos(CadastroDR medicos) {
		this.medicos = medicos;
	}

	public CadastroPlanoDeSaude getPlanoDeSaude() {
		return planoDeSaude;
	}

	public void setPlanoDeSaude(CadastroPlanoDeSaude planoDeSaude) {
		this.planoDeSaude = planoDeSaude;
	}

	public String getProcedimentos() {
		return procedimentos;
	}

	public void setProcedimentos(String procedimentos) {
		this.procedimentos = procedimentos;
	}

	public Timestamp getHoraAtendimento() {
		return horaAtendimento;
	}

	public void setHoraAtendimento(Timestamp horaAtendimento) {
		this.horaAtendimento = horaAtendimento;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
    

}

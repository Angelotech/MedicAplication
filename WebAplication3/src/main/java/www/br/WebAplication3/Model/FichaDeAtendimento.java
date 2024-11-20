package www.br.WebAplication3.Model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;



@Entity
@Table(name = "ficha_de_atendimento")
@SequenceGenerator(name = "ficha_de_atendimento", sequenceName = "Seq_ficha", initialValue = 1, allocationSize = 1)
public class FichaDeAtendimento implements Serializable{


	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
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
    private String hora_atendimento;

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

	public String getHora_atendimento() {
		return hora_atendimento;
	}

	public void setHora_atendimento(String hora_atendimento) {
		this.hora_atendimento = hora_atendimento;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Id, hora_atendimento, medicos, paciente, planoDeSaude, procedimentos);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FichaDeAtendimento other = (FichaDeAtendimento) obj;
		return Objects.equals(Id, other.Id) && Objects.equals(hora_atendimento, other.hora_atendimento)
				&& Objects.equals(medicos, other.medicos) && Objects.equals(paciente, other.paciente)
				&& Objects.equals(planoDeSaude, other.planoDeSaude)
				&& Objects.equals(procedimentos, other.procedimentos);
	}
    
    

}

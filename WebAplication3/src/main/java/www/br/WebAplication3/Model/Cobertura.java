package www.br.WebAplication3.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

public class Cobertura {
    private String prcedimento;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private CadastroDR doutores;


	public String getPrcedimento() {
		return prcedimento;
	}
	public void setPrcedimento(String prcedimento) {
		this.prcedimento = prcedimento;
	}
	public CadastroDR getDoutores() {
		return doutores;
	}
	public void setDoutores(CadastroDR doutores) {
		this.doutores = doutores;
	}
	@Override
	public int hashCode() {
		return Objects.hash(doutores, prcedimento);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cobertura other = (Cobertura) obj;
		return Objects.equals(doutores, other.doutores) && Objects.equals(prcedimento, other.prcedimento);
	}


}

package entidade;

import java.io.Serializable;

public class PessoaJuridica extends Pessoa implements Serializable{

	private String CNPJ;

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
}
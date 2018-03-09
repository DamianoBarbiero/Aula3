package entidade;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Pessoa implements Serializable {

	public int id;
	public String nome;
	public String telefone;
	public int idade;
	public String endereco;
	public String cidade;
	public String estado;
	public double salario;
	public String nomePai;
	public String nomeMae;

	private static List<Pessoa> lst = new ArrayList<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
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

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public void add(Pessoa pessoa) {
		lst.add(pessoa);
	}

	public List<Pessoa> getAll() {
		return lst;
	}

	public double SalarioCon(double salario, int idade) {

		if (idade <= 20) {
			salario += salario * 0.10;
		} else if ((idade > 20) && (idade < 30)) {
			salario += salario * 0.15;
		} else {
			salario += (salario * 0.20);
		}

		return salario;
	}

}

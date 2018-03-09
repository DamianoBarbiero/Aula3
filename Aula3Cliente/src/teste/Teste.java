package teste;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import entidade.IServicoRemoto;
import entidade.Pessoa;
import entidade.PessoaFisica;

public class Teste {

	public static void main(String[] args) {

		try {
			PessoaFisica p1 = new PessoaFisica();

			p1.setNome("André");
			p1.setTelefone("16 8787 6565");
			p1.setIdade(25);
			p1.setSalario(1000);

			PessoaFisica p2 = new PessoaFisica();

			p2.setNome("Bruna");
			p2.setTelefone("16 7474 8989");
			p2.setIdade(20);
			p2.setSalario(1000);

			// Teste de inclusão de consulta das informações:
			// PessoaFisica pf = new PessoaFisica();
			IServicoRemoto pf;

			pf = (IServicoRemoto) Naming.lookup("rmi://localhost:8282/pessoa");

			pf.inserir(p1);
			pf.inserir(p2);

			for (Pessoa pessoaFisica : pf.listarPessoa()) {
				System.out.println("Nome: " + pessoaFisica.getNome());
				System.out.println("Telefone: " + pessoaFisica.getTelefone());
				System.out.println("Idade: " + pessoaFisica.getIdade());
				System.out.println("Salario: " + pessoaFisica.getSalario());
				System.out.println("Salario com aumento: "
						+ pf.SalarioCon2(pessoaFisica.getSalario(), pessoaFisica.getIdade()));
			}

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

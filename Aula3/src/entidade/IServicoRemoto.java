package entidade;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IServicoRemoto extends Remote{
	
	void inserir (Pessoa p) throws RemoteException;
	List<Pessoa> listarPessoa() throws RemoteException;
	
	double SalarioCon2 (double salario, int idade) throws RemoteException;

}


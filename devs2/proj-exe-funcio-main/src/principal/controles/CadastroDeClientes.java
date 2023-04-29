package principal.controles;

import principal.db.Banco;
import principal.modelos.Cliente;

public class CadastroDeClientes {

	public static void adicionar(Cliente cliente) {
		Banco.clientes.add(cliente);
	}

	public static void atualizar(int indexAlterar, Cliente clienteAlterado) {
		Banco.clientes.set(indexAlterar, clienteAlterado);
	}

	public static void atualizar(String nomeOriginal, Cliente clienteAlterado) {
		for (int i = 0; i < Banco.clientes.size(); i++) {
			Cliente cliente = Banco.clientes.get(i);
			if (cliente.nome.equalsIgnoreCase(nomeOriginal)) {
				Banco.clientes.set(i, clienteAlterado);
			    break;
			}
		}
	}
	
	public static Cliente buscar(String nome) {
		Cliente clienteRetorno = null;
		for (Cliente cliente : Banco.clientes) {
			if (cliente.nome.equalsIgnoreCase(nome)) {
				clienteRetorno = cliente;
				break;
			}
		}
		return clienteRetorno;
	}

	public static boolean excluir(String nome) {
		boolean clienteExcluido = false;
		for (int i = 0; i < Banco.clientes.size(); i++) {
			Cliente cliente = Banco.clientes.get(i);
			if (cliente.nome.equalsIgnoreCase(nome)) {
				Banco.clientes.remove(i);
				clienteExcluido = true;
				break;
			}
		}
		return clienteExcluido;
	}
}

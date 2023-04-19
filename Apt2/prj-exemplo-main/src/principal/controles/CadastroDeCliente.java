package principal.controles;

import java.util.List;

import principal.modelos.Cliente;
import principal.util.Session;

public class CadastroDeCliente {

	private List<Cliente> clientes;

	public CadastroDeCliente() {
		this.clientes = Session.banco.getClientes();
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public void adicionar(Cliente cliente) {
		this.clientes.add(cliente);
	}

	public void atualizar(int indexAlterar, Cliente cliente) {
		this.clientes.set(indexAlterar, cliente);
	}

	public Cliente buscar(String nome) {
		Cliente clienteRetorno = null;
		for (Cliente cliente : clientes) {
			if (cliente.getNome().equalsIgnoreCase(nome)) {
				clienteRetorno = cliente;
				break;
			}
		}
		return clienteRetorno;
	}

	public void atualizar(String nomeOriginal, Cliente clienteAlterado) {
		for (int i = 0; i < clientes.size(); i++) {
			Cliente cliente = clientes.get(i);
			if (cliente.getNome().equalsIgnoreCase(nomeOriginal)) {
				clientes.set(i, clienteAlterado);
				break;
			}
		}
	}

	public boolean excluir(String nome) {
		boolean clienteExcluido = false;
		for (int i = 0; i < clientes.size(); i++) {
			Cliente cliente = clientes.get(i);
			if (cliente.getNome().equalsIgnoreCase(nome)) {
				clientes.remove(i);
				clienteExcluido = true;
				break;
			}
		}
		return clienteExcluido;
	}
}

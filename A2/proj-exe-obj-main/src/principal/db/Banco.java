package principal.db;

import java.util.List;

import principal.modelos.Cliente;
import principal.modelos.Pedido;
import principal.modelos.Produto;
import principal.modelos.Usuario;

public interface Banco {
	
	public enum Tipo{
		MEMORIA,
		ARQUIVO
	}

	List<Cliente> getClientes();

	List<Usuario> getUsuarios();

	List<Produto> getProdutos();

	List<Pedido> getPedidos();

}

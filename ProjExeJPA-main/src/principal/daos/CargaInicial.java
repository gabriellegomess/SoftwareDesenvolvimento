package principal.daos;

import principal.modelos.Cliente;
import principal.modelos.Pedido;
import principal.modelos.Produto;
import principal.modelos.Usuario;
import principal.modelos.Pedido.Status;

public class CargaInicial {

	public static void rodar() {
		
		DAO<Cliente> daoCliente = new ClienteDAO();
		Cliente cliente = daoCliente.salvar(new Cliente("Pedro", "123456", 10000.0));
		daoCliente.salvar(new Cliente("Ana", "123455", 4000.0));
		
		DAO<Usuario> daoUsuario = new UsuarioDAO();
		Usuario usuario = daoUsuario.salvar(new Usuario("Carlos", "2324434", "login", "senha"));
		daoUsuario.salvar(new Usuario("Joana", "454545", "login", "senha"));

		DAO<Produto> daoProduto = new ProdutoDAO();
		Produto pro1 = daoProduto.salvar(new Produto("TV", 3000.0));
		Produto pro2 = daoProduto.salvar(new Produto("Computador", 5000.0));

		DAO<Pedido> daoPedido = new PedidoDAO();
		Pedido pedido = new Pedido(usuario);
		pedido.setCliente(cliente);
		pedido.adicionar(pro1);
		pedido.adicionar(pro2);
		pedido.setStatus(Status.CONCLUIDO);
		daoPedido.salvar(pedido);
	}
}
package principal.db;

import java.util.ArrayList;
import java.util.List;

import principal.modelos.Cliente;
import principal.modelos.Pedido;
import principal.modelos.Pedido.Status;
import principal.modelos.Produto;
import principal.modelos.Usuario;

/**
 * @version 1.0 Abr 2023
 * @author Geucimar Briatore
 *
 *         A classe BancoEmMemoria é responsável por gerar e manter os dados em
 *         memória durante a execução do programa.
 */
public class BancoEmMemoria implements Banco {

	private List<Cliente> clientes = new ArrayList<>();
	private List<Usuario> usuarios = new ArrayList<>();
	private List<Produto> produtos = new ArrayList<>();
	private List<Pedido> pedidos = new ArrayList<>();

	public BancoEmMemoria() {

		Cliente cliente = new Cliente("Pedro", "123456", 10000.0);
		clientes.add(cliente);
		clientes.add(new Cliente("Ana", "123455", 4000.0));

		Usuario usuario = new Usuario("Carlos", "2324434", "login", "senha");
		usuarios.add(usuario);
		usuarios.add(new Usuario("Joana", "454545", "login", "senha"));

		Produto produto = new Produto("TV", 3000.0);
		produtos.add(produto);
		produtos.add(new Produto("Computador", 5000.0));

		Pedido pedido = new Pedido(usuario);
		pedido.setCliente(cliente);
		pedido.adicionar(produto);
		pedido.setStatus(Status.CONCLUIDO);
		pedidos.add(pedido);
	}

	@Override
	public List<Cliente> getClientes() {
		return clientes;
	}

	@Override
	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	@Override
	public List<Produto> getProdutos() {
		return produtos;
	}

	@Override
	public List<Pedido> getPedidos() {
		return pedidos;
	}
}

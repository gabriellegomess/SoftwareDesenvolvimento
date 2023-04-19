package principal.db;

import java.util.ArrayList;
import java.util.List;

import principal.controles.ControleDePedidos;
import principal.modelos.Cliente;
import principal.modelos.Pedido;
import principal.modelos.Pedido.Status;
import principal.modelos.Produto;
import principal.modelos.Usuario;

/**
 * @version 1.0 Abr 2023
 * @author Geucimar Briatore
 *
 * A classse banco de dados é responsável por gerar e manter os dados
 * em memória durante a execução do programa.
 */
public class BancoDeDados {

	private List<Cliente> clientes;
	private List<Usuario> usuarios;
	private List<Produto> produtos;
	private List<Pedido> pedidos;

	public BancoDeDados() {

		//Popula uma lista de clientes
		clientes = new ArrayList<>();
		Cliente cliente = new Cliente("Pedro", "123456", 10000.0);
		clientes.add(cliente);
		clientes.add(new Cliente("Ana", "123455", 4000.0));

		//Popula uma lista de usuários
		usuarios = new ArrayList<>();
		Usuario usuario = new Usuario("Carlos", "2324434", "login", "senha");
		usuarios.add(usuario);
		usuarios.add(new Usuario("Joana", "454545", "login", "senha"));

		//Popula uma lista de produtos
		produtos = new ArrayList<>();
		Produto produto = new Produto("TV", 3000.0);
		produtos.add(produto);
		produtos.add(new Produto("Computador", 5000.0));
		
		//Popula uma lista de pedidos
		pedidos = new ArrayList<>();
		Integer codigo = ControleDePedidos.getNovoCodigo();
		Pedido pedido = new Pedido(codigo, usuario);
		pedido.setCliente(cliente);
		pedido.adicionar(produto);
		pedido.setStatus(Status.CONCLUIDO);
		pedidos.add(pedido);	
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
}

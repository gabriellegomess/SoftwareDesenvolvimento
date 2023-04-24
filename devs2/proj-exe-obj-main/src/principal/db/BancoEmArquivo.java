package principal.db;

import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.BufferedWriter;
import java.util.Scanner;

import principal.modelos.Cliente;
import principal.modelos.Pedido;
import principal.modelos.Produto;
import principal.modelos.Usuario;
import principal.util.Prompt;

/**
 * @version 1.0 Abr 2023
 * @author Geucimar Briatore
 *
 *         A classse BancoEmArquivo é responsável por carregar dados  
 *         de arquivos de textos, mantê-los em memória durante a execução do 
 *         programa e gravá-los em arquivos quando solicitado.
 */
public class BancoEmArquivo implements Banco {

	public List<Cliente> clientes = new ArrayList<>();
	public List<Usuario> usuarios = new ArrayList<>();
	public List<Produto> produtos = new ArrayList<>();
	public List<Pedido> pedidos = new ArrayList<>();

	public BancoEmArquivo() {
		carregarArquivos();
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
	
	private void carregarArquivos() {

		String pathRaiz = System.getProperty("user.dir");
		String pathDoArquivo = pathRaiz + "/src/principal/db/clientes.csv";
		File arquivo = new File(pathDoArquivo);

		Scanner leitor = null;
		try {
			leitor = new Scanner(arquivo);
			while (leitor.hasNextLine()) {
				String linha = leitor.nextLine();
				String[] dados = linha.split(";");
				Cliente cliente = popularCliente(dados);
				clientes.add(cliente);
			}
		} catch (FileNotFoundException e) {
			Prompt.imprimir("Arquivo de clientes não encontrado!");
		}

		pathDoArquivo = pathRaiz + "/src/principal/db/produtos.csv";
		arquivo = new File(pathDoArquivo);

		try {
			leitor = new Scanner(arquivo);
			while (leitor.hasNextLine()) {
				String linha = leitor.nextLine();
				String[] dados = linha.split(";");
				Produto produto = popularProduto(dados);
				produtos.add(produto);
			}
		} catch (FileNotFoundException e) {
			Prompt.imprimir("Arquivo de produtos não encontrado!");
		}

		pathDoArquivo = pathRaiz + "/src/principal/db/usuarios.csv";
		arquivo = new File(pathDoArquivo);

		try {
			leitor = new Scanner(arquivo);
			while (leitor.hasNextLine()) {
				String linha = leitor.nextLine();
				String[] dados = linha.split(";");
				Usuario usuario = popularUsuario(dados);
				usuarios.add(usuario);
			}
		} catch (FileNotFoundException e) {
			Prompt.imprimir("Arquivo de usuários não encontrado!");
		}

		pathDoArquivo = pathRaiz + "/src/principal/db/pedidos.csv";
		arquivo = new File(pathDoArquivo);

		try {
			leitor = new Scanner(arquivo);
			while (leitor.hasNextLine()) {
				String linha = leitor.nextLine();
				String[] dados = linha.split(";");
				Pedido pedido = popularPedido(dados);
				pedidos.add(pedido);
			}
		} catch (FileNotFoundException e) {
			Prompt.imprimir("Arquivo de pedidos não encontrado!");
		}
		if (leitor != null) {
			leitor.close();
		}
	}

	private Pedido popularPedido(String[] dados) {
		Pedido pedido = new Pedido();
		pedido.setCodigo(Integer.parseInt(dados[0]));
		pedido.setStatus(Pedido.Status.valueOf(dados[1]));
		pedido.setData(carregarData(dados[2]));
		pedido.setTotal(Double.parseDouble(dados[3]));
		pedido.setCliente(carregarCliente(dados[4]));
		pedido.setVendedor(carregarVendedor(dados[5]));
		pedido.setProdutos(carregarProdutos(dados[6]));
		return pedido;
	}

	private LocalDateTime carregarData(String str) {
		var df = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		return LocalDateTime.parse(str, df);
	}

	private Cliente carregarCliente(String str) {
		return popularCliente(aparar(str).split(","));
	}

	private Cliente popularCliente(String[] dados) {
		Cliente cliente = new Cliente();
		cliente.setNome(dados[0]);
		cliente.setCPF(dados[1]);
		cliente.setCredito(Double.parseDouble(dados[2]));
		return cliente;
	}

	private Usuario carregarVendedor(String str) {
		return popularVendedor(aparar(str).split(","));
	}

	private Usuario popularVendedor(String[] dados) {
		Usuario usuario = new Usuario();
		usuario.setNome(dados[0]);
		usuario.setCPF(dados[1]);
		usuario.setLogin(dados[2]);
		usuario.setSenha(dados[3]);
		return usuario;
	}

	private List<Produto> carregarProdutos(String str) {
		List<Produto> produtos = new ArrayList<>();
		String[] objetos = aparar(str).split("&");
		for (String objeto : objetos) {
			produtos.add(popularProduto(aparar(objeto).split(",")));
		}
		return produtos;
	}

	private Produto popularProduto(String[] dados) {
		Produto produto = new Produto();
		produto.setNome(dados[0]);
		produto.setPreco(Double.parseDouble(dados[1]));
		return produto;
	}

	private Usuario popularUsuario(String[] dados) {
		Usuario usuario = new Usuario();
		usuario.setNome(dados[0]);
		usuario.setCPF(dados[1]);
		usuario.setLogin(dados[2]);
		usuario.setSenha(dados[3]);
		return usuario;
	}

	private String aparar(String str) {
		return str.substring(1, str.length() - 1);
	}

	public void gravarArquivos() {
		String pathRaiz = System.getProperty("user.dir");
		String pathDoArquivo = pathRaiz + "/src/principal/db/produtos.csv";
		File arquivo = new File(pathDoArquivo);

		try {
			var gravador = new BufferedWriter(new FileWriter(arquivo));
			for (Produto produto : produtos) {
				gravador.append(produto.toCSV() + "\n");
			}	
			gravador.close();
		} catch (IOException e) {
			Prompt.imprimir("Falha ao gravar os dados de produtos!");
		}
		
		pathDoArquivo = pathRaiz + "/src/principal/db/clientes.csv";
		arquivo = new File(pathDoArquivo);
		
		try {
			var gravador = new BufferedWriter(new FileWriter(arquivo));
			for (Cliente cliente : clientes) {
				gravador.append(cliente.toCSV() + "\n");
			}	
			gravador.close();
		} catch (IOException e) {
			Prompt.imprimir("Falha ao gravar os dados de clientes!");
		}
		
		pathDoArquivo = pathRaiz + "/src/principal/db/usuarios.csv";
		arquivo = new File(pathDoArquivo);
		
		try {
			var gravador = new BufferedWriter(new FileWriter(arquivo));
			for (Usuario usuario : usuarios) {
				gravador.append(usuario.toCSV() + "\n");
			}	
			gravador.close();
		} catch (IOException e) {
			Prompt.imprimir("Falha ao gravar os dados de usuários!");
		}
		
		pathDoArquivo = pathRaiz + "/src/principal/db/pedidos.csv";
		arquivo = new File(pathDoArquivo);
		
		try {
			var gravador = new BufferedWriter(new FileWriter(arquivo));
			for (Pedido pedido : pedidos) {
				gravador.append(pedido.toCSV() + "\n");
			}	
			gravador.close();
		} catch (IOException e) {
			Prompt.imprimir("Falha ao gravar os dados de usuários!");
		}
	}
}
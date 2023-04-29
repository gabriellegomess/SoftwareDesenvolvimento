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

import principal.controles.ControleDePedidos;
import principal.modelos.Cliente;
import principal.modelos.Pedido;
import principal.modelos.Produto;
import principal.modelos.Usuario;
import principal.util.Prompt;
import principal.modelos.Pedido.Status;

/**
 * @version 1.0 Abr 2023
 * @author Geucimar Briatore
 *
 *         A classse banco é responsável por gerar dados temporários em memória
 *         ou carregar dados permanentes de arquivos de textos, mantê-los em
 *         memória durante a execução do programa e gravá-los em arquivos quando
 *         solicitado.
 */
public class Banco {

	public static List<Cliente> clientes = new ArrayList<>();
	public static List<Usuario> usuarios = new ArrayList<>();
	public static List<Produto> produtos = new ArrayList<>();
	public static List<Pedido> pedidos = new ArrayList<>();

	public static void gerarDadosTemporarios() {

		Cliente cliente = new Cliente("Pedro", "123456", 10000.0);
		clientes.add(cliente);
		clientes.add(new Cliente("Ana", "123455", 4000.0));

		Usuario usuario = new Usuario("Carlos", "2324434", "login", "senha");
		usuarios.add(usuario);
		usuarios.add(new Usuario("Joana", "454545", "login", "senha"));

		Produto produto = new Produto("TV", 3000.0);
		produtos.add(produto);
		produtos.add(new Produto("Computador", 5000.0));

		Integer codigo = ControleDePedidos.getNovoCodigo();
		Pedido pedido = new Pedido(codigo, usuario);
		pedido.cliente = cliente;
		pedido.adicionar(produto);
		pedido.status = Status.CONCLUIDO;
		pedidos.add(pedido);
	}

	public static void carregarArquivos() {

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

	private static Pedido popularPedido(String[] dados) {
		Pedido pedido = new Pedido();
		pedido.codigo = Integer.parseInt(dados[0]);
		pedido.status = Pedido.Status.valueOf(dados[1]);
		pedido.data = carregarData(dados[2]);
		pedido.total = Double.parseDouble(dados[3]);
		pedido.cliente = carregarCliente(dados[4]);
		pedido.vendedor = carregarVendedor(dados[5]);
		pedido.produtos = carregarProdutos(dados[6]);
		return pedido;
	}

	private static LocalDateTime carregarData(String str) {
		var df = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		return LocalDateTime.parse(str, df);
	}

	private static Cliente carregarCliente(String str) {
		return popularCliente(aparar(str).split(","));
	}

	private static Cliente popularCliente(String[] dados) {
		Cliente cliente = new Cliente();
		cliente.nome = dados[0];
		cliente.CPF = dados[1];
		cliente.credito = Double.parseDouble(dados[2]);
		return cliente;
	}

	private static Usuario carregarVendedor(String str) {
		return popularVendedor(aparar(str).split(","));
	}

	private static Usuario popularVendedor(String[] dados) {
		Usuario usuario = new Usuario();
		usuario.nome = dados[0];
		usuario.CPF = dados[1];
		usuario.login = dados[2];
		usuario.senha = dados[3];
		return usuario;
	}

	private static List<Produto> carregarProdutos(String str) {
		List<Produto> produtos = new ArrayList<>();
		String[] objetos = aparar(str).split("&");
		for (String objeto : objetos) {
			produtos.add(popularProduto(aparar(objeto).split(",")));
		}
		return produtos;
	}

	private static Produto popularProduto(String[] dados) {
		Produto produto = new Produto();
		produto.nome = dados[0];
		produto.preco = Double.parseDouble(dados[1]);
		return produto;
	}

	private static Usuario popularUsuario(String[] dados) {
		Usuario usuario = new Usuario();
		usuario.nome = dados[0];
		usuario.CPF = dados[1];
		usuario.login = dados[2];
		usuario.senha = dados[3];
		return usuario;
	}

	private static String aparar(String str) {
		return str.substring(1, str.length() - 1);
	}

	public static void gravarArquivos() {
		String pathRaiz = System.getProperty("user.dir");
		String pathDoArquivo = pathRaiz + "/src/principal/db/produtos.csv";
		File arquivo = new File(pathDoArquivo);

		try {
			var gravador = new BufferedWriter(new FileWriter(arquivo));
			for (Produto produto : Banco.produtos) {
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
			for (Cliente cliente : Banco.clientes) {
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
			for (Usuario usuario : Banco.usuarios) {
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
			for (Pedido pedido : Banco.pedidos) {
				gravador.append(pedido.toCSV() + "\n");
			}	
			gravador.close();
		} catch (IOException e) {
			Prompt.imprimir("Falha ao gravar os dados de usuários!");
		}
	}
}
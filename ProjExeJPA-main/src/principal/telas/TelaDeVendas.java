package principal.telas;

import java.util.List;

import principal.controles.CadastroDeClientes;
import principal.controles.CadastroDeProdutos;
import principal.modelos.Cliente;
import principal.modelos.Pedido;
import principal.modelos.Produto;
import principal.telas.menus.Menu;
import principal.telas.menus.MenuDeVendas;
import principal.util.Mensagem;
import principal.util.Prompt;

public class TelaDeVendas extends Tela {
	
	private static Tela instance;
	
	private TelaDeVendas() {
		super(Mensagem.TELA_VENDAS, new MenuDeVendas());
	}
	
	private TelaDeVendas(String titulo, Menu menu) {
		super(titulo, menu);
	}
	
	public static synchronized Tela getInstance() {
		if (instance == null) {
			instance = new TelaDeVendas();
		}
		return instance;
	}
	
	public static void mostrarSelecionarCliente() {
		
		CadastroDeClientes cadastro = CadastroDeClientes.getInstance();
		
		Prompt.linhaEmBranco();
		Prompt.imprimir(Mensagem.MSG_LISTA_DE_CLIENTES);
		
		List<Cliente> clientes = cadastro.getClientes();
		
		if (clientes.isEmpty()) {
			Prompt.imprimir(Mensagem.MSG_NENHUM_CLIENTE); 
		} else {
			for (Cliente cliente : clientes) {
				Prompt.imprimir(cliente.toString());
			}
		}
		
		Prompt.linhaEmBranco();
		Long id = (long) Prompt.lerInteiro(Mensagem.MSG_INFORME_ID);		
		
		if (id < 1) {
			new TelaDeVendas().mostrar();
		} else {
			Cliente cliente = cadastro.buscar(id);
			
			if (cliente != null) {
				Pedido.emMemoria.setCliente(cliente);
				Prompt.linhaEmBranco();
				Prompt.imprimir(Mensagem.MSG_CLIENTE_SELECIONADO);
				Prompt.linhaEmBranco();
				Prompt.pressionarEnter();
				new TelaDeVendas().mostrar();
			} else {
				Prompt.linhaEmBranco();
				Prompt.imprimir(Mensagem.MSG_CLIENTE_NAO_ENCONTRADO);
				Prompt.linhaEmBranco();
				Prompt.pressionarEnter();
				TelaDeVendas.mostrarSelecionarCliente();
			}
		}
	}
	
	public static void mostrarSelecionarProdutos() {
	
		CadastroDeProdutos cadastro = CadastroDeProdutos.getInstance();
		
		Prompt.linhaEmBranco();
		Prompt.imprimir(Mensagem.MSG_LISTA_DE_PRODUTOS);
		
		List<Produto> produtos = cadastro.getProdutos();
		
		if (produtos.isEmpty()) {
			Prompt.imprimir(Mensagem.MSG_NENHUM_PRODUTO); 
		} else {
			for (Produto produto : produtos) {
				Prompt.imprimir(produto.toString());
			}
		}
		
		Prompt.linhaEmBranco();
		Long id = (long) Prompt.lerInteiro(Mensagem.MSG_INFORME_ID);		
		
		if (id < 1) {
			new TelaDeVendas().mostrar();
		} else {
			Produto produto = cadastro.buscar(id);
			
			if (produto != null) {
				Pedido.emMemoria.adicionar(produto);
				Prompt.linhaEmBranco();
				Prompt.imprimir(Mensagem.MSG_PRODUTO_SELECIONADO);
				Prompt.linhaEmBranco();
				Prompt.imprimir(Mensagem.MSG_SELECIONAR_MAIS);
				Prompt.imprimir(Mensagem.MSG_SIM);
				Prompt.imprimir(Mensagem.MSG_NAO);
				int opcao = Prompt.lerInteiro();
				if (opcao == 1) {
					TelaDeVendas.mostrarSelecionarProdutos();
				} else {
					new TelaDeVendas().mostrar();
				}
			} else {
				Prompt.linhaEmBranco();
				Prompt.imprimir(Mensagem.MSG_PRODUTO_NAO_ENCONTRADO);
				Prompt.linhaEmBranco();
				Prompt.pressionarEnter();
				TelaDeVendas.mostrarSelecionarProdutos();
			}
		}
	}
}
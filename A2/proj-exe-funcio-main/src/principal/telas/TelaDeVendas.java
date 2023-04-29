package principal.telas;

import principal.controles.CadastroDeClientes;
import principal.controles.CadastroDeProdutos;
import principal.controles.ControleDePedidos;
import principal.db.Banco;
import principal.modelos.Cliente;
import principal.modelos.Pedido;
import principal.modelos.Produto;
import principal.modelos.Pedido.Status;
import principal.util.Mensagem;
import principal.util.Prompt;

public class TelaDeVendas {

	public static void mostrar() {

		Prompt.linhaEmBranco();
		Prompt.imprimir(Mensagem.TELA_VENDAS);

		Pedido pedido = ControleDePedidos.pedido;
		if (pedido == null) {
			pedido = new Pedido();
		} else {
			Prompt.linhaEmBranco();
			Prompt.separador();
			Prompt.imprimir(Mensagem.MSG_PEDIDO_MONTAGEM);
			
			if (pedido.cliente != null) {
				Prompt.imprimir(pedido.cliente);
			}
			
			for (Produto produto : pedido.produtos) {
				Prompt.imprimir(produto);
			}
			Prompt.separador();
		}
		ControleDePedidos.pedido = pedido;

		Prompt.imprimir(Mensagem.MSG_ESCOLHA);
		Prompt.imprimir("[1] " + Mensagem.MENU_SELECIONAR_CLIENTE);
		Prompt.imprimir("[2] " + Mensagem.MENU_SELECIONAR_PRODUTOS);
		Prompt.imprimir("[3] " + Mensagem.MENU_FINALIZAR_VENDA);
		Prompt.imprimir("[4] " + Mensagem.MENU_VOLTAR);

		Integer opcao = Prompt.lerInteiro();

		switch (opcao) {
			case 1: {
				TelaDeVendas.selecionarCliente();
				break;
			}
			case 2: {
				TelaDeVendas.selecionarProdutos();
				break;
			}
			case 3: {
				TelaDeVendas.finalizarVenda();
				break;
			}
			case 4: {
				TelaPrincipal.mostrar();
				break;
			}
		}
	}

	private static void selecionarCliente() {

		Prompt.linhaEmBranco();
		Prompt.imprimir(Mensagem.MSG_LISTA_DE_CLIENTES);

		if (Banco.clientes.isEmpty()) {
			Prompt.imprimir(Mensagem.MSG_NENHUM_CLIENTE);
		} else {
			for (Cliente cliente : Banco.clientes) {
				Prompt.imprimir(cliente);
			}
		}

		Prompt.linhaEmBranco();
		String nome = Prompt.lerLinha(Mensagem.MSG_INFORME_NOME);

		if (!nome.isEmpty()) {
			Cliente cliente = CadastroDeClientes.buscar(nome);
	
			Prompt.linhaEmBranco();
			if (cliente != null) {
				ControleDePedidos.pedido.cliente = cliente;
				Prompt.imprimir(Mensagem.MSG_CLIENTE_SELECIONADO);
			} else {
				Prompt.linhaEmBranco();
				Prompt.imprimir(Mensagem.MSG_CLIENTE_NAO_ENCONTRADO);
			}
			Prompt.linhaEmBranco();
			Prompt.pressionarEnter();
		}
		TelaDeVendas.mostrar();
	}

	private static void selecionarProdutos() {

		Prompt.linhaEmBranco();
		Prompt.imprimir(Mensagem.MSG_LISTA_DE_PRODUTOS);
		
		if (Banco.produtos.isEmpty()) {
			Prompt.imprimir(Mensagem.MSG_NENHUM_PRODUTO); 
		} else {
			for (Produto produto : Banco.produtos) {
				Prompt.imprimir(produto);
			}
		}
		
		Prompt.linhaEmBranco();
		String nome = Prompt.lerLinha(Mensagem.MSG_INFORME_NOME);	
		
		if (!nome.isEmpty()) {
			Produto produto = CadastroDeProdutos.buscar(nome);
			
			if (produto != null) {
				ControleDePedidos.adicionar(produto);
				Prompt.linhaEmBranco();
				Prompt.imprimir(Mensagem.MSG_PRODUTO_SELECIONADO);
				Prompt.linhaEmBranco();
				Prompt.imprimir(Mensagem.MSG_SELECIONAR_MAIS);
				Prompt.imprimir(Mensagem.MSG_SIM);
				Prompt.imprimir(Mensagem.MSG_NAO);
				int opcao = Prompt.lerInteiro();
				if (opcao == 1) {
					TelaDeVendas.selecionarProdutos();
				}
			} else {
				Prompt.linhaEmBranco();
				Prompt.imprimir(Mensagem.MSG_PRODUTO_NAO_ENCONTRADO);
				Prompt.linhaEmBranco();
				Prompt.pressionarEnter();
			}
		}
		TelaDeVendas.mostrar();
	}

	private static void finalizarVenda() {
		Pedido pedido = ControleDePedidos.pedido;
		pedido.status = Status.CONCLUIDO;
		ControleDePedidos.adicionar(pedido);
		ControleDePedidos.pedido = null;
		TelaDePedidos.listar();
	}
}
package principal.telas.menus;

import java.util.List;

import principal.controles.ControleDePedidos;
import principal.modelos.Cliente;
import principal.modelos.Pedido;
import principal.modelos.Pedido.Status;
import principal.modelos.Produto;
import principal.telas.Comando;
import principal.telas.TelaDePedidos;
import principal.telas.TelaPrincipal;
import principal.telas.TelaDeVendas;
import principal.util.Mensagem;
import principal.util.Prompt;
import principal.util.Session;

public class MenuDeVendas extends Menu {
	
	public MenuDeVendas() {
		
		Pedido pedido;
		if (Session.pedido == null) {
			Session.pedido = new Pedido();
		} else {
			pedido = Session.pedido;
			Prompt.linhaEmBranco();
			Prompt.separador();
			Prompt.imprimir(Mensagem.MSG_PEDIDO_MONTAGEM);
			Cliente cliente = pedido.getCliente();
			if (cliente != null) {
				Prompt.imprimir(cliente);
			}
			List<Produto> produtos = pedido.getProdutos();
			for (Produto produto : produtos) {
				Prompt.imprimir(produto);
			}
			Prompt.separador();
		}

		adicionar(1, Mensagem.MENU_SELECIONAR_CLIENTE, new Comando() {
			public void executar() {
				TelaDeVendas.mostrarSelecionarCliente();				
			}
		});
		
		adicionar(2, Mensagem.MENU_SELECIONAR_PRODUTOS, new Comando() {
			public void executar() {
				TelaDeVendas.mostrarSelecionarProdutos();			
			}
		});
		
		adicionar(3, Mensagem.MENU_FINALIZAR_VENDA, new Comando() {
			public void executar() {
				Pedido pedido = Session.pedido;
				pedido.setStatus(Status.CONCLUIDO);
				ControleDePedidos controle = new ControleDePedidos();
				controle.adicionar(pedido);
				Session.pedido = null;
				new TelaDePedidos().mostrar();
			}
		});
		
		adicionar(4, Mensagem.MENU_VOLTAR, new Comando() {
			public void executar() {
				Session.pedido = null;
				new TelaPrincipal().mostrar();			
			}
		});
	}
}
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

public class MenuDeVendas extends Menu {
	
	private ControleDePedidos controle = ControleDePedidos.getInstance();
	
	public MenuDeVendas() {
		
		if (Pedido.emMemoria == null) {
			Pedido.emMemoria = new Pedido();
		} else {
			Prompt.linhaEmBranco();
			Prompt.separador();
			Prompt.imprimir(Mensagem.MSG_PEDIDO_MONTAGEM);
			Cliente cliente = Pedido.emMemoria.getCliente();
			if (cliente != null) {
				Prompt.imprimir(cliente);
			}
			List<Produto> produtos = Pedido.emMemoria.getProdutos();
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
				Pedido pedido = Pedido.emMemoria;
				pedido.setStatus(Status.CONCLUIDO);
				controle.adicionar(pedido);
				Pedido.emMemoria = null;
				TelaDePedidos.getInstance().listarPedidos();
			}
		});
		
		adicionar(4, Mensagem.MENU_VOLTAR, new Comando() {
			public void executar() {
				Pedido.emMemoria = null;
				TelaPrincipal.getInstance().mostrar();			
			}
		});
	}
}
package principal.telas.menus;

import java.util.List;

import principal.controles.ControleDePedidos;
import principal.modelos.Pedido;
import principal.modelos.Pedido.Status;
import principal.telas.Comando;
import principal.telas.TelaDePedidos;
import principal.telas.TelaPrincipal;
import principal.util.Mensagem;
import principal.util.Prompt;

public class MenuDePedidos extends Menu {
	
	private ControleDePedidos controle = ControleDePedidos.getInstance();
	
	public Comando listarPedidos() {
		return new Comando() {
			public void executar() {
				Prompt.linhaEmBranco();
				Prompt.imprimir(Mensagem.MSG_LISTA_DE_PEDIDOS);
				
				List<Pedido> pedidos = controle.getPedidos();
				if (pedidos.isEmpty()) {
					Prompt.imprimir(Mensagem.MSG_NENHUM_PEDIDO); 
				} else {
					for (Pedido pedido : pedidos) {
						Prompt.imprimir(pedido.toString());
					}
				}
				
				Prompt.linhaEmBranco();
				Prompt.pressionarEnter();
				TelaDePedidos.getInstance().mostrar();
			}
		};
	}
	
	public MenuDePedidos() {
		
		adicionar(1, Mensagem.MENU_LISTAR_PEDIDOS, listarPedidos());
		
		adicionar(2, Mensagem.MENU_CANCELAR_PEDIDO, new Comando() {
			public void executar() {
				
				Prompt.linhaEmBranco();
				Prompt.imprimir(Mensagem.MSG_LISTA_DE_PEDIDOS);
				Prompt.imprimir(Mensagem.MSG_ESCOLHA);
				List<Pedido> pedidos = controle.getPedidos();
				if (pedidos.isEmpty()) {
					Prompt.imprimir(Mensagem.MSG_NENHUM_PEDIDO); 
				} else {
					for (Pedido pedido : pedidos) {
						Prompt.imprimir("[" + pedido.getCodigo() + "] " + pedido.toString());
					}
				}
				Prompt.linhaEmBranco();
				Integer codigo = Prompt.lerInteiro(Mensagem.MSG_INFORME_CODIGO);
				
				if (codigo > 0) {
					Pedido pedidoCancelar = controle.buscar(codigo);
				
					if (pedidoCancelar != null) {
						pedidoCancelar.setStatus(Status.CANCELADO);
						controle.cancelar(codigo, pedidoCancelar);
						Prompt.linhaEmBranco();
						Prompt.imprimir(Mensagem.MSG_PEDIDO_CANCELADO);
					} else {
						Prompt.linhaEmBranco();
						Prompt.imprimir(Mensagem.MSG_PEDIDO_NAO_ENCONTRADO);
					}
					Prompt.linhaEmBranco();
					Prompt.pressionarEnter();
				}
				listarPedidos().executar();
			}
		});
		
		adicionar(3, Mensagem.MENU_VOLTAR, new Comando() {
			public void executar() {
				TelaPrincipal.getInstance().mostrar();			
			}
		});
	}
}
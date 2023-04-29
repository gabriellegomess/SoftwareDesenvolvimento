package principal.telas;

import principal.controles.ControleDePedidos;
import principal.db.Banco;
import principal.modelos.Pedido;
import principal.modelos.Pedido.Status;
import principal.util.Mensagem;
import principal.util.Prompt;

public class TelaDePedidos {
	
	public static void mostrar() {
		
		Prompt.linhaEmBranco();
		Prompt.imprimir(Mensagem.TELA_PEDIDOS);
		
		Prompt.imprimir(Mensagem.MSG_ESCOLHA);
		Prompt.imprimir("[1] " + Mensagem.MENU_LISTAR_PEDIDOS);
		Prompt.imprimir("[2] " + Mensagem.MENU_CANCELAR_PEDIDO);
		Prompt.imprimir("[3] " + Mensagem.MENU_VOLTAR);
		
		Integer opcao = Prompt.lerInteiro();

		switch (opcao) {
			case 1: {
				TelaDePedidos.listar();
				break;
			}
			case 2: {
				TelaDePedidos.cancelar();
				break;
			}
			case 3: {
				TelaPrincipal.mostrar();
				break;
			}
		}
	}

	public static void listar() {

		Prompt.linhaEmBranco();
		Prompt.imprimir(Mensagem.MSG_LISTA_DE_PEDIDOS);
		
		if (Banco.pedidos.isEmpty()) {
			Prompt.imprimir(Mensagem.MSG_NENHUM_PEDIDO); 
		} else {
			for (Pedido pedido : Banco.pedidos) {
				Prompt.imprimir(pedido.toString());
			}
		}
		
		Prompt.linhaEmBranco();
		Prompt.pressionarEnter();
		TelaDePedidos.mostrar();
	}

	private static void cancelar() {

		Prompt.linhaEmBranco();
		Prompt.imprimir(Mensagem.MSG_LISTA_DE_PEDIDOS);
		Prompt.imprimir(Mensagem.MSG_ESCOLHA);
		if (Banco.pedidos.isEmpty()) {
			Prompt.imprimir(Mensagem.MSG_NENHUM_PEDIDO); 
		} else {
			for (Pedido pedido : Banco.pedidos) {
				Prompt.imprimir("[" + pedido.codigo + "] " + pedido.toString());
			}
		}
		Prompt.linhaEmBranco();
		Integer codigo = Prompt.lerInteiro(Mensagem.MSG_INFORME_CODIGO);
		
		if (codigo > 0) {
			Pedido pedidoCancelar = ControleDePedidos.buscar(codigo);
			
			Prompt.linhaEmBranco();
			if (pedidoCancelar != null) {
				pedidoCancelar.status = Status.CANCELADO;
				ControleDePedidos.cancelar(codigo, pedidoCancelar);
				Prompt.imprimir(Mensagem.MSG_PEDIDO_CANCELADO);
			} else {
				Prompt.imprimir(Mensagem.MSG_PEDIDO_NAO_ENCONTRADO);
			}
			Prompt.linhaEmBranco();
			Prompt.pressionarEnter();
		}
		TelaDePedidos.listar();
	}
}
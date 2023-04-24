package principal.telas;

import principal.util.Mensagem;
import principal.util.Prompt;

public class TelaPrincipal {
	
	public static void mostrar() {
		
		Prompt.linhaEmBranco();
		Prompt.imprimir(Mensagem.TELA_PRINCIPAL);
		Prompt.imprimir(Mensagem.MSG_ESCOLHA);
		Prompt.imprimir("[1] " + Mensagem.MENU_CADASTROS);
		Prompt.imprimir("[2] " + Mensagem.MENU_CONTROLE_PEDIDOS);
		Prompt.imprimir("[3] " + Mensagem.MENU_VENDAS);
		Prompt.imprimir("[4] " + Mensagem.MENU_SAIR);
		
		Integer opcao = Prompt.lerInteiro();
		
		switch (opcao) {
			case 1: {
				TelaDeCadastros.mostrar();	
				break;
			}
			case 2: {
				TelaDePedidos.mostrar();
				break;
			}
			case 3: {
				TelaDeVendas.mostrar();
				break;
			}
			case 4: {
				Prompt.linhaEmBranco();
				Prompt.imprimir(Mensagem.MSG_PROGRAMA_ENCERRADO);	
				break;
			}
		}
	}
}

package principal.telas;

import principal.util.Mensagem;
import principal.util.Prompt;

public class TelaDeCadastros {
	
	public static void mostrar() {
		
		Prompt.linhaEmBranco();
		Prompt.imprimir(Mensagem.TELA_CADASTROS);
		Prompt.imprimir(Mensagem.MSG_ESCOLHA);
		Prompt.imprimir("[1] " + Mensagem.MENU_CADASTRO_DE_PRODUTOS);
		Prompt.imprimir("[2] " + Mensagem.MENU_CADASTRO_DE_CLIENTES);
		Prompt.imprimir("[3] " + Mensagem.MENU_CADASTRO_DE_USUARIOS);
		Prompt.imprimir("[4] " + Mensagem.MENU_VOLTAR);
		
		Integer opcao = Prompt.lerInteiro();
		
		switch (opcao) {
			case 1: {
				TelaDeProdutos.mostrar();
				break;
			}
			case 2: {
				TelaDeClientes.mostrar();
				break;
			}
			case 3: {
				TelaDeUsuarios.mostrar();
				break;
			}
			case 4: {
				TelaPrincipal.mostrar();
				break;
			}
		}
	}
}
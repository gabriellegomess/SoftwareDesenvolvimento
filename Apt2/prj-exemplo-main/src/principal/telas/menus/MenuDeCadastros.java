package principal.telas.menus;

import principal.telas.Comando;
import principal.telas.TelaDeCadastros;
import principal.telas.TelaPrincipal;
import principal.util.Mensagem;

public class MenuDeCadastros extends Menu {
	
	public MenuDeCadastros() {

		adicionar(1, Mensagem.MENU_CADASTRAR_PRODUTO, new Comando() {
			public void executar() {
				TelaDeCadastros.mostrarCadastroDeProdutos();		
			}
		});
		
		adicionar(2, Mensagem.MENU_CADASTRAR_CLIENTE, new Comando() {
			public void executar() {
				TelaDeCadastros.mostrarCadastroDeClientes();			
			}
		});
		
		adicionar(3, Mensagem.MENU_CADASTRAR_USUARIO, new Comando() {
			public void executar() {
				TelaDeCadastros.mostrarCadastroDeUsuarios();			
			}
		});
		
		adicionar(4, Mensagem.MENU_VOLTAR, new Comando() {
			public void executar() {
				new TelaPrincipal().mostrar();			
			}
		});
	}
}

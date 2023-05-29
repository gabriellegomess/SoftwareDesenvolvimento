package principal.telas.menus;

import principal.telas.Comando;
import principal.telas.TelaDeCadastros;
import principal.telas.TelaPrincipal;
import principal.util.Mensagem;

public class MenuDeCadastros extends Menu {
	
	public MenuDeCadastros() {

		adicionar(1, Mensagem.MENU_CADASTRO_DE_PRODUTOS, new Comando() {
			public void executar() {
				TelaDeCadastros.mostrarTelaDeCadastroDeProdutos();		
			}
		});
		
		adicionar(2, Mensagem.MENU_CADASTRO_DE_CLIENTES, new Comando() {
			public void executar() {
				TelaDeCadastros.mostrarTelaDeCadastroDeClientes();			
			}
		});
		
		adicionar(3, Mensagem.MENU_CADASTRO_DE_USUARIOS, new Comando() {
			public void executar() {
				TelaDeCadastros.mostrarTelaDeCadastroDeUsuarios();			
			}
		});
		
		adicionar(4, Mensagem.MENU_VOLTAR, new Comando() {
			public void executar() {
				TelaPrincipal.getInstance().mostrar();			
			}
		});
	}
}

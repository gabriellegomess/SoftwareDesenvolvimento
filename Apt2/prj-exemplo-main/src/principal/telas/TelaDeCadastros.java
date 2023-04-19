package principal.telas;

import principal.telas.menus.Menu;
import principal.telas.menus.MenuDeCadastros;
import principal.telas.menus.MenuDeClientes;
import principal.telas.menus.MenuDeProdutos;
import principal.telas.menus.MenuDeUsuarios;
import principal.util.Mensagem;

public class TelaDeCadastros extends Tela {
	
	public TelaDeCadastros() {
		super(Mensagem.TELA_CADASTROS, new MenuDeCadastros());
	}
	
	public TelaDeCadastros(String titulo, Menu menu) {
		super(titulo, menu);
	}

	public static void mostrarCadastroDeProdutos() {
		Menu menu = new MenuDeProdutos();
		new TelaDeCadastros(Mensagem.TELA_CADASTRO_PRODUTO, menu).mostrar();	
	}
	
	public static void mostrarCadastroDeClientes() {
		Menu menu = new MenuDeClientes();
		new TelaDeCadastros(Mensagem.TELA_CADASTRO_CLIENTE, menu).mostrar();	
	}
	
	public static void mostrarCadastroDeUsuarios() {
		Menu menu = new MenuDeUsuarios();
		new TelaDeCadastros(Mensagem.TELA_CADASTRO_USUARIO, menu).mostrar();	
	}
}
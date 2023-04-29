package principal.telas;

import principal.telas.menus.Menu;
import principal.telas.menus.MenuDeCadastros;
import principal.telas.menus.MenuDeClientes;
import principal.telas.menus.MenuDeProdutos;
import principal.telas.menus.MenuDeUsuarios;
import principal.util.Mensagem;

public class TelaDeCadastros extends Tela {

	private static Tela instance;
	private static Tela instanceProdutos;
	private static Tela instanceClientes;
	private static Tela instanceUsuarios;

	private TelaDeCadastros(String titulo, Menu menu) {
		super(titulo, menu);
	}

	public static synchronized Tela getInstance() {
		if (instance == null) {
			instance = new TelaDeCadastros(Mensagem.TELA_CADASTROS, new MenuDeCadastros());
		}
		return instance;
	}

	public static synchronized void mostrarTelaDeCadastroDeProdutos() {
		if (instanceProdutos == null) {
			instanceProdutos = new TelaDeCadastros(Mensagem.TELA_CADASTRO_DE_PRODUTOS, new MenuDeProdutos());
		}
		instanceProdutos.mostrar();
	}

	public static synchronized void mostrarTelaDeCadastroDeClientes() {
		if (instanceClientes == null) {
			instanceClientes = new TelaDeCadastros(Mensagem.TELA_CADASTRO_DE_CLIENTES, new MenuDeClientes());
		}
		instanceClientes.mostrar();
	}

	public static synchronized void mostrarTelaDeCadastroDeUsuarios() {
		if (instanceUsuarios == null) {
			instanceUsuarios = new TelaDeCadastros(Mensagem.TELA_CADASTRO_DE_USUARIOS, new MenuDeUsuarios());
		}
		instanceUsuarios.mostrar();
	}
}
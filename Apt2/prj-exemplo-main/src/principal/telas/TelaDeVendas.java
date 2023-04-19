package principal.telas;

import principal.telas.menus.Menu;
import principal.telas.menus.MenuSelecionarCliente;
import principal.telas.menus.MenuSelecionarProdutos;
import principal.telas.menus.MenuDeVendas;
import principal.util.Mensagem;

public class TelaDeVendas extends Tela {
	
	public TelaDeVendas() {
		super(Mensagem.TELA_VENDAS, new MenuDeVendas());
	}
	
	public TelaDeVendas(String titulo, Menu menu) {
		super(titulo, menu);
	}
	
	public static void mostrarSelecionarCliente() {
		Menu menu = new MenuSelecionarCliente();
		new TelaDeVendas(Mensagem.MENU_SELECIONAR_CLIENTE, menu).mostrar();	
	}
	
	public static void mostrarSelecionarProdutos() {
		Menu menu = new MenuSelecionarProdutos();
		new TelaDeVendas(Mensagem.MENU_SELECIONAR_PRODUTOS, menu).mostrar();	
	}
}
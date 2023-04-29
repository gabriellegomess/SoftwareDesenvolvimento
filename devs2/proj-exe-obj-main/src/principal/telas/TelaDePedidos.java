package principal.telas;

import principal.telas.menus.MenuDePedidos;
import principal.util.Mensagem;

public class TelaDePedidos extends Tela {
	
	private static TelaDePedidos instance;
	
	private TelaDePedidos() {
		super(Mensagem.TELA_PEDIDOS, new MenuDePedidos());
	}
	
	public static synchronized TelaDePedidos getInstance() {
		if (instance == null) {
			instance = new TelaDePedidos();
		}
		return instance;
	}
	
	public void listarPedidos() {
		((MenuDePedidos)menu).listarPedidos().executar();
	}
	
}
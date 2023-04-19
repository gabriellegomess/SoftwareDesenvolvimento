package principal.telas;

import principal.telas.menus.MenuDePedidos;
import principal.util.Mensagem;

public class TelaDePedidos extends Tela {
	
	public TelaDePedidos() {
		super(Mensagem.TELA_PEDIDOS, new MenuDePedidos());
	}
	
}
package principal.telas;

import principal.telas.menus.MenuPrincipal;
import principal.util.Mensagem;

public class TelaPrincipal extends Tela {

	public TelaPrincipal() {
		super(Mensagem.TELA_PRINCIPAL, new MenuPrincipal());	
	}
}
package principal.telas.menus;

import java.util.ArrayList;
import java.util.List;

import principal.telas.Comando;
import principal.telas.TelaDeCadastros;
import principal.telas.TelaDePedidos;
import principal.telas.TelaDeVendas;
import principal.util.Mensagem;
import principal.util.Prompt;

public class MenuPrincipal extends Menu {
	
	private List<ItemMenu> itens = new ArrayList<>();
	
	public MenuPrincipal() {

		adicionar(1, Mensagem.MENU_CADASTROS, new Comando() {
			public void executar() {
				TelaDeCadastros.getInstance().mostrar();			
			}
		});
		
		adicionar(2, Mensagem.MENU_CONTROLE_PEDIDOS, new Comando() {
			public void executar() {
				TelaDePedidos.getInstance().mostrar();
			}
		});
		
		adicionar(3, Mensagem.MENU_VENDAS, new Comando() {
			public void executar() {
				TelaDeVendas.getInstance().mostrar();
			}
		});
		
		adicionar(4, Mensagem.MENU_SAIR, new Comando() {	
			public void executar() {
				Prompt.linhaEmBranco();
				Prompt.imprimir(Mensagem.MSG_PROGRAMA_ENCERRADO);
			}
		});
	}

	public void adicionar(Integer index, String texto, Comando comando) {
		itens.add(new ItemMenu(index, texto, comando));
	}

	public List<ItemMenu> getItens() {
		return itens;
	}
}

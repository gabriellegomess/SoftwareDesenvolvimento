package principal.telas.menus;

import principal.telas.Comando;
import principal.util.Prompt;

public class ItemMenu {
	
	private Integer index;
	private String texto;
	private Comando comando;
	
	public ItemMenu(Integer index, String texto, Comando comando) {
		super();
		this.index = index;
		this.texto = texto;
		this.comando = comando;
	}
	
	public void mostrar() {
		String item = "[" + index + "] " + texto;
		Prompt.imprimir(item);
	}

	public void executar() {
		comando.executar();
	}
}

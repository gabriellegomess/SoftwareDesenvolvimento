package principal;

import principal.db.BancoDeDados;
import principal.telas.*;
import principal.util.Session;

public class Programa {
	
	public static void main(String[] args) {
	
		Session.banco = new BancoDeDados();
		new TelaDeLogin().mostrar();
	}
}

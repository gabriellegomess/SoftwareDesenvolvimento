package principal;

import principal.db.Banco;
import principal.telas.*;

public class Programa {
	
	public static void main(String[] args) {
		
		//Banco.gerarDadosTemporarios();
		//TelaDeLogin.mostrar();
		
		Banco.carregarArquivos();
		TelaDeLogin.mostrar();
		Banco.gravarArquivos();
	}
}

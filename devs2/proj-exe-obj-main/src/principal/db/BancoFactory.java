package principal.db;

import principal.db.Banco.Tipo;

public class BancoFactory {
	
	private static Banco instance;
	private static Tipo tipo = Tipo.ARQUIVO;
	
	private BancoFactory() {}
	
	private static Banco getTipo() {
		if (tipo.equals(Tipo.ARQUIVO)) {
			return new BancoEmArquivo();
		} 
		return new BancoEmMemoria();
	}
	
	public static synchronized Banco getInstance() {
		if (instance == null) {
			instance = getTipo();
		}
		return instance;
	}
}

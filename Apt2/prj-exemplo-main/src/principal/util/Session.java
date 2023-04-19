package principal.util;

import principal.db.BancoDeDados;
import principal.modelos.Pedido;

/**
 * @version 1.0 Abr 2023
 * @author Geucimar Briatore
 *
 * A session é responsável por manter o banco de dados
 * em memória durante a execução do programa.
 */
public class Session {

	public static BancoDeDados banco;
	public static Pedido pedido;
	
}

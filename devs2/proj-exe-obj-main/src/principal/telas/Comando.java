package principal.telas;

/**
 * A interface Commando permite a criação de comandos antecipados
 * que poderão ser executados mais tarde em outros processos.
 * 
 * @see Design pattern Command
 * 
 * @version 1.0 Abr 2023
 * @author Geucimar Briatore
 */
public interface Comando {
	void executar();
}

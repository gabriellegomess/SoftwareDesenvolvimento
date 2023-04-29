package principal.controles;

import principal.db.Banco;
import principal.modelos.Usuario;

public class ControleDeAcesso {
	
	public static Usuario usuarioLogado;
	
	public static boolean isUsuarioLogado() {
		return usuarioLogado != null;
	}
	
	public static void autenticar(String login, String senha) {
		for (Usuario usuario : Banco.usuarios) {
			if (usuario.login.equalsIgnoreCase(login) &&
					usuario.senha.equalsIgnoreCase(senha)) {
				ControleDeAcesso.usuarioLogado = usuario;
				break;
			}
		}
	} 
}

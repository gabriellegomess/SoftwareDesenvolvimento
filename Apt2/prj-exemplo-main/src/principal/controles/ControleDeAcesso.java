package principal.controles;

import java.util.List;

import principal.modelos.Usuario;
import principal.util.Session;

public class ControleDeAcesso {
	
	public static Usuario usuarioLogado;
	
	public static boolean isUsuarioLogado() {
		return usuarioLogado != null;
	}
	
	public static void autenticar(String login, String senha) {
		List<Usuario> usuarios = Session.banco.getUsuarios();
		for (Usuario usuario : usuarios) {
			if (usuario.getLogin().equalsIgnoreCase(login) &&
					usuario.getSenha().equalsIgnoreCase(senha))
			{
				ControleDeAcesso.usuarioLogado = usuario;
				break;
			}
		}
	} 
}

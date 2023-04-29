package principal.controles;

import java.util.List;

import principal.db.BancoFactory;
import principal.modelos.Usuario;

public class ControleDeAcesso {
	
	public static Usuario usuarioLogado;
	
	public static boolean isUsuarioLogado() {
		return usuarioLogado != null;
	}
	
	public static void autenticar(String login, String senha) {
		List<Usuario> usuarios = BancoFactory.getInstance().getUsuarios();
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

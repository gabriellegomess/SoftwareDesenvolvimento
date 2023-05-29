package principal.controles;

import principal.daos.DAO;
import principal.daos.UsuarioDAO;
import principal.modelos.Usuario;

public class ControleDeAcesso {
	
	public static Usuario usuarioLogado;
	
	public static boolean isUsuarioLogado() {
		return usuarioLogado != null;
	}
	
	public static void autenticar(String login, String senha) {
		DAO<Usuario> dao = new UsuarioDAO();
		String query = "from Usuario u where u.login = '" + login + "' and senha='" + senha + "'";
		usuarioLogado = dao.buscarPorQuery(query);
	} 
}

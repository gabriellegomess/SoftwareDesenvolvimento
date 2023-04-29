package principal.controles;

import principal.db.Banco;
import principal.modelos.Usuario;

public class CadastroDeUsuarios {

	public static void adicionar(Usuario usuario) {
		Banco.usuarios.add(usuario);
	}

	public static void atualizar(int indexAlterar, Usuario usuarioAlterado) {
		Banco.usuarios.set(indexAlterar, usuarioAlterado);
	}
	
	public static void atualizar(String nomeOriginal, Usuario usuarioAlterado) {
		for (int i = 0; i < Banco.usuarios.size(); i++) {
			Usuario usuario = Banco.usuarios.get(i);
			if (usuario.nome.equalsIgnoreCase(nomeOriginal)) {
				Banco.usuarios.set(i, usuarioAlterado);
				break;
			}
		}
	}

	public static Usuario buscar(String nome) {
		Usuario usuarioRetorno = null;
		for (Usuario usuario : Banco.usuarios) {
			if (usuario.nome.equalsIgnoreCase(nome)) {
				usuarioRetorno = usuario;
				break;
			}
		}
		return usuarioRetorno;
	}

	public static boolean excluir(String nome) {
		boolean usuarioExcluido = false;
		for (int i = 0; i < Banco.usuarios.size(); i++) {
			Usuario usuario = Banco.usuarios.get(i);
			if (usuario.nome.equalsIgnoreCase(nome)) {
				Banco.usuarios.remove(i);
				usuarioExcluido = true;
				break;
			}
		}
		return usuarioExcluido;
	}
}

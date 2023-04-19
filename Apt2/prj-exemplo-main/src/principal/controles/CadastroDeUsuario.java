package principal.controles;

import java.util.List;

import principal.modelos.Usuario;
import principal.util.Session;

public class CadastroDeUsuario {

	private List<Usuario> usuarios;

	public CadastroDeUsuario() {
		this.usuarios = Session.banco.getUsuarios();
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public void adicionar(Usuario usuario) {
		this.usuarios.add(usuario);
	}

	public void atualizar(int indexAlterar, Usuario usuario) {
		this.usuarios.set(indexAlterar, usuario);
	}

	public Usuario buscar(String nome) {
		Usuario usuarioRetorno = null;
		for (Usuario usuario : usuarios) {
			if (usuario.getNome().equalsIgnoreCase(nome)) {
				usuarioRetorno = usuario;
				break;
			}
		}
		return usuarioRetorno;
	}

	public void atualizar(String nomeOriginal, Usuario usuarioAlterado) {
		for (int i = 0; i < usuarios.size(); i++) {
			Usuario usuario = usuarios.get(i);
			if (usuario.getNome().equalsIgnoreCase(nomeOriginal)) {
				usuarios.set(i, usuarioAlterado);
				break;
			}
		}
	}

	public boolean excluir(String nome) {
		boolean usuarioExcluido = false;
		for (int i = 0; i < usuarios.size(); i++) {
			Usuario usuario = usuarios.get(i);
			if (usuario.getNome().equalsIgnoreCase(nome)) {
				usuarios.remove(i);
				usuarioExcluido = true;
				break;
			}
		}
		return usuarioExcluido;
	}
}

package principal.controles;

import java.util.List;

import principal.daos.DAO;
import principal.daos.UsuarioDAO;
import principal.modelos.Usuario;

public class CadastroDeUsuarios {

	private static CadastroDeUsuarios instance;

	private DAO<Usuario> dao = new UsuarioDAO();

	private CadastroDeUsuarios() {}
	
	public static synchronized CadastroDeUsuarios getInstance() {
		if (instance == null) {
			instance = new CadastroDeUsuarios();
		}
		return instance;
	}

	public List<Usuario> getUsuarios() {
		return dao.listar();
	}

	public void adicionar(Usuario usuario) {
		dao.salvar(usuario);
	}

	public void atualizar(Usuario usuario) {
		dao.atualizar(usuario);
	}

	public Usuario buscar(Long id) {
		return dao.buscarPorId(id);
	}

	public void excluir(Long id) {
		dao.excluir(id);
	}
}

package principal.controles;

import java.util.List;

import principal.daos.ClienteDAO;
import principal.daos.DAO;
import principal.modelos.Cliente;

public class CadastroDeClientes {

	private static CadastroDeClientes instance;
	
	private DAO<Cliente> dao = new ClienteDAO();

	private CadastroDeClientes() {}
	
	public static synchronized CadastroDeClientes getInstance() {
		if (instance == null) {
			instance = new CadastroDeClientes();
		}
		return instance;
	}

	public List<Cliente> getClientes() {
		return dao.listar();
	}
	
	public Cliente buscar(Long id) {
		return dao.buscarPorId(id);
	}

	public void adicionar(Cliente cliente) {
		dao.salvar(cliente);
	}

	public void atualizar(Cliente cliente) {
		dao.atualizar(cliente);
	}

	public void excluir(Long id) {
		dao.excluir(id);
	}
}

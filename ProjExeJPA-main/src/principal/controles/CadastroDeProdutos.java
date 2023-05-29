package principal.controles;

import java.util.List;

import principal.daos.DAO;
import principal.daos.ProdutoDAO;
import principal.modelos.Produto;

public class CadastroDeProdutos {

	private static CadastroDeProdutos instance;

	private DAO<Produto> dao = new ProdutoDAO();

	private CadastroDeProdutos() {}
	
	public static synchronized CadastroDeProdutos getInstance() {
		if (instance == null) {
			instance = new CadastroDeProdutos();
		}
		return instance;
	}

	public List<Produto> getProdutos() {
		return dao.listar();
	}

	public void adicionar(Produto produto) {
		dao.salvar(produto);
	}

	public void atualizar(Produto produto) {
		dao.atualizar(produto);
	}

	public Produto buscar(Long id) {
		return dao.buscarPorId(id);
	}

	public void excluir(Long id) {
		dao.excluir(id);
	}
}
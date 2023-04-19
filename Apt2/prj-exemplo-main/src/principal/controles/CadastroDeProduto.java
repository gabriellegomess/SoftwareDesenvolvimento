package principal.controles;

import java.util.List;

import principal.modelos.Produto;
import principal.util.Session;

public class CadastroDeProduto {

	private List<Produto> produtos;

	public CadastroDeProduto() {
		this.produtos = Session.banco.getProdutos();
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public void adicionar(Produto produto) {
		this.produtos.add(produto);
	}

	public void atualizar(int indexAlterar, Produto produto) {
		this.produtos.set(indexAlterar, produto);
	}

	public Produto buscar(String nome) {
		Produto produtoRetorno = null;
		for (Produto produto : produtos) {
			if (produto.getNome().equalsIgnoreCase(nome)) {
				produtoRetorno = produto;
				break;
			}
		}
		return produtoRetorno;
	}

	public void atualizar(String nomeOriginal, Produto produtoAlterado) {
		for (int i = 0; i < produtos.size(); i++) {
			Produto produto = produtos.get(i);
			if (produto.getNome().equalsIgnoreCase(nomeOriginal)) {
				produtos.set(i, produtoAlterado);
				break;
			}
		}
	}

	public boolean excluir(String nome) {
		boolean produtoExcluido = false;
		for (int i = 0; i < produtos.size(); i++) {
			Produto produto = produtos.get(i);
			if (produto.getNome().equalsIgnoreCase(nome)) {
				produtos.remove(i);
				produtoExcluido = true;
				break;
			}
		}
		return produtoExcluido;
	}
}

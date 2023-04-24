package principal.controles;

import principal.db.Banco;
import principal.modelos.Produto;

public class CadastroDeProdutos {

	public static void adicionar(Produto produto) {
		Banco.produtos.add(produto);
	}

	public static void atualizar(int indexAlterar, Produto produtoAlterado) {
		Banco.produtos.set(indexAlterar, produtoAlterado);
	}
	
	public static void atualizar(String nomeOriginal, Produto produtoAlterado) {
		for (int i = 0; i < Banco.produtos.size(); i++) {
			Produto produto = Banco.produtos.get(i);
			if (produto.nome.equalsIgnoreCase(nomeOriginal)) {
				Banco.produtos.set(i, produtoAlterado);
				break;
			}
		}
	}

	public static Produto buscar(String nome) {
		Produto produtoRetorno = null;
		for (Produto produto : Banco.produtos) {
			if (produto.nome.equalsIgnoreCase(nome)) {
				produtoRetorno = produto;
				break;
			}
		}
		return produtoRetorno;
	}

	public static boolean excluir(String nome) {
		boolean produtoExcluido = false;
		for (int i = 0; i < Banco.produtos.size(); i++) {
			Produto produto = Banco.produtos.get(i);
			if (produto.nome.equalsIgnoreCase(nome)) {
				Banco.produtos.remove(i);
				produtoExcluido = true;
				break;
			}
		}
		return produtoExcluido;
	}
}

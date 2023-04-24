package principal.telas;

import principal.controles.CadastroDeProdutos;
import principal.db.Banco;
import principal.modelos.Produto;
import principal.util.Mensagem;
import principal.util.Prompt;

public class TelaDeProdutos {
	
	public static void mostrar() {
		
		Prompt.linhaEmBranco();
		Prompt.imprimir(Mensagem.TELA_CADASTRO_DE_PRODUTOS);
		Prompt.imprimir(Mensagem.MSG_ESCOLHA);
		Prompt.imprimir("[1] " + Mensagem.MENU_LISTAR_PRODUTOS);
		Prompt.imprimir("[2] " + Mensagem.MENU_INCLUIR_PRODUTO);
		Prompt.imprimir("[3] " + Mensagem.MENU_ALTERAR_PRODUTO);
		Prompt.imprimir("[4] " + Mensagem.MENU_EXCLUIR_PRODUTO);
		Prompt.imprimir("[5] " + Mensagem.MENU_VOLTAR);

		Integer opcao = Prompt.lerInteiro();
		
		switch (opcao) {
			case 1: {
				TelaDeProdutos.listar();
				break;
			}
			case 2: {
				TelaDeProdutos.incluir();
				break;
			}
			case 3: {
				TelaDeProdutos.alterar();
				break;
			}
			case 4: {
				TelaDeProdutos.excluir();
				break;
			}
			case 5: {
				TelaDeCadastros.mostrar();
				break;
			}
		}
	}

	public static void listar() {
		
		Prompt.linhaEmBranco();
		Prompt.imprimir(Mensagem.MSG_LISTA_DE_PRODUTOS);
		
		if (Banco.produtos.isEmpty()) {
			Prompt.imprimir(Mensagem.MSG_NENHUM_PRODUTO); 
		} else {
			for (Produto produto : Banco.produtos) {
				Prompt.imprimir(produto.toString());
			}
		}
		
		Prompt.linhaEmBranco();
		Prompt.pressionarEnter();
		TelaDeProdutos.mostrar();
		
	}

	private static void incluir() {
		
		Prompt.linhaEmBranco();
		Prompt.imprimir(Mensagem.MSG_INCLUSAO_PRODUTO);
		String nome = Prompt.lerLinha(Mensagem.MSG_INFORME_NOME);
		Double preco = Prompt.lerDecimal(Mensagem.MSG_INFORME_PRECO);
		
		if (!nome.isEmpty()) {
			CadastroDeProdutos.adicionar(new Produto(nome, preco));
			
			Prompt.linhaEmBranco();
			Prompt.pressionarEnter();
		}
		TelaDeProdutos.listar();
		
	}

	private static void alterar() {

		Prompt.linhaEmBranco();
		Prompt.imprimir(Mensagem.MSG_ALTERACAO_PRODUTO);
		String nomeOriginal = Prompt.lerLinha(Mensagem.MSG_INFORME_NOME_ORIGINAL);	
		
		if (!nomeOriginal.isEmpty()) {
			Produto produtoAlterar = CadastroDeProdutos.buscar(nomeOriginal);
			
			if (produtoAlterar != null) {
				String nome = Prompt.lerLinha(Mensagem.MSG_INFORME_NOME);
				Double preco = Prompt.lerDecimal(Mensagem.MSG_INFORME_PRECO);
				
				if (!nome.isEmpty()) {		
					produtoAlterar.nome = nome;
					produtoAlterar.preco = preco;
					
					CadastroDeProdutos.atualizar(nomeOriginal, produtoAlterar);
		
					Prompt.linhaEmBranco();
					Prompt.imprimir(Mensagem.MSG_PRODUTO_ALTERADO);
				}
			} else {
				Prompt.linhaEmBranco();
				Prompt.imprimir(Mensagem.MSG_PRODUTO_NAO_ENCONTRADO);
			}
			Prompt.linhaEmBranco();
			Prompt.pressionarEnter();
		}
		TelaDeProdutos.listar();
	}

	private static void excluir() {

		Prompt.linhaEmBranco();
		Prompt.imprimir(Mensagem.MSG_EXCLUSAO_PRODUTO);
		String nome = Prompt.lerLinha(Mensagem.MSG_INFORME_NOME_ORIGINAL);	
		
		if (!nome.isEmpty()) {
			boolean produtoExcluido = CadastroDeProdutos.excluir(nome);
			
			Prompt.linhaEmBranco();
			if (produtoExcluido) {
				Prompt.imprimir(Mensagem.MSG_PRODUTO_EXCLUIDO);
			} else {
				Prompt.imprimir(Mensagem.MSG_PRODUTO_NAO_ENCONTRADO);
			}
			Prompt.linhaEmBranco();
			Prompt.pressionarEnter();
		}
		TelaDeProdutos.listar();
	}
}
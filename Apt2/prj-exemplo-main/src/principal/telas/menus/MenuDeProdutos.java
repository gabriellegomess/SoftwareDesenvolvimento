package principal.telas.menus;

import java.util.List;

import principal.controles.CadastroDeProduto;
import principal.modelos.Produto;
import principal.telas.Comando;
import principal.telas.TelaDeCadastros;
import principal.util.Mensagem;
import principal.util.Prompt;

public class MenuDeProdutos extends Menu {
	
	private CadastroDeProduto cadastro = new CadastroDeProduto();
	
	public MenuDeProdutos() {
		
		adicionar(1, Mensagem.MENU_LISTAR_PRODUTOS, new Comando() {
			public void executar() {
				Prompt.linhaEmBranco();
				Prompt.imprimir(Mensagem.MSG_LISTA_DE_PRODUTOS);
				
				List<Produto> produtos = cadastro.getProdutos();
				if (produtos.isEmpty()) {
					Prompt.imprimir(Mensagem.MSG_NENHUM_PRODUTO); 
				} else {
					for (Produto produto : produtos) {
						Prompt.imprimir(produto.toString());
					}
				}
				
				Prompt.linhaEmBranco();
				Prompt.pressionarEnter();
				TelaDeCadastros.mostrarCadastroDeProdutos();
			}
		});
		
		adicionar(2, Mensagem.MENU_INCLUIR_PRODUTO, new Comando() {
			public void executar() {
				Prompt.linhaEmBranco();
				Prompt.imprimir(Mensagem.MSG_INCLUSAO_PRODUTO);
				String nome = Prompt.lerLinha(Mensagem.MSG_INFORME_NOME);
				Double preco = Prompt.lerDecimal(Mensagem.MSG_INFORME_PRECO);
				
				cadastro.adicionar(new Produto(nome, preco));
				
				Prompt.linhaEmBranco();
				Prompt.pressionarEnter();
				TelaDeCadastros.mostrarCadastroDeProdutos();
			}
		});
		
		adicionar(3, Mensagem.MENU_ALTERAR_PRODUTO, new Comando() {
			public void executar() {
				Prompt.linhaEmBranco();
				Prompt.imprimir(Mensagem.MSG_ALTERACAO_PRODUTO);
				String nomeOriginal = Prompt.lerLinha(Mensagem.MSG_INFORME_NOME_ORIGINAL);	
				
				Produto produtoAlterar = cadastro.buscar(nomeOriginal);
				
				if (produtoAlterar != null) {
					String nome = Prompt.lerLinha(Mensagem.MSG_INFORME_NOME);
					Double preco = Prompt.lerDecimal(Mensagem.MSG_INFORME_PRECO);
					produtoAlterar.setNome(nome);
					produtoAlterar.setPreco(preco);
					
					cadastro.atualizar(nomeOriginal, produtoAlterar);

					Prompt.linhaEmBranco();
					Prompt.imprimir(Mensagem.MSG_PRODUTO_ALTERADO);
				} else {
					Prompt.linhaEmBranco();
					Prompt.imprimir(Mensagem.MSG_PRODUTO_NAO_ENCONTRADO);
				}
				Prompt.linhaEmBranco();
				Prompt.pressionarEnter();
				TelaDeCadastros.mostrarCadastroDeProdutos();
			}
		});
		
		adicionar(4, Mensagem.MENU_EXCLUIR_PRODUTO, new Comando() {
			public void executar() {
				Prompt.linhaEmBranco();
				Prompt.imprimir(Mensagem.MSG_EXCLUSAO_PRODUTO);
				String nome = Prompt.lerLinha(Mensagem.MSG_INFORME_NOME_ORIGINAL);	
				
				boolean produtoExcluido = cadastro.excluir(nome);
				
				Prompt.linhaEmBranco();
				if (produtoExcluido) {
					Prompt.imprimir(Mensagem.MSG_PRODUTO_EXCLUIDO);
				} else {
					Prompt.imprimir(Mensagem.MSG_PRODUTO_NAO_ENCONTRADO);
				}
				Prompt.linhaEmBranco();
				Prompt.pressionarEnter();
				TelaDeCadastros.mostrarCadastroDeProdutos();
			}
		});
		
		adicionar(5, Mensagem.MENU_VOLTAR, new Comando() {
			public void executar() {
				new TelaDeCadastros().mostrar();			
			}
		});
	}
}
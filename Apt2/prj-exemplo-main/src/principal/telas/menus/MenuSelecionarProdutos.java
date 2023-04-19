package principal.telas.menus;

import java.util.List;

import principal.controles.CadastroDeProduto;
import principal.modelos.Produto;
import principal.telas.Comando;
import principal.telas.TelaDeVendas;
import principal.util.Mensagem;
import principal.util.Prompt;

public class MenuSelecionarProdutos extends Menu {
	
	private CadastroDeProduto cadastro = new CadastroDeProduto();
	
	public MenuSelecionarProdutos() {
		
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
				String nome = Prompt.lerLinha(Mensagem.MSG_INFORME_NOME);	
				
				Produto produto = cadastro.buscar(nome);
				
				if (produto != null) {
					cadastro.adicionar(produto);
					Prompt.linhaEmBranco();
					Prompt.imprimir(Mensagem.MSG_PRODUTO_SELECIONADO);
					Prompt.linhaEmBranco();
					Prompt.imprimir(Mensagem.MSG_SELECIONAR_MAIS);
					Prompt.imprimir(Mensagem.MSG_SIM);
					Prompt.imprimir(Mensagem.MSG_NAO);
					int opcao = Prompt.lerInteiro();
					if (opcao == 1) {
						TelaDeVendas.mostrarSelecionarProdutos();
					} else {
						new TelaDeVendas().mostrar();
					}
				} else {
					Prompt.linhaEmBranco();
					Prompt.imprimir(Mensagem.MSG_PRODUTO_NAO_ENCONTRADO);
					Prompt.linhaEmBranco();
					Prompt.pressionarEnter();
					TelaDeVendas.mostrarSelecionarProdutos();
				}
			}
		});
		
		adicionar(2, Mensagem.MENU_VOLTAR, new Comando() {
			public void executar() {
				new TelaDeVendas().mostrar();			
			}
		});
	}
}
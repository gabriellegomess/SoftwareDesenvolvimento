package principal.telas.menus;

import java.util.List;

import principal.controles.CadastroDeCliente;
import principal.modelos.Cliente;
import principal.telas.Comando;
import principal.telas.TelaDeVendas;
import principal.util.Mensagem;
import principal.util.Prompt;
import principal.util.Session;

public class MenuSelecionarCliente extends Menu {
	
	private CadastroDeCliente cadastro = new CadastroDeCliente();
	
	public MenuSelecionarCliente() {
		
		adicionar(1, Mensagem.MENU_LISTAR_CLIENTES, new Comando() {
			public void executar() {
				Prompt.linhaEmBranco();
				Prompt.imprimir(Mensagem.MSG_LISTA_DE_CLIENTES);
				
				List<Cliente> clientes = cadastro.getClientes();
				
				if (clientes.isEmpty()) {
					Prompt.imprimir(Mensagem.MSG_NENHUM_CLIENTE); 
				} else {
					for (Cliente cliente : clientes) {
						Prompt.imprimir(cliente.toString());
					}
				}
				
				Prompt.linhaEmBranco();
				String nome = Prompt.lerLinha(Mensagem.MSG_INFORME_NOME);	
				
				Cliente cliente = cadastro.buscar(nome);
				
				if (cliente != null) {
					Session.pedido.setCliente(cliente);
					Prompt.linhaEmBranco();
					Prompt.imprimir(Mensagem.MSG_CLIENTE_SELECIONADO);
					Prompt.linhaEmBranco();
					Prompt.pressionarEnter();
					new TelaDeVendas().mostrar();
				} else {
					Prompt.linhaEmBranco();
					Prompt.imprimir(Mensagem.MSG_CLIENTE_NAO_ENCONTRADO);
					Prompt.linhaEmBranco();
					Prompt.pressionarEnter();
					TelaDeVendas.mostrarSelecionarCliente();
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
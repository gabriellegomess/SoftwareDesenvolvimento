package principal.telas.menus;

import java.util.List;

import principal.controles.CadastroDeClientes;
import principal.modelos.Cliente;
import principal.telas.Comando;
import principal.telas.TelaDeCadastros;
import principal.util.Mensagem;
import principal.util.Prompt;

public class MenuDeClientes extends Menu {
	
	private CadastroDeClientes cadastro = CadastroDeClientes.getInstance();
	
	public MenuDeClientes() {
		
		Comando listarClientes = new Comando() {
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
				Prompt.pressionarEnter();
				TelaDeCadastros.mostrarTelaDeCadastroDeClientes();
			}
		};
		
		adicionar(1, Mensagem.MENU_LISTAR_CLIENTES, listarClientes);
		
		adicionar(2, Mensagem.MENU_INCLUIR_CLIENTE, new Comando() {
			public void executar() {
				Prompt.linhaEmBranco();
				Prompt.imprimir(Mensagem.MSG_INCLUSAO_CLIENTE);
				String nome = Prompt.lerLinha(Mensagem.MSG_INFORME_NOME);
				String cpf = Prompt.lerLinha(Mensagem.MSG_INFORME_CPF);
				Double credito = Prompt.lerDecimal(Mensagem.MSG_INFORME_CREDITO);
				
				if (!nome.isEmpty() && !cpf.isEmpty()) {
					cadastro.adicionar(new Cliente(nome, cpf, credito));
					
					Prompt.linhaEmBranco();
					Prompt.pressionarEnter();
				}
				listarClientes.executar();
			}
		});
		
		adicionar(3, Mensagem.MENU_ALTERAR_CLIENTE, new Comando() {
			public void executar() {
				Prompt.linhaEmBranco();
				Prompt.imprimir(Mensagem.MSG_ALTERACAO_CLIENTE);
				Long id = (long) Prompt.lerInteiro(Mensagem.MSG_INFORME_ID);	
				
				if (id > 0) {
					Cliente clienteAlterar = cadastro.buscar(id);
				
					if (clienteAlterar != null) {
						String nome = Prompt.lerLinha(Mensagem.MSG_INFORME_NOME);
						String cpf = Prompt.lerLinha(Mensagem.MSG_INFORME_CPF);
						Double credito = Prompt.lerDecimal(Mensagem.MSG_INFORME_CREDITO);
						
						if (!nome.isEmpty() && !cpf.isEmpty()) {
							clienteAlterar.setId(id);
							clienteAlterar.setNome(nome);
							clienteAlterar.setCPF(cpf);
							clienteAlterar.setCredito(credito);
						
							cadastro.atualizar(clienteAlterar);
		
							Prompt.linhaEmBranco();
							Prompt.imprimir(Mensagem.MSG_CLIENTE_ALTERADO);
						}
					} else {
						Prompt.linhaEmBranco();
						Prompt.imprimir(Mensagem.MSG_CLIENTE_NAO_ENCONTRADO);
					}
					Prompt.linhaEmBranco();
					Prompt.pressionarEnter();
				}
				listarClientes.executar();
			}
		});
		
		adicionar(4, Mensagem.MENU_EXCLUIR_CLIENTE, new Comando() {
			public void executar() {
				Prompt.linhaEmBranco();
				Prompt.imprimir(Mensagem.MSG_EXCLUSAO_CLIENTE);
				Long id = (long) Prompt.lerInteiro(Mensagem.MSG_INFORME_ID);
				
				if (id > 0) {
					cadastro.excluir(id);
				
					Prompt.linhaEmBranco();
					Prompt.imprimir(Mensagem.MSG_CLIENTE_EXCLUIDO);
					Prompt.linhaEmBranco();
					Prompt.pressionarEnter();
				}
				listarClientes.executar();
			}
		});
		
		adicionar(5, Mensagem.MENU_VOLTAR, new Comando() {
			public void executar() {
				TelaDeCadastros.getInstance().mostrar();			
			}
		});
	}
}

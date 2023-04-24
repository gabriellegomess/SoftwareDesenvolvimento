package principal.telas;

import principal.controles.CadastroDeClientes;
import principal.db.Banco;
import principal.modelos.Cliente;
import principal.util.Mensagem;
import principal.util.Prompt;

public class TelaDeClientes {
	
	public static void mostrar() {
		
		Prompt.linhaEmBranco();
		Prompt.imprimir(Mensagem.TELA_CADASTRO_DE_CLIENTES);
		Prompt.imprimir(Mensagem.MSG_ESCOLHA);
		Prompt.imprimir("[1] " + Mensagem.MENU_LISTAR_CLIENTES);
		Prompt.imprimir("[2] " + Mensagem.MENU_INCLUIR_CLIENTE);
		Prompt.imprimir("[3] " + Mensagem.MENU_ALTERAR_CLIENTE);
		Prompt.imprimir("[4] " + Mensagem.MENU_EXCLUIR_CLIENTE);
		Prompt.imprimir("[5] " + Mensagem.MENU_VOLTAR);
		
		Integer opcao = Prompt.lerInteiro();
		
		switch (opcao) {
			case 1: {
				TelaDeClientes.listar();
				break;
			}
			case 2: {
				TelaDeClientes.incluir();
				break;
			}
			case 3: {
				TelaDeClientes.alterar();
				break;
			}
			case 4: {
				TelaDeClientes.excluir();
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
		Prompt.imprimir(Mensagem.MSG_LISTA_DE_CLIENTES);
		
		if (Banco.clientes.isEmpty()) {
			Prompt.imprimir(Mensagem.MSG_NENHUM_CLIENTE); 
		} else {
			for (Cliente cliente : Banco.clientes) {
				Prompt.imprimir(cliente.toString());
			}
		}
		
		Prompt.linhaEmBranco();
		Prompt.pressionarEnter();
		TelaDeClientes.mostrar();	
	}

	private static void incluir() {

		Prompt.linhaEmBranco();
		Prompt.imprimir(Mensagem.MSG_INCLUSAO_CLIENTE);
		String nome = Prompt.lerLinha(Mensagem.MSG_INFORME_NOME);
		String cpf = Prompt.lerLinha(Mensagem.MSG_INFORME_CPF);
		Double credito = Prompt.lerDecimal(Mensagem.MSG_INFORME_CREDITO);
		
		if (!nome.isEmpty() && !cpf.isEmpty()) {
			CadastroDeClientes.adicionar(new Cliente(nome, cpf, credito));
			
			Prompt.linhaEmBranco();
			Prompt.pressionarEnter();
		}
		TelaDeClientes.listar();
	}

	private static void alterar() {

		Prompt.linhaEmBranco();
		Prompt.imprimir(Mensagem.MSG_ALTERACAO_CLIENTE);
		String nomeOriginal = Prompt.lerLinha(Mensagem.MSG_INFORME_NOME_ORIGINAL);	
		if (!nomeOriginal.isEmpty()) {
			Cliente clienteAlterar = CadastroDeClientes.buscar(nomeOriginal);
			
			if (clienteAlterar != null) {
				String nome = Prompt.lerLinha(Mensagem.MSG_INFORME_NOME);
				String cpf = Prompt.lerLinha(Mensagem.MSG_INFORME_CPF);
				Double credito = Prompt.lerDecimal(Mensagem.MSG_INFORME_CREDITO);
				
				if (!nome.isEmpty() && !cpf.isEmpty()) {
					clienteAlterar.nome = nome;
					clienteAlterar.CPF = cpf;
					clienteAlterar.credito = credito;
					
					CadastroDeClientes.atualizar(nomeOriginal, clienteAlterar);
		
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
		TelaDeClientes.listar();
	}

	private static void excluir() {
		
		Prompt.linhaEmBranco();
		Prompt.imprimir(Mensagem.MSG_EXCLUSAO_CLIENTE);
		String nome = Prompt.lerLinha(Mensagem.MSG_INFORME_NOME_ORIGINAL);	
		
		if (!nome.isEmpty()) {
			boolean clienteExcluido = CadastroDeClientes.excluir(nome);
			Prompt.linhaEmBranco();
			if (clienteExcluido) {
				Prompt.imprimir(Mensagem.MSG_CLIENTE_EXCLUIDO);
			} else {
				Prompt.imprimir(Mensagem.MSG_CLIENTE_NAO_ENCONTRADO);
			}
			Prompt.linhaEmBranco();
			Prompt.pressionarEnter();
		}
		TelaDeClientes.listar();
	}
}

package principal.telas;

import principal.util.Mensagem;
import principal.util.Prompt;

import principal.controles.CadastroDeUsuarios;
import principal.db.Banco;
import principal.modelos.Usuario;

public class TelaDeUsuarios {
	
	public static void mostrar() {
		
		Prompt.linhaEmBranco();
		Prompt.imprimir(Mensagem.TELA_CADASTRO_DE_USUARIOS);
		Prompt.imprimir(Mensagem.MSG_ESCOLHA);
		Prompt.imprimir("[1] " + Mensagem.MENU_LISTAR_USUARIOS);
		Prompt.imprimir("[2] " + Mensagem.MENU_INCLUIR_USUARIO);
		Prompt.imprimir("[3] " + Mensagem.MENU_ALTERAR_USUARIO);
		Prompt.imprimir("[4] " + Mensagem.MENU_EXCLUIR_USUARIO);
		Prompt.imprimir("[5] " + Mensagem.MENU_VOLTAR);
		
		Integer opcao = Prompt.lerInteiro();
		
		switch (opcao) {
			case 1: {
				TelaDeUsuarios.listar();
				break;
			}
			case 2: {
				TelaDeUsuarios.incluir();
				break;
			}
			case 3: {
				TelaDeUsuarios.alterar();
				break;
			}
			case 4: {
				TelaDeUsuarios.excluir();
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
		Prompt.imprimir(Mensagem.MSG_LISTA_DE_USUARIOS);
		
		if (Banco.usuarios.isEmpty()) {
			Prompt.imprimir(Mensagem.MSG_NENHUM_USUARIO); 
		} else {
			for (Usuario usuario : Banco.usuarios) {
				Prompt.imprimir(usuario.toString());
			}
		}
		
		Prompt.linhaEmBranco();
		Prompt.pressionarEnter();
		TelaDeUsuarios.mostrar();
		
	}

	private static void incluir() {
		
		Prompt.linhaEmBranco();
		Prompt.imprimir(Mensagem.MSG_INCLUSAO_USUARIO);
		String nome = Prompt.lerLinha(Mensagem.MSG_INFORME_NOME);
		String cpf = Prompt.lerLinha(Mensagem.MSG_INFORME_CPF);
		String login = Prompt.lerLinha(Mensagem.MSG_INFORME_LOGIN);
		String senha = Prompt.lerLinha(Mensagem.MSG_INFORME_SENHA);
		
		if (!nome.isEmpty() && !cpf.isEmpty() 
				&& !login.isEmpty() && !senha.isEmpty()){
			CadastroDeUsuarios.adicionar(new Usuario(nome, cpf, login, senha));
			
			Prompt.linhaEmBranco();
			Prompt.pressionarEnter();
		}
		TelaDeUsuarios.listar();
	}

	private static void alterar() {
		
		Prompt.linhaEmBranco();
		Prompt.imprimir(Mensagem.MSG_ALTERACAO_USUARIO);
		String nomeOriginal = Prompt.lerLinha(Mensagem.MSG_INFORME_NOME_ORIGINAL);	
		
		if (!nomeOriginal.isEmpty()) {
			Usuario usuarioAlterar = CadastroDeUsuarios.buscar(nomeOriginal);
			
			if (usuarioAlterar != null) {
				String nome = Prompt.lerLinha(Mensagem.MSG_INFORME_NOME);
				String cpf  = Prompt.lerLinha(Mensagem.MSG_INFORME_CPF);
				String login = Prompt.lerLinha(Mensagem.MSG_INFORME_LOGIN);
				String senha = Prompt.lerLinha(Mensagem.MSG_INFORME_SENHA);
				if (!nome.isEmpty() && !cpf.isEmpty() 
						&& !login.isEmpty() && !senha.isEmpty()){
					usuarioAlterar.nome = nome;
					usuarioAlterar.CPF = cpf;
					usuarioAlterar.login = login;
					usuarioAlterar.senha = senha;
					
					CadastroDeUsuarios.atualizar(nomeOriginal, usuarioAlterar);
		
					Prompt.linhaEmBranco();
					Prompt.imprimir(Mensagem.MSG_USUARIO_ALTERADO);
				}
			} else {
				Prompt.linhaEmBranco();
				Prompt.imprimir(Mensagem.MSG_USUARIO_NAO_ENCONTRADO);
			}
			Prompt.linhaEmBranco();
			Prompt.pressionarEnter();
		}
		TelaDeUsuarios.listar();
	}

	private static void excluir() {
		
		Prompt.linhaEmBranco();
		Prompt.imprimir(Mensagem.MSG_EXCLUSAO_USUARIO);
		String nome = Prompt.lerLinha(Mensagem.MSG_INFORME_NOME_ORIGINAL);	
		
		if (!nome.isEmpty()) {
			boolean usuarioExcluido = CadastroDeUsuarios.excluir(nome);
			
			Prompt.linhaEmBranco();
			if (usuarioExcluido) {
				Prompt.imprimir(Mensagem.MSG_USUARIO_EXCLUIDO);
			} else {
				Prompt.imprimir(Mensagem.MSG_USUARIO_NAO_ENCONTRADO);
			}
			Prompt.linhaEmBranco();
			Prompt.pressionarEnter();
		}
		TelaDeUsuarios.listar();
	}
}
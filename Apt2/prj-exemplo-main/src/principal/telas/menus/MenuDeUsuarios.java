package principal.telas.menus;

import java.util.List;

import principal.controles.CadastroDeUsuario;
import principal.modelos.Usuario;
import principal.telas.Comando;
import principal.telas.TelaDeCadastros;
import principal.util.Mensagem;
import principal.util.Prompt;

public class MenuDeUsuarios extends Menu {
	
	private CadastroDeUsuario cadastro = new CadastroDeUsuario();
	
	public MenuDeUsuarios() {
		
		adicionar(1, Mensagem.MENU_LISTAR_USUARIOS, new Comando() {
			public void executar() {
				Prompt.linhaEmBranco();
				Prompt.imprimir(Mensagem.MSG_LISTA_DE_USUARIOS);
				
				List<Usuario> usuarios = cadastro.getUsuarios();
				if (usuarios.isEmpty()) {
					Prompt.imprimir(Mensagem.MSG_NENHUM_USUARIO); 
				} else {
					for (Usuario usuario : usuarios) {
						Prompt.imprimir(usuario.toString());
					}
				}
				
				Prompt.linhaEmBranco();
				Prompt.pressionarEnter();
				TelaDeCadastros.mostrarCadastroDeUsuarios();
			}
		});
		
		adicionar(2, Mensagem.MENU_INCLUIR_USUARIO, new Comando() {
			public void executar() {
				Prompt.linhaEmBranco();
				Prompt.imprimir(Mensagem.MSG_INCLUSAO_USUARIO);
				String nome = Prompt.lerLinha(Mensagem.MSG_INFORME_NOME);
				String cpf = Prompt.lerLinha(Mensagem.MSG_INFORME_CPF);
				String login = Prompt.lerLinha(Mensagem.MSG_INFORME_LOGIN);
				String senha = Prompt.lerLinha(Mensagem.MSG_INFORME_SENHA);
				
				cadastro.adicionar(new Usuario(nome, cpf, login, senha));
				
				Prompt.linhaEmBranco();
				Prompt.pressionarEnter();
				TelaDeCadastros.mostrarCadastroDeUsuarios();
			}
		});
		
		adicionar(3, Mensagem.MENU_ALTERAR_USUARIO, new Comando() {
			public void executar() {
				Prompt.linhaEmBranco();
				Prompt.imprimir(Mensagem.MSG_ALTERACAO_USUARIO);
				String nomeOriginal = Prompt.lerLinha(Mensagem.MSG_INFORME_NOME_ORIGINAL);	
				
				Usuario usuarioAlterar = cadastro.buscar(nomeOriginal);
				
				if (usuarioAlterar != null) {
					String nome = Prompt.lerLinha(Mensagem.MSG_INFORME_NOME);
					String cpf  = Prompt.lerLinha(Mensagem.MSG_INFORME_CPF);
					usuarioAlterar.setNome(nome);
					usuarioAlterar.setCPF(cpf);
					
					cadastro.atualizar(nomeOriginal, usuarioAlterar);

					Prompt.linhaEmBranco();
					Prompt.imprimir(Mensagem.MSG_USUARIO_ALTERADO);
				} else {
					Prompt.linhaEmBranco();
					Prompt.imprimir(Mensagem.MSG_USUARIO_NAO_ENCONTRADO);
				}
				Prompt.linhaEmBranco();
				Prompt.pressionarEnter();
				TelaDeCadastros.mostrarCadastroDeUsuarios();
			}
		});
		
		adicionar(4, Mensagem.MENU_EXCLUIR_USUARIO, new Comando() {
			public void executar() {
				Prompt.linhaEmBranco();
				Prompt.imprimir(Mensagem.MSG_EXCLUSAO_USUARIO);
				String nome = Prompt.lerLinha(Mensagem.MSG_INFORME_NOME_ORIGINAL);	
				
				boolean usuarioExcluido = cadastro.excluir(nome);
				
				Prompt.linhaEmBranco();
				if (usuarioExcluido) {
					Prompt.imprimir(Mensagem.MSG_USUARIO_EXCLUIDO);
				} else {
					Prompt.imprimir(Mensagem.MSG_USUARIO_NAO_ENCONTRADO);
				}
				Prompt.linhaEmBranco();
				Prompt.pressionarEnter();
				TelaDeCadastros.mostrarCadastroDeUsuarios();
			}
		});
		
		adicionar(5, Mensagem.MENU_VOLTAR, new Comando() {
			public void executar() {
				new TelaDeCadastros().mostrar();			
			}
		});
	}
}
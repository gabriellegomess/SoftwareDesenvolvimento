package principal.telas.menus;

import java.util.List;

import principal.controles.CadastroDeUsuarios;
import principal.modelos.Usuario;
import principal.telas.Comando;
import principal.telas.TelaDeCadastros;
import principal.util.Mensagem;
import principal.util.Prompt;

public class MenuDeUsuarios extends Menu {
	
	private CadastroDeUsuarios cadastro = CadastroDeUsuarios.getInstance();
	
	public MenuDeUsuarios() {
		
		Comando listarUsuarios = new Comando() {
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
				TelaDeCadastros.mostrarTelaDeCadastroDeUsuarios();
			}
		};
		
		adicionar(1, Mensagem.MENU_LISTAR_USUARIOS, listarUsuarios);
		
		adicionar(2, Mensagem.MENU_INCLUIR_USUARIO, new Comando() {
			public void executar() {
				Prompt.linhaEmBranco();
				Prompt.imprimir(Mensagem.MSG_INCLUSAO_USUARIO);
				String nome = Prompt.lerLinha(Mensagem.MSG_INFORME_NOME);
				String cpf = Prompt.lerLinha(Mensagem.MSG_INFORME_CPF);
				String login = Prompt.lerLinha(Mensagem.MSG_INFORME_LOGIN);
				String senha = Prompt.lerLinha(Mensagem.MSG_INFORME_SENHA);
				
				if (!nome.isEmpty() && !cpf.isEmpty() 
						&& !login.isEmpty() && !senha.isEmpty()){
					cadastro.adicionar(new Usuario(nome, cpf, login, senha));
					
					Prompt.linhaEmBranco();
					Prompt.pressionarEnter();
				}
				listarUsuarios.executar();
			}
		});
		
		adicionar(3, Mensagem.MENU_ALTERAR_USUARIO, new Comando() {
			public void executar() {
				Prompt.linhaEmBranco();
				Prompt.imprimir(Mensagem.MSG_ALTERACAO_USUARIO);
				Long id = (long) Prompt.lerInteiro(Mensagem.MSG_INFORME_ID);
				
				if (id > 0) {
					Usuario usuarioAlterar = cadastro.buscar(id);
				
					if (usuarioAlterar != null) {
						String nome = Prompt.lerLinha(Mensagem.MSG_INFORME_NOME);
						String cpf  = Prompt.lerLinha(Mensagem.MSG_INFORME_CPF);
						String login = Prompt.lerLinha(Mensagem.MSG_INFORME_LOGIN);
						String senha = Prompt.lerLinha(Mensagem.MSG_INFORME_SENHA);
						if (!nome.isEmpty() && !cpf.isEmpty() 
								&& !login.isEmpty() && !senha.isEmpty()){
							usuarioAlterar.setId(id);
							usuarioAlterar.setNome(nome);
							usuarioAlterar.setCPF(cpf);
							usuarioAlterar.setLogin(login);
							usuarioAlterar.setSenha(senha);
							
							cadastro.atualizar(usuarioAlterar);
		
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
				listarUsuarios.executar();
			}
		});
		
		adicionar(4, Mensagem.MENU_EXCLUIR_USUARIO, new Comando() {
			public void executar() {
				Prompt.linhaEmBranco();
				Prompt.imprimir(Mensagem.MSG_EXCLUSAO_USUARIO);
				Long id = (long) Prompt.lerInteiro(Mensagem.MSG_INFORME_ID);	
				
				if (id > 0) {
					cadastro.excluir(id);
				
					Prompt.linhaEmBranco();
					Prompt.imprimir(Mensagem.MSG_USUARIO_EXCLUIDO);
					Prompt.linhaEmBranco();
					Prompt.pressionarEnter();
				}
				listarUsuarios.executar();
			}
		});
		
		adicionar(5, Mensagem.MENU_VOLTAR, new Comando() {
			public void executar() {
				TelaDeCadastros.getInstance().mostrar();			
			}
		});
	}
}
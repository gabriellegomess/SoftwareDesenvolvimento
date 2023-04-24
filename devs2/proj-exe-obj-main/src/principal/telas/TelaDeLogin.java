package principal.telas;

import principal.controles.ControleDeAcesso;
import principal.util.Mensagem;
import principal.util.Prompt;

public class TelaDeLogin extends Tela {	
	
	public TelaDeLogin() {
		super(Mensagem.TELA_LOGIN);	
	}

	@Override
	public void mostrar() {
		Prompt.imprimir(titulo);
		String login = Prompt.lerLinha(Mensagem.MSG_INFORME_LOGIN);
		String senha = Prompt.lerLinha(Mensagem.MSG_INFORME_SENHA);

		ControleDeAcesso.autenticar(login, senha);
		
		if (ControleDeAcesso.isUsuarioLogado()) {
			TelaPrincipal.getInstance().mostrar();
		} else {
			Prompt.linhaEmBranco();
			Prompt.imprimir(Mensagem.MSG_LOGIN_INVALIDO);
			Prompt.linhaEmBranco();
			Prompt.pressionarEnter();
		}
	}
}
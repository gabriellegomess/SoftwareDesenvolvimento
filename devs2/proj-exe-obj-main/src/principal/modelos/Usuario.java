package principal.modelos;

public class Usuario extends Pessoa {
	
	private String login;
	private String senha;
	
	public Usuario() {
	}

	public Usuario(String nome, String CPF) {
		super(nome, CPF);
	}

	public Usuario(String nome, String CPF, String login, String senha) {
		super(nome, CPF);
		this.login = login;
		this.senha = senha;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	@Override
	public String toString() {
		return "Usuário {nome = " + getNome() + ", cpf = " + getCPF() + "}";
	}

	public String toCSV() {
		return getNome() + ";" + getCPF() + ";" + login  + ";" + senha;
	}
	
	public String toJS() {
		return "{" + getNome() + "," + getCPF() + "," + login  + "," + senha + "}";
	}
}

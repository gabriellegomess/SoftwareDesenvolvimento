package principal.modelos;

public class Usuario {
	
	public String nome;
	public String CPF;
	public String login;
	public String senha;
	
	public Usuario() {
	}
	
	public Usuario(String nome, String CPF, String login, String senha) {
		this.nome = nome;
		this.CPF = CPF;
		this.login = login;
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Usuário {nome = " + nome + ", cpf = " + CPF + "}";
	}

	public String toCSV() {
		return nome + ";" + CPF + ";" + login  + ";" + senha;
	}
	
	public String toJS() {
		return "{" + nome + "," + CPF + "," + login  + "," + senha + "}";
	}
}

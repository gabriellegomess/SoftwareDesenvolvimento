package principal.modelos;

public class Pessoa {

	private String nome;
	private String CPF;

	public Pessoa() {
	}

	public Pessoa(String nome, String CPF) {
		this.nome = nome;
		this.CPF = CPF;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome = " + nome + ", cpf = " + CPF + "]";
	}
}

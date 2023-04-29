package principal.modelos;

public class Cliente {
	
	public String nome;
	public String CPF;
	public Double credito;
	
	public Cliente() {
	}
	
	public Cliente(String nome, String CPF) {
		this.nome = nome;
		this.CPF = CPF;
	}
	
	public Cliente(String nome, String CPF, Double credito) {
		this.nome = nome;
		this.CPF = CPF;
		this.credito = credito;
	}

	@Override
	public String toString() {
		return "Cliente {nome = " + nome + ", cpf = " + CPF + ", credito = " + credito + "}";
	}
	
	public String toCSV() {
		return nome + ";" + CPF + ";" + credito; 
	}
	
	public String toJS() {
		return "{" + nome + "," + CPF + "," + credito + "}";
	}
}

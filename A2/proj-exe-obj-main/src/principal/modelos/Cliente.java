package principal.modelos;

public class Cliente extends Pessoa {
	
	private Double credito;
	
	public Cliente() {
	}
	
	public Cliente(String nome, String CPF) {
		super(nome, CPF);
	}

	public Cliente(String nome, String CPF, Double credito) {
		super(nome, CPF);
		this.credito = credito;
	}
	
	public Double getCredito() {
		return credito;
	}

	public void setCredito(Double credito) {
		this.credito = credito;
	}

	@Override
	public String toString() {
		return "Cliente {nome = " + getNome() + ", cpf = " + getCPF() + ", credito = " + credito + "}";
	}
	
	public String toCSV() {
		return getNome() + ";" + getCPF() + ";" + credito; 
	}
	
	public String toJS() {
		return "{" + getNome() + "," + getCPF() + "," + credito + "}";
	}
}

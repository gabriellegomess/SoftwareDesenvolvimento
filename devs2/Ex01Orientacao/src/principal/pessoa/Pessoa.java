package principal.pessoa;

public class Pessoa {

	private String CPF;
	private String nome;
	private double peso;
	
	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	public String getCPF() {
		return CPF;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getPeso() {
		return peso;
	}
	
}

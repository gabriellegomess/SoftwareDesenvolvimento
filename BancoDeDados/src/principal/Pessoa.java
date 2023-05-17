package principal;

public class Pessoa {
	
	private int idPessoa;
	private String nome;
	private String cpf;
	private double peso;
	
	public Pessoa(String nome, String cpf, double peso) {
		this.nome = nome;
		this.cpf = cpf;
		this.peso = peso;
	}
	
	public Pessoa(int idPessoa, String nome, String cpf, double peso) {
		this.idPessoa = idPessoa;
		this.nome = nome;
		this.cpf = cpf;
		this.peso = peso;
	}
	
	
	public int getIdPessoa() {
		return idPessoa;
	}
	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	

}

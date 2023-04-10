package principal.modelos;

public class Pessoa {

	private String CPF;
	private String nome;
	private double peso;
	private int idade;
	
	/* exemplo do prof em um dos slides (n aparece a forma de fazer o get usando dois tipos diferentes de variaveis
	 *  public Pessoa(String nome, String CPF, int idade){
		this.nome = nome;
		this.CPF = CPF;
		this.idade = idade;
		}
 */

	
	                   //nome que voce quer
	public void setCPF(String CPF) {
		this.CPF = CPF;
		//this.nomevariavel = nome da "String"
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void setIdade(int idade) {
		if(idade > 0) {
		this.idade = idade;
		}
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
	
	public int getIdade() {
		return idade;
	}
	
}

package principal.modelos;

public class Produto {

	public String nome;
	public Double preco;
	
	public Produto() {
	}
	
	public Produto(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return "Produto {nome = " + nome + ", preco = " + preco + "}";
	}

	public String toCSV() {
		return nome + ";" + preco;
	}
	
	public String toJS() {
		return "{" + nome + "," + preco + "}";
	}
}

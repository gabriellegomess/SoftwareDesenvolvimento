package principal.modelos;

public class Produto {

	private String nome;
	private Double preco;
	
	public Produto() {
	}

	public Produto(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
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

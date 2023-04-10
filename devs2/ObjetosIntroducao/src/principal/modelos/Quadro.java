package principal.modelos;

public class Quadro {

	private String modelo;
	private String cor;
	private String tamanho;
	
	//construtor
	public Quadro(String modelo, String cor, String tamanho) {
		this.modelo = modelo;
		this.cor = cor;
		this.tamanho = tamanho;
	}
	
	
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public String getCor() {
		return cor;
	}
	
	public String getTamanho() {
		return tamanho;
	}
	
}

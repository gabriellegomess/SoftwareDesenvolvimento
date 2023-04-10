package principal.modelos;

public class Roda {

	private String modelo;
	private String cor;
	private String aro;
	
	//construtor
	public Roda(String modelo, String cor, String tamanho) {
		this.modelo = modelo;
		this.cor = cor;
		this.aro = tamanho;
	}
	
	public void setModelo(String modelo) {
		this.modelo =  modelo;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void setTamanho(String tamanho) {
		this.aro = tamanho;
	}
	
	public String getModelo() {
		return modelo;
	}

	public String getCor() {
		return cor;
	}
	
	public String getTamanho() {
		return aro;
	}
}

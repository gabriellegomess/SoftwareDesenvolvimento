package principal.modelos;

public class Bicicleta {

	//Encapsulamento
	private String modelo;
	private int velocidade;
	private int pedaladasPorMinuto;
	private int marcha;
	
	//Setter (permite definir, definir valores dentro da classe)
	public void setModelo(String modelo) {
		this.modelo = modelo;
		//this.nomevariavel = nome da String
	}
	
	public void setVelocidade(int velocidade) {
		if(velocidade >= 0) { //a velocidade não pode ser negativa no caso da bicicleta, mas por ex: se fosse uma conta bancaria ou transferencia poderia
		this.velocidade = velocidade;
		}
	}
	
	public void setPedaladasPorMinuto(int pedaladas) {
		this.pedaladasPorMinuto = pedaladas;
	}
	
	public void setMarcha(int marcha) {
		if(marcha >= 1) {
		this.marcha = marcha;
		}
	}
	
	
	//Getter (permite pegar, usar)
	public String getModelo(){
	//public tipo da variavel, nome que vc quer 
		return modelo;
		//oq vc quer que retorne (pode retornar algo do private)
	}
	
	public int getVelocidade() {
		return velocidade;
	}
	
	public int getPedaladasPorMinuto() {
		return pedaladasPorMinuto;
	}
	
	public int getMarcha() {
		return marcha;
	}
	
	
}
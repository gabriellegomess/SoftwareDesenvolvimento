package principal.modelos;

public class Bike {

	//Encapsulamento
	
	private Roda rodaDianteira;
	private Roda rodaTrasseira;
	private Quadro quadro;
	
	public void setQuadro(Quadro quadro) {
		this.quadro = quadro;
	}
	
	public Quadro getQuadro() {
		return quadro;
	}
	
	
	
	public void setRodaDianteira(Roda roda) {
		this.rodaDianteira = roda;
	}
	
	public Roda getRodaDianteira() {
		return rodaDianteira;

	}
	
	
	
	public void setRodaTrasseira(Roda roda) {
		this.rodaTrasseira = roda;
	}
	
	
	public Roda getRodaTrasseira() {
		return rodaTrasseira;
	}
	
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
package principal.modelos;

public class Bike {

	//Encapsulamento
	
	private Roda rodaDianteira;
	private Roda rodaTrasseira;
	private Quadro quadro;
	
	private String modelo;
	private int velocidade;
	private int pedaladasPorMinuto;
	private int marcha;
	
	//gerando um construtor (não possui retorno, pq ele sempre retorna uma classe (a q pertence))
	//construtor possui sempre o mesmo nome da classe
	//private Bike() {}
	
	//recebendo apenas coisas da bike
	public Bike(String modelo, int velocidade, int pedaladasPorMinuto, int marcha) {
		this.modelo = modelo;
		this.velocidade = velocidade;
		this.pedaladasPorMinuto = pedaladasPorMinuto;
		this.marcha = marcha;
	}
	
	//a bike pode receber tudo de uma vez
	public Bike(String modelo, int velocidade, int pedaladasPorMinuto, int marcha,
			Quadro quadro, Roda rodaDianteira, Roda rodaTrasseira) {
		this.modelo = modelo;
		this.velocidade = velocidade;
		this.pedaladasPorMinuto = pedaladasPorMinuto;
		this.marcha = marcha;
		this.quadro = quadro;
		this.rodaDianteira = rodaDianteira;
		this.rodaTrasseira = rodaTrasseira;
	}
	
	
	
	
	//setter e getters
	
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
	
	public Bike() {
		
	}
	
}
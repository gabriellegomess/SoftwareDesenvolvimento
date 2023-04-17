package principal.modelos;

public class BikeDeTrilha extends Bike {
	
	private String farol;
	


	public BikeDeTrilha() {
		super();
	
	}

	public BikeDeTrilha(String modelo, int velocidade, int pedaladasPorMinuto, int marcha, Quadro quadro,
			Roda rodaDianteira, Roda rodaTrasseira) {
		super(modelo, velocidade, pedaladasPorMinuto, marcha, quadro, rodaDianteira, rodaTrasseira);
		
	}
	
	public String getFarol() {
		return farol;
	}

	public void setFarol(String farol) {
		this.farol = farol;
	}

}

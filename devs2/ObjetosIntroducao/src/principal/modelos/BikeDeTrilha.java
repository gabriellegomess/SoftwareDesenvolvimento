package principal.modelos;

public class BikeDeTrilha extends Bike {
	
	public BikeDeTrilha() {
		super();
	
	}

	public BikeDeTrilha(String modelo, int velocidade, int pedaladasPorMinuto, int marcha, Quadro quadro,
			Roda rodaDianteira, Roda rodaTrasseira) {
		super(modelo, velocidade, pedaladasPorMinuto, marcha, quadro, rodaDianteira, rodaTrasseira);
		
	}

}

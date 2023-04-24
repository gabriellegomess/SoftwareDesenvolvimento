package br.edu.up.modelos;

public class Prato {

	private Chefe chefePreparo;
	private String receita;
	private String passosPreparo;

	// Ingredientes?
	
	public Chefe getChefePreparo() {
		return chefePreparo;
	}

	public void setChefePreparo(Chefe chefePreparo) {
		this.chefePreparo = chefePreparo;
	}

	public String getReceita() {
		return receita;
	}

	public void setReceita(String receita) {
		this.receita = receita;
	}

	public String getPassosPreparo() {
		return passosPreparo;
	}

	public void setPassosPreparo(String passosPreparo) {
		this.passosPreparo = passosPreparo;
	}

}

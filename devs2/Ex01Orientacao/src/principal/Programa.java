package principal;
import principal.pessoa.*;

public class Programa {

	public static void main(String[] args) {
		
		//nome do objeto(classe) nome que o objeto vei ter
		Pessoa eu = new Pessoa();
		
		eu.setCPF("458958545");
		eu.setNome("Gabi");
		eu.setPeso(54);

		Pessoa voce = new Pessoa();
		
		voce.setCPF("45487");
		voce.setNome("Michael");
		voce.setPeso(78);
		
		//Imprimindo
		
		System.out.println("Meu nome: "+ eu.getNome());
		System.out.println("Meu CPF: "+ eu.getCPF());
		System.out.println("Meu peso: "+ eu.getPeso());
		System.out.println();
		
		System.out.println("Seu nome: "+ voce.getNome());
		System.out.println("Seu CPF: "+ voce.getCPF());
		System.out.println("Seu peso: "+ voce.getPeso());
	}
	
}

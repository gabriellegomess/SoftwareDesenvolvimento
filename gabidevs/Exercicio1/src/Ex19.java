public class Ex19 {

	public static void main(String[] args) {
		
		//Faça um algoritmo que receba o raio e a altura de um cilindro e retorne o seu volume calculado de acordocom a seguinte fórmula: 
		//volume = 3.14 * raio2 * altura
		//Exemplo: raio = 10, altura = 15. Volume = 4710
		
		double raio, altura, volume;
		
		raio = Console.readDouble("Informe o valor do raio: ");
		altura = Console.readDouble("Informe o valor da altura: ");
		
		volume = 3.14 * (raio * raio) * altura;
		
		// se fosse float era 3.14f
		
		System.out.println("Raio: "+ raio);
		System.out.println("Altura: "+ altura);
		System.out.println("Volume: "+ volume);
		
	}
	
}
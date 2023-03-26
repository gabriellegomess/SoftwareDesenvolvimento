
public class Ex17 {

	public static void main(String[] args) {
		
		//Elabore um algoritmo que receba três notas de um aluno os pesos referentes a cada nota e retorne a suamédia ponderada.
		//Cálculo da média ponderada:nota1 * peso1 + nota2 * peso2 + nota3 * peso3peso1 + peso2 + peso3
		//Exemplo: nota1 = 10.0, nota2 = 5.5, nota3 = 8.0, peso1 = 5, peso2 = 3, peso3 = 2. Média: 8.25
		
		double nota1, nota2, nota3, peso1, peso2, peso3, media;
		
		nota1 = Console.readDouble("Informe a primeira nota: ");
		nota2 = Console.readDouble("Informe a segunda nota: ");
		nota3 = Console.readDouble("Informe a terceira nota ");
		peso1 = Console.readDouble("Informe o primeiro peso: ");
		peso2 = Console.readDouble("Informe o segundo peso: ");
		peso3 = Console.readDouble("Informe o terceiro peso: ");
		
		media = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3);
		
		System.out.println("Nota 1: "+nota1);
		System.out.println("Nota 2: "+nota2);
		System.out.println("Nota 3: "+nota3);
		System.out.println("Peso 1: "+peso1);
		System.out.println("Peso 2: "+peso2);
		System.out.println("Peso 3: "+peso3);
		System.out.println("A média é: "+media);
	}
	
}


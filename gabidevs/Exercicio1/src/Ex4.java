import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		//Escreva um algoritmo que leia dois números e ao final mostre a soma, subtração, mul�plicação e a divisãodos números lidos
		
		Scanner primeiro = new Scanner(System.in);
		Scanner segundo = new Scanner(System.in);
		double num1, num2, soma, menos, mult, divi;
		
		System.out.println("Informe o primeiro número");
		num1 = primeiro.nextDouble();
		
		System.out.println("Informe o segundo número");
		num2 = segundo.nextDouble();
		
		soma = num1 + num2;
		menos = num1 - num2;
		mult = num1 * num2;
		divi = num1 / num2;
		
		System.out.println("A somas dos dois números é: "+ soma);
		System.out.println("A subtração dos dois números é: "+ menos);
		System.out.println("A multiplicação dos dois números é: "+ mult);
		System.out.println("A divisão dos dois números é: "+ divi);
		
		primeiro.close();
		segundo.close();
				
		
	}
	
}

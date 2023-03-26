import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		//Escreva um algoritmo que leia dois números digitados pelo usuário e exiba o resultado da sua soma.
		
		Scanner primeiro = new Scanner(System.in);
		Scanner segundo = new Scanner(System.in);
		
		double num1, num2, soma;
		
		System.out.println("Digite o primeiro número: ");
		num1 = primeiro.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		num2 = segundo.nextDouble();
		
		soma = num1 + num2;
		
		System.out.println("A soma dos dois número é igual a: "+ soma);
		
		
		primeiro.close();
		segundo.close();
		
	}
	
}

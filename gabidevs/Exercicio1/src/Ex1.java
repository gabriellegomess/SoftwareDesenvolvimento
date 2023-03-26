import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		//Escreva um algoritmo que leia um número digitado pelo usuário e 
		//mostre a mensagem “Número maior doque 10! ”, caso este número seja maior, ou “Número menor ou igual a 10! ”, caso este número seja menor ou igual.
		
		Scanner numero = new Scanner(System.in);
		
		double num;
		
		System.out.println("Digite um número!");
		num = numero.nextDouble();
		
		if(num > 10) {
			System.out.println("Número maior do que 10!");
		} else {
			System.out.println("Número menor ou igual a 10!");
		}
		
		numero.close();
	}
	
}

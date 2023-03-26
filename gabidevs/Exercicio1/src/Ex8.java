import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		
		//Escreva um algoritmo que leia um número e mostre uma mensagem caso este número seja maior ou iguala 50, outra se ele for menor que 50
		
		Scanner numero = new Scanner(System.in);
		int num;
		
		System.out.println("Informe um número: ");
		num = numero.nextInt();
		
		if(num >= 50) {
			System.out.println("O número é maior ou igual a 50!");
		}else {
			System.out.println("O número é menor que 50!");
		}
		
		numero.close();
		
	}
	
}

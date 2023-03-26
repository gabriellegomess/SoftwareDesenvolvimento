import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		//Faça um programa que leia 5 números do teclado e os armazene em um vetor. Crie um segundo vetor quearmazene o dobro de cada um dos números do primeiro vetor e apresente este veto
		
		int[] numeros = new int[5];
		int[] vetor = new int[5];
		
		Scanner leitor = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
		System.out.println("\nDigite o " + (i+1)+ " numero: ");
		numeros[i] = leitor.nextInt();
		
		}
		
		for(int i = 0; i < 5; i++) {
			
			vetor[i] = numeros[i] * 2;
			System.out.println("O dobro do número "+numeros[i]+ " é: "+vetor[i]);
		}
		
		leitor.close();
		
	}
	
}

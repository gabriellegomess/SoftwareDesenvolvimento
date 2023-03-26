import java.util.Scanner;

public class Ex05 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		//Elabore um programa que leia 5 números do teclado e os armazene em um vetor. Em seguida, leia umnúmero n qualquer e apresente na tela a quan�dade de vezes que o número n aparece no vetor.
		
		int[] num = new int[5];
		int n,soma = 1;
		
		for(int i = 0; i <5; i++) {
			
			System.out.println("Digite um número: ");
			num[i] = leitor.nextInt();
			
		}
		
		System.out.println("Informe um número qualquer: ");
		n = leitor.nextInt();
		
		for(int i = 0; i < num[i]; i++) {
			
			if(num[i] == n) {
				
				soma++;
			}

		}
		
		System.out.println("A quantidade de vezes que o número "+ n + " aparece é: "+ soma);
		
		leitor.close();
		
	}

}
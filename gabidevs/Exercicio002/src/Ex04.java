import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		//Elabore um programa que leia um vetor de 5 elementos e um número n qualquer. Mostre na tela o índicedos elementos que são inferiores a n
		
		Scanner leitor = new Scanner(System.in);
		
		int[] numero = new int[5];
		int n;
		
		for(int i = 0; i < 5; i++) {
			
			System.out.println("Informe o "+ (i+1)+ " número: ");
			numero[i] = leitor.nextInt();
			
		}
		
		System.out.println("Informe um número qualquer: ");
		n = leitor.nextInt();
		
		for(int i = 0; i < numero[i]; i++) {
			
			if(n > numero[i]) {
				System.out.println("Números inferiores: "+numero[i]);
			}
			
		}
		
		leitor.close();
		
	}
	
}
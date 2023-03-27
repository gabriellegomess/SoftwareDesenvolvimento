import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		//ler dois vetores de 3 elementos 
		//verificar se eles são iguais ou não
		//para serem iguais todos os elementos devem coincidir 

		Scanner leitor = new Scanner(System.in);

		int[] vetorA = new int[3];
		int[] vetorB = new int[3];
		
	for (int i = 0; i < vetorB.length; i++) {
		
		System.out.println("Digite os elementos do vetor A:");
		vetorA[i] = leitor.nextInt();

	}
	
	for (int i = 0; i < vetorB.length; i++) {
	
		System.out.println("Digite os elementoa do vetor B: ");
		vetorB[i] = leitor.nextInt();
	}
	
	int igual = 0;
	int diferente = 0;
	
	for (int i = 0; i < vetorB.length; i++) {
		
		if(vetorA[i] == vetorB[i]) {
			//System.out.println("Os vetores são iguais!");
			igual++;
		}else {
			//System.out.println("Os vetores são diferentes");
			diferente++;
		}
	}
	
	if(igual == 3){
		System.out.println("Os vetores são iguais!");
	}else {
		System.out.println("Os vetores são diferentes!");
	}
	
/*	for (int i = 0; i < vetorB.length; i++) {
		//vetorA[i]  vetorB[i];
		if(vetorA[i] != vetorB[i]) {
			System.out.println("Os vetores são diferentes");
		}
	}*/
	
	
	
		leitor.close();
	 }
}

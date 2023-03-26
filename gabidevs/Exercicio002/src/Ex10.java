import java.util.Scanner;

public class Ex10 {
	
	public static void main(String[] args) {
		
		/* Crie um programa que leia um vetor A de 5 posições e, ao final da leitura, copie os elementos de A em B deforma inver�da. 
		 * Ou seja, o primeiro elemento de A é o úl�mo elemento de B, o segundo elemento de A é openúl�mo elemento de B, e assim por diante
		 * */
		 
		//vi cm o fassina mas n lembro direito, mas era a ordem do for
		
		//Criando os vetores A e B
	      int[] A = new int[5];
	      int[] B = new int[5];
	      
	      Scanner leitor = new Scanner(System.in);
	      
	      //Lendo os elementos do vetor A
	      System.out.println("Digite os elementos do vetor A:");
	      for(int i=0; i<5; i++) {
	         A[i] = leitor.nextInt();
	      }
	      
	      //Copiando os elementos de A em B de forma invertida
	      for(int i=0; i<5; i++) {
	         B[i] = A[4-i];
	      }
	      
	      //Imprimindo os elementos do vetor B
	      System.out.println("Os elementos do vetor B, em ordem invertida, são:");
	      for(int i=0; i<5; i++) {
	         System.out.print(B[i] + " ");
	      }
	      
	      leitor.close();
		
	}

}
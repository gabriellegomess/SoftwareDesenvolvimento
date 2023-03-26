import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		/* Elabore um programa que leia os vetores A e B de 5 elementos e gere um vetor C de acordo com aseguinte regra:
		   Os elementos das posições pares de C são os elementos das posições pares de A;
		   Os elementos das posições ímpares de C são os elementos das posições ímpares de B;
		  */
		 
		Scanner leitor = new Scanner(System.in);
        
        int[] A = new int[5];
        int[] B = new int[5];
        int[] C = new int[5];
        
        System.out.println("Entre com os elementos do vetor A:");
        for (int i = 0; i < A.length; i++) {
            A[i] = leitor.nextInt();
        }
        
        System.out.println("Entre com os elementos do vetor B:");
        for (int i = 0; i < B.length; i++) {
            B[i] = leitor.nextInt();
        }
        
        for (int i = 0; i < C.length; i++) {
            if (i % 2 == 0) { // posição par de C
                C[i] = A[i];
            } else { // posição ímpar de C
                C[i] = B[i];
            }
        }
        
        System.out.println("O vetor C gerado é:");
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }
        
        leitor.close();
		
	}
	
}

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		//Dados dois vetores A e B de 5 elementos cada, criar um vetor C que representa a concatenação de A e B.Ou seja, C contém os elementos de A seguidos dos elementos de B.
		
		int[] A = new int[5];
		int[] B = new int[5];
	
		for(int i = 0; i <5; i++) {
			System.out.println("Informe o "+(i+1)+ " número: ");
			A[i] = leitor.nextInt();	
		}
		
		for(int i = 0; i <5; i++) {
			System.out.println("Informe o "+(i+1)+ " número: ");
			B[i] = leitor.nextInt();		
		}			
	
	 int[] C = new int[10];
     for (int i = 0; i < 5; i++) {
         C[i] = A[i];
         C[i+5] = B[i];
     }
     
  
	/*System.out.println("O valor de C: "+C[i]);
	*/
		leitor.close();
		
	}
	
}
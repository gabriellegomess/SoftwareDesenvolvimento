/*import java.util.Arrays;

public class Ex08Cha {
  public static void main(String[] args) {
    
    int[] A = {1, 2, 3, 4, 5}; // vetor A
    int[] B = {6, 7, 8, 9, 10}; // vetor B
    
    int[] C = new int[A.length + B.length]; // vetor C com tamanho da soma dos tamanhos de A e B
    
    // Preenchendo o vetor C com os elementos de A
    for(int i = 0; i < A.length; i++) {
      C[i] = A[i];
    }
    
    // Preenchendo o vetor C com os elementos de B
    for(int i = 0; i < B.length; i++) {
      C[A.length + i] = B[i];
    }
    
    // Imprimindo o vetor C
    System.out.println(Arrays.toString(C));
    
  }
}*/

import java.util.Scanner;

public class Ex08Cha {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int[] A = new int[5];
        int[] B = new int[5];
        int[] C = new int[10];
        
        // Lendo os valores do primeiro vetor A
        
        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < 5; i++) {
            System.out.printf("A[%d] = ", i);
            A[i] = leitor.nextInt();
        }
        
        // Lendo os valores do segundo vetor B
        
        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < 5; i++) {
            System.out.printf("B[%d] = ", i);
            B[i] = leitor.nextInt();
        }
        
        // Concatenando os vetores A e B no vetor C
        
        for (int i = 0; i < 5; i++) {
            C[i] = A[i];
            C[i+5] = B[i];
        }
        
        // Imprimindo o vetor C
        System.out.println("Vetor C resultante:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("C[%d] = %d%n", i, C[i]);
        }
        
        leitor.close();
    }
}
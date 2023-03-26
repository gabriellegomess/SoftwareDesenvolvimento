import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		//Elabore um algoritmo que receba um número n e retorne um vetor com os n primeiros termos dasequência de Fibonacci. Exemplo: n = 8, vetor = {1, 1, 2, 3, 4, 8, 13, 21}.
		Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n = leitor.nextInt();

        int[] fibonacci = new int[n];

        fibonacci[0] = 1;
        fibonacci[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }

        System.out.print("Sequência de Fibonacci: { ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + ", ");
        }
        System.out.print("}");
    
        leitor.close();
        
	}
	
}
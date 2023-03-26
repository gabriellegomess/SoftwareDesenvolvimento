import java.util.Scanner;

public class Ex12 {
	
	public static void main(String[] args) {
		
		//Elabore um programa que leia um vetor de 12 elementos apresente na tela o produto dos elementospares positivos (desconsiderar o zero). Exemplo: {0, 5, 8, 1, -6, 4, -7, 9, 10, -14, 3, 12} = 8 * 4 * 10 * 12 = 3840
		
		Scanner leitor = new Scanner(System.in);
		
		int[] num = new int[12];
		int produto = 1;
		
		for(int i = 0; i < 12; i++) {
			
			System.out.println("Digite o "+ (1+i)+ " número: ");
			num[i] = leitor.nextInt();
		}
		
		
		for(int i = 0; i < num.length; i++) {
			
			if(num[i] > 0 && num[i] % 2 == 0) {
			
				produto *= num[i];		
			}		
		}
		
		System.out.println("O produto dos elementos positivos é: "+produto);
		
		leitor.close();
	}
}
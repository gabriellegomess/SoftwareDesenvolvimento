import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		// Elabore um algoritmo que calcule o produto escalar entre dois vetores de inteiros de tamanho igual a 5.Exemplo: {0, 2, 4, 6, 8}, {1, 3, 5, 7, 9} = 0*1 + 2*3 + 4*5 + 6*7 + 8*9 = 140 
	
		int[] a = new int[5];
		int[] b = new int[5];
		int calc1;
		
		
		Scanner leitor = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			
			System.out.println("Informe o "+(i+1)+ " número: ");
			a[i] = leitor.nextInt();
			
		}
		
		for(int i = 0; i < 5; i++) {
			
			System.out.println("Informe o "+(i+1)+ " número: ");
			b[i] = leitor.nextInt();
			
		}
		
		calc1 = (a[0] * b[0]) + (a[1] * b[1]) + (a[2] * b[2]) + (a[3] * b[3]) + (a[4] * b[4]);
		
		System.out.println("RESULTADO: "+calc1);
		
		leitor.close();
		
	}
	
}
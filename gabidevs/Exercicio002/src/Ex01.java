import java.util.Scanner;
public class Ex01 {

	public static void main(String[] args) {
		
		//Escreva um algoritmo que leia uma sequência finita de números e mostre posi�vo, nega�vo ou zero paracada número.
		
		Scanner leitor = new Scanner(System.in);
		int[] num = new int[5];
		
		for(int i = 0; i < 5; i++) {
			
			System.out.println("Digite um numero: ");
			num[i] = leitor.nextInt();
		}	
		for(int i = 0; i < 5; i++) {
			
			if(num[i] > 0) {
				System.out.println("POSITIVO: "+num[i]);
			}
			if(num[i] < 0) {
				System.out.println("NEGATIVO: "+num[i]);
			}
			if(num[i] == 0) {
				System.out.println("ZERO: "+num[i]);
			}
			
		}
		
		leitor.close();
		
	}
	
}
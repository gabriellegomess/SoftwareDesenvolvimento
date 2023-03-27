import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		//ler dois numeros em variavel a e b
		// veja se sao iguais ou diferentes
		// se for igual imprima uma mensagem dizendo que sao iguais, se forem diferentes mostra uma que diga q sao diferentes
		//informe qual dos dois numeros é maior
		
		Scanner leitor = new Scanner(System.in);
		
		int A, B;
		
		System.out.println("Informe o primeiro valor: ");
		A = leitor.nextInt();
		
		System.out.println("Informe o segundo valor: ");
		B = leitor.nextInt();
		
		if(A == B) {
			System.out.println("Os números são iguais. ");
		}else {
			System.out.println("Os números são diferentes.");
		}
		
		if(A > B) {
			System.out.println("O número "+ A + " é maior que o número "+B);
		}
		if(B > A) {	
			System.out.println("O número "+B+ " é maior que o número "+A);
		}
					
		leitor.close();
		
	}

}
 
import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		
		//Leia dois números nas variáveis A e B e iden�fique se os valores são iguais ou diferentes. 
		//Caso eles sejamiguais imprima uma mensagem dizendo que são iguais. Caso sejam diferentes, informe que são diferentes e qualnúmero é o maior
		
		Scanner pnumero = new Scanner(System.in);
		Scanner snumero = new Scanner(System.in);
		
		int A, B;
		
		System.out.println("Informe o primeiro número: ");
		A = pnumero.nextInt();
		
		System.out.println("Informe o segundo número: ");
		B = snumero.nextInt();
		
		if(A > B){
			System.out.println("Os valores são diferentes. O maior é: "+ A );
		}
		if( B > A) {
			System.out.println("Os valores são diferentes. O maior é: "+B);
		}
		if( A == B) {
			System.out.println("Os valores são iguais!");
		}
		
		pnumero.close();
		snumero.close();
		
	}
	
}

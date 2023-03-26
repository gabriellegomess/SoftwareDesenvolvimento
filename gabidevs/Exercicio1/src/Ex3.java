import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
//Escreva um algoritmo que leia os valores de dois números inteiros dis�ntos nas variáveis A e B 
//e informequal deles é o maior. Caso os números sejam iguais informar ao usuário que a sequência de números informados é inválida
		
		Scanner primeiro = new Scanner(System.in);
		Scanner segundo = new Scanner(System.in);
		int a, b;
		
		System.out.println("Informe o primeiro número: ");
		a = primeiro.nextInt();
		
		System.out.println("Informe o segundo número: ");
		b = segundo.nextInt();
		
		if(a > b) {
			System.out.println(/*"Número "+ A +"maior que número "+ B */"A maior que B");
		}
		if(b > a) {
			System.out.println(/*"Número "+ B+ "maior que número "+ A*/ "B maior que A");
		}
		if(a == b) {
			System.out.println("A sequência de números informados é inválida");
		}
		
		primeiro.close();
		segundo.close();
		
	}
	
}

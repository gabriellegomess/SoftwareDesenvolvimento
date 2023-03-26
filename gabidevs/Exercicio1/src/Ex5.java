import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		//Leia valores nas variáveis A e B, e efetue a troca dos valores de forma que o valor da variável A passe a sero valor da variável B e o valor da variável B passe a ser o valor da variável A. 
		//Apresentar uma mensagem com o valor original de cada variável e outra com os valores trocados
		
		Scanner primeiro = new Scanner(System.in);
		Scanner segundo = new Scanner(System.in);
	
		int a, b, c;
		
		
		System.out.println("Informe o primeiro valor: ");
		a = primeiro.nextInt();
	
		
		System.out.println("Informe o segundo valor: ");
		b = segundo.nextInt();
		
		c = a;
		a = b;
		b = c;
		
		System.out.println("⊱⋅ ──────────── ⋅⊰");
		
		System.out.println("Valor original de A: "+ c);
		System.out.println("Valor de A trocado: "+ a);
		System.out.println("Valor original de B: "+ a);
		System.out.println("Valor de B trocado: "+ c);
		
		
		primeiro.close();
		segundo.close();
		
	}
	
}

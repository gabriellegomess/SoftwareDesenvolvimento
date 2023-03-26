import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		// Ler uma temperatura em graus Celsius e apresentá-la conver�da em graus Fahrenheit. A fórmula deconversão é:
		//F = (9 * C + 160) / 5
		
		Scanner temperatura = new Scanner(System.in);
		int C, Fahrenheit;
		
		System.out.println("Informe a temperatuda em Celsius: ");
		C = temperatura.nextInt();
		
		Fahrenheit = (9 * C + 160) / 5;
		
		System.out.println("A temperatuca em Fahrenheit é: "+ Fahrenheit);
		
		temperatura.close();
		
	}
	
}

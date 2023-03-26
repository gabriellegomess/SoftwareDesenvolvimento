import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		
		//Escreva um algoritmo que leia um número e diga, através de uma mensagem, se este número está nointervalo entre 100 e 200. 
		//Caso o número esteja fora do intervalo o usuário também deverá ser informado
		
		Scanner numero = new Scanner(System.in);
		int num;
		
		System.out.println("Informe um número: ");
		num = numero.nextInt();
		
		if(num >= 100 && num <= 200) {
			System.out.println("O número esta no intervalo de 100 a 200!");
		}else {
			System.out.println("O número está fora do intervalo de 100 e 200!");
		}
		
		numero.close(); 
	}
	
}

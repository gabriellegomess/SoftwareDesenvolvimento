import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		//Elabore um algoritmo que receba três notas de um aluno e retorne a sua média aritmética. Exemplo:nota1 = 10.0, nota2 = 5.5, nota3 = 8.0. Média: 7.83
		
		Scanner pnota = new Scanner(System.in);
		Scanner snota = new Scanner(System.in);
		Scanner tnota = new Scanner(System.in);
		
		float nota1, nota2, nota3, media;
		
		System.out.println("Informe a primeira nota do aluno: ");
		nota1 = pnota.nextFloat();
		
		System.out.println("Indorme a segunda nota do aluno: ");
		nota2 = snota.nextFloat();
		
		System.out.println("Informe a terceira nota do aluno: ");
		nota3 = tnota.nextFloat();
		
		media = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("Nota 1: "+ nota1 + ", Nota 2: "+ nota2 + ", Nota 3: "+ nota3 + ". MÉDIA ARITMÉTICA: "+media);
		
		pnota.close();
		snota.close();
		tnota.close();
		
	}
	
}

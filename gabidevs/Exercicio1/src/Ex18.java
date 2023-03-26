
public class Ex18 {

	public static void main(String[] args) {
		
		//Elabore um algoritmo que receba três notas de um aluno e retorne a sua média harmônica.xemplo: nota1 = 10.0, nota2 = 5.5, nota3 = 8.0. Média: 7.37
		
		double nota1, nota2, nota3, media;
		
		nota1 = Console.readDouble("Informe a primeira nota: ");
		nota2 = Console.readDouble("Informe a segunda nota: ");
		nota3 = Console.readDouble("Informe a terceira nota: ");
		
		
		media = 3 / ((1 / nota1) + (1 / nota2) + (1 / nota3));
		
		
		System.out.println("A nota1 é: "+nota1);
		System.out.println("A nota2 é: "+nota2);
		System.out.println("A nota3 é: "+nota3);
		System.out.println("A média pondera é: "+media);
		
	}
	
}
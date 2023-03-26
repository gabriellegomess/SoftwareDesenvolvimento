import java.util.Scanner;

public class ExercicioFix {
	
	public static void main (String[] args) {
			
		
		Scanner leitor = new Scanner(System.in);
		Scanner lernota1 = new Scanner(System.in);
		Scanner lernota2 = new Scanner(System.in);
		Scanner matri =  new Scanner(System.in);
		String nome;
		int matricula;
		int nota1, nota2;
		double notaFinal;
		
		
		System.out.println("Digite o nome do aluno:");
		nome = leitor.nextLine();
		
		System.out.println("Digite a matrícula do aluno:");
		matricula = matri.nextInt();
		
		System.out.println("Digite a primeira nota do aluno:");
		nota1 = lernota1.nextInt();
		
		System.out.println("Digite a segunda nota do aluno:");
		nota2 =  lernota2.nextInt();
		
		System.out.println("Nome do Aluno:"+ nome);
	
		System.out.println("Matrícula do Aluno:"+ matricula);
		
		System.out.println("Primeira nota do Aluno:"+ nota1);
		
		System.out.println("Segunda nota do Aluno:"+ nota2);
		
		
		notaFinal = (nota1 + nota2) / 2;
		
		System.out.println(notaFinal);
		
		if(notaFinal >= 6) {
			System.out.println("APROVADO (x) SIM () NÃO ");
		} else {
			System.out.println("APROVADO () SIM (x) NÃO ");
		}
			
		leitor.close();
		lernota1.close();
		lernota2.close();
		matri.close();
			
	}

}
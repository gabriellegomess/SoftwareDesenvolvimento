import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		
		/*
		 Criar um programa para processar as seguintes informações de um aluno:matrícula, nome , nota 1, nota 2, nota 3, nota 4 e nota 5;
		 O sistema deverá ler as notas do aluno em um vetor e a entrada de dadospelo usuário só poderá ser nos valores de 0 a 10; No final da execução imprimir o seguinte relatório
		 */
		
		Scanner leitor = new Scanner(System.in);
		
		String nome;
		int matricula;
		int[] notas = new int[5];
		
		System.out.println("Informe o nome do aluno: ");
		nome = leitor.nextLine();
		
		System.out.println("Informe a matrícula do aluno: ");
		matricula = leitor.nextInt();
		
		for( int i = 0; i < 5; i++) {
			
			System.out.println("Informe a nota desejada: ");
			notas[i] = leitor.nextInt();
			
			if( notas[i] > 0 && notas[i] < 10) {
				
			}else {
				System.out.println("Nota inválida");
			}
		}
		
		System.out.println("ALUNO: "+nome);
		System.out.println("MATRÍCULA: "+matricula);
		System.out.println("NOTA 1: "+notas[0]);
		System.out.println("NOTA 2: "+notas[1]);
		System.out.println("NOTA 3: "+notas[2]);
		System.out.println("NOTA 4: "+notas[3]);
		System.out.println("NOTA 5: "+notas[4]);
		
		leitor.close();
		
	}
	
}
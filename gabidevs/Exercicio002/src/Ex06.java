import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		//Elabore um programa que leia um vetor com 5 notas de um aluno e um outro vetor com 5 pesos e calculea média ponderada do aluno
		
		double[] notas = new double[5];
		double[] pesos = new double[5];
		double media;
		
		Scanner leitor = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			
			System.out.println("Informe a "+ (i+1)+ " nota: ");
			notas[i] = leitor.nextDouble();
			
			System.out.println("Informe o "+ (i+1)+ " peso:");
			pesos[i] = leitor.nextDouble();
			
		}
		
		media = (notas[0] * pesos[0]) + (notas[1] * pesos[1]) + (notas[2] * pesos[2]) + (notas[3] * pesos[3]) + (notas[4] * pesos[4]) / (pesos[0] + pesos[1] + pesos[2] + pesos[3] + pesos[4]);
		
		System.out.println("A média ponderada é: "+media);
		
		leitor.close();
		
	}
	
}
import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		//Faça um programa que leia um vetor de 5 elementos e, após a leitura, posicione o maior elemento naúltima posição do vetor. Nenhum número do vetor pode ser apagado ou duplicado. Apresente o vetor atualizadona tela
		
		Scanner leitor = new Scanner(System.in);

        int[] vetor = new int[5];

        
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i+1) + "º elemento: ");
            vetor[i] = leitor.nextInt();
        }

        int indiceMaior = 0;

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > vetor[indiceMaior]) {
                indiceMaior = i;
            }
        }

        int aux = vetor[indiceMaior];
        vetor[indiceMaior] = vetor[4];
        vetor[4] = aux;

        System.out.print("Vetor atualizado: { ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.print("}");
  
        leitor.close();
		
	}
	
}

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		//Elabore um algoritmo que leia 5 números do teclado e preencha um vetor de acordo com a seguinte regra:
		//com exceção do 1º número, só é permitido armazenar um número se ele for maior que o anterior. Ex.: se oprimeiro valor lido for 5, o próximo valor lido só poderá ser maior que 5.
		
		Scanner leitor = new Scanner(System.in);

        int[] vetor = new int[5];

        System.out.print("Digite o 1º número: ");
        vetor[0] = leitor.nextInt();

        for (int i = 1; i < vetor.length; i++) {
            int numero;

            do {
                System.out.print("Digite o " + (i+1) + "º número (maior que " + vetor[i-1] + "): ");
                numero = leitor.nextInt();
            } while (numero <= vetor[i-1]);

            vetor[i] = numero;
        }

        System.out.print("Vetor preenchido: { ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.print("}");
    
        leitor.close();
        
	}
}
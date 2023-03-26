import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		//Construa um programa que leia um vetor de 5 elementos e calcule a média destes valores. Na seqüência,apresente na tela os valores que são iguais ou superiores à média
		
		Scanner leitor = new Scanner(System.in);
		
		int[] valor = new int[5];
		double media;
		
		for(int i = 0; i < 5; i++) {
			
			System.out.println("Informe o "+ (i+1) + " valor: ");
			valor[i] = leitor.nextInt();
			
		}
		
		media = (valor[0] + valor[1] + valor[2] + valor[3] + valor[4]) / 5;
		
		System.out.println("A média desses valores é: "+ media);
		
		for (int i = 0; i < valor[i]; i++) {
            if (valor[i] >= media) {
                System.out.print("\n" +valor[i] + " É igual ou superior a média! ");
            }
        }
		
		
		leitor.close();
	}
	
}
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		//Faça um programa que leia dois vetores de 5 elementos cada e verifique se eles são iguais ou não. Paraserem iguais, todos os elementos dos dois vetores devem coincidir
		
		Scanner leitor = new Scanner(System.in);
		
		int[] num = new int [5];
		int[] valor = new int [5];
		
		for(int i = 0; i < 5; i++) {
			
			System.out.println("Informe o "+(i+1)+ " número: ");
			num[i] = leitor.nextInt();
		}
		
		for(int i = 0; i < 5; i++) {
			
			System.out.println("Informe o "+(i+1)+ " número: ");
			valor[i] = leitor.nextInt();
		}
		
		
		/*for(int i; i < num[i]; i ++) {
			
			if(num[i] = valor[i]) {
				
				System.out.println("Iguais");
				
			}else {
				
				System.out.println("Diferentes");
			}
			
		}*/
		
		boolean saoIguais = true;

        for (int i = 0; i < num.length; i++) {
            if (num[i] != valor[i]) {
                saoIguais = false;
                break;
            }
        }

        if (saoIguais) {
            System.out.println("Os vetores são iguais!");
        } else {
            System.out.println("Os vetores são diferentes!");
        }
		
		leitor.close();
		
	}
	
}
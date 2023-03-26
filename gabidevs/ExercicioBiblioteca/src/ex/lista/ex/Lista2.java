package ex.lista.ex;

import java.util.Scanner;

import util.menu.Menu;

public class Lista2 {
	
	static Scanner leitor = new Scanner(System.in);
	//apagar todos os close scanner, e alterar tds os nome do scanner para leitor

	public static void ex01(){
		
		//Escreva um algoritmo que leia uma sequência finita de números e mostre posi�vo, nega�vo ou zero paracada número.
		
				int[] num = new int[5];
				
				for(int i = 0; i < 5; i++) {
					
					System.out.println("Digite um numero: ");
					num[i] = leitor.nextInt();
				}	
				for(int i = 0; i < 5; i++) {
					
					if(num[i] > 0) {
						System.out.println("POSITIVO: "+num[i]);
					}
					if(num[i] < 0) {
						System.out.println("NEGATIVO: "+num[i]);
					}
					if(num[i] == 0) {
						System.out.println("ZERO: "+num[i]);
					}
					
				}
			
			System.out.println("Fim do Exercício!");
				
			Menu.fazernovamente();

	}
	
	public static void ex02() {
		
	}
	
}

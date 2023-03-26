package util.menu;
import java.util.Scanner;

import ex.lista.ex.Lista1;
import ex.lista.ex.Lista2;

public class Listas {

	static Scanner leitor = new Scanner(System.in);
	
	
	public static void qualLista(int op) {
		
		System.out.println("Escolha o exercício: ");
		int opEx = leitor.nextInt();
		if(op == 1) {
			
			switch  (opEx) {
				case 1:
					Lista1.ex01();
					//Menu.fazernovamente();
				break;	
				
				case 2:
					Lista1.ex02();
					//Menu.fazernovamente();
				break;
				
				/*case 3:
					Lista01.ex03();
					Menu.fazernovamente();
				break;
				
				case 4:
					Lista01.ex04();
					Menu.fazernovamente();
				break;
				
				case 5:
					Lista01.ex05();
					Menu.fazernovamente();
				break;*/
				}
			} else if(op == 2) {
				switch  (opEx) {
				case 1:
					Lista2.ex01();
				//	Menu.fazernovamente();
				break;	
				
				case 2:
				//	Lista2.ex02();
				//	Menu.fazernovamente();
				break;
				
				/*case 3:
					Lista01.ex03();
					Menu.fazernovamente();
				break;
				
				case 4:
					Lista01.ex04();
					Menu.fazernovamente();
				break;
				
				case 5:
					Lista01.ex05();
					Menu.fazernovamente();
				break;*/
							
			
			}
		}
		
	}
}	
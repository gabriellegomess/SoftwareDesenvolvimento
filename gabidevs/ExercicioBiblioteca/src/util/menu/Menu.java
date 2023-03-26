package util.menu;
import java.util.Scanner;


public class Menu {

	static Scanner leitor = new Scanner(System.in);
	
	public static void menu() {
				
				System.out.println("Escolha a lista que deseja: ");
				System.out.println("Lista 1 (1): ");
				System.out.println("Lista 2 (2): ");
				int opcao = leitor.nextInt();
				
				Listas.qualLista(opcao);
   }
	
	public static void fazernovamente() {
		
		System.out.println("Deseja fazer um novo exercício? ");
		System.out.println("[1] Sim");
		System.out.println("[2] Não");
		int ex = leitor.nextInt();
		
		if(ex == 1) {
			
			Menu.menu();
			
		}
		else{
			
			System.out.println(("Programa finalizado"));
			
		}
	}
}



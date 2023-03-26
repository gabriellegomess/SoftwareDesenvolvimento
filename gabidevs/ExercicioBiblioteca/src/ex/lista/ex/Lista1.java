package ex.lista.ex;

import java.util.Scanner;

import util.menu.Menu;

public class Lista1 {

	static Scanner leitor = new Scanner(System.in);
	//apagar todos os close scanner, e alterar tds os nome do scanner para leitor

	
	public static void ex01() {
		
		//Escreva um algoritmo que leia um número digitado pelo usuário e 
		//mostre a mensagem “Número maior doque 10! ”, caso este número seja maior, ou “Número menor ou igual a 10! ”, caso este número seja menor ou igual.
		
		double num;
		
		System.out.println("Digite um número!");
		num = leitor.nextDouble();
		
		if(num > 10) {
			System.out.println("Número maior do que 10!");
		} else {
			System.out.println("Número menor ou igual a 10!");
		}
		
		
		System.out.println("Fim do Exercício!");
		
		Menu.fazernovamente();
		
}
	
	public static void ex02() {
		
		//Escreva um algoritmo que leia dois números digitados pelo usuário e exiba o resultado da sua soma.
		

		
		double num1, num2, soma;
		
		System.out.println("Digite o primeiro número: ");
		num1 = leitor.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		num2 = leitor.nextDouble();
		
		soma = num1 + num2;
		
		System.out.println("A soma dos dois número é igual a: "+ soma);
		
	
		System.out.println("Fim do Exercício!");
		
		Menu.fazernovamente();
		
	}
	
	
}

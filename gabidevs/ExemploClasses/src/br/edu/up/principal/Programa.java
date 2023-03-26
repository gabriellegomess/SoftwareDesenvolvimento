package br.edu.up.principal;

import java.util.Scanner;

// poegar função da biblioteca

import br.edu.up.util.Biblioteca;
import br.edu.up.util.Calculadora;

public class Programa {
	
	public static void main(String[] args) {
		
		
		double numero1 = 0;
		double numero2 = 0;
		
		// criação de um objeto chamado leitor 
		
		//uso da palavra new (maior indicativo de que esta criando um objeto)
		
		Scanner leitor = new Scanner(System.in); 
		
		//Usar o método nextInt()
	
		System.out.println("Informe o número 1: ");
		numero1 = leitor.nextDouble(); 
		
		// objeto: leitor
		// método nextInt();
		
		System.out.println("Informe o número 2: ");
		numero2 = leitor.nextDouble();
		
		//int resultado = numero1 + numero2;
		
		//PROGRAMAÇÃO FUNCIONAR!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		
		//Uso da biblioteca para realizar as funções
		
		/*double resultado = Biblioteca.somar(numero1 + numero2);
		System.out.println("O resultado da soma é: "+resultado);
		
		resultado = Biblioteca.subtrair(numero1 - numero2);
		System.out.println("O resultado da subtração é: "+resultado);
		
		resultado = Biblioteca.multiplicar(numero1 * numero2);
		System.out.println("O resultado da multiplicação é: "+resultado);
		
		resultado = Biblioteca.dividir(numero1 / numero2);
		System.out.println("O resultado da divisão é: "+resultado); */
		
		
		
		
		
		//PROGRAMAÇÃO ORIENTADA A OBJETOSS!!!!!!!
		//Uso do objeto calculadora para realizar as operações
		
		Calculadora calc = new Calculadora();
		
		double resultado = calc.somar(numero1, numero2);
		System.out.println("O resultado da soma é: "+resultado);
		
		resultado = calc.subtrair(numero1, numero2);
		System.out.println("O resultado da subtração é: "+resultado);
		
		resultado = calc.multiplicar(numero1, numero2);
		System.out.println("O resultado da multiplicação é: "+resultado);
		
		resultado = calc.dividir(numero1, numero2);
		System.out.println("O resultado da divisão é: "+resultado);
		
		
		//Uso do método close;
		leitor.close();
		
		
		//criar pacotes inversos ex: globo.com --> pacote com.globo
		
	}
	/*
	//funçao que pertence a classe somar e retorna um valor
	
	public static int somar(int a, int b) {
		return a + b;
	}
	
	// agora pode ser feita de outra forma o programa ali de cima
	/*
	int resultado = somar(numero1 + numero2);
	System.out.println("O resultado é: "+resultado); */
	
}

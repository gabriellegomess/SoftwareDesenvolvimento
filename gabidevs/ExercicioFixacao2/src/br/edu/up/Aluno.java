package br.edu.up;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//import br.edu.up.entidades;


public class Aluno {

	/*Dado o arquivo de texto alunos.csv, crie um programa para ler todos osregistros de alunos incluindo os atributos matrícula, nome e nota dos alunosem uma classe chamada Aluno.java;*/
	/*Após a leitura e o processamento do texto, grave em um arquivo: 
	 a quantidade de alunos na turma, quantos foram aprovados com nota igual ousuperior a 6,0, quantos foram reprovados, a menor nota da turma, a maiornota e a média geral*/
	
	public static void main(String[] args) throws FileNotFoundException {
		
		String arquivoOrigem = "C:\\_src\\gabidevs\\ExercicioFixacao2";
		
		File arquivo = new File(arquivoOrigem);
		Scanner leitor = new Scanner(arquivo);
		
		while(leitor.hasNextLine()) {
			
			String linha = leitor.nextLine();
			String[] vetor = linha.split(";");
			
			
			
		}
	}
	
}


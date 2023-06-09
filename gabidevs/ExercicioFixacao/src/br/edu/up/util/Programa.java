package br.edu.up.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		String arquivoOrigem = "C:\\_src\\gabidevs\\ExercicioFixacao\\grupos-tabulados.txt";
		
		File arquivo = new File(arquivoOrigem);
		Scanner leitor = new Scanner(arquivo);
		

		Formatter gravador = new Formatter( "C:\\_src\\gabidevs\\ExercicioFixacao\\relatorio.txt"); //exercicio 6
		
		int totalGrupo[] = {0,0,0,0,0,0};
				
		
		while(leitor.hasNextLine()) {
			String linha = leitor.nextLine();
			String[] valores = linha.split("\t"); 
			
	
			switch(valores[0]) {
				
			case "A":
				totalGrupo[0] += Integer.parseInt(valores[1]);
			break;
			
			case "B":
				totalGrupo[1] += Integer.parseInt(valores[1]);
			break;
			
			case "C":
				totalGrupo[2] += Integer.parseInt(valores[1]);
			break;
			
			case "D":
				totalGrupo[3] += Integer.parseInt(valores[1]);
			break;
			
			case "E":
				totalGrupo[4] += Integer.parseInt(valores[1]);
			break;
			
			case "F":
				totalGrupo[5] += Integer.parseInt(valores[1]);
			break;
			
			}
			
		}		//exercicio 5
			/*System.out.println("Soma dos Grupos");
			System.out.println("Grupo A: "+totalGrupo[0]);
			System.out.println("Grupo B: "+totalGrupo[1]);
			System.out.println("Grupo C: "+totalGrupo[2]);
			System.out.println("Grupo D: "+totalGrupo[3]);
			System.out.println("Grupo E: "+totalGrupo[4]);
			System.out.println("Grupo F: "+totalGrupo[5]);
			System.out.println();		*/
			
			gravador.format("\nGrupo A: "+totalGrupo[0]);
			gravador.format("\nGrupo B: "+totalGrupo[1]);
			gravador.format("\nGrupo C: "+totalGrupo[2]);
			gravador.format("\nGrupo D: "+totalGrupo[3]);
			gravador.format("\nGrupo E: "+totalGrupo[4]);
			gravador.format("\nGrupo E: "+totalGrupo[5]);
			
			
			int totalGeral = 0;
			for( int i = 0; i < totalGrupo.length;i++) {
				totalGeral += totalGrupo[i];
			}
			
			/*System.out.println("Total de todos os grupos: "+totalGeral);*/ //exercicio 5 
			
			gravador.format("\nTotal de todos os grupos: "+totalGeral);
			
			leitor.close();
			gravador.close();
	
	}

}
	
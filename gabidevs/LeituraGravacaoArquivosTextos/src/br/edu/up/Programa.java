package br.edu.up;
import java.util.Formatter;
import java.io.File; /* importar o arquivo */
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) throws FileNotFoundException{ //caso o arquivo n esteja la ele vai dar esse erro de não encontrado 

		//Leitura do arquivo
		String arquivoOrigem = "C:\\_src\\gabidevs\\LeituraGravacaoArquivosTextos\\src\\arquivo.txt";
		File arquivo = new File(arquivoOrigem); // entre "" e com duas \\
		Scanner leitor = new Scanner(arquivo);
		
		//gravador de arquivo
		String arquivoDestino = "C:\\_src\\gabidevs\\LeituraGravacaoArquivosTextos\\src\\destino.txt";
		Formatter gravador = new Formatter(arquivoDestino);
		
		while(leitor.hasNextLine()) { 	//ler o arquivo enqto tiver uma linha texto
			String linha = leitor.nextLine();
			String[] vetor = linha.split(" "); //no momento q achar o espaço ele vai quebrar (vai quebrar a linha no epsaço)
			
			//Imprimir rodar no terminal
			System.out.println("\nNome completo: "+linha);
			System.out.println("Primeiro nome: "+vetor[0]); // para ler o primeiro nome le apenas o primeiro vetor
			System.out.println("Sobrenome: "+ vetor[1]); // para pegar o sobrenome pega o segundo vetor
			
			//Gravar no arquivo destino
			gravador.format("Nome completo: "+linha );
			gravador.format("Primeiro nome: "+vetor[0]);
			gravador.format("Sobrenome: "+ vetor[1]);
			gravador.format("\n");
		/*
			for(int i = 0; i < linha.length(); i++) {
				
				char caractere = linha.charAt(i); // capturo o caracter na posição q ta percorrendo a linha, pega cada caracter (qntas letras tem o nome)
				System.out.println("Caractere: "+caractere);
			} */
			
			System.out.println("Tamanaho: "+linha.length()); // (mostra: comprimento, quantidade de caracteres)
		}
		
		leitor.close();
		gravador.close();
		
	}

}


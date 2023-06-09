package br.edu.up;
import br.edu.up.entidades.Produto;
import java.io.File;
import java.util.Formatter;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class Programa {
	/*
	public static void main(String[] args) {
		
		Produto meuProduto = new Produto(); //criando um objeto chamada produto
		
		//alta capacidade de agrupar valores distintos
		//atribuindo ao objetos produto os valores(int, etc) da entidade produto obs: começa a manipular varios tipos e variaveis 
		meuProduto.codigo = 1;
		meuProduto.nome = "Computador";
		meuProduto.marca = "Dell";
		meuProduto.preco = 3000.00;
		
		//voce pode reutilizar o seu tipo "ex: produto" para outros "produtos"
		Produto seuProduto = new Produto();
		
		seuProduto.codigo = 2;
		seuProduto.nome = "Iphone";
		seuProduto.marca = "Apple";
		seuProduto.preco = 5000.00;
		
		System.out.println("Meu produto");
		System.out.println("Código: "+meuProduto.codigo);
		System.out.println("Nome: "+meuProduto.nome);
		System.out.println("Marca: "+meuProduto.marca);
		System.out.println("Preço: "+meuProduto.preco);
		System.out.println();
		
		System.out.println("Seu produto");
		System.out.println("Código: "+seuProduto.codigo);
		System.out.println("Nome: "+seuProduto.nome);
		System.out.println("Marca: "+seuProduto.marca);
		System.out.println("Preço: "+seuProduto.preco);
		System.out.println();
		
		
	} */
//caso ja exista o arquivo de texto ou a gnt tenha q importar sem precisar criar um por um	
	public static void main(String[] args) throws FileNotFoundException {
		
		String arquivoOrigem = "C:\\_src\\gabidevs\\EntidadesExemplo\\src\\produtos.csv";
		File arquivo = new File(arquivoOrigem);
		Scanner leitor = new Scanner(arquivo);
		
		String arquivoDestino ="C:\\_src\\gabidevs\\EntidadesExemplo\\src\\relatorio.csv"; 
		Formatter gravador = new Formatter(arquivoDestino);
		
		Produto[] vetorDeProdutos = new Produto[4]; // o 4 ta ali pq sabemos q só tem dois produtos || com esse vetor de produtos vc pode manipular melhor
		
		int index = 0;
		
		while(leitor.hasNextLine()) {
			String linha = leitor.nextLine();
			String[] valores = linha.split(";"); /*vai quebrar a linha em cada ; que tiver */
			
			Produto produto = new Produto();
			produto.codigo = Integer.parseInt(valores[0]);
			produto.nome = valores[1];
			produto.marca = valores[2];
			produto.preco = Double.parseDouble(valores[3]);
			vetorDeProdutos[index] = produto;
			index++;
		}
		
		int quantidade = 0;
		double totalProdutos = 0;
		
		for (int i = 0; i < vetorDeProdutos.length; i++) {
			
			Produto produto = vetorDeProdutos[i];
			
			System.out.println("Produto");
			System.out.println("Código: "+produto.codigo);
			System.out.println("Nome: "+produto.nome);
			System.out.println("Marca: "+produto.marca);
			System.out.println("Preço: "+produto.preco);
			System.out.println();
			
			gravador.format("Produto");
			gravador.format("Código: "+produto.codigo);
			gravador.format("Nome: "+produto.nome);
			gravador.format("Marca: "+produto.marca);
			gravador.format("Preço: "+produto.preco);
	
			quantidade++;
			totalProdutos += produto.preco;
		}
		
		System.out.println("Quantidade dos Produtos: "+quantidade);
		System.out.println("Total dos Preços: "+totalProdutos);
		
		leitor.close();
		gravador.close();
	}

}


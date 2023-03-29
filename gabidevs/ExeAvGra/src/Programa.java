import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;
import br.edu.up.Dados2;


public class Programa {

	public static void main(String[] args) throws FileNotFoundException  {
		
		//String arquivoOrigem = "C:\\_src\\SoftwareDesenvolvimento\\gabidevs\\ExeAvGra\\src\\clientes.csv";
		File arquivo = new File("C:\\_src\\SoftwareDesenvolvimento\\gabidevs\\ExeAvGra\\src\\clientes.csv"); 
		Scanner leitorDe = new Scanner(arquivo);
		leitorDe.nextLine();
		
		
		Scanner leitor = new Scanner(System.in);
			
		Formatter gravador = new Formatter("C:\\_src\\SoftwareDesenvolvimento\\gabidevs\\ExeAvGra\\src\\clientes-1000a2000.txt");
	
		Dados2[] vetorDeCliente = new Dados2[4];
		
		double valor1;
		double valor2;
		System.out.println("Informe o primeiro valor desejado: ");
		valor1 = leitor.nextDouble();
		
		System.out.println("Informe o segundo valor desejado: ");
		valor2 = leitor.nextDouble();
		
		//vetor[0] = cpf
		//vetor[1] = nome
		//vetor[2] = codigo
		//vetor[3] = credito
		
		leitorDe.hasNextLine();
		
		while(leitorDe.hasNextLine()) {
			String linha = leitorDe.nextLine();
			String[] valores = linha.split(";");
			
			//System.out.println(leitorDe.nextLine());
			
			double credito = Double.parseDouble(valores[3]);
			
			Dados2 cliente = new Dados2();
		
			//cliente.NOME = valores[1];
			
			/*cliente.CPF = Integer.parseInt(valores[0]);
			cliente.NOME = valores[1];
			cliente.CODIGO = Integer.parseInt(valores[2]);
			cliente.CREDITO = Double.parseDouble(valores[3]);
			*/
			
			if(credito >= valor1 && credito <= valor2)   {
				System.out.println("\nCPF"+ valores[0]);
				System.out.println("NOME: "+valores[1]);
				System.out.println("CODIGO: "+ valores[2]);
				System.out.println("CREDITO: "+ valores[3]); 
				System.out.println();
				System.out.println("Valor inicial: "+valor1);
				System.out.println("Valor inicial: "+valor2); 
				System.out.println();
				
				
			}else {
				System.out.println("Não encontrado");
			}
	
			gravador.format("CPF; "+valores[0]);
			gravador.format("NOME; "+valores[1]);
			gravador.format("CODIGO; "+valores[2]);
			gravador.format("CREDITO; "+valores[3]);
			gravador.format("Valor inicial; "+ valor1);
			gravador.format("Valor final; "+valor2);
			gravador.format("\n");
			
		}
		
		leitor.close();
		gravador.close();
		leitorDe.close();
		
	}
}
		
		
/*	while(leitorDe.hasNextLine()) {
String linha = leitorDe.nextLine();
String[] valores = linha.split(";");
double credito = Double.parseDouble(valores[3]);

Dados2 cliente = new Dados2();

if(credito <= valor1 && credito >= valor2) {
System.out.println("Nenhum cliente encontrado");
}
if(credito >= valor1 && credito <= valor2)  {

gravador.format("\nCPF; "+cliente.CPF);
gravador.format("\nNOME; "+cliente.NOME);
gravador.format("\nCODIGO; "+cliente.CODIGO);
gravador.format("\nCREDITO; "+cliente.CREDITO);
gravador.format("\nValor inicial; "+ valor1);
gravador.format("\nValor final; "+valor2);
//menor q 1000 maior que 5000
}
}*/

		
		
	/*Dado o arquivo clientes.csv, escreva um programa em Java que leia dois valores digitados pelo usuário, 
filtre na lista de clientes apenas os clientes cujo crédito esteja entre esses dois valores e grave os clientes filtrados em um arquivo de texto específico. 

Por exemplo, se o usuário digitar o valorInicial = 1000,00 e valorFinal = 2000,00, 
os clientes do arquivo clientes.csv cujo valor de crédito estejam entre R$ 1000,00 e R$ 2000,00 devem ser gravados no arquivo: clientes-1000a2000.txt

Se o usuário digitar valores de crédito que não retorne nenhum cliente, o 
programa deverá apenas informar que não foram encontrados clientes na faixa de crédito informada.*/

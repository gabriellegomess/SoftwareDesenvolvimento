import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;
import java.io.File;

public class Programa {

	public static void main(String[] args) throws FileNotFoundException {
/*Como ler arquivos de texto?
		File arquivo = new File("C:\\_src\\gabidevs\\LeituraGravacaoArquivosTextos\\src\\arquivo.txt");
		
		Scanner leitor = new Scanner(arquivo);
		
		while (leitor.hasNext()) {
			
			System.out.println(leitor.nextLine());
			
			}
		arquivo.close();
		leitor.close();
		*/
		
		//Como gravar arquivos de dados?
		
		Formatter gravador = new Formatter("C:\\GitHub\\SoftwareDesenvolvimento\\TesteGravador\\TestesGravador\\src\\gravador.txt");
		Scanner leitor = new Scanner(System.in);
		
		String nome;
		
		for (int i = 0; i <= 10; i++) {
			System.out.println("Gravando número: "+ i);
			gravador.format("Gravando número: "+ i);
			
			//numero dado pelo user
			
			System.out.println("Informe o nome do usuário: ");
			nome = leitor.nextLine();
			gravador.format(nome);
			
		} 
		
		while(leitor.hasNextLine()) {
			System.out.println(leitor.nextLine());
			
			//String linha = leitor.nextLine();
			//String[] vetor = linha.split(" ");
			
		}
		
		leitor.close();
		gravador.close();
		
		}
	
}


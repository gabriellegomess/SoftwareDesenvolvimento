
public class Ex13 {

	public static void main(String[] args) {
		//Escreva um algoritmo que leia valores REAIS nas variáveis A e B e o tipo de operador em outra variável dotipo CARACTERE. 
		//Imprima o resultado da operação de A por B se o operador aritmético for válido 
		//caso contráriodeve ser impresso uma mensagem de operador não definido. Tratar erro de divisão por zero
		
		float A, B;
		char op;
		
		do {
			
			A = Console.readFloat("Informe o numero A: ");
			B = Console.readFloat("Informe o numero B: ");
			op = Console.readChar("Informe a operação:\n+ para soma\n- para subtração\n* para multiplicação\n/ para divisão");
			
			switch(op) {
			
			case('+'):
				System.out.println("Resultado soma: "+(A+B));
				break;
			case('-'):
				System.out.println("Resultado subtração: "+(A-B));
				break;
			case('*'):
				System.out.println("Resultado multiplicação: "+(A*B));
				break;
			case('/'):
				System.out.println("Resultado divisão: "+(A/B));
				break;
			default:
				System.out.println("A operação inserida é inválida\n");
			
			}
		}while(op != '+' || op != '-' || op != '*' || op != '/');
		
	}
	
}
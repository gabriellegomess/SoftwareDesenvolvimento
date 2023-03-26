

public class Ex14 {

	public static void main(String[] args) {
		
		//A expressão an = a1 + (n – 1) * r é denominada termo geral da Progressão Aritmética (PA). 
		//Nesta fórmula,temos que an é o termo de ordem n (n-ésimo termo), r é a razão e a1 é o primeiro termo da Progressão Aritmética.
		//Escreva um algoritmo que encontre o n-ésimo termo de uma progressão aritmética. Exemplo: a1 = 10, n = 7, r = 3.Resultado: an = 28
		
		float a1, n, r;
		
		a1 = Console.readFloat("Informe o primeiro termo da P.A: ");
		n = Console.readFloat("Informe a posição do enésimo termo: ");
		r = Console.readFloat("(Informe a razão da P.A: ");
		
		System.out.println("O enésimo termo dessa P.A é: "+ (a1+(n-1)*r));
		
	}
	
}
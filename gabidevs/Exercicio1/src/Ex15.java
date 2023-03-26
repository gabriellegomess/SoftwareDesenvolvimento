
public class Ex15 {

	public static void main(String[] args) {
		
		//Tendo como dados de entrada dois pontos quaisquer no plano, P1(x1, y1) e P2(x2,y2), 
		//calcule e retorne adistância entre eles. A fórmula que efetua tal cálculo é: d = raiz ( ( ( x2 - x1 ) ^ 2 ) + ( ( y2 - y1 ) ^ 2 ) )
		//Exemplo: p1(0, 5), p2(10, 20). Distancia: 18,03
	
		int x1, y1, x2, y2;
		
		x1 = Console.readInt("Informe o valor de X do Ponto 1: ");
		y1 = Console.readInt("Informe o valor de Y do Ponto 1: ");
		x2 = Console.readInt("Informe o valor X do Ponto 2: ");
		y2 = Console.readInt("Informe o valor de Y do Ponto 2: ");
		
		System.out.println(Math.sqrt( Math.pow(x2-x1,  2) + Math.pow(y2-y1, 2)));
		
		// Math.sqrt = raiz quadrada
		// Math.pow = potência (aqueles 2 dps do x - x, y-y é a elevação da potencia
		
		
	}
	
}
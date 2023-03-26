
public class Ex10J {

	public static void main(String[] args) {
		
		int num;
		
		num = Console.readInt("Informe o número: ");
		
		switch(num) {
		case(1):
			System.out.println("Um");
			break;
		case(2):
			System.out.println("Dois");
			break;
		case(3):
			System.out.println("Três");
			break;
		case(4):
			System.out.println("Quatro");
			break;
		case(5):
			System.out.println("Cinco");
			break;
		default:
			System.out.println("Número Inválido!");
		}
		
	}
	
}
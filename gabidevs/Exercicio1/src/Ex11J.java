
public class Ex11J {

	public static void main(String[] args) {
		
		//Escreva um algoritmo que leia três valores inteiros dis�ntos e escreva-os em ordem crescente
		
		int num1, num2, num3;
		
		num1 = Console.readInt("Informe o primeiro número: ");
		num2 = Console.readInt("Informe o segundo número: ");
		num3 = Console.readInt("Informe o terceiro número: ");
		
		if(num1 >= num2 && num1 >= num3) {
			if(num2 >= num3) {
				System.out.println(num3 +" "+num2+" "+num1);
			}else {
				System.out.println(num2+" "+num3+" "+num1);
			}
		}
		
		if(num2 >= num1 && num2 >= num3) {
			if(num1 >= num3) {
				System.out.println(num3 +" "+num1+" "+num2);
			}else {
				System.out.println(num1+" "+num3+" "+num2);
			}
		}
		
		if(num3 >= num1 && num3 >= num2) {
			if(num1 >= num2) {
				System.out.println(num2+" "+num1+" "+num3);
			}else {
				System.out.println(num1+" "+num2+" "+num3);
			}
		}
		
	}
	
}
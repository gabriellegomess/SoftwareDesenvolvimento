
public class Ex20 {

	public static void main(String[] args) {
		
		//Elabore um algoritmo que calcule a quantidade de litros de combustível gasta em uma viagem, 
		//utilizandoum automóvel que faz 12km por litro e considerando que são fornecidos o tempo em hora e a velocidade média daviagem.
		
		float velocm, horas;
		
		velocm = Console.readFloat("Informe a velocidade média do veículo: ");
		horas = Console.readFloat("Informe quantas horas de viagem: ");
		
		System.out.println("Foram gastos "+((velocm/horas)/12)+" litros de combustível na viagem");
					
	}
	
}
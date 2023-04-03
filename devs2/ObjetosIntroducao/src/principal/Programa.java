package principal;
import principal.modelos.*;

public class Programa {

	public static void main(String[] args) {
		
		Bicicleta minhaBike = new Bicicleta();
		
		//neste momento, na hora da criação
		
		minhaBike.setModelo("Caloi"); 
		
		minhaBike.setVelocidade(0);
		
		minhaBike.setMarcha(1);
		
		minhaBike.setPedaladasPorMinuto(0);
				
		//Imprimir os dados da Bike
		System.out.println("Modelo: "+ minhaBike.getModelo());
		System.out.println("Velocidade: "+ minhaBike.getVelocidade());
		System.out.println("Marcha: "+ minhaBike.getMarcha());
		System.out.println("Pedaladas por minuto: "+ minhaBike.getPedaladasPorMinuto());
		
		
		//daqui 20 minutos por exemplo
		//minhaBike.setVelocidade(20); 
		
		
	
	}
	
}

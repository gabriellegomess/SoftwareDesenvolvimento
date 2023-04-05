package principal;
import principal.modelos.*;

public class Programa {

	public static void main(String[] args) {
		
		//não é o caso aqui da bike de pegar a roda dianteria ser diferente da trasseira, mas supondo que fosse algo como uma empresa de celular e fosse iphone por exemplo,
		//como que ele puxaria tipo iphone x, iphone z, com todos eles estando dentor da classe iphone, tendo tamanho, cor, preço
		//ma hora de definir 
		//se bem q n precisaria pq vc daria os valores direto no set e get ou n, n sei
		
		Quadro quadroMinhaBike = new Quadro();
		
		quadroMinhaBike.setCor("Azul");
		quadroMinhaBike.setModelo("Caloi");
		quadroMinhaBike.setTamanho("Grande");
		
		Roda rodaMinhaBike = new Roda();
		
		rodaMinhaBike.setCor("Amarelo");
		rodaMinhaBike.setModelo("Caloi");
		rodaMinhaBike.setTamanho("Pequeno");
		
		System.out.println("Cor do Quadro: "+ quadroMinhaBike.getCor());
		System.out.println("Modelo do Quadro: "+ quadroMinhaBike.getModelo());
		System.out.println("Tamanho do Quadro: "+ quadroMinhaBike.getTamanho());
		System.out.println();
		
		System.out.println("Cores das rodas: "+ rodaMinhaBike.getCor());
		System.out.println("Modelos das rodas: "+ rodaMinhaBike.getModelo());
		System.out.println("Tamanho das rodas: "+ rodaMinhaBike.getTamanho());
		System.out.println();
		
		System.out.println("=====================================");
		
		Bike minhaBike = new Bike();
		
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

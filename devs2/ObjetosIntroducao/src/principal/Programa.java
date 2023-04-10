package principal;
import principal.modelos.*;

public class Programa {

	public static void main(String[] args) {
			
		//neste momento, na hora da criação
		
		Bike minhaBike = new Bike();
	
		minhaBike.setModelo("Caloi"); 		
		minhaBike.setVelocidade(0);	
		minhaBike.setMarcha(1);	
		minhaBike.setPedaladasPorMinuto(0);
		
		Quadro quadro = new Quadro();
		
		quadro.setCor("Azul");
		quadro.setModelo("Caloi");
		quadro.setTamanho("Grande");
		
		minhaBike.setQuadro(quadro); //!!!!!!!!
		
		Roda rodaDianteira = new Roda();
		
		rodaDianteira.setCor("Amarelo");
		rodaDianteira.setModelo("Caloi");
		rodaDianteira.setTamanho("Pequeno");
		
		minhaBike.setRodaDianteira(rodaDianteira); //!!!!!!!!
		minhaBike.setRodaTrasseira(rodaDianteira); //!!!!!!!!
		
		Roda rodaTrasseira = new Roda();
		
		rodaTrasseira.setCor("Amarelo");
		rodaTrasseira.setModelo("Caloi");
		rodaTrasseira.setTamanho("Pequeno");
		
		minhaBike.setRodaDianteira(rodaTrasseira); //!!!!!!!!
		minhaBike.setRodaTrasseira(rodaTrasseira); //!!!!!!!!
	
		
		System.out.println("================= QUADRO ====================");
		
		
		System.out.println("Cor do Quadro: "+ minhaBike.getQuadro().getCor());
		System.out.println("Modelo do Quadro: "+ minhaBike.getQuadro().getModelo());
		System.out.println("Tamanho do Quadro: "+ minhaBike.getQuadro().getTamanho());
		System.out.println();
		
		System.out.println("============== RODAS DIANTERIAS ====================");
		
		System.out.println("Cores das rodas dianteiras: "+ minhaBike.getRodaDianteira().getCor());
		System.out.println("Modelos das rodas dianteiras: "+ minhaBike.getRodaDianteira().getModelo());
		System.out.println("Tamanho das rodas dianteiras: "+ minhaBike.getRodaDianteira().getTamanho());
		System.out.println();
		
		System.out.println("============== ROTAS TRASSEIRAS ====================");
		
		System.out.println("Cores das rodas trasseiras: "+ minhaBike.getRodaTrasseira().getCor());
		System.out.println("Modelos das rodas trasseiras: "+ minhaBike.getRodaTrasseira().getModelo());
		System.out.println("Tamanho das rodas trasseiras: "+ minhaBike.getRodaTrasseira().getTamanho());
		System.out.println();
		
		System.out.println("================= BIKE ====================");
		//Imprimir os dados da Bike
		System.out.println("Modelo: "+ minhaBike.getModelo());
		System.out.println("Velocidade: "+ minhaBike.getVelocidade());
		System.out.println("Marcha: "+ minhaBike.getMarcha());
		System.out.println("Pedaladas por minuto: "+ minhaBike.getPedaladasPorMinuto());
		
		
		//daqui 20 minutos por exemplo
		//minhaBike.setVelocidade(20); 
		
		
	
	}
	
}

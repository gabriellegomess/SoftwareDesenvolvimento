package principal;

import java.util.List;

import java.util.ArrayList;

import principal.modelos.*;

public class Programa {

	public static void main(String[] args) {
		
		Bike bikeNormal = new Bike();
		BikeDeTrilha bikeTrilha = new BikeDeTrilha();
		
		bikeTrilha.setModelo("Monark"); //chamou o modelo q é da bike, mas ele usa no de trilha pq ele herdou
		
		BikeDePasseio bikePasseio = new BikeDePasseio();
	}
	
	
	
	
//	  public static void main(String[] args) {
//	  
//	  Ingrediente molho = new Ingrediente("Molho", "Tomate");
//	  Ingrediente queijo = new Ingrediente("Queijo", "Parmessão");
//	  
//	  //adc com lista
//	  
//		List<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
//		ingredientes.add(molho);
//		ingredientes.add(queijo);
//
//		Pizza pizzaDeQueijo = new Pizza("Queijo");
//		pizzaDeQueijo.setIngredientes(ingredientes); 		
//		pizzaDeQueijo.adicionar(molho);
//		pizzaDeQueijo.adicionar(queijo);
//
//		
//		//IMPRIMIR INGREDIENTES DA PIZZA
//		
//		System.out.println("Pizza: " + pizzaDeQueijo.getNome());
//		
//		//FOR BÁSICO
//		for(int i = 0; i < pizzaDeQueijo.getIngredientes().size(); i++) {
//			Ingrediente ingrediente = pizzaDeQueijo.getIngredientes().get(i);
//			System.out.println("Nome ingrediente: " + ingrediente.getNome());
//			System.out.println("Descrição ingrediente: " + ingrediente.getDescricao());
//		}
//		
//		//FOR AVANÇADO
//		for(Ingrediente ingrediente : pizzaDeQueijo.getIngredientes()) {
//			System.out.println("Nome ingrediente: " + ingrediente.getNome());
//			System.out.println("Descrição ingrediente: " + ingrediente.getDescricao());
//	}

	 

//	
//	public static void main(String[] args) {
//	 
//	  //Quadro quadro = new Quadro("Caloi", "Azul", "Grande");
//	  
//	  //Roda rodaDianteira = new Roda("Verde", "Caloi", "Medio");
//	  
//	  //Roda rodaTrasseira = new Roda("Amarela", "Caloi", "Medio");
//	  
//	  
//	  Bike minhaBike = new Bike("Calor", 0, 1,0, new Quadro("Caloi", "Azul",
//	  "Grande"), new Roda("Verde", "Caloi", "Medio"), new Roda("Amarela", "Caloi",
//	  "Medio")); //pela ordem do construtor da pra saber qual roda viria primeiro
//	 
//	  
//	  //pintando a bike de amarelo minhaBike.getQuadro().setCor("Amerela");
//	  //alterou a cor do quadro //get esta sendo usado para pegar o quadro, e o SET
//	  para inserir a cor que quer
//	  
//	  
//	  //neste momento, na hora da criação
//	  
//	  
//	  minhaBike.setModelo("Caloi"); minhaBike.setVelocidade(0);
//	  minhaBike.setMarcha(1); minhaBike.setPedaladasPorMinuto(0);
//	  
//	  Quadro quadro = new Quadro();
//	  
//	  quadro.setCor("Amarelo"); quadro.setModelo("Caloi");
//	  quadro.setTamanho("Pequeno"); minhaBike.setQuadro(quadro);
//	  
//	  Roda rodaDianteira = new Roda();
//	  
//	  rodaDianteira.setCor("Amarelo"); rodaDianteira.setModelo("Caloi");
//	  rodaDianteira.setTamanho("Pequeno");
//	  
//	  minhaBike.setRodaDianteira(rodaDianteira); //!!!!!!!!
//	  minhaBike.setRodaTrasseira(rodaDianteira); //!!!!!!!!
//	 
//	  Roda rodaTrasseira = new Roda();
//	 
//	  rodaTrasseira.setCor("Amarelo"); rodaTrasseira.setModelo("Caloi");
//	  rodaTrasseira.setTamanho("Pequeno");
//	  
//	  minhaBike.setRodaDianteira(rodaTrasseira); //!!!!!!!!
//	  minhaBike.setRodaTrasseira(rodaTrasseira); //!!!!!!!!
//	  
//	  
//	  System.out.println("================= QUADRO ====================");
//	  
//	  
//	  System.out.println("Cor do Quadro: "+ minhaBike.getQuadro().getCor());
//	  System.out.println("Modelo do Quadro: "+ minhaBike.getQuadro().getModelo());
//	  System.out.println("Tamanho do Quadro: "+
//	  minhaBike.getQuadro().getTamanho()); System.out.println();
//	 
//	  System.out.println("============== RODAS DIANTERIAS ====================");
//	  
//	  System.out.println("Cores das rodas dianteiras: "+
//	 minhaBike.getRodaDianteira().getCor());
//	  System.out.println("Modelos das rodas dianteiras: "+
//	  minhaBike.getRodaDianteira().getModelo());
//	  System.out.println("Tamanho das rodas dianteiras: "+
//	  minhaBike.getRodaDianteira().getTamanho()); System.out.println();
//	  
//	  System.out.println("============== ROTAS TRASSEIRAS ====================");
//	  
//	  System.out.println("Cores das rodas trasseiras: "+
//	 minhaBike.getRodaTrasseira().getCor());
//	  System.out.println("Modelos das rodas trasseiras: "+
//	  minhaBike.getRodaTrasseira().getModelo());
//	  System.out.println("Tamanho das rodas trasseiras: "+
//	  minhaBike.getRodaTrasseira().getTamanho()); System.out.println();
//	  
//	  System.out.println("================= BIKE ===================="); //Imprimir os dados da Bike System.out.println("Modelo: "+ minhaBike.getModelo());
//	  System.out.println("Velocidade: "+ minhaBike.getVelocidade());
//	  System.out.println("Marcha: "+ minhaBike.getMarcha());
//	  System.out.println("Pedaladas por minuto: "+
//	  minhaBike.getPedaladasPorMinuto());
//	  
//	 
//	  //daqui 20 minutos por exemplo //minhaBike.setVelocidade(20);
//	  
//	  
//	  
	  }
	 
}

package principal;
import principal.modelos.*;

public class Programa {

	public static void main(String[] args) {
		//o main sempre pertence ao programa(principal)
		
		//neste momento, na hora da criação dos dados etc
		
		//nome do objeto(classe) nome que o objeto vei ter
		
		Pessoa eu = new Pessoa();
		
		eu.setCPF("458958545");
		eu.setNome("Gabi");
		eu.setPeso(54);
		eu.setIdade(18);

		Pessoa voce = new Pessoa();
		
		voce.setCPF("45487");
		voce.setNome("Michael");
		voce.setPeso(78);
		voce.setIdade(23);
		
		Pessoa pessoaPedro = new Pessoa();
		
		pessoaPedro.setNome("Pedro");
		pessoaPedro.setCPF("154886");
		pessoaPedro.setPeso(86);
		pessoaPedro.setIdade(45);
		
		Pessoa pessoaAna = new Pessoa();
		
		pessoaAna.setNome("Ana");
		pessoaAna.setCPF("554387436");
		pessoaAna.setPeso(32);
		pessoaAna.setIdade(25);
		
		Pessoa pessoaCarlos = new Pessoa();
		
		pessoaCarlos.setNome("Carlos");
		pessoaCarlos.setCPF("5545446");
		pessoaCarlos.setPeso(154);
		pessoaCarlos.setIdade(65);
		
		Pessoa tu = new Pessoa();
		
		tu.setNome("Marcos");
		tu.setCPF("9787485");
		tu.setPeso(65);
		tu.setIdade(41);
		
		Pessoa ele = new Pessoa();
		
		ele.setNome("Miguel");
		ele.setCPF("25433");
		ele.setPeso(87);
		ele.setIdade(12);
		
		
		//Imprimindo os dados criados
		
		System.out.println("Meu nome: "+ eu.getNome());
		System.out.println("Meu CPF: "+ eu.getCPF());
		System.out.println("Meu peso: "+ eu.getPeso());
		System.out.println("Minha Idade: "+ eu.getIdade());
		System.out.println();
		
		System.out.println("Seu nome: "+ voce.getNome());
		System.out.println("Seu CPF: "+ voce.getCPF());
		System.out.println("Seu peso: "+ voce.getPeso());
		System.out.println("Sua Idade: "+ voce.getIdade());
		System.out.println();
		
		System.out.println("Nome Pedro: "+ pessoaPedro.getNome());
		System.out.println("CPF Pedro: " + pessoaPedro.getCPF());
		System.out.println("Peso Pedro: "+ pessoaPedro.getPeso());
		System.out.println("Idade Pedro: "+ pessoaPedro.getIdade());
		System.out.println();
		
		System.out.println("Nome Ana: "+ pessoaAna.getNome());
		System.out.println("CPF Ana: "+ pessoaAna.getCPF());
		System.out.println("Peso Ana: "+ pessoaAna.getPeso());
		System.out.println("Idade Ana: "+ pessoaAna.getIdade());
		System.out.println();
		
		System.out.println("Nome Carlos: "+ pessoaCarlos.getNome());
		System.out.println("CPF Carlos: "+ pessoaCarlos.getCPF());
		System.out.println("Peso Carlos: "+ pessoaCarlos.getPeso());
		System.out.println("Idade Carlos: "+ pessoaCarlos.getIdade());
		System.out.println();
			
		System.out.println("Nome Tu: "+ tu.getNome());
		System.out.println("CPF Tu: "+ tu.getCPF());
		System.out.println("Peso Tu: "+ tu.getPeso());
		System.out.println("Idade Tu: "+ tu.getIdade());
		System.out.println();
		
		System.out.println("Nome Ele: "+ ele.getNome());
		System.out.println("CPF Ele: "+ ele.getCPF());
		System.out.println("Peso Ele: "+ ele.getPeso());
		System.out.println("Idade Ele: "+ ele.getIdade());
		System.out.println();
		
		
	}
	
}

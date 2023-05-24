package principal;

import java.util.Iterator;
import java.util.List;

import jakarta.persistence.*;
import principal.modelos.Pessoa;


public class Programa {
	
	static EntityManagerFactory emf;
	static EntityManager em;
	
	
	public static void main(String[] args) {
		
		//Configuração do JPA
		emf = Persistence.createEntityManagerFactory("ex_mysql");
		em = emf.createEntityManager();
		
		//Criação do objeto pessoa
		Pessoa salvar = new Pessoa("Lucas", "555");
			
		
		//salvar
		salvar(salvar);
		
		
		
		//Buscar pessoa pelo ID
		Pessoa buscar = buscarPorId(4);
		
		
		System.out.println();
		System.out.println("---------------------------");
		System.out.println();
		
		System.out.println("ID: "+buscar.getId()  
							+" Nome: "+buscar.getNome() 
							+" CPF: "+ buscar.getCpf() );
		
		System.out.println();
		System.out.println("---------------------------");
		System.out.println();
		
		
		//atualizar os dados
		
		buscar.setNome("Joao Alterado");
		atualizar(buscar);
		
		
		//excluir pessoas
		
		excluir(10);
		
		
		//listar pessoas
		List<Pessoa> lista = listar();
		for (Pessoa pessoa : lista) {
			System.out.println("ID: "+pessoa.getId()  
								+" Nome: "+pessoa.getNome() 
								+
								"  CPF: "+ pessoa.getCpf() );
		}
		System.out.println();
		System.out.println("---------------------------");
		System.out.println("Deu tudo certo!");
		System.out.println("---------------------------");
		System.out.println();

		//atualizar
		
		
		//Encerrar a conexão com o banco de dados
		em.close();
		emf.close();
		
	}
	
	public static List<Pessoa> listar(){
		
		List<Pessoa> lista = em.createQuery("from Pessoa", Pessoa.class).getResultList();
		return lista;
	}
	
	
	public static Integer salvar(Pessoa pessoa) {
		
		//Gravar no banco de dados
			em.getTransaction().begin();
			em.persist(pessoa);
			em.getTransaction().commit();
			return pessoa.getId();
					
	}
	
	
	public static Pessoa buscarPorId(Integer id) {
		Pessoa pessoa = em.find(Pessoa.class, id);
		return pessoa;
		
	}
	
	
	public static void atualizar(Pessoa pessoa) {
		em.getTransaction().begin();
		em.merge(pessoa);
		em.getTransaction().commit();
	}
	
	
	public static void excluir(Integer id) {
		Pessoa pessoa = em.find(Pessoa.class, id);
		em.getTransaction().begin();
		em.remove(pessoa);
		em.getTransaction().commit();
	}
		
}

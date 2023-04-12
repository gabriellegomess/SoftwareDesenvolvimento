package principal;

import java.util.List;

import principal.modelos.Ingrediente;

import java.util.ArrayList;

public class Pizza {
	
	private String nome;
	private List<Ingrediente> ingredientes = new ArrayList<Ingrediente>(); 
	
	public Pizza() {
		//ingredientes.get(3);  --> pegar um ingrediente de uma posição especifica
	}
	
	public Pizza(String nome) {
		this.nome = nome;
	}
	
	public void adicionar(Ingrediente ingrediente) {
		this.ingredientes.add(ingrediente); //adicionando um ingrediente em uma lista de ingredientes
		}
	
	public void remover(Ingrediente ingrediente) {
		this.ingredientes.remove(ingrediente);  //removendo um ingrediente da lista 
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public List<Ingrediente> getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(List<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}

}

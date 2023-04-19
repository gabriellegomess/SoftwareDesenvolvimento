package br.edu.up.db;

import java.util.ArrayList;
import java.util.List;

import br.edu.up.modelos.Pessoa;

public class BancoDeDados {
	
	private List<Pessoa> pessoas;
	
	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public BancoDeDados() {
		pessoas = new ArrayList<>();
		pessoas.add(new Pessoa("Pedro", "123456"));
		pessoas.add(new Pessoa("Ana", "123455"));
	}
	
	
	

}

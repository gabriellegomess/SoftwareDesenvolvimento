package principal.modelos;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	private String nome;
	private String CPF;

	public Pessoa() {
	}

	public Pessoa(String nome, String CPF) {
		this.nome = nome;
		this.CPF = CPF;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
	@Override
	public String toString() {
		return "Pessoa {id = " + getId() + ", nome = " + nome + ", cpf = " + CPF + "}";
	}
}

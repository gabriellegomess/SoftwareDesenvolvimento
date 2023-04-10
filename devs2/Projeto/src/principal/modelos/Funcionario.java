package principal.modelos;

import java.time.LocalDate;
import java.time.LocalTime;

public class Funcionario {
	
	private Pessoa pessoa;
	private LocalDate dataAdmissao;
	private LocalTime horarioEntrada;
	private LocalTime horarioSaida;
	
	public void setPessoa(String pessoa) {
		this.pessoa = pessoa;
	}
	
	public void setDataAdmissao(LocalDate dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	
	public void setHorarioEntrada(LocalTime horarioEntrada) {
		this.horarioEntrada = horarioEntrada;
	}
	
	
	public void setHorarioSaida(LocalTime horarioSaida) {
		this.horarioSaida = horarioSaida;
	}
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	
	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}
	
	public LocalTime getHorarioEntrada() {
		return horarioEntrada;
	}
	
	public LocalTime getHorarioSaida() {
		return horarioSaida;
	}
}	
	
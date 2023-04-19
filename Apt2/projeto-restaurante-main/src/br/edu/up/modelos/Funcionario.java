package br.edu.up.modelos;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Funcionario {

	private LocalDate dataAdmissao;
	private String horarioEntrada;
	private String horarioSaida;
	private BigDecimal salario;

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	
	public void registrarEntrada(LocalDateTime horario) {
		//TODO: escrever lógica...
	}
	
	public void registrarSaida(LocalDateTime horario) {
		//TODO: escrever lógica...
	}

	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(LocalDate dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public String getHorarioEntrada() {
		return horarioEntrada;
	}

	public void setHorarioEntrada(String horarioEntrada) {
		this.horarioEntrada = horarioEntrada;
	}

	public String getHorarioSaida() {
		return horarioSaida;
	}

	public void setHorarioSaida(String horarioSaida) {
		this.horarioSaida = horarioSaida;
	}
}

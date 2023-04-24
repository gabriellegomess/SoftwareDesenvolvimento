package br.edu.up.modelos;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Pedido {

	// Cliente?
	// Garçom?
	// Itens?
	private LocalDateTime dataHora;
	private BigDecimal total;
	private PedidoStatus status;

	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public PedidoStatus getStatus() {
		return status;
	}

	public void setStatus(PedidoStatus status) {
		this.status = status;
	}

}

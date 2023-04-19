package principal.modelos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import principal.controles.ControleDeAcesso;
import principal.controles.ControleDePedidos;

public class Pedido {

	public enum Status {
		ABERTO,
		CONCLUIDO,
		CANCELADO
	}
	
	private Integer codigo;
	private LocalDateTime data;
	private double total;
	private Usuario vendedor;
	private Cliente cliente;
	private List<Produto> produtos;
	private Status status;
	
	public Pedido() {
		this.setStatus(Status.ABERTO);
		this.codigo = ControleDePedidos.getNovoCodigo();
		this.vendedor = ControleDeAcesso.usuarioLogado;
		this.produtos = new ArrayList<>();
		this.data = LocalDateTime.now();
		this.total = 0;
	}
	
	public Pedido(Integer codigo, Usuario vendedor) {
		this();
		this.codigo = codigo;
		this.vendedor = vendedor;
	}

	public Usuario getVendedor() {
		return vendedor;
	}

	public void setVendedor(Usuario vendedor) {
		this.vendedor = vendedor;
	}
	
	
	public String getDataLonga() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		return data.format(dtf);
	}
	
	public String getDataCurta() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return data.format(dtf);
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}
	
	public void setData(int dia, int mes, int ano, int hora, int minuto) {
		this.data = LocalDateTime.of(ano, mes, dia, hora, minuto);
	}
	
	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void adicionar(Produto produto) {
		this.total += produto.getPreco();
		this.produtos.add(produto);
	}
	
	public void remover(Produto produto) {
		this.total -= produto.getPreco();
		this.produtos.remove(produto);
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Pedido [codigo = "+ codigo + ", status = "+ status + ", data = " + getDataCurta() + ", total = " + total 
				+ ", " + vendedor 
				+ ", " + cliente
				+ ", " + produtos + "]";
	}
}

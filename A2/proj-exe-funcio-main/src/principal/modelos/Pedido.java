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
	
	public Integer codigo;
	public LocalDateTime data;
	public double total;
	public Usuario vendedor;
	public Cliente cliente;
	public List<Produto> produtos;
	public Status status;
	
	public Pedido() {
		this.status = Status.ABERTO;
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
	
	public String getDataLonga() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		return data.format(dtf);
	}
	
	public String getDataCurta() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return data.format(dtf);
	}

	public void setData(int dia, int mes, int ano, int hora, int minuto) {
		this.data = LocalDateTime.of(ano, mes, dia, hora, minuto);
	}
	
	public void adicionar(Produto produto) {
		this.total += produto.preco;
		this.produtos.add(produto);
	}
	
	public void remover(Produto produto) {
		this.total -= produto.preco;
		this.produtos.remove(produto);
	}
	
	@Override
	public String toString() {
		return "Pedido {codigo = "+ codigo + ", status = "+ status + ", data = " + getDataCurta() + ", total = " + total 
				+ ", " + vendedor 
				+ ", " + cliente
				+ ", " + produtos + "}";
	}
	
	public String toCSV() {
		String jsProdutos = "";
		for (int i = 0; i < produtos.size(); i++) {
			jsProdutos += (i > 0 ? "&" : "") + produtos.get(i).toJS();
		}
        return codigo + ";" + status + ";" + getDataLonga() + ";" + total 
				+ ";" + cliente.toJS()
				+ ";" + vendedor.toJS()
				+ ";[" + jsProdutos + "]";
	}
}

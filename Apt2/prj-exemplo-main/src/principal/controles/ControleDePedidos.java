package principal.controles;

import java.util.List;

import principal.modelos.Pedido;
import principal.util.Session;

public class ControleDePedidos {
	
	private List<Pedido> pedidos;
	
	public ControleDePedidos() {
		this.pedidos = Session.banco.getPedidos();
	}
	
	public void adicionar(Pedido pedido) {
		this.pedidos.add(pedido);
	}
	
	public Pedido buscar(Integer codigo) {
		for (Pedido pedido : this.pedidos) {
			if (pedido.getCodigo() == codigo) {
				return pedido;
			}
		}
		return null;
	}
	
	public static Integer getNovoCodigo() {
		Integer novoCodigo = 0;
		if (Session.banco != null) {
			for (Pedido pedido : Session.banco.getPedidos()) {
				if (pedido.getCodigo() > novoCodigo) {
					novoCodigo = pedido.getCodigo();
				}
			}
		}
		return novoCodigo + 1;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public void cancelar(Integer codigo, Pedido pedidoCancelar) {
		for (int i = 0; i < pedidos.size(); i++) {
			Pedido pedido = pedidos.get(i);
			if (pedido.getCodigo() == codigo) {
				this.pedidos.set(i, pedidoCancelar);
				break;
			}
		}
	}
}
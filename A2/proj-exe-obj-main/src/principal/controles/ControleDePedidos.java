package principal.controles;

import java.util.List;

import principal.db.BancoFactory;
import principal.modelos.Pedido;

public class ControleDePedidos {

	private static ControleDePedidos instance;
	
	private List<Pedido> pedidos;
	
	private ControleDePedidos() {
		this.pedidos = BancoFactory.getInstance().getPedidos();
	}
	
	public static synchronized ControleDePedidos getInstance() {
		if (instance == null) {
			instance = new ControleDePedidos();
		}
		return instance;
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

	public Integer getNovoCodigo() {
		Integer novoCodigo = 0;
		for (Pedido pedido : pedidos) {
			if (pedido.getCodigo() > novoCodigo) {
				novoCodigo = pedido.getCodigo();
			}
		}
		return novoCodigo + 1;
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

	public List<Pedido> getPedidos() {
		return pedidos;
	}
}
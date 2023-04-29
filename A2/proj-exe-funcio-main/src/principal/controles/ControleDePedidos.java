package principal.controles;

import principal.db.Banco;
import principal.modelos.Pedido;
import principal.modelos.Produto;

public class ControleDePedidos {
	
	public static Pedido pedido;

	public static void adicionar(Pedido pedido) {
		Banco.pedidos.add(pedido);
	}
	
	public static void adicionar(Produto produto) {
		ControleDePedidos.pedido.adicionar(produto);
	}

	public static Pedido buscar(Integer codigo) {
		for (Pedido pedido : Banco.pedidos) {
			if (pedido.codigo == codigo) {
				return pedido;
			}
		}
		return null;
	}

	public static Integer getNovoCodigo() {
		Integer novoCodigo = 0;
		for (Pedido pedido : Banco.pedidos) {
			if (pedido.codigo > novoCodigo) {
				novoCodigo = pedido.codigo;
			}
		}
		return novoCodigo + 1;
	}

	public static void cancelar(Integer codigo, Pedido pedidoCancelar) {
		for (int i = 0; i < Banco.pedidos.size(); i++) {
			Pedido pedido = Banco.pedidos.get(i);
			if (pedido.codigo == codigo) {
				Banco.pedidos.set(i, pedidoCancelar);
				break;
			}
		}
	}
}
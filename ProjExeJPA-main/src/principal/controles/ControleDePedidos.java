package principal.controles;

import java.util.List;

import principal.daos.DAO;
import principal.daos.PedidoDAO;
import principal.modelos.Pedido;
import principal.modelos.Pedido.Status;

public class ControleDePedidos {

	private static ControleDePedidos instance;
	
	private DAO<Pedido> dao = new PedidoDAO();
	
	private ControleDePedidos() {}
	
	public static synchronized ControleDePedidos getInstance() {
		if (instance == null) {
			instance = new ControleDePedidos();
		}
		return instance;
	}

	public List<Pedido> listar() {
		return dao.listar();
	}
	
	public Pedido buscar(Long id) {
		return dao.buscarPorId(id);
	}
	
	public void adicionar(Pedido pedido) {
		dao.salvar(pedido);
	}

	public void cancelar(Pedido pedido) {
		pedido.setStatus(Status.CANCELADO);
		dao.atualizar(pedido);
	}
}
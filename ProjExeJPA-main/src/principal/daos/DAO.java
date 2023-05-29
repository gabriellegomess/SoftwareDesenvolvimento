package principal.daos;

import java.util.List;
import java.util.Map;

public interface DAO<T> {
	
	T salvar(T entidade);
	T atualizar(T entidade);
	T buscarPorId(Long id);
	T buscarPorQuery(String query);
	T buscarPorQuery(String query, Map<String, Object> params);
	List<T> listar();
	void excluir(Long id);
}

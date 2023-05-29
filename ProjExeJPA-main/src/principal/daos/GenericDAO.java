package principal.daos;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.persistence.*;


public abstract class GenericDAO<T> implements DAO<T> {

	private Class<T> persistedClass;
	protected EntityManager entityManager;

	@SuppressWarnings("unchecked")
	protected GenericDAO() {
		Type t = getClass().getGenericSuperclass();
		ParameterizedType pt = (ParameterizedType) t;
		persistedClass = (Class<T>) pt.getActualTypeArguments()[0];
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ExemploJPA");
		entityManager = emf.createEntityManager();
	}

	public T buscarPorId(Long id) {
		return entityManager.find(persistedClass, id);
	} 

	@SuppressWarnings("unchecked")
	public T buscarPorQuery(String query) {
		Query q = entityManager.createQuery(query, persistedClass);
		List<T> list = q.getResultList();
		if (list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public T buscarPorQuery(String query, Map<String, Object> params) {
		Query q = entityManager.createQuery(query, persistedClass);
		if (params != null) {
			for (Iterator<Entry<String, Object>> it = params.entrySet().iterator(); it.hasNext();) {
				Entry<String, Object> param = (Entry<String, Object>) it.next();
				q.setParameter((String) param.getKey(), param.getValue());
			}
		}
		return (T) q.getSingleResult();
	}

	public List<T> listar() {
		String query = "from " + persistedClass.getName();
		return entityManager.createQuery(query, persistedClass).getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<T> listarPorQuery(String query) {
		Query q = entityManager.createQuery(query, persistedClass);
		return q.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<T> listarPorQuery(String query, Map<String, Object> params) {
		Query q = entityManager.createQuery(query, persistedClass);
		if (params != null) {
			for (Iterator<Entry<String, Object>> it = params.entrySet().iterator(); it.hasNext();) {
				Entry<String, Object> param = (Entry<String, Object>) it.next();
				q.setParameter((String) param.getKey(), param.getValue());
			}
		}
		return q.getResultList();
	}

	public T salvar(T entidade) {
		EntityTransaction t = entityManager.getTransaction();
		t.begin();
		entityManager.persist(entidade);
		entityManager.flush();
		t.commit();
		return entidade;
	}

	public void excluir(Long id) {
		T entidade = buscarPorId(id);
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		T mergedEntity = entityManager.merge(entidade);
		entityManager.remove(mergedEntity);
		entityManager.flush();
		tx.commit();
	}

	public T atualizar(T entidade) {
		EntityTransaction t = entityManager.getTransaction();
		t.begin();
		entityManager.merge(entidade);
		entityManager.flush();
		t.commit();
		return entidade;
	}
}
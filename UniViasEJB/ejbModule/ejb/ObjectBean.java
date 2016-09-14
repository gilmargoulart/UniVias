package ejb;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import exemplo.GenericObject;

/**
 * Session Bean implementation class UniversitarioBean
 */
@Stateless
@LocalBean
public class ObjectBean<T> implements ObjectBeanLocal<T> {
	
	@PersistenceContext(name="UniviasContext")
	private EntityManager em;
	
    /**
     * Default constructor. 
     */
    public ObjectBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void save(GenericObject<T> o) {
		//Verificar se o objeto já existe
		if (em.find(GenericObject.class, o.getId()) == null) {
			// Inserir novo...
			em.persist(o);
		} else {
			// Salvar existente...
			em.merge(o);
		}
	}

	@Override
	public void remove(GenericObject<T> o) {
		em.remove(o);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<GenericObject<T>> getAll() {
		Query q = em.createNamedQuery("getAllInquilino");
		return q.getResultList();
	}
}

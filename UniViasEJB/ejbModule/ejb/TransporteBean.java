package ejb;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import model.Transporte;



@Stateless
@LocalBean

public class TransporteBean implements TransporteBeanLocal {
	
	
	@PersistenceContext(name="UniviasContext")
	private EntityManager em;
	
    /**
     * Default constructor. 
     */
    public TransporteBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void save(Transporte transporte) {
		//Verificar se o objeto já existe
		if (em.find(Transporte.class, transporte.getId()) == null){
			//Inserir novo...
			em.persist(transporte);
		} else {
			//Salvar existente...
			em.merge(transporte);
		}
	}

	@Override
	public void remove(Transporte transporte) {
		em.remove(transporte);
	}

	@Override
	public List<Transporte> getAll() {
		Query q = em.createNamedQuery("getAllTransporte");
		return q.getResultList();
	}

	@Override
	public List<Transporte> getTop10() {
		Query q = em.createNamedQuery("getAllTransporte");
		q.setMaxResults(10);
		return q.getResultList();
	}

}

package ejb;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import model.Universitario;

@Stateless
@LocalBean
public class UniversitarioBean implements UniversitarioBeanLocal {
	
	@PersistenceContext(name="UniviasContext")
	private EntityManager em;
	
    /**
     * Default constructor. 
     */
    public UniversitarioBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void save(Universitario universitario) {
		//Verificar se o objeto já existe
		if (em.find(Universitario.class, universitario.getId()) == null){
			//Inserir novo...
			em.persist(universitario);
		} else {
			//Salvar existente...
			em.merge(universitario);
		}
	}

	@Override
	public void remove(Universitario universitario) {
		em.remove(universitario);
	}

	@Override
	public List<Universitario> getAll() {
		Query q = em.createNamedQuery("getAllUniversitario");
		return q.getResultList();
	}

	/*@Override
	public List<Universitario> getTop10() {
		Query q = em.createNamedQuery("getAllInquilino");
		q.setMaxResults(10);
		return q.getResultList();
	}*/



}

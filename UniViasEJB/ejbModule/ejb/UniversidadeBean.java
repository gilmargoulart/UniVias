package ejb;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


import model.Universidade;

@Stateless
@LocalBean

public class UniversidadeBean implements UniversidadeBeanLocal {
	
	@PersistenceContext(name="UniviasContext")
	private EntityManager em;
	
    /**
     * Default constructor. 
     */
    public UniversidadeBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void save(Universidade universidade) {
		//Verificar se o objeto já existe
		if (em.find(Universidade.class, universidade.getId()) == null){
			//Inserir novo...
			em.persist(universidade);
		} else {
			//Salvar existente...
			em.merge(universidade);
		}
	}

	@Override
	public void remove(Universidade universidade) {
		em.remove(universidade);
	}

	@Override
	public List<Universidade> getAll() {
		Query q = em.createNamedQuery("getAllUniversidade");
		return q.getResultList();
	}

	@Override
	public List<Universidade> getTop10() {
		Query q = em.createNamedQuery("getAllUniversidade");
		q.setMaxResults(10);
		return q.getResultList();
	}

}

package ejb;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


import model.Setor;

@Stateless
@LocalBean
public class SetorBean implements SetorBeanLocal {
	
	@PersistenceContext(name="UniviasContext")
	private EntityManager em;
	
    /**
     * Default constructor. 
     */
    public SetorBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void save(Setor setor) {
		//Verificar se o objeto já existe
		if (em.find(Setor.class, setor.getId()) == null){
			//Inserir novo...
			em.persist(setor);
		} else {
			//Salvar existente...
			em.merge(setor);
		}
	}

	@Override
	public void remove(Setor setor) {
		em.remove(setor);
	}

	@Override
	public List<Setor> getAll() {
		Query q = em.createNamedQuery("getAllSetor");
		return q.getResultList();
	}

	@Override
	public List<Setor> getTop10() {
		Query q = em.createNamedQuery("getAllSetor");
		q.setMaxResults(10);
		return q.getResultList();
	}

}

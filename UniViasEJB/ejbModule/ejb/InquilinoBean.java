package ejb;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import model.Inquilino;

/**
 * Session Bean implementation class InquilinoBean
 */
@Stateless
@LocalBean
public class InquilinoBean implements InquilinoBeanLocal {
	
	@PersistenceContext(name="UniviasContext")
	private EntityManager em;
	
    /**
     * Default constructor. 
     */
    public InquilinoBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void save(Inquilino inquilino) {
		//Verificar se o objeto já existe
		if (em.find(Inquilino.class, inquilino.getId()) == null){
			//Inserir novo...
			em.persist(inquilino);
		} else {
			//Salvar existente...
			em.merge(inquilino);
		}
	}

	@Override
	public void remove(Inquilino inquilino) {
		em.remove(inquilino);
	}

	@Override
	public List<Inquilino> getAll() {
		Query q = em.createNamedQuery("getAllInquilino");
		return q.getResultList();
	}

	@Override
	public List<Inquilino> getTop10() {
		Query q = em.createNamedQuery("getAllInquilino");
		q.setMaxResults(10);
		return q.getResultList();
	}

	@Override
	public List<Inquilino> getAllByName(String nome) {
		Query q = em.createNamedQuery("getAllInquilinoByName");
		
		//Ajustar like
		q.setParameter("nome", String.format("%%s", nome));
		/*
		q.setMaxResults(10);
		q.setFirstResult(0);
		*/
		
		return q.getResultList();
	}
}

package ejb;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import model.Financeiro;

@Stateless
@LocalBean
public class FinanceiroBean implements FinanceiroBeanLocal {
	
	@PersistenceContext(name="UniviasContext")
	private EntityManager em;
	
    /**
     * Default constructor. 
     */
    public FinanceiroBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void save(Financeiro financeiro) {
		//Verificar se o objeto já existe
		if (em.find(Financeiro.class, financeiro.getId()) == null){
			//Inserir novo...
			em.persist(financeiro);
		} else {
			//Salvar existente...
			em.merge(financeiro);
		}
	}

	@Override
	public void remove(Financeiro financeiro) {
		em.remove(financeiro);
	}

	@Override
	public List<Financeiro> getAll() {
		Query q = em.createNamedQuery("getAllFinanceiro");
		return q.getResultList();
	}

	@Override
	public List<Financeiro> getTop10() {
		Query q = em.createNamedQuery("getAllFinanceiro");
		q.setMaxResults(10);
		return q.getResultList();
	}

}

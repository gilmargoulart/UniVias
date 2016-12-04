package ejb;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import model.Motorista;

@Stateless
public class MotoristaBean implements MotoristaBeanLocal {
	
	@PersistenceContext(name="UniviasContext")
	private EntityManager em;
	
    /**
     * Default constructor. 
     */
    public MotoristaBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void save(Motorista motorista) {
		//Verificar se o objeto já existe
		if (em.find(Motorista.class, motorista.getId()) == null){
			//Inserir novo...
			em.persist(motorista);
		} else {
			//Salvar existente...
			em.merge(motorista);
		}
	}

	@Override
	public void remove(Motorista motorista) {
		em.remove(motorista);
	}

	@Override
	public List<Motorista> getAll() {
		Query q = em.createNamedQuery("getAllMotorista");
		return q.getResultList();
	}
	
	/*@Override
	public List<Inquilino> getTop10() {
		Query q = em.createNamedQuery("getAllInquilino");
		q.setMaxResults(10);
		return q.getResultList();
	}*/

}

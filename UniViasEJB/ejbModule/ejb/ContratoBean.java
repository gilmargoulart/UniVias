package ejb;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import model.Contrato;

@Stateless
//@LocalBean
public class ContratoBean implements ContratoBeanLocal {

	@PersistenceContext(name = "UniviasContext")
	private EntityManager em;

	/**
     * Default constructor. 
     */
    public ContratoBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void save(Contrato contrato) {
		// Verificar se o objeto já existe
		if (em.find(Contrato.class, contrato.getId()) == null) {
			// Inserir novo...
			em.persist(contrato);
		} else {
			// Salvar existente...
			em.merge(contrato);
		}
	}

	@Override
	public void remove(Contrato contrato) {
		if (!em.contains(contrato)) {
			contrato = em.merge(contrato);
		}
		em.remove(contrato);
	}

	@Override
	public List<Contrato> getAll() {
		Query q = em.createNamedQuery("getAllContrato");
		return q.getResultList();
	}
}

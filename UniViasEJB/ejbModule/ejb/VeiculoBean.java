package ejb;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import model.Veiculo;

@Stateless
@LocalBean
public class VeiculoBean implements VeiculoBeanLocal {

	@PersistenceContext(name = "UniviasContext")
	private EntityManager em;

	/**
	 * Default constructor.
	 */
	public VeiculoBean() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void save(Veiculo veiculo) {
		// Verificar se o objeto já existe
		if (em.find(Veiculo.class, veiculo.getId()) == null) {
			// Inserir novo...
			em.persist(veiculo);
		} else {
			// Salvar existente...
			em.merge(veiculo);
		}
	}

	@Override
	public void remove(Veiculo veiculo) {
		em.remove(veiculo);
	}

	@Override
	public List<Veiculo> getAll() {
		Query q = em.createNamedQuery("getAllVeiculo");
		return q.getResultList();
	}
}

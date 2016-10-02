package ejb;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import model.Localizacao;

@Stateless
@LocalBean

public class LocalizacaoBean implements LocalizacaoBeanLocal {
	
	@PersistenceContext(name="UniviasContext")
	private EntityManager em;
	
    /**
     * Default constructor. 
     */
    public LocalizacaoBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void save(Localizacao localizacao) {
		//Verificar se o objeto já existe
		if (em.find(Localizacao.class, localizacao.getId()) == null){
			//Inserir novo...
			em.persist(localizacao);
		} else {
			//Salvar existente...
			em.merge(localizacao);
		}
	}

	@Override
	public void remove(Localizacao localizacao) {
		em.remove(localizacao);
	}

	@Override
	public List<Localizacao> getAll() {
		Query q = em.createNamedQuery("getAllInquilino");
		return q.getResultList();
	}

	/*@Override
	public List<Inquilino> getTop10() {
		Query q = em.createNamedQuery("getAllInquilino");
		q.setMaxResults(10);
		return q.getResultList();
	}*/

}

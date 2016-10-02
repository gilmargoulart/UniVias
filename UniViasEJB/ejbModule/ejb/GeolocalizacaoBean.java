package ejb;

import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import model.Geolocalizacao;

@Stateless
@LocalBean
public class GeolocalizacaoBean implements GeolocalizacaoBeanLocal  {

	@PersistenceContext(name="UniviasContext")
	private EntityManager em;
	
    /**
     * Default constructor. 
     */
    public GeolocalizacaoBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void save(Geolocalizacao geolocalizacao) {
		//Verificar se o objeto já existe
		if (em.find(Geolocalizacao.class, geolocalizacao.getId()) == null){
			//Inserir novo...
			em.persist(geolocalizacao);
		} else {
			//Salvar existente...
			em.merge(geolocalizacao);
		}
	}

	@Override
	public void remove(Geolocalizacao geolocalizacao) {
		em.remove(geolocalizacao);
	}

	@Override
	public List<Geolocalizacao> getAll() {
		Query q = em.createNamedQuery("getAllInquilino");
		return q.getResultList();
	}
}

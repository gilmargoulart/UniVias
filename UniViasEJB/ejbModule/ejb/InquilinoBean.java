package ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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
		// TODO Auto-generated method stub
		
	}
}

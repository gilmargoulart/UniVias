package ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Session Bean implementation class ClienteBean
 */
@Stateless
@LocalBean
public class ClienteBean implements ClienteBeanLocal {
	
	//Conexão.
	@PersistenceContext(name = "UniviasContext")
	private EntityManager em;
	
    /**
     * Default constructor. 
     */
    public ClienteBean() {
        // TODO Auto-generated constructor stub
    }

}

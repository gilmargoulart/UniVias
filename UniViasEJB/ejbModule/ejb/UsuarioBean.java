package ejb;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


import model.Usuario;

@Stateless
@LocalBean
public class UsuarioBean implements UsuarioBeanLocal {
	
	
	@PersistenceContext(name="UniviasContext")
	private EntityManager em;
	
    /**
     * Default constructor. 
     */
    public UsuarioBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void save(Usuario usuario) {
		//Verificar se o objeto já existe
		if (em.find(Usuario.class, usuario.getId()) == null){
			//Inserir novo...
			em.persist(usuario);
		} else {
			//Salvar existente...
			em.merge(usuario);
		}
	}

	@Override
	public void remove(Usuario usuario) {
		em.remove(usuario);
	}

	@Override
	public List<Usuario> getAll() {
		Query q = em.createNamedQuery("getAllUsuario");
		return q.getResultList();
	}


}

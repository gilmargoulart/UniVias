package ejb;

import java.util.List;

import javax.ejb.Local;

import model.Usuario;

@Local

public interface UsuarioBeanLocal {

	void save(Usuario usuraio);

	void remove(Usuario usuario);

	List<Usuario> getAll();

}

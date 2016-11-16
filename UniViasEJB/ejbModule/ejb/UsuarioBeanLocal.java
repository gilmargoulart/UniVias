package ejb;

import java.util.List;

import javax.ejb.Local;

import model.Usuario;

@Local
public interface UsuarioBeanLocal {
	
	public void criarUsuario(String nome, String usuario, String senha);
	
	public Usuario validaUsuario(String usuario, String senha);
	
	public void save(Usuario usuario);

	public void remove(Usuario usuario);

	public List<Usuario> getAll();

}

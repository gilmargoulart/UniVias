package ejb;

import java.util.List;

import javax.ejb.Local;

import model.Universitario;

@Local
public interface UniversitarioBeanLocal {

	public void save(Universitario universitario);

	public void remove(Universitario universitario);

	public List<Universitario> getAll();

}

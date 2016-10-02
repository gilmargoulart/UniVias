package ejb;

import java.util.List;

import javax.ejb.Local;

import model.Universitario;

@Local

public interface UniversitarioBeanLocal {

	void save(Universitario universitario);

	void remove(Universitario universitario);

	List<Universitario> getAll();

}

package ejb;

import java.util.List;

import javax.ejb.Local;

import model.Universidade;

@Local

public interface UniversidadeBeanLocal {

	void save(Universidade universidade);

	void remove(Universidade universidade);

	List<Universidade> getAll();

	List<Universidade> getTop10();

}

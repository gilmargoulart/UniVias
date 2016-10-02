package ejb;

import java.util.List;

import javax.ejb.Local;

import model.Universidade;

@Local
public interface UniversidadeBeanLocal {

	public void save(Universidade universidade);

	public void remove(Universidade universidade);

	public List<Universidade> getAll();

	public List<Universidade> getTop10();

}

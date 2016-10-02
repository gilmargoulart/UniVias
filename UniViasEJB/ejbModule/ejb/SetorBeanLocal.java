package ejb;

import java.util.List;

import javax.ejb.Local;

import model.Setor;

@Local
public interface SetorBeanLocal {

	void save(Setor setor);

	void remove(Setor setor);

	List<Setor> getAll();

	List<Setor> getTop10();

}

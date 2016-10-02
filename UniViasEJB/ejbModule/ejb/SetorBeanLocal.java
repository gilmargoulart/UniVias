package ejb;

import java.util.List;

import javax.ejb.Local;

import model.Setor;

@Local
public interface SetorBeanLocal {

	public void save(Setor setor);

	public void remove(Setor setor);

	public List<Setor> getAll();

	public List<Setor> getTop10();

}

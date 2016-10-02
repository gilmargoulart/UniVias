
package ejb;

import java.util.List;

import javax.ejb.Local;

import model.Motorista;

@Local
public interface MotoristaBeanLocal {

	void save(Motorista motorista);

	void remove(Motorista motorista);

	List<Motorista> getAll();

}

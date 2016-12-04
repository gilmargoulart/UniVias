
package ejb;

import java.util.List;
import javax.ejb.Local;
import model.Motorista;

@Local
public interface MotoristaBeanLocal {

	public void save(Motorista motorista);

	public void remove(Motorista motorista);

	public List<Motorista> getAll();
}

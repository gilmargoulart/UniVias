package ejb;

import java.util.List;
import javax.ejb.Local;
import model.Contrato;

@Local
public interface ContratoBeanLocal {

	public void save(Contrato contrato);

	public void remove(Contrato contrato);

	public List<Contrato> getAll();

}

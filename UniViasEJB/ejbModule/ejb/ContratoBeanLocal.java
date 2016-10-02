package ejb;

import java.util.List;

import javax.ejb.Local;

import model.Contrato;

@Local
public interface ContratoBeanLocal {

	void save(Contrato contrato);

	void remove(Contrato contrato);

	List<Contrato> getAll();


	

}

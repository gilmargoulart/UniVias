package ejb;

import java.util.List;

import javax.ejb.Local;

import model.Veiculo;

@Local

public interface VeiculoBeanLocal {

	void save(Veiculo veiculo);

	void remove(Veiculo veiculo);

	List<Veiculo> getAll();

}

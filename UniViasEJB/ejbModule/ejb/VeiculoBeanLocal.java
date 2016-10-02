package ejb;

import java.util.List;

import javax.ejb.Local;

import model.Veiculo;

@Local
public interface VeiculoBeanLocal {

	public void save(Veiculo veiculo);

	public void remove(Veiculo veiculo);

	public List<Veiculo> getAll();

}

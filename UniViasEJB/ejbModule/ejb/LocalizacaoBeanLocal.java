package ejb;

import java.util.List;

import javax.ejb.Local;

import model.Localizacao;

@Local

public interface LocalizacaoBeanLocal {

	public void save(Localizacao localizacao);

	public void remove(Localizacao localizacao);

	public List<Localizacao> getAll();

}

package ejb;

import java.util.List;

import javax.ejb.Local;

import model.Localizacao;

@Local

public interface LocalizacaoBeanLocal {

	void save(Localizacao localizacao);

	void remove(Localizacao localizacao);

	List<Localizacao> getAll();

}

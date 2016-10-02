package ejb;

import java.util.List;
import model.Geolocalizacao;

public interface GeolocalizacaoBeanLocal {

	public void save(Geolocalizacao geolocalizacao);

	public void remove(Geolocalizacao geolocalizacao);

	public List<Geolocalizacao> getAll();

}

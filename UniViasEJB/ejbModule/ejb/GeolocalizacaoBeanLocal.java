package ejb;

import java.util.List;
import javax.ejb.Local;
import model.Geolocalizacao;

@Local
public interface GeolocalizacaoBeanLocal {

	public void save(Geolocalizacao geolocalizacao);

	public void remove(Geolocalizacao geolocalizacao);

	public List<Geolocalizacao> getAll();

}

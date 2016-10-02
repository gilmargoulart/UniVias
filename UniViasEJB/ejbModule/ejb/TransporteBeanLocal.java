package ejb;

import java.util.List;

import javax.ejb.Local;

import model.Transporte;

@Local
public interface TransporteBeanLocal {

	public void save(Transporte inquilino);

	public void remove(Transporte transporte);

	public List<Transporte> getTop10();

	public List<Transporte> getAll();

}

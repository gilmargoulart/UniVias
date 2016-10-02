package ejb;

import java.util.List;

import javax.ejb.Local;

import model.Transporte;

@Local

public interface TransporteBeanLocal {

	void save(Transporte inquilino);

	void remove(Transporte transporte);

	List<Transporte> getTop10();

	List<Transporte> getAll();

}

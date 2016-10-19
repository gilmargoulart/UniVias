package ejb;

import java.util.List;

import javax.ejb.Local;

import model.Inquilino;

@Local
public interface InquilinoBeanLocal {
	
	public void save(Inquilino inquilino);
	
	public void remove(Inquilino inquilino);
	
	public List<Inquilino> getAll();
	
	public List<Inquilino> getTop10();
	
	public List<Inquilino> getAllByName(String nome);
}

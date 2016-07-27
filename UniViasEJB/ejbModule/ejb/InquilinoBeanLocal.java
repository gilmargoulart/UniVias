package ejb;

import javax.ejb.Local;

import model.Inquilino;

@Local
public interface InquilinoBeanLocal {
	
	public void save(Inquilino inquilino);
	
}

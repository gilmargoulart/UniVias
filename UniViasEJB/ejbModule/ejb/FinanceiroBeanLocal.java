package ejb;

import java.util.List;

import javax.ejb.Local;


import model.Financeiro;

@Local
public interface FinanceiroBeanLocal {

	void save(Financeiro financeiro);

	void remove(Financeiro financeiro);

	List<Financeiro> getAll();

	List<Financeiro> getTop10();

}

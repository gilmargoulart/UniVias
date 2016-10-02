package ejb;

import java.util.List;

import javax.ejb.LocalBean;

import model.Financeiro;

@LocalBean
public interface FinanceiroBeanLocal {

	void save(Financeiro financeiro);

	void remove(Financeiro financeiro);

	List<Financeiro> getAll();

	List<Financeiro> getTop10();

}

package ejb;

import java.util.List;

import javax.ejb.LocalBean;

import model.Financeiro;

@LocalBean
public interface FinanceiroBeanLocal {

	public void save(Financeiro financeiro);

	public void remove(Financeiro financeiro);

	public List<Financeiro> getAll();

	public List<Financeiro> getTop10();

}

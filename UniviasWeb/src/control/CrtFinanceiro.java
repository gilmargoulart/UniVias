package control;

import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import ejb.FinanceiroBeanLocal;
import model.Financeiro;

@ManagedBean(name = "crtfinanceiro")
@ViewScoped
public class CrtFinanceiro {
	
	@EJB
	private FinanceiroBeanLocal bean;
	private Financeiro model;
	
	public CrtFinanceiro(){
		model = new Financeiro();
	}
	
	public Financeiro getModel() {
		return model;
	}

	public void setModel(Financeiro model) {
		this.model = model;
	}

	public List<Financeiro> getAll(){
		return bean.getAll();
	}
	
	public void create(){
		model = new Financeiro();
	}
	
	public void save(){
		bean.save(model);
	}
}
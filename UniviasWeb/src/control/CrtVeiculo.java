package control;

import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import ejb.VeiculoBeanLocal;
import model.Veiculo;

@ManagedBean(name = "crtveiculo")
@ViewScoped
public class CrtVeiculo {
	
	@EJB
	private VeiculoBeanLocal bean;
	private Veiculo model;
	
	public CrtVeiculo(){
		model = new Veiculo();
	}
	
	public Veiculo getModel() {
		return model;
	}

	public void setModel(Veiculo model) {
		this.model = model;
	}

	public List<Veiculo> getAll(){
		return bean.getAll();
	}
	
	public void create(){
		model = new Veiculo();
	}
	
	public void save(){
		bean.save(model);
	}
	
	public void remove(){
		bean.remove(model);
	}
}
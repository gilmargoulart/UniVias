package control;

import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import ejb.UniversitarioBeanLocal;
import model.Universitario;

@ManagedBean(name = "crtuniversitario")
@ViewScoped
public class CrtUniversitario {
	
	@EJB
	private UniversitarioBeanLocal bean;
	private Universitario model;
	
	public CrtUniversitario(){
		model = new Universitario();
	}
	
	public Universitario getModel() {
		return model;
	}

	public void setModel(Universitario model) {
		this.model = model;
	}

	public List<Universitario> getAll(){
		return bean.getAll();
	}
	
	public void create(){
		model = new Universitario();
	}
	
	public void save(){
		bean.save(model);
	}
	
	public void remove(){
		bean.remove(model);
	}
}
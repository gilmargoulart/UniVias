package control;

import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import ejb.UniversidadeBeanLocal;
import model.Universidade;

@ManagedBean(name = "crtuniversidade")
@ViewScoped
public class CrtUniversidade {
	
	@EJB
	private UniversidadeBeanLocal bean;
	private Universidade model;
	
	public CrtUniversidade(){
		model = new Universidade();
	}
	
	public Universidade getModel() {
		return model;
	}

	public void setModel(Universidade model) {
		this.model = model;
	}

	public List<Universidade> getAll(){
		return bean.getAll();
	}
	
	public void create(){
		model = new Universidade();
	}
	
	public void save(){
		bean.save(model);
	}
}
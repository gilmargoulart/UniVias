package control;

import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import ejb.SetorBeanLocal;
import model.Setor;

@ManagedBean(name = "crtsetor")
@ViewScoped
public class CrtSetor {
	
	@EJB
	private SetorBeanLocal bean;
	private Setor model;
	
	public CrtSetor(){
		model = new Setor();
	}
	
	public Setor getModel() {
		return model;
	}

	public void setModel(Setor model) {
		this.model = model;
	}

	public List<Setor> getAll(){
		return bean.getAll();
	}
	
	public void create(){
		model = new Setor();
	}
	
	public void save(){
		bean.save(model);
	}
}
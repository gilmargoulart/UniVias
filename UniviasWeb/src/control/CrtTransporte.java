package control;

import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import ejb.TransporteBeanLocal;
import model.Transporte;

@ManagedBean(name = "crttransporte")
@ViewScoped
public class CrtTransporte {
	
	@EJB
	private TransporteBeanLocal bean;
	private Transporte model;
	
	public CrtTransporte(){
		model = new Transporte();
	}
	
	public Transporte getModel() {
		return model;
	}

	public void setModel(Transporte model) {
		this.model = model;
	}

	public List<Transporte> getAll(){
		return bean.getAll();
	}
	
	public void create(){
		model = new Transporte();
	}
	
	public void save(){
		bean.save(model);
	}
}
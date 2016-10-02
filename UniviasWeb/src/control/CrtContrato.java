package control;

import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import ejb.ContratoBeanLocal;
import model.Contrato;

@ManagedBean(name = "crtcontrato")
@ViewScoped
public class CrtContrato {
	
	@EJB
	private ContratoBeanLocal bean;
	private Contrato model;
	
	public CrtContrato(){
		model = new Contrato();
	}
	
	public Contrato getModel() {
		return model;
	}

	public void setModel(Contrato model) {
		this.model = model;
	}

	public List<Contrato> getAll(){
		return bean.getAll();
	}
	
	public void create(){
		model = new Contrato();
	}
	
	public void save(){
		bean.save(model);
	}
}
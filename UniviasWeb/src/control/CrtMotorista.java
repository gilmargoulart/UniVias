package control;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import ejb.MotoristaBeanLocal;
import enums.Status;
import model.Motorista;

@ManagedBean(name = "crtmotorista")
@ViewScoped
public class CrtMotorista {
	
	@EJB
	private MotoristaBeanLocal bean;
	private Motorista model = new Motorista();
	
	public CrtMotorista(){
		//initialize();
	}
	
	@PostConstruct
	public void initialize(){
		model = new Motorista();
	}
	
	public Motorista getModel() {
		return model;
	}

	public void setModel(Motorista model) {
		this.model = model;
	}
	
	public List<Motorista> getAll(){
		return bean.getAll();
	}
	
	public void create(){
		initialize();
	}

	public Status[] getStatusList() {
		return Status.values();
	}
	
	public void save(){
		bean.save(model);
	}
	
	public void remove(){
		bean.remove(model);
	}
}
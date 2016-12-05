package control;

import java.util.List;
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
	private Motorista modelMotorista;
	
	public CrtMotorista(){
		
	}
	
	public Motorista getModelMotorista() {
		return modelMotorista;
	}

	public void setModelMotorista(Motorista model) {
		this.modelMotorista = model;
	}
	
	public List<Motorista> getAll(){
		return bean.getAll();
	}
	
	public void create(){
		modelMotorista = new Motorista();
	}

	public Status[] getStatusList() {
		return Status.values();
	}
	
	public void save(){
		bean.save(modelMotorista);
	}
	
	public void remove(){
		bean.remove(modelMotorista);
	}
}
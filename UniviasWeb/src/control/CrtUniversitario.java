package control;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import ejb.UniversidadeBeanLocal;
import ejb.UniversitarioBeanLocal;
import model.Universidade;
import model.Universitario;

@ManagedBean(name = "crtuniversitario")
@ViewScoped
public class CrtUniversitario {
	
	@EJB
	private UniversidadeBeanLocal universidadeBean;
	
	@EJB
	private UniversitarioBeanLocal bean;
	private Universitario model;
	
	private List<Universidade> colUniversidades = new ArrayList<Universidade>();

	@PostConstruct
	public void init(){
		colUniversidades = universidadeBean.getAll();
	}
	
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
	
	public List<Universidade> getColUniversidades() {
		return this.colUniversidades;
	}

	public void setColUniversidades(List<Universidade> colUniversidades) {
		this.colUniversidades = colUniversidades;
	}
}
package control;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import ejb.InquilinoBeanLocal;
import model.Inquilino;

@ManagedBean(name = "crtinquilino")
@ViewScoped
public class CrtInquilino {
	
	@EJB
	private InquilinoBeanLocal bean;
	private Inquilino model;
	private String txtBusca;
	
	private List<Inquilino> gridInquilinos = new ArrayList<Inquilino>();
	
	public CrtInquilino(){
		model = new Inquilino();
	}
	
	//Chamar método toda vez que alguém entrar na tela
	@PostConstruct
	public void init(){
		gridInquilinos = bean.getAll();
	}
	
	public Inquilino getModel() {
		return model;
	}

	public void setModel(Inquilino model) {
		this.model = model;
	}

	public List<Inquilino> getAll(){
		return bean.getAll();
	}
	
	public void create(){
		model = new Inquilino();
	}
	
	public void save(){
		bean.save(model);
		init();
	}
	
	public void remove(){
		bean.remove(model);
		init();
	}
	
	public void findByName(){
		gridInquilinos = bean.getAllByName(txtBusca);
	}
	
	public String getTxtBusca() {
		return this.txtBusca;
	}

	public void setTxtBusca(String txtBusca) {
		this.txtBusca = txtBusca;
	}

	public List<Inquilino> getGridInquilinos() {
		return this.gridInquilinos;
	}

	public void setGridInquilinos(List<Inquilino> inquilinos) {
		this.gridInquilinos = inquilinos;
	}
}
package control;

import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import ejb.LocalizacaoBeanLocal;
import model.Localizacao;

@ManagedBean(name = "crtlocalizacao")
@ViewScoped
public class CrtLocalizacao {
	
	@EJB
	private LocalizacaoBeanLocal bean;
	private Localizacao model;
	
	public CrtLocalizacao(){
		model = new Localizacao();
	}
	
	public Localizacao getModel() {
		return model;
	}

	public void setModel(Localizacao model) {
		this.model = model;
	}

	public List<Localizacao> getAll(){
		return bean.getAll();
	}
	
	public void create(){
		model = new Localizacao();
	}
	
	public void save(){
		bean.save(model);
	}
}
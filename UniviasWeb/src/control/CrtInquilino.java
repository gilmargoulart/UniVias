package control;

import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import ejb.InquilinoBeanLocal;
import model.Inquilino;

@ManagedBean(name = "crtinquilino")
@ViewScoped
public class CrtInquilino {
	
	@EJB
	private InquilinoBeanLocal inquilinoBean;
	private Inquilino model;
	
	public Inquilino getModel() {
		return model;
	}

	public void setModel(Inquilino model) {
		this.model = model;
	}

	public List<Inquilino> getAll(){
		return inquilinoBean.getAll();
	}
	
}

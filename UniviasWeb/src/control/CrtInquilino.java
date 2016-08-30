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
	
	public List<Inquilino> getAll(){
		return inquilinoBean.getAll();
	}
	
}

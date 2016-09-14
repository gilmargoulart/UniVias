package control;

import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import ejb.ObjectBeanLocal;
import exemplo.GenericObject;

@ManagedBean(name = "crtCRUD")
@ViewScoped
public class CrtCRUD<T> {
	
	@EJB
	private ObjectBeanLocal<T> crudBean;
	private GenericObject<T> model;
	
	public CrtCRUD(){
		//model = ;
	}
	
	public GenericObject<T> getModel() {
		return model;
	}

	public void setModel(GenericObject<T> model) {
		this.model = model;
	}

	public List<GenericObject<T>> getAll(){
		return crudBean.getAll();
	}
	
	public void create(){
		//model = new T();
		model.
	}
	
	public void save(){
		crudBean.save(model);
	}
}
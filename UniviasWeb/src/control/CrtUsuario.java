package control;

import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import ejb.UsuarioBeanLocal;
import model.Usuario;

@ManagedBean(name = "crtusuario")
@ViewScoped
public class CrtUsuario {
	
	@EJB
	private UsuarioBeanLocal bean;
	private Usuario model;
	
	public CrtUsuario(){
		model = new Usuario();
	}
	
	public Usuario getModel() {
		return model;
	}

	public void setModel(Usuario model) {
		this.model = model;
	}

	public List<Usuario> getAll(){
		return bean.getAll();
	}
	
	public void create(){
		model = new Usuario();
	}
	
	public void save(){
		bean.save(model);
	}
}
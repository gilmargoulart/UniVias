package control;

import java.io.IOException;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import org.primefaces.context.RequestContext;

import ejb.UsuarioBeanLocal;
import model.Usuario;

@ManagedBean(name = "crtmasterpage")
@ViewScoped
public class CrtMasterPage {
	
	@EJB
	private UsuarioBeanLocal bean;
	private Usuario model;
	
	public CrtMasterPage(){
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
	
	public void validarUsuario(){
		Usuario u = bean.validaUsuario(model.getLogin(), model.getSenha());
		if (u != null){
			FacesContext fc = FacesContext.getCurrentInstance();
			HttpSession session = (HttpSession) fc.getExternalContext().getSession(true);
			session.setAttribute("USUARIO_LOGADO", u);
			RequestContext.getCurrentInstance().execute("PF('dlgLogin').hide()");
		}
	}
	
	@PostConstruct
	public void abrirLogin(){
		FacesContext fc = FacesContext.getCurrentInstance();
		HttpSession session = (HttpSession) fc.getExternalContext().getSession(true);
		if(session.getAttribute("USUARIO_LOGADO") == null){
			RequestContext.getCurrentInstance().execute("PF('dlgLogin').show()");
		}
	}
	
	public void logoff(){
		FacesContext fc = FacesContext.getCurrentInstance();
		HttpSession session = (HttpSession) fc.getExternalContext().getSession(true);
		session.removeAttribute("USUARIO_LOGADO");
		ExternalContext ec = fc.getExternalContext();
		try {
			ec.redirect("index.xhtml");
		} catch (IOException ex) {
		}
	}
	
	public void showMessage(String title, String message){
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage(title, message));
	}
}

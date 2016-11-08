package converter;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import control.CrtUniversitario;

@ManagedBean(name = "universidadeConverter")
@RequestScoped
public class UniversidadeConverter implements Converter, Serializable {
	
	@ManagedProperty(value="#{crtuniversitario}")
	private CrtUniversitario crtUniversitario;
	
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		int posicao = Integer.parseInt(value);
		
		return crtUniversitario.getColUniversidades().get(posicao);
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		return String.valueOf(crtUniversitario.getColUniversidades().indexOf(value));
	}

}

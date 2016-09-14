package ejb;

import java.util.List;
import javax.ejb.Local;

import exemplo.GenericObject;

@Local
public interface ObjectBeanLocal<T> {
	public void save(GenericObject<T> object);

	public void remove(GenericObject<T> object);

	public List<GenericObject<T>> getAll();
}

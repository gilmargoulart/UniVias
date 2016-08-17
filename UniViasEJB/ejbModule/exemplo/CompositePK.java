package exemplo;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CompositePK {
	
	protected int inquilino_id;
	
	@Column(name = "id")
	protected int id;
	
}

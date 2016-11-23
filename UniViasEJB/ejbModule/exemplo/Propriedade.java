package exemplo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Propriedade {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String descricao;
	
	public long getOid() {
		return id;
	}
	public void setOid(long oid) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}

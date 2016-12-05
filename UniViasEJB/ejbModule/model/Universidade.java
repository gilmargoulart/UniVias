package model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.validation.constraints.Size;

@NamedQueries({
	@NamedQuery(
		name = "getAllUniversidade"
		,query = "select u from Universidade u"
	)
	,@NamedQuery(
		name = "getAllUniversidadeByName"
		,query = "select u from Universidade u where u.nomeCompleto like :d order by u.nomeCompleto"
	)
})

@Entity
public class Universidade {

	@ManyToOne
	@JoinColumn
	private Inquilino inquilino;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Size(min=3)
	@Column(length = 80)
	private String nomeFantasia;
	
	@Size(min=3)
	@Column(length = 120)
	private String nomeCompleto;
	
	@ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH})
	@JoinColumn
	private Localizacao localizacao;
	
	public Localizacao getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(Localizacao localizacao) {
		this.localizacao = localizacao;
	}

	public Inquilino getInquilino() {
		return inquilino;
	}

	public void setInquilino(Inquilino inquilino) {
		this.inquilino = inquilino;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Universidade other = (Universidade) obj;
		if (id != other.id)
			return false;
		return true;
	}
}

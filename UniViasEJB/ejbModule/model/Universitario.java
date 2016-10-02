package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@NamedQueries({
	@NamedQuery(
		name = "getAllUniversitario"
		,query = "select n from Universitario n"
	)
})

@Entity
public class Universitario {
	
	@ManyToOne
	@JoinColumn
	private Inquilino inquilino;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(length = 120)
	private String nome;
	
	public Universitario(){
		
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
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
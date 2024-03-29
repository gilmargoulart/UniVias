package model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Future;
import javax.validation.constraints.Size;

@NamedQueries({
	@NamedQuery(
		name = "getAllContrato"
		,query = "select c from Contrato c"
	)
})

@Entity
public class Contrato {
	
	@ManyToOne
	@JoinColumn
	private Inquilino inquilino;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Size(min=20)
	@Column(length = 2000)
	private String textoContrato;
	
	@Size(min=5)
	@Column(length = 500)
	private String titulo;
	
	
	@Temporal(value = TemporalType.DATE)
	private Date periodoInicial = new Date();
	
	@Future
	@Temporal(value = TemporalType.DATE)
	private Date periodoFinal;
	
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
	public String getTextoContrato() {
		return textoContrato;
	}
	public void setTextoContrato(String textoContrato) {
		this.textoContrato = textoContrato;
	}
	public Date getPeriodoInicial() {
		return periodoInicial;
	}
	public void setPeriodoInicial(Date periodoInicial) {
		this.periodoInicial = periodoInicial;
	}
	public Date getPeriodoFinal() {
		return periodoFinal;
	}
	public void setPeriodoFinal(Date periodoFinal) {
		this.periodoFinal = periodoFinal;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

}

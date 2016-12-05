package model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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

import enums.Status;

@NamedQueries({
	@NamedQuery(
		name = "getAllMotorista"
		,query = "select m from Motorista m"
	)
})
@Entity
public class Motorista {
	
	@ManyToOne
	@JoinColumn
	private Inquilino inquilino;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(length = 120)
	@Size(min=3)
	private String nome;
	
	@Size(min=3)
	@Column(length = 400)
	private String email;
	
	@Column(length = 30)
	private String telefone;
	
	@Temporal(value = TemporalType.DATE)
	private Date admissao = new Date();
	
	@Future
	@Temporal(value = TemporalType.DATE)
	private Date demissao;

	@Column(length = 1)
	@Enumerated(EnumType.ORDINAL)
	private Status status = Status.ATIVO;
	
	public Motorista(){
		//
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Date getAdmissao() {
		return admissao;
	}

	public void setAdmissao(Date admissao) {
		this.admissao = admissao;
	}
	

	public Date getDemissao() {
		return demissao;
	}

	public void setDemissao(Date demissao) {
		this.demissao = demissao;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
}

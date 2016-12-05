package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

import exemplo.itemBem;

@NamedQueries({
	@NamedQuery(
		name = "getAllInquilino"
		,query = "select i from Inquilino i"
	),
	@NamedQuery(
		name = "getAllInquilinoByName"
		,query = "select i from Inquilino i where i.nome like :nome"
	)
})
@Entity
public class Inquilino {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	

	/**
	 * Nome completo
	 */
	@Size(min=2,max=25)
	private String nome;

	/**
	 * Endereço de e-mail
	 */
	@Size(min=2,max=25)
	private String email;

	/**
	 * Número de telefone 
	 */
	private String telefone;

	/**
	 * Identificação do responsável.
	 * Ex: Nome completo
	 */
	@Size(min=2,max=25)
	private String responsavel;

	/**
	 * Documento de identificação.
	 * Ex: CNPJ, CPF, RG
	 */
	@Column(length = 20)
	private String doctoIdentificacao;
	
	@JoinColumn(name="InquilinoID")
	@OneToMany(cascade=CascadeType.ALL)
	private List<itemBem> colItensBem = new ArrayList<itemBem>();


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

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public String getDoctoIdentificacao() {
		return doctoIdentificacao;
	}

	public void setDoctoIdentificacao(String doctoIdentificacao) {
		this.doctoIdentificacao = doctoIdentificacao;
	}
}

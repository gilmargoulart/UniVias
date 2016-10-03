package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@NamedQueries({
	@NamedQuery(
		name = "getAllInquilino"
		,query = "select i from Inquilino i"
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
	private String nome;

	/**
	 * Endere�o de e-mail
	 */
	private String email;

	/**
	 * N�mero de telefone 
	 */
	private String telefone;

	/**
	 * Identifica��o do respons�vel.
	 * Ex: Nome completo
	 */
	private String responsavel;

	/**
	 * Documento de identifica��o.
	 * Ex: CNPJ, CPF, RG
	 */
	@Column(length = 20)
	private String doctoIdentificacao;

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

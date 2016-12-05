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
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

@NamedQueries({
	@NamedQuery(
		name = "getAllUniversitario"
		,query = "select u from Universitario u"
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
	
	@Size(min=3)
	@Column(length = 120)
	private String nome;
	
	@Size(min=3)
	private String email;
	
	/**
	 * CPF, RG
	 */
	@Column(length = 20)
	private String doctoIdentificacao;
	
	@Size(min=8, max=13)
	@Column(length = 20)
	private String telefone;
	
	@ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH})
	@JoinColumn
	private Universidade universidade;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "UNIVERSITARIO_CONTRATOS")
	private List<Contrato> contratos = new ArrayList<Contrato>();
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "UNIVERSITARIO_LOCALIZACOES")
	private List<Localizacao> localizacoes = new ArrayList<Localizacao>();
	
	
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

	public Universidade getUniversidade() {
		return universidade;
	}

	public void setUniversidade(Universidade universidade) {
		this.universidade = universidade;
	}

	public List<Contrato> getContratos() {
		return contratos;
	}

	public void setContratos(List<Contrato> contratos) {
		this.contratos = contratos;
	}

	public List<Localizacao> getLocalizacoes() {
		return localizacoes;
	}

	public void setLocalizacoes(List<Localizacao> localizacoes) {
		this.localizacoes = localizacoes;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDoctoIdentificacao() {
		return doctoIdentificacao;
	}

	public void setDoctoIdentificacao(String doctoIdentificacao) {
		this.doctoIdentificacao = doctoIdentificacao;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
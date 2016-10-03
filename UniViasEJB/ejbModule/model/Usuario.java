package model;

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

import enums.NivelPermissao;

@NamedQueries({
	@NamedQuery(
		name = "getAllUsuario"
		,query = "select u from Usuario u"
	)
})

@Entity
public class Usuario {
	
	@ManyToOne
	@JoinColumn
	private Inquilino inquilino;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(length = 120)
	private String nome;
	
	@Column(length = 240)
	private String login;
	
	@Column(length = 128)
	private String senha;
	
	@Enumerated(EnumType.ORDINAL)
	@Column(columnDefinition = "tinyint")
	private NivelPermissao permissao;
	
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

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public NivelPermissao getPermissao() {
		return this.permissao;
	}

	public void setPermissao(NivelPermissao permissao) {
		this.permissao = permissao;
	}
	
}

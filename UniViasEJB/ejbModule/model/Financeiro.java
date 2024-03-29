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

import enums.TipoDocumentoFinanceiro;

@NamedQueries({
	@NamedQuery(
		name = "getAllFinanceiro"
		,query = "select f from Financeiro f"
	)
})

@Entity
public class Financeiro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne
	@JoinColumn
	private Inquilino inquilino;
	
	/**
	 * Indica o tipo do documento financeiro:
	 * 	- A pagar
	 * 	- A receber
	 */
	@Column(length = 1, columnDefinition = "char(1)")
	@Enumerated(EnumType.STRING)
	private TipoDocumentoFinanceiro tipo;
	
	/**
	 * N�mero do documento
	 */
	private String nroDocumento;
	
	/**
	 * Valor
	 */
	private float valor;
	
	/**
	 * Origem: indica a partir de onde foi gerado o t�tulo no financeiro
	 * Pode ser gerado a partir de:
	 * 	- 
	 */
	private String origem;
	
	@Temporal(value = TemporalType.DATE)
	private Date vencimento;
	
	/**
	 * Valor de juros
	 */
	private float juros;
	
	/**
	 * Valor de desconto
	 */
	private float desconto;

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

	public TipoDocumentoFinanceiro getTipo() {
		return tipo;
	}

	public void setTipo(TipoDocumentoFinanceiro tipo) {
		this.tipo = tipo;
	}

	public String getNroDocumento() {
		return nroDocumento;
	}

	public void setNroDocumento(String nroDocumento) {
		this.nroDocumento = nroDocumento;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public Date getVencimento() {
		return vencimento;
	}

	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
	}

	public float getJuros() {
		return juros;
	}

	public void setJuros(float juros) {
		this.juros = juros;
	}

	public float getDesconto() {
		return desconto;
	}

	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}
}

package exemplo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Pedido {
	

	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id private long id;
	//@Id private long id2;
	
	
	//@EmbeddedId
	//private CompositePK id; 

	//@Id long id2;
	//Inquilino inquilino;
	
	
	
	@ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH})
	private Cliente cliente;
	
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date data;
	private float valorTotal;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "pedido_oid")
	private List<ItemPedido> itens = new ArrayList<ItemPedido>();
	
	public List<ItemPedido> getItens() {
		return itens;
	}
	public void setItens(List<ItemPedido> itens) {
		this.itens = itens;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	/*
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getId2() {
		return id2;
	}
	public void setId2(long id2) {
		this.id2 = id2;
	}
	*/
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public float getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}
}

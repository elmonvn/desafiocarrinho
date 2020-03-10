/**
 * 
 */
package desafio.varejista.carrinho.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Transient;
import javax.validation.constraints.Positive;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

/**
 * @author elmonvn
 *
 */
@Entity
@Data
public class ItemPedido {

	@EmbeddedId
	@MapsId("id")
	@JsonIgnore
	private ItemPedidoPK pk;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pedido_id", insertable = false, updatable = false)
	private Pedido pedido;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "produto_id", insertable = false, updatable = false)
	private Produto produto;

	@Column(nullable = false)
	@Positive
	private Short qtde;

	public ItemPedido() {
		super();
	}

	public ItemPedido(Pedido pedido, Produto produto, @Positive Short qtde) {
		pk = new ItemPedidoPK();
		pk.setPedido(pedido);
		pk.setProduto(produto);
		this.qtde = qtde;
	}

	@Transient
	public Produto getProduto() {
		return this.pk.getProduto();
	}

	@Transient
	public BigDecimal getTotal() {
		return getProduto().getPreco().multiply(new BigDecimal(getQtde()));
	}

	@Override
	public int hashCode() {

		final int prime = 31;
		int result = 1;

		result = prime * result + ((pk == null) ? 0 : pk.hashCode());

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

		ItemPedido other = (ItemPedido) obj;

		if (pk == null) {
			if (other.pk != null) {
				return false;
			}
		} else if (!pk.equals(other.pk)) {
			return false;
		}

		return true;
	}
}

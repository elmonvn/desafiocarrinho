/**
 * 
 */
package desafio.varejista.carrinho.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Positive;

import lombok.Data;

/**
 * @author elmonvn
 *
 */
@Entity
@Data
public class ItemCarrinho {
	
	@Embeddable
	@Data
	public static class ItemCarrinhoId implements Serializable {		
	    private static final long serialVersionUID = 4L;
		
		@Column(name = "carrinho_id")
		protected Long carrinhoId;
		
		@Column(name = "produto_id")
		protected Long produtoId;
	}
	
	@EmbeddedId
	private ItemCarrinhoId id;
	
	@ManyToOne
	@JoinColumn(name = "carrinho_id", insertable = false, updatable = false)
	private Carrinho carrinho;
	
	@ManyToOne
	@JoinColumn(name = "produto_id", insertable = false, updatable = false)
	private Produto produto;
	
	@Column
	@Positive
	private Short qtde;
}

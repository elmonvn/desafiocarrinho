/**
 * 
 */
package desafio.varejista.carrinho.model;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.Null;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;

/**
 * @author elmonvn
 *
 */
@Entity
@Table(name = "pedido")
@Data
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="itens")
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Null
	@OneToOne(fetch = FetchType.LAZY)//(targetEntity = Cupom.class, fetch = FetchType.LAZY)
	@Valid
	private Cupom cupom;
	
	//@OneToMany
	//@MapsId
	//@JoinTable(name = "itens_pedido", joinColumns = {@JoinColumn(name = "pedido_id"), @JoinColumn(name = "produto_id")})//, inverseJoinColumns = {@JoinColumn(name = "produto_id")})
//	@JoinTable(
//		name = "pedido_has_produtos",
//		joinColumns = {@JoinColumn(name = "pedido_id"), @JoinColumn(name = "produto_id")}
//	)
	//private List<Produto> produtos;
	//private Set<Produto> itens = new HashSet<>();
	//private Collection<Produto> produtos;
	//private Set<ItemPedido> itens = new HashSet<>();
	//private ItemPedido produtos;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pedido", cascade = CascadeType.ALL)
	@Valid
	private Set<ItemPedido> itens = new HashSet<>();
	
	private Boolean fechado = false;

	@Min(0)
	private BigDecimal total = new BigDecimal(0);
}

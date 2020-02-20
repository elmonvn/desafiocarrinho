/**
 * 
 */
package desafio.varejista.carrinho.model;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.Null;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author elmonvn
 *
 */
@Entity
@Data
@NoArgsConstructor
public class Carrinho {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Null
	@OneToOne(targetEntity = Cupom.class, fetch = FetchType.EAGER)
	private Cupom cupom;
	
	/*
	@OneToMany
	@MapsId
	@JoinTable(name = "carrinho_has_produtos", joinColumns = {@JoinColumn(name = "carrinho_id")}, inverseJoinColumns = {@JoinColumn(name = "produto_id")})
	private List<Produto> produtos;
	*/

	public BigDecimal total() {
		return null;
	}
		 
}

/**
 * 
 */
package desafio.varejista.carrinho.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author elmonvn
 *
 */
@Entity
@Data
@NoArgsConstructor
public class Cupom {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	private String codigo;
	
	@NotNull
	@Max(100)
	@Positive
	private Short desconto;
}

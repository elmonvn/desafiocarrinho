/**
 * 
 */
package desafio.varejista.carrinho.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import desafio.varejista.carrinho.model.Pedido;

/**
 * @author elmonvn
 *
 */
@RepositoryRestResource(collectionResourceRel = "pedido", path = "pedidos")
public interface PedidoRepository extends CrudRepository<Pedido, Long> {
	
}

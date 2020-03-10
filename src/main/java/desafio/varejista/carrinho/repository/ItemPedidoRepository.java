/**
 * 
 */
package desafio.varejista.carrinho.repository;

import org.springframework.data.repository.CrudRepository;

import desafio.varejista.carrinho.model.ItemPedido;
import desafio.varejista.carrinho.model.ItemPedidoPK;

/**
 * @author elmonvn
 *
 */
public interface ItemPedidoRepository extends CrudRepository<ItemPedido, ItemPedidoPK> {

}

/**
 * 
 */
package desafio.varejista.carrinho.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import desafio.varejista.carrinho.model.Carrinho;

/**
 * @author elmonvn
 *
 */
@RepositoryRestResource(collectionResourceRel = "carrinho", path = "carrinho")
public interface CarrinhoRepository extends CrudRepository<Carrinho, Long> {
	

}

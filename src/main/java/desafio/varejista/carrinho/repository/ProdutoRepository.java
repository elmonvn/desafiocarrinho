/**
 * 
 */
package desafio.varejista.carrinho.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import desafio.varejista.carrinho.model.Produto;

/**
 * @author elmonvn
 *
 */
@RepositoryRestResource(collectionResourceRel = "produto", path = "produto")
public interface ProdutoRepository extends CrudRepository<Produto, Long> {

}

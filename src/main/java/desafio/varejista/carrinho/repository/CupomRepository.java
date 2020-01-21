/**
 * 
 */
package desafio.varejista.carrinho.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import desafio.varejista.carrinho.model.Cupom;

/**
 * @author elmonvn
 *
 */
@RepositoryRestResource(collectionResourceRel = "cupom", path = "cupom")
public interface CupomRepository extends CrudRepository<Cupom, Long> {

}

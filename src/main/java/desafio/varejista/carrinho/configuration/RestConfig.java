/**
 * 
 */
package desafio.varejista.carrinho.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.core.mapping.ExposureConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import desafio.varejista.carrinho.model.Pedido;
import desafio.varejista.carrinho.model.Cupom;
import desafio.varejista.carrinho.model.Produto;

/**
 * @author elmonvn
 *
 */
@Configuration
public class RestConfig implements RepositoryRestConfigurer {
	
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration repositoryRestConfiguration) {
		ExposureConfiguration config = repositoryRestConfiguration.getExposureConfiguration();
		config.forDomainType(Pedido.class).disablePutForCreation();
		config.forDomainType(Cupom.class).disablePutForCreation();
		config.forDomainType(Produto.class).disablePutForCreation();
		
		//config.withItemExposure((metadata, httpMethods) -> httpMethods.disable(HttpMethod.PATCH));
		config.disablePatchOnItemResources();
	}

}

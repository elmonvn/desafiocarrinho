package desafio.varejista.carrinho;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
class CarrinhoApplicationTests {

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	void contextLoads() {
	}

}

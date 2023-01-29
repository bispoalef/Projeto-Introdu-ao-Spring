package br.com.ProjetoIntroducaoSpring.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.ProjetoIntroducaoSpring.entites.Pedido;
import br.com.ProjetoIntroducaoSpring.entites.Usuario;
import br.com.ProjetoIntroducaoSpring.entites.enums.StatusPedido;
import br.com.ProjetoIntroducaoSpring.repositories.PedidoRepository;
import br.com.ProjetoIntroducaoSpring.repositories.UsuarioReposiroty;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UsuarioReposiroty usuarioReposiroty;

	@Autowired
	private PedidoRepository pedidoRepository;
	

	@Override
	public void run(String... args) throws Exception {

		Usuario u1 = new Usuario(null, "Maria Brown", "maria@gmail.com", "988888888", "123456", null);
		Usuario u2 = new Usuario(null, "Alex Green", "alex@gmail.com", "977777777", "123456", null);


		Pedido o1 = new Pedido(null, Instant.parse("2019-06-20T19:53:07Z"),StatusPedido.ENVIDADO, u1);
		Pedido o2 = new Pedido(null, Instant.parse("2019-07-21T03:42:10Z"),StatusPedido.ENTREGUE, u2);
		Pedido o3 = new Pedido(null, Instant.parse("2019-07-22T15:21:22Z"),StatusPedido.AGUARDANDO_PAGAMENTO, u1);

		usuarioReposiroty.saveAll(Arrays.asList(u1, u2));
		pedidoRepository.saveAll(Arrays.asList(o1, o2, o3));
	}

}

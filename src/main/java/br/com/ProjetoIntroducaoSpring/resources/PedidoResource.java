package br.com.ProjetoIntroducaoSpring.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ProjetoIntroducaoSpring.entites.Pedido;
import br.com.ProjetoIntroducaoSpring.services.PedidoService;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoResource {

	@Autowired
	private PedidoService pedidoService;

	@GetMapping
	public ResponseEntity<List<Pedido>> buscarTodos() {

		List<Pedido> dados = pedidoService.buscarTodos();

		return ResponseEntity.ok().body(dados);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Pedido> buscarPorId(@PathVariable Long id) {

		Pedido dados = pedidoService.buscarPorId(id);

		return ResponseEntity.ok().body(dados);
	}
}

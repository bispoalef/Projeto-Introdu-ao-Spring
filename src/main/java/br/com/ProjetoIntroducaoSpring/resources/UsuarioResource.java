package br.com.ProjetoIntroducaoSpring.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ProjetoIntroducaoSpring.entites.Usuario;
import br.com.ProjetoIntroducaoSpring.services.UsuarioService;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioResource {

	@Autowired
	private UsuarioService usuarioService;

	@GetMapping
	public ResponseEntity<List<Usuario>> buscarTodos() {

		List<Usuario> dados = usuarioService.buscarTodos();

		return ResponseEntity.ok().body(dados);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Usuario> buscarPorId(@PathVariable Long id) {

		Usuario dados = usuarioService.buscarPorId(id);

		return ResponseEntity.ok().body(dados);
	}
}

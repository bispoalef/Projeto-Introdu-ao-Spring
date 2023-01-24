package br.com.ProjetoIntroducaoSpring.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ProjetoIntroducaoSpring.entites.Usuario;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioResource {

	@GetMapping
	public ResponseEntity<Usuario> findAll() {

		Usuario user = new Usuario(1L, "alef", "email", "7999", "123");
		return ResponseEntity.ok().body(user);
	}
}

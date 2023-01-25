package br.com.ProjetoIntroducaoSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ProjetoIntroducaoSpring.entites.Usuario;
import br.com.ProjetoIntroducaoSpring.repositories.UsuarioReposiroty;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioReposiroty usuarioReposiroty;

	public List<Usuario> buscarTodos() {
		return usuarioReposiroty.findAll();
	}

	public Usuario buscarPorId(Long id) {
		Optional<Usuario> obj = usuarioReposiroty.findById(id);

		return obj.get();
	}

}
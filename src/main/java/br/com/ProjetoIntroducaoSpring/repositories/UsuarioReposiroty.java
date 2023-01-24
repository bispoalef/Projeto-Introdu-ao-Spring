package br.com.ProjetoIntroducaoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ProjetoIntroducaoSpring.entites.Usuario;

public interface UsuarioReposiroty extends JpaRepository<Usuario, Long>{

}

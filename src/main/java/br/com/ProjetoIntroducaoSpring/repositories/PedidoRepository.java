package br.com.ProjetoIntroducaoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ProjetoIntroducaoSpring.entites.Pedido;


public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}

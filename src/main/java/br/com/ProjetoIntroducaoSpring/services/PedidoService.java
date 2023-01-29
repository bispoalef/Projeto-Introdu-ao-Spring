package br.com.ProjetoIntroducaoSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ProjetoIntroducaoSpring.entites.Pedido;
import br.com.ProjetoIntroducaoSpring.entites.Usuario;
import br.com.ProjetoIntroducaoSpring.repositories.PedidoRepository;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository pedidoRepository;

	public List<Pedido> buscarTodos() {
		return pedidoRepository.findAll();
	}

	public Pedido buscarPorId(Long id) {
		Optional<Pedido> obj = pedidoRepository.findById(id);

		return obj.get();
	}

}
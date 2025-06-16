package com.patterns.sistema.restaurante.service;

import com.patterns.sistema.restaurante.model.Pedido;
import com.patterns.sistema.restaurante.repository.PedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {
    private final PedidoRepository repo;
    public PedidoService(PedidoRepository repo) {
        this.repo = repo;
    }

    public List<Pedido> listar() {
        return repo.get();
    }

    public Pedido pegar(Integer id) {
        return repo.get(id);
    }

    public List<Pedido> pegarPorMesa(Integer idMesa) {
        return repo.getByIdMesa(idMesa);
    }

    public Boolean adicionar(Pedido p) {
        return repo.add(p);
    }

    public Boolean atualizar(Integer id, Pedido pedido) {
        return repo.update(id, pedido);
    }

    public Boolean remover(Integer id) {
        return repo.remove(id);
    }
}
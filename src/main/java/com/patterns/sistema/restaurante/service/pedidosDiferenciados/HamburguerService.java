package com.patterns.sistema.restaurante.service.pedidosDiferenciados;

import com.patterns.sistema.restaurante.adapter.pedidosDiferenciados.HamburguerAdapter;
import com.patterns.sistema.restaurante.repository.pedidosDiferenciados.HamburguerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HamburguerService {
    private final HamburguerRepository repo;
    public HamburguerService(HamburguerRepository repo) {
        this.repo = repo;
    }

    public List<HamburguerAdapter> listar() {
        return repo.get();
    }

    public HamburguerAdapter pegar(Integer id) {
        return repo.get(id);
    }

    public List<HamburguerAdapter> pegarPorMesa(Integer idMesa) {
        return repo.getByIdMesa(idMesa);
    }

    public Boolean adicionar(HamburguerAdapter p) {
        return repo.add(p);
    }

    public Boolean atualizar(Integer id, HamburguerAdapter pedido) {
        return repo.update(id, pedido);
    }

    @Override
    public Boolean remover(Integer id) {
        return repo.remove(id);
    }
}
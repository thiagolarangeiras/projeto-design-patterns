package com.patterns.sistema.restaurante.service;

import com.patterns.sistema.restaurante.model.Mesa;
import com.patterns.sistema.restaurante.repository.MesaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MesaService {
    private final MesaRepository repo;
    public MesaService(MesaRepository repo) {
        this.repo = repo;
    }

    public List<Mesa> listar() {
        return repo.get();
    }

    public Mesa pegar(Integer id) {
        return repo.get(id);
    }

    public Boolean adicionar(Mesa o) {
        return repo.add(o);
    }

    public Boolean atualizar(Integer id, Mesa o) {
        return repo.update(id, o);
    }

    public Boolean remover(Integer id) {
        return repo.remove(id);
    }
}
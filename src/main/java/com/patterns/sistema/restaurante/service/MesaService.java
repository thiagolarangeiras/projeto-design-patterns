package com.patterns.sistema.restaurante.service;

import com.patterns.sistema.restaurante.model.Mesa;
import com.patterns.sistema.restaurante.repository.MesaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MesaService {
    private final MesaRepository mesaRepository;

    public MesaService(MesaRepository mesaRepository) {
        this.mesaRepository = mesaRepository;
    }

    public List<Mesa> listarMesas() {
        return mesaRepository.findAll();
    }
    // outros métodos de negócio
}
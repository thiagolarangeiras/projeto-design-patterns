package com.patterns.sistema.restaurante.controller;

import com.patterns.sistema.restaurante.model.Mesa;
import com.patterns.sistema.restaurante.service.MesaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mesas")
public class MesaController {
    private final MesaService mesaService;

    public MesaController(MesaService mesaService) {
        this.mesaService = mesaService;
    }

    @GetMapping
    public List<Mesa> listarMesas() {
        return mesaService.listarMesas();
    }
    // outros endpoints
}
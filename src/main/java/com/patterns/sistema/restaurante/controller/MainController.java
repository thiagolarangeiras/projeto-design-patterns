package com.patterns.sistema.restaurante.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.patterns.sistema.restaurante.builder.PedidoBuilder;
import com.patterns.sistema.restaurante.builder.director.Director;
import com.patterns.sistema.restaurante.model.Carne;
import com.patterns.sistema.restaurante.model.Mesa;
import com.patterns.sistema.restaurante.service.CarneService;

@RestController
@RequestMapping("/main")
public class MainController {
    private final CarneService carneService;
    public MainController(CarneService carneService){
        this.carneService = carneService;
    }

    @GetMapping
    public Object testar(){
        var carneBoi = new Carne(1l, "Carne de Boi");
        var carnePorco = new Carne(2l, "Carne de Porco");
        var carneFrango = new Carne(2l, "Carne de Frango");
        var mesa1 = new Mesa(1l, 1);
        var pedidoBuilder = new PedidoBuilder();
        Director.buildPedidoCompleto(
            pedidoBuilder,
            mesa1, 
            carneBoi,
            carneFrango
        );
        var pedido1 = pedidoBuilder.build();
        return pedido1.getDadosImprimir();
    }
}
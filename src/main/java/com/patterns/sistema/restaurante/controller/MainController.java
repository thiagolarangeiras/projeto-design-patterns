package com.patterns.sistema.restaurante.controller;

import com.patterns.sistema.restaurante.enums.StatusPedido;
import com.patterns.sistema.restaurante.model.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.patterns.sistema.restaurante.builder.HamburguerBuilder;
import com.patterns.sistema.restaurante.builder.PedidoBuilder;
import com.patterns.sistema.restaurante.builder.director.Director;
import com.patterns.sistema.restaurante.builder.director.DirectorHamburguer;
import com.patterns.sistema.restaurante.enums.PontoCarne;
import com.patterns.sistema.restaurante.service.CarneService;
import com.patterns.sistema.restaurante.service.HamburguerService;
import com.patterns.sistema.restaurante.service.MesaService;
import com.patterns.sistema.restaurante.service.PedidoService;
import com.patterns.sistema.restaurante.service.SanduicheService;
import com.patterns.sistema.restaurante.service.SopaService;

@RestController
@RequestMapping("/main")
public class MainController {
    private final CarneService carneService;
    private final HamburguerService hamService;
    private final MesaService mesaService;
    private final PedidoService pedidoService;
    private final SanduicheService sanduicheService;
    private final SopaService sopaService;
    public MainController(
        CarneService carneService,
        HamburguerService hamService,
        MesaService mesaService,
        PedidoService pedidoService,
        SanduicheService sanduicheService,
        SopaService sopaService
    ){
        this.carneService = carneService;
        this.hamService = hamService;
        this.mesaService = mesaService;
        this.pedidoService = pedidoService;
        this.sanduicheService = sanduicheService;
        this.sopaService = sopaService;
    }

    @GetMapping("pedido-normal")
    public Object pedidoNormal(){
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

    @GetMapping("pedido-hamburguer")
    public Object pedidoHamburguer(){
        var carneBoi = new Carne(1l, "Carne de Boi");
        var mesa = new Mesa(2l, 2);
        var pedidoBuilder = new HamburguerBuilder();
        DirectorHamburguer.buildPedidoCompleto(pedidoBuilder, mesa, carneBoi, PontoCarne.PONTO);
        var hamburguer = pedidoBuilder.build();
        return hamburguer.getDadosImprimir();
    }

    @GetMapping("status-pedido")
    public Pedido statusPedido(){
        Pedido pedido = new Pedido();
        pedido.setId(1L);

        Cliente cliente = new Cliente("João", "123456789", "Rua A, 123");
        pedido.addObserver(cliente);
        Entregador entregador = new Entregador("Maria", "987654321", "ABC-1234");
        pedido.addObserver(entregador);

        pedido.setStatusPedido(StatusPedido.PENDENTE);
        pedido.setStatusPedido(StatusPedido.EM_PREPARACAO);
        pedido.setStatusPedido(StatusPedido.PRONTO);
        pedido.setStatusPedido(StatusPedido.EM_ENTREGA);
        pedido.setStatusPedido(StatusPedido.ENTREGUE);

        return pedido;
    }
}
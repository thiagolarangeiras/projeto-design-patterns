package com.patterns.sistema.restaurante.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/main")
public class MainController {
    public MainController(){

    }

    @GetMapping
    public void testar(){
//        Mesa m = new Mesa();
//
//		Carne c = new Carne();
//
//		PedidoBuilder builder = new PedidoBuilder();
//
//		Director director = new Director();
//
//		director.buildPedidoCompleto(builder, m, c, c);
//
//		builder.toString();
    }

}
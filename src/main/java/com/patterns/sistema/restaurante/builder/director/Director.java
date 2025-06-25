package com.patterns.sistema.restaurante.builder.director;

import com.patterns.sistema.restaurante.builder.PedidoBuilder;
import com.patterns.sistema.restaurante.enums.StatusPedido;
import com.patterns.sistema.restaurante.model.Carne;
import com.patterns.sistema.restaurante.model.Mesa;
import com.patterns.sistema.restaurante.observer.PedidoObserver;

public class Director {

  public Director() {

  }

  public static void buildPedidoCompleto(Long id, PedidoBuilder pedidoBuilder, Mesa m, Carne c1, Carne c2, PedidoObserver cliente, PedidoObserver entregador, StatusPedido status) {
    pedidoBuilder.setId(id);
    pedidoBuilder.setMesa(m);
    pedidoBuilder.setCarne1(c1);
    pedidoBuilder.setCarne2(c2);
    pedidoBuilder.setHasBatata();
    pedidoBuilder.setHasBebida();
    pedidoBuilder.setHasPalmito();
    pedidoBuilder.setHasPicles();
    pedidoBuilder.setHasPolenta();
    pedidoBuilder.addObserver(cliente);
    pedidoBuilder.addObserver(entregador);
    pedidoBuilder.setStatusPedido(status);
  }

  public static void buildPedidoSemSalada(PedidoBuilder pedidoBuilder, Mesa m, Carne c1, Carne c2) {
    pedidoBuilder.setMesa(m);
    pedidoBuilder.setCarne1(c1);
    pedidoBuilder.setCarne2(c2);
    pedidoBuilder.setHasBatata();
    pedidoBuilder.setHasBebida();
    pedidoBuilder.setHasPolenta();
  }

  public static void buildPedidoCarnivoro(PedidoBuilder pedidoBuilder, Mesa m, Carne c1, Carne c2) {
    pedidoBuilder.setMesa(m);
    pedidoBuilder.setCarne1(c1);
    pedidoBuilder.setCarne2(c2);
    pedidoBuilder.setHasBebida();
  }

  // public PedidoBuilder getPedidoBuilder() {
  // return this.pedidoBuilder;
  // }
}
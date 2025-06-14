package com.patterns.sistema.restaurante.builder.director;

import com.patterns.sistema.restaurante.builder.PedidoBuilder;
import com.patterns.sistema.restaurante.model.Carne;
import com.patterns.sistema.restaurante.model.Mesa;

public class Director {

  public Director() {

  }

  public void buildPedidoCompleto(PedidoBuilder pedidoBuilder, Mesa m, Carne c1, Carne c2) {
    pedidoBuilder.setMesa(m);
    pedidoBuilder.setCarne1(c1);
    pedidoBuilder.setCarne2(c2);
    pedidoBuilder.setHasBatata();
    pedidoBuilder.setHasBebida();
    pedidoBuilder.setHasPalmito();
    pedidoBuilder.setHasPicles();
    pedidoBuilder.setHasPolenta();
  }

  public void buildPedidoSemSalada(PedidoBuilder pedidoBuilder, Mesa m, Carne c1, Carne c2) {
    pedidoBuilder.setMesa(m);
    pedidoBuilder.setCarne1(c1);
    pedidoBuilder.setCarne2(c2);
    pedidoBuilder.setHasBatata();
    pedidoBuilder.setHasBebida();
    pedidoBuilder.setHasPolenta();
  }

  public void buildPedidoCarnivoro(PedidoBuilder pedidoBuilder, Mesa m, Carne c1, Carne c2) {
    pedidoBuilder.setMesa(m);
    pedidoBuilder.setCarne1(c1);
    pedidoBuilder.setCarne2(c2);
    pedidoBuilder.setHasBebida();
  }

  // public PedidoBuilder getPedidoBuilder() {
  // return this.pedidoBuilder;
  // }
}

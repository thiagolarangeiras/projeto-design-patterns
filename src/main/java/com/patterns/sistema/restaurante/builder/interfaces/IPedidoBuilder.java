package com.patterns.sistema.restaurante.builder.interfaces;

import com.patterns.sistema.restaurante.builder.PedidoBuilder;
import com.patterns.sistema.restaurante.model.Carne;
import com.patterns.sistema.restaurante.model.Mesa;
import com.patterns.sistema.restaurante.model.Pedido;

public interface IPedidoBuilder {
  public PedidoBuilder setMesa(Mesa m);

  public PedidoBuilder setCarne1(Carne c1);

  public PedidoBuilder setCarne2(Carne c2);

  public PedidoBuilder setHasBatata();

  public PedidoBuilder setHasPolenta();

  public PedidoBuilder setHasPicles();

  public PedidoBuilder setHasPalmito();

  public PedidoBuilder setHasBebida();

  public PedidoBuilder setIsFechado();

  public String getPedido();

  public Pedido build();
}

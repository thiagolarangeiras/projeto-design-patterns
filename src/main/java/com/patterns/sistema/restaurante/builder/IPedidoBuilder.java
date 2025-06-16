package com.patterns.sistema.restaurante.builder;

import com.patterns.sistema.restaurante.model.Carne;
import com.patterns.sistema.restaurante.model.Mesa;
import com.patterns.sistema.restaurante.model.Pedido;

public interface IPedidoBuilder {
  public void setMesa(Mesa m);

  public void setCarne1(Carne c1);

  public void setCarne2(Carne c2);

  public void setHasBatata();

  public void setHasPolenta();

  public void setHasPicles();

  public void setHasPalmito();

  public void setHasBebida();

  public void setIsFechado();

  public String getPedido();

  public Pedido build();
}

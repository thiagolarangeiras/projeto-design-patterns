package com.patterns.sistema.restaurante.builder;

import com.patterns.sistema.restaurante.model.Carne;
import com.patterns.sistema.restaurante.model.Mesa;
import com.patterns.sistema.restaurante.model.Pedido;
import com.patterns.sistema.restaurante.model.pedidosDiferenciados.Hamburguer;

public class HamburguerBuilder {
    private Pedido pedido;
    private Hamburguer hamburguer;
    public HamburguerBuilder() {
        this.pedido = new Pedido();
        this.hamburguer = new Hamburguer();
    }

    public void setCarne1(Carne c1) { this.pedido.setCarne1(c1); }
    public void setCarne2(Carne c2) { this.pedido.setCarne2(c2); }
    public void setHasPicles() { this.pedido.setHasPicles(true); }
    public void setHasBatata() { this.pedido.setHasBatata(true); }
    public void setHasBebida() { this.pedido.setHasBebida(true); }
    public void setIsFechado() { this.pedido.setFechado(true); }
    public void setMesa(Mesa mesa) { this.pedido.setMesa(mesa); }
    public String getPedido() { return this.pedido.toString(); }
}

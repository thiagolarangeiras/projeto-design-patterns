package com.patterns.sistema.restaurante.builder;

import com.patterns.sistema.restaurante.builder.interfaces.IPedidoBuilder;
import com.patterns.sistema.restaurante.model.Carne;
import com.patterns.sistema.restaurante.model.Mesa;
import com.patterns.sistema.restaurante.model.Pedido;

public class PedidoBuilder implements IPedidoBuilder {
    private Pedido pedido;

    public PedidoBuilder() {
        this.pedido = new Pedido();
    }

    @Override
    public PedidoBuilder setCarne1(Carne c1) {
        this.pedido.setCarne1(c1);
        return this;
    }

    @Override
    public PedidoBuilder setCarne2(Carne c2) {
        this.pedido.setCarne2(c2);
        return this;
    }

    @Override
    public PedidoBuilder setHasBatata() {
        this.pedido.setHasBatata(true);
        return this;
    }

    @Override
    public PedidoBuilder setHasBebida() {
        this.pedido.setHasBebida(true);
        return this;
    }

    @Override
    public PedidoBuilder setHasPalmito() {
        this.pedido.setHasPalmito(true);
        return this;
    }

    @Override
    public PedidoBuilder setHasPicles() {
        this.pedido.setHasPicles(true);
        return this;
    }

    @Override
    public PedidoBuilder setHasPolenta() {
        this.pedido.setHasPolenta(true);
        return this;
    }

    @Override
    public PedidoBuilder setIsFechado() {
        this.pedido.setFechado(true);
        return this;
    }

    @Override
    public PedidoBuilder setMesa(Mesa m) {
        this.pedido.setMesa(m);
        return this;
    }

    @Override
    public String getPedido() {
        return this.pedido.toString();
    }

    // public PedidoBuilder comMesa(Mesa mesa) {
    // this.mesa = mesa;
    // return this;
    // }

    /*
     * public PedidoBuilder adicionarProduto(Produto produto) {
     * this.produtos.add(produto);
     * return this;
     * }
     */

    /*
     * public PedidoBuilder fechado(boolean fechado) {
     * this.fechado = fechado;
     * return this;
     * }
     */

    @Override
    public Pedido build() {
        return this.pedido;
    }
}
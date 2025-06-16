package com.patterns.sistema.restaurante.builder;

import com.patterns.sistema.restaurante.model.Carne;
import com.patterns.sistema.restaurante.model.Mesa;
import com.patterns.sistema.restaurante.model.Pedido;
//import com.patterns.sistema.restaurante.model.Produto;

//import java.util.ArrayList;
//import java.util.List;

public class PedidoBuilder implements IPedidoBuilder {
    private Pedido pedido;

    public PedidoBuilder() {
        this.pedido = new Pedido();
    }

    @Override
    public void setCarne1(Carne c1) {
        this.pedido.setCarne1(c1);
    }

    @Override
    public void setCarne2(Carne c2) {
        this.pedido.setCarne2(c2);

    }

    @Override
    public void setHasBatata() {
        this.pedido.setHasBatata(true);
    }

    @Override
    public void setHasBebida() {
        this.pedido.setHasBebida(true);
    }

    @Override
    public void setHasPalmito() {
        this.pedido.setHasPalmito(true);
    }

    @Override
    public void setHasPicles() {
        this.pedido.setHasPicles(true);

    }

    @Override
    public void setHasPolenta() {
        this.pedido.setHasPolenta(true);

    }

    @Override
    public void setIsFechado() {
        this.pedido.setFechado(true);
    }

    @Override
    public void setMesa(Mesa m) {
        this.setMesa(m);
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
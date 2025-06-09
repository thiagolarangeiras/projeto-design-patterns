package com.patterns.sistema.restaurante.builder;

import com.patterns.sistema.restaurante.model.Mesa;
import com.patterns.sistema.restaurante.model.Pedido;
import com.patterns.sistema.restaurante.model.Produto;

import java.util.ArrayList;
import java.util.List;

public class PedidoBuilder {
    private Mesa mesa;
    private List<Produto> produtos = new ArrayList<>();
    private boolean fechado = false;

    public PedidoBuilder comMesa(Mesa mesa) {
        this.mesa = mesa;
        return this;
    }

    public PedidoBuilder adicionarProduto(Produto produto) {
        this.produtos.add(produto);
        return this;
    }

    public PedidoBuilder fechado(boolean fechado) {
        this.fechado = fechado;
        return this;
    }

    public Pedido build() {
        Pedido pedido = new Pedido();

        pedido.setMesa(mesa);
        pedido.setProdutos(produtos);
        pedido.setFechado(fechado);

        return pedido;
    }
}
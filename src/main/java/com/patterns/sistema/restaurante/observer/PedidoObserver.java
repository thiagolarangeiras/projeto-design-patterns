package com.patterns.sistema.restaurante.observer;

import com.patterns.sistema.restaurante.model.Pedido;

public interface PedidoObserver {
    void update(Pedido pedido);
}
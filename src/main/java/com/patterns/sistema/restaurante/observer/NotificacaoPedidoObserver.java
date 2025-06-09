package com.patterns.sistema.restaurante.observer;

import com.patterns.sistema.restaurante.model.Pedido;

public class NotificacaoPedidoObserver implements PedidoObserver {
    @Override
    public void onPedidoFechado(Pedido pedido) {
        // Exemplo: enviar notificação ou logar evento (Implementar ainda)
        System.out.println("Pedido fechado: " + pedido.getId());
    }
}
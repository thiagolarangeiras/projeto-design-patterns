package com.patterns.sistema.restaurante.adapter;

import com.patterns.sistema.restaurante.dto.PedidoDTO;
import com.patterns.sistema.restaurante.model.Pedido;

public class PedidoAdapter {
    public static PedidoDTO toDTO(Pedido pedido) {
        PedidoDTO dto = new PedidoDTO();

        dto.setId(pedido.getId());
        dto.setFechado(pedido.isFechado());

        return dto;
    }

    public static Pedido toEntity(PedidoDTO dto) {
        Pedido pedido = new Pedido();

        pedido.setId(dto.getId());
        pedido.setFechado(dto.isFechado());

        return pedido;
    }
}
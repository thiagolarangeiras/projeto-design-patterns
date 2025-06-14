package com.patterns.sistema.restaurante.model.pedidosDiferenciados;

import lombok.Data;

@Data
public class Sopa {
    private Integer idPedido;
    private boolean hasQueijo = true;
    private boolean hasVegetais = true;
}

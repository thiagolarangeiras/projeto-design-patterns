package com.patterns.sistema.restaurante.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sopa {
    private Integer idPedido;
    private boolean hasQueijo = true;
    private boolean hasVegetais = true;
}

package com.patterns.sistema.restaurante.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sanduiche {
    private Integer idPedido;
    private boolean hasPresunto = true;
    private boolean hasQueijo = true;
    private boolean hasMaionese = false;
    private boolean hasAlface = false;
}
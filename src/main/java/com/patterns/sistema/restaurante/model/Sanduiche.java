package com.patterns.sistema.restaurante.model;

import lombok.Data;

@Data
public class Sanduiche {
    private Integer idPedido;
    private boolean hasPresunto = true;
    private boolean hasQueijo = true;
    private boolean hasMaionese = false;
    private boolean hasAlface = false;
}
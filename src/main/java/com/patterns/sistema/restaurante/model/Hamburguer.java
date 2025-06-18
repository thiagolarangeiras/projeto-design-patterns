package com.patterns.sistema.restaurante.model;

import lombok.Data;

@Data
public class Hamburguer {
    private PontoCarne pontoCarne1;
    private PontoCarne pontoCarne2;
    private boolean hasMaionese = false;
}
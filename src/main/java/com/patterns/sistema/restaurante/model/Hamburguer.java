package com.patterns.sistema.restaurante.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hamburguer {
    private PontoCarne pontoCarne1;
    private PontoCarne pontoCarne2;
    private boolean hasMaionese = false;
}
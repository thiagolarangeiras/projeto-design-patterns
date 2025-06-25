package com.patterns.sistema.restaurante.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mesa {
    private Long id;
    private int numero;

    public String toString(){
        return Integer.toString(numero);
    }
}

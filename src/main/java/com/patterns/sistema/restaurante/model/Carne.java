package com.patterns.sistema.restaurante.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Carne {
    private Long id;
    private String name;

    public String toString(){
        return name;
    }
}

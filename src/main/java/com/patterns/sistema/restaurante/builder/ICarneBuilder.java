package com.patterns.sistema.restaurante.builder;

import com.patterns.sistema.restaurante.model.Carne;

public interface ICarneBuilder {
    CarneBuilder setNome(String n);

    Carne build();
}

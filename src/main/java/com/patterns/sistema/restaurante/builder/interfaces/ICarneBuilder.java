package com.patterns.sistema.restaurante.builder.interfaces;

import com.patterns.sistema.restaurante.builder.CarneBuilder;
import com.patterns.sistema.restaurante.model.Carne;

public interface ICarneBuilder {
    CarneBuilder setNome(String n);

    Carne build();
}

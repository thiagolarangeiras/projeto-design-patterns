package com.patterns.sistema.restaurante.builder;

import com.patterns.sistema.restaurante.model.Mesa;

public interface IMesaBuilder {
    MesaBuilder numero(Integer n);

    Mesa build();
}

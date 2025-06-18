package com.patterns.sistema.restaurante.builder.interfaces;

import com.patterns.sistema.restaurante.builder.MesaBuilder;
import com.patterns.sistema.restaurante.model.Mesa;

public interface IMesaBuilder {
    MesaBuilder numero(Integer n);

    Mesa build();
}

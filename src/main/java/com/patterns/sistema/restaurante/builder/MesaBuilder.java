package com.patterns.sistema.restaurante.builder;

import com.patterns.sistema.restaurante.builder.interfaces.IMesaBuilder;
import com.patterns.sistema.restaurante.model.Mesa;

public class MesaBuilder implements IMesaBuilder {
    private Mesa mesa;
    public MesaBuilder() {
        this.mesa = new Mesa();
    }

    @Override
    public MesaBuilder numero(Integer n){
        this.mesa.setNumero(n);
        return this;
    }

    @Override
    public Mesa build() {
        return this.mesa;
    }
}

package com.patterns.sistema.restaurante.builder;

import com.patterns.sistema.restaurante.model.Carne;

public class CarneBuilder implements ICarneBuilder {
    private Carne carne;
    public CarneBuilder() {
        this.carne = new Carne();
    }

    @Override
    public CarneBuilder setNome(String n){
        this.carne.setName(n);
        return this;
    }

    @Override
    public Carne build() {
        return this.carne;
    }
}

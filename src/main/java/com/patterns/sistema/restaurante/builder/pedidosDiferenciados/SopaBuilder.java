package com.patterns.sistema.restaurante.builder.pedidosDiferenciados;

import com.patterns.sistema.restaurante.model.pedidosDiferenciados.Sopa;

public class SopaBuilder {
    private Sopa sopa;
    public SopaBuilder() {
        this.sopa = new Sopa();
    }

    public SopaBuilder setHasQueijo() {
        this.sopa.setHasQueijo(!this.sopa.isHasQueijo());
        return this;
    }

    public SopaBuilder setHasVegetais() {
        this.sopa.setHasQueijo(!this.sopa.isHasQueijo());
        return this;
    }

    public Sopa build(){
        return this.sopa;
    }
}

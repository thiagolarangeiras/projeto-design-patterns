package com.patterns.sistema.restaurante.builder;

import com.patterns.sistema.restaurante.model.Sanduiche;

public class SanduicheBuilder {
    private Sanduiche sanduiche;
    public SanduicheBuilder() {
        this.sanduiche = new Sanduiche();
    }

    public SanduicheBuilder setHasPresunto() {
        this.sanduiche.setHasPresunto(true);
        return this;
    }

    public SanduicheBuilder setHasQueijo() {
        this.sanduiche.setHasQueijo(true);
        return this;
    }

    public SanduicheBuilder setHasMaionese() {
        this.sanduiche.setHasMaionese(true);
        return this;
    }

    public SanduicheBuilder setHasAlface() {
        this.sanduiche.setHasAlface(true);
        return this;
    }

    public Sanduiche build() {
        return this.sanduiche;
    }
}
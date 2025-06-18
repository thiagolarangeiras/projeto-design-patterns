package com.patterns.sistema.restaurante.builder;

import com.patterns.sistema.restaurante.model.Hamburguer;
import com.patterns.sistema.restaurante.model.PontoCarne;

public class HamburguerBuilder {
    private Hamburguer hamburguer;
    public HamburguerBuilder() {
        this.hamburguer = new Hamburguer();
    }

    public HamburguerBuilder setPontoCarne1(PontoCarne p1) {
        this.hamburguer.setPontoCarne1(p1);
        return this;
    }

    public HamburguerBuilder setPontoCarne2(PontoCarne p2) {
        this.hamburguer.setPontoCarne2(p2);
        return this;
    }

    public HamburguerBuilder setHasMaionese() {
        this.hamburguer.setHasMaionese(!this.hamburguer.isHasMaionese());
        return this;
    }

    public Hamburguer build(){
        return this.hamburguer;
    }
}

package com.patterns.sistema.restaurante.builder;

import com.patterns.sistema.restaurante.adapter.HamburguerAdapter;
import com.patterns.sistema.restaurante.model.Carne;
import com.patterns.sistema.restaurante.model.Hamburguer;
import com.patterns.sistema.restaurante.model.Mesa;
import com.patterns.sistema.restaurante.enums.PontoCarne;

public class HamburguerBuilder {
    private Hamburguer hamburguer;
    private HamburguerAdapter hamburguerAdapter;
    public HamburguerBuilder() {
        this.hamburguer = new Hamburguer();
        this.hamburguerAdapter = new HamburguerAdapter(this.hamburguer);
    }

    public HamburguerAdapter build() {
        return this.hamburguerAdapter;
    }

    //Hamburguer
    public HamburguerBuilder setPontoCarne1(PontoCarne p1) {
        this.hamburguer.setPontoCarne1(p1);
        return this;
    }

    public HamburguerBuilder setPontoCarne2(PontoCarne p2) {
        this.hamburguer.setPontoCarne2(p2);
        return this;
    }

    public HamburguerBuilder setHasMaionese() {
        this.hamburguer.setHasMaionese(true);
        return this;
    }

    //Pedido

    public HamburguerBuilder setCarne1(Carne c1) {
        this.hamburguerAdapter.setCarne1(c1);
        return this;
    }

    public HamburguerBuilder setCarne2(Carne c2) {
        this.hamburguerAdapter.setCarne2(c2);
        return this;
    }

    public HamburguerBuilder setHasBatata() {
        this.hamburguerAdapter.setHasBatata(true);
        return this;
    }

    public HamburguerBuilder setHasBebida() {
        this.hamburguerAdapter.setHasBebida(true);
        return this;
    }

    public HamburguerBuilder setHasPicles() {
        this.hamburguerAdapter.setHasPicles(true);
        return this;
    }

    public HamburguerBuilder setIsFechado() {
        this.hamburguerAdapter.setFechado(true);
        return this;
    }

    public HamburguerBuilder setMesa(Mesa m) {
        this.hamburguerAdapter.setMesa(m);
        return this;
    }

    public String getPedidoHamburguer() {
        return this.hamburguerAdapter.toString();
    }
}


// class HamburguerClassBuilder {
//     private Hamburguer hamburguer;
//     public HamburguerClassBuilder() {
//         this.hamburguer = new Hamburguer();
//     }

//     public HamburguerClassBuilder setPontoCarne1(PontoCarne p1) {
//         this.hamburguer.setPontoCarne1(p1);
//         return this;
//     }

//     public HamburguerClassBuilder setPontoCarne2(PontoCarne p2) {
//         this.hamburguer.setPontoCarne2(p2);
//         return this;
//     }

//     public HamburguerClassBuilder setHasMaionese(boolean m) {
//         this.hamburguer.setHasMaionese(m);
//         return this;
//     }

//     public Hamburguer build(){
//         return this.hamburguer;
//     }
// }

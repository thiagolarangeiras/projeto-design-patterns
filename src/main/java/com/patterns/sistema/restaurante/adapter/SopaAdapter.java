package com.patterns.sistema.restaurante.adapter;

import com.patterns.sistema.restaurante.model.Pedido;
import com.patterns.sistema.restaurante.model.Sopa;
import lombok.Data;

@Data
class SopaAdapter extends Pedido {
    private Sopa sopa;
    public SopaAdapter(Sopa sopa){
        this.sopa = sopa;
    }

    @Override
    public String getDadosImprimir(){
        return toString();
    }

    @Override
    public String toString() {
        return "Pedido" +
                "\ncodigo: " + getId() +
                "\nmesa: " + (getIdMesa() != null ? getIdMesa() : null) +
                "\nSopa" +
                "\ncarne 1: " + (getCarne1() != null ? getCarne1().toString() : null) +
                "\ncarne 2: " + (getCarne2() != null ? getCarne2().toString() : null) +
                "\nbatata: " + isHasBatata() +
                "\nvegetais: " + sopa.isHasVegetais() +
                "\nbebida: " + (isHasBebida() ? "sim" : "não") +
                "\nfechado: " + (isFechado() ? "sim" : "não");
    }
}
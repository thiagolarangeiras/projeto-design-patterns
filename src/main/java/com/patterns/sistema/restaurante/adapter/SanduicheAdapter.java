package com.patterns.sistema.restaurante.adapter;

import com.patterns.sistema.restaurante.model.Pedido;
import com.patterns.sistema.restaurante.model.Sanduiche;

class SanduicheAdapter extends Pedido {
    private Sanduiche sanduiche;
    public SanduicheAdapter(Sanduiche sanduiche){
        this.sanduiche = sanduiche;
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
                "\nSanduiche" +
                "\npresunto: : " + (sanduiche.isHasPresunto() ? "sim" : "não") +
                "\nqueijo: " + (sanduiche.isHasQueijo() ? "sim" : "não") +
                "\npicles: " + (isHasPicles() ? "sim" : "não") +
                "\nmaionese: " + (sanduiche.isHasMaionese() ? "sim" : "não") +
                "\nalface: " + (sanduiche.isHasAlface() ? "sim" : "não") +
                "\nbebida: " + (isHasBebida() ? "sim" : "não") +
                "\nfechado: " + (isFechado() ? "sim" : "não");
    }
}
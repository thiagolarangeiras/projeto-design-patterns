package com.patterns.sistema.restaurante.adapter;

import com.patterns.sistema.restaurante.model.Pedido;
import com.patterns.sistema.restaurante.model.pedidosDiferenciados.Sanduiche;

class PedidoSanduicheAdapter extends Pedido {
    private Sanduiche sanduiche;
    public PedidoSanduicheAdapter(Sanduiche sanduiche){
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
                "\nmesa: " + (getMesa() != null ? getMesa().getId() : null) +
                "\nSanduiche" +
                "\npresunto: : " + (sanduiche.isHasPresunto() ? "sim" : "não") +
                "\nqueijo: " + (sanduiche.isHasQueijo() ? "sim" : "não") +
                "\npicles: " + (sanduiche.isHasPicles() ? "sim" : "não") +
                "\nmaionese: " + (sanduiche.isHasMaionese() ? "sim" : "não") +
                "\nalface: " + (sanduiche.isHasAlface() ? "sim" : "não") +
                "\nbebida: " + (isHasBebida() ? "sim" : "não") +
                "\nfechado: " + (isFechado() ? "sim" : "não");
    }
}
package com.patterns.sistema.restaurante.adapter.pedidosDiferenciados;

import com.patterns.sistema.restaurante.model.Pedido;
import com.patterns.sistema.restaurante.model.pedidosDiferenciados.Hamburguer;
import lombok.Data;

@Data
public class HamburguerAdapter extends Pedido {
    private Hamburguer hamburguer;
    public HamburguerAdapter(Hamburguer hamburguer){
        this.hamburguer = hamburguer;
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
                "\nHamburguer" +
                "\npicles: " + (isHasPicles() ? "sim" : "não") +
                "\nmaionese: " + (hamburguer.isHasMaionese() ? "sim" : "não") +
                "\nbebida: " + (isHasBebida() ? "sim" : "não") +
                "\nfechado: " + (isFechado() ? "sim" : "não");
    }
}
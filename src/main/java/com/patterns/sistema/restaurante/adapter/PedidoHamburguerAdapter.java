package com.patterns.sistema.restaurante.adapter;

import com.patterns.sistema.restaurante.model.Pedido;
import com.patterns.sistema.restaurante.model.pedidosDiferenciados.Hamburguer;
import com.patterns.sistema.restaurante.model.pedidosDiferenciados.PontoCarne;
import lombok.Data;

@Data
public class PedidoHamburguerAdapter extends Pedido {
    private Hamburguer hamburguer;
    public PedidoHamburguerAdapter(Hamburguer hamburguer){
        this.hamburguer = hamburguer;
    }

    @Override
    public String getDadosImprimir(){
        return toString();
    }
    private PontoCarne pontoCarne1;
    private PontoCarne pontoCarne2;

    @Override
    public String toString() {
        return "Pedido" +
                "\ncodigo: " + getId() +
                "\nmesa: " + (getMesa() != null ? getMesa().getId() : null) +
                "\nHamburguer" +
                "\npicles: " + (hamburguer.isHasPicles() ? "sim" : "não") +
                "\nmaionese: " + (hamburguer.isHasMaionese() ? "sim" : "não") +
                "\nbebida: " + (isHasBebida() ? "sim" : "não") +
                "\nfechado: " + (isFechado() ? "sim" : "não");
    }
}
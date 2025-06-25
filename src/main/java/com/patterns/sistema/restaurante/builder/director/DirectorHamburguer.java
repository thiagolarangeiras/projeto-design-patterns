package com.patterns.sistema.restaurante.builder.director;

import com.patterns.sistema.restaurante.builder.HamburguerBuilder;
import com.patterns.sistema.restaurante.model.Carne;
import com.patterns.sistema.restaurante.model.Mesa;
import com.patterns.sistema.restaurante.enums.PontoCarne;

public class DirectorHamburguer {

    public static void buildPedidoCompleto(HamburguerBuilder pedidoBuilder, Mesa m, Carne c1, PontoCarne p1) {
        pedidoBuilder.setMesa(m);
        pedidoBuilder.setCarne1(c1);
        pedidoBuilder.setPontoCarne1(p1);
        pedidoBuilder.setHasBatata();
        pedidoBuilder.setHasBebida();
        pedidoBuilder.setHasPicles();
        pedidoBuilder.setHasMaionese();
    }

    public static void buildPedidoSemMaionese(HamburguerBuilder pedidoBuilder, Mesa m, Carne c1, PontoCarne p1) {
        pedidoBuilder.setMesa(m);
        pedidoBuilder.setCarne1(c1);
        pedidoBuilder.setPontoCarne1(p1);
        pedidoBuilder.setHasBatata();
        pedidoBuilder.setHasBebida();
        pedidoBuilder.setHasPicles();
    }

    public static void buildPedidoCarnivoro(HamburguerBuilder pedidoBuilder, Mesa m, Carne c1, 
        Carne c2, PontoCarne p1, PontoCarne p2) {
        pedidoBuilder.setMesa(m);
        pedidoBuilder.setCarne1(c1);
        pedidoBuilder.setCarne2(c2);
        pedidoBuilder.setPontoCarne1(p1);
        pedidoBuilder.setPontoCarne2(p2);
        pedidoBuilder.setHasBatata();
        pedidoBuilder.setHasBebida();
        pedidoBuilder.setHasPicles();
        pedidoBuilder.setHasMaionese();
    }
}
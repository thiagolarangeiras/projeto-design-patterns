package com.patterns.sistema.restaurante.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pedido {
    private Long id;

    private Long idMesa;

    private Mesa mesa;

    private boolean fechado;

    private Carne carne1;

    private Carne carne2;

    private boolean hasBatata = false;

    private boolean hasPolenta = false;

    private boolean hasPicles = false;

    private boolean hasPalmito = false;

    private boolean hasBebida = false;

    public Pedido(Integer idMesa, Carne c1, Carne c2, boolean hasBatata, boolean hasPolenta, 
        boolean hasPicles,boolean hasPalmito, boolean hasBebida) {
        this.idMesa = idMesa.longValue();
        this.carne1 = c1;
        this.carne2 = c2;
        this.hasBatata = hasBatata;
        this.hasPolenta = hasPolenta;
        this.hasPicles = hasPicles;
        this.hasPalmito = hasPalmito;
        this.hasBebida = hasBebida;
        this.fechado = false;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", mesa=" + (mesa != null ? mesa : "sem mesa") +
                ", carne1=" + (carne1 != null ? carne1.toString() : null) +
                ", carne2=" + (carne2 != null ? carne2.toString() : null) +
                ", hasBatata=" + hasBatata +
                ", hasPolenta=" + hasPolenta +
                ", hasPicles=" + hasPicles +
                ", hasPalmito=" + hasPalmito +
                ", hasBebida=" + hasBebida +
                ", fechado=" + fechado +
                '}';
    }

    public String getDadosImprimir(){
        //return toString();
        return "Pedido" +
                "\n\tCodigo: " + id +
                "\n\tMesa: " + (mesa != null ? mesa.toString() : "sem mesa") +
                "\n\tCarne 1: " + (carne1 != null ? carne1.toString() : null) +
                "\n\tCarne 2: " + (carne2 != null ? carne2.toString() : null) +
                "\n\tBatata: " + (hasBatata ? "sim" : "não") +
                "\n\tPolenta: " + (hasPolenta ? "sim" : "não") +
                "\n\tPicles: " + (hasPicles ? "sim" : "não") +
                "\n\tPalmito: " + (hasPalmito ? "sim" : "não") +
                "\n\tBebida: " + (hasBebida ? "sim" : "não") +
                "\n\tFechado: " + (fechado ? "sim" : "não");
    }
}
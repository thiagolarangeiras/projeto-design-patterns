package com.patterns.sistema.restaurante.model;

import jakarta.persistence.*;

// import java.util.List;

@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Mesa mesa;

    // @ManyToMany
    // private List<Produto> produtos;

    private boolean fechado;

    private Carne carne1;

    private Carne carne2;

    private boolean hasBatata = false;

    private boolean hasPolenta = false;

    private boolean hasPicles = false;

    private boolean hasPalmito = false;

    private boolean hasBebida = false;

    public Pedido() {
    }

    public Pedido(Mesa mesa, Carne c1, Carne c2, boolean hasBatata, boolean hasPolenta, boolean hasPicles,
            boolean hasPalmito, boolean hasBebida) {
        this.mesa = mesa;
        this.carne1 = c1;
        this.carne2 = c2;
        this.hasBatata = hasBatata;
        this.hasPolenta = hasPolenta;
        this.hasPicles = hasPicles;
        this.hasPalmito = hasPalmito;
        this.hasBebida = hasBebida;
        this.setFechado(false);
    }

    // getters e setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    // public void setProdutos(List<Produto> produtos) {
    // this.produtos = produtos;
    // }

    public void setFechado(boolean fechado) {
        this.fechado = fechado;
    }

    public boolean isFechado() {
        return this.fechado;
    }

    public Carne getCarne1() {
        return carne1;
    }

    public void setCarne1(Carne carne1) {
        this.carne1 = carne1;
    }

    public Carne getCarne2() {
        return carne2;
    }

    public void setCarne2(Carne carne2) {
        this.carne2 = carne2;
    }

    public boolean isHasBatata() {
        return hasBatata;
    }

    public void setHasBatata(boolean hasBatata) {
        this.hasBatata = hasBatata;
    }

    public boolean isHasPolenta() {
        return hasPolenta;
    }

    public void setHasPolenta(boolean hasPolenta) {
        this.hasPolenta = hasPolenta;
    }

    public boolean isHasPicles() {
        return hasPicles;
    }

    public void setHasPicles(boolean hasPicles) {
        this.hasPicles = hasPicles;
    }

    public boolean isHasPalmito() {
        return hasPalmito;
    }

    public void setHasPalmito(boolean hasPalmito) {
        this.hasPalmito = hasPalmito;
    }

    public boolean isHasBebida() {
        return hasBebida;
    }

    public void setHasBebida(boolean hasBebida) {
        this.hasBebida = hasBebida;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", mesa=" + (mesa != null ? mesa.getId() : null) +
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
}

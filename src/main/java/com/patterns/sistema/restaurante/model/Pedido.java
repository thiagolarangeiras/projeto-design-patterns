package com.patterns.sistema.restaurante.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Mesa mesa;

    @ManyToMany
    private List<Produto> produtos;

    private boolean fechado;

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


    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void setFechado(boolean fechado) {
        this.fechado = fechado;
    }

    public boolean isFechado() {
        return this.fechado;
    }
}


package com.patterns.sistema.restaurante.dto;

import java.util.List;

public class PedidoDTO {
    private Long id;
    private List<Long> produtosIds;
    private boolean fechado;

    // Getters e setters

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public List<Long> getProdutosIds() { return produtosIds; }
    public void setProdutosIds(List<Long> produtosIds) { this.produtosIds = produtosIds; }

    public boolean isFechado() { return fechado; }
    public void setFechado(boolean fechado) { this.fechado = fechado; }
}
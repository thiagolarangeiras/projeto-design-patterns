package com.patterns.sistema.restaurante.dto;

public class ProdutoDTO {
    private Long id;
    private String nome;
    private double preco;

    // getters e setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public String getPreco() {
        return String.format("%.2f", preco);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
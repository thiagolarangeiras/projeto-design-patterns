package com.patterns.sistema.restaurante.model;

import com.patterns.sistema.restaurante.observer.PedidoObserver;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Entregador implements PedidoObserver {
    private Long id;

    private String nome;

    private String telefone;

    private String placaVeiculo;

    public Entregador(String nome, String telefone, String placaVeiculo) {
        this.nome = nome;
        this.telefone = telefone;
        this.placaVeiculo = placaVeiculo;
    }

    @Override
    public String toString() {
        return "Entregador{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", placaVeiculo='" + placaVeiculo + '\'' +
                '}';
    }

    @Override
    public void update(Pedido pedido) {
        System.out.println("Entregador " + nome + " foi notificado: Pedido " + pedido.getId() +
                " mudou para o status " + pedido.getStatusPedido());
    }
}

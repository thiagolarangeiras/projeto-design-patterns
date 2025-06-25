package com.patterns.sistema.restaurante.model;

import com.patterns.sistema.restaurante.observer.PedidoObserver;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente implements PedidoObserver {
    private Long id;

    private String nome;

    private String telefone;

    private String endereco;

    public Cliente(String nome, String telefone, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }

    @Override
    public void update(Pedido pedido) {
        System.out.println("Cliente " + nome + " foi notificado: Pedido " + pedido.getId() +
                " mudou para o status " + pedido.getStatusPedido());
    }
}

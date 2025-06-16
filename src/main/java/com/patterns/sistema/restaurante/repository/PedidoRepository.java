package com.patterns.sistema.restaurante.repository;

import com.patterns.sistema.restaurante.model.Pedido;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PedidoRepository {
    private final List<Pedido> db = new ArrayList<Pedido>();

    public List<Pedido> get() {
        return db;
    }

    public Pedido get(Integer id) {
        return db.get(id);
    }

    public List<Pedido> getByIdMesa(Integer idMesa) {
        List<Pedido> pedidosFiltrados = new ArrayList<Pedido>();
        for(var pedido : db){
            if(pedido.getIdMesa() == idMesa.longValue()){
                pedidosFiltrados.add(pedido);
            }
        }
        return pedidosFiltrados;
    }

    public Boolean add(Pedido p) {
        return db.add(p);
    }

    public Boolean update(Integer id, Pedido pedido) {
        var pedidoAtual = db.get(id);
        pedidoAtual = pedido;
        return true;
    }

    public Boolean remove(Integer id) {
        return db.remove(id);
    }
}
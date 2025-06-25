package com.patterns.sistema.restaurante.service;

import com.patterns.sistema.restaurante.model.Pedido;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PedidoService {
    private final List<Pedido> db = new ArrayList<Pedido>();

    public List<Pedido> get() {
        return db;
    }

    public String getById(Long id) {
        Pedido pedido = db.stream()
                        .filter(p -> p.getId().equals(id))
                        .findFirst()
                        .orElse(null);

        String dados = pedido.getDadosImprimir();
        return dados;
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

    public Pedido add(Pedido p) {
        db.add(p);
        return p;
    }

    public Boolean update(Integer id, Pedido novo) {
        var atual = db.set(id, novo);
        return true;
    }

    public Boolean remove(Integer id) {
        return db.remove(id);
    }
}
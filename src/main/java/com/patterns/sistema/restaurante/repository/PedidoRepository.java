package com.patterns.sistema.restaurante.repository;

import com.patterns.sistema.restaurante.model.Pedido;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PedidoRepository {
    private final List<Pedido> pedidoRepo = new ArrayList<Pedido>();

    public List<Pedido> get() {
        return pedidoRepo;
    }

    public Pedido get(Integer id) {
        return pedidoRepo.get(id);
    }

    public List<Pedido> getByIdMesa(Integer idMesa) {
        List<Pedido> pedidosFiltrados = new ArrayList<Pedido>();
        for(var pedido : pedidoRepo){
            if(pedido.getIdMesa() == idMesa.longValue()){
                pedidosFiltrados.add(pedido);
            }
        }
        return pedidosFiltrados;
    }

    public Boolean add(Pedido p) {
        return pedidoRepo.add(p);
    }

    public Boolean update(Integer id, Pedido pedido) {
        var pedidoAtual = pedidoRepo.get(id);
        pedidoAtual = pedido;
        return true;
    }

    public Boolean remove(Integer id) {
        return pedidoRepo.remove(id);
    }
}
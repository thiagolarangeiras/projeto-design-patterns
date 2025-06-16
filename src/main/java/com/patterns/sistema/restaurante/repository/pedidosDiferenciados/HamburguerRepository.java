package com.patterns.sistema.restaurante.repository.pedidosDiferenciados;

import com.patterns.sistema.restaurante.adapter.pedidosDiferenciados.HamburguerAdapter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HamburguerRepository {
    private final List<HamburguerAdapter> db = new ArrayList<HamburguerAdapter>();

    public List<HamburguerAdapter> get() {
        return db;
    }

    public HamburguerAdapter get(Integer id) {
        return db.get(id);
    }

    public Boolean add(HamburguerAdapter o) {
        return db.add(o);
    }

    public Boolean update(Integer id, HamburguerAdapter novo) {
        var atual = db.get(id);
        atual = novo;
        return true;
    }

    public Boolean remove(Integer id) {
        return db.remove(id);
    }
}
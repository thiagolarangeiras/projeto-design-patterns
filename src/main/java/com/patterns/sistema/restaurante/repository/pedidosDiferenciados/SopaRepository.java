package com.patterns.sistema.restaurante.repository.pedidosDiferenciados;

import com.patterns.sistema.restaurante.model.pedidosDiferenciados.Sopa;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SopaRepository {
    private final List<Sopa> db = new ArrayList<Sopa>();

    public List<Sopa> get() {
        return db;
    }

    public Sopa get(Integer id) {
        return db.get(id);
    }

    public Boolean add(Sopa o) {
        return db.add(o);
    }

    public Boolean update(Integer id, Sopa novo) {
        var atual = db.get(id);
        atual = novo;
        return true;
    }

    public Boolean remove(Integer id) {
        return db.remove(id);
    }
}
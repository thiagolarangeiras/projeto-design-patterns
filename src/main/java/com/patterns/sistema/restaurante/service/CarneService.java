package com.patterns.sistema.restaurante.service;

import com.patterns.sistema.restaurante.model.Carne;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarneService {
    private final List<Carne> db = new ArrayList<Carne>();

    public List<Carne> get() {
        return db;
    }

    public Carne get(Integer id) {
        return db.get(id);
    }

    public Boolean add(Carne p) {
        return db.add(p);
    }

    public Boolean update(Integer id, Carne novo) {
        var atual = db.get(id);
        atual = novo;
        return true;
    }

    public Boolean remove(Integer id) {
        return db.remove(id);
    }
}

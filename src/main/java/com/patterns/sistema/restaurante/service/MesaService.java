package com.patterns.sistema.restaurante.service;

import com.patterns.sistema.restaurante.model.Mesa;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MesaService {
    private final List<Mesa> db = new ArrayList<Mesa>();

    public List<Mesa> get() {
        return db;
    }

    public Mesa get(Integer id) {
        return db.get(id);
    }

    public Boolean add(Mesa p) {
        return db.add(p);
    }

    public Boolean update(Integer id, Mesa novo) {
        var atual = db.get(id);
        atual = novo;
        return true;
    }

    public Boolean remove(Integer id) {
        return db.remove(id);
    }
}
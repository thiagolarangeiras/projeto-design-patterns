package com.patterns.sistema.restaurante.service;

import com.patterns.sistema.restaurante.model.Sanduiche;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SanduicheService {
    private final List<Sanduiche> db = new ArrayList<Sanduiche>();

    public List<Sanduiche> get() {
        return db;
    }

    public Sanduiche get(Integer id) {
        return db.get(id);
    }

    public Boolean add(Sanduiche o) {
        return db.add(o);
    }

    public Boolean update(Integer id, Sanduiche novo) {
        var atual = db.get(id);
        atual = novo;
        return true;
    }

    public Boolean remove(Integer id) {
        return db.remove(id);
    }
}

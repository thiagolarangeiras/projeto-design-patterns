package com.patterns.sistema.restaurante.service;

import com.patterns.sistema.restaurante.adapter.HamburguerAdapter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HamburguerService {
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
        var atual = db.set(id, novo);
        return true;
    }

    public Boolean remove(Integer id) {
        return db.remove(id);
    }
}
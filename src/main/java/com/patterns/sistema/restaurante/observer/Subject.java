package com.patterns.sistema.restaurante.observer;

public interface Subject {
    void addObserver(PedidoObserver o);
    void removeObserver(PedidoObserver o);
    void notifyObservers();
}

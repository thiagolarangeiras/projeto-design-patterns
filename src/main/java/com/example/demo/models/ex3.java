package com.example.demo.models;

public class ex3 {
}


public class Waiter implements Attendant { // Attendant é o "Observer"
    private String name;

    public Waiter(String name) {
        this.name = name;
    }

    @Override
    public void notify(String message, int tableNumber) {
        System.out.println("[" + name + "] recebeu notificação da Mesa " + tableNumber + ": " + message);
    }
}


import java.util.ArrayList;
import java.util.List;

public class Table implements TableSubject { // TableSubject é o "Subject"
    private int tableNumber;
    private List<Attendant> attendants;
    private CommunicationChannel channel;

    public Table(int tableNumber, CommunicationChannel channel) {
        this.tableNumber = tableNumber;
        this.channel = channel;
        this.attendants = new ArrayList<>();
    }

    public void requestAssistance() {
        // Comunicação com a interface (Bridge)
        channel.sendMessage("Solicitando atendimento", tableNumber);

        // Notificar todos os observers
        notifyObservers("Mesa solicitou atendimento.");
    }

    @Override
    public void addObserver(Attendant attendant) {
        attendants.add(attendant);
    }

    @Override
    public void removeObserver(Attendant attendant) {
        attendants.remove(attendant);
    }

    @Override
    public void notifyObservers(String message) {
        for (Attendant attendant : attendants) {
            attendant.notify(message, tableNumber);
        }
    }
}


public class Main {
    public static void main(String[] args) {
        // Criação do canal de comunicação
        CommunicationChannel tabletChannel = new TabletChannel();

        // Criação da mesa
        Table mesa7 = new Table(7, tabletChannel);

        // Criação dos atendentes
        Waiter ana = new Waiter("Ana");
        Waiter bruno = new Waiter("Bruno");

        // Registro dos observers
        mesa7.addObserver(ana);
        mesa7.addObserver(bruno);

        // Simulação de atendimento
        mesa7.requestAssistance();
    }
}

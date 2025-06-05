package com.example.demo.models;

// Abstração
interface CommunicationChannel {
    void sendMessage(String message, int tableNumber);
}

// Implementações concretas
class TabletChannel implements CommunicationChannel {
    public void sendMessage(String message, int tableNumber) {
        System.out.println("[Tablet] Mesa " + tableNumber + ": " + message);
    }
}

class BuzzerChannel implements CommunicationChannel {
    public void sendMessage(String message, int tableNumber) {
        System.out.println("[Buzzer] Mesa " + tableNumber + " chamou atendimento!");
    }
}

// Observer
interface Attendant {
    void notify(String message, int tableNumber);
}

// Subject (observado)
interface TableSubject {
    void addObserver(Attendant attendant);
    void removeObserver(Attendant attendant);
    void notifyObservers(String message);
}

class Table implements TableSubject {
    private int tableNumber;
    private List<Attendant> attendants = new ArrayList<>();
    private CommunicationChannel channel;

    public Table(int number, CommunicationChannel channel) {
        this.tableNumber = number;
        this.channel = channel;
    }

    public void requestAssistance() {
        channel.sendMessage("Solicitando atendimento", tableNumber);
        notifyObservers("Mesa precisa de atendimento");
    }

    @Override
    public void addObserver(Attendant a) {
        attendants.add(a);
    }

    @Override
    public void removeObserver(Attendant a) {
        attendants.remove(a);
    }

    @Override
    public void notifyObservers(String message) {
        for (Attendant a : attendants) {
            a.notify(message, tableNumber);
        }
    }
}

class Waiter implements Attendant {
    private String name;

    public Waiter(String name) {
        this.name = name;
    }

    @Override
    public void notify(String message, int tableNumber) {
        System.out.println("[" + name + "] recebeu aviso da Mesa " + tableNumber + ": " + message);
    }
}

public class Main {
    public static void main(String[] args) {
        CommunicationChannel channel = new TabletChannel();
        Table mesa5 = new Table(5, channel);

        Attendant joao = new Waiter("João");
        Attendant maria = new Waiter("Maria");

        mesa5.addObserver(joao);
        mesa5.addObserver(maria);

        mesa5.requestAssistance();

        // Troca de canal de comunicação
        mesa5 = new Table(5, new BuzzerChannel());
        mesa5.addObserver(joao);
        mesa5.requestAssistance();
    }
}
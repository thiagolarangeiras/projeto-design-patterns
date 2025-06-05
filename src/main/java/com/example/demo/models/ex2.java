package com.example.demo.models;

public class ex2 {
}


// CommunicationChannel.java
public interface CommunicationChannel {
    void sendMessage(String message, int tableNumber);
}

// TabletChannel.java
public class TabletChannel implements CommunicationChannel {
    @Override
    public void sendMessage(String message, int tableNumber) {
        System.out.println("[Tablet] Mesa " + tableNumber + ": " + message);
    }
}

// BuzzerChannel.java
public class BuzzerChannel implements CommunicationChannel {
    @Override
    public void sendMessage(String message, int tableNumber) {
        System.out.println("[Buzzer] Mesa " + tableNumber + " chamou atendimento!");
    }
}

// Attendant.java
public interface Attendant {
    void notify(String message, int tableNumber);
}

// TableSubject.java
public interface TableSubject {
    void addObserver(Attendant attendant);
    void removeObserver(Attendant attendant);
    void notifyObservers(String message);
}


// Table.java
import java.util.ArrayList;
import java.util.List;

public class Table implements TableSubject {
    private int tableNumber;
    private List<Attendant> attendants;
    private CommunicationChannel channel;

    public Table(int tableNumber, CommunicationChannel channel) {
        this.tableNumber = tableNumber;
        this.channel = channel;
        this.attendants = new ArrayList<>();
    }

    public void requestAssistance() {
        channel.sendMessage("Solicitando atendimento", tableNumber);
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

// Waiter.java
public class Waiter implements Attendant {
    private String name;

    public Waiter(String name) {
        this.name = name;
    }

    @Override
    public void notify(String message, int tableNumber) {
        System.out.println("[" + name + "] recebeu notificação da Mesa " + tableNumber + ": " + message);
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        // Cria canal de comunicação via tablet
        CommunicationChannel tabletChannel = new TabletChannel();

        // Cria uma mesa com o canal de tablet
        Table table5 = new Table(5, tabletChannel);

        // Cria atendentes
        Attendant joao = new Waiter("João");
        Attendant maria = new Waiter("Maria");

        // Atendentes observam a mesa
        table5.addObserver(joao);
        table5.addObserver(maria);

        // Mesa solicita atendimento
        table5.requestAssistance();

        System.out.println("--- Trocando canal de comunicação para Buzzer ---");

        // Nova mesa com canal diferente
        CommunicationChannel buzzerChannel = new BuzzerChannel();
        Table table6 = new Table(6, buzzerChannel);
        table6.addObserver(joao);
        table6.requestAssistance();
    }
}

package model;

import java.util.List;

public class MedicalRecord {

    private Animals Animal;
    private Client client;
    private List<Event> Events;

    public MedicalRecord(Animals animal, Client client,  List<Event> events) {
        this.Animal = animal;
        this.client = client;
        this.Events = events;
    }

    public Animals getAnimal() {
        return Animal;
    }

    public Client getClient() {
        return client;
    }

    public List<Event> getEvents() {
        return Events;
    }

    @Override
    public String toString() {
        return " === Medical Record === " + " \n "
                + Animal.toString() + " \n "
                + client.toString() + " \n "
                + Events.toString();
    }
}

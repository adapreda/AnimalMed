package model;

import java.util.List;
import java.util.ArrayList;

public class MedicalRecord {

    private static int CounterID = 0;

    private final int MedicalRecordID;
    private Animals Animal;
    private Client client;
    private List<Event> Events;

    public MedicalRecord(Animals animal, Client client,  List<Event> events) {
        this.MedicalRecordID = ++CounterID;
        this.Animal = animal;
        this.client = client;
        this.Events = events != null ? events : new ArrayList<>();
        if(this.Animal != null) {
            this.Animal.setMedRecord(this);
        }
    }

    public Animals getAnimal() {
        return Animal;
    }

    public int getMedicalRecordID() {
        return MedicalRecordID;
    }

    public Client getClient() {
        return client;
    }

    public List<Event> getEvents() {
        return Events;
    }

    public void addEvent(Event event) {
        if(event != null) {
            Events.add(event);
        }
    }

    @Override
    public String toString() {
        return " === Medical Record === " + " \n "
                + Animal.toString() + " \n "
                + client.toString() + " \n "
                + Events.toString();
    }
}

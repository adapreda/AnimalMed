package model;

import java.util.List;
import java.util.ArrayList;

public class Client {

    private static int CounterID = 0;

    private final int ClientID;
    private final int ClinicID;
    private String ClientFirstName;
    private String ClientLastName;
    private String ClientEmail;
    private String ClientPhone;

    private List<Animals> ClientAnimals;

    public Client(String ClientFirstName, String ClientLastName, String ClientEmail, String ClientPhone, List<Animals> animals) {
        this.ClientID = ++CounterID;
        this.ClinicID = Clinic.getInstance().getClinicID();
        this.ClientFirstName = ClientFirstName;
        this.ClientLastName = ClientLastName;
        this.ClientEmail = ClientEmail;
        this.ClientPhone = ClientPhone;
        if (animals != null) {
            this.ClientAnimals = animals;
        } else {
            this.ClientAnimals = new ArrayList<>();
        }
    }

    public Client(String ClientFirstName, String ClientLastName, String ClientEmail, String ClientPhone) {
        this.ClientID = ++CounterID;
        this.ClinicID = Clinic.getInstance().getClinicID();
        this.ClientFirstName = ClientFirstName;
        this.ClientLastName = ClientLastName;
        this.ClientEmail = ClientEmail;
        this.ClientPhone = ClientPhone;
        this.ClientAnimals = new ArrayList<>();
    }

    public int getClientID() {
        return ClientID;
    }

    public int getClinicID() {
        return ClinicID;
    }

    public String getClientFirstName() {
        return ClientFirstName;
    }

    public String getClientLastName() {
        return ClientLastName;
    }

    public String getClientEmail() {
        return ClientEmail;
    }

    public String getClientPhone() {
        return ClientPhone;
    }

    public List<Animals> getClientAnimals() {
        return ClientAnimals;
    }

    public void addAnimal(Animals animal) {
        if(animal != null) {
            ClientAnimals.add(animal);
        }
    }

    @Override
    public String toString() {
        return ClientID + ". " + ClientFirstName + " -> " + ClientLastName + " -> " + ClientEmail + " -> " + ClientPhone + " \n ";
    }
}

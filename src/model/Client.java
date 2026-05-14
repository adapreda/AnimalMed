package model;

import java.util.List;

public class Client {

    private static int CounterID = 0;

    private final int ClientID;
    private String ClientFirstName;
    private String ClientLastName;
    private String ClientEmail;
    private String ClientPhone;

    private List<Animals> ClientAnimals;

    public Client(String ClientFirstName, String ClientLastName, String ClientEmail, String ClientPhone, List<Animals> animals) {
        this.ClientID = ++CounterID;
        this.ClientFirstName = ClientFirstName;
        this.ClientLastName = ClientLastName;
        this.ClientEmail = ClientEmail;
        this.ClientPhone = ClientPhone;
        this.ClientAnimals = animals;
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

    @Override
    public String toString() {
        return ClientID + ". " + ClientFirstName + " -> " + ClientLastName + " -> " + ClientEmail + " -> " + ClientPhone + " \n ";
    }
}

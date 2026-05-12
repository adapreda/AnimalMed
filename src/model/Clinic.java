package model;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.Scanner;

public class Clinic {
    // this will be the service class
    private static Clinic instance;
    private final String ClinicName;
    private final String ClinicAddress;
    private final String ClinicPhone;
    private final String ClinicEmail;
    private final String AdminPassword;

    private List<Employee> ListEmployees;
    private List<Client> ListClients;

    private String load_password() {

        try{
            File file = new File("src/config_passwd.txt");
            Scanner sc = new Scanner(file);
            return sc.nextLine();
        }
        catch(FileNotFoundException e){
            System.out.println("File not found" + e.getMessage());
        }
        return null;
    }

    private Clinic(){
        this.ClinicName = "AnimalMed";
        this.ClinicAddress = "Paw's Street";
        this.ClinicPhone = "555-555-555";
        this.ClinicEmail = "animal.med@paws.eu";
        this.AdminPassword = load_password();

        this.ListEmployees = new ArrayList<>();
        this.ListClients = new ArrayList<>();
    }

    public static Clinic getInstance(){
        if(instance == null)
            instance = new Clinic();
        return instance;
    }

    @Override
    public String toString(){
        return " === Address: " + this.ClinicAddress + "  |  Phone: " + this.ClinicPhone + "  |  Email: " + this.ClinicEmail + " ===";
    }

    public String getClinicName() {
        return ClinicName;
    }

    public String getClinicAddress() {
        return ClinicAddress;
    }

    public String getClinicPhone() {
        return ClinicPhone;
    }

    public String getClinicEmail() {
        return ClinicEmail;
    }
}

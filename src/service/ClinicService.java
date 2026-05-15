package service;

import model.Animals;
import model.Client;
import model.Clinic;
import model.Employee;
import model.Event;
import model.MedicalRecord;
import model.MedicalService;

import java.util.List;

public class ClinicService {

    private Clinic clinic;

    public ClinicService() {
        this.clinic = Clinic.getInstance();
    }

    public Clinic getClinic() {
        return clinic;
    }

    public Client addClient(String firstName, String lastName, String email, String phone) {
        Client client = new Client(firstName, lastName, email, phone, null);
        clinic.addClient(client);
        return client;
    }

    public void getClients() {
        for(Client c : clinic.getListClients()){
            System.out.println(c);
        }
    }

    public List<Employee> getEmployees() {
        return clinic.getListEmployees();
    }

    public List<MedicalService> getMedicalServices() {
        return clinic.getListMedicalServices();
    }

    public List<Employee> addOrModifyEmployee() {
        return clinic.getListEmployees();
    }

    public List<Animals> addOrModifyAnimalForExistingClient() {
        return null;
    }

    public Event registerMedicalServiceForAnimal() {
        return null;
    }

    public MedicalRecord displayAnimalMedicalHistory() {
        return null;
    }

    public List<Animals> displayAnimalsWithHighMedicalRisk() {
        return null;
    }

    public List<Animals> searchAnimalsByOwnerName() {
        return null;
    }

    public List<Animals> displayAnimalsExpectedForCheckUp() {
        return null;
    }

    public double calculateClinicRevenueOverPeriod() {
        return 0;
    }

    public Employee findMostInDemandEmployee() {
        return null;
    }

    public String generateCompleteClinicReport() {
        return clinic.toString();
    }

    public void deleteClientAnimalOrEmployee() {
    }

}

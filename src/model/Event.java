package model;

import java.util.List;

public class Event {

    private MedicalService MedService;
    private List<Employee> InvolvedEmployees;

    public Event(MedicalService MedService, List<Employee> InvolvedEmployees) {
        this.MedService = MedService;
        this.InvolvedEmployees = InvolvedEmployees;
    }

    public MedicalService getMedService() {
        return MedService;
    }

    public List<Employee> getInvolvedEmployees() {
        return InvolvedEmployees;
    }

    @Override
    public String toString() {
        return MedService.toString() + " \n " + InvolvedEmployees.toString() + " \n ";
    }
}

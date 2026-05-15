package model;

import java.util.List;
import java.util.ArrayList;

public class Event {

    private MedicalService MedService;
    private List<Doctor> Doctors;
    private List<Nurse> Nurses;

    public Event(MedicalService MedService, List<Doctor> Doctors, List<Nurse> Nurses) {
        this.MedService = MedService;
        this.Doctors = Doctors != null ? Doctors : new ArrayList<>();
        this.Nurses = Nurses != null ? Nurses : new ArrayList<>();
    }

    public MedicalService getMedService() {
        return MedService;
    }

    public List<Doctor> getDoctors() {
        return Doctors;
    }

    public List<Nurse> getNurses() {
        return Nurses;
    }

    public List<Employee> getInvolvedEmployees() {
        List<Employee> involvedEmployees = new ArrayList<>();
        involvedEmployees.addAll(Doctors);
        involvedEmployees.addAll(Nurses);
        return involvedEmployees;
    }

    public void addDoctor(Doctor doctor) {
        if(doctor != null) {
            Doctors.add(doctor);
        }
    }

    public void addNurse(Nurse nurse) {
        if(nurse != null) {
            Nurses.add(nurse);
        }
    }

    @Override
    public String toString() {
        return MedService.toString() + " \n Doctors: " + Doctors.toString() + " \n Nurses: " + Nurses.toString() + " \n ";
    }
}

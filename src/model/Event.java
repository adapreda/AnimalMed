package model;

import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;

public class Event {

    private static int CounterID = 0;

    private final int EventID;
    private MedicalRecord MedRecord;
    private MedicalService MedService;
    private Doctor doc;
    private Nurse nur;
    private LocalDate EventDate;
    private String Observations;

    public Event(MedicalService MedService, List<Doctor> Doctors, List<Nurse> Nurses) {
        this.EventID = ++CounterID;
        this.MedService = MedService;
        this.doc = (Doctors != null && !Doctors.isEmpty()) ? Doctors.get(0) : null;
        this.nur = (Nurses != null && !Nurses.isEmpty()) ? Nurses.get(0) : null;
        this.EventDate = LocalDate.now();
        this.Observations = "";
    }

    public Event(MedicalRecord MedRecord, MedicalService MedService, Doctor doc, Nurse nur, LocalDate EventDate, String Observations) {
        this.EventID = ++CounterID;
        this.MedRecord = MedRecord;
        this.MedService = MedService;
        this.doc = doc;
        this.nur = nur;
        this.EventDate = EventDate != null ? EventDate : LocalDate.now();
        this.Observations = Observations;
        if(this.MedRecord != null) {
            this.MedRecord.addEvent(this);
        }
    }

    public int getEventID() {
        return EventID;
    }

    public MedicalRecord getMedRecord() {
        return MedRecord;
    }

    public MedicalService getMedService() {
        return MedService;
    }

    public Doctor getDoc() {
        return doc;
    }

    public Nurse getNur() {
        return nur;
    }

    public LocalDate getEventDate() {
        return EventDate;
    }

    public String getObservations() {
        return Observations;
    }

    public List<Doctor> getDoctors() {
        List<Doctor> doctors = new ArrayList<>();
        if(doc != null) {
            doctors.add(doc);
        }
        return doctors;
    }

    public List<Nurse> getNurses() {
        List<Nurse> nurses = new ArrayList<>();
        if(nur != null) {
            nurses.add(nur);
        }
        return nurses;
    }

    public List<Employee> getInvolvedEmployees() {
        List<Employee> involvedEmployees = new ArrayList<>();
        if(doc != null) {
            involvedEmployees.add(doc);
        }
        if(nur != null) {
            involvedEmployees.add(nur);
        }
        return involvedEmployees;
    }

    public void addDoctor(Doctor doctor) {
        if(doctor != null) {
            doc = doctor;
        }
    }

    public void addNurse(Nurse nurse) {
        if(nurse != null) {
            nur = nurse;
        }
    }

    @Override
    public String toString() {
        return MedService.toString() + " \n Doctor: " + doc + " \n Nurse: " + nur + " \n Date: " + EventDate + " \n Observations: " + Observations + " \n ";
    }
}

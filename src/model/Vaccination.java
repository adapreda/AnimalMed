package model;

import java.util.List;

public class Vaccination extends MedicalService{

    private String VaccineName;
    private String VaccineProducer;
    private int ValidityMonths;

    public Vaccination(String ServiceName, double ServicePrice, int ServiceDuration, boolean HasPrescription, List<Prescription> Prescriptions, Payment paym,  String VaccineName, String VaccineProducer, int ValidityMonths) {
        super(ServiceName, ServicePrice, ServiceDuration,  HasPrescription, Prescriptions, paym);
        this.VaccineName = VaccineName;
        this.VaccineProducer = VaccineProducer;
        this.ValidityMonths = ValidityMonths;
    }

    public String getVaccineName() {
        return VaccineName;
    }

    public String getVaccineProducer() {
        return VaccineProducer;
    }

    public int getValidityMonths() {
        return ValidityMonths;
    }

    @Override
    public String toString() {
        return super.toString() + " -> " +  VaccineName + " -> " + VaccineProducer + " -> " + ValidityMonths;
    }
}

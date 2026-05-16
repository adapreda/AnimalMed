package model;

import java.util.List;
import java.util.ArrayList;

public class MedicalService {
    private static int CounterID = 0;
    protected final int MedicalServiceID;
    protected final int ClinicID;

    protected String ServiceName;
    protected double ServicePrice;
    protected int ServiceDuration;    // minutes
    protected String ServiceType;
    protected boolean HasPrescription;
    protected List<Prescription> Prescriptions;

    protected Payment ServicePayment;

    public MedicalService(String ServiceName, double ServicePrice, int ServiceDuration,  boolean HasPrescription, List<Prescription> Prescriptions,  Payment ServicePayment) {
        if(ServicePayment == null) {
            throw new IllegalArgumentException("A medical service must have a payment.");
        }
        this.MedicalServiceID = ++CounterID;
        this.ClinicID = Clinic.getInstance().getClinicID();
        this.ServiceName = ServiceName;
        this.ServicePrice = ServicePrice;
        this.ServiceDuration = ServiceDuration;
        this.ServiceType = getClass().getSimpleName().toUpperCase();
        this.Prescriptions = new ArrayList<>();
        if(Prescriptions != null && !Prescriptions.isEmpty()) {
            this.Prescriptions.add(Prescriptions.get(0));
            this.Prescriptions.get(0).setMedicalServiceID(this.MedicalServiceID);
        }
        this.HasPrescription = !this.Prescriptions.isEmpty();
        this.ServicePayment = ServicePayment;
        this.ServicePayment.setMedicalServiceID(this.MedicalServiceID);
    }

    @Override
    public String toString() {
        return "Serviciul medical: " + this.MedicalServiceID + " " + this.ServiceName + " -> " + this.ServicePrice + " -> " + this.ServiceDuration + " \n " + this.Prescriptions + " \n ";
    }

    public String getServiceName() {
        return ServiceName;
    }

    public int getMedicalServiceID() {
        return MedicalServiceID;
    }

    public int getClinicID() {
        return ClinicID;
    }


    public double getServicePrice() {
        return ServicePrice;
    }

    public int getServiceDuration() {
        return ServiceDuration;
    }

    public String getServiceType() {
        return ServiceType;
    }

    public boolean isHasPrescription() {
        return HasPrescription;
    }

    public List<Prescription> getPrescriptions() {
        return Prescriptions;
    }

    public Payment getServicePayment() {
        return ServicePayment;
    }

    public void setPrescription(Prescription prescription) {
        Prescriptions.clear();
        if(prescription != null) {
            Prescriptions.add(prescription);
            prescription.setMedicalServiceID(this.MedicalServiceID);
        }
        HasPrescription = prescription != null;
    }
}

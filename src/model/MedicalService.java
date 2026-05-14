package model;

import java.util.List;

public class MedicalService {
    private static int CounterID = 0;
    protected final int MedicalServiceID;

    protected String ServiceName;
    protected double ServicePrice;
    protected int ServiceDuration;    // minutes
    protected boolean HasPrescription;
    protected List<Prescription> Prescriptions;

    protected Payment ServicePayment;

    public MedicalService(String ServiceName, double ServicePrice, int ServiceDuration,  boolean HasPrescription, List<Prescription> Prescriptions,  Payment ServicePayment) {
        this.MedicalServiceID = ++CounterID;
        this.ServiceName = ServiceName;
        this.ServicePrice = ServicePrice;
        this.ServiceDuration = ServiceDuration;
        this.HasPrescription = HasPrescription;
        this.Prescriptions = Prescriptions;
        this.ServicePayment = ServicePayment;
    }

    @Override
    public String toString() {
        return "Serviciul medical: " + this.MedicalServiceID + " " + this.ServiceName + " -> " + this.ServicePrice + " -> " + this.ServiceDuration + " \n " + this.Prescriptions + " \n ";
    }

    public String getServiceName() {
        return ServiceName;
    }

    public double getServicePrice() {
        return ServicePrice;
    }

    public int getServiceDuration() {
        return ServiceDuration;
    }
}

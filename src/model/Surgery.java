package model;

import java.util.List;

public class Surgery extends MedicalService{

    private SurgeryType surgery;
    private int RecoveryDays;
    private int RiskLevel;

    public Surgery(String ServiceName, double ServicePrice, int ServiceDuration, boolean HasPrescription, List<Prescription> Prescriptions, Payment paym, SurgeryType surgery, int RecoveryDays, int RiskLevel) {
        super(ServiceName, ServicePrice, ServiceDuration,  HasPrescription, Prescriptions, paym);
        this.surgery =  surgery;
        this.RecoveryDays = RecoveryDays;
        this.RiskLevel = RiskLevel;
    }

    public SurgeryType getSurgery() {
        return surgery;
    }

    public int getRecoveryDays() {
        return RecoveryDays;
    }

    public int getRiskLevel() {
        return RiskLevel;
    }

    @Override
    public String toString() {
        return super.toString() + " -> " + surgery.toString() + " -> " + RecoveryDays + " -> " + RiskLevel;
    }
}

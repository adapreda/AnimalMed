package model;

import java.util.List;

public class Consultation extends MedicalService{
    private ConsultationType ConsType;
    private boolean RequiresFollowUp;
    private int FollowUpAfterDays;

    public Consultation(String ServiceName, double ServicePrice, int ServiceDuration, boolean HasPrescription, List<Prescription> Prescriptions, Payment paym,  ConsultationType ConsType, boolean RequiresFollowUp, int FollowUpAfterDays) {
        super(ServiceName, ServicePrice, ServiceDuration,  HasPrescription, Prescriptions, paym);
        this.ConsType = ConsType;
        this.RequiresFollowUp = RequiresFollowUp;
        this.FollowUpAfterDays = FollowUpAfterDays;
    }

    public ConsultationType getConsType() {
        return ConsType;
    }

    public boolean isRequiresFollowUp() {
        return RequiresFollowUp;
    }

    public int getFollowUpAfterDays() {
        return FollowUpAfterDays;
    }

    @Override
    public String toString() {
        return super.toString() + " -> " +  ConsType + " -> " + RequiresFollowUp + " -> " + FollowUpAfterDays;
    }
}

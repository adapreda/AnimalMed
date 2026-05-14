package model;

public class Prescription {

    private String MedicationName;
    private String Dosage; // per day
    private int DurationDays;

    public Prescription(String MedicationName, String Dosage, int DurationDays) {
        this.MedicationName = MedicationName;
        this.Dosage = Dosage;
        this.DurationDays = DurationDays;
    }

    public String getMedicationName() {
        return MedicationName;
    }

    public String getDosage() {
        return Dosage;
    }

    public int getDurationDays() {
        return DurationDays;
    }

    @Override
    public String toString() {
        return MedicationName + " -> " + Dosage + " -> " + DurationDays + " \n ";
    }
}

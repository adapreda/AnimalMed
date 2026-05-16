package model;

import java.time.LocalDate;

public class Prescription {

    private static int CounterID = 0;

    private final int PrescriptionID;
    private int MedicalServiceID;
    private String MedicationName;
    private String Dosage; // per day
    private int DurationDays;
    private LocalDate StartDate;
    private LocalDate EndDate;

    public Prescription(String MedicationName, String Dosage, int DurationDays) {
        this.PrescriptionID = ++CounterID;
        this.MedicationName = MedicationName;
        this.Dosage = Dosage;
        this.DurationDays = DurationDays;
        this.StartDate = LocalDate.now();
        this.EndDate = this.StartDate.plusDays(DurationDays);
    }

    public Prescription(String MedicationName, String Dosage, LocalDate StartDate, LocalDate EndDate) {
        this.PrescriptionID = ++CounterID;
        this.MedicationName = MedicationName;
        this.Dosage = Dosage;
        this.StartDate = StartDate;
        this.EndDate = EndDate;
        this.DurationDays = (StartDate != null && EndDate != null) ? (int) java.time.temporal.ChronoUnit.DAYS.between(StartDate, EndDate) : 0;
    }

    void setMedicalServiceID(int medicalServiceID) {
        this.MedicalServiceID = medicalServiceID;
    }

    public int getPrescriptionID() {
        return PrescriptionID;
    }

    public int getMedicalServiceID() {
        return MedicalServiceID;
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

    public LocalDate getStartDate() {
        return StartDate;
    }

    public LocalDate getEndDate() {
        return EndDate;
    }

    @Override
    public String toString() {
        return MedicationName + " -> " + Dosage + " -> " + DurationDays + " \n ";
    }
}

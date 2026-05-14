package model;

public class Nurse extends Employee{

    private Shift shift;
    private int ExperienceYears;

    public Nurse(String firstName, String lastName, String email, String phone, Double salary, Shift shift, int experience) {
        super(firstName, lastName, email, phone, salary);
        this.shift = shift;
        this.ExperienceYears = experience;
    }

    @Override
    public String toString() {
        return super.toString() + " -> " + this.shift + " -> " + this.ExperienceYears + " yrs of experience as nurse";
    }

    public Shift getShift() {
        return shift;
    }

    public int getExperience() {
        return ExperienceYears;
    }

    public void setShift(Shift shift) {
        this.shift = shift;
    }

    public void setExperience(int experience) {
        this.ExperienceYears = experience;
    }
}

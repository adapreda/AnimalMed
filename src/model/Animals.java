package model;

public class Animals {

    private Client Owner;
    private MedicalRecord MedRecord;
    private String AnimalID;
    private String AnimalName;
    private String AnimalSpecies;
    private int AnimalAge;
    private double AnimalWeight;

    public static String generateRandomNumber(){
        String options = "0123456789";
        String result = "";

        for(int i = 0; i < 5; i++){
            int index = (int) (Math.random() * options.length());
            result += options.charAt(index);
        }
        return result;
    }

    public Animals(Client owner, MedicalRecord record, String animalName, String animalSpecies, int animalAge, double animalWeight) {
        this.Owner = owner;
        this.MedRecord = record;
        this.AnimalID = generateRandomNumber();
        this.AnimalName = animalName;
        this.AnimalSpecies = animalSpecies;
        this.AnimalAge = animalAge;
        this.AnimalWeight = animalWeight;
    }

    public Client getOwner() {
        return Owner;
    }

    public MedicalRecord getMedRecord() {
        return MedRecord;
    }

    public String getAnimalName() {
        return AnimalName;
    }

    public String getAnimalSpecies() {
        return AnimalSpecies;
    }

    public int getAnimalAge() {
        return AnimalAge;
    }

    public double getAnimalWeight() {
        return AnimalWeight;
    }

    @Override
    public String toString() {
        return AnimalID + " " + AnimalName + " " + Owner + " " + AnimalSpecies + " " + AnimalAge + " " + AnimalWeight + " \n" + MedRecord.toString();
    }
}


package model;

public class Doctor extends Employee{

    private String Specialization;
    private String LicenseNumber;

    public static String generateRandomLicense(){
        String options = "0123456789";
        String result = "";

        for(int i = 0; i < 12; i++){
            int index = (int) (Math.random() * options.length());
            result += options.charAt(index);
        }
        return result;
    }

    public Doctor(String firstName, String lastName, String email, String phone, Double salary, String specialization, String licenseNumber) {
        super(firstName, lastName, email, phone, salary);
        this.Specialization = specialization;
        this.LicenseNumber = licenseNumber;
    }

    public Doctor(String firstName, String lastName, String email, String phone, Double salary, String specialization) {
        super(firstName, lastName, email, phone, salary);
        this.Specialization = specialization;
        this.LicenseNumber = generateRandomLicense();
    }

    @Override
    public String toString() {
        return super.toString() + " -> " +  this.Specialization + " -> " + this.LicenseNumber;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public void setSpecialization(String specialization) {
        this.Specialization = specialization;
    }

    public String getLicenseNumber() {
        return LicenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.LicenseNumber = licenseNumber;
    }

}
